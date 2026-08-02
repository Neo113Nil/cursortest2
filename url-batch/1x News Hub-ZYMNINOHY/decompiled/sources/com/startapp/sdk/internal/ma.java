package com.startapp.sdk.internal;

import android.webkit.WebView;

/* loaded from: classes.dex */
public final class ma implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wa f4144a;

    public ma(wa waVar) {
        this.f4144a = waVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wa waVar = this.f4144a;
        waVar.f4689y = true;
        WebView webView = waVar.f4685t;
        if (webView != null) {
            webView.setOnTouchListener(null);
        }
    }
}
