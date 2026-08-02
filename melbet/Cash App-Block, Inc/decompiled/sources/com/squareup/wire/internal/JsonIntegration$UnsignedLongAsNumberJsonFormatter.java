package com.squareup.wire.internal;

import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public final class JsonIntegration$UnsignedLongAsNumberJsonFormatter implements JsonFormatter {
    public static final JsonIntegration$UnsignedLongAsNumberJsonFormatter INSTANCE = new JsonIntegration$UnsignedLongAsNumberJsonFormatter();
    public static final BigInteger power64 = new BigInteger("18446744073709551616");
    public static final BigInteger maxLong = BigInteger.valueOf(Long.MAX_VALUE);

    @Override // com.squareup.wire.internal.JsonFormatter
    public final Long fromString(String str) {
        BigInteger bigInteger;
        try {
            bigInteger = new BigInteger(str);
        } catch (Exception unused) {
            bigInteger = new BigDecimal(str).toBigInteger();
        }
        return Long.valueOf(bigInteger.compareTo(maxLong) > 0 ? bigInteger.subtract(power64).longValue() : bigInteger.longValue());
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public final Object toStringOrNumber(Object obj) {
        long longValue = ((Number) obj).longValue();
        return longValue < 0 ? power64.add(BigInteger.valueOf(longValue)) : Long.valueOf(longValue);
    }
}
