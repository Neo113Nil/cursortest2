package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.Bi;
import io.appmetrica.analytics.impl.C0614fe;
import io.appmetrica.analytics.impl.C0785m4;
import io.appmetrica.analytics.impl.C0896qb;
import io.appmetrica.analytics.impl.C0940s4;
import io.appmetrica.analytics.impl.C0968t6;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.InterfaceC0598eo;
import io.appmetrica.analytics.impl.Xk;

/* loaded from: classes.dex */
public final class NumberAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final C0968t6 f13383a;

    public NumberAttribute(String str, C0896qb c0896qb, Gb gb) {
        this.f13383a = new C0968t6(str, c0896qb, gb);
    }

    public UserProfileUpdate<? extends InterfaceC0598eo> withValue(double d4) {
        return new UserProfileUpdate<>(new C0614fe(this.f13383a.f12770c, d4, new C0896qb(), new C0940s4(new Gb(new C0785m4(100)))));
    }

    public UserProfileUpdate<? extends InterfaceC0598eo> withValueIfUndefined(double d4) {
        return new UserProfileUpdate<>(new C0614fe(this.f13383a.f12770c, d4, new C0896qb(), new Xk(new Gb(new C0785m4(100)))));
    }

    public UserProfileUpdate<? extends InterfaceC0598eo> withValueReset() {
        return new UserProfileUpdate<>(new Bi(1, this.f13383a.f12770c, new C0896qb(), new Gb(new C0785m4(100))));
    }
}
