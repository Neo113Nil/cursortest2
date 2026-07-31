package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2690i0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f39166a = new HashMap();

    public final synchronized C2664h0 a(C2772l5 c2772l5, PublicLogger publicLogger, C2756kf c2756kf) {
        C2664h0 c2664h0;
        c2664h0 = (C2664h0) this.f39166a.get(c2772l5.toString());
        if (c2664h0 == null) {
            C2638g0 d4 = c2756kf.d();
            c2664h0 = new C2664h0(d4.f39022a, d4.f39023b, new C2943rl(publicLogger, "[App Environment]"));
            this.f39166a.put(c2772l5.toString(), c2664h0);
        }
        return c2664h0;
    }

    public final synchronized void a(C2638g0 c2638g0, C2756kf c2756kf) {
        c2756kf.a(c2638g0).b();
    }
}
