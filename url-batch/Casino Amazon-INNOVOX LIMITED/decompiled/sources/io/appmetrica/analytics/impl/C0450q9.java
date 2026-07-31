package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.q9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0450q9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0400o9 fromModel(C0425p9 c0425p9) {
        C0400o9 c0400o9 = new C0400o9();
        String str = c0425p9.f1429a;
        if (str != null) {
            c0400o9.f1411a = str.getBytes();
        }
        return c0400o9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0425p9 toModel(C0400o9 c0400o9) {
        return new C0425p9(new String(c0400o9.f1411a));
    }
}
