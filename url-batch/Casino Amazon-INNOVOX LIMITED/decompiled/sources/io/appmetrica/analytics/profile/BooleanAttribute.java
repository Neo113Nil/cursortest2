package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C0519t4;
import io.appmetrica.analytics.impl.C0546u6;
import io.appmetrica.analytics.impl.Ci;
import io.appmetrica.analytics.impl.InterfaceC0185fo;
import io.appmetrica.analytics.impl.InterfaceC0292k2;
import io.appmetrica.analytics.impl.Y2;
import io.appmetrica.analytics.impl.Yk;
import io.appmetrica.analytics.impl.to;

/* loaded from: classes3.dex */
public class BooleanAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final C0546u6 f1682a;

    BooleanAttribute(String str, to toVar, InterfaceC0292k2 interfaceC0292k2) {
        this.f1682a = new C0546u6(str, toVar, interfaceC0292k2);
    }

    public UserProfileUpdate<? extends InterfaceC0185fo> withValue(boolean z) {
        C0546u6 c0546u6 = this.f1682a;
        return new UserProfileUpdate<>(new Y2(c0546u6.c, z, c0546u6.f1510a, new C0519t4(c0546u6.b)));
    }

    public UserProfileUpdate<? extends InterfaceC0185fo> withValueIfUndefined(boolean z) {
        C0546u6 c0546u6 = this.f1682a;
        return new UserProfileUpdate<>(new Y2(c0546u6.c, z, c0546u6.f1510a, new Yk(c0546u6.b)));
    }

    public UserProfileUpdate<? extends InterfaceC0185fo> withValueReset() {
        C0546u6 c0546u6 = this.f1682a;
        return new UserProfileUpdate<>(new Ci(3, c0546u6.c, c0546u6.f1510a, c0546u6.b));
    }
}
