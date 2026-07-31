package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.k0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0290k0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1331a = new HashMap();

    public final synchronized C0264j0 a(R4 r4, PublicLogger publicLogger, Xe xe) {
        C0264j0 c0264j0;
        c0264j0 = (C0264j0) this.f1331a.get(r4.toString());
        if (c0264j0 == null) {
            C0239i0 d = xe.d();
            c0264j0 = new C0264j0(d.f1297a, d.b, new C0511sl(publicLogger, "[App Environment]"));
            this.f1331a.put(r4.toString(), c0264j0);
        }
        return c0264j0;
    }

    public final synchronized void a(C0239i0 c0239i0, Xe xe) {
        xe.a(c0239i0).b();
    }
}
