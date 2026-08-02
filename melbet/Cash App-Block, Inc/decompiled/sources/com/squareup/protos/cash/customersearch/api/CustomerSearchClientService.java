package com.squareup.protos.cash.customersearch.api;

import app.cash.api.ApiResult;
import com.squareup.protos.cash.customersearch.api.privacy.GetSearchPrivacySettingsRequest;
import com.squareup.protos.cash.customersearch.api.privacy.GetSearchPrivacySettingsResponse;
import com.squareup.protos.cash.customersearch.api.privacy.SetSearchPrivacySettingsRequest;
import com.squareup.protos.cash.customersearch.api.privacy.SetSearchPrivacySettingsResponse;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/customersearch/api/CustomerSearchClientService;", "", "Lcom/squareup/protos/cash/customersearch/api/RecipientSelectorSearchRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/customersearch/api/RecipientSelectorSearchResponse;", "recipientSelectorSearch", "(Lcom/squareup/protos/cash/customersearch/api/RecipientSelectorSearchRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/customersearch/api/privacy/GetSearchPrivacySettingsRequest;", "Lcom/squareup/protos/cash/customersearch/api/privacy/GetSearchPrivacySettingsResponse;", "getPrivacySettings", "(Lcom/squareup/protos/cash/customersearch/api/privacy/GetSearchPrivacySettingsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/customersearch/api/privacy/SetSearchPrivacySettingsRequest;", "Lcom/squareup/protos/cash/customersearch/api/privacy/SetSearchPrivacySettingsResponse;", "setPrivacySettings", "(Lcom/squareup/protos/cash/customersearch/api/privacy/SetSearchPrivacySettingsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/customersearch/api/ShopSearchBrandsRequest;", "Lcom/squareup/protos/cash/customersearch/api/ShopSearchBrandsResponse;", "shopSearchBrands", "(Lcom/squareup/protos/cash/customersearch/api/ShopSearchBrandsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/customersearch/api/ShopSearchProductsRequest;", "Lcom/squareup/protos/cash/customersearch/api/ShopSearchProductsResponse;", "shopSearchProducts", "(Lcom/squareup/protos/cash/customersearch/api/ShopSearchProductsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/customersearch/api/ShopSearchProductFiltersRequest;", "Lcom/squareup/protos/cash/customersearch/api/ShopSearchProductFiltersResponse;", "shopSearchProductFilters", "(Lcom/squareup/protos/cash/customersearch/api/ShopSearchProductFiltersRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CustomerSearchClientService {
    @POST("/cash-app/search/privacy/get")
    Object getPrivacySettings(@Body GetSearchPrivacySettingsRequest getSearchPrivacySettingsRequest, Continuation<? super ApiResult<GetSearchPrivacySettingsResponse>> continuation);

    @POST("/cash-app/recipient-selector/search")
    Object recipientSelectorSearch(@Body RecipientSelectorSearchRequest recipientSelectorSearchRequest, Continuation<? super ApiResult<RecipientSelectorSearchResponse>> continuation);

    @POST("/cash-app/search/privacy/set")
    Object setPrivacySettings(@Body SetSearchPrivacySettingsRequest setSearchPrivacySettingsRequest, Continuation<? super ApiResult<SetSearchPrivacySettingsResponse>> continuation);

    @POST("/cash-app/shop/search/brands")
    Object shopSearchBrands(@Body ShopSearchBrandsRequest shopSearchBrandsRequest, Continuation<? super ApiResult<ShopSearchBrandsResponse>> continuation);

    @POST("/cash-app/shop/search/products/filters")
    Object shopSearchProductFilters(@Body ShopSearchProductFiltersRequest shopSearchProductFiltersRequest, Continuation<? super ApiResult<ShopSearchProductFiltersResponse>> continuation);

    @POST("/cash-app/shop/search/products")
    Object shopSearchProducts(@Body ShopSearchProductsRequest shopSearchProductsRequest, Continuation<? super ApiResult<ShopSearchProductsResponse>> continuation);
}
