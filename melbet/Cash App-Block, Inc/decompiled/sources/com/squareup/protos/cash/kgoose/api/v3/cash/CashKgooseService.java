package com.squareup.protos.cash.kgoose.api.v3.cash;

import app.cash.api.ApiResult;
import com.squareup.protos.cash.kgoose.api.v3.CancelLastUserMessageRequest;
import com.squareup.protos.cash.kgoose.api.v3.CancelLastUserMessageResponse;
import com.squareup.protos.cash.kgoose.api.v3.DeleteUserSessionRequest;
import com.squareup.protos.cash.kgoose.api.v3.DeleteUserSessionResponse;
import com.squareup.protos.cash.kgoose.api.v3.GetInChatPromptsRequest;
import com.squareup.protos.cash.kgoose.api.v3.GetInChatPromptsResponse;
import com.squareup.protos.cash.kgoose.api.v3.GetMessagesRequest;
import com.squareup.protos.cash.kgoose.api.v3.GetMessagesResponse;
import com.squareup.protos.cash.kgoose.api.v3.GetPresignedUrlRequest;
import com.squareup.protos.cash.kgoose.api.v3.GetPresignedUrlResponse;
import com.squareup.protos.cash.kgoose.api.v3.GetRuntimeMetadataRequest;
import com.squareup.protos.cash.kgoose.api.v3.GetRuntimeMetadataResponse;
import com.squareup.protos.cash.kgoose.api.v3.GetUserSessionsRequest;
import com.squareup.protos.cash.kgoose.api.v3.GetUserSessionsResponse;
import com.squareup.protos.cash.kgoose.api.v3.PushMessagesRequest;
import com.squareup.protos.cash.kgoose.api.v3.PushMessagesResponse;
import com.squareup.protos.cash.kgoose.api.v3.UpdateInChatPromptRequest;
import com.squareup.protos.cash.kgoose.api.v3.UpdateInChatPromptResponse;
import com.squareup.protos.cash.kgoose.api.v3.UpdateSuggestionRequest;
import com.squareup.protos.cash.kgoose.api.v3.UpdateSuggestionResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00042\b\b\u0001\u0010\u0003\u001a\u00020 H§@¢\u0006\u0004\b\"\u0010#J \u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00042\b\b\u0001\u0010\u0003\u001a\u00020$H§@¢\u0006\u0004\b&\u0010'J \u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00042\b\b\u0001\u0010\u0003\u001a\u00020(H§@¢\u0006\u0004\b*\u0010+J \u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00042\b\b\u0001\u0010\u0003\u001a\u00020,H§@¢\u0006\u0004\b.\u0010/¨\u00060À\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/cash/CashKgooseService;", "", "Lcom/squareup/protos/cash/kgoose/api/v3/PushMessagesRequest;", "request", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/kgoose/api/v3/PushMessagesResponse;", "pushMessages", "(Lcom/squareup/protos/cash/kgoose/api/v3/PushMessagesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesRequest;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesResponse;", "getMessages", "(Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/kgoose/api/v3/CancelLastUserMessageRequest;", "Lcom/squareup/protos/cash/kgoose/api/v3/CancelLastUserMessageResponse;", "cancelLastUserMessage", "(Lcom/squareup/protos/cash/kgoose/api/v3/CancelLastUserMessageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetUserSessionsRequest;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetUserSessionsResponse;", "getUserSessions", "(Lcom/squareup/protos/cash/kgoose/api/v3/GetUserSessionsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/kgoose/api/v3/DeleteUserSessionRequest;", "Lcom/squareup/protos/cash/kgoose/api/v3/DeleteUserSessionResponse;", "deleteUserSession", "(Lcom/squareup/protos/cash/kgoose/api/v3/DeleteUserSessionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/kgoose/api/v3/UpdateSuggestionRequest;", "Lcom/squareup/protos/cash/kgoose/api/v3/UpdateSuggestionResponse;", "updateSuggestion", "(Lcom/squareup/protos/cash/kgoose/api/v3/UpdateSuggestionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetRuntimeMetadataRequest;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetRuntimeMetadataResponse;", "getRuntimeMetadata", "(Lcom/squareup/protos/cash/kgoose/api/v3/GetRuntimeMetadataRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetPresignedUrlRequest;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetPresignedUrlResponse;", "getPresignedUrl", "(Lcom/squareup/protos/cash/kgoose/api/v3/GetPresignedUrlRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetInChatPromptsRequest;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetInChatPromptsResponse;", "getInChatPrompts", "(Lcom/squareup/protos/cash/kgoose/api/v3/GetInChatPromptsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/kgoose/api/v3/UpdateInChatPromptRequest;", "Lcom/squareup/protos/cash/kgoose/api/v3/UpdateInChatPromptResponse;", "updateInChatPrompt", "(Lcom/squareup/protos/cash/kgoose/api/v3/UpdateInChatPromptRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/protos/cash/kgoose/api/v3/cash/SubmitFeedbackRequest;", "Lcom/squareup/protos/cash/kgoose/api/v3/cash/SubmitFeedbackResponse;", "submitFeedback", "(Lcom/squareup/protos/cash/kgoose/api/v3/cash/SubmitFeedbackRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CashKgooseService {
    @POST("/cash-app/goose-cash/v3/cancel-last-user-message")
    Object cancelLastUserMessage(@Body CancelLastUserMessageRequest cancelLastUserMessageRequest, Continuation<? super ApiResult<CancelLastUserMessageResponse>> continuation);

    @POST("/cash-app/goose-cash/v3/delete-user-session")
    Object deleteUserSession(@Body DeleteUserSessionRequest deleteUserSessionRequest, Continuation<? super ApiResult<DeleteUserSessionResponse>> continuation);

    @POST("/cash-app/goose-cash/v3/get-inchat-prompts")
    Object getInChatPrompts(@Body GetInChatPromptsRequest getInChatPromptsRequest, Continuation<? super ApiResult<GetInChatPromptsResponse>> continuation);

    @POST("/cash-app/goose-cash/v3/get-messages")
    Object getMessages(@Body GetMessagesRequest getMessagesRequest, Continuation<? super ApiResult<GetMessagesResponse>> continuation);

    @POST("/cash-app/goose-cash/v3/get-presigned-url")
    Object getPresignedUrl(@Body GetPresignedUrlRequest getPresignedUrlRequest, Continuation<? super ApiResult<GetPresignedUrlResponse>> continuation);

    @POST("/cash-app/goose-cash/v3/get-runtime-metadata")
    Object getRuntimeMetadata(@Body GetRuntimeMetadataRequest getRuntimeMetadataRequest, Continuation<? super ApiResult<GetRuntimeMetadataResponse>> continuation);

    @POST("/cash-app/goose-cash/v3/get-user-sessions")
    Object getUserSessions(@Body GetUserSessionsRequest getUserSessionsRequest, Continuation<? super ApiResult<GetUserSessionsResponse>> continuation);

    @POST("/cash-app/goose-cash/v3/push-messages")
    Object pushMessages(@Body PushMessagesRequest pushMessagesRequest, Continuation<? super ApiResult<PushMessagesResponse>> continuation);

    @POST("/cash-app/goose-cash/v3/submit-feedback")
    Object submitFeedback(@Body SubmitFeedbackRequest submitFeedbackRequest, Continuation<? super ApiResult<SubmitFeedbackResponse>> continuation);

    @POST("/cash-app/goose-cash/v3/update-inchat-prompt")
    Object updateInChatPrompt(@Body UpdateInChatPromptRequest updateInChatPromptRequest, Continuation<? super ApiResult<UpdateInChatPromptResponse>> continuation);

    @POST("/cash-app/goose-cash/v3/update-suggestion")
    Object updateSuggestion(@Body UpdateSuggestionRequest updateSuggestionRequest, Continuation<? super ApiResult<UpdateSuggestionResponse>> continuation);
}
