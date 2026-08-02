package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.A6;
import io.appmetrica.analytics.impl.C0955xb;
import io.appmetrica.analytics.impl.InterfaceC0528go;
import io.appmetrica.analytics.impl.Nb;
import io.appmetrica.analytics.impl.X5;

/* loaded from: classes.dex */
public final class CounterAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final A6 f8951a;

    public CounterAttribute(String str, C0955xb c0955xb, Nb nb) {
        this.f8951a = new A6(str, c0955xb, nb);
    }

    public UserProfileUpdate<? extends InterfaceC0528go> withDelta(double d3) {
        return new UserProfileUpdate<>(new X5(this.f8951a.f5728c, d3));
    }
}
