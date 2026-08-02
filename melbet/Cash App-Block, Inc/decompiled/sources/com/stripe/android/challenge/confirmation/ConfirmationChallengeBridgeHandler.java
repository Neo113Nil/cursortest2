package com.stripe.android.challenge.confirmation;

import android.webkit.JavascriptInterface;

/* loaded from: classes8.dex */
public interface ConfirmationChallengeBridgeHandler {
    @JavascriptInterface
    String getInitParams();

    @JavascriptInterface
    void onError(String str);

    @JavascriptInterface
    void onReady();

    @JavascriptInterface
    void onSuccess(String str);
}
