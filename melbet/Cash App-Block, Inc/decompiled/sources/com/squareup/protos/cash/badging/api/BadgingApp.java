package com.squareup.protos.cash.badging.api;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/badging/api/BadgingApp;", "", "getBadgeCountsClient", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/badging/api/GetBadgeCountsClientResponse;", "request", "Lcom/squareup/protos/cash/badging/api/GetBadgeCountsClientRequest;", "(Lcom/squareup/protos/cash/badging/api/GetBadgeCountsClientRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "batchClearBadgeClient", "Lcom/squareup/protos/cash/badging/api/BatchClearBadgeClientResponse;", "Lcom/squareup/protos/cash/badging/api/BatchClearBadgeClientRequest;", "(Lcom/squareup/protos/cash/badging/api/BatchClearBadgeClientRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BadgingApp {
    @POST("/cash-app/badging/v1/batch-clear")
    Object batchClearBadgeClient(@Body BatchClearBadgeClientRequest batchClearBadgeClientRequest, Continuation<? super ApiResult<BatchClearBadgeClientResponse>> continuation);

    @POST("/cash-app/badging/v1/badge-counts")
    Object getBadgeCountsClient(@Body GetBadgeCountsClientRequest getBadgeCountsClientRequest, Continuation<? super ApiResult<GetBadgeCountsClientResponse>> continuation);
}
