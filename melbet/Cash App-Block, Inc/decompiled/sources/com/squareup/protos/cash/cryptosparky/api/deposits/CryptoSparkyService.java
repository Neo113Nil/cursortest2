package com.squareup.protos.cash.cryptosparky.api.deposits;

import app.cash.api.ApiResult;
import com.squareup.protos.franklin.api.ClientScenario;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J2\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/cryptosparky/api/deposits/CryptoSparkyService;", "", "generateLightningInvoice", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/cryptosparky/api/deposits/GenerateLightningInvoice$Response;", "request", "Lcom/squareup/protos/cash/cryptosparky/api/deposits/GenerateLightningInvoice$Request;", "(Lcom/squareup/protos/cash/cryptosparky/api/deposits/GenerateLightningInvoice$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshInvoice", "Lcom/squareup/protos/cash/cryptosparky/api/deposits/RefreshInvoice$Response;", "clientScenario", "Lcom/squareup/protos/franklin/api/ClientScenario;", "flowToken", "", "Lcom/squareup/protos/cash/cryptosparky/api/deposits/RefreshInvoice$Request;", "(Lcom/squareup/protos/franklin/api/ClientScenario;Ljava/lang/String;Lcom/squareup/protos/cash/cryptosparky/api/deposits/RefreshInvoice$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CryptoSparkyService {
    @POST("/cash-app/crypto-deposits/generate-lightning-invoice")
    Object generateLightningInvoice(@Body GenerateLightningInvoice$Request generateLightningInvoice$Request, Continuation<? super ApiResult<GenerateLightningInvoice$Response>> continuation);

    @POST("cash-app/crypto-deposits/refresh-lightning-invoice")
    Object refreshInvoice(@Header("Cash-Client-Scenario") ClientScenario clientScenario, @Header("Cash-Flow-Token") String str, @Body RefreshInvoice$Request refreshInvoice$Request, Continuation<? super ApiResult<RefreshInvoice$Response>> continuation);
}
