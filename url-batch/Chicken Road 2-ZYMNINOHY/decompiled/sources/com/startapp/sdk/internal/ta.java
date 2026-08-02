package com.startapp.sdk.internal;

import android.webkit.WebView;

/* loaded from: classes.dex */
public final class ta implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wa f7616a;

    public ta(wa waVar) {
        this.f7616a = waVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView = this.f7616a.f7830t;
        if (webView != null) {
            webView.onPause();
        }
    }
}
