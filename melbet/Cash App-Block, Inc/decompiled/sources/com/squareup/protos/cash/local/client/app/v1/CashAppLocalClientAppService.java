package com.squareup.protos.cash.local.client.app.v1;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u001aH§@¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u001eH§@¢\u0006\u0004\b \u0010!J \u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\"H§@¢\u0006\u0004\b$\u0010%J \u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00062\b\b\u0001\u0010\u0005\u001a\u00020&H§@¢\u0006\u0004\b(\u0010)J \u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00062\b\b\u0001\u0010\u0005\u001a\u00020*H§@¢\u0006\u0004\b,\u0010-J \u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00062\b\b\u0001\u0010\u0005\u001a\u00020.H§@¢\u0006\u0004\b0\u00101J \u00104\u001a\b\u0012\u0004\u0012\u0002030\u00062\b\b\u0001\u0010\u0005\u001a\u000202H§@¢\u0006\u0004\b4\u00105J \u00108\u001a\b\u0012\u0004\u0012\u0002070\u00062\b\b\u0001\u0010\u0005\u001a\u000206H§@¢\u0006\u0004\b8\u00109¨\u0006:À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/local/client/app/v1/CashAppLocalClientAppService;", "", "", "flowToken", "Lcom/squareup/protos/cash/local/client/app/v1/BulkAddBrandsRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/local/client/app/v1/BulkAddBrandsResponse;", "bulkAddBrands", "(Ljava/lang/String;Lcom/squareup/protos/cash/local/client/app/v1/BulkAddBrandsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/local/client/app/v1/BulkRemoveBrandsRequest;", "Lcom/squareup/protos/cash/local/client/app/v1/BulkRemoveBrandsResponse;", "bulkRemoveBrands", "(Ljava/lang/String;Lcom/squareup/protos/cash/local/client/app/v1/BulkRemoveBrandsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/local/client/app/v1/BulkUpdateBrandsRequest;", "Lcom/squareup/protos/cash/local/client/app/v1/BulkUpdateBrandsResponse;", "bulkUpdateBrands", "(Ljava/lang/String;Lcom/squareup/protos/cash/local/client/app/v1/BulkUpdateBrandsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/local/client/app/v1/CreateAppOrderRequest;", "Lcom/squareup/protos/cash/local/client/app/v1/CreateAppOrderResponse;", "createAppOrder", "(Ljava/lang/String;Lcom/squareup/protos/cash/local/client/app/v1/CreateAppOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/local/client/app/v1/GetAppShortlinkRequest;", "Lcom/squareup/protos/cash/local/client/app/v1/GetAppShortlinkResponse;", "getAppShortlink", "(Ljava/lang/String;Lcom/squareup/protos/cash/local/client/app/v1/GetAppShortlinkRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/local/client/app/v1/GetMarketScreenDataRequest;", "Lcom/squareup/protos/cash/local/client/app/v1/GetMarketScreenDataResponse;", "getMarketScreenData", "(Lcom/squareup/protos/cash/local/client/app/v1/GetMarketScreenDataRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/local/client/app/v1/GetLocalCashDetailRequest;", "Lcom/squareup/protos/cash/local/client/app/v1/GetLocalCashDetailResponse;", "getLocalCashDetail", "(Lcom/squareup/protos/cash/local/client/app/v1/GetLocalCashDetailRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/local/client/app/v1/ListMarketingMessagesRequest;", "Lcom/squareup/protos/cash/local/client/app/v1/ListMarketingMessagesResponse;", "listMarketingMessages", "(Lcom/squareup/protos/cash/local/client/app/v1/ListMarketingMessagesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/local/client/app/v1/GetMarketingMessageRequest;", "Lcom/squareup/protos/cash/local/client/app/v1/GetMarketingMessageResponse;", "getMarketingMessage", "(Lcom/squareup/protos/cash/local/client/app/v1/GetMarketingMessageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/local/client/app/v1/AbandonPOSCheckInRequest;", "Lcom/squareup/protos/cash/local/client/app/v1/AbandonPOSCheckInResponse;", "abandonPOSCheckIn", "(Lcom/squareup/protos/cash/local/client/app/v1/AbandonPOSCheckInRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/local/client/app/v1/ReportMarketingMessageViewedRequest;", "Lcom/squareup/protos/cash/local/client/app/v1/ReportMarketingMessageViewedResponse;", "reportMarketingMessageViewed", "(Lcom/squareup/protos/cash/local/client/app/v1/ReportMarketingMessageViewedRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/local/client/app/v1/GetStaffBrandDetailsRequest;", "Lcom/squareup/protos/cash/local/client/app/v1/GetStaffBrandDetailsResponse;", "getStaffBrandDetails", "(Lcom/squareup/protos/cash/local/client/app/v1/GetStaffBrandDetailsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/local/client/app/v1/UpdateEarningCardRequest;", "Lcom/squareup/protos/cash/local/client/app/v1/UpdateEarningCardResponse;", "updateEarningCard", "(Lcom/squareup/protos/cash/local/client/app/v1/UpdateEarningCardRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CashAppLocalClientAppService {
    @POST("/cash-app/local/abandon-pos-check-in")
    Object abandonPOSCheckIn(@Body AbandonPOSCheckInRequest abandonPOSCheckInRequest, Continuation<? super ApiResult<AbandonPOSCheckInResponse>> continuation);

    @POST("/cash-app/local/brands/add")
    Object bulkAddBrands(@Header("Cash-Flow-Token") String str, @Body BulkAddBrandsRequest bulkAddBrandsRequest, Continuation<? super ApiResult<BulkAddBrandsResponse>> continuation);

    @POST("/cash-app/local/brands/remove")
    Object bulkRemoveBrands(@Header("Cash-Flow-Token") String str, @Body BulkRemoveBrandsRequest bulkRemoveBrandsRequest, Continuation<? super ApiResult<BulkRemoveBrandsResponse>> continuation);

    @POST("/cash-app/local/brands/update")
    Object bulkUpdateBrands(@Header("Cash-Flow-Token") String str, @Body BulkUpdateBrandsRequest bulkUpdateBrandsRequest, Continuation<? super ApiResult<BulkUpdateBrandsResponse>> continuation);

    @POST("/cash-app/local/app/order")
    Object createAppOrder(@Header("Cash-Flow-Token") String str, @Body CreateAppOrderRequest createAppOrderRequest, Continuation<? super ApiResult<CreateAppOrderResponse>> continuation);

    @POST("/cash-app/local/app/shortlink")
    Object getAppShortlink(@Header("Cash-Flow-Token") String str, @Body GetAppShortlinkRequest getAppShortlinkRequest, Continuation<? super ApiResult<GetAppShortlinkResponse>> continuation);

    @POST("/cash-app/local/local-cash-detail")
    Object getLocalCashDetail(@Body GetLocalCashDetailRequest getLocalCashDetailRequest, Continuation<? super ApiResult<GetLocalCashDetailResponse>> continuation);

    @POST("/cash-app/local/market-screen")
    Object getMarketScreenData(@Body GetMarketScreenDataRequest getMarketScreenDataRequest, Continuation<? super ApiResult<GetMarketScreenDataResponse>> continuation);

    @POST("/cash-app/local/marketing-message")
    Object getMarketingMessage(@Body GetMarketingMessageRequest getMarketingMessageRequest, Continuation<? super ApiResult<GetMarketingMessageResponse>> continuation);

    @POST("/cash-app/local/staff/brand-details")
    Object getStaffBrandDetails(@Body GetStaffBrandDetailsRequest getStaffBrandDetailsRequest, Continuation<? super ApiResult<GetStaffBrandDetailsResponse>> continuation);

    @POST("/cash-app/local/marketing-messages")
    Object listMarketingMessages(@Body ListMarketingMessagesRequest listMarketingMessagesRequest, Continuation<? super ApiResult<ListMarketingMessagesResponse>> continuation);

    @POST("/cash-app/local/marketing-messages/viewed")
    Object reportMarketingMessageViewed(@Body ReportMarketingMessageViewedRequest reportMarketingMessageViewedRequest, Continuation<? super ApiResult<ReportMarketingMessageViewedResponse>> continuation);

    @POST("/cash-app/local/earning-card/update")
    Object updateEarningCard(@Body UpdateEarningCardRequest updateEarningCardRequest, Continuation<? super ApiResult<UpdateEarningCardResponse>> continuation);
}
