package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class D7 implements ProtobufConverter {
    public final BigDecimal a(C0667m8 c0667m8) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0667m8 fromModel(BigDecimal bigDecimal) {
        BigInteger bigInteger = F7.f5987a;
        int i3 = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (unscaledValue.compareTo(F7.f5987a) <= 0 && unscaledValue.compareTo(F7.f5988b) >= 0) {
                Long valueOf = Long.valueOf(unscaledValue.longValue());
                Integer valueOf2 = Integer.valueOf(i3);
                E7 e7 = new E7(valueOf2.intValue(), valueOf.longValue());
                C0667m8 c0667m8 = new C0667m8();
                c0667m8.f7865a = e7.f5952a;
                c0667m8.f7866b = e7.f5953b;
                return c0667m8;
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            i3++;
        }
    }
}
