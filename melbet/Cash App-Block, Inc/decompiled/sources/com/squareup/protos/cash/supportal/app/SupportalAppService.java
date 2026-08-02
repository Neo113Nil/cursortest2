package com.squareup.protos.cash.supportal.app;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0003\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0014\u0010\u0015J,\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001aH§@¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001eH§@¢\u0006\u0004\b \u0010!J \u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\"H§@¢\u0006\u0004\b$\u0010%J \u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00042\b\b\u0001\u0010\u0003\u001a\u00020&H§@¢\u0006\u0004\b(\u0010)¨\u0006*À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/supportal/app/SupportalAppService;", "", "Lcom/squareup/protos/cash/supportal/app/GetChatMessagesRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/supportal/app/GetChatMessagesResponse;", "getChatMessages", "(Lcom/squareup/protos/cash/supportal/app/GetChatMessagesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "flowToken", "Lcom/squareup/protos/cash/supportal/app/OpenChatRequest;", "Lcom/squareup/protos/cash/supportal/app/OpenChatResponse;", "openChat", "(Ljava/lang/String;Lcom/squareup/protos/cash/supportal/app/OpenChatRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/supportal/app/SendUserTypingRequest;", "Lcom/squareup/protos/cash/supportal/app/SendUserTypingResponse;", "sendUserTyping", "(Lcom/squareup/protos/cash/supportal/app/SendUserTypingRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/supportal/app/SendChatMessagesRequest;", "Lcom/squareup/protos/cash/supportal/app/SendChatMessagesResponse;", "sendChatMessages", "(Ljava/lang/String;Lcom/squareup/protos/cash/supportal/app/SendChatMessagesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/supportal/app/EndChatRequest;", "Lcom/squareup/protos/cash/supportal/app/EndChatResponse;", "endChat", "(Ljava/lang/String;Lcom/squareup/protos/cash/supportal/app/EndChatRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/supportal/app/SupportPhoneStatusRequest;", "Lcom/squareup/protos/cash/supportal/app/SupportPhoneStatusResponse;", "supportPhoneStatus", "(Lcom/squareup/protos/cash/supportal/app/SupportPhoneStatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/supportal/app/CancelOutboundPhoneRequest;", "Lcom/squareup/protos/cash/supportal/app/CancelOutboundPhoneResponse;", "cancelOutboundPhone", "(Lcom/squareup/protos/cash/supportal/app/CancelOutboundPhoneRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/supportal/app/SupportChatStatusRequest;", "Lcom/squareup/protos/cash/supportal/app/SupportChatStatusResponse;", "supportChatStatus", "(Lcom/squareup/protos/cash/supportal/app/SupportChatStatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/supportal/app/ValidateEmailRequest;", "Lcom/squareup/protos/cash/supportal/app/ValidateEmailResponse;", "validateEmailAddress", "(Lcom/squareup/protos/cash/supportal/app/ValidateEmailRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SupportalAppService {
    @POST("/cash-app/support-phone/cancel")
    Object cancelOutboundPhone(@Body CancelOutboundPhoneRequest cancelOutboundPhoneRequest, Continuation<? super ApiResult<CancelOutboundPhoneResponse>> continuation);

    @POST("/cash-app/support-chat/end-chat")
    Object endChat(@Header("Cash-Flow-Token") String str, @Body EndChatRequest endChatRequest, Continuation<? super ApiResult<EndChatResponse>> continuation);

    @POST("/cash-app/support-chat/get-chat-messages")
    Object getChatMessages(@Body GetChatMessagesRequest getChatMessagesRequest, Continuation<? super ApiResult<GetChatMessagesResponse>> continuation);

    @POST("/cash-app/support-chat/open-chat")
    Object openChat(@Header("Cash-Flow-Token") String str, @Body OpenChatRequest openChatRequest, Continuation<? super ApiResult<OpenChatResponse>> continuation);

    @POST("/cash-app/support-chat/send-chat-messages")
    Object sendChatMessages(@Header("Cash-Flow-Token") String str, @Body SendChatMessagesRequest sendChatMessagesRequest, Continuation<? super ApiResult<SendChatMessagesResponse>> continuation);

    @POST("/cash-app/support-chat/send-user-typing")
    Object sendUserTyping(@Body SendUserTypingRequest sendUserTypingRequest, Continuation<? super ApiResult<SendUserTypingResponse>> continuation);

    @POST("/cash-app/support-chat/support-chat-status")
    Object supportChatStatus(@Body SupportChatStatusRequest supportChatStatusRequest, Continuation<? super ApiResult<SupportChatStatusResponse>> continuation);

    @POST("/cash-app/support-phone/status")
    Object supportPhoneStatus(@Body SupportPhoneStatusRequest supportPhoneStatusRequest, Continuation<? super ApiResult<SupportPhoneStatusResponse>> continuation);

    @POST("/cash-app/support-flow/validate-email")
    Object validateEmailAddress(@Body ValidateEmailRequest validateEmailRequest, Continuation<? super ApiResult<ValidateEmailResponse>> continuation);
}
