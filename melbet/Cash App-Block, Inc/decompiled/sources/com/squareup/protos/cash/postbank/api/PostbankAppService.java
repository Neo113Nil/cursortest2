package com.squareup.protos.cash.postbank.api;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000fJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0012H§@¢\u0006\u0002\u0010\u0013J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0016H§@¢\u0006\u0002\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/postbank/api/PostbankAppService;", "", "generateDirectDepositForm", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/postbank/api/GenerateDirectDepositFormResponse;", "request", "Lcom/squareup/protos/cash/postbank/api/GenerateDirectDepositFormRequest;", "(Lcom/squareup/protos/cash/postbank/api/GenerateDirectDepositFormRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCustomerPrimaryDdaDetails", "Lcom/squareup/protos/cash/postbank/api/GetCustomerPrimaryDdaDetailsResponse;", "Lcom/squareup/protos/cash/postbank/api/GetCustomerPrimaryDdaDetailsRequest;", "(Lcom/squareup/protos/cash/postbank/api/GetCustomerPrimaryDdaDetailsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDirectDepositForm", "Lcom/squareup/protos/cash/postbank/api/GetDirectDepositFormResponse;", "Lcom/squareup/protos/cash/postbank/api/GetDirectDepositFormRequest;", "(Lcom/squareup/protos/cash/postbank/api/GetDirectDepositFormRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initiateDirectDepositSetupFlow", "Lcom/squareup/protos/cash/postbank/api/InitiateDirectDepositSetupFlowResponse;", "Lcom/squareup/protos/cash/postbank/api/InitiateDirectDepositSetupFlowRequest;", "(Lcom/squareup/protos/cash/postbank/api/InitiateDirectDepositSetupFlowRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateDirectDepositForm", "Lcom/squareup/protos/cash/postbank/api/UpdateDirectDepositFormResponse;", "Lcom/squareup/protos/cash/postbank/api/UpdateDirectDepositFormRequest;", "(Lcom/squareup/protos/cash/postbank/api/UpdateDirectDepositFormRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PostbankAppService {
    @POST("/cash-app/postbank/v1.0/app/generate-direct-deposit-form")
    Object generateDirectDepositForm(@Body GenerateDirectDepositFormRequest generateDirectDepositFormRequest, Continuation<? super ApiResult<GenerateDirectDepositFormResponse>> continuation);

    @POST("/cash-app/postbank/v1.0/app/get-customer-primary-dda-details")
    Object getCustomerPrimaryDdaDetails(@Body GetCustomerPrimaryDdaDetailsRequest getCustomerPrimaryDdaDetailsRequest, Continuation<? super ApiResult<GetCustomerPrimaryDdaDetailsResponse>> continuation);

    @POST("/cash-app/postbank/v1.0/app/get-direct-deposit-form")
    Object getDirectDepositForm(@Body GetDirectDepositFormRequest getDirectDepositFormRequest, Continuation<? super ApiResult<GetDirectDepositFormResponse>> continuation);

    @POST("/cash-app/postbank/v1.0/app/initiate-direct-deposit-setup-flow")
    Object initiateDirectDepositSetupFlow(@Body InitiateDirectDepositSetupFlowRequest initiateDirectDepositSetupFlowRequest, Continuation<? super ApiResult<InitiateDirectDepositSetupFlowResponse>> continuation);

    @POST("/cash-app/postbank/v1.0/app/update-direct-deposit-form")
    Object updateDirectDepositForm(@Body UpdateDirectDepositFormRequest updateDirectDepositFormRequest, Continuation<? super ApiResult<UpdateDirectDepositFormResponse>> continuation);
}
