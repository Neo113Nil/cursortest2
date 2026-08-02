package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.Bi;
import io.appmetrica.analytics.impl.C0940s4;
import io.appmetrica.analytics.impl.C0968t6;
import io.appmetrica.analytics.impl.InterfaceC0598eo;
import io.appmetrica.analytics.impl.InterfaceC0705j2;
import io.appmetrica.analytics.impl.InterfaceC0960so;
import io.appmetrica.analytics.impl.X2;
import io.appmetrica.analytics.impl.Xk;

/* loaded from: classes.dex */
public class BooleanAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final C0968t6 f13372a;

    public BooleanAttribute(String str, InterfaceC0960so interfaceC0960so, InterfaceC0705j2 interfaceC0705j2) {
        this.f13372a = new C0968t6(str, interfaceC0960so, interfaceC0705j2);
    }

    public UserProfileUpdate<? extends InterfaceC0598eo> withValue(boolean z) {
        C0968t6 c0968t6 = this.f13372a;
        return new UserProfileUpdate<>(new X2(c0968t6.f12770c, z, c0968t6.f12768a, new C0940s4(c0968t6.f12769b)));
    }

    public UserProfileUpdate<? extends InterfaceC0598eo> withValueIfUndefined(boolean z) {
        C0968t6 c0968t6 = this.f13372a;
        return new UserProfileUpdate<>(new X2(c0968t6.f12770c, z, c0968t6.f12768a, new Xk(c0968t6.f12769b)));
    }

    public UserProfileUpdate<? extends InterfaceC0598eo> withValueReset() {
        C0968t6 c0968t6 = this.f13372a;
        return new UserProfileUpdate<>(new Bi(3, c0968t6.f12770c, c0968t6.f12768a, c0968t6.f12769b));
    }
}
