package com.icefishing.icefishingliveapp;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.internal.ads.C3820qw;
import h.AbstractActivityC4553l;

/* loaded from: classes2.dex */
public class MWebActivity extends AbstractActivityC4553l {

    /* renamed from: n, reason: collision with root package name */
    public MWebActivity f36967n;

    /* renamed from: u, reason: collision with root package name */
    public ProgressBar f36968u;

    /* renamed from: v, reason: collision with root package name */
    public WebView f36969v;

    @Override // androidx.activity.p, android.app.Activity
    public final void onBackPressed() {
        if (this.f36969v.isFocused() && this.f36969v.canGoBack()) {
            this.f36969v.goBack();
            return;
        }
        Dialog dialog = new Dialog(this);
        dialog.setContentView(C5284R.layout.playgame_dialog);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        k4.m.c(this.f36967n, k4.m.f38804u, k4.m.f38796m, k4.m.f38777K, (ViewGroup) dialog.findViewById(C5284R.id.native_ad_container));
        window.setLayout(-1, -2);
        ((TextView) dialog.findViewById(C5284R.id.play)).setOnClickListener(new q(this, dialog, 0));
        ((TextView) dialog.findViewById(C5284R.id.no)).setOnClickListener(new q(this, dialog, 1));
        ((TextView) dialog.findViewById(C5284R.id.yes)).setOnClickListener(new q(this, dialog, 2));
        dialog.show();
    }

    @Override // androidx.fragment.app.AbstractActivityC0490x, androidx.activity.p, D.AbstractActivityC0294n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5284R.layout.activity_m_web);
        this.f36967n = this;
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.clearFlags(67108864);
        window.addFlags(1024);
        this.f36969v = (WebView) findViewById(C5284R.id.webviewm);
        this.f36968u = (ProgressBar) findViewById(C5284R.id.progressbarm);
        Bundle extras = getIntent().getExtras();
        extras.getString("url1");
        extras.getString("url1");
        this.f36969v.setSoundEffectsEnabled(true);
        this.f36969v.getSettings().setJavaScriptEnabled(true);
        this.f36969v.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.f36969v.getSettings().setGeolocationEnabled(true);
        this.f36969v.getSettings().setUseWideViewPort(true);
        this.f36969v.getSettings().setLoadWithOverviewMode(true);
        this.f36969v.getSettings().setAllowContentAccess(true);
        this.f36969v.getSettings().setDatabaseEnabled(true);
        this.f36969v.getSettings().setLoadsImagesAutomatically(true);
        CookieManager.getInstance().setAcceptCookie(true);
        this.f36969v.setBackgroundColor(Color.parseColor("#000000"));
        this.f36969v.getSettings().setDomStorageEnabled(true);
        this.f36969v.getSettings().setDatabaseEnabled(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.f36969v, true);
        this.f36969v.getSettings().setMixedContentMode(0);
        this.f36969v.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.f36969v.getSettings().setAllowFileAccessFromFileURLs(true);
        this.f36969v.getSettings().setAllowUniversalAccessFromFileURLs(true);
        WebView.setWebContentsDebuggingEnabled(false);
        this.f36969v.setLayerType(2, null);
        this.f36969v.setWebViewClient(new C3820qw(this));
        getIntent().getExtras().getString("url");
        this.f36969v.loadUrl(getIntent().getStringExtra("web_url"));
        this.f36969v.setWebChromeClient(new r(this));
    }

    @Override // h.AbstractActivityC4553l, androidx.fragment.app.AbstractActivityC0490x, android.app.Activity
    public final void onDestroy() {
        this.f36969v.destroy();
        this.f36969v = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.AbstractActivityC0490x, android.app.Activity
    public final void onPause() {
        this.f36969v.onPause();
        super.onPause();
    }

    @Override // androidx.fragment.app.AbstractActivityC0490x, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f36969v.resumeTimers();
        this.f36969v.onResume();
    }
}
