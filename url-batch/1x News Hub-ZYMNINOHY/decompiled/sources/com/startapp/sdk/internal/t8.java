package com.startapp.sdk.internal;

import android.graphics.Bitmap;
import android.webkit.WebView;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.inappbrowser.AnimatingProgressBar;
import com.startapp.sdk.inappbrowser.NavigationBarLayout;

/* loaded from: classes.dex */
public final class t8 extends qk {

    /* renamed from: a, reason: collision with root package name */
    public final OverlayActivity f4460a;

    /* renamed from: b, reason: collision with root package name */
    public final u8 f4461b;

    /* renamed from: c, reason: collision with root package name */
    public final NavigationBarLayout f4462c;

    /* renamed from: d, reason: collision with root package name */
    public final AnimatingProgressBar f4463d;

    /* renamed from: e, reason: collision with root package name */
    public int f4464e = 0;
    public boolean f = false;

    public t8(OverlayActivity overlayActivity, NavigationBarLayout navigationBarLayout, AnimatingProgressBar animatingProgressBar, u8 u8Var) {
        this.f4460a = overlayActivity;
        this.f4463d = animatingProgressBar;
        this.f4462c = navigationBarLayout;
        this.f4461b = u8Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (u8.z) {
            return;
        }
        this.f4462c.a(webView);
        int i3 = this.f4464e - 1;
        this.f4464e = i3;
        if (i3 == 0) {
            this.f = false;
            this.f4463d.a();
            if (this.f4463d.isShown()) {
                this.f4463d.setVisibility(8);
            }
            this.f4462c.a(webView);
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (u8.z) {
            return;
        }
        if (this.f) {
            this.f4464e = 1;
            this.f4463d.a();
            this.f4462c.a(webView);
        } else {
            this.f4464e = Math.max(this.f4464e, 1);
        }
        this.f4463d.setVisibility(0);
        this.f4462c.b().setText(str);
        this.f4462c.a(webView);
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i3, String str, String str2) {
        this.f4463d.a();
        super.onReceivedError(webView, i3, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView != null && str != null && !si.c(webView.getContext(), str) && !u8.z) {
            if (!this.f) {
                this.f = true;
                this.f4463d.a();
                this.f4464e = 0;
            }
            this.f4464e++;
            if (g0.b(str) && !g0.a(str)) {
                return false;
            }
            this.f4464e = 1;
            g0.b(this.f4460a, str);
            u8 u8Var = this.f4461b;
            if (u8Var != null) {
                u8Var.i();
            }
        }
        return true;
    }
}
