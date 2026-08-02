package com.squareup.protos.cash.pools;

import app.cash.api.ApiResult;
import com.squareup.protos.franklin.api.ClientScenario;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J4\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0003\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00042\b\b\u0001\u0010\u0003\u001a\u00020 H§@¢\u0006\u0004\b\"\u0010#¨\u0006$À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/pools/PoolsService;", "", "Lcom/squareup/protos/cash/pools/CreatePoolRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/pools/CreatePoolResponse;", "createPool", "(Lcom/squareup/protos/cash/pools/CreatePoolRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/pools/GetMoneyPoolRequest;", "Lcom/squareup/protos/cash/pools/GetMoneyPoolResponse;", "getMoneyPool", "(Lcom/squareup/protos/cash/pools/GetMoneyPoolRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/pools/ListPoolsRequest;", "Lcom/squareup/protos/cash/pools/ListPoolsResponse;", "listPools", "(Lcom/squareup/protos/cash/pools/ListPoolsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/pools/GetPoolsAppletRequest;", "Lcom/squareup/protos/cash/pools/GetPoolsAppletResponse;", "getPoolsApplet", "(Lcom/squareup/protos/cash/pools/GetPoolsAppletRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/franklin/api/ClientScenario;", "clientScenario", "", "flowToken", "Lcom/squareup/protos/cash/pools/SendPoolContributionRequest;", "Lcom/squareup/protos/cash/pools/SendPoolContributionResponse;", "sendPoolContribution", "(Lcom/squareup/protos/franklin/api/ClientScenario;Ljava/lang/String;Lcom/squareup/protos/cash/pools/SendPoolContributionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/pools/AddCustomersToPoolRequest;", "Lcom/squareup/protos/cash/pools/AddCustomersToPoolResponse;", "addCustomersToPool", "(Lcom/squareup/protos/cash/pools/AddCustomersToPoolRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/pools/RemoveCustomersFromPoolRequest;", "Lcom/squareup/protos/cash/pools/RemoveCustomersFromPoolResponse;", "removeCustomersFromPool", "(Lcom/squareup/protos/cash/pools/RemoveCustomersFromPoolRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PoolsService {
    @POST("/cash-app/fiatly/money-pool-invite")
    Object addCustomersToPool(@Body AddCustomersToPoolRequest addCustomersToPoolRequest, Continuation<? super ApiResult<AddCustomersToPoolResponse>> continuation);

    @POST("/cash-app/fiatly/create-pool")
    Object createPool(@Body CreatePoolRequest createPoolRequest, Continuation<? super ApiResult<CreatePoolResponse>> continuation);

    @POST("/cash-app/fiatly/get-pool")
    Object getMoneyPool(@Body GetMoneyPoolRequest getMoneyPoolRequest, Continuation<? super ApiResult<GetMoneyPoolResponse>> continuation);

    @POST("/cash-app/fiatly/get-pools-applet")
    Object getPoolsApplet(@Body GetPoolsAppletRequest getPoolsAppletRequest, Continuation<? super ApiResult<GetPoolsAppletResponse>> continuation);

    @POST("/cash-app/fiatly/list-pools")
    Object listPools(@Body ListPoolsRequest listPoolsRequest, Continuation<? super ApiResult<ListPoolsResponse>> continuation);

    @POST("/cash-app/fiatly/money-pool-remove-members")
    Object removeCustomersFromPool(@Body RemoveCustomersFromPoolRequest removeCustomersFromPoolRequest, Continuation<? super ApiResult<RemoveCustomersFromPoolResponse>> continuation);

    @POST("/cash-app/fiatly/send-pool-contribution")
    Object sendPoolContribution(@Header("Cash-Client-Scenario") ClientScenario clientScenario, @Header("Cash-Flow-Token") String str, @Body SendPoolContributionRequest sendPoolContributionRequest, Continuation<? super ApiResult<SendPoolContributionResponse>> continuation);
}
