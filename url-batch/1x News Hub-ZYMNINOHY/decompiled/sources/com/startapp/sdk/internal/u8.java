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
    public static final int f4535A = R.id.io_start_navigation_bar;

    /* renamed from: B, reason: collision with root package name */
    public static final int f4536B = R.id.io_start_navigation_bar_close;

    /* renamed from: C, reason: collision with root package name */
    public static final int f4537C = R.id.io_start_navigation_bar_external;

    /* renamed from: D, reason: collision with root package name */
    public static final int f4538D = R.id.io_start_navigation_bar_back;

    /* renamed from: E, reason: collision with root package name */
    public static final int f4539E = R.id.io_start_navigation_bar_forward;

    /* renamed from: F, reason: collision with root package name */
    public static final int f4540F = R.id.io_start_navigation_bar_progress;
    public static boolean z = false;

    /* renamed from: t, reason: collision with root package name */
    public RelativeLayout f4541t;

    /* renamed from: u, reason: collision with root package name */
    public NavigationBarLayout f4542u;
    public WebView v;

    /* renamed from: w, reason: collision with root package name */
    public AnimatingProgressBar f4543w;

    /* renamed from: x, reason: collision with root package name */
    public FrameLayout f4544x;

    /* renamed from: y, reason: collision with root package name */
    public final String f4545y;

    public u8(String str) {
        this.f4545y = str;
    }

    @Override // com.startapp.sdk.internal.u7
    public final void a(Bundle bundle) {
        wb.a(this.f4518a).a(this.f4520c, new IntentFilter("com.startapp.android.CloseAdActivity"));
        z = false;
        this.f4541t = new RelativeLayout(this.f4518a);
        String str = this.f4545y;
        if (this.f4542u == null) {
            NavigationBarLayout navigationBarLayout = new NavigationBarLayout(this.f4518a);
            this.f4542u = navigationBarLayout;
            navigationBarLayout.d();
            this.f4542u.c();
            this.f4542u.setButtonsListener(this);
        }
        this.f4541t.addView(this.f4542u);
        this.f4543w = new AnimatingProgressBar(this.f4518a, null, android.R.attr.progressBarStyleHorizontal);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(Color.parseColor("#45d200"));
        this.f4543w.setProgressDrawable(new ClipDrawable(shapeDrawable, 3, 1));
        this.f4543w.setBackgroundColor(-1);
        this.f4543w.setId(f4540F);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, ii.a(this.f4518a, 4));
        layoutParams.addRule(3, f4535A);
        this.f4541t.addView(this.f4543w, layoutParams);
        this.f4544x = new FrameLayout(this.f4518a);
        if (this.v == null) {
            try {
                j();
                this.v.loadUrl(str);
            } catch (Throwable th) {
                d9.a(th);
                this.f4542u.e();
                g0.b(this.f4518a, str);
                this.f4518a.finish();
            }
        }
        this.f4544x.addView(this.v);
        this.f4544x.setBackgroundColor(-1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        layoutParams2.addRule(3, f4540F);
        this.f4541t.addView(this.f4544x, layoutParams2);
        if (bundle != null) {
            this.v.restoreState(bundle);
        }
        this.f4518a.setContentView(this.f4541t, new RelativeLayout.LayoutParams(-2, -2));
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
        this.f4542u.e();
        this.f4518a.finish();
    }

    public final void j() {
        WebView c3 = ((rk) com.startapp.sdk.components.a.a(this.f4518a).f3463b.a()).c();
        this.v = c3;
        c3.getSettings().setJavaScriptEnabled(true);
        this.v.getSettings().setUseWideViewPort(true);
        this.v.getSettings().setLoadWithOverviewMode(true);
        this.v.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.v.getSettings().setBuiltInZoomControls(true);
        this.v.getSettings().setDisplayZoomControls(false);
        this.v.setWebViewClient(new t8(this.f4518a, this.f4542u, this.f4543w, this));
        this.v.setWebChromeClient(new s8(this));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == f4538D) {
            WebView webView = this.v;
            if (webView == null || !webView.canGoBack()) {
                return;
            }
            this.f4543w.a();
            this.v.goBack();
            return;
        }
        if (id == f4539E) {
            WebView webView2 = this.v;
            if (webView2 == null || !webView2.canGoForward()) {
                return;
            }
            this.f4543w.a();
            this.v.goForward();
            return;
        }
        if (id != f4537C) {
            if (id == f4536B) {
                i();
            }
        } else {
            WebView webView3 = this.v;
            if (webView3 != null) {
                g0.b(this.f4518a, webView3.getUrl());
                i();
            }
        }
    }

    @Override // com.startapp.sdk.internal.u7
    public final boolean a(int i3, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i3 != 4) {
            return false;
        }
        WebView webView = this.v;
        if (webView != null && webView.canGoBack()) {
            this.f4543w.a();
            this.v.goBack();
            return true;
        }
        i();
        return true;
    }
}
