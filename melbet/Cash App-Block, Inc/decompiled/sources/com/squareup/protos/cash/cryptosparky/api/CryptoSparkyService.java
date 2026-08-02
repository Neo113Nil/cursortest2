package com.squareup.protos.cash.cryptosparky.api;

import app.cash.api.ApiResult;
import com.squareup.protos.franklin.api.ClientScenario;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J>\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/cryptosparky/api/CryptoSparkyService;", "", "initiateBitcoinWithdrawal", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/cryptosparky/api/InitiateBitcoinWithdrawal$Response;", "clientScenario", "Lcom/squareup/protos/franklin/api/ClientScenario;", "flowToken", "", "xTrifleMetadata", "request", "Lcom/squareup/protos/cash/cryptosparky/api/InitiateBitcoinWithdrawal$Request;", "(Lcom/squareup/protos/franklin/api/ClientScenario;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/cash/cryptosparky/api/InitiateBitcoinWithdrawal$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CryptoSparkyService {
    @POST("/cash-app/crypto-withdrawals/initiate-bitcoin-withdrawal")
    Object initiateBitcoinWithdrawal(@Header("Cash-Client-Scenario") ClientScenario clientScenario, @Header("Cash-Flow-Token") String str, @Header("X-Trifle-Metadata") String str2, @Body InitiateBitcoinWithdrawal$Request initiateBitcoinWithdrawal$Request, Continuation<? super ApiResult<InitiateBitcoinWithdrawal$Response>> continuation);
}
