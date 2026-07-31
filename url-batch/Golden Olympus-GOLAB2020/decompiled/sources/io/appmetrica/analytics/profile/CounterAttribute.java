package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C2516bc;
import io.appmetrica.analytics.impl.C2799m6;
import io.appmetrica.analytics.impl.InterfaceC2528bo;
import io.appmetrica.analytics.impl.Lb;
import io.appmetrica.analytics.impl.O6;

/* loaded from: classes3.dex */
public final class CounterAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final O6 f40662a;

    CounterAttribute(String str, Lb lb, C2516bc c2516bc) {
        this.f40662a = new O6(str, lb, c2516bc);
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC2528bo> withDelta(double d4) {
        return new UserProfileUpdate<>(new C2799m6(this.f40662a.f38052c, d4));
    }
}
