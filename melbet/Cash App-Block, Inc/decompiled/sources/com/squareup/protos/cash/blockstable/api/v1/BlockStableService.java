package com.squareup.protos.cash.blockstable.api.v1;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0010H§@¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0014H§@¢\u0006\u0002\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/blockstable/api/v1/BlockStableService;", "", "initiateWithdrawal", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/blockstable/api/v1/InitiateWithdrawalResponse;", "flowToken", "", "request", "Lcom/squareup/protos/cash/blockstable/api/v1/InitiateWithdrawalRequest;", "(Ljava/lang/String;Lcom/squareup/protos/cash/blockstable/api/v1/InitiateWithdrawalRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDepositAddress", "Lcom/squareup/protos/cash/blockstable/api/v1/GetDepositAddressResponse;", "Lcom/squareup/protos/cash/blockstable/api/v1/GetDepositAddressRequest;", "(Lcom/squareup/protos/cash/blockstable/api/v1/GetDepositAddressRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWalletAddresses", "Lcom/squareup/protos/cash/blockstable/api/v1/GetWalletAddressesResponse;", "Lcom/squareup/protos/cash/blockstable/api/v1/GetWalletAddressesRequest;", "(Lcom/squareup/protos/cash/blockstable/api/v1/GetWalletAddressesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAvailableNetworks", "Lcom/squareup/protos/cash/blockstable/api/v1/GetAvailableNetworksResponse;", "Lcom/squareup/protos/cash/blockstable/api/v1/GetAvailableNetworksRequest;", "(Lcom/squareup/protos/cash/blockstable/api/v1/GetAvailableNetworksRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BlockStableService {
    @POST("/cash-app/crypto-withdrawals/stable-withdrawals/get-available-networks")
    Object getAvailableNetworks(@Body GetAvailableNetworksRequest getAvailableNetworksRequest, Continuation<? super ApiResult<GetAvailableNetworksResponse>> continuation);

    @POST("/cash-app/crypto-deposits/stable-deposits/get-deposit-address")
    Object getDepositAddress(@Body GetDepositAddressRequest getDepositAddressRequest, Continuation<? super ApiResult<GetDepositAddressResponse>> continuation);

    @POST("/cash-app/crypto-deposits/stable-deposits/get-wallet-addresses")
    Object getWalletAddresses(@Body GetWalletAddressesRequest getWalletAddressesRequest, Continuation<? super ApiResult<GetWalletAddressesResponse>> continuation);

    @POST("/cash-app/crypto-withdrawals/stable-withdrawals/initiate")
    Object initiateWithdrawal(@Header("Cash-Flow-Token") String str, @Body InitiateWithdrawalRequest initiateWithdrawalRequest, Continuation<? super ApiResult<InitiateWithdrawalResponse>> continuation);
}
