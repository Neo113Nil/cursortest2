package com.squareup.cash.supportarticles.app.v1;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0010H§@¢\u0006\u0002\u0010\u0011J*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0014H§@¢\u0006\u0002\u0010\u0015J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0018H§@¢\u0006\u0002\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lcom/squareup/cash/supportarticles/app/v1/AppSupportArticleService;", "", "listSupportArticles", "Lapp/cash/api/ApiResult;", "Lcom/squareup/cash/supportarticles/app/v1/ListSupportArticlesResponse;", "flowToken", "", "request", "Lcom/squareup/cash/supportarticles/app/v1/ListSupportArticlesRequest;", "(Ljava/lang/String;Lcom/squareup/cash/supportarticles/app/v1/ListSupportArticlesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSupportArticle", "Lcom/squareup/cash/supportarticles/app/v1/GetSupportArticleResponse;", "Lcom/squareup/cash/supportarticles/app/v1/GetSupportArticleRequest;", "(Ljava/lang/String;Lcom/squareup/cash/supportarticles/app/v1/GetSupportArticleRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recommendSupportArticles", "Lcom/squareup/cash/supportarticles/app/v1/RecommendSupportArticlesResponse;", "Lcom/squareup/cash/supportarticles/app/v1/RecommendSupportArticlesRequest;", "(Ljava/lang/String;Lcom/squareup/cash/supportarticles/app/v1/RecommendSupportArticlesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchSupportArticles", "Lcom/squareup/cash/supportarticles/app/v1/SearchSupportArticlesResponse;", "Lcom/squareup/cash/supportarticles/app/v1/SearchSupportArticlesRequest;", "(Ljava/lang/String;Lcom/squareup/cash/supportarticles/app/v1/SearchSupportArticlesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSupportArticleForTransaction", "Lcom/squareup/cash/supportarticles/app/v1/GetSupportArticleForTransactionResponse;", "Lcom/squareup/cash/supportarticles/app/v1/GetSupportArticleForTransactionRequest;", "(Ljava/lang/String;Lcom/squareup/cash/supportarticles/app/v1/GetSupportArticleForTransactionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AppSupportArticleService {
    @POST("cash-app/support-articles/v1/get")
    Object getSupportArticle(@Header("Cash-Flow-Token") String str, @Body GetSupportArticleRequest getSupportArticleRequest, Continuation<? super ApiResult<GetSupportArticleResponse>> continuation);

    @POST("/cash-app/support-articles/v1/support-article-for-transaction/get")
    Object getSupportArticleForTransaction(@Header("Cash-Flow-Token") String str, @Body GetSupportArticleForTransactionRequest getSupportArticleForTransactionRequest, Continuation<? super ApiResult<GetSupportArticleForTransactionResponse>> continuation);

    @POST("/cash-app/support-articles/v1/list")
    Object listSupportArticles(@Header("Cash-Flow-Token") String str, @Body ListSupportArticlesRequest listSupportArticlesRequest, Continuation<? super ApiResult<ListSupportArticlesResponse>> continuation);

    @POST("/cash-app/support-articles/v1/recommend")
    Object recommendSupportArticles(@Header("Cash-Flow-Token") String str, @Body RecommendSupportArticlesRequest recommendSupportArticlesRequest, Continuation<? super ApiResult<RecommendSupportArticlesResponse>> continuation);

    @POST("/cash-app/support-articles/v1/search")
    Object searchSupportArticles(@Header("Cash-Flow-Token") String str, @Body SearchSupportArticlesRequest searchSupportArticlesRequest, Continuation<? super ApiResult<SearchSupportArticlesResponse>> continuation);
}
