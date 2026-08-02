package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.vh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0909vh extends Wg {
    public C0909vh(C0457e5 c0457e5) {
        super(c0457e5);
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        ((C0793r5) this.f6835a.f7238p).e();
        Wk wk = this.f6835a.f7233j;
        synchronized (wk) {
            try {
                Ik b3 = wk.b(w5);
                if (b3.f6170g) {
                    b3.f6170g = false;
                    Zk zk = b3.f6166b;
                    zk.a(Zk.f6960i, Boolean.FALSE);
                    zk.b();
                }
                if (wk.f6843g != 1) {
                    wk.b(wk.f, w5);
                }
                wk.f6843g = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
