package com.squareup.protos.cash.cash3dsauthentication.api.v1;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\fH§@¢\u0006\u0002\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/cash3dsauthentication/api/v1/ThreeDsAuthenticationService;", "", "threeDsAuthentication", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/cash3dsauthentication/api/v1/ThreeDsAuthenticationResponse;", "flowToken", "", "request", "Lcom/squareup/protos/cash/cash3dsauthentication/api/v1/ThreeDsAuthenticationRequest;", "(Ljava/lang/String;Lcom/squareup/protos/cash/cash3dsauthentication/api/v1/ThreeDsAuthenticationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getThreeDsEligibleInstrumentsInfo", "Lcom/squareup/protos/cash/cash3dsauthentication/api/v1/GetThreeDsEligibleInstrumentsInfoResponse;", "Lcom/squareup/protos/cash/cash3dsauthentication/api/v1/GetThreeDsEligibleInstrumentsInfoRequest;", "(Lcom/squareup/protos/cash/cash3dsauthentication/api/v1/GetThreeDsEligibleInstrumentsInfoRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ThreeDsAuthenticationService {
    @POST("/2.0/cash/three-ds-authentication/get-three-ds-authentication-eligible-instruments-info")
    Object getThreeDsEligibleInstrumentsInfo(@Body GetThreeDsEligibleInstrumentsInfoRequest getThreeDsEligibleInstrumentsInfoRequest, Continuation<? super ApiResult<GetThreeDsEligibleInstrumentsInfoResponse>> continuation);

    @POST("/2.0/cash/three-ds-authentication")
    Object threeDsAuthentication(@Header("Cash-Flow-Token") String str, @Body ThreeDsAuthenticationRequest threeDsAuthenticationRequest, Continuation<? super ApiResult<ThreeDsAuthenticationResponse>> continuation);
}
