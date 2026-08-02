package com.squareup.protos.cash.cashbusinessaccounts.api.v1;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/cashbusinessaccounts/api/v1/C4BClientService;", "", "Lcom/squareup/protos/cash/cashbusinessaccounts/api/v1/GetC4bEligibilityRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/cashbusinessaccounts/api/v1/GetC4bEligibilityResponse;", "getC4bEligibility", "(Lcom/squareup/protos/cash/cashbusinessaccounts/api/v1/GetC4bEligibilityRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/cashbusinessaccounts/api/v1/EarningsTrackerDataRequest;", "Lcom/squareup/protos/cash/cashbusinessaccounts/api/v1/EarningsTrackerDataResponse;", "getEarningsTrackerData", "(Lcom/squareup/protos/cash/cashbusinessaccounts/api/v1/EarningsTrackerDataRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface C4BClientService {
    @POST("/cash-app/business-accounts/get-c4b-eligibility")
    Object getC4bEligibility(@Body GetC4bEligibilityRequest getC4bEligibilityRequest, Continuation<? super ApiResult<GetC4bEligibilityResponse>> continuation);

    @POST("/cash-app/business-accounts/get-earnings-tracker-data")
    Object getEarningsTrackerData(@Body EarningsTrackerDataRequest earningsTrackerDataRequest, Continuation<? super ApiResult<EarningsTrackerDataResponse>> continuation);
}
