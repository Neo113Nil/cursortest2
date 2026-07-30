package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.primitives.Booleans;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.util.Comparator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class ComparisonChain {
    private static final ComparisonChain ACTIVE = new ComparisonChain() { // from class: com.google.common.collect.ComparisonChain.1
        ComparisonChain classify(int i8) {
            return i8 < 0 ? ComparisonChain.LESS : i8 > 0 ? ComparisonChain.GREATER : ComparisonChain.ACTIVE;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(Comparable<?> comparable, Comparable<?> comparable2) {
            return classify(comparable.compareTo(comparable2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareFalseFirst(boolean z7, boolean z8) {
            return classify(Booleans.compare(z7, z8));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareTrueFirst(boolean z7, boolean z8) {
            return classify(Booleans.compare(z8, z7));
        }

        @Override // com.google.common.collect.ComparisonChain
        public int result() {
            return 0;
        }

        @Override // com.google.common.collect.ComparisonChain
        public <T> ComparisonChain compare(@ParametricNullness T t7, @ParametricNullness T t8, Comparator<T> comparator) {
            return classify(comparator.compare(t7, t8));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(int i8, int i9) {
            return classify(Ints.compare(i8, i9));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(long j8, long j9) {
            return classify(Longs.compare(j8, j9));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(float f8, float f9) {
            return classify(Float.compare(f8, f9));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(double d8, double d9) {
            return classify(Double.compare(d8, d9));
        }
    };
    private static final ComparisonChain LESS = new InactiveComparisonChain(-1);
    private static final ComparisonChain GREATER = new InactiveComparisonChain(1);

    private static final class InactiveComparisonChain extends ComparisonChain {
        final int result;

        InactiveComparisonChain(int i8) {
            super();
            this.result = i8;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(double d8, double d9) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareFalseFirst(boolean z7, boolean z8) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareTrueFirst(boolean z7, boolean z8) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public int result() {
            return this.result;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(float f8, float f9) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(int i8, int i9) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(long j8, long j9) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(Comparable<?> comparable, Comparable<?> comparable2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public <T> ComparisonChain compare(@ParametricNullness T t7, @ParametricNullness T t8, Comparator<T> comparator) {
            return this;
        }
    }

    private ComparisonChain() {
    }

    public static ComparisonChain start() {
        return ACTIVE;
    }

    public abstract ComparisonChain compare(double d8, double d9);

    public abstract ComparisonChain compare(float f8, float f9);

    public abstract ComparisonChain compare(int i8, int i9);

    public abstract ComparisonChain compare(long j8, long j9);

    @Deprecated
    public final ComparisonChain compare(Boolean bool, Boolean bool2) {
        return compareFalseFirst(bool.booleanValue(), bool2.booleanValue());
    }

    public abstract ComparisonChain compare(Comparable<?> comparable, Comparable<?> comparable2);

    public abstract <T> ComparisonChain compare(@ParametricNullness T t7, @ParametricNullness T t8, Comparator<T> comparator);

    public abstract ComparisonChain compareFalseFirst(boolean z7, boolean z8);

    public abstract ComparisonChain compareTrueFirst(boolean z7, boolean z8);

    public abstract int result();
}
