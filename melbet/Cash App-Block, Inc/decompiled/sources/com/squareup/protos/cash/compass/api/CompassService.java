package com.squareup.protos.cash.compass.api;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/compass/api/CompassService;", "", "updateGpsConsentStatus", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/compass/api/SetGpsConsentStatusResponse;", "request", "Lcom/squareup/protos/cash/compass/api/SetGpsConsentStatusRequest;", "(Lcom/squareup/protos/cash/compass/api/SetGpsConsentStatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateGpsLocation", "Lcom/squareup/protos/cash/compass/api/WriteGpsDataResponse;", "Lcom/squareup/protos/cash/compass/api/WriteGpsDataRequest;", "(Lcom/squareup/protos/cash/compass/api/WriteGpsDataRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CompassService {
    @POST("/cash-app/compass/set-gps-consent-status")
    Object updateGpsConsentStatus(@Body SetGpsConsentStatusRequest setGpsConsentStatusRequest, Continuation<? super ApiResult<SetGpsConsentStatusResponse>> continuation);

    @POST("/cash-app/compass/write-gps")
    Object updateGpsLocation(@Body WriteGpsDataRequest writeGpsDataRequest, Continuation<? super ApiResult<WriteGpsDataResponse>> continuation);
}
