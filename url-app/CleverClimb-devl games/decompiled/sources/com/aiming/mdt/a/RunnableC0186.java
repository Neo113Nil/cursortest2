package com.aiming.mdt.a;

import android.content.Context;
import com.aiming.mdt.utils.C0282;
import com.aiming.mdt.utils.webview.C0265;

/* renamed from: com.aiming.mdt.a.ʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0186 implements Runnable {

    /* renamed from: ʼ, reason: contains not printable characters */
    private /* synthetic */ ViewOnAttachStateChangeListenerC0159 f652;

    /* renamed from: ʽ, reason: contains not printable characters */
    private /* synthetic */ Context f653;

    RunnableC0186(ViewOnAttachStateChangeListenerC0159 viewOnAttachStateChangeListenerC0159, Context context) {
        this.f652 = viewOnAttachStateChangeListenerC0159;
        this.f653 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0265 c0265;
        C0265 c02652;
        C0265 c02653;
        try {
            c0265 = this.f652.f533;
            if (c0265 == null) {
                this.f652.f533 = new C0265(this.f653.getApplicationContext());
                c02652 = this.f652.f533;
                c02652.loadUrl("about:blank");
                c02653 = this.f652.f533;
                c02653.addOnAttachStateChangeListener(this.f652);
            }
        } catch (Throwable th) {
            C0282.m972("ActWebView", th);
            C0076.m232().m236(th);
        }
    }
}
