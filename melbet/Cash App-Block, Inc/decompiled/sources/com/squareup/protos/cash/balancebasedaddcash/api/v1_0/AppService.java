package com.squareup.protos.cash.balancebasedaddcash.api.v1_0;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\fH§@¢\u0006\u0002\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/balancebasedaddcash/api/v1_0/AppService;", "", "setBalanceBasedAddCashPreference", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/balancebasedaddcash/api/v1_0/SetBalanceBasedAddCashPreferenceResponse;", "flowToken", "", "request", "Lcom/squareup/protos/cash/balancebasedaddcash/api/v1_0/SetBalanceBasedAddCashPreferenceRequest;", "(Ljava/lang/String;Lcom/squareup/protos/cash/balancebasedaddcash/api/v1_0/SetBalanceBasedAddCashPreferenceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disableBalanceBasedAddCashPreference", "Lcom/squareup/protos/cash/balancebasedaddcash/api/v1_0/DisableBalanceBasedAddCashPreferenceResponse;", "Lcom/squareup/protos/cash/balancebasedaddcash/api/v1_0/DisableBalanceBasedAddCashPreferenceRequest;", "(Lcom/squareup/protos/cash/balancebasedaddcash/api/v1_0/DisableBalanceBasedAddCashPreferenceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AppService {
    @POST("/cash-app/balance-based-add-cash/v1.0/disable_balance_based_add_cash_preference")
    Object disableBalanceBasedAddCashPreference(@Body DisableBalanceBasedAddCashPreferenceRequest disableBalanceBasedAddCashPreferenceRequest, Continuation<? super ApiResult<DisableBalanceBasedAddCashPreferenceResponse>> continuation);

    @POST("/cash-app/balance-based-add-cash/v1.0/set_balance_based_add_cash_preference")
    Object setBalanceBasedAddCashPreference(@Header("Cash-Flow-Token") String str, @Body SetBalanceBasedAddCashPreferenceRequest setBalanceBasedAddCashPreferenceRequest, Continuation<? super ApiResult<SetBalanceBasedAddCashPreferenceResponse>> continuation);
}
