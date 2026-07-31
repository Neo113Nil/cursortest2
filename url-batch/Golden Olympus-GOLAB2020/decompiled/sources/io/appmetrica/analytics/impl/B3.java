package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes3.dex */
public final class B3 implements ProtobufConverter {
    @NonNull
    public final C2893pm a(@NonNull C3133z3 c3133z3) {
        C2893pm c2893pm = new C2893pm();
        c2893pm.f39632a = c3133z3.f40301a;
        return c2893pm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object fromModel(@NonNull Object obj) {
        C2893pm c2893pm = new C2893pm();
        c2893pm.f39632a = ((C3133z3) obj).f40301a;
        return c2893pm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        return new C3133z3(((C2893pm) obj).f39632a);
    }

    @NonNull
    public final C3133z3 a(@NonNull C2893pm c2893pm) {
        return new C3133z3(c2893pm.f39632a);
    }
}
