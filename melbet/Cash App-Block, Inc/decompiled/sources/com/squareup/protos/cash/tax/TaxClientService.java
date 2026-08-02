package com.squareup.protos.cash.tax;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/tax/TaxClientService;", "", "openTax", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/tax/OpenTaxResponse;", "request", "Lcom/squareup/protos/cash/tax/OpenTaxRequest;", "(Lcom/squareup/protos/cash/tax/OpenTaxRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openTaxHub", "Lcom/squareup/protos/cash/tax/OpenTaxHubResponse;", "Lcom/squareup/protos/cash/tax/OpenTaxHubRequest;", "(Lcom/squareup/protos/cash/tax/OpenTaxHubRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openTaxDeepLink", "Lcom/squareup/protos/cash/tax/TaxDeepLinkResponse;", "Lcom/squareup/protos/cash/tax/TaxDeepLinkRequest;", "(Lcom/squareup/protos/cash/tax/TaxDeepLinkRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface TaxClientService {
    @POST("cash-app/tax/1.0/open-tax")
    Object openTax(@Body OpenTaxRequest openTaxRequest, Continuation<? super ApiResult<OpenTaxResponse>> continuation);

    @POST("/cash-app/tax/1.0/view-tax-deep-link")
    Object openTaxDeepLink(@Body TaxDeepLinkRequest taxDeepLinkRequest, Continuation<? super ApiResult<TaxDeepLinkResponse>> continuation);

    @POST("cash-app/tax/1.0/view-tax-hub")
    Object openTaxHub(@Body OpenTaxHubRequest openTaxHubRequest, Continuation<? super ApiResult<OpenTaxHubResponse>> continuation);
}
