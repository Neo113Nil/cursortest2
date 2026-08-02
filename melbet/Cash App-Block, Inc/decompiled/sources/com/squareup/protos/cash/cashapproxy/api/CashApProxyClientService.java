package com.squareup.protos.cash.cashapproxy.api;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/cashapproxy/api/CashApProxyClientService;", "", "Lcom/squareup/protos/cash/cashapproxy/api/GetAfterpayCheckoutTokensRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/cashapproxy/api/GetAfterpayCheckoutTokensResponse;", "getAfterpayCheckoutTokens", "(Lcom/squareup/protos/cash/cashapproxy/api/GetAfterpayCheckoutTokensRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/cashapproxy/api/GetApOrdersHubRequest;", "Lcom/squareup/protos/cash/cashapproxy/api/GetApOrdersHubResponse;", "getApOrdersHub", "(Lcom/squareup/protos/cash/cashapproxy/api/GetApOrdersHubRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/cashapproxy/api/GetApOrderDetailsRequest;", "Lcom/squareup/protos/cash/cashapproxy/api/GetApOrderDetailsResponse;", "getApOrderDetails", "(Lcom/squareup/protos/cash/cashapproxy/api/GetApOrderDetailsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/cashapproxy/api/GetAfterpayOrderDocumentUrlRequest;", "Lcom/squareup/protos/cash/cashapproxy/api/GetAfterpayOrderDocumentUrlResponse;", "getAfterpayOrderDocumentUrl", "(Lcom/squareup/protos/cash/cashapproxy/api/GetAfterpayOrderDocumentUrlRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CashApProxyClientService {
    @POST("/cash-app/afterpay/get-checkout-tokens")
    Object getAfterpayCheckoutTokens(@Body GetAfterpayCheckoutTokensRequest getAfterpayCheckoutTokensRequest, Continuation<? super ApiResult<GetAfterpayCheckoutTokensResponse>> continuation);

    @POST("/cash-app/afterpay/get-order-document-url")
    Object getAfterpayOrderDocumentUrl(@Body GetAfterpayOrderDocumentUrlRequest getAfterpayOrderDocumentUrlRequest, Continuation<? super ApiResult<GetAfterpayOrderDocumentUrlResponse>> continuation);

    @POST("/cash-app/afterpay/get-order-details")
    Object getApOrderDetails(@Body GetApOrderDetailsRequest getApOrderDetailsRequest, Continuation<? super ApiResult<GetApOrderDetailsResponse>> continuation);

    @POST("/cash-app/afterpay/get-afterpay-orders-hub")
    Object getApOrdersHub(@Body GetApOrdersHubRequest getApOrdersHubRequest, Continuation<? super ApiResult<GetApOrdersHubResponse>> continuation);
}
