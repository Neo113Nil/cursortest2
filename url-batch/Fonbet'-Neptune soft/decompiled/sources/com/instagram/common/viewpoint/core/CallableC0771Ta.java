package com.instagram.common.viewpoint.core;

import android.webkit.WebView;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Ta, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class CallableC0771Ta implements Callable<String> {
    public final /* synthetic */ SQ A00;

    public CallableC0771Ta(SQ sq) {
        this.A00 = sq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final String call() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        atomicReference = AbstractC0772Tb.A04;
        String browserUserAgent = (String) atomicReference.get();
        if (browserUserAgent != null) {
            return browserUserAgent;
        }
        WebView webView = new WebView(this.A00.getApplicationContext());
        webView.setWebViewClient(new TZ(this));
        String userAgentString = webView.getSettings().getUserAgentString();
        webView.destroy();
        if (userAgentString != null) {
            atomicReference2 = AbstractC0772Tb.A04;
            atomicReference2.set(userAgentString);
        }
        return userAgentString;
    }
}
