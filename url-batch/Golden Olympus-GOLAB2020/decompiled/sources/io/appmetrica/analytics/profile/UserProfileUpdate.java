package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.InterfaceC2528bo;
import io.appmetrica.analytics.impl.Pd;

/* loaded from: classes3.dex */
public class UserProfileUpdate<T extends InterfaceC2528bo> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2528bo f40671a;

    UserProfileUpdate(Pd pd) {
        this.f40671a = pd;
    }

    @NonNull
    public T getUserProfileUpdatePatcher() {
        return (T) this.f40671a;
    }
}
