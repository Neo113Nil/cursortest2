package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes.dex */
public final class Gl implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0661g6 fromModel(Hl hl) {
        C0661g6 c0661g6 = new C0661g6();
        c0661g6.f8228a = (String) WrapUtils.getOrDefault(hl.f6890a, c0661g6.f8228a);
        c0661g6.f8229b = (String) WrapUtils.getOrDefault(hl.f6891b, c0661g6.f8229b);
        c0661g6.f8230c = ((Integer) WrapUtils.getOrDefault(hl.f6892c, Integer.valueOf(c0661g6.f8230c))).intValue();
        c0661g6.f8233f = ((Integer) WrapUtils.getOrDefault(hl.f6893d, Integer.valueOf(c0661g6.f8233f))).intValue();
        c0661g6.f8231d = (String) WrapUtils.getOrDefault(hl.f6894e, c0661g6.f8231d);
        c0661g6.f8232e = ((Boolean) WrapUtils.getOrDefault(hl.f6895f, Boolean.valueOf(c0661g6.f8232e))).booleanValue();
        return c0661g6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Hl a(C0661g6 c0661g6) {
        throw new UnsupportedOperationException();
    }
}
