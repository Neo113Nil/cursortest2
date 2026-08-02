package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.p9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0868p9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0816n9 fromModel(C0842o9 c0842o9) {
        C0816n9 c0816n9 = new C0816n9();
        String str = c0842o9.f12506a;
        if (str != null) {
            c0816n9.f12416a = str.getBytes();
        }
        return c0816n9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0842o9 toModel(C0816n9 c0816n9) {
        return new C0842o9(new String(c0816n9.f12416a));
    }
}
