package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class D7 implements ProtobufConverter {
    public final BigDecimal a(C0818m8 c0818m8) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0818m8 fromModel(BigDecimal bigDecimal) {
        BigInteger bigInteger = F7.f6778a;
        int i2 = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (unscaledValue.compareTo(F7.f6778a) <= 0 && unscaledValue.compareTo(F7.f6779b) >= 0) {
                Long valueOf = Long.valueOf(unscaledValue.longValue());
                Integer valueOf2 = Integer.valueOf(i2);
                E7 e7 = new E7(valueOf2.intValue(), valueOf.longValue());
                C0818m8 c0818m8 = new C0818m8();
                c0818m8.f8775a = e7.f6741a;
                c0818m8.f8776b = e7.f6742b;
                return c0818m8;
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            i2++;
        }
    }
}
