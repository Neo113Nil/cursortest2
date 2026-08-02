package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes.dex */
public final class Cl implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z5 fromModel(Dl dl) {
        Z5 z5 = new Z5();
        z5.f11340a = (String) WrapUtils.getOrDefault(dl.f10218a, z5.f11340a);
        z5.f11341b = (String) WrapUtils.getOrDefault(dl.f10219b, z5.f11341b);
        z5.f11342c = ((Integer) WrapUtils.getOrDefault(dl.f10220c, Integer.valueOf(z5.f11342c))).intValue();
        z5.f11345f = ((Integer) WrapUtils.getOrDefault(dl.f10221d, Integer.valueOf(z5.f11345f))).intValue();
        z5.f11343d = (String) WrapUtils.getOrDefault(dl.f10222e, z5.f11343d);
        z5.f11344e = ((Boolean) WrapUtils.getOrDefault(dl.f10223f, Boolean.valueOf(z5.f11344e))).booleanValue();
        return z5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Dl a(Z5 z5) {
        throw new UnsupportedOperationException();
    }
}
