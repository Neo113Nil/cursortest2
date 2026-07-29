package com.aiming.mdt.utils.webview;

import com.aiming.mdt.a.C0076;
import com.aiming.mdt.adt.C0226;
import com.aiming.mdt.utils.C0282;

/* renamed from: com.aiming.mdt.utils.webview.ʻʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0266 implements Runnable {

    /* renamed from: ʽ, reason: contains not printable characters */
    private /* synthetic */ ViewOnAttachStateChangeListenerC0269 f802;

    RunnableC0266(ViewOnAttachStateChangeListenerC0269 viewOnAttachStateChangeListenerC0269) {
        this.f802 = viewOnAttachStateChangeListenerC0269;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0265 c0265;
        C0265 c02652;
        C0265 c02653;
        try {
            c0265 = this.f802.f803;
            if (c0265 == null) {
                this.f802.f803 = new C0265(C0226.m829());
            }
            c02652 = this.f802.f803;
            c02652.loadUrl("about:blank");
            c02653 = this.f802.f803;
            c02653.addOnAttachStateChangeListener(this.f802);
        } catch (Throwable th) {
            C0282.m972("AdtWebView", th);
            C0076.m232().m236(th);
        }
    }
}
