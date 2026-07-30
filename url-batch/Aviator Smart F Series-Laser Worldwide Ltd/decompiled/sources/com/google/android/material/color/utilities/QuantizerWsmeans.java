package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class QuantizerWsmeans {
    private static final int MAX_ITERATIONS = 10;
    private static final double MIN_MOVEMENT_DISTANCE = 3.0d;

    private static final class Distance implements Comparable<Distance> {
        int index = -1;
        double distance = -1.0d;

        Distance() {
        }

        @Override // java.lang.Comparable
        public int compareTo(Distance distance) {
            return Double.valueOf(this.distance).compareTo(Double.valueOf(distance.distance));
        }
    }

    private QuantizerWsmeans() {
    }

    public static Map<Integer, Integer> quantize(int[] iArr, int[] iArr2, int i8) {
        int[] iArr3;
        int i9;
        Random random = new Random(272008L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        double[][] dArr = new double[iArr.length][];
        int[] iArr4 = new int[iArr.length];
        PointProviderLab pointProviderLab = new PointProviderLab();
        int i10 = 0;
        for (int i11 : iArr) {
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i11));
            if (num == null) {
                dArr[i10] = pointProviderLab.fromInt(i11);
                iArr4[i10] = i11;
                i10++;
                linkedHashMap.put(Integer.valueOf(i11), 1);
            } else {
                linkedHashMap.put(Integer.valueOf(i11), Integer.valueOf(num.intValue() + 1));
            }
        }
        int[] iArr5 = new int[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            iArr5[i12] = ((Integer) linkedHashMap.get(Integer.valueOf(iArr4[i12]))).intValue();
        }
        int min = Math.min(i8, i10);
        if (iArr2.length != 0) {
            min = Math.min(min, iArr2.length);
        }
        double[][] dArr2 = new double[min][];
        int i13 = 0;
        for (int i14 = 0; i14 < iArr2.length; i14++) {
            dArr2[i14] = pointProviderLab.fromInt(iArr2[i14]);
            i13++;
        }
        int i15 = min - i13;
        if (i15 > 0) {
            for (int i16 = 0; i16 < i15; i16++) {
            }
        }
        int[] iArr6 = new int[i10];
        for (int i17 = 0; i17 < i10; i17++) {
            iArr6[i17] = random.nextInt(min);
        }
        int[][] iArr7 = new int[min][];
        for (int i18 = 0; i18 < min; i18++) {
            iArr7[i18] = new int[min];
        }
        Distance[][] distanceArr = new Distance[min][];
        for (int i19 = 0; i19 < min; i19++) {
            distanceArr[i19] = new Distance[min];
            for (int i20 = 0; i20 < min; i20++) {
                distanceArr[i19][i20] = new Distance();
            }
        }
        int[] iArr8 = new int[min];
        int i21 = 0;
        while (true) {
            if (i21 >= 10) {
                iArr3 = iArr8;
                break;
            }
            int i22 = 0;
            while (i22 < min) {
                int i23 = i22 + 1;
                int i24 = i23;
                while (i24 < min) {
                    int[] iArr9 = iArr8;
                    double distance = pointProviderLab.distance(dArr2[i22], dArr2[i24]);
                    Distance distance2 = distanceArr[i24][i22];
                    distance2.distance = distance;
                    distance2.index = i22;
                    Distance distance3 = distanceArr[i22][i24];
                    distance3.distance = distance;
                    distance3.index = i24;
                    i24++;
                    iArr8 = iArr9;
                }
                int[] iArr10 = iArr8;
                Arrays.sort(distanceArr[i22]);
                for (int i25 = 0; i25 < min; i25++) {
                    iArr7[i22][i25] = distanceArr[i22][i25].index;
                }
                iArr8 = iArr10;
                i22 = i23;
            }
            int[] iArr11 = iArr8;
            int i26 = 0;
            int i27 = 0;
            while (i26 < i10) {
                double[] dArr3 = dArr[i26];
                int i28 = iArr6[i26];
                double distance4 = pointProviderLab.distance(dArr3, dArr2[i28]);
                int[][] iArr12 = iArr7;
                int[] iArr13 = iArr5;
                double d8 = distance4;
                int i29 = -1;
                int i30 = 0;
                while (i30 < min) {
                    Distance[][] distanceArr2 = distanceArr;
                    int i31 = i10;
                    if (distanceArr[i28][i30].distance < 4.0d * distance4) {
                        double distance5 = pointProviderLab.distance(dArr3, dArr2[i30]);
                        if (distance5 < d8) {
                            i29 = i30;
                            d8 = distance5;
                        }
                    }
                    i30++;
                    i10 = i31;
                    distanceArr = distanceArr2;
                }
                Distance[][] distanceArr3 = distanceArr;
                int i32 = i10;
                if (i29 != -1 && Math.abs(Math.sqrt(d8) - Math.sqrt(distance4)) > 3.0d) {
                    i27++;
                    iArr6[i26] = i29;
                }
                i26++;
                iArr7 = iArr12;
                iArr5 = iArr13;
                i10 = i32;
                distanceArr = distanceArr3;
            }
            int[] iArr14 = iArr5;
            int[][] iArr15 = iArr7;
            Distance[][] distanceArr4 = distanceArr;
            int i33 = i10;
            if (i27 == 0 && i21 != 0) {
                iArr3 = iArr11;
                break;
            }
            double[] dArr4 = new double[min];
            double[] dArr5 = new double[min];
            double[] dArr6 = new double[min];
            char c8 = 0;
            Arrays.fill(iArr11, 0);
            int i34 = 0;
            while (true) {
                i9 = i33;
                if (i34 >= i9) {
                    break;
                }
                int i35 = iArr6[i34];
                double[] dArr7 = dArr[i34];
                int i36 = iArr14[i34];
                iArr11[i35] = iArr11[i35] + i36;
                double d9 = i36;
                dArr4[i35] = dArr4[i35] + (dArr7[c8] * d9);
                dArr5[i35] = dArr5[i35] + (dArr7[1] * d9);
                dArr6[i35] = dArr6[i35] + (dArr7[2] * d9);
                i34++;
                i21 = i21;
                i33 = i9;
                c8 = 0;
            }
            int i37 = i21;
            for (int i38 = 0; i38 < min; i38++) {
                int i39 = iArr11[i38];
                if (i39 == 0) {
                    dArr2[i38] = new double[]{com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, com.github.mikephil.charting.utils.i.DOUBLE_EPSILON};
                } else {
                    double d10 = i39;
                    double d11 = dArr4[i38] / d10;
                    double d12 = dArr5[i38] / d10;
                    double d13 = dArr6[i38] / d10;
                    double[] dArr8 = dArr2[i38];
                    dArr8[0] = d11;
                    dArr8[1] = d12;
                    dArr8[2] = d13;
                }
            }
            iArr7 = iArr15;
            i21 = i37 + 1;
            iArr8 = iArr11;
            i10 = i9;
            iArr5 = iArr14;
            distanceArr = distanceArr4;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (int i40 = 0; i40 < min; i40++) {
            int i41 = iArr3[i40];
            if (i41 != 0) {
                int i42 = pointProviderLab.toInt(dArr2[i40]);
                if (!linkedHashMap2.containsKey(Integer.valueOf(i42))) {
                    linkedHashMap2.put(Integer.valueOf(i42), Integer.valueOf(i41));
                }
            }
        }
        return linkedHashMap2;
    }
}
