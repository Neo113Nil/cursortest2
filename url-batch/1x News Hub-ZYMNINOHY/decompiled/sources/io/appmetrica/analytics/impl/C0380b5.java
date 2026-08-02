package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.b5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0380b5 extends AbstractC0354a5 {
    public C0380b5(C0457e5 c0457e5) {
        super(c0457e5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0354a5
    public final boolean b(int i3) {
        return i3 < 113;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0354a5
    public final void c() {
        C0390bf c0390bf = this.f6986a.f7227c;
        try {
            Zk zk = new Zk(c0390bf, H2.f6060g);
            Long a3 = zk.f6963c.a(Zk.f6956d);
            if (a3 != null) {
                zk.a(Zk.f6956d, Long.valueOf(TimeUnit.SECONDS.toMillis(a3.longValue())));
            }
            Long a4 = zk.f6963c.a(Zk.f6957e);
            if (a4 != null) {
                zk.a(Zk.f6957e, Long.valueOf(TimeUnit.SECONDS.toMillis(a4.longValue())));
            }
        } catch (Throwable unused) {
        }
        try {
            Zk zk2 = new Zk(c0390bf, C0721oa.f7999g);
            Long a5 = zk2.f6963c.a(Zk.f6956d);
            if (a5 != null) {
                zk2.a(Zk.f6956d, Long.valueOf(TimeUnit.SECONDS.toMillis(a5.longValue())));
            }
            Long a6 = zk2.f6963c.a(Zk.f6957e);
            if (a6 != null) {
                zk2.a(Zk.f6957e, Long.valueOf(TimeUnit.SECONDS.toMillis(a6.longValue())));
            }
        } catch (Throwable unused2) {
        }
    }
}
