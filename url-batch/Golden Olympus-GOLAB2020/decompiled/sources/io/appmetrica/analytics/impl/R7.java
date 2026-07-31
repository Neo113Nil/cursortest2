package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.Pair;
import kotlin.TuplesKt;

/* loaded from: classes3.dex */
public final class R7 implements ProtobufConverter {
    @NonNull
    public final BigDecimal a(@NonNull A8 a8) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A8 fromModel(@NonNull BigDecimal bigDecimal) {
        BigInteger bigInteger = T7.f38297a;
        int i4 = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (unscaledValue.compareTo(T7.f38297a) <= 0 && unscaledValue.compareTo(T7.f38298b) >= 0) {
                Pair pair = TuplesKt.to(Long.valueOf(unscaledValue.longValue()), Integer.valueOf(i4));
                S7 s7 = new S7(((Number) pair.getSecond()).intValue(), ((Number) pair.getFirst()).longValue());
                A8 a8 = new A8();
                a8.f37165a = s7.f38246a;
                a8.f37166b = s7.f38247b;
                return a8;
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            i4++;
        }
    }
}
