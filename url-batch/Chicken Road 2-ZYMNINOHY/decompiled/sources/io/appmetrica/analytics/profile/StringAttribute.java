package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.Bi;
import io.appmetrica.analytics.impl.C0940s4;
import io.appmetrica.analytics.impl.C0968t6;
import io.appmetrica.analytics.impl.InterfaceC0598eo;
import io.appmetrica.analytics.impl.InterfaceC0705j2;
import io.appmetrica.analytics.impl.InterfaceC0960so;
import io.appmetrica.analytics.impl.Ln;
import io.appmetrica.analytics.impl.Xk;
import io.appmetrica.analytics.impl.Xm;
import io.appmetrica.analytics.impl.Ym;

/* loaded from: classes.dex */
public class StringAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final Ln f13384a;

    /* renamed from: b, reason: collision with root package name */
    private final C0968t6 f13385b;

    public StringAttribute(String str, Xm xm, InterfaceC0960so interfaceC0960so, InterfaceC0705j2 interfaceC0705j2) {
        this.f13385b = new C0968t6(str, interfaceC0960so, interfaceC0705j2);
        this.f13384a = xm;
    }

    public UserProfileUpdate<? extends InterfaceC0598eo> withValue(String str) {
        C0968t6 c0968t6 = this.f13385b;
        return new UserProfileUpdate<>(new Ym(c0968t6.f12770c, str, this.f13384a, c0968t6.f12768a, new C0940s4(c0968t6.f12769b)));
    }

    public UserProfileUpdate<? extends InterfaceC0598eo> withValueIfUndefined(String str) {
        C0968t6 c0968t6 = this.f13385b;
        return new UserProfileUpdate<>(new Ym(c0968t6.f12770c, str, this.f13384a, c0968t6.f12768a, new Xk(c0968t6.f12769b)));
    }

    public UserProfileUpdate<? extends InterfaceC0598eo> withValueReset() {
        C0968t6 c0968t6 = this.f13385b;
        return new UserProfileUpdate<>(new Bi(0, c0968t6.f12770c, c0968t6.f12768a, c0968t6.f12769b));
    }
}
