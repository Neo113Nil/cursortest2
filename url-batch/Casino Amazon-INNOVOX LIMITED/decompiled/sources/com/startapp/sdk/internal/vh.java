package com.startapp.sdk.internal;

import android.webkit.WebView;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class vh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f471a;

    public vh(WebView webView) {
        this.f471a = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f471a.destroy();
        } catch (Throwable unused) {
        }
    }
}
