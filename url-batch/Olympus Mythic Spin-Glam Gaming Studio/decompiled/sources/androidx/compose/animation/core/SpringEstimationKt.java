package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: SpringEstimation.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a5\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a5\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\n\u001a;\u0010\u0010\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a;\u0010\u0012\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0011\u001a;\u0010\u0013\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0011\u001aC\u0010\u0015\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"", "stiffness", "dampingRatio", "initialVelocity", "initialDisplacement", "delta", "", "estimateAnimationDurationMillis", "(FFFFF)J", "", "(DDDDD)J", "Lkotlin/Pair;", "Landroidx/compose/animation/core/ComplexDouble;", "roots", "p0", "v0", "estimateUnderDamped", "(Lkotlin/Pair;DDD)D", "estimateCriticallyDamped", "estimateOverDamped", "initialPosition", "estimateDurationInternal", "(Lkotlin/Pair;DDDD)J", "animation-core_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SpringEstimationKt {
    public static final long estimateAnimationDurationMillis(float f, float f2, float f3, float f4, float f5) {
        return estimateAnimationDurationMillis(f, f2, f3, f4, f5);
    }

    public static final long estimateAnimationDurationMillis(double d, double d2, double d3, double d4, double d5) {
        return estimateDurationInternal(ComplexDoubleKt.complexQuadraticFormula(1.0d, 2.0d * d2 * Math.sqrt(d), d), d2, d3, d4, d5);
    }

    private static final double estimateUnderDamped(Pair pair, double d, double d2, double d3) {
        double d4 = ((ComplexDouble) pair.getFirst()).get_real();
        double d5 = (d2 - (d4 * d)) / ((ComplexDouble) pair.getFirst()).get_imaginary();
        return Math.log(d3 / Math.sqrt((d * d) + (d5 * d5))) / d4;
    }

    private static final double estimateCriticallyDamped(Pair pair, final double d, double d2, double d3) {
        double d4;
        final double d5;
        Function1 function1;
        Function1 function12;
        double d6;
        final double d7 = ((ComplexDouble) pair.getFirst()).get_real();
        double d8 = d7 * d;
        final double d9 = d2 - d8;
        double log = Math.log(Math.abs(d3 / d)) / d7;
        double estimateCriticallyDamped$t2Iterate = estimateCriticallyDamped$t2Iterate(Math.log(Math.abs(d3 / d9)), d7) / d7;
        int i = 0;
        if ((Double.isInfinite(log) || Double.isNaN(log)) ? false : true) {
            if ((Double.isInfinite(estimateCriticallyDamped$t2Iterate) || Double.isNaN(estimateCriticallyDamped$t2Iterate)) ? false : true) {
                log = Math.max(log, estimateCriticallyDamped$t2Iterate);
            }
            d4 = log;
        } else {
            d4 = estimateCriticallyDamped$t2Iterate;
        }
        double d10 = (-(d8 + d9)) / (d7 * d9);
        if (!Double.isNaN(d10) && d10 > 0.0d) {
            if (d10 <= 0.0d || (-estimateCriticallyDamped$xInflection(d, d7, d10, d9)) >= d3) {
                d4 = (-(2.0d / d7)) - (d / d9);
                d5 = d3;
                function1 = new Function1() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fn$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @NotNull
                    public final Double invoke(double d11) {
                        return Double.valueOf(((d + (d9 * d11)) * Math.exp(d7 * d11)) + d5);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Number) obj).doubleValue());
                    }
                };
                function12 = new Function1() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fnPrime$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @NotNull
                    public final Double invoke(double d11) {
                        double d12 = d9;
                        double d13 = d7;
                        return Double.valueOf(((d12 * ((d13 * d11) + 1)) + (d * d13)) * Math.exp(d13 * d11));
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Number) obj).doubleValue());
                    }
                };
                d6 = Double.MAX_VALUE;
                while (d6 > 0.001d && i < 100) {
                    i++;
                    double doubleValue = d4 - (((Number) function1.invoke(Double.valueOf(d4))).doubleValue() / ((Number) function12.invoke(Double.valueOf(d4))).doubleValue());
                    double abs = Math.abs(d4 - doubleValue);
                    d4 = doubleValue;
                    d6 = abs;
                }
                return d4;
            }
            if (d9 < 0.0d && d > 0.0d) {
                d4 = 0.0d;
            }
        }
        d5 = -d3;
        function1 = new Function1() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fn$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @NotNull
            public final Double invoke(double d11) {
                return Double.valueOf(((d + (d9 * d11)) * Math.exp(d7 * d11)) + d5);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).doubleValue());
            }
        };
        function12 = new Function1() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fnPrime$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @NotNull
            public final Double invoke(double d11) {
                double d12 = d9;
                double d13 = d7;
                return Double.valueOf(((d12 * ((d13 * d11) + 1)) + (d * d13)) * Math.exp(d13 * d11));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).doubleValue());
            }
        };
        d6 = Double.MAX_VALUE;
        while (d6 > 0.001d) {
            i++;
            double doubleValue2 = d4 - (((Number) function1.invoke(Double.valueOf(d4))).doubleValue() / ((Number) function12.invoke(Double.valueOf(d4))).doubleValue());
            double abs2 = Math.abs(d4 - doubleValue2);
            d4 = doubleValue2;
            d6 = abs2;
        }
        return d4;
    }

    private static final double estimateCriticallyDamped$t2Iterate(double d, double d2) {
        double d3 = d;
        for (int i = 0; i < 6; i++) {
            d3 = d - Math.log(Math.abs(d3 / d2));
        }
        return d3;
    }

    private static final double estimateCriticallyDamped$xInflection(double d, double d2, double d3, double d4) {
        double d5 = d2 * d3;
        return (d * Math.exp(d5)) + (d4 * d3 * Math.exp(d5));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final double estimateOverDamped(Pair pair, double d, double d2, double d3) {
        double d4;
        double d5;
        Function1 function1;
        double d6 = d3;
        final double d7 = ((ComplexDouble) pair.getFirst()).get_real();
        final double d8 = ((ComplexDouble) pair.getSecond()).get_real();
        double d9 = d7 - d8;
        double d10 = ((d7 * d) - d2) / d9;
        final double d11 = d - d10;
        double log = Math.log(Math.abs(d6 / d11)) / d7;
        double log2 = Math.log(Math.abs(d6 / d10)) / d8;
        if ((Double.isInfinite(log) || Double.isNaN(log)) ? false : true) {
            if ((Double.isInfinite(log2) || Double.isNaN(log2)) ? false : true) {
                log = Math.max(log, log2);
            }
            d4 = log;
        } else {
            d4 = log2;
        }
        double d12 = d11 * d7;
        double log3 = Math.log(d12 / ((-d10) * d8)) / (d8 - d7);
        if (!Double.isNaN(log3) && log3 > 0.0d) {
            if (log3 > 0.0d) {
                d5 = d10;
                if ((-m115estimateOverDamped$xInflection0(d11, d7, log3, d10, d8)) < d6) {
                    if (d5 > 0.0d && d11 < 0.0d) {
                        d4 = 0.0d;
                    }
                }
            } else {
                d5 = d10;
            }
            d4 = Math.log((-((d5 * d8) * d8)) / (d12 * d7)) / d9;
            final double d13 = d6;
            final double d14 = d5;
            function1 = new Function1() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateOverDamped$fn$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @NotNull
                public final Double invoke(double d15) {
                    return Double.valueOf((d11 * Math.exp(d7 * d15)) + (d14 * Math.exp(d8 * d15)) + d13);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).doubleValue());
                }
            };
            Function1 function12 = new Function1() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateOverDamped$fnPrime$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @NotNull
                public final Double invoke(double d15) {
                    double d16 = d11;
                    double d17 = d7;
                    double exp = d16 * d17 * Math.exp(d17 * d15);
                    double d18 = d14;
                    double d19 = d8;
                    return Double.valueOf(exp + (d18 * d19 * Math.exp(d19 * d15)));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).doubleValue());
                }
            };
            if (Math.abs(((Number) function1.invoke(Double.valueOf(d4))).doubleValue()) >= 1.0E-4d) {
                return d4;
            }
            double d15 = Double.MAX_VALUE;
            int i = 0;
            while (d15 > 0.001d && i < 100) {
                i++;
                double doubleValue = d4 - (((Number) function1.invoke(Double.valueOf(d4))).doubleValue() / ((Number) function12.invoke(Double.valueOf(d4))).doubleValue());
                double abs = Math.abs(d4 - doubleValue);
                d4 = doubleValue;
                d15 = abs;
            }
            return d4;
        }
        d5 = d10;
        d6 = -d6;
        final double d132 = d6;
        final double d142 = d5;
        function1 = new Function1() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateOverDamped$fn$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @NotNull
            public final Double invoke(double d152) {
                return Double.valueOf((d11 * Math.exp(d7 * d152)) + (d142 * Math.exp(d8 * d152)) + d132);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).doubleValue());
            }
        };
        Function1 function122 = new Function1() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateOverDamped$fnPrime$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @NotNull
            public final Double invoke(double d152) {
                double d16 = d11;
                double d17 = d7;
                double exp = d16 * d17 * Math.exp(d17 * d152);
                double d18 = d142;
                double d19 = d8;
                return Double.valueOf(exp + (d18 * d19 * Math.exp(d19 * d152)));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).doubleValue());
            }
        };
        if (Math.abs(((Number) function1.invoke(Double.valueOf(d4))).doubleValue()) >= 1.0E-4d) {
        }
    }

    /* renamed from: estimateOverDamped$xInflection-0, reason: not valid java name */
    private static final double m115estimateOverDamped$xInflection0(double d, double d2, double d3, double d4, double d5) {
        return (d * Math.exp(d2 * d3)) + (d4 * Math.exp(d5 * d3));
    }

    private static final long estimateDurationInternal(Pair pair, double d, double d2, double d3, double d4) {
        double estimateCriticallyDamped;
        if (d3 == 0.0d && d2 == 0.0d) {
            return 0L;
        }
        if (d3 < 0.0d) {
            d2 = -d2;
        }
        double d5 = d2;
        double abs = Math.abs(d3);
        if (d > 1.0d) {
            estimateCriticallyDamped = estimateOverDamped(pair, abs, d5, d4);
        } else if (d < 1.0d) {
            estimateCriticallyDamped = estimateUnderDamped(pair, abs, d5, d4);
        } else {
            estimateCriticallyDamped = estimateCriticallyDamped(pair, abs, d5, d4);
        }
        return (long) (estimateCriticallyDamped * 1000.0d);
    }
}
