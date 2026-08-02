package com.startapp.sdk.internal;

import android.graphics.Bitmap;
import android.webkit.WebView;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.inappbrowser.AnimatingProgressBar;
import com.startapp.sdk.inappbrowser.NavigationBarLayout;

/* loaded from: classes.dex */
public final class t8 extends qk {

    /* renamed from: a, reason: collision with root package name */
    public final OverlayActivity f7597a;

    /* renamed from: b, reason: collision with root package name */
    public final u8 f7598b;

    /* renamed from: c, reason: collision with root package name */
    public final NavigationBarLayout f7599c;

    /* renamed from: d, reason: collision with root package name */
    public final AnimatingProgressBar f7600d;

    /* renamed from: e, reason: collision with root package name */
    public int f7601e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7602f = false;

    public t8(OverlayActivity overlayActivity, NavigationBarLayout navigationBarLayout, AnimatingProgressBar animatingProgressBar, u8 u8Var) {
        this.f7597a = overlayActivity;
        this.f7600d = animatingProgressBar;
        this.f7599c = navigationBarLayout;
        this.f7598b = u8Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (u8.z) {
            return;
        }
        this.f7599c.a(webView);
        int i4 = this.f7601e - 1;
        this.f7601e = i4;
        if (i4 == 0) {
            this.f7602f = false;
            this.f7600d.a();
            if (this.f7600d.isShown()) {
                this.f7600d.setVisibility(8);
            }
            this.f7599c.a(webView);
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (u8.z) {
            return;
        }
        if (this.f7602f) {
            this.f7601e = 1;
            this.f7600d.a();
            this.f7599c.a(webView);
        } else {
            this.f7601e = Math.max(this.f7601e, 1);
        }
        this.f7600d.setVisibility(0);
        this.f7599c.b().setText(str);
        this.f7599c.a(webView);
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i4, String str, String str2) {
        this.f7600d.a();
        super.onReceivedError(webView, i4, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView != null && str != null && !si.c(webView.getContext(), str) && !u8.z) {
            if (!this.f7602f) {
                this.f7602f = true;
                this.f7600d.a();
                this.f7601e = 0;
            }
            this.f7601e++;
            if (g0.b(str) && !g0.a(str)) {
                return false;
            }
            this.f7601e = 1;
            g0.b(this.f7597a, str);
            u8 u8Var = this.f7598b;
            if (u8Var != null) {
                u8Var.i();
            }
        }
        return true;
    }
}
