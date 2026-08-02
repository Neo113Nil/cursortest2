package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0607k0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7697a = new HashMap();

    public final synchronized C0581j0 a(X4 x4, PublicLogger publicLogger, C0390bf c0390bf) {
        C0581j0 c0581j0;
        c0581j0 = (C0581j0) this.f7697a.get(x4.toString());
        if (c0581j0 == null) {
            C0556i0 d3 = c0390bf.d();
            c0581j0 = new C0581j0(d3.f7491a, d3.f7492b, new C0913vl(publicLogger, "[App Environment]"));
            this.f7697a.put(x4.toString(), c0581j0);
        }
        return c0581j0;
    }

    public final synchronized void a(C0556i0 c0556i0, C0390bf c0390bf) {
        c0390bf.a(c0556i0).b();
    }
}
