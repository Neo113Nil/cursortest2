package cn.hutool.core.util;

import cn.hutool.core.convert.impl.w1;

/* loaded from: classes.dex */
public class f0 {
    private static int firstPageNo;

    public static int getEnd(int i8, int i9) {
        return getEndByStart(getStart(i8, i9), i9);
    }

    private static int getEndByStart(int i8, int i9) {
        if (i9 < 1) {
            i9 = 0;
        }
        return i8 + i9;
    }

    public static int getFirstPageNo() {
        return firstPageNo;
    }

    public static int getStart(int i8, int i9) {
        int i10 = firstPageNo;
        if (i8 < i10) {
            i8 = i10;
        }
        if (i9 < 1) {
            i9 = 0;
        }
        return (i8 - i10) * i9;
    }

    public static int[] rainbow(int i8, int i9, int i10) {
        int i11 = 0;
        int i12 = (i10 & 1) == 0 ? 1 : 0;
        int i13 = i10 >> 1;
        int i14 = i12 != 0 ? i13 + 1 : i13;
        int i15 = i9 < i10 ? i9 : i10;
        int[] iArr = new int[i15];
        if (i9 < i10) {
            while (i11 < i15) {
                int i16 = i11 + 1;
                iArr[i11] = i16;
                i11 = i16;
            }
        } else if (i8 <= i13) {
            while (i11 < i15) {
                int i17 = i11 + 1;
                iArr[i11] = i17;
                i11 = i17;
            }
        } else if (i8 > i9 - i14) {
            while (i11 < i15) {
                iArr[i11] = ((i11 + i9) - i10) + 1;
                i11++;
            }
        } else {
            while (i11 < i15) {
                iArr[i11] = ((i11 + i8) - i13) + i12;
                i11++;
            }
        }
        return iArr;
    }

    public static synchronized void setFirstPageNo(int i8) {
        synchronized (f0.class) {
            firstPageNo = i8;
        }
    }

    public static void setOneAsFirstPageNo() {
        setFirstPageNo(1);
    }

    public static cn.hutool.core.lang.q0 toSegment(int i8, int i9) {
        int[] transToStartEnd = transToStartEnd(i8, i9);
        return new cn.hutool.core.lang.y(Integer.valueOf(transToStartEnd[0]), Integer.valueOf(transToStartEnd[1]));
    }

    public static int totalPage(int i8, int i9) {
        return totalPage(i8, i9);
    }

    public static int[] transToStartEnd(int i8, int i9) {
        int start = getStart(i8, i9);
        return new int[]{start, getEndByStart(start, i9)};
    }

    public static int totalPage(long j8, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j9 = i8;
        long j10 = j8 % j9;
        long j11 = j8 / j9;
        if (j10 != 0) {
            j11++;
        }
        return w1.a(j11);
    }

    public static int[] rainbow(int i8, int i9) {
        return rainbow(i8, i9, 10);
    }
}
