package com.google.common.math;

import com.github.mikephil.charting.utils.i;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.LazyInit;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
/* loaded from: classes4.dex */
public abstract class LinearTransformation {

    public static final class LinearTransformationBuilder {

        /* renamed from: x1, reason: collision with root package name */
        private final double f15045x1;

        /* renamed from: y1, reason: collision with root package name */
        private final double f15046y1;

        public LinearTransformation and(double d8, double d9) {
            Preconditions.checkArgument(DoubleUtils.isFinite(d8) && DoubleUtils.isFinite(d9));
            double d10 = this.f15045x1;
            if (d8 != d10) {
                return withSlope((d9 - this.f15046y1) / (d8 - d10));
            }
            Preconditions.checkArgument(d9 != this.f15046y1);
            return new VerticalLinearTransformation(this.f15045x1);
        }

        public LinearTransformation withSlope(double d8) {
            Preconditions.checkArgument(!Double.isNaN(d8));
            return DoubleUtils.isFinite(d8) ? new RegularLinearTransformation(d8, this.f15046y1 - (this.f15045x1 * d8)) : new VerticalLinearTransformation(this.f15045x1);
        }

        private LinearTransformationBuilder(double d8, double d9) {
            this.f15045x1 = d8;
            this.f15046y1 = d9;
        }
    }

    private static final class NaNLinearTransformation extends LinearTransformation {
        static final NaNLinearTransformation INSTANCE = new NaNLinearTransformation();

        private NaNLinearTransformation() {
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
            return this;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
            return Double.NaN;
        }

        public String toString() {
            return "NaN";
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d8) {
            return Double.NaN;
        }
    }

    private static final class RegularLinearTransformation extends LinearTransformation {

        @CheckForNull
        @LazyInit
        LinearTransformation inverse;
        final double slope;
        final double yIntercept;

        RegularLinearTransformation(double d8, double d9) {
            this.slope = d8;
            this.yIntercept = d9;
            this.inverse = null;
        }

        private LinearTransformation createInverse() {
            double d8 = this.slope;
            return d8 != i.DOUBLE_EPSILON ? new RegularLinearTransformation(1.0d / d8, (this.yIntercept * (-1.0d)) / d8, this) : new VerticalLinearTransformation(this.yIntercept, this);
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
            LinearTransformation linearTransformation = this.inverse;
            if (linearTransformation != null) {
                return linearTransformation;
            }
            LinearTransformation createInverse = createInverse();
            this.inverse = createInverse;
            return createInverse;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
            return this.slope == i.DOUBLE_EPSILON;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
            return this.slope;
        }

        public String toString() {
            return String.format("y = %g * x + %g", Double.valueOf(this.slope), Double.valueOf(this.yIntercept));
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d8) {
            return (d8 * this.slope) + this.yIntercept;
        }

        RegularLinearTransformation(double d8, double d9, LinearTransformation linearTransformation) {
            this.slope = d8;
            this.yIntercept = d9;
            this.inverse = linearTransformation;
        }
    }

    private static final class VerticalLinearTransformation extends LinearTransformation {

        @CheckForNull
        @LazyInit
        LinearTransformation inverse;

        /* renamed from: x, reason: collision with root package name */
        final double f15047x;

        VerticalLinearTransformation(double d8) {
            this.f15047x = d8;
            this.inverse = null;
        }

        private LinearTransformation createInverse() {
            return new RegularLinearTransformation(i.DOUBLE_EPSILON, this.f15047x, this);
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
            LinearTransformation linearTransformation = this.inverse;
            if (linearTransformation != null) {
                return linearTransformation;
            }
            LinearTransformation createInverse = createInverse();
            this.inverse = createInverse;
            return createInverse;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
            return true;
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
            throw new IllegalStateException();
        }

        public String toString() {
            return String.format("x = %g", Double.valueOf(this.f15047x));
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d8) {
            throw new IllegalStateException();
        }

        VerticalLinearTransformation(double d8, LinearTransformation linearTransformation) {
            this.f15047x = d8;
            this.inverse = linearTransformation;
        }
    }

    public static LinearTransformation forNaN() {
        return NaNLinearTransformation.INSTANCE;
    }

    public static LinearTransformation horizontal(double d8) {
        Preconditions.checkArgument(DoubleUtils.isFinite(d8));
        return new RegularLinearTransformation(i.DOUBLE_EPSILON, d8);
    }

    public static LinearTransformationBuilder mapping(double d8, double d9) {
        Preconditions.checkArgument(DoubleUtils.isFinite(d8) && DoubleUtils.isFinite(d9));
        return new LinearTransformationBuilder(d8, d9);
    }

    public static LinearTransformation vertical(double d8) {
        Preconditions.checkArgument(DoubleUtils.isFinite(d8));
        return new VerticalLinearTransformation(d8);
    }

    public abstract LinearTransformation inverse();

    public abstract boolean isHorizontal();

    public abstract boolean isVertical();

    public abstract double slope();

    public abstract double transform(double d8);
}
