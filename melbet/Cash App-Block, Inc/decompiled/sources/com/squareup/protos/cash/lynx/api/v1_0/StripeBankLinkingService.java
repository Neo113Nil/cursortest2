package com.squareup.protos.cash.lynx.api.v1_0;

import app.cash.api.ApiResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\fH§@¢\u0006\u0002\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/squareup/protos/cash/lynx/api/v1_0/StripeBankLinkingService;", "", "createStripeLinkToken", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/lynx/api/v1_0/InitiateStripeLinkResponse;", "flowToken", "", "request", "Lcom/squareup/protos/cash/lynx/api/v1_0/InitiateStripeLinkRequest;", "(Ljava/lang/String;Lcom/squareup/protos/cash/lynx/api/v1_0/InitiateStripeLinkRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "completeStripeLink", "Lcom/squareup/protos/cash/lynx/api/v1_0/CompleteStripeLinkResponse;", "Lcom/squareup/protos/cash/lynx/api/v1_0/CompleteStripeLinkRequest;", "(Ljava/lang/String;Lcom/squareup/protos/cash/lynx/api/v1_0/CompleteStripeLinkRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface StripeBankLinkingService {
    @POST("/cash-app/instrument-link/v1.0/complete-stripe-link")
    Object completeStripeLink(@Header("Cash-Flow-Token") String str, @Body CompleteStripeLinkRequest completeStripeLinkRequest, Continuation<? super ApiResult<CompleteStripeLinkResponse>> continuation);

    @POST("/cash-app/instrument-link/v1.0/initiate-stripe-link")
    Object createStripeLinkToken(@Header("Cash-Flow-Token") String str, @Body InitiateStripeLinkRequest initiateStripeLinkRequest, Continuation<? super ApiResult<InitiateStripeLinkResponse>> continuation);
}
