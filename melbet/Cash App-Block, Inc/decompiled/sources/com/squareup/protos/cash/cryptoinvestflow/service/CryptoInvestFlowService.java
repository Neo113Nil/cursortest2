package com.squareup.protos.cash.cryptoinvestflow.service;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/cryptoinvestflow/service/CryptoInvestFlowService;", "", "initiateInstrumentSelection", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/cryptoinvestflow/service/InitiateInstrumentSelectionResponse;", "flowToken", "", "request", "Lcom/squareup/protos/cash/cryptoinvestflow/service/InitiateInstrumentSelectionRequest;", "(Ljava/lang/String;Lcom/squareup/protos/cash/cryptoinvestflow/service/InitiateInstrumentSelectionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CryptoInvestFlowService {
    @POST("/cash-app/crypto/invest/initiate-instrument-selection")
    Object initiateInstrumentSelection(@Header("Cash-Flow-Token") String str, @Body InitiateInstrumentSelectionRequest initiateInstrumentSelectionRequest, Continuation<? super ApiResult<InitiateInstrumentSelectionResponse>> continuation);
}
