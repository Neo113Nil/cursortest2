package com.onesignal.inAppMessages.internal.display.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WebViewManager.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.inAppMessages.internal.display.impl.WebViewManager", f = "WebViewManager.kt", i = {0, 0, 0}, l = {371}, m = "setupWebView", n = {"this", "currentActivity", "base64Message"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
final class WebViewManager$setupWebView$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WebViewManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebViewManager$setupWebView$1(WebViewManager webViewManager, Continuation<? super WebViewManager$setupWebView$1> continuation) {
        super(continuation);
        this.this$0 = webViewManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.setupWebView(null, null, false, this);
    }
}
