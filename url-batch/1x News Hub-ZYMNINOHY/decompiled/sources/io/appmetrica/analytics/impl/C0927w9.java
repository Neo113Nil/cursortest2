package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.w9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0927w9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0875u9 fromModel(C0901v9 c0901v9) {
        C0875u9 c0875u9 = new C0875u9();
        String str = c0901v9.f8507a;
        if (str != null) {
            c0875u9.f8419a = str.getBytes();
        }
        return c0875u9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0901v9 toModel(C0875u9 c0875u9) {
        return new C0901v9(new String(c0875u9.f8419a));
    }
}
