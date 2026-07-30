package kotlin.collections;

/* loaded from: classes4.dex */
public abstract class a1 {
    /* JADX WARN: Incorrect condition in loop: B:4:0x0012 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x001f */
    /* renamed from: partition--nroSd4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final int m446partitionnroSd4(long[] jArr, int i8, int i9) {
        int compare;
        int compare2;
        long m1770getsVKNKU = y5.s.m1770getsVKNKU(jArr, (i8 + i9) / 2);
        while (i8 <= i9) {
            while (compare < 0) {
                i8++;
            }
            while (compare2 > 0) {
                i9--;
            }
            if (i8 <= i9) {
                long m1770getsVKNKU2 = y5.s.m1770getsVKNKU(jArr, i8);
                y5.s.m1775setk8EXiF4(jArr, i8, y5.s.m1770getsVKNKU(jArr, i9));
                y5.s.m1775setk8EXiF4(jArr, i9, m1770getsVKNKU2);
                i8++;
                i9--;
            }
        }
        return i8;
    }

    /* renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m447partition4UcCI2c(byte[] bArr, int i8, int i9) {
        int i10;
        byte m1614getw2LRezQ = y5.o.m1614getw2LRezQ(bArr, (i8 + i9) / 2);
        while (i8 <= i9) {
            while (true) {
                i10 = m1614getw2LRezQ & 255;
                if (kotlin.jvm.internal.s.compare(y5.o.m1614getw2LRezQ(bArr, i8) & 255, i10) >= 0) {
                    break;
                }
                i8++;
            }
            while (kotlin.jvm.internal.s.compare(y5.o.m1614getw2LRezQ(bArr, i9) & 255, i10) > 0) {
                i9--;
            }
            if (i8 <= i9) {
                byte m1614getw2LRezQ2 = y5.o.m1614getw2LRezQ(bArr, i8);
                y5.o.m1619setVurrAj0(bArr, i8, y5.o.m1614getw2LRezQ(bArr, i9));
                y5.o.m1619setVurrAj0(bArr, i9, m1614getw2LRezQ2);
                i8++;
                i9--;
            }
        }
        return i8;
    }

    /* renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m448partitionAa5vz7o(short[] sArr, int i8, int i9) {
        int i10;
        short m1846getMh2AYeg = y5.v.m1846getMh2AYeg(sArr, (i8 + i9) / 2);
        while (i8 <= i9) {
            while (true) {
                int m1846getMh2AYeg2 = y5.v.m1846getMh2AYeg(sArr, i8) & y5.u.MAX_VALUE;
                i10 = m1846getMh2AYeg & y5.u.MAX_VALUE;
                if (kotlin.jvm.internal.s.compare(m1846getMh2AYeg2, i10) >= 0) {
                    break;
                }
                i8++;
            }
            while (kotlin.jvm.internal.s.compare(y5.v.m1846getMh2AYeg(sArr, i9) & y5.u.MAX_VALUE, i10) > 0) {
                i9--;
            }
            if (i8 <= i9) {
                short m1846getMh2AYeg3 = y5.v.m1846getMh2AYeg(sArr, i8);
                y5.v.m1851set01HTLdE(sArr, i8, y5.v.m1846getMh2AYeg(sArr, i9));
                y5.v.m1851set01HTLdE(sArr, i9, m1846getMh2AYeg3);
                i8++;
                i9--;
            }
        }
        return i8;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0012 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x001f */
    /* renamed from: partition-oBK06Vg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final int m449partitionoBK06Vg(int[] iArr, int i8, int i9) {
        int compare;
        int compare2;
        int m1692getpVg5ArA = y5.q.m1692getpVg5ArA(iArr, (i8 + i9) / 2);
        while (i8 <= i9) {
            while (compare < 0) {
                i8++;
            }
            while (compare2 > 0) {
                i9--;
            }
            if (i8 <= i9) {
                int m1692getpVg5ArA2 = y5.q.m1692getpVg5ArA(iArr, i8);
                y5.q.m1697setVXSXFK8(iArr, i8, y5.q.m1692getpVg5ArA(iArr, i9));
                y5.q.m1697setVXSXFK8(iArr, i9, m1692getpVg5ArA2);
                i8++;
                i9--;
            }
        }
        return i8;
    }

    /* renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m450quickSortnroSd4(long[] jArr, int i8, int i9) {
        int m446partitionnroSd4 = m446partitionnroSd4(jArr, i8, i9);
        int i10 = m446partitionnroSd4 - 1;
        if (i8 < i10) {
            m450quickSortnroSd4(jArr, i8, i10);
        }
        if (m446partitionnroSd4 < i9) {
            m450quickSortnroSd4(jArr, m446partitionnroSd4, i9);
        }
    }

    /* renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m451quickSort4UcCI2c(byte[] bArr, int i8, int i9) {
        int m447partition4UcCI2c = m447partition4UcCI2c(bArr, i8, i9);
        int i10 = m447partition4UcCI2c - 1;
        if (i8 < i10) {
            m451quickSort4UcCI2c(bArr, i8, i10);
        }
        if (m447partition4UcCI2c < i9) {
            m451quickSort4UcCI2c(bArr, m447partition4UcCI2c, i9);
        }
    }

    /* renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m452quickSortAa5vz7o(short[] sArr, int i8, int i9) {
        int m448partitionAa5vz7o = m448partitionAa5vz7o(sArr, i8, i9);
        int i10 = m448partitionAa5vz7o - 1;
        if (i8 < i10) {
            m452quickSortAa5vz7o(sArr, i8, i10);
        }
        if (m448partitionAa5vz7o < i9) {
            m452quickSortAa5vz7o(sArr, m448partitionAa5vz7o, i9);
        }
    }

    /* renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m453quickSortoBK06Vg(int[] iArr, int i8, int i9) {
        int m449partitionoBK06Vg = m449partitionoBK06Vg(iArr, i8, i9);
        int i10 = m449partitionoBK06Vg - 1;
        if (i8 < i10) {
            m453quickSortoBK06Vg(iArr, i8, i10);
        }
        if (m449partitionoBK06Vg < i9) {
            m453quickSortoBK06Vg(iArr, m449partitionoBK06Vg, i9);
        }
    }

    /* renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m454sortArraynroSd4(long[] array, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(array, "array");
        m450quickSortnroSd4(array, i8, i9 - 1);
    }

    /* renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m455sortArray4UcCI2c(byte[] array, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(array, "array");
        m451quickSort4UcCI2c(array, i8, i9 - 1);
    }

    /* renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m456sortArrayAa5vz7o(short[] array, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(array, "array");
        m452quickSortAa5vz7o(array, i8, i9 - 1);
    }

    /* renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m457sortArrayoBK06Vg(int[] array, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(array, "array");
        m453quickSortoBK06Vg(array, i8, i9 - 1);
    }
}
