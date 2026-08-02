package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.A6;
import io.appmetrica.analytics.impl.C0422cl;
import io.appmetrica.analytics.impl.C0673me;
import io.appmetrica.analytics.impl.C0844t4;
import io.appmetrica.analytics.impl.C0955xb;
import io.appmetrica.analytics.impl.C0998z4;
import io.appmetrica.analytics.impl.Gi;
import io.appmetrica.analytics.impl.InterfaceC0528go;
import io.appmetrica.analytics.impl.Nb;

/* loaded from: classes.dex */
public final class NumberAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final A6 f8955a;

    public NumberAttribute(String str, C0955xb c0955xb, Nb nb) {
        this.f8955a = new A6(str, c0955xb, nb);
    }

    public UserProfileUpdate<? extends InterfaceC0528go> withValue(double d3) {
        return new UserProfileUpdate<>(new C0673me(this.f8955a.f5728c, d3, new C0955xb(), new C0998z4(new Nb(new C0844t4(100)))));
    }

    public UserProfileUpdate<? extends InterfaceC0528go> withValueIfUndefined(double d3) {
        return new UserProfileUpdate<>(new C0673me(this.f8955a.f5728c, d3, new C0955xb(), new C0422cl(new Nb(new C0844t4(100)))));
    }

    public UserProfileUpdate<? extends InterfaceC0528go> withValueReset() {
        return new UserProfileUpdate<>(new Gi(1, this.f8955a.f5728c, new C0955xb(), new Nb(new C0844t4(100))));
    }
}
