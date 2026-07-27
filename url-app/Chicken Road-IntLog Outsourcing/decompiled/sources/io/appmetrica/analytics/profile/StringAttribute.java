package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.A6;
import io.appmetrica.analytics.impl.C0523an;
import io.appmetrica.analytics.impl.C0549bn;
import io.appmetrica.analytics.impl.C0573cl;
import io.appmetrica.analytics.impl.C1149z4;
import io.appmetrica.analytics.impl.Gi;
import io.appmetrica.analytics.impl.InterfaceC0679go;
import io.appmetrica.analytics.impl.InterfaceC0967s2;
import io.appmetrica.analytics.impl.InterfaceC1041uo;
import io.appmetrica.analytics.impl.Nn;

/* loaded from: classes.dex */
public class StringAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final Nn f9935a;

    /* renamed from: b, reason: collision with root package name */
    private final A6 f9936b;

    public StringAttribute(String str, C0523an c0523an, InterfaceC1041uo interfaceC1041uo, InterfaceC0967s2 interfaceC0967s2) {
        this.f9936b = new A6(str, interfaceC1041uo, interfaceC0967s2);
        this.f9935a = c0523an;
    }

    public UserProfileUpdate<? extends InterfaceC0679go> withValue(String str) {
        A6 a6 = this.f9936b;
        return new UserProfileUpdate<>(new C0549bn(a6.f6503c, str, this.f9935a, a6.f6501a, new C1149z4(a6.f6502b)));
    }

    public UserProfileUpdate<? extends InterfaceC0679go> withValueIfUndefined(String str) {
        A6 a6 = this.f9936b;
        return new UserProfileUpdate<>(new C0549bn(a6.f6503c, str, this.f9935a, a6.f6501a, new C0573cl(a6.f6502b)));
    }

    public UserProfileUpdate<? extends InterfaceC0679go> withValueReset() {
        A6 a6 = this.f9936b;
        return new UserProfileUpdate<>(new Gi(0, a6.f6503c, a6.f6501a, a6.f6502b));
    }
}
