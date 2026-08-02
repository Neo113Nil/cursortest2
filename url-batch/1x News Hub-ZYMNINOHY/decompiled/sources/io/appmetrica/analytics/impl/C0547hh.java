package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.hh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0547hh extends Wg {
    public C0547hh(C0457e5 c0457e5) {
        super(c0457e5);
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        Ik ik;
        Yk yk;
        C0797r9 c0797r9 = this.f6835a.f7237n;
        Wk wk = c0797r9.f8216c;
        if (wk.f6843g == 0) {
            ik = wk.f6841d.b();
            Ik b3 = wk.f6842e.b();
            if ((ik == null ? -1L : ik.f6168d) <= (b3 != null ? b3.f6168d : -1L)) {
                ik = b3;
            }
        } else {
            ik = wk.f;
        }
        if (ik != null) {
            yk = new Yk();
            yk.f6914a = ik.f6168d;
            long andIncrement = ik.f.getAndIncrement();
            Zk zk = ik.f6166b;
            zk.a(Zk.f6958g, Long.valueOf(ik.f.get()));
            zk.b();
            yk.f6915b = andIncrement;
            yk.f6916c = TimeUnit.MILLISECONDS.toSeconds(ik.f6173j);
            yk.f6917d = ik.f6167c.f6292a;
        } else {
            long j3 = w5.f6823j;
            long a3 = wk.f6839b.a();
            S6 s6 = wk.f6838a.f7229e;
            EnumC0370al enumC0370al = EnumC0370al.BACKGROUND;
            s6.a(a3, enumC0370al, j3);
            yk = new Yk();
            yk.f6914a = a3;
            yk.f6917d = enumC0370al;
            yk.f6915b = 0L;
            yk.f6916c = 0L;
        }
        c0797r9.a(w5, yk);
        return false;
    }
}
