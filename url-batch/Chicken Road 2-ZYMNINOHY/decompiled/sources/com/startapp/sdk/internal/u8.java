package com.startapp.sdk.internal;

import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.startapp.sdk.inappbrowser.AnimatingProgressBar;
import com.startapp.sdk.inappbrowser.NavigationBarLayout;
import com.startapp.startappsdk.R;

/* loaded from: classes.dex */
public final class u8 extends u7 implements View.OnClickListener {

    /* renamed from: A, reason: collision with root package name */
    public static final int f7675A = R.id.io_start_navigation_bar;

    /* renamed from: B, reason: collision with root package name */
    public static final int f7676B = R.id.io_start_navigation_bar_close;

    /* renamed from: C, reason: collision with root package name */
    public static final int f7677C = R.id.io_start_navigation_bar_external;

    /* renamed from: D, reason: collision with root package name */
    public static final int f7678D = R.id.io_start_navigation_bar_back;

    /* renamed from: E, reason: collision with root package name */
    public static final int f7679E = R.id.io_start_navigation_bar_forward;

    /* renamed from: F, reason: collision with root package name */
    public static final int f7680F = R.id.io_start_navigation_bar_progress;
    public static boolean z = false;

    /* renamed from: t, reason: collision with root package name */
    public RelativeLayout f7681t;

    /* renamed from: u, reason: collision with root package name */
    public NavigationBarLayout f7682u;
    public WebView v;

    /* renamed from: w, reason: collision with root package name */
    public AnimatingProgressBar f7683w;

    /* renamed from: x, reason: collision with root package name */
    public FrameLayout f7684x;

    /* renamed from: y, reason: collision with root package name */
    public final String f7685y;

    public u8(String str) {
        this.f7685y = str;
    }

    @Override // com.startapp.sdk.internal.u7
    public final void a(Bundle bundle) {
        wb.a(this.f7658a).a(this.f7660c, new IntentFilter("com.startapp.android.CloseAdActivity"));
        z = false;
        this.f7681t = new RelativeLayout(this.f7658a);
        String str = this.f7685y;
        if (this.f7682u == null) {
            NavigationBarLayout navigationBarLayout = new NavigationBarLayout(this.f7658a);
            this.f7682u = navigationBarLayout;
            navigationBarLayout.d();
            this.f7682u.c();
            this.f7682u.setButtonsListener(this);
        }
        this.f7681t.addView(this.f7682u);
        this.f7683w = new AnimatingProgressBar(this.f7658a, null, android.R.attr.progressBarStyleHorizontal);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(Color.parseColor("#45d200"));
        this.f7683w.setProgressDrawable(new ClipDrawable(shapeDrawable, 3, 1));
        this.f7683w.setBackgroundColor(-1);
        this.f7683w.setId(f7680F);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, ii.a(this.f7658a, 4));
        layoutParams.addRule(3, f7675A);
        this.f7681t.addView(this.f7683w, layoutParams);
        this.f7684x = new FrameLayout(this.f7658a);
        if (this.v == null) {
            try {
                j();
                this.v.loadUrl(str);
            } catch (Throwable th) {
                d9.a(th);
                this.f7682u.e();
                g0.b(this.f7658a, str);
                this.f7658a.finish();
            }
        }
        this.f7684x.addView(this.v);
        this.f7684x.setBackgroundColor(-1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        layoutParams2.addRule(3, f7680F);
        this.f7681t.addView(this.f7684x, layoutParams2);
        if (bundle != null) {
            this.v.restoreState(bundle);
        }
        this.f7658a.setContentView(this.f7681t, new RelativeLayout.LayoutParams(-2, -2));
    }

    @Override // com.startapp.sdk.internal.u7
    public final void b(Bundle bundle) {
        this.v.saveState(bundle);
    }

    @Override // com.startapp.sdk.internal.u7
    public final void f() {
    }

    @Override // com.startapp.sdk.internal.u7
    public final void g() {
    }

    public final void i() {
        try {
            z = true;
            this.v.stopLoading();
            this.v.removeAllViews();
            this.v.postInvalidate();
            this.v.onPause();
            this.v.destroy();
            this.v = null;
        } catch (Exception unused) {
        }
        this.f7682u.e();
        this.f7658a.finish();
    }

    public final void j() {
        WebView c4 = ((rk) com.startapp.sdk.components.a.a(this.f7658a).f6561b.a()).c();
        this.v = c4;
        c4.getSettings().setJavaScriptEnabled(true);
        this.v.getSettings().setUseWideViewPort(true);
        this.v.getSettings().setLoadWithOverviewMode(true);
        this.v.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.v.getSettings().setBuiltInZoomControls(true);
        this.v.getSettings().setDisplayZoomControls(false);
        this.v.setWebViewClient(new t8(this.f7658a, this.f7682u, this.f7683w, this));
        this.v.setWebChromeClient(new s8(this));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == f7678D) {
            WebView webView = this.v;
            if (webView == null || !webView.canGoBack()) {
                return;
            }
            this.f7683w.a();
            this.v.goBack();
            return;
        }
        if (id == f7679E) {
            WebView webView2 = this.v;
            if (webView2 == null || !webView2.canGoForward()) {
                return;
            }
            this.f7683w.a();
            this.v.goForward();
            return;
        }
        if (id != f7677C) {
            if (id == f7676B) {
                i();
            }
        } else {
            WebView webView3 = this.v;
            if (webView3 != null) {
                g0.b(this.f7658a, webView3.getUrl());
                i();
            }
        }
    }

    @Override // com.startapp.sdk.internal.u7
    public final boolean a(int i4, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i4 != 4) {
            return false;
        }
        WebView webView = this.v;
        if (webView != null && webView.canGoBack()) {
            this.f7683w.a();
            this.v.goBack();
            return true;
        }
        i();
        return true;
    }
}
