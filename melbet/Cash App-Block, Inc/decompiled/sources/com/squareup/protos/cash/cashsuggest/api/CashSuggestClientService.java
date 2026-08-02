package com.squareup.protos.cash.cashsuggest.api;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00042\b\b\u0001\u0010\u0003\u001a\u00020 H§@¢\u0006\u0004\b\"\u0010#¨\u0006$À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/cashsuggest/api/CashSuggestClientService;", "", "Lcom/squareup/protos/cash/cashsuggest/api/ShopInfoRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/cashsuggest/api/ShopInfoResponse;", "shopInfo", "(Lcom/squareup/protos/cash/cashsuggest/api/ShopInfoRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/cashsuggest/api/OffersSheetRequest;", "Lcom/squareup/protos/cash/cashsuggest/api/OffersSheetResponse;", "offersSheet", "(Lcom/squareup/protos/cash/cashsuggest/api/OffersSheetRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/cashsuggest/api/OffersTabCollectionRequest;", "Lcom/squareup/protos/cash/cashsuggest/api/OffersTabCollectionResponse;", "offersTabCollection", "(Lcom/squareup/protos/cash/cashsuggest/api/OffersTabCollectionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/cashsuggest/api/OffersTabHomeRequest;", "Lcom/squareup/protos/cash/cashsuggest/api/OffersTabHomeResponse;", "offersTabHome", "(Lcom/squareup/protos/cash/cashsuggest/api/OffersTabHomeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/cashsuggest/api/OffersTabSearchRequest;", "Lcom/squareup/protos/cash/cashsuggest/api/OffersTabSearchResponse;", "offersTabSearch", "(Lcom/squareup/protos/cash/cashsuggest/api/OffersTabSearchRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/cashsuggest/api/AfterpayAppletRequest;", "Lcom/squareup/protos/cash/cashsuggest/api/AfterpayAppletResponse;", "afterpayAppletHome", "(Lcom/squareup/protos/cash/cashsuggest/api/AfterpayAppletRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/cashsuggest/api/AfterpayAppletSearchRequest;", "Lcom/squareup/protos/cash/cashsuggest/api/AfterpayAppletSearchResponse;", "afterpayAppletSearch", "(Lcom/squareup/protos/cash/cashsuggest/api/AfterpayAppletSearchRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/cashsuggest/api/AfterpayMerchantSheetRequest;", "Lcom/squareup/protos/cash/cashsuggest/api/AfterpayMerchantSheetResponse;", "afterpaySheet", "(Lcom/squareup/protos/cash/cashsuggest/api/AfterpayMerchantSheetRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CashSuggestClientService {
    @POST("/cash-app/afterpay/applet")
    Object afterpayAppletHome(@Body AfterpayAppletRequest afterpayAppletRequest, Continuation<? super ApiResult<AfterpayAppletResponse>> continuation);

    @POST("/cash-app/afterpay/applet/search")
    Object afterpayAppletSearch(@Body AfterpayAppletSearchRequest afterpayAppletSearchRequest, Continuation<? super ApiResult<AfterpayAppletSearchResponse>> continuation);

    @POST("/cash-app/afterpay/sheet")
    Object afterpaySheet(@Body AfterpayMerchantSheetRequest afterpayMerchantSheetRequest, Continuation<? super ApiResult<AfterpayMerchantSheetResponse>> continuation);

    @POST("/cash-app/offers/sheet")
    Object offersSheet(@Body OffersSheetRequest offersSheetRequest, Continuation<? super ApiResult<OffersSheetResponse>> continuation);

    @POST("/cash-app/offers-tab/collection")
    Object offersTabCollection(@Body OffersTabCollectionRequest offersTabCollectionRequest, Continuation<? super ApiResult<OffersTabCollectionResponse>> continuation);

    @POST("/cash-app/offers-tab/home")
    Object offersTabHome(@Body OffersTabHomeRequest offersTabHomeRequest, Continuation<? super ApiResult<OffersTabHomeResponse>> continuation);

    @POST("/cash-app/offers-tab/search")
    Object offersTabSearch(@Body OffersTabSearchRequest offersTabSearchRequest, Continuation<? super ApiResult<OffersTabSearchResponse>> continuation);

    @POST("/cash-app/shop/info")
    Object shopInfo(@Body ShopInfoRequest shopInfoRequest, Continuation<? super ApiResult<ShopInfoResponse>> continuation);
}
