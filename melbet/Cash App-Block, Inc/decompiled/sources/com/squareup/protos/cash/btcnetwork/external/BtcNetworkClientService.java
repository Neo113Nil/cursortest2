package com.squareup.protos.cash.btcnetwork.external;

import app.cash.api.ApiResult;
import com.squareup.protos.franklin.api.ClientScenario;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\t\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/btcnetwork/external/BtcNetworkClientService;", "", "acceptCryptPayment", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/btcnetwork/external/AcceptCryptoPaymentResponse;", "clientScenario", "Lcom/squareup/protos/franklin/api/ClientScenario;", "flowToken", "", "request", "Lcom/squareup/protos/cash/btcnetwork/external/AcceptCryptoPaymentRequest;", "(Lcom/squareup/protos/franklin/api/ClientScenario;Ljava/lang/String;Lcom/squareup/protos/cash/btcnetwork/external/AcceptCryptoPaymentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBitcoinSellerLocations", "Lcom/squareup/protos/cash/btcnetwork/external/GetBitcoinSellerLocationsResponse;", "Lcom/squareup/protos/cash/btcnetwork/external/GetBitcoinSellerLocationsRequest;", "(Lcom/squareup/protos/cash/btcnetwork/external/GetBitcoinSellerLocationsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BtcNetworkClientService {
    @POST("/cash-app/crypto-payments/accept_crypto_payment")
    Object acceptCryptPayment(@Header("Cash-Client-Scenario") ClientScenario clientScenario, @Header("Cash-Flow-Token") String str, @Body AcceptCryptoPaymentRequest acceptCryptoPaymentRequest, Continuation<? super ApiResult<AcceptCryptoPaymentResponse>> continuation);

    @POST("/cash-app/crypto-payments/get_bitcoin_locations")
    Object getBitcoinSellerLocations(@Body GetBitcoinSellerLocationsRequest getBitcoinSellerLocationsRequest, Continuation<? super ApiResult<GetBitcoinSellerLocationsResponse>> continuation);
}
