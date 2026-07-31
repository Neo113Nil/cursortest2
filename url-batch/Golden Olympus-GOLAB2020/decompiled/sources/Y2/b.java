package Y2;

import java.util.Random;

/* loaded from: classes3.dex */
public abstract class b {
    private static int a(int i4) {
        int i5 = 0;
        while ((i4 & 1) == 0) {
            i4 >>>= 1;
            i5++;
        }
        return i5;
    }

    private static void b(int[] iArr, int i4, int[] iArr2, int[] iArr3) {
        if (i4 < 0) {
            m.a(iArr.length, iArr2, iArr, iArr3);
        } else {
            System.arraycopy(iArr2, 0, iArr3, 0, iArr.length);
        }
    }

    private static int c(int[] iArr, int[] iArr2, int i4, int[] iArr3, int i5) {
        int i6;
        int length = iArr.length;
        int i7 = 0;
        while (true) {
            i6 = iArr2[0];
            if (i6 != 0) {
                break;
            }
            m.B(i4, iArr2, 0);
            i7 += 32;
        }
        int a4 = a(i6);
        if (a4 > 0) {
            m.z(i4, iArr2, a4, 0);
            i7 += a4;
        }
        for (int i8 = 0; i8 < i7; i8++) {
            if ((iArr3[0] & 1) != 0) {
                i5 += i5 < 0 ? m.e(length, iArr, iArr3) : m.M(length, iArr, iArr3);
            }
            m.y(length, iArr3, i5);
        }
        return i5;
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        if (m.v(length, iArr2)) {
            throw new IllegalArgumentException("'x' cannot be 0");
        }
        int i4 = 0;
        if (m.u(length, iArr2)) {
            System.arraycopy(iArr2, 0, iArr3, 0, length);
            return;
        }
        int[] h4 = m.h(length, iArr2);
        int[] i5 = m.i(length);
        i5[0] = 1;
        int c4 = (1 & h4[0]) == 0 ? c(iArr, h4, length, i5, 0) : 0;
        if (m.u(length, h4)) {
            b(iArr, c4, i5, iArr3);
            return;
        }
        int[] h5 = m.h(length, iArr);
        int[] i6 = m.i(length);
        int i7 = length;
        while (true) {
            int i8 = i7 - 1;
            if (h4[i8] == 0 && h5[i8] == 0) {
                i7--;
            } else if (m.p(i7, h4, h5)) {
                m.M(i7, h5, h4);
                c4 = c(iArr, h4, i7, i5, c4 + (m.M(length, i6, i5) - i4));
                if (m.u(i7, h4)) {
                    b(iArr, c4, i5, iArr3);
                    return;
                }
            } else {
                m.M(i7, h4, h5);
                i4 = c(iArr, h5, i7, i6, i4 + (m.M(length, i5, i6) - c4));
                if (m.u(i7, h5)) {
                    b(iArr, i4, i6, iArr3);
                    return;
                }
            }
        }
    }

    public static int[] e(int[] iArr) {
        int length = iArr.length;
        Random random = new Random();
        int[] i4 = m.i(length);
        int i5 = length - 1;
        int i6 = iArr[i5];
        int i7 = i6 | (i6 >>> 1);
        int i8 = i7 | (i7 >>> 2);
        int i9 = i8 | (i8 >>> 4);
        int i10 = i9 | (i9 >>> 8);
        int i11 = i10 | (i10 >>> 16);
        do {
            for (int i12 = 0; i12 != length; i12++) {
                i4[i12] = random.nextInt();
            }
            i4[i5] = i4[i5] & i11;
        } while (m.p(length, i4, iArr));
        return i4;
    }
}
