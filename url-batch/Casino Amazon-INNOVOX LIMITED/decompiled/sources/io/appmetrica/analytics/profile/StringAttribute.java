package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C0519t4;
import io.appmetrica.analytics.impl.C0546u6;
import io.appmetrica.analytics.impl.Ci;
import io.appmetrica.analytics.impl.InterfaceC0185fo;
import io.appmetrica.analytics.impl.InterfaceC0292k2;
import io.appmetrica.analytics.impl.Mn;
import io.appmetrica.analytics.impl.Yk;
import io.appmetrica.analytics.impl.Ym;
import io.appmetrica.analytics.impl.Zm;
import io.appmetrica.analytics.impl.to;

/* loaded from: classes3.dex */
public class StringAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final Mn f1690a;
    private final C0546u6 b;

    StringAttribute(String str, Ym ym, to toVar, InterfaceC0292k2 interfaceC0292k2) {
        this.b = new C0546u6(str, toVar, interfaceC0292k2);
        this.f1690a = ym;
    }

    public UserProfileUpdate<? extends InterfaceC0185fo> withValue(String str) {
        C0546u6 c0546u6 = this.b;
        return new UserProfileUpdate<>(new Zm(c0546u6.c, str, this.f1690a, c0546u6.f1510a, new C0519t4(c0546u6.b)));
    }

    public UserProfileUpdate<? extends InterfaceC0185fo> withValueIfUndefined(String str) {
        C0546u6 c0546u6 = this.b;
        return new UserProfileUpdate<>(new Zm(c0546u6.c, str, this.f1690a, c0546u6.f1510a, new Yk(c0546u6.b)));
    }

    public UserProfileUpdate<? extends InterfaceC0185fo> withValueReset() {
        C0546u6 c0546u6 = this.b;
        return new UserProfileUpdate<>(new Ci(0, c0546u6.c, c0546u6.f1510a, c0546u6.b));
    }
}
