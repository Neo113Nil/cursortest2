package com.squareup.protos.cash.marketdata;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/marketdata/MarketDataService;", "", "getDiscovery", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/marketdata/GetDiscoveryResponse;", "request", "Lcom/squareup/protos/cash/marketdata/GetDiscoveryRequest;", "(Lcom/squareup/protos/cash/marketdata/GetDiscoveryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCustomerNews", "Lcom/squareup/protos/cash/marketdata/GetCustomerNewsResponse;", "Lcom/squareup/protos/cash/marketdata/GetCustomerNewsRequest;", "(Lcom/squareup/protos/cash/marketdata/GetCustomerNewsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInvestmentEntityNews", "Lcom/squareup/protos/cash/marketdata/GetInvestmentEntityNewsResponse;", "Lcom/squareup/protos/cash/marketdata/GetInvestmentEntityNewsRequest;", "(Lcom/squareup/protos/cash/marketdata/GetInvestmentEntityNewsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface MarketDataService {
    @POST("cash-app/investing/get-customer-news")
    Object getCustomerNews(@Body GetCustomerNewsRequest getCustomerNewsRequest, Continuation<? super ApiResult<GetCustomerNewsResponse>> continuation);

    @POST("/2.0/cash/investing/get-discovery")
    Object getDiscovery(@Body GetDiscoveryRequest getDiscoveryRequest, Continuation<? super ApiResult<GetDiscoveryResponse>> continuation);

    @POST("/cash-app/investing/get-investment-entity-news")
    Object getInvestmentEntityNews(@Body GetInvestmentEntityNewsRequest getInvestmentEntityNewsRequest, Continuation<? super ApiResult<GetInvestmentEntityNewsResponse>> continuation);
}
