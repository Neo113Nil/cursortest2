package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C0476rb;
import io.appmetrica.analytics.impl.C0546u6;
import io.appmetrica.analytics.impl.Hb;
import io.appmetrica.analytics.impl.InterfaceC0185fo;
import io.appmetrica.analytics.impl.R5;

/* loaded from: classes3.dex */
public final class CounterAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final C0546u6 f1683a;

    CounterAttribute(String str, C0476rb c0476rb, Hb hb) {
        this.f1683a = new C0546u6(str, c0476rb, hb);
    }

    public UserProfileUpdate<? extends InterfaceC0185fo> withDelta(double d) {
        return new UserProfileUpdate<>(new R5(this.f1683a.c, d));
    }
}
