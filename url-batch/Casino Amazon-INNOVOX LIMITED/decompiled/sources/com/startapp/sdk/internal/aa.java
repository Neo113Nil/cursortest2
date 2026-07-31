package com.startapp.sdk.internal;

import android.webkit.WebView;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class aa implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ da f168a;

    public aa(da daVar) {
        this.f168a = daVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView = this.f168a.t;
        if (webView != null) {
            webView.onPause();
        }
    }
}
