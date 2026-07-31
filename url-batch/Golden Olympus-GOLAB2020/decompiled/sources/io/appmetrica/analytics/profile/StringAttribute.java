package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.In;
import io.appmetrica.analytics.impl.InterfaceC2528bo;
import io.appmetrica.analytics.impl.InterfaceC2873p2;
import io.appmetrica.analytics.impl.InterfaceC2895po;
import io.appmetrica.analytics.impl.N4;
import io.appmetrica.analytics.impl.O6;
import io.appmetrica.analytics.impl.Oi;
import io.appmetrica.analytics.impl.Wm;
import io.appmetrica.analytics.impl.Xm;
import io.appmetrica.analytics.impl.Yk;

/* loaded from: classes3.dex */
public class StringAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final In f40667a;

    /* renamed from: b, reason: collision with root package name */
    private final O6 f40668b;

    StringAttribute(String str, Wm wm, InterfaceC2895po interfaceC2895po, InterfaceC2873p2 interfaceC2873p2) {
        this.f40668b = new O6(str, interfaceC2895po, interfaceC2873p2);
        this.f40667a = wm;
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC2528bo> withValue(@NonNull String str) {
        O6 o6 = this.f40668b;
        return new UserProfileUpdate<>(new Xm(o6.f38052c, str, this.f40667a, o6.f38050a, new N4(o6.f38051b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC2528bo> withValueIfUndefined(@NonNull String str) {
        O6 o6 = this.f40668b;
        return new UserProfileUpdate<>(new Xm(o6.f38052c, str, this.f40667a, o6.f38050a, new Yk(o6.f38051b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC2528bo> withValueReset() {
        O6 o6 = this.f40668b;
        return new UserProfileUpdate<>(new Oi(0, o6.f38052c, o6.f38050a, o6.f38051b));
    }
}
