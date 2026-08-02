package com.squareup.protos.cash.local.client.v1;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001fH§@¢\u0006\u0004\b!\u0010\"J \u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00042\b\b\u0001\u0010\u0003\u001a\u00020#H§@¢\u0006\u0004\b%\u0010&J \u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00042\b\b\u0001\u0010\u0003\u001a\u00020'H§@¢\u0006\u0004\b)\u0010*J \u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00042\b\b\u0001\u0010\u0003\u001a\u00020+H§@¢\u0006\u0004\b-\u0010.J \u00101\u001a\b\u0012\u0004\u0012\u0002000\u00042\b\b\u0001\u0010\u0003\u001a\u00020/H§@¢\u0006\u0004\b1\u00102J \u00105\u001a\b\u0012\u0004\u0012\u0002040\u00042\b\b\u0001\u0010\u0003\u001a\u000203H§@¢\u0006\u0004\b5\u00106J \u00109\u001a\b\u0012\u0004\u0012\u0002080\u00042\b\b\u0001\u0010\u0003\u001a\u000207H§@¢\u0006\u0004\b9\u0010:J \u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00042\b\b\u0001\u0010\u0003\u001a\u00020;H§@¢\u0006\u0004\b=\u0010>J \u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u00042\b\b\u0001\u0010\u0003\u001a\u00020?H§@¢\u0006\u0004\bA\u0010BJ \u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u00042\b\b\u0001\u0010\u0003\u001a\u00020CH§@¢\u0006\u0004\bE\u0010FJ \u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u00042\b\b\u0001\u0010\u0003\u001a\u00020GH§@¢\u0006\u0004\bI\u0010JJ \u0010M\u001a\b\u0012\u0004\u0012\u00020L0\u00042\b\b\u0001\u0010\u0003\u001a\u00020KH§@¢\u0006\u0004\bM\u0010N¨\u0006OÀ\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/CashAppLocalClientService;", "", "Lcom/squareup/protos/cash/local/client/v1/GetDeliveryQuoteRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/local/client/v1/GetDeliveryQuoteResponse;", "getDeliveryQuote", "(Lcom/squareup/protos/cash/local/client/v1/GetDeliveryQuoteRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/local/client/v1/BatchGetLocationStatusRequest;", "Lcom/squareup/protos/cash/local/client/v1/BatchGetLocationStatusResponse;", "batchGetLocationStatus", "(Lcom/squareup/protos/cash/local/client/v1/BatchGetLocationStatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/local/client/v1/CreateCartRequest;", "Lcom/squareup/protos/cash/local/client/v1/CreateCartResponse;", "createCart", "(Lcom/squareup/protos/cash/local/client/v1/CreateCartRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/local/client/v1/GetCartRequest;", "getCart", "(Lcom/squareup/protos/cash/local/client/v1/GetCartRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/local/client/v1/UpdateCartRequest;", "Lcom/squareup/protos/cash/local/client/v1/UpdateCartResponse;", "updateCart", "(Lcom/squareup/protos/cash/local/client/v1/UpdateCartRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/local/client/v1/AddRoundToTabRequest;", "Lcom/squareup/protos/cash/local/client/v1/AddRoundToTabResponse;", "addRoundToTab", "(Lcom/squareup/protos/cash/local/client/v1/AddRoundToTabRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/local/client/v1/GetOrderRequest;", "Lcom/squareup/protos/cash/local/client/v1/GetOrderResponse;", "getOrder", "(Lcom/squareup/protos/cash/local/client/v1/GetOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/local/client/v1/GetActiveOrdersRequest;", "Lcom/squareup/protos/cash/local/client/v1/GetActiveOrdersResponse;", "getActiveOrders", "(Lcom/squareup/protos/cash/local/client/v1/GetActiveOrdersRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/local/client/v1/GetBrandProfileRequest;", "Lcom/squareup/protos/cash/local/client/v1/GetBrandProfileResponse;", "getBrandProfile", "(Lcom/squareup/protos/cash/local/client/v1/GetBrandProfileRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/local/client/v1/GetEditorialRequest;", "Lcom/squareup/protos/cash/local/client/v1/GetEditorialResponse;", "getEditorial", "(Lcom/squareup/protos/cash/local/client/v1/GetEditorialRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/local/client/v1/GetBuyerInfoRequest;", "Lcom/squareup/protos/cash/local/client/v1/GetBuyerInfoResponse;", "getBuyerInfo", "(Lcom/squareup/protos/cash/local/client/v1/GetBuyerInfoRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/local/client/v1/GetFulfillmentSchedulingQuoteRequest;", "Lcom/squareup/protos/cash/local/client/v1/GetFulfillmentSchedulingQuoteResponse;", "getFulfillmentSchedulingQuote", "(Lcom/squareup/protos/cash/local/client/v1/GetFulfillmentSchedulingQuoteRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/local/client/v1/GetSuggestedReordersRequest;", "Lcom/squareup/protos/cash/local/client/v1/GetSuggestedReordersResponse;", "getSuggestedReorders", "(Lcom/squareup/protos/cash/local/client/v1/GetSuggestedReordersRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/local/client/v1/CalculateLineItemsRequest;", "Lcom/squareup/protos/cash/local/client/v1/CalculateLineItemsResponse;", "calculateLineItems", "(Lcom/squareup/protos/cash/local/client/v1/CalculateLineItemsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/local/client/v1/UpdateUserIntentRequest;", "Lcom/squareup/protos/cash/local/client/v1/UpdateUserIntentResponse;", "updateUserIntent", "(Lcom/squareup/protos/cash/local/client/v1/UpdateUserIntentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/local/client/v1/GetMarketingCouponOfferDetailsRequest;", "Lcom/squareup/protos/cash/local/client/v1/GetMarketingCouponOfferDetailsResponse;", "getMarketingCouponOfferDetails", "(Lcom/squareup/protos/cash/local/client/v1/GetMarketingCouponOfferDetailsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/local/client/v1/GetNeighborhoodsTabContentRequest;", "Lcom/squareup/protos/cash/local/client/v1/GetNeighborhoodsTabContentResponse;", "getNeighborhoodsTabContent", "(Lcom/squareup/protos/cash/local/client/v1/GetNeighborhoodsTabContentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/local/client/v1/GetBrandCollectionRequest;", "Lcom/squareup/protos/cash/local/client/v1/GetBrandCollectionResponse;", "getBrandCollection", "(Lcom/squareup/protos/cash/local/client/v1/GetBrandCollectionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/local/client/v1/ConfirmArrivalRequest;", "Lcom/squareup/protos/cash/local/client/v1/ConfirmArrivalResponse;", "confirmArrival", "(Lcom/squareup/protos/cash/local/client/v1/ConfirmArrivalRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CashAppLocalClientService {
    @POST("/cash-app/local/cart/add-round")
    Object addRoundToTab(@Body AddRoundToTabRequest addRoundToTabRequest, Continuation<? super ApiResult<AddRoundToTabResponse>> continuation);

    @POST("/cash-app/local/locations")
    Object batchGetLocationStatus(@Body BatchGetLocationStatusRequest batchGetLocationStatusRequest, Continuation<? super ApiResult<BatchGetLocationStatusResponse>> continuation);

    @POST("/cash-app/local/calculate-line-items")
    Object calculateLineItems(@Body CalculateLineItemsRequest calculateLineItemsRequest, Continuation<? super ApiResult<CalculateLineItemsResponse>> continuation);

    @POST("/cash-app/local/order/confirm-arrival")
    Object confirmArrival(@Body ConfirmArrivalRequest confirmArrivalRequest, Continuation<? super ApiResult<ConfirmArrivalResponse>> continuation);

    @POST("/cash-app/local/cart")
    Object createCart(@Body CreateCartRequest createCartRequest, Continuation<? super ApiResult<CreateCartResponse>> continuation);

    @POST("/cash-app/local/orders/active")
    Object getActiveOrders(@Body GetActiveOrdersRequest getActiveOrdersRequest, Continuation<? super ApiResult<GetActiveOrdersResponse>> continuation);

    @POST("/cash-app/local/brand-collection")
    Object getBrandCollection(@Body GetBrandCollectionRequest getBrandCollectionRequest, Continuation<? super ApiResult<GetBrandCollectionResponse>> continuation);

    @POST("/cash-app/local/profile/brand")
    Object getBrandProfile(@Body GetBrandProfileRequest getBrandProfileRequest, Continuation<? super ApiResult<GetBrandProfileResponse>> continuation);

    @POST("/cash-app/local/profile/buyer")
    Object getBuyerInfo(@Body GetBuyerInfoRequest getBuyerInfoRequest, Continuation<? super ApiResult<GetBuyerInfoResponse>> continuation);

    @POST("/cash-app/local/cart/get")
    Object getCart(@Body GetCartRequest getCartRequest, Continuation<? super ApiResult<CreateCartResponse>> continuation);

    @POST("/cash-app/local/get-delivery-quote")
    Object getDeliveryQuote(@Body GetDeliveryQuoteRequest getDeliveryQuoteRequest, Continuation<? super ApiResult<GetDeliveryQuoteResponse>> continuation);

    @POST("/cash-app/local/editorial")
    Object getEditorial(@Body GetEditorialRequest getEditorialRequest, Continuation<? super ApiResult<GetEditorialResponse>> continuation);

    @POST("/cash-app/local/get-fulfillment-scheduling-quote")
    Object getFulfillmentSchedulingQuote(@Body GetFulfillmentSchedulingQuoteRequest getFulfillmentSchedulingQuoteRequest, Continuation<? super ApiResult<GetFulfillmentSchedulingQuoteResponse>> continuation);

    @POST("/cash-app/local/coupon-offer-details")
    Object getMarketingCouponOfferDetails(@Body GetMarketingCouponOfferDetailsRequest getMarketingCouponOfferDetailsRequest, Continuation<? super ApiResult<GetMarketingCouponOfferDetailsResponse>> continuation);

    @POST("/cash-app/local/neighborhoods-tab-content")
    Object getNeighborhoodsTabContent(@Body GetNeighborhoodsTabContentRequest getNeighborhoodsTabContentRequest, Continuation<? super ApiResult<GetNeighborhoodsTabContentResponse>> continuation);

    @POST("/cash-app/local/order/get")
    Object getOrder(@Body GetOrderRequest getOrderRequest, Continuation<? super ApiResult<GetOrderResponse>> continuation);

    @POST("/cash-app/local/get-suggested-reorders")
    Object getSuggestedReorders(@Body GetSuggestedReordersRequest getSuggestedReordersRequest, Continuation<? super ApiResult<GetSuggestedReordersResponse>> continuation);

    @POST("/cash-app/local/cart/update")
    Object updateCart(@Body UpdateCartRequest updateCartRequest, Continuation<? super ApiResult<UpdateCartResponse>> continuation);

    @POST("/cash-app/local/user-intent/update")
    Object updateUserIntent(@Body UpdateUserIntentRequest updateUserIntentRequest, Continuation<? super ApiResult<UpdateUserIntentResponse>> continuation);
}
