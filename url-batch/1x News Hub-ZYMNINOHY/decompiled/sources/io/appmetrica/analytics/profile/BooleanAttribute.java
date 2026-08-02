package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.A6;
import io.appmetrica.analytics.impl.C0422cl;
import io.appmetrica.analytics.impl.C0481f3;
import io.appmetrica.analytics.impl.C0998z4;
import io.appmetrica.analytics.impl.Gi;
import io.appmetrica.analytics.impl.InterfaceC0528go;
import io.appmetrica.analytics.impl.InterfaceC0816s2;
import io.appmetrica.analytics.impl.InterfaceC0890uo;

/* loaded from: classes.dex */
public class BooleanAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final A6 f8950a;

    public BooleanAttribute(String str, InterfaceC0890uo interfaceC0890uo, InterfaceC0816s2 interfaceC0816s2) {
        this.f8950a = new A6(str, interfaceC0890uo, interfaceC0816s2);
    }

    public UserProfileUpdate<? extends InterfaceC0528go> withValue(boolean z) {
        A6 a6 = this.f8950a;
        return new UserProfileUpdate<>(new C0481f3(a6.f5728c, z, a6.f5726a, new C0998z4(a6.f5727b)));
    }

    public UserProfileUpdate<? extends InterfaceC0528go> withValueIfUndefined(boolean z) {
        A6 a6 = this.f8950a;
        return new UserProfileUpdate<>(new C0481f3(a6.f5728c, z, a6.f5726a, new C0422cl(a6.f5727b)));
    }

    public UserProfileUpdate<? extends InterfaceC0528go> withValueReset() {
        A6 a6 = this.f8950a;
        return new UserProfileUpdate<>(new Gi(3, a6.f5728c, a6.f5726a, a6.f5727b));
    }
}
