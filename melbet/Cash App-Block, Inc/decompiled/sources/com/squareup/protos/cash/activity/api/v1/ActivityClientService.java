package com.squareup.protos.cash.activity.api.v1;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityClientService;", "", "Lcom/squareup/protos/cash/activity/api/v1/ActivityPageRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityPageResponse;", "activityPage", "(Lcom/squareup/protos/cash/activity/api/v1/ActivityPageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchPageRequest;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchResponse;", "searchActivity", "(Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchPageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityGetRequest;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityGetResponse;", "activityGet", "(Lcom/squareup/protos/cash/activity/api/v1/ActivityGetRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityPageThreadedFeedRequest;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityPageThreadedFeedResponse;", "activityPageThreadedFeed", "(Lcom/squareup/protos/cash/activity/api/v1/ActivityPageThreadedFeedRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ActivityClientService {
    @POST("/cash-app/activity/v1.0/get")
    Object activityGet(@Body ActivityGetRequest activityGetRequest, Continuation<? super ApiResult<ActivityGetResponse>> continuation);

    @POST("/cash-app/activity/v1.0/page")
    Object activityPage(@Body ActivityPageRequest activityPageRequest, Continuation<? super ApiResult<ActivityPageResponse>> continuation);

    @POST("/cash-app/activity/v1.0/pagethread")
    Object activityPageThreadedFeed(@Body ActivityPageThreadedFeedRequest activityPageThreadedFeedRequest, Continuation<? super ApiResult<ActivityPageThreadedFeedResponse>> continuation);

    @POST("/cash-app/activity/v1.0/search")
    Object searchActivity(@Body ActivitySearchPageRequest activitySearchPageRequest, Continuation<? super ApiResult<ActivitySearchResponse>> continuation);
}
