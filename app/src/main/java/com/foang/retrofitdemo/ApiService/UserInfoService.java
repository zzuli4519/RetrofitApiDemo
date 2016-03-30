package com.foang.retrofitdemo.ApiService;

import retrofit2.Callback;
import retrofit2.http.GET;

/**
 * Created by Ming on 2016/3/30.
 */
public interface UserInfoService {

    @GET("/myHomePage/user")
    void getUserInfo(String userId, Callback mCallback);

}
