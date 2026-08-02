package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C0896qb;
import io.appmetrica.analytics.impl.C0968t6;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.InterfaceC0598eo;
import io.appmetrica.analytics.impl.Q5;

/* loaded from: classes.dex */
public final class CounterAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final C0968t6 f13373a;

    public CounterAttribute(String str, C0896qb c0896qb, Gb gb) {
        this.f13373a = new C0968t6(str, c0896qb, gb);
    }

    public UserProfileUpdate<? extends InterfaceC0598eo> withDelta(double d4) {
        return new UserProfileUpdate<>(new Q5(this.f13373a.f12770c, d4));
    }
}
