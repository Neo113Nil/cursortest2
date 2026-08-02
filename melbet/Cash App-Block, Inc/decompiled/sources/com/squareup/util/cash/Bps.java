package com.squareup.util.cash;

import com.squareup.protos.common.Money;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class Bps {
    public static final DecimalFormat DISPLAY_FORMAT = new DecimalFormat("#.##'%'");
    public static final MathContext FEE_CONTEXT = new MathContext(0, RoundingMode.HALF_EVEN);
    public static final BigDecimal BPS_PER_UNIT = BigDecimal.valueOf(10000L);

    public static long applyFee(boolean z, long j, long j2) {
        BigDecimal bigDecimal = BPS_PER_UNIT;
        return z ? BigDecimal.valueOf(j).multiply(BigDecimal.valueOf(j2)).divide(bigDecimal, 0, RoundingMode.HALF_EVEN).longValue() : BigDecimal.valueOf(j * j2).divide(bigDecimal, FEE_CONTEXT).setScale(0, RoundingMode.HALF_EVEN).longValue();
    }

    public static Money computeFee$default(Money money, Iterable iterable) {
        money.getClass();
        iterable.getClass();
        Iterator it = iterable.iterator();
        long j = 0;
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            Long l = money.amount;
            l.getClass();
            j += applyFee(false, l.longValue(), longValue);
        }
        return new Money(Long.valueOf(j), money.currency_code, 4);
    }
}
