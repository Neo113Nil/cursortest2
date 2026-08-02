package com.squareup.protos.cash.spendinginsights.appapi;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/spendinginsights/appapi/SpendingInsightsAppService;", "", "Lcom/squareup/protos/cash/spendinginsights/appapi/GetCardSpendingInsightRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/spendinginsights/appapi/GetCardSpendingInsightResponse;", "getCardSpendingInsight", "(Lcom/squareup/protos/cash/spendinginsights/appapi/GetCardSpendingInsightRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/spendinginsights/appapi/RefreshCardSpendingInsightsHomeRequest;", "Lcom/squareup/protos/cash/spendinginsights/appapi/RefreshCardSpendingInsightsHomeResponse;", "refreshCardSpendingInsightsHome", "(Lcom/squareup/protos/cash/spendinginsights/appapi/RefreshCardSpendingInsightsHomeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/spendinginsights/appapi/RefreshCardSpendingInsightsEntryPointRequest;", "Lcom/squareup/protos/cash/spendinginsights/appapi/RefreshCardSpendingInsightsEntryPointResponse;", "refreshCardSpendingInsightsEntryPoint", "(Lcom/squareup/protos/cash/spendinginsights/appapi/RefreshCardSpendingInsightsEntryPointRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SpendingInsightsAppService {
    @POST("/cash-app/spending-insights/get-card-spending-insight")
    Object getCardSpendingInsight(@Body GetCardSpendingInsightRequest getCardSpendingInsightRequest, Continuation<? super ApiResult<GetCardSpendingInsightResponse>> continuation);

    @POST("/cash-app/spending-insights/refresh-card-spending-insights-entry-point")
    Object refreshCardSpendingInsightsEntryPoint(@Body RefreshCardSpendingInsightsEntryPointRequest refreshCardSpendingInsightsEntryPointRequest, Continuation<? super ApiResult<RefreshCardSpendingInsightsEntryPointResponse>> continuation);

    @POST("/cash-app/spending-insights/refresh-card-spending-insights-home")
    Object refreshCardSpendingInsightsHome(@Body RefreshCardSpendingInsightsHomeRequest refreshCardSpendingInsightsHomeRequest, Continuation<? super ApiResult<RefreshCardSpendingInsightsHomeResponse>> continuation);
}
