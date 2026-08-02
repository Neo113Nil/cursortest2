package com.squareup.protos.cash.semaphore.api;

import app.cash.api.ApiResult;
import com.squareup.protos.franklin.app.GetAppConfigRequest;
import com.squareup.protos.franklin.app.GetAppConfigResponse;
import com.squareup.protos.franklin.app.GetFeatureFlagsRequest;
import com.squareup.protos.franklin.app.GetFeatureFlagsResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/semaphore/api/SemaphoreService;", "", "", "sdkVersion", "Lcom/squareup/protos/franklin/app/GetFeatureFlagsRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/franklin/app/GetFeatureFlagsResponse;", "getFeatureFlags", "(Ljava/lang/String;Lcom/squareup/protos/franklin/app/GetFeatureFlagsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/franklin/app/GetAppConfigRequest;", "Lcom/squareup/protos/franklin/app/GetAppConfigResponse;", "getAppConfig", "(Lcom/squareup/protos/franklin/app/GetAppConfigRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/semaphore/api/GetOnboardingConfigRequest;", "Lcom/squareup/protos/cash/semaphore/api/GetOnboardingConfigResponse;", "getOnboardingConfig", "(Lcom/squareup/protos/cash/semaphore/api/GetOnboardingConfigRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SemaphoreService {
    @POST("/2.0/cash/get-app-config")
    Object getAppConfig(@Body GetAppConfigRequest getAppConfigRequest, Continuation<? super ApiResult<GetAppConfigResponse>> continuation);

    @POST("/2.0/cash/get-feature-flags")
    Object getFeatureFlags(@Header("X-SDK-Version") String str, @Body GetFeatureFlagsRequest getFeatureFlagsRequest, Continuation<? super ApiResult<GetFeatureFlagsResponse>> continuation);

    @POST("/cash-app/semaphore/get-onboarding-config")
    Object getOnboardingConfig(@Body GetOnboardingConfigRequest getOnboardingConfigRequest, Continuation<? super ApiResult<GetOnboardingConfigResponse>> continuation);
}
