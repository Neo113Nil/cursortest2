package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes3.dex */
public final class Df implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer fromModel(@NonNull EnumC2775l8 enumC2775l8) {
        int ordinal = enumC2775l8.ordinal();
        if (ordinal == 1) {
            return 1;
        }
        if (ordinal != 2) {
            return ordinal != 3 ? 0 : 2;
        }
        return 3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final EnumC2775l8 toModel(@NonNull Integer num) {
        int intValue = num.intValue();
        if (intValue == 1) {
            return EnumC2775l8.f39393c;
        }
        if (intValue == 2) {
            return EnumC2775l8.f39395e;
        }
        if (intValue != 3) {
            return EnumC2775l8.f39392b;
        }
        return EnumC2775l8.f39394d;
    }
}
