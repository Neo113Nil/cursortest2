package com.startapp.sdk.internal;

import android.webkit.WebView;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class t9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ da f437a;

    public t9(da daVar) {
        this.f437a = daVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        da daVar = this.f437a;
        daVar.y = true;
        WebView webView = daVar.t;
        if (webView != null) {
            webView.setOnTouchListener(null);
        }
    }
}
