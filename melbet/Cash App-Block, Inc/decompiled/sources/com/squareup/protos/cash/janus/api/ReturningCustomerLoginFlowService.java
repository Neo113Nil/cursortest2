package com.squareup.protos.cash.janus.api;

import app.cash.api.ApiResult;
import com.squareup.protos.franklin.api.ClientScenario;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J2\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000fJ2\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u0012H§@¢\u0006\u0002\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/janus/api/ReturningCustomerLoginFlowService;", "", "removeAccount", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/janus/api/RemoveAccountResponse;", "request", "Lcom/squareup/protos/cash/janus/api/RemoveAccountRequest;", "(Lcom/squareup/protos/cash/janus/api/RemoveAccountRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startAccountRecovery", "Lcom/squareup/protos/cash/janus/api/StartAccountRecoveryResponse;", "clientScenario", "Lcom/squareup/protos/franklin/api/ClientScenario;", "flowToken", "", "Lcom/squareup/protos/cash/janus/api/StartAccountRecoveryRequest;", "(Lcom/squareup/protos/franklin/api/ClientScenario;Ljava/lang/String;Lcom/squareup/protos/cash/janus/api/StartAccountRecoveryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLoginScenarioPlan", "Lcom/squareup/protos/cash/janus/api/GetLoginScenarioPlanResponse;", "Lcom/squareup/protos/cash/janus/api/GetLoginScenarioPlanRequest;", "(Lcom/squareup/protos/franklin/api/ClientScenario;Ljava/lang/String;Lcom/squareup/protos/cash/janus/api/GetLoginScenarioPlanRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ReturningCustomerLoginFlowService {
    @POST("/cash-app/security/1.0/get-login-scenario-plan")
    Object getLoginScenarioPlan(@Header("Cash-Client-Scenario") ClientScenario clientScenario, @Header("Cash-Flow-Token") String str, @Body GetLoginScenarioPlanRequest getLoginScenarioPlanRequest, Continuation<? super ApiResult<GetLoginScenarioPlanResponse>> continuation);

    @POST("/cash-app/security/1.0/remove-saved-account")
    Object removeAccount(@Body RemoveAccountRequest removeAccountRequest, Continuation<? super ApiResult<RemoveAccountResponse>> continuation);

    @POST("/cash-app/security/1.0/start-account-recovery")
    Object startAccountRecovery(@Header("Cash-Client-Scenario") ClientScenario clientScenario, @Header("Cash-Flow-Token") String str, @Body StartAccountRecoveryRequest startAccountRecoveryRequest, Continuation<? super ApiResult<StartAccountRecoveryResponse>> continuation);
}
