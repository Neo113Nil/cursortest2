package com.squareup.protos.cash.syncentitygateway.api;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/syncentitygateway/api/SyncEntityGatewayApp;", "", "Lcom/squareup/protos/cash/syncentitygateway/api/BatchSyncTopicEntitiesClientRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/syncentitygateway/api/BatchSyncTopicEntitiesClientResponse;", "batchTopicSync", "(Lcom/squareup/protos/cash/syncentitygateway/api/BatchSyncTopicEntitiesClientRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SyncEntityGatewayApp {
    @POST("/cash-app/syncentitygateway/v1/batch-topic-sync")
    Object batchTopicSync(@Body BatchSyncTopicEntitiesClientRequest batchSyncTopicEntitiesClientRequest, Continuation<? super ApiResult<BatchSyncTopicEntitiesClientResponse>> continuation);
}
