package com.aiming.mdt.adt.interactive;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.View;
import com.aiming.mdt.adt.C0226;
import com.aiming.mdt.utils.C0285;
import com.aiming.mdt.utils.webview.AdJSInterface;
import com.aiming.mdt.utils.webview.C0265;

/* renamed from: com.aiming.mdt.adt.interactive.ʻʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class ViewOnAttachStateChangeListenerC0206 implements View.OnAttachStateChangeListener {

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private C0265 f711;

    /* renamed from: com.aiming.mdt.adt.interactive.ʻʾ$ʻʼ, reason: contains not printable characters */
    static final class C0207 {

        /* renamed from: ʼ, reason: contains not printable characters */
        private static ViewOnAttachStateChangeListenerC0206 f712 = new ViewOnAttachStateChangeListenerC0206(0);
    }

    private ViewOnAttachStateChangeListenerC0206() {
    }

    /* synthetic */ ViewOnAttachStateChangeListenerC0206(byte b2) {
        this();
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static ViewOnAttachStateChangeListenerC0206 m800() {
        return C0207.f712;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f711 != null) {
            this.f711.clearHistory();
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m803() {
        if (this.f711 != null) {
            return;
        }
        C0285.m979(new RunnableC0209(this));
    }

    @SuppressLint({"AddJavascriptInterface", "SetJavaScriptEnabled"})
    /* renamed from: ʻʽ, reason: contains not printable characters */
    final void m804(AdJSInterface adJSInterface, String str) {
        if (adJSInterface != null) {
            this.f711.removeJavascriptInterface(str);
            this.f711.addJavascriptInterface(adJSInterface, str);
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    final synchronized void m805(String str) {
        if (this.f711 != null && !TextUtils.isEmpty(str)) {
            C0285.m979(new RunnableC0214(this, str));
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    final C0265 m806() {
        if (this.f711 == null) {
            this.f711 = new C0265(C0226.m829());
        }
        return this.f711;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m807(String str) {
        if (this.f711 == null) {
            return;
        }
        this.f711.removeAllViews();
        this.f711.removeJavascriptInterface(str);
        this.f711.setWebViewClient(null);
        this.f711.setWebChromeClient(null);
        this.f711.freeMemory();
        this.f711.destroy();
        this.f711 = null;
    }
}
