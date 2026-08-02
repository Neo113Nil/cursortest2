package com.squareup.protos.cash.cashlimitsxp.api.v1;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/cashlimitsxp/api/v1/LimitsHubService;", "", "getCustomerLimits", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/cashlimitsxp/api/v1/GetCustomerLimitsResponse;", "request", "Lcom/squareup/protos/cash/cashlimitsxp/api/v1/GetCustomerLimitsRequest;", "(Lcom/squareup/protos/cash/cashlimitsxp/api/v1/GetCustomerLimitsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInlineMessage", "Lcom/squareup/protos/cash/cashlimitsxp/api/v1/GetInlineMessageResponse;", "Lcom/squareup/protos/cash/cashlimitsxp/api/v1/GetInlineMessageRequest;", "(Lcom/squareup/protos/cash/cashlimitsxp/api/v1/GetInlineMessageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LimitsHubService {
    @POST("/cash-app/limits-xp/get-customer-limits")
    Object getCustomerLimits(@Body GetCustomerLimitsRequest getCustomerLimitsRequest, Continuation<? super ApiResult<GetCustomerLimitsResponse>> continuation);

    @POST("/cash-app/limits-xp/get-inline-message")
    Object getInlineMessage(@Body GetInlineMessageRequest getInlineMessageRequest, Continuation<? super ApiResult<GetInlineMessageResponse>> continuation);
}
