package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.hh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0698hh extends Wg {
    public C0698hh(C0608e5 c0608e5) {
        super(c0608e5);
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        Ik ik;
        Yk yk;
        C0948r9 c0948r9 = this.f7670a.f8098n;
        Wk wk = c0948r9.f9150c;
        if (wk.f7679g == 0) {
            ik = wk.f7676d.b();
            Ik b6 = wk.f7677e.b();
            if ((ik == null ? -1L : ik.f6968d) <= (b6 != null ? b6.f6968d : -1L)) {
                ik = b6;
            }
        } else {
            ik = wk.f7678f;
        }
        if (ik != null) {
            yk = new Yk();
            yk.f7754a = ik.f6968d;
            long andIncrement = ik.f6970f.getAndIncrement();
            Zk zk = ik.f6966b;
            zk.a(Zk.f7799g, Long.valueOf(ik.f6970f.get()));
            zk.b();
            yk.f7755b = andIncrement;
            yk.f7756c = TimeUnit.MILLISECONDS.toSeconds(ik.f6974j);
            yk.f7757d = ik.f6967c.f7099a;
        } else {
            long j2 = w5.f7657j;
            long a6 = wk.f7674b.a();
            S6 s6 = wk.f7673a.f8089e;
            EnumC0521al enumC0521al = EnumC0521al.BACKGROUND;
            s6.a(a6, enumC0521al, j2);
            Yk yk2 = new Yk();
            yk2.f7754a = a6;
            yk2.f7757d = enumC0521al;
            yk2.f7755b = 0L;
            yk2.f7756c = 0L;
            yk = yk2;
        }
        c0948r9.a(w5, yk);
        return false;
    }
}
