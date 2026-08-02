package com.squareup.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/* loaded from: classes5.dex */
public abstract class BigDecimalsKt {
    public static final DecimalFormat bigDecimalPrettyFormat = new DecimalFormat("#,##0.##########");
    public static final DecimalFormat bigDecimalPrettyFormatWithTwoDecimals = new DecimalFormat("#,##0.00########");

    public static final String toPrettyString(BigDecimal bigDecimal, boolean z) {
        bigDecimal.getClass();
        if (z) {
            String format2 = bigDecimalPrettyFormatWithTwoDecimals.format(bigDecimal);
            format2.getClass();
            return format2;
        }
        String format3 = bigDecimalPrettyFormat.format(bigDecimal);
        format3.getClass();
        return format3;
    }
}
