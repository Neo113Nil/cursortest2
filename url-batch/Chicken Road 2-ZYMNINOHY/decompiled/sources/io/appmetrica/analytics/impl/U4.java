package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class U4 extends T4 {
    public U4(X4 x4) {
        super(x4);
    }

    @Override // io.appmetrica.analytics.impl.T4
    public final boolean b(int i4) {
        return i4 < 113;
    }

    @Override // io.appmetrica.analytics.impl.T4
    public final void c() {
        We we = this.f10976a.f11224c;
        try {
            Uk uk = new Uk(we, C1120z2.f13092g);
            Long a3 = uk.f11069c.a(Uk.f11061d);
            if (a3 != null) {
                uk.a(Uk.f11061d, Long.valueOf(TimeUnit.SECONDS.toMillis(a3.longValue())));
            }
            Long a4 = uk.f11069c.a(Uk.f11062e);
            if (a4 != null) {
                uk.a(Uk.f11062e, Long.valueOf(TimeUnit.SECONDS.toMillis(a4.longValue())));
            }
        } catch (Throwable unused) {
        }
        try {
            Uk uk2 = new Uk(we, C0662ha.f11991g);
            Long a5 = uk2.f11069c.a(Uk.f11061d);
            if (a5 != null) {
                uk2.a(Uk.f11061d, Long.valueOf(TimeUnit.SECONDS.toMillis(a5.longValue())));
            }
            Long a6 = uk2.f11069c.a(Uk.f11062e);
            if (a6 != null) {
                uk2.a(Uk.f11062e, Long.valueOf(TimeUnit.SECONDS.toMillis(a6.longValue())));
            }
        } catch (Throwable unused2) {
        }
    }
}
