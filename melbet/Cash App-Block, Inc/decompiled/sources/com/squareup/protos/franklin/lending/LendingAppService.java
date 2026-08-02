package com.squareup.protos.franklin.lending;

import app.cash.api.ApiResult;
import com.squareup.protos.franklin.api.ClientScenario;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J4\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00042\b\b\u0001\u0010\u0003\u001a\u00020 H§@¢\u0006\u0004\b\"\u0010#J4\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020$H§@¢\u0006\u0004\b&\u0010'J \u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00042\b\b\u0001\u0010\u0003\u001a\u00020(H§@¢\u0006\u0004\b*\u0010+¨\u0006,À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/franklin/lending/LendingAppService;", "", "Lcom/squareup/protos/franklin/lending/BulletinInteractionRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/franklin/lending/BulletinInteractionResponse;", "bulletinInteraction", "(Lcom/squareup/protos/franklin/lending/BulletinInteractionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/franklin/api/ClientScenario;", "clientScenario", "", "flowToken", "Lcom/squareup/protos/franklin/lending/InitiateLoanRequest;", "Lcom/squareup/protos/franklin/lending/InitiateLoanResponse;", "initiateLoan", "(Lcom/squareup/protos/franklin/api/ClientScenario;Ljava/lang/String;Lcom/squareup/protos/franklin/lending/InitiateLoanRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/franklin/lending/InitiateLoanPaymentRequest;", "Lcom/squareup/protos/franklin/lending/InitiateLoanPaymentResponse;", "initiateLoanPayment", "(Lcom/squareup/protos/franklin/api/ClientScenario;Ljava/lang/String;Lcom/squareup/protos/franklin/lending/InitiateLoanPaymentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/franklin/lending/SkipLoanPaymentRequest;", "Lcom/squareup/protos/franklin/lending/SkipLoanPaymentResponse;", "skipLoanPayment", "(Lcom/squareup/protos/franklin/api/ClientScenario;Ljava/lang/String;Lcom/squareup/protos/franklin/lending/SkipLoanPaymentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/franklin/lending/GetLoanHistoryRequest;", "Lcom/squareup/protos/franklin/lending/GetLoanHistoryResponse;", "getLoanHistory", "(Lcom/squareup/protos/franklin/lending/GetLoanHistoryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/franklin/lending/EntryPointTappedRequest;", "Lcom/squareup/protos/franklin/lending/EntryPointTappedResponse;", "entryPointTapped", "(Lcom/squareup/protos/franklin/lending/EntryPointTappedRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/franklin/lending/LoanDetailsRequest;", "Lcom/squareup/protos/franklin/lending/LoanDetailsResponse;", "loanDetails", "(Lcom/squareup/protos/franklin/lending/LoanDetailsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/franklin/lending/SelectPaymentPlanBlockerSubmitRequest;", "Lcom/squareup/protos/franklin/lending/SelectPaymentPlanBlockerSubmitResponse;", "selectPaymentPlanBlockerSubmit", "(Lcom/squareup/protos/franklin/api/ClientScenario;Ljava/lang/String;Lcom/squareup/protos/franklin/lending/SelectPaymentPlanBlockerSubmitRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/franklin/lending/SyncPrepurchaseCashCardRequest;", "Lcom/squareup/protos/franklin/lending/SyncPrepurchaseCashCardResponse;", "syncPrepurchaseCashCard", "(Lcom/squareup/protos/franklin/lending/SyncPrepurchaseCashCardRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LendingAppService {
    @POST("cash-app/lending/bulletin-interaction")
    Object bulletinInteraction(@Body BulletinInteractionRequest bulletinInteractionRequest, Continuation<? super ApiResult<BulletinInteractionResponse>> continuation);

    @POST("cash-app/lending/entry-point-tapped")
    Object entryPointTapped(@Body EntryPointTappedRequest entryPointTappedRequest, Continuation<? super ApiResult<EntryPointTappedResponse>> continuation);

    @POST("cash-app/lending/loan-history")
    Object getLoanHistory(@Body GetLoanHistoryRequest getLoanHistoryRequest, Continuation<? super ApiResult<GetLoanHistoryResponse>> continuation);

    @POST("/2.0/cash/lending/initiate-loan")
    Object initiateLoan(@Header("Cash-Client-Scenario") ClientScenario clientScenario, @Header("Cash-Flow-Token") String str, @Body InitiateLoanRequest initiateLoanRequest, Continuation<? super ApiResult<InitiateLoanResponse>> continuation);

    @POST("/2.0/cash/lending/initiate-loan-payment")
    Object initiateLoanPayment(@Header("Cash-Client-Scenario") ClientScenario clientScenario, @Header("Cash-Flow-Token") String str, @Body InitiateLoanPaymentRequest initiateLoanPaymentRequest, Continuation<? super ApiResult<InitiateLoanPaymentResponse>> continuation);

    @POST("cash-app/lending/loan-details")
    Object loanDetails(@Body LoanDetailsRequest loanDetailsRequest, Continuation<? super ApiResult<LoanDetailsResponse>> continuation);

    @POST("cash-app/lending/select-payment-plan-blocker-submit")
    Object selectPaymentPlanBlockerSubmit(@Header("Cash-Client-Scenario") ClientScenario clientScenario, @Header("Cash-Flow-Token") String str, @Body SelectPaymentPlanBlockerSubmitRequest selectPaymentPlanBlockerSubmitRequest, Continuation<? super ApiResult<SelectPaymentPlanBlockerSubmitResponse>> continuation);

    @POST("/2.0/cash/lending/skip-loan-payment")
    Object skipLoanPayment(@Header("Cash-Client-Scenario") ClientScenario clientScenario, @Header("Cash-Flow-Token") String str, @Body SkipLoanPaymentRequest skipLoanPaymentRequest, Continuation<? super ApiResult<SkipLoanPaymentResponse>> continuation);

    @POST("cash-app/lending/cards/sync-prepurchase-cash-card")
    Object syncPrepurchaseCashCard(@Body SyncPrepurchaseCashCardRequest syncPrepurchaseCashCardRequest, Continuation<? super ApiResult<SyncPrepurchaseCashCardResponse>> continuation);
}
