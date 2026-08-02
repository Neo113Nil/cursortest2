package com.squareup.protos.cash.piggybank.appapi;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/piggybank/appapi/PiggybankAppService;", "", "Lcom/squareup/protos/cash/piggybank/appapi/RefreshSavingsScreensRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/piggybank/appapi/RefreshSavingsScreensResponse;", "refreshSavingsScreens", "(Lcom/squareup/protos/cash/piggybank/appapi/RefreshSavingsScreensRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/piggybank/appapi/FamiliesSavingsScreensRequest;", "Lcom/squareup/protos/cash/piggybank/appapi/FamiliesSavingsScreensResponse;", "familiesSavingsScreens", "(Lcom/squareup/protos/cash/piggybank/appapi/FamiliesSavingsScreensRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/piggybank/appapi/RemoveActiveGoalRequest;", "Lcom/squareup/protos/cash/piggybank/appapi/RemoveActiveGoalResponse;", "removeActiveGoal", "(Lcom/squareup/protos/cash/piggybank/appapi/RemoveActiveGoalRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/piggybank/appapi/Get1099IntStatementsRequest;", "Lcom/squareup/protos/cash/piggybank/appapi/Get1099IntStatementsResponse;", "get1099IntStatements", "(Lcom/squareup/protos/cash/piggybank/appapi/Get1099IntStatementsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/piggybank/appapi/RefreshSavingsAppletRequest;", "Lcom/squareup/protos/cash/piggybank/appapi/RefreshSavingsAppletResponse;", "refreshSavingsApplet", "(Lcom/squareup/protos/cash/piggybank/appapi/RefreshSavingsAppletRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/piggybank/appapi/GetInterestSettingsRequest;", "Lcom/squareup/protos/cash/piggybank/appapi/GetInterestSettingsResponse;", "getInterestSettingsAppActionV2", "(Lcom/squareup/protos/cash/piggybank/appapi/GetInterestSettingsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PiggybankAppService {
    @POST("/cash-app/savings/families-savings-screens")
    Object familiesSavingsScreens(@Body FamiliesSavingsScreensRequest familiesSavingsScreensRequest, Continuation<? super ApiResult<FamiliesSavingsScreensResponse>> continuation);

    @POST("/cash-app/savings/get-1099-int-statements")
    Object get1099IntStatements(@Body Get1099IntStatementsRequest get1099IntStatementsRequest, Continuation<? super ApiResult<Get1099IntStatementsResponse>> continuation);

    @POST("/cash-app/savings/get-interest-settings-v2")
    Object getInterestSettingsAppActionV2(@Body GetInterestSettingsRequest getInterestSettingsRequest, Continuation<? super ApiResult<GetInterestSettingsResponse>> continuation);

    @POST("/cash-app/savings/refresh-savings-applet")
    Object refreshSavingsApplet(@Body RefreshSavingsAppletRequest refreshSavingsAppletRequest, Continuation<? super ApiResult<RefreshSavingsAppletResponse>> continuation);

    @POST("/cash-app/savings/refresh-savings-screens")
    Object refreshSavingsScreens(@Body RefreshSavingsScreensRequest refreshSavingsScreensRequest, Continuation<? super ApiResult<RefreshSavingsScreensResponse>> continuation);

    @POST("/cash-app/savings/remove-active-goal")
    Object removeActiveGoal(@Body RemoveActiveGoalRequest removeActiveGoalRequest, Continuation<? super ApiResult<RemoveActiveGoalResponse>> continuation);
}
