package com.aiming.mdt.adt.interactive;

import android.os.Build;
import com.aiming.mdt.utils.C0282;
import com.aiming.mdt.utils.webview.C0265;

/* renamed from: com.aiming.mdt.adt.interactive.ʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0214 implements Runnable {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    final /* synthetic */ String f721;

    /* renamed from: ʼ, reason: contains not printable characters */
    private /* synthetic */ ViewOnAttachStateChangeListenerC0206 f722;

    RunnableC0214(ViewOnAttachStateChangeListenerC0206 viewOnAttachStateChangeListenerC0206, String str) {
        this.f722 = viewOnAttachStateChangeListenerC0206;
        this.f721 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0265 c0265;
        C0265 c02652;
        C0265 c02653;
        try {
            c0265 = this.f722.f711;
            if (c0265 == null) {
                return;
            }
            if (Build.VERSION.SDK_INT < 19) {
                c02653 = this.f722.f711;
                c02653.loadUrl(this.f721);
            } else {
                c02652 = this.f722.f711;
                c02652.evaluateJavascript(this.f721, new C0204(this));
            }
        } catch (Exception e) {
            C0282.m972("interactive evaluateJavascript", e);
        }
    }
}
