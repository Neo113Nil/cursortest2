package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Ints;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
/* loaded from: classes4.dex */
public final class Quantiles {

    public static final class Scale {
        private final int scale;

        public ScaleAndIndex index(int i8) {
            return new ScaleAndIndex(this.scale, i8);
        }

        public ScaleAndIndexes indexes(int... iArr) {
            return new ScaleAndIndexes(this.scale, (int[]) iArr.clone());
        }

        private Scale(int i8) {
            Preconditions.checkArgument(i8 > 0, "Quantile scale must be positive");
            this.scale = i8;
        }

        public ScaleAndIndexes indexes(Collection<Integer> collection) {
            return new ScaleAndIndexes(this.scale, Ints.toArray(collection));
        }
    }

    public static final class ScaleAndIndex {
        private final int index;
        private final int scale;

        public double compute(Collection<? extends Number> collection) {
            return computeInPlace(Doubles.toArray(collection));
        }

        public double computeInPlace(double... dArr) {
            Preconditions.checkArgument(dArr.length > 0, "Cannot calculate quantiles of an empty dataset");
            if (Quantiles.containsNaN(dArr)) {
                return Double.NaN;
            }
            long length = this.index * (dArr.length - 1);
            int divide = (int) LongMath.divide(length, this.scale, RoundingMode.DOWN);
            int i8 = (int) (length - (divide * this.scale));
            Quantiles.selectInPlace(divide, dArr, 0, dArr.length - 1);
            if (i8 == 0) {
                return dArr[divide];
            }
            int i9 = divide + 1;
            Quantiles.selectInPlace(i9, dArr, i9, dArr.length - 1);
            return Quantiles.interpolate(dArr[divide], dArr[i9], i8, this.scale);
        }

        private ScaleAndIndex(int i8, int i9) {
            Quantiles.checkIndex(i9, i8);
            this.scale = i8;
            this.index = i9;
        }

        public double compute(double... dArr) {
            return computeInPlace((double[]) dArr.clone());
        }

        public double compute(long... jArr) {
            return computeInPlace(Quantiles.longsToDoubles(jArr));
        }

        public double compute(int... iArr) {
            return computeInPlace(Quantiles.intsToDoubles(iArr));
        }
    }

    public static final class ScaleAndIndexes {
        private final int[] indexes;
        private final int scale;

        public Map<Integer, Double> compute(Collection<? extends Number> collection) {
            return computeInPlace(Doubles.toArray(collection));
        }

        public Map<Integer, Double> computeInPlace(double... dArr) {
            int i8 = 0;
            int i9 = 1;
            Preconditions.checkArgument(dArr.length > 0, "Cannot calculate quantiles of an empty dataset");
            if (Quantiles.containsNaN(dArr)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int[] iArr = this.indexes;
                int length = iArr.length;
                while (i8 < length) {
                    linkedHashMap.put(Integer.valueOf(iArr[i8]), Double.valueOf(Double.NaN));
                    i8++;
                }
                return Collections.unmodifiableMap(linkedHashMap);
            }
            int[] iArr2 = this.indexes;
            int[] iArr3 = new int[iArr2.length];
            int[] iArr4 = new int[iArr2.length];
            int[] iArr5 = new int[iArr2.length * 2];
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i10 >= this.indexes.length) {
                    break;
                }
                long length2 = r5[i10] * (dArr.length - i9);
                int divide = (int) LongMath.divide(length2, this.scale, RoundingMode.DOWN);
                int i12 = i10;
                int i13 = (int) (length2 - (divide * this.scale));
                iArr3[i12] = divide;
                iArr4[i12] = i13;
                iArr5[i11] = divide;
                int i14 = i11 + 1;
                if (i13 != 0) {
                    iArr5[i14] = divide + 1;
                    i11 += 2;
                } else {
                    i11 = i14;
                }
                i10 = i12 + 1;
                i9 = 1;
            }
            Arrays.sort(iArr5, 0, i11);
            Quantiles.selectAllInPlace(iArr5, 0, i11 - 1, dArr, 0, dArr.length - 1);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            while (true) {
                int[] iArr6 = this.indexes;
                if (i8 >= iArr6.length) {
                    return Collections.unmodifiableMap(linkedHashMap2);
                }
                int i15 = iArr3[i8];
                int i16 = iArr4[i8];
                if (i16 == 0) {
                    linkedHashMap2.put(Integer.valueOf(iArr6[i8]), Double.valueOf(dArr[i15]));
                } else {
                    linkedHashMap2.put(Integer.valueOf(iArr6[i8]), Double.valueOf(Quantiles.interpolate(dArr[i15], dArr[i15 + 1], i16, this.scale)));
                }
                i8++;
            }
        }

        private ScaleAndIndexes(int i8, int[] iArr) {
            for (int i9 : iArr) {
                Quantiles.checkIndex(i9, i8);
            }
            Preconditions.checkArgument(iArr.length > 0, "Indexes must be a non empty array");
            this.scale = i8;
            this.indexes = iArr;
        }

        public Map<Integer, Double> compute(double... dArr) {
            return computeInPlace((double[]) dArr.clone());
        }

        public Map<Integer, Double> compute(long... jArr) {
            return computeInPlace(Quantiles.longsToDoubles(jArr));
        }

        public Map<Integer, Double> compute(int... iArr) {
            return computeInPlace(Quantiles.intsToDoubles(iArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkIndex(int i8, int i9) {
        if (i8 < 0 || i8 > i9) {
            StringBuilder sb = new StringBuilder(70);
            sb.append("Quantile indexes must be between 0 and the scale, which is ");
            sb.append(i9);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private static int chooseNextSelection(int[] iArr, int i8, int i9, int i10, int i11) {
        if (i8 == i9) {
            return i8;
        }
        int i12 = i10 + i11;
        int i13 = i12 >>> 1;
        while (i9 > i8 + 1) {
            int i14 = (i8 + i9) >>> 1;
            int i15 = iArr[i14];
            if (i15 > i13) {
                i9 = i14;
            } else {
                if (i15 >= i13) {
                    return i14;
                }
                i8 = i14;
            }
        }
        return (i12 - iArr[i8]) - iArr[i9] > 0 ? i9 : i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean containsNaN(double... dArr) {
        for (double d8 : dArr) {
            if (Double.isNaN(d8)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double interpolate(double d8, double d9, double d10, double d11) {
        if (d8 == Double.NEGATIVE_INFINITY) {
            return d9 == Double.POSITIVE_INFINITY ? Double.NaN : Double.NEGATIVE_INFINITY;
        }
        if (d9 == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        }
        return d8 + (((d9 - d8) * d10) / d11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double[] intsToDoubles(int[] iArr) {
        int length = iArr.length;
        double[] dArr = new double[length];
        for (int i8 = 0; i8 < length; i8++) {
            dArr[i8] = iArr[i8];
        }
        return dArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double[] longsToDoubles(long[] jArr) {
        int length = jArr.length;
        double[] dArr = new double[length];
        for (int i8 = 0; i8 < length; i8++) {
            dArr[i8] = jArr[i8];
        }
        return dArr;
    }

    public static ScaleAndIndex median() {
        return scale(2).index(1);
    }

    private static void movePivotToStartOfSlice(double[] dArr, int i8, int i9) {
        int i10 = (i8 + i9) >>> 1;
        double d8 = dArr[i9];
        double d9 = dArr[i10];
        boolean z7 = d8 < d9;
        double d10 = dArr[i8];
        boolean z8 = d9 < d10;
        boolean z9 = d8 < d10;
        if (z7 == z8) {
            swap(dArr, i10, i8);
        } else if (z7 != z9) {
            swap(dArr, i8, i9);
        }
    }

    private static int partition(double[] dArr, int i8, int i9) {
        movePivotToStartOfSlice(dArr, i8, i9);
        double d8 = dArr[i8];
        int i10 = i9;
        while (i9 > i8) {
            if (dArr[i9] > d8) {
                swap(dArr, i10, i9);
                i10--;
            }
            i9--;
        }
        swap(dArr, i8, i10);
        return i10;
    }

    public static Scale percentiles() {
        return scale(100);
    }

    public static Scale quartiles() {
        return scale(4);
    }

    public static Scale scale(int i8) {
        return new Scale(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void selectAllInPlace(int[] iArr, int i8, int i9, double[] dArr, int i10, int i11) {
        int chooseNextSelection = chooseNextSelection(iArr, i8, i9, i10, i11);
        int i12 = iArr[chooseNextSelection];
        selectInPlace(i12, dArr, i10, i11);
        int i13 = chooseNextSelection - 1;
        while (i13 >= i8 && iArr[i13] == i12) {
            i13--;
        }
        if (i13 >= i8) {
            selectAllInPlace(iArr, i8, i13, dArr, i10, i12 - 1);
        }
        int i14 = chooseNextSelection + 1;
        while (i14 <= i9 && iArr[i14] == i12) {
            i14++;
        }
        if (i14 <= i9) {
            selectAllInPlace(iArr, i14, i9, dArr, i12 + 1, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void selectInPlace(int i8, double[] dArr, int i9, int i10) {
        if (i8 != i9) {
            while (i10 > i9) {
                int partition = partition(dArr, i9, i10);
                if (partition >= i8) {
                    i10 = partition - 1;
                }
                if (partition <= i8) {
                    i9 = partition + 1;
                }
            }
            return;
        }
        int i11 = i9;
        for (int i12 = i9 + 1; i12 <= i10; i12++) {
            if (dArr[i11] > dArr[i12]) {
                i11 = i12;
            }
        }
        if (i11 != i9) {
            swap(dArr, i11, i9);
        }
    }

    private static void swap(double[] dArr, int i8, int i9) {
        double d8 = dArr[i8];
        dArr[i8] = dArr[i9];
        dArr[i9] = d8;
    }
}
