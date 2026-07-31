package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.dh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0127dh extends Sg {
    public C0127dh(Y4 y4) {
        super(y4);
    }

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(Q5 q5) {
        Ek ek;
        Uk uk;
        C0325l9 c0325l9 = this.f1045a.n;
        Sk sk = c0325l9.c;
        if (sk.g == 0) {
            ek = sk.d.b();
            Ek b = sk.e.b();
            if ((ek == null ? -1L : ek.d) <= (b != null ? b.d : -1L)) {
                ek = b;
            }
        } else {
            ek = sk.f;
        }
        if (ek != null) {
            uk = new Uk();
            uk.f1080a = ek.d;
            long andIncrement = ek.f.getAndIncrement();
            Vk vk = ek.b;
            vk.a(Vk.g, Long.valueOf(ek.f.get()));
            vk.b();
            uk.b = andIncrement;
            uk.c = TimeUnit.MILLISECONDS.toSeconds(ek.j);
            uk.d = ek.c.f877a;
        } else {
            long j = q5.j;
            long a2 = sk.b.a();
            M6 m6 = sk.f1047a.e;
            Wk wk = Wk.BACKGROUND;
            m6.a(a2, wk, j);
            uk = new Uk();
            uk.f1080a = a2;
            uk.d = wk;
            uk.b = 0L;
            uk.c = 0L;
        }
        c0325l9.a(q5, uk);
        return false;
    }
}
