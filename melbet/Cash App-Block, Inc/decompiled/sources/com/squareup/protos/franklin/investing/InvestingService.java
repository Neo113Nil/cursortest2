package com.squareup.protos.franklin.investing;

import app.cash.api.ApiResult;
import com.squareup.protos.franklin.api.ClientScenario;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000fJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\t\u001a\u00020\u0012H§@¢\u0006\u0002\u0010\u0013J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\t\u001a\u00020\u0016H§@¢\u0006\u0002\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/franklin/investing/InvestingService;", "", "initiateInvestmentOrder", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/franklin/investing/InitiateInvestmentOrderResponse;", "clientScenario", "Lcom/squareup/protos/franklin/api/ClientScenario;", "flowToken", "", "request", "Lcom/squareup/protos/franklin/investing/InitiateInvestmentOrderRequest;", "(Lcom/squareup/protos/franklin/api/ClientScenario;Ljava/lang/String;Lcom/squareup/protos/franklin/investing/InitiateInvestmentOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelInvestmentOrder", "Lcom/squareup/protos/franklin/investing/CancelInvestmentOrderResponse;", "Lcom/squareup/protos/franklin/investing/CancelInvestmentOrderRequest;", "(Ljava/lang/String;Lcom/squareup/protos/franklin/investing/CancelInvestmentOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateInvestmentHolding", "Lcom/squareup/protos/franklin/investing/UpdateInvestmentHoldingResponse;", "Lcom/squareup/protos/franklin/investing/UpdateInvestmentHoldingRequest;", "(Lcom/squareup/protos/franklin/investing/UpdateInvestmentHoldingRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCustomerInvestmentSettings", "Lcom/squareup/protos/franklin/investing/GetCustomerInvestmentSettingsResponse;", "Lcom/squareup/protos/franklin/investing/GetCustomerInvestmentSettingsRequest;", "(Lcom/squareup/protos/franklin/investing/GetCustomerInvestmentSettingsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface InvestingService {
    @POST("/2.0/cash/investing/cancel-investment-order")
    Object cancelInvestmentOrder(@Header("Cash-Flow-Token") String str, @Body CancelInvestmentOrderRequest cancelInvestmentOrderRequest, Continuation<? super ApiResult<CancelInvestmentOrderResponse>> continuation);

    @POST("/2.0/cash/investing/get-customer-settings")
    Object getCustomerInvestmentSettings(@Body GetCustomerInvestmentSettingsRequest getCustomerInvestmentSettingsRequest, Continuation<? super ApiResult<GetCustomerInvestmentSettingsResponse>> continuation);

    @POST("/2.0/cash/investing/initiate-investment-order")
    Object initiateInvestmentOrder(@Header("Cash-Client-Scenario") ClientScenario clientScenario, @Header("Cash-Flow-Token") String str, @Body InitiateInvestmentOrderRequest initiateInvestmentOrderRequest, Continuation<? super ApiResult<InitiateInvestmentOrderResponse>> continuation);

    @POST("/2.0/cash/investing/update-investment-holding")
    Object updateInvestmentHolding(@Body UpdateInvestmentHoldingRequest updateInvestmentHoldingRequest, Continuation<? super ApiResult<UpdateInvestmentHoldingResponse>> continuation);
}
