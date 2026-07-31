package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.qf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0456qf implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer fromModel(T7 t7) {
        int ordinal = t7.ordinal();
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
    public final T7 toModel(Integer num) {
        int intValue = num.intValue();
        if (intValue == 1) {
            return T7.c;
        }
        if (intValue == 2) {
            return T7.e;
        }
        if (intValue != 3) {
            return T7.b;
        }
        return T7.d;
    }
}
