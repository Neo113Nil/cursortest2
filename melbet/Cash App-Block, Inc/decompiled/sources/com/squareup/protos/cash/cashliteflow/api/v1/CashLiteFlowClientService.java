package com.squareup.protos.cash.cashliteflow.api.v1;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/cashliteflow/api/v1/CashLiteFlowClientService;", "", "Lcom/squareup/protos/cash/cashliteflow/api/v1/GetCashInAccountRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/cashliteflow/api/v1/GetCashInAccountResponse;", "getCashInAccount", "(Lcom/squareup/protos/cash/cashliteflow/api/v1/GetCashInAccountRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/cashliteflow/api/v1/GetWalletAddressesRequest;", "Lcom/squareup/protos/cash/cashliteflow/api/v1/GetWalletAddressesResponse;", "getWalletAddresses", "(Lcom/squareup/protos/cash/cashliteflow/api/v1/GetWalletAddressesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/cashliteflow/api/v1/PushProvisionGooglePayRequest;", "Lcom/squareup/protos/cash/cashliteflow/api/v1/PushProvisionGooglePayResponse;", "pushProvisionGooglePay", "(Lcom/squareup/protos/cash/cashliteflow/api/v1/PushProvisionGooglePayRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "flowToken", "Lcom/squareup/protos/cash/cashliteflow/api/v1/InitiateBitcoinWithdrawalRequest;", "Lcom/squareup/protos/cash/cashliteflow/api/v1/InitiateBitcoinWithdrawalResponse;", "initiateBitcoinWithdrawal", "(Ljava/lang/String;Lcom/squareup/protos/cash/cashliteflow/api/v1/InitiateBitcoinWithdrawalRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/cashliteflow/api/v1/GenerateLightningInvoiceRequest;", "Lcom/squareup/protos/cash/cashliteflow/api/v1/GenerateLightningInvoiceResponse;", "generateLightningInvoice", "(Lcom/squareup/protos/cash/cashliteflow/api/v1/GenerateLightningInvoiceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CashLiteFlowClientService {
    @POST("/cash-app/cashlite-flow/bitcoin-deposits/generate-lightning-invoice")
    Object generateLightningInvoice(@Body GenerateLightningInvoiceRequest generateLightningInvoiceRequest, Continuation<? super ApiResult<GenerateLightningInvoiceResponse>> continuation);

    @POST("/cash-app/cashlite-flow/cash-in")
    Object getCashInAccount(@Body GetCashInAccountRequest getCashInAccountRequest, Continuation<? super ApiResult<GetCashInAccountResponse>> continuation);

    @POST("/cash-app/cashlite-flow/stable-deposits/get-wallet-addresses")
    Object getWalletAddresses(@Body GetWalletAddressesRequest getWalletAddressesRequest, Continuation<? super ApiResult<GetWalletAddressesResponse>> continuation);

    @POST("/cash-app/cashlite-flow/bitcoin-withdrawals/initiate")
    Object initiateBitcoinWithdrawal(@Header("Cash-Flow-Token") String str, @Body InitiateBitcoinWithdrawalRequest initiateBitcoinWithdrawalRequest, Continuation<? super ApiResult<InitiateBitcoinWithdrawalResponse>> continuation);

    @POST("/cash-app/cashlite-flow/cards/google-pay/push-provision")
    Object pushProvisionGooglePay(@Body PushProvisionGooglePayRequest pushProvisionGooglePayRequest, Continuation<? super ApiResult<PushProvisionGooglePayResponse>> continuation);
}
