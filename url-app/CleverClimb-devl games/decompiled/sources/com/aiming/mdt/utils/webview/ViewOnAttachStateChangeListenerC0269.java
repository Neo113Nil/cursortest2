package com.aiming.mdt.utils.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import com.aiming.mdt.a.C0076;
import com.aiming.mdt.utils.C0282;
import com.aiming.mdt.utils.C0285;

/* renamed from: com.aiming.mdt.utils.webview.ʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0269 implements View.OnAttachStateChangeListener {

    /* renamed from: ʻ, reason: contains not printable characters */
    private C0265 f803;

    /* renamed from: com.aiming.mdt.utils.webview.ʽ$ʽ, reason: contains not printable characters */
    static final class C0270 {

        /* renamed from: ʽ, reason: contains not printable characters */
        private static ViewOnAttachStateChangeListenerC0269 f804 = new ViewOnAttachStateChangeListenerC0269(0);
    }

    private ViewOnAttachStateChangeListenerC0269() {
    }

    /* synthetic */ ViewOnAttachStateChangeListenerC0269(byte b2) {
        this();
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static void m919(C0265 c0265, String str) {
        if (c0265 == null) {
            return;
        }
        c0265.loadUrl("about:blank");
        c0265.removeAllViews();
        c0265.removeJavascriptInterface(str);
        c0265.setWebViewClient(null);
        c0265.setWebChromeClient(null);
        c0265.freeMemory();
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public static ViewOnAttachStateChangeListenerC0269 m920() {
        return C0270.f804;
    }

    @SuppressLint({"AddJavascriptInterface", "SetJavaScriptEnabled"})
    /* renamed from: ʻʽ, reason: contains not printable characters */
    public static void m921(C0265 c0265, AdJSInterface adJSInterface, String str) {
        if (adJSInterface != null) {
            c0265.removeJavascriptInterface(str);
            c0265.addJavascriptInterface(adJSInterface, str);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f803 != null) {
            this.f803.clearHistory();
        }
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final C0265 m923() {
        return this.f803;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m924() {
        C0285.m979(new RunnableC0266(this));
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final boolean m925(Context context) {
        try {
            this.f803 = new C0265(context.getApplicationContext());
            return true;
        } catch (Throwable th) {
            C0282.m972("AdtWebView", th);
            C0076.m232().m236(th);
            return false;
        }
    }
}
