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
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.inappbrowser.AnimatingProgressBar;
import com.startapp.sdk.inappbrowser.NavigationBarLayout;
import com.startapp.startappsdk.R;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class f8 extends g7 implements View.OnClickListener {
    public static final int A = R.id.io_start_navigation_bar;
    public static final int B = R.id.io_start_navigation_bar_close;
    public static final int C = R.id.io_start_navigation_bar_external;
    public static final int D = R.id.io_start_navigation_bar_back;
    public static final int E = R.id.io_start_navigation_bar_forward;
    public static final int F = R.id.io_start_navigation_bar_progress;
    public static boolean z = false;
    public RelativeLayout t;
    public NavigationBarLayout u;
    public WebView v;
    public AnimatingProgressBar w;
    public FrameLayout x;
    public final String y;

    public f8(Ad ad, String str) {
        super(ad);
        this.y = str;
    }

    @Override // com.startapp.sdk.internal.g7
    public final void a(Bundle bundle) {
        db.a(this.f248a).a(this.c, new IntentFilter("com.startapp.android.CloseAdActivity"));
        z = false;
        this.t = new RelativeLayout(this.f248a);
        String str = this.y;
        if (this.u == null) {
            NavigationBarLayout navigationBarLayout = new NavigationBarLayout(this.f248a);
            this.u = navigationBarLayout;
            navigationBarLayout.d();
            this.u.c();
            this.u.setButtonsListener(this);
        }
        this.t.addView(this.u);
        this.w = new AnimatingProgressBar(this.f248a, null, android.R.attr.progressBarStyleHorizontal);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(Color.parseColor("#45d200"));
        this.w.setProgressDrawable(new ClipDrawable(shapeDrawable, 3, 1));
        this.w.setBackgroundColor(-1);
        this.w.setId(F);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, ph.a(this.f248a, 4));
        layoutParams.addRule(3, A);
        this.t.addView(this.w, layoutParams);
        this.x = new FrameLayout(this.f248a);
        if (this.v == null) {
            try {
                j();
                this.v.loadUrl(str);
            } catch (Throwable th) {
                n8.a(th);
                this.u.e();
                e0.b(this.f248a, str);
                this.f248a.finish();
            }
        }
        this.x.addView(this.v);
        this.x.setBackgroundColor(-1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        layoutParams2.addRule(3, F);
        this.t.addView(this.x, layoutParams2);
        if (bundle != null) {
            this.v.restoreState(bundle);
        }
        this.f248a.setContentView(this.t, new RelativeLayout.LayoutParams(-2, -2));
    }

    @Override // com.startapp.sdk.internal.g7
    public final void b(Bundle bundle) {
        this.v.saveState(bundle);
    }

    @Override // com.startapp.sdk.internal.g7
    public final void f() {
    }

    @Override // com.startapp.sdk.internal.g7
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
        this.u.e();
        this.f248a.finish();
    }

    public final void j() {
        WebView c = ((uj) com.startapp.sdk.components.a.a(this.f248a).f160a.a()).c();
        this.v = c;
        c.getSettings().setJavaScriptEnabled(true);
        this.v.getSettings().setUseWideViewPort(true);
        this.v.getSettings().setLoadWithOverviewMode(true);
        this.v.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.v.getSettings().setBuiltInZoomControls(true);
        this.v.getSettings().setDisplayZoomControls(false);
        this.v.setWebViewClient(new e8(this.f248a, this.u, this.w, this));
        this.v.setWebChromeClient(new d8(this));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == D) {
            WebView webView = this.v;
            if (webView == null || !webView.canGoBack()) {
                return;
            }
            this.w.a();
            this.v.goBack();
            return;
        }
        if (id == E) {
            WebView webView2 = this.v;
            if (webView2 == null || !webView2.canGoForward()) {
                return;
            }
            this.w.a();
            this.v.goForward();
            return;
        }
        if (id != C) {
            if (id == B) {
                i();
            }
        } else {
            WebView webView3 = this.v;
            if (webView3 != null) {
                e0.b(this.f248a, webView3.getUrl());
                i();
            }
        }
    }

    @Override // com.startapp.sdk.internal.g7
    public final boolean a(int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        WebView webView = this.v;
        if (webView != null && webView.canGoBack()) {
            this.w.a();
            this.v.goBack();
            return true;
        }
        i();
        return true;
    }
}
