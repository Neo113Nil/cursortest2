package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes3.dex */
public final class Im implements ProtobufConverter {
    @NonNull
    public final C3074wm a(@NonNull Hm hm) {
        C3074wm c3074wm = new C3074wm();
        c3074wm.f40099a = hm.f37674a;
        return c3074wm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object fromModel(@NonNull Object obj) {
        C3074wm c3074wm = new C3074wm();
        c3074wm.f40099a = ((Hm) obj).f37674a;
        return c3074wm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        return new Hm(((C3074wm) obj).f40099a);
    }

    @NonNull
    public final Hm a(@NonNull C3074wm c3074wm) {
        return new Hm(c3074wm.f40099a);
    }
}
