package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0729k0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f12181a = new HashMap();

    public final synchronized C0703j0 a(Q4 q4, PublicLogger publicLogger, We we) {
        C0703j0 c0703j0;
        c0703j0 = (C0703j0) this.f12181a.get(q4.toString());
        if (c0703j0 == null) {
            C0678i0 d4 = we.d();
            c0703j0 = new C0703j0(d4.f12011a, d4.f12012b, new C0931rl(publicLogger, "[App Environment]"));
            this.f12181a.put(q4.toString(), c0703j0);
        }
        return c0703j0;
    }

    public final synchronized void a(C0678i0 c0678i0, We we) {
        we.a(c0678i0).b();
    }
}
