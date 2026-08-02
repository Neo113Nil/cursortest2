package com.squareup.protos.cash.discover.api.app.v2.service;

import app.cash.api.ApiResult;
import com.squareup.protos.cash.discover.api.app.v2.api.SearchRequest;
import com.squareup.protos.cash.discover.api.app.v2.api.SearchResponse;
import com.squareup.protos.cash.discover.api.app.v2.api.SectionPageRequest;
import com.squareup.protos.cash.discover.api.app.v2.api.SectionPageResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/discover/api/app/v2/service/GlobalSearchService;", "", "Lcom/squareup/protos/cash/discover/api/app/v2/api/SearchRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/discover/api/app/v2/api/SearchResponse;", "search", "(Lcom/squareup/protos/cash/discover/api/app/v2/api/SearchRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/discover/api/app/v2/api/SectionPageRequest;", "Lcom/squareup/protos/cash/discover/api/app/v2/api/SectionPageResponse;", "sectionPage", "(Lcom/squareup/protos/cash/discover/api/app/v2/api/SectionPageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface GlobalSearchService {
    @POST("/cash-app/discover/global/search")
    Object search(@Body SearchRequest searchRequest, Continuation<? super ApiResult<SearchResponse>> continuation);

    @POST("/cash-app/discover/global/section-page")
    Object sectionPage(@Body SectionPageRequest sectionPageRequest, Continuation<? super ApiResult<SectionPageResponse>> continuation);
}
