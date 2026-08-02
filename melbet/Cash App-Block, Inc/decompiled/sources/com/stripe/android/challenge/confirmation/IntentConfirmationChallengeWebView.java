package com.stripe.android.challenge.confirmation;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* loaded from: classes8.dex */
public class IntentConfirmationChallengeWebView extends WebView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntentConfirmationChallengeWebView(Context context) {
        super(context);
        context.getClass();
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
    }
}
