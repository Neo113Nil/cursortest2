package com.squareup.protos.cash.deviceintegritly.api;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/deviceintegritly/api/SignedMRIService;", "", "sendSignedMRIContext", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/deviceintegritly/api/SendSignedMRIContextResponse;", "request", "Lcom/squareup/protos/cash/deviceintegritly/api/SendSignedMRIContextRequest;", "(Lcom/squareup/protos/cash/deviceintegritly/api/SendSignedMRIContextRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SignedMRIService {
    @POST("/cash-app/mobile-runtime-integrity/sendSignedMriContext")
    Object sendSignedMRIContext(@Body SendSignedMRIContextRequest sendSignedMRIContextRequest, Continuation<? super ApiResult<SendSignedMRIContextResponse>> continuation);
}
