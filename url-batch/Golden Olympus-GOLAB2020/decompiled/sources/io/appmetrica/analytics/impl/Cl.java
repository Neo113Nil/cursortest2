package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes3.dex */
public final class Cl implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3032v6 fromModel(@NonNull Dl dl) {
        C3032v6 c3032v6 = new C3032v6();
        c3032v6.f39962a = (String) WrapUtils.getOrDefault(dl.f37377a, c3032v6.f39962a);
        c3032v6.f39963b = (String) WrapUtils.getOrDefault(dl.f37378b, c3032v6.f39963b);
        c3032v6.f39964c = ((Integer) WrapUtils.getOrDefault(dl.f37379c, Integer.valueOf(c3032v6.f39964c))).intValue();
        c3032v6.f39967f = ((Integer) WrapUtils.getOrDefault(dl.f37380d, Integer.valueOf(c3032v6.f39967f))).intValue();
        c3032v6.f39965d = (String) WrapUtils.getOrDefault(dl.f37381e, c3032v6.f39965d);
        c3032v6.f39966e = ((Boolean) WrapUtils.getOrDefault(dl.f37382f, Boolean.valueOf(c3032v6.f39966e))).booleanValue();
        return c3032v6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final Dl a(@NonNull C3032v6 c3032v6) {
        throw new UnsupportedOperationException();
    }
}
