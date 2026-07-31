package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C2516bc;
import io.appmetrica.analytics.impl.C3014ue;
import io.appmetrica.analytics.impl.H4;
import io.appmetrica.analytics.impl.InterfaceC2528bo;
import io.appmetrica.analytics.impl.Lb;
import io.appmetrica.analytics.impl.N4;
import io.appmetrica.analytics.impl.O6;
import io.appmetrica.analytics.impl.Oi;
import io.appmetrica.analytics.impl.Yk;

/* loaded from: classes3.dex */
public final class NumberAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final O6 f40666a;

    NumberAttribute(String str, Lb lb, C2516bc c2516bc) {
        this.f40666a = new O6(str, lb, c2516bc);
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC2528bo> withValue(double d4) {
        return new UserProfileUpdate<>(new C3014ue(this.f40666a.f38052c, d4, new Lb(), new N4(new C2516bc(new H4(100)))));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC2528bo> withValueIfUndefined(double d4) {
        return new UserProfileUpdate<>(new C3014ue(this.f40666a.f38052c, d4, new Lb(), new Yk(new C2516bc(new H4(100)))));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC2528bo> withValueReset() {
        return new UserProfileUpdate<>(new Oi(1, this.f40666a.f38052c, new Lb(), new C2516bc(new H4(100))));
    }
}
