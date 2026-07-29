package com.aiming.mdt.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import com.aiming.mdt.utils.C0285;
import com.aiming.mdt.utils.webview.AdJSInterface;
import com.aiming.mdt.utils.webview.C0265;

/* renamed from: com.aiming.mdt.a.ʽʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0159 implements View.OnAttachStateChangeListener {

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private C0265 f533;

    /* renamed from: com.aiming.mdt.a.ʽʿ$ʼ, reason: contains not printable characters */
    static final class C0160 {

        /* renamed from: ʽ, reason: contains not printable characters */
        private static ViewOnAttachStateChangeListenerC0159 f534 = new ViewOnAttachStateChangeListenerC0159(0);
    }

    private ViewOnAttachStateChangeListenerC0159() {
    }

    /* synthetic */ ViewOnAttachStateChangeListenerC0159(byte b2) {
        this();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static ViewOnAttachStateChangeListenerC0159 m599() {
        return C0160.f534;
    }

    @SuppressLint({"AddJavascriptInterface", "SetJavaScriptEnabled"})
    /* renamed from: ʼ, reason: contains not printable characters */
    public static void m601(C0265 c0265, AdJSInterface adJSInterface, String str) {
        if (adJSInterface != null) {
            c0265.removeJavascriptInterface(str);
            c0265.addJavascriptInterface(adJSInterface, str);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m603(C0265 c0265, String str) {
        if (c0265 == null) {
            return;
        }
        c0265.stopLoading();
        c0265.removeAllViews();
        c0265.removeJavascriptInterface(str);
        c0265.setWebViewClient(null);
        c0265.setWebChromeClient(null);
        c0265.freeMemory();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f533 != null) {
            this.f533.loadUrl("about:blank");
            this.f533.clearHistory();
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final C0265 m604() {
        return this.f533;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final void m605(Context context) {
        C0285.m979(new RunnableC0186(this, context));
    }
}
