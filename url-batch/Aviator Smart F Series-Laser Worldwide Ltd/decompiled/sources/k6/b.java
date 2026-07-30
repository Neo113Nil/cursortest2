package k6;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public abstract class b {
    private static final boolean durationAssertionsEnabled = false;
    private static final ThreadLocal<DecimalFormat>[] precisionFormats;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i8 = 0; i8 < 4; i8++) {
            threadLocalArr[i8] = new ThreadLocal<>();
        }
        precisionFormats = threadLocalArr;
    }

    private static final DecimalFormat createFormatForDecimals(int i8) {
        DecimalFormat decimalFormat = new DecimalFormat("0");
        if (i8 > 0) {
            decimalFormat.setMinimumFractionDigits(i8);
        }
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat;
    }

    public static final String formatToExactDecimals(double d8, int i8) {
        DecimalFormat createFormatForDecimals;
        ThreadLocal<DecimalFormat>[] threadLocalArr = precisionFormats;
        if (i8 < threadLocalArr.length) {
            ThreadLocal<DecimalFormat> threadLocal = threadLocalArr[i8];
            DecimalFormat decimalFormat = threadLocal.get();
            if (decimalFormat == null) {
                decimalFormat = createFormatForDecimals(i8);
                threadLocal.set(decimalFormat);
            } else {
                s.checkNotNullExpressionValue(decimalFormat, "get() ?: default().also(this::set)");
            }
            createFormatForDecimals = decimalFormat;
        } else {
            createFormatForDecimals = createFormatForDecimals(i8);
        }
        String format = createFormatForDecimals.format(d8);
        s.checkNotNullExpressionValue(format, "format.format(value)");
        return format;
    }

    public static final String formatUpToDecimals(double d8, int i8) {
        DecimalFormat createFormatForDecimals = createFormatForDecimals(0);
        createFormatForDecimals.setMaximumFractionDigits(i8);
        String format = createFormatForDecimals.format(d8);
        s.checkNotNullExpressionValue(format, "createFormatForDecimals(… }\n        .format(value)");
        return format;
    }

    public static final boolean getDurationAssertionsEnabled() {
        return durationAssertionsEnabled;
    }
}
