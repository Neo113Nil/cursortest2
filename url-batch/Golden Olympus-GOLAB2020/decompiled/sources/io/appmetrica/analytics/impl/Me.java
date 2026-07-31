package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes3.dex */
public final class Me implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3022um fromModel(@NonNull Le le) {
        C3022um c3022um = new C3022um();
        c3022um.f39948a = le.f37920a;
        c3022um.f39949b = le.f37921b;
        return c3022um;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        C3022um c3022um = (C3022um) obj;
        return new Le(c3022um.f39948a, c3022um.f39949b);
    }

    @NonNull
    public final Le a(@NonNull C3022um c3022um) {
        return new Le(c3022um.f39948a, c3022um.f39949b);
    }
}
