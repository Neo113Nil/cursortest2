package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.b5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0531b5 extends AbstractC0505a5 {
    public C0531b5(C0608e5 c0608e5) {
        super(c0608e5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0505a5
    public final boolean b(int i2) {
        return i2 < 113;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0505a5
    public final void c() {
        C0541bf c0541bf = this.f7829a.f8087c;
        try {
            Zk zk = new Zk(c0541bf, H2.f6853g);
            Long a6 = zk.f7804c.a(Zk.f7796d);
            if (a6 != null) {
                zk.a(Zk.f7796d, Long.valueOf(TimeUnit.SECONDS.toMillis(a6.longValue())));
            }
            Long a7 = zk.f7804c.a(Zk.f7797e);
            if (a7 != null) {
                zk.a(Zk.f7797e, Long.valueOf(TimeUnit.SECONDS.toMillis(a7.longValue())));
            }
        } catch (Throwable unused) {
        }
        try {
            Zk zk2 = new Zk(c0541bf, C0872oa.f8919g);
            Long a8 = zk2.f7804c.a(Zk.f7796d);
            if (a8 != null) {
                zk2.a(Zk.f7796d, Long.valueOf(TimeUnit.SECONDS.toMillis(a8.longValue())));
            }
            Long a9 = zk2.f7804c.a(Zk.f7797e);
            if (a9 != null) {
                zk2.a(Zk.f7797e, Long.valueOf(TimeUnit.SECONDS.toMillis(a9.longValue())));
            }
        } catch (Throwable unused2) {
        }
    }
}
