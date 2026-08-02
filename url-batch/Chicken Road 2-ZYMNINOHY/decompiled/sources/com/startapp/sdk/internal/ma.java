package com.startapp.sdk.internal;

import android.webkit.WebView;

/* loaded from: classes.dex */
public final class ma implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wa f7272a;

    public ma(wa waVar) {
        this.f7272a = waVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wa waVar = this.f7272a;
        waVar.f7834y = true;
        WebView webView = waVar.f7830t;
        if (webView != null) {
            webView.setOnTouchListener(null);
        }
    }
}
