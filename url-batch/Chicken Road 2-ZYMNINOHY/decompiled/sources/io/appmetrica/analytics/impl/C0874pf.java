package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.pf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0874pf implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer fromModel(S7 s7) {
        int ordinal = s7.ordinal();
        if (ordinal == 1) {
            return 1;
        }
        if (ordinal != 2) {
            return ordinal != 3 ? 0 : 2;
        }
        return 3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S7 toModel(Integer num) {
        int intValue = num.intValue();
        if (intValue == 1) {
            return S7.f10933c;
        }
        if (intValue == 2) {
            return S7.f10935e;
        }
        if (intValue != 3) {
            return S7.f10932b;
        }
        return S7.f10934d;
    }
}
