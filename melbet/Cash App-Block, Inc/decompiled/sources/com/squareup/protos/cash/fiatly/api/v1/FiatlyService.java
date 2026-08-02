package com.squareup.protos.cash.fiatly.api.v1;

import app.cash.api.ApiResult;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.InitiatePaymentRequest;
import com.squareup.protos.franklin.app.InitiatePaymentResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JL\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\f\u0010\rJL\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\t\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\b\b\u0001\u0010\t\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\n2\b\b\u0001\u0010\t\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/fiatly/api/v1/FiatlyService;", "", "Lcom/squareup/protos/franklin/api/ClientScenario;", "clientScenario", "", "flowToken", "cashGooseSessionId", "cashGooseToolRequestId", "Lcom/squareup/protos/franklin/app/InitiatePaymentRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/franklin/app/InitiatePaymentResponse;", "initiatePayment", "(Lcom/squareup/protos/franklin/api/ClientScenario;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/app/InitiatePaymentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/fiatly/api/v1/InitiatePersonalizedPaymentRequest;", "Lcom/squareup/protos/cash/fiatly/api/v1/InitiatePersonalizedPaymentResponse;", "initiatePersonalizedPayment", "(Lcom/squareup/protos/franklin/api/ClientScenario;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/cash/fiatly/api/v1/InitiatePersonalizedPaymentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/fiatly/api/v1/GetP2PControlsRequest;", "Lcom/squareup/protos/cash/fiatly/api/v1/GetP2PControlsResponse;", "getP2PControls", "(Lcom/squareup/protos/cash/fiatly/api/v1/GetP2PControlsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/fiatly/api/v1/SetP2PControlsRequest;", "Lcom/squareup/protos/cash/fiatly/api/v1/SetP2PControlsResponse;", "setP2PControls", "(Lcom/squareup/protos/cash/fiatly/api/v1/SetP2PControlsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FiatlyService {
    @POST("/cash-app/fiatly/get-p2p-controls")
    Object getP2PControls(@Body GetP2PControlsRequest getP2PControlsRequest, Continuation<? super ApiResult<GetP2PControlsResponse>> continuation);

    @POST("/2.0/cash/initiate-payment")
    Object initiatePayment(@Header("Cash-Client-Scenario") ClientScenario clientScenario, @Header("Cash-Flow-Token") String str, @Header("Cash-Goose-Session-Id") String str2, @Header("Cash-Goose-Tool-Request-Id") String str3, @Body InitiatePaymentRequest initiatePaymentRequest, Continuation<? super ApiResult<InitiatePaymentResponse>> continuation);

    @POST("/cash-app/fiatly/initiate-personalized-payment")
    Object initiatePersonalizedPayment(@Header("Cash-Client-Scenario") ClientScenario clientScenario, @Header("Cash-Flow-Token") String str, @Header("Cash-Goose-Session-Id") String str2, @Header("Cash-Goose-Tool-Request-Id") String str3, @Body InitiatePersonalizedPaymentRequest initiatePersonalizedPaymentRequest, Continuation<? super ApiResult<InitiatePersonalizedPaymentResponse>> continuation);

    @POST("/cash-app/fiatly/set-p2p-controls")
    Object setP2PControls(@Body SetP2PControlsRequest setP2PControlsRequest, Continuation<? super ApiResult<SetP2PControlsResponse>> continuation);
}
