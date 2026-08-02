package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.A6;
import io.appmetrica.analytics.impl.C0372an;
import io.appmetrica.analytics.impl.C0398bn;
import io.appmetrica.analytics.impl.C0422cl;
import io.appmetrica.analytics.impl.C0998z4;
import io.appmetrica.analytics.impl.Gi;
import io.appmetrica.analytics.impl.InterfaceC0528go;
import io.appmetrica.analytics.impl.InterfaceC0816s2;
import io.appmetrica.analytics.impl.InterfaceC0890uo;
import io.appmetrica.analytics.impl.Nn;

/* loaded from: classes.dex */
public class StringAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final Nn f8956a;

    /* renamed from: b, reason: collision with root package name */
    private final A6 f8957b;

    public StringAttribute(String str, C0372an c0372an, InterfaceC0890uo interfaceC0890uo, InterfaceC0816s2 interfaceC0816s2) {
        this.f8957b = new A6(str, interfaceC0890uo, interfaceC0816s2);
        this.f8956a = c0372an;
    }

    public UserProfileUpdate<? extends InterfaceC0528go> withValue(String str) {
        A6 a6 = this.f8957b;
        return new UserProfileUpdate<>(new C0398bn(a6.f5728c, str, this.f8956a, a6.f5726a, new C0998z4(a6.f5727b)));
    }

    public UserProfileUpdate<? extends InterfaceC0528go> withValueIfUndefined(String str) {
        A6 a6 = this.f8957b;
        return new UserProfileUpdate<>(new C0398bn(a6.f5728c, str, this.f8956a, a6.f5726a, new C0422cl(a6.f5727b)));
    }

    public UserProfileUpdate<? extends InterfaceC0528go> withValueReset() {
        A6 a6 = this.f8957b;
        return new UserProfileUpdate<>(new Gi(0, a6.f5728c, a6.f5726a, a6.f5727b));
    }
}
