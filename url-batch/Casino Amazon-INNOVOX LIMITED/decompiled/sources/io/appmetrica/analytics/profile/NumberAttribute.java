package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C0201ge;
import io.appmetrica.analytics.impl.C0370n4;
import io.appmetrica.analytics.impl.C0476rb;
import io.appmetrica.analytics.impl.C0519t4;
import io.appmetrica.analytics.impl.C0546u6;
import io.appmetrica.analytics.impl.Ci;
import io.appmetrica.analytics.impl.Hb;
import io.appmetrica.analytics.impl.InterfaceC0185fo;
import io.appmetrica.analytics.impl.Yk;

/* loaded from: classes3.dex */
public final class NumberAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final C0546u6 f1689a;

    NumberAttribute(String str, C0476rb c0476rb, Hb hb) {
        this.f1689a = new C0546u6(str, c0476rb, hb);
    }

    public UserProfileUpdate<? extends InterfaceC0185fo> withValue(double d) {
        return new UserProfileUpdate<>(new C0201ge(this.f1689a.c, d, new C0476rb(), new C0519t4(new Hb(new C0370n4(100)))));
    }

    public UserProfileUpdate<? extends InterfaceC0185fo> withValueIfUndefined(double d) {
        return new UserProfileUpdate<>(new C0201ge(this.f1689a.c, d, new C0476rb(), new Yk(new Hb(new C0370n4(100)))));
    }

    public UserProfileUpdate<? extends InterfaceC0185fo> withValueReset() {
        return new UserProfileUpdate<>(new Ci(1, this.f1689a.c, new C0476rb(), new Hb(new C0370n4(100))));
    }
}
