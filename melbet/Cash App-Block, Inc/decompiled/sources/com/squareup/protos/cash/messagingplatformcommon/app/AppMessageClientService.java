package com.squareup.protos.cash.messagingplatformcommon.app;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000fJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0012H§@¢\u0006\u0002\u0010\u0013J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0016H§@¢\u0006\u0002\u0010\u0017J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u001aH§@¢\u0006\u0002\u0010\u001bJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u001eH§@¢\u0006\u0002\u0010\u001f¨\u0006 À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/messagingplatformcommon/app/AppMessageClientService;", "", "getAppMessages", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/messagingplatformcommon/app/GetAppMessagesResponse;", "request", "Lcom/squareup/protos/cash/messagingplatformcommon/app/GetAppMessagesRequest;", "(Lcom/squareup/protos/cash/messagingplatformcommon/app/GetAppMessagesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAppMessageByTemplateToken", "Lcom/squareup/protos/cash/messagingplatformcommon/app/GetAppMessageByTemplateTokenResponse;", "Lcom/squareup/protos/cash/messagingplatformcommon/app/GetAppMessageByTemplateTokenRequest;", "(Lcom/squareup/protos/cash/messagingplatformcommon/app/GetAppMessageByTemplateTokenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportAppMessageView", "Lcom/squareup/protos/cash/messagingplatformcommon/app/ReportAppMessageViewResponse;", "Lcom/squareup/protos/cash/messagingplatformcommon/app/ReportAppMessageViewRequest;", "(Lcom/squareup/protos/cash/messagingplatformcommon/app/ReportAppMessageViewRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportAppMessageAction", "Lcom/squareup/protos/cash/messagingplatformcommon/app/ReportAppMessageActionResponse;", "Lcom/squareup/protos/cash/messagingplatformcommon/app/ReportAppMessageActionRequest;", "(Lcom/squareup/protos/cash/messagingplatformcommon/app/ReportAppMessageActionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAppMessagesV2", "Lcom/squareup/protos/cash/messagingplatformcommon/app/GetAppMessagesV2Response;", "Lcom/squareup/protos/cash/messagingplatformcommon/app/GetAppMessagesV2Request;", "(Lcom/squareup/protos/cash/messagingplatformcommon/app/GetAppMessagesV2Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportAppMessageDelivered", "Lcom/squareup/protos/cash/messagingplatformcommon/app/ReportAppMessageDeliveredResponse;", "Lcom/squareup/protos/cash/messagingplatformcommon/app/ReportAppMessageDeliveredRequest;", "(Lcom/squareup/protos/cash/messagingplatformcommon/app/ReportAppMessageDeliveredRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDetailsPage", "Lcom/squareup/protos/cash/messagingplatformcommon/app/GetDetailsPageResponse;", "Lcom/squareup/protos/cash/messagingplatformcommon/app/GetDetailsPageRequest;", "(Lcom/squareup/protos/cash/messagingplatformcommon/app/GetDetailsPageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AppMessageClientService {
    @POST("/cash-app/app-messages/get-app-message-by-template-token")
    Object getAppMessageByTemplateToken(@Body GetAppMessageByTemplateTokenRequest getAppMessageByTemplateTokenRequest, Continuation<? super ApiResult<GetAppMessageByTemplateTokenResponse>> continuation);

    @POST("/cash-app/app-messages/get-app-messages")
    Object getAppMessages(@Body GetAppMessagesRequest getAppMessagesRequest, Continuation<? super ApiResult<GetAppMessagesResponse>> continuation);

    @POST("/cash-app/app-messages/get-app-messages-v2")
    Object getAppMessagesV2(@Body GetAppMessagesV2Request getAppMessagesV2Request, Continuation<? super ApiResult<GetAppMessagesV2Response>> continuation);

    @POST("/cash-app/app-messages/get-details-page")
    Object getDetailsPage(@Body GetDetailsPageRequest getDetailsPageRequest, Continuation<? super ApiResult<GetDetailsPageResponse>> continuation);

    @POST("/cash-app/app-messages/report-app-message-action")
    Object reportAppMessageAction(@Body ReportAppMessageActionRequest reportAppMessageActionRequest, Continuation<? super ApiResult<ReportAppMessageActionResponse>> continuation);

    @POST("/cash-app/app-messages/report-app-message-delivered")
    Object reportAppMessageDelivered(@Body ReportAppMessageDeliveredRequest reportAppMessageDeliveredRequest, Continuation<? super ApiResult<ReportAppMessageDeliveredResponse>> continuation);

    @POST("/cash-app/app-messages/report-app-message-view")
    Object reportAppMessageView(@Body ReportAppMessageViewRequest reportAppMessageViewRequest, Continuation<? super ApiResult<ReportAppMessageViewResponse>> continuation);
}
