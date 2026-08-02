package com.squareup.protos.rewardly.app;

import app.cash.api.ApiResult;
import com.squareup.protos.franklin.app.GetBoostConfigRequest;
import com.squareup.protos.franklin.app.GetBoostConfigResponse;
import com.squareup.protos.franklin.app.GetRewardsRequest;
import com.squareup.protos.franklin.app.GetRewardsResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/squareup/protos/rewardly/app/RewardlyExternalAppService;", "", "Lcom/squareup/protos/franklin/app/GetRewardsRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/franklin/app/GetRewardsResponse;", "getRewardsDirect", "(Lcom/squareup/protos/franklin/app/GetRewardsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/franklin/app/GetBoostConfigRequest;", "Lcom/squareup/protos/franklin/app/GetBoostConfigResponse;", "getBoostConfigDirect", "(Lcom/squareup/protos/franklin/app/GetBoostConfigRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface RewardlyExternalAppService {
    @POST("/2.0/cash/get-boost-config")
    Object getBoostConfigDirect(@Body GetBoostConfigRequest getBoostConfigRequest, Continuation<? super ApiResult<GetBoostConfigResponse>> continuation);

    @POST("/2.0/cash/get-rewards")
    Object getRewardsDirect(@Body GetRewardsRequest getRewardsRequest, Continuation<? super ApiResult<GetRewardsResponse>> continuation);
}
