package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;

/* compiled from: ComplexDouble.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a3\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "a", "b", "c", "Lkotlin/Pair;", "Landroidx/compose/animation/core/ComplexDouble;", "complexQuadraticFormula", "(DDD)Lkotlin/Pair;", "num", "complexSqrt", "(D)Landroidx/compose/animation/core/ComplexDouble;", "animation-core_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComplexDoubleKt {
    public static final Pair complexQuadraticFormula(double d, double d2, double d3) {
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        double d10;
        double d11;
        double d12 = -d2;
        double d13 = (d2 * d2) - ((4.0d * d) * d3);
        ComplexDouble complexSqrt = complexSqrt(d13);
        d4 = complexSqrt._real;
        complexSqrt._real = d4 + d12;
        double d14 = d * 2.0d;
        d5 = complexSqrt._real;
        complexSqrt._real = d5 / d14;
        d6 = complexSqrt._imaginary;
        complexSqrt._imaginary = d6 / d14;
        ComplexDouble complexSqrt2 = complexSqrt(d13);
        d7 = complexSqrt2._real;
        double d15 = -1;
        complexSqrt2._real = d7 * d15;
        d8 = complexSqrt2._imaginary;
        complexSqrt2._imaginary = d8 * d15;
        d9 = complexSqrt2._real;
        complexSqrt2._real = d9 + d12;
        d10 = complexSqrt2._real;
        complexSqrt2._real = d10 / d14;
        d11 = complexSqrt2._imaginary;
        complexSqrt2._imaginary = d11 / d14;
        return TuplesKt.to(complexSqrt, complexSqrt2);
    }

    public static final ComplexDouble complexSqrt(double d) {
        if (d < 0.0d) {
            return new ComplexDouble(0.0d, Math.sqrt(Math.abs(d)));
        }
        return new ComplexDouble(Math.sqrt(d), 0.0d);
    }
}
