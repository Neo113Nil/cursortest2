package com.squareup.protos.cash.sup.api.v1;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/sup/api/v1/CheckoutService;", "", "retrievePlanDetails", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/sup/api/v1/RetrievePlanDetailsResponse;", "request", "Lcom/squareup/protos/cash/sup/api/v1/RetrievePlanDetailsRequest;", "(Lcom/squareup/protos/cash/sup/api/v1/RetrievePlanDetailsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelCheckout", "Lcom/squareup/protos/cash/sup/api/v1/CancelCheckoutResponse;", "Lcom/squareup/protos/cash/sup/api/v1/CancelCheckoutRequest;", "(Lcom/squareup/protos/cash/sup/api/v1/CancelCheckoutRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelCheckoutByPaymentToken", "Lcom/squareup/protos/cash/sup/api/v1/CancelCheckoutByPaymentTokenResponse;", "Lcom/squareup/protos/cash/sup/api/v1/CancelCheckoutByPaymentTokenRequest;", "(Lcom/squareup/protos/cash/sup/api/v1/CancelCheckoutByPaymentTokenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CheckoutService {
    @POST("/cash-app/single-use-payments/cancel")
    Object cancelCheckout(@Body CancelCheckoutRequest cancelCheckoutRequest, Continuation<? super ApiResult<CancelCheckoutResponse>> continuation);

    @POST("/cash-app/single-use-payments/cancel-by-payment-token")
    Object cancelCheckoutByPaymentToken(@Body CancelCheckoutByPaymentTokenRequest cancelCheckoutByPaymentTokenRequest, Continuation<? super ApiResult<CancelCheckoutByPaymentTokenResponse>> continuation);

    @POST("/cash-app/single-use-payments/retrieve-plan-details")
    Object retrievePlanDetails(@Body RetrievePlanDetailsRequest retrievePlanDetailsRequest, Continuation<? super ApiResult<RetrievePlanDetailsResponse>> continuation);
}
