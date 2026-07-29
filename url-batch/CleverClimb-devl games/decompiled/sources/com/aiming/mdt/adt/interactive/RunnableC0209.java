package com.aiming.mdt.adt.interactive;

import com.aiming.mdt.a.C0076;
import com.aiming.mdt.adt.C0226;
import com.aiming.mdt.utils.C0282;
import com.aiming.mdt.utils.webview.C0265;

/* renamed from: com.aiming.mdt.adt.interactive.ʼʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0209 implements Runnable {

    /* renamed from: ʼ, reason: contains not printable characters */
    private /* synthetic */ ViewOnAttachStateChangeListenerC0206 f714;

    RunnableC0209(ViewOnAttachStateChangeListenerC0206 viewOnAttachStateChangeListenerC0206) {
        this.f714 = viewOnAttachStateChangeListenerC0206;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0265 c0265;
        C0265 c02652;
        try {
            c0265 = this.f714.f711;
            if (c0265 == null) {
                this.f714.f711 = new C0265(C0226.m829());
            }
            c02652 = this.f714.f711;
            c02652.addOnAttachStateChangeListener(this.f714);
        } catch (Throwable th) {
            C0282.m972("AdtWebView", th);
            C0076.m232().m236(th);
        }
    }
}
