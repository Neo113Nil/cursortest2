package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.Pair;
import kotlin.TuplesKt;

/* renamed from: io.appmetrica.analytics.impl.w7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0597w7 implements ProtobufConverter {
    public final BigDecimal a(C0221h8 c0221h8) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0221h8 fromModel(BigDecimal bigDecimal) {
        BigInteger bigInteger = AbstractC0647y7.f1580a;
        int i = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (unscaledValue.compareTo(AbstractC0647y7.f1580a) <= 0 && unscaledValue.compareTo(AbstractC0647y7.b) >= 0) {
                Pair pair = TuplesKt.to(Long.valueOf(unscaledValue.longValue()), Integer.valueOf(i));
                C0622x7 c0622x7 = new C0622x7(((Number) pair.getFirst()).longValue(), ((Number) pair.getSecond()).intValue());
                C0221h8 c0221h8 = new C0221h8();
                c0221h8.f1286a = c0622x7.f1562a;
                c0221h8.b = c0622x7.b;
                return c0221h8;
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            i++;
        }
    }
}
