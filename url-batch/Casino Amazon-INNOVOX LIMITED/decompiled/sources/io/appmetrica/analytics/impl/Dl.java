package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes3.dex */
public final class Dl implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0038a6 fromModel(El el) {
        C0038a6 c0038a6 = new C0038a6();
        c0038a6.f1158a = (String) WrapUtils.getOrDefault(el.f832a, c0038a6.f1158a);
        c0038a6.b = (String) WrapUtils.getOrDefault(el.b, c0038a6.b);
        c0038a6.c = ((Integer) WrapUtils.getOrDefault(el.c, Integer.valueOf(c0038a6.c))).intValue();
        c0038a6.f = ((Integer) WrapUtils.getOrDefault(el.d, Integer.valueOf(c0038a6.f))).intValue();
        c0038a6.d = (String) WrapUtils.getOrDefault(el.e, c0038a6.d);
        c0038a6.e = ((Boolean) WrapUtils.getOrDefault(el.f, Boolean.valueOf(c0038a6.e))).booleanValue();
        return c0038a6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final El a(C0038a6 c0038a6) {
        throw new UnsupportedOperationException();
    }
}
