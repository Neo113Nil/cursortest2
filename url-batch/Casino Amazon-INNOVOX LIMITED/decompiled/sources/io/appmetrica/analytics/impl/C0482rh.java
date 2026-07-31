package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.rh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0482rh extends Sg {
    public C0482rh(Y4 y4) {
        super(y4);
    }

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(Q5 q5) {
        ((C0321l5) this.f1045a.p).e();
        Sk sk = this.f1045a.j;
        synchronized (sk) {
            Ek b = sk.b(q5);
            if (b.g) {
                b.g = false;
                Vk vk = b.b;
                vk.a(Vk.i, Boolean.FALSE);
                vk.b();
            }
            if (sk.g != 1) {
                sk.b(sk.f, q5);
            }
            sk.g = 1;
        }
        return true;
    }
}
