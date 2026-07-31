package io.opentelemetry.sdk.metrics.internal.aggregator;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* loaded from: classes3.dex */
final class Base2ExponentialHistogramIndexer {
    private static final int EXPONENT_BIAS = 1023;
    private static final long EXPONENT_BIT_MASK = 9218868437227405312L;
    private static final int EXPONENT_WIDTH = 11;
    private static final long SIGNIFICAND_BIT_MASK = 4503599627370495L;
    private static final int SIGNIFICAND_WIDTH = 52;
    private final int scale;
    private final double scaleFactor;
    private static final Map<Integer, Base2ExponentialHistogramIndexer> cache = new ConcurrentHashMap();
    private static final double LOG_BASE2_E = 1.0d / Math.log(2.0d);

    public static /* synthetic */ Base2ExponentialHistogramIndexer $r8$lambda$oH3SirdZoBJ8COgO7GPKLYzp4gI(int i) {
        return new Base2ExponentialHistogramIndexer(i);
    }

    private Base2ExponentialHistogramIndexer(int i) {
        this.scale = i;
        this.scaleFactor = computeScaleFactor(i);
    }

    static Base2ExponentialHistogramIndexer get(int i) {
        return cache.computeIfAbsent(Integer.valueOf(i), new Function() { // from class: io.opentelemetry.sdk.metrics.internal.aggregator.Base2ExponentialHistogramIndexer$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Base2ExponentialHistogramIndexer.$r8$lambda$oH3SirdZoBJ8COgO7GPKLYzp4gI(((Integer) obj).intValue());
            }
        });
    }

    int computeIndex(double d) {
        double abs = Math.abs(d);
        int i = this.scale;
        if (i > 0) {
            return getIndexByLogarithm(abs);
        }
        if (i == 0) {
            return mapToIndexScaleZero(abs);
        }
        return mapToIndexScaleZero(abs) >> (-this.scale);
    }

    private int getIndexByLogarithm(double d) {
        return ((int) Math.ceil(Math.log(d) * this.scaleFactor)) - 1;
    }

    private static int mapToIndexScaleZero(double d) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        long j = (EXPONENT_BIT_MASK & doubleToLongBits) >> 52;
        long j2 = doubleToLongBits & SIGNIFICAND_BIT_MASK;
        if (j == 0) {
            j -= Long.numberOfLeadingZeros(j2 - 1) - 12;
        }
        int i = (int) (j - 1023);
        return j2 == 0 ? i - 1 : i;
    }

    private static double computeScaleFactor(int i) {
        return Math.scalb(LOG_BASE2_E, i);
    }
}
