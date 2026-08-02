package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes.dex */
public final class Gl implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0510g6 fromModel(Hl hl) {
        C0510g6 c0510g6 = new C0510g6();
        c0510g6.f7358a = (String) WrapUtils.getOrDefault(hl.f6095a, c0510g6.f7358a);
        c0510g6.f7359b = (String) WrapUtils.getOrDefault(hl.f6096b, c0510g6.f7359b);
        c0510g6.f7360c = ((Integer) WrapUtils.getOrDefault(hl.f6097c, Integer.valueOf(c0510g6.f7360c))).intValue();
        c0510g6.f = ((Integer) WrapUtils.getOrDefault(hl.f6098d, Integer.valueOf(c0510g6.f))).intValue();
        c0510g6.f7361d = (String) WrapUtils.getOrDefault(hl.f6099e, c0510g6.f7361d);
        c0510g6.f7362e = ((Boolean) WrapUtils.getOrDefault(hl.f, Boolean.valueOf(c0510g6.f7362e))).booleanValue();
        return c0510g6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Hl a(C0510g6 c0510g6) {
        throw new UnsupportedOperationException();
    }
}
