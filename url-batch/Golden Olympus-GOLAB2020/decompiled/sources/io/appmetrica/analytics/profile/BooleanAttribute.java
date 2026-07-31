package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C2977t3;
import io.appmetrica.analytics.impl.InterfaceC2528bo;
import io.appmetrica.analytics.impl.InterfaceC2873p2;
import io.appmetrica.analytics.impl.InterfaceC2895po;
import io.appmetrica.analytics.impl.N4;
import io.appmetrica.analytics.impl.O6;
import io.appmetrica.analytics.impl.Oi;
import io.appmetrica.analytics.impl.Yk;

/* loaded from: classes3.dex */
public class BooleanAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final O6 f40661a;

    BooleanAttribute(String str, InterfaceC2895po interfaceC2895po, InterfaceC2873p2 interfaceC2873p2) {
        this.f40661a = new O6(str, interfaceC2895po, interfaceC2873p2);
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC2528bo> withValue(boolean z4) {
        O6 o6 = this.f40661a;
        return new UserProfileUpdate<>(new C2977t3(o6.f38052c, z4, o6.f38050a, new N4(o6.f38051b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC2528bo> withValueIfUndefined(boolean z4) {
        O6 o6 = this.f40661a;
        return new UserProfileUpdate<>(new C2977t3(o6.f38052c, z4, o6.f38050a, new Yk(o6.f38051b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC2528bo> withValueReset() {
        O6 o6 = this.f40661a;
        return new UserProfileUpdate<>(new Oi(3, o6.f38052c, o6.f38050a, o6.f38051b));
    }
}
