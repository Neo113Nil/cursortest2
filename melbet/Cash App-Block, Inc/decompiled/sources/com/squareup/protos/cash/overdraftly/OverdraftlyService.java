package com.squareup.protos.cash.overdraftly;

import app.cash.api.ApiResult;
import com.squareup.cash.overdraftly.api.v1_0.app.ComputeOverdraftSyncValuesRequest;
import com.squareup.cash.overdraftly.api.v1_0.app.ComputeOverdraftSyncValuesResponse;
import com.squareup.cash.overdraftly.api.v1_0.app.ToggleOverdraftRequest;
import com.squareup.cash.overdraftly.api.v1_0.app.ToggleOverdraftResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/overdraftly/OverdraftlyService;", "", "toggleOverdraft", "Lapp/cash/api/ApiResult;", "Lcom/squareup/cash/overdraftly/api/v1_0/app/ToggleOverdraftResponse;", "request", "Lcom/squareup/cash/overdraftly/api/v1_0/app/ToggleOverdraftRequest;", "(Lcom/squareup/cash/overdraftly/api/v1_0/app/ToggleOverdraftRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "computeOverdraftSyncValuesRequest", "Lcom/squareup/cash/overdraftly/api/v1_0/app/ComputeOverdraftSyncValuesResponse;", "Lcom/squareup/cash/overdraftly/api/v1_0/app/ComputeOverdraftSyncValuesRequest;", "(Lcom/squareup/cash/overdraftly/api/v1_0/app/ComputeOverdraftSyncValuesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface OverdraftlyService {
    @POST("/cash-app/overdraft/v1/compute-overdraft-sync-values")
    Object computeOverdraftSyncValuesRequest(@Body ComputeOverdraftSyncValuesRequest computeOverdraftSyncValuesRequest, Continuation<? super ApiResult<ComputeOverdraftSyncValuesResponse>> continuation);

    @POST("/cash-app/overdraft/v1/toggle-overdraft")
    Object toggleOverdraft(@Body ToggleOverdraftRequest toggleOverdraftRequest, Continuation<? super ApiResult<ToggleOverdraftResponse>> continuation);
}
