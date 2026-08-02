package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: io.appmetrica.analytics.impl.v7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1021v7 implements ProtobufConverter {
    public final BigDecimal a(C0634g8 c0634g8) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0634g8 fromModel(BigDecimal bigDecimal) {
        BigInteger bigInteger = AbstractC1073x7.f13018a;
        int i4 = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (unscaledValue.compareTo(AbstractC1073x7.f13018a) <= 0 && unscaledValue.compareTo(AbstractC1073x7.f13019b) >= 0) {
                C1047w7 c1047w7 = new C1047w7(Long.valueOf(unscaledValue.longValue()).longValue(), Integer.valueOf(i4).intValue());
                C0634g8 c0634g8 = new C0634g8();
                c0634g8.f11911a = c1047w7.f12922a;
                c0634g8.f11912b = c1047w7.f12923b;
                return c0634g8;
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            i4++;
        }
    }
}
