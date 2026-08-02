package com.squareup.protos.cash.blockly.api;

import app.cash.api.ApiResult;
import com.squareup.protos.franklin.api.ClientScenario;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J4\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\b\b\u0001\u0010\u0007\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/blockly/api/BlocklyService;", "", "Lcom/squareup/protos/franklin/api/ClientScenario;", "clientScenario", "", "flowToken", "Lcom/squareup/protos/cash/blockly/api/ReportAbuseRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/blockly/api/ReportAbuseResponse;", "reportAbuse", "(Lcom/squareup/protos/franklin/api/ClientScenario;Ljava/lang/String;Lcom/squareup/protos/cash/blockly/api/ReportAbuseRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/blockly/api/BlockSearchRequest;", "Lcom/squareup/protos/cash/blockly/api/BlockSearchResponse;", "blockSearch", "(Lcom/squareup/protos/cash/blockly/api/BlockSearchRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/blockly/api/GetBlockedCustomersRequest;", "Lcom/squareup/protos/cash/blockly/api/GetBlockedCustomersResponse;", "getBlockedCustomers", "(Lcom/squareup/protos/cash/blockly/api/GetBlockedCustomersRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/blockly/api/GetAllowlistForCustomerRequest;", "Lcom/squareup/protos/cash/blockly/api/GetAllowlistForCustomerResponse;", "getAllowlistForCustomer", "(Lcom/squareup/protos/cash/blockly/api/GetAllowlistForCustomerRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/blockly/api/AllowlistSearchRequest;", "Lcom/squareup/protos/cash/blockly/api/AllowlistSearchResponse;", "allowlistSearch", "(Lcom/squareup/protos/cash/blockly/api/AllowlistSearchRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BlocklyService {
    @POST("/cash-app/blockly/search-allow-list")
    Object allowlistSearch(@Body AllowlistSearchRequest allowlistSearchRequest, Continuation<? super ApiResult<AllowlistSearchResponse>> continuation);

    @POST("/cash-app/blockly/search")
    Object blockSearch(@Body BlockSearchRequest blockSearchRequest, Continuation<? super ApiResult<BlockSearchResponse>> continuation);

    @POST("/cash-app/blockly/get-allow-list")
    Object getAllowlistForCustomer(@Body GetAllowlistForCustomerRequest getAllowlistForCustomerRequest, Continuation<? super ApiResult<GetAllowlistForCustomerResponse>> continuation);

    @POST("/cash-app/blockly/get-block-list")
    Object getBlockedCustomers(@Body GetBlockedCustomersRequest getBlockedCustomersRequest, Continuation<? super ApiResult<GetBlockedCustomersResponse>> continuation);

    @POST("/2.0/cash/report-abuse")
    Object reportAbuse(@Header("Cash-Client-Scenario") ClientScenario clientScenario, @Header("Cash-Flow-Token") String str, @Body ReportAbuseRequest reportAbuseRequest, Continuation<? super ApiResult<ReportAbuseResponse>> continuation);
}
