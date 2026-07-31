package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.WebView;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.inappbrowser.AnimatingProgressBar;
import com.startapp.sdk.inappbrowser.NavigationBarLayout;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class e8 extends tj {

    /* renamed from: a, reason: collision with root package name */
    public final Context f224a;
    public final f8 b;
    public final NavigationBarLayout c;
    public final AnimatingProgressBar d;
    public int e = 0;
    public boolean f = false;

    public e8(OverlayActivity overlayActivity, NavigationBarLayout navigationBarLayout, AnimatingProgressBar animatingProgressBar, f8 f8Var) {
        this.f224a = overlayActivity;
        this.d = animatingProgressBar;
        this.c = navigationBarLayout;
        this.b = f8Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (f8.z) {
            return;
        }
        this.c.a(webView);
        int i = this.e - 1;
        this.e = i;
        if (i == 0) {
            this.f = false;
            this.d.a();
            if (this.d.isShown()) {
                this.d.setVisibility(8);
            }
            this.c.a(webView);
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (f8.z) {
            return;
        }
        if (this.f) {
            this.e = 1;
            this.d.a();
            this.c.a(webView);
        } else {
            this.e = Math.max(this.e, 1);
        }
        this.d.setVisibility(0);
        this.c.b().setText(str);
        this.c.a(webView);
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.d.a();
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView != null && str != null && !zh.c(webView.getContext(), str) && !f8.z) {
            if (!this.f) {
                this.f = true;
                this.d.a();
                this.e = 0;
            }
            this.e++;
            if (e0.b(str) && !e0.a(str)) {
                return false;
            }
            this.e = 1;
            e0.b(this.f224a, str);
            f8 f8Var = this.b;
            if (f8Var != null) {
                f8Var.i();
            }
        }
        return true;
    }
}
