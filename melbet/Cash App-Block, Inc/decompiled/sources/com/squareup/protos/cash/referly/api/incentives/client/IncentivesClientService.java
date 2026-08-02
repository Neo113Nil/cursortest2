package com.squareup.protos.cash.referly.api.incentives.client;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/referly/api/incentives/client/IncentivesClientService;", "", "getPromotionsHomeData", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/referly/api/incentives/client/GetPromotionsHomeDataResponse;", "request", "Lcom/squareup/protos/cash/referly/api/incentives/client/GetPromotionsHomeDataRequest;", "(Lcom/squareup/protos/cash/referly/api/incentives/client/GetPromotionsHomeDataRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPromotionControls", "Lcom/squareup/protos/cash/referly/api/incentives/client/GetPromotionControlsResponse;", "Lcom/squareup/protos/cash/referly/api/incentives/client/GetPromotionControlsRequest;", "(Lcom/squareup/protos/cash/referly/api/incentives/client/GetPromotionControlsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setPromotionControls", "Lcom/squareup/protos/cash/referly/api/incentives/client/SetPromotionControlsResponse;", "Lcom/squareup/protos/cash/referly/api/incentives/client/SetPromotionControlsRequest;", "(Lcom/squareup/protos/cash/referly/api/incentives/client/SetPromotionControlsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface IncentivesClientService {
    @POST("/cash-app/referly/get-promotion-controls")
    Object getPromotionControls(@Body GetPromotionControlsRequest getPromotionControlsRequest, Continuation<? super ApiResult<GetPromotionControlsResponse>> continuation);

    @POST("/cash-app/referly/get-promotions-home-data")
    Object getPromotionsHomeData(@Body GetPromotionsHomeDataRequest getPromotionsHomeDataRequest, Continuation<? super ApiResult<GetPromotionsHomeDataResponse>> continuation);

    @POST("/cash-app/referly/set-promotion-controls")
    Object setPromotionControls(@Body SetPromotionControlsRequest setPromotionControlsRequest, Continuation<? super ApiResult<SetPromotionControlsResponse>> continuation);
}
