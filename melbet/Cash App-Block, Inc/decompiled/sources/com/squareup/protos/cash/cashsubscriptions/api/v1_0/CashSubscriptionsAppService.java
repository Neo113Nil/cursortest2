package com.squareup.protos.cash.cashsubscriptions.api.v1_0;

import app.cash.api.ApiResult;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.GetMobilePlanHomeRequest;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.GetMobilePlanHomeResponse;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.GetNewLineActivationStatusRequest;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.GetNewLineActivationStatusResponse;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.GetPhonePlanAppletRequest;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.GetPhonePlanAppletResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/cashsubscriptions/api/v1_0/CashSubscriptionsAppService;", "", "Lcom/squareup/cash/cashsubscriptions/phoneplans/api/v1_0/app/GetMobilePlanHomeRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/cash/cashsubscriptions/phoneplans/api/v1_0/app/GetMobilePlanHomeResponse;", "getMobilePlanHome", "(Lcom/squareup/cash/cashsubscriptions/phoneplans/api/v1_0/app/GetMobilePlanHomeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/cash/cashsubscriptions/phoneplans/api/v1_0/app/GetPhonePlanAppletRequest;", "Lcom/squareup/cash/cashsubscriptions/phoneplans/api/v1_0/app/GetPhonePlanAppletResponse;", "getPhonePlanApplet", "(Lcom/squareup/cash/cashsubscriptions/phoneplans/api/v1_0/app/GetPhonePlanAppletRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/cash/cashsubscriptions/phoneplans/api/v1_0/app/GetNewLineActivationStatusRequest;", "Lcom/squareup/cash/cashsubscriptions/phoneplans/api/v1_0/app/GetNewLineActivationStatusResponse;", "getNewLineActivationStatus", "(Lcom/squareup/cash/cashsubscriptions/phoneplans/api/v1_0/app/GetNewLineActivationStatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CashSubscriptionsAppService {
    @POST("/cash-app/phone-plans/v1.0/get-mobile-plan-home")
    Object getMobilePlanHome(@Body GetMobilePlanHomeRequest getMobilePlanHomeRequest, Continuation<? super ApiResult<GetMobilePlanHomeResponse>> continuation);

    @POST("/cash-app/phone-plans/v1.0/get-new-line-activation-status")
    Object getNewLineActivationStatus(@Body GetNewLineActivationStatusRequest getNewLineActivationStatusRequest, Continuation<? super ApiResult<GetNewLineActivationStatusResponse>> continuation);

    @POST("/cash-app/phone-plans/v1.0/get-phone-plan-applet")
    Object getPhonePlanApplet(@Body GetPhonePlanAppletRequest getPhonePlanAppletRequest, Continuation<? super ApiResult<GetPhonePlanAppletResponse>> continuation);
}
