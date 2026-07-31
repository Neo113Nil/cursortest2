package g1;

/* loaded from: classes.dex */
public final class j0 {
    public static int a(byte[] bArr, int i7, int i8) {
        while (i7 < i8 && bArr[i7] != 71) {
            i7++;
        }
        return i7;
    }

    public static boolean b(byte[] bArr, int i7, int i8, int i9) {
        int i10 = 0;
        for (int i11 = -4; i11 <= 4; i11++) {
            int i12 = (i11 * 188) + i9;
            if (i12 < i7 || i12 >= i8 || bArr[i12] != 71) {
                i10 = 0;
            } else {
                i10++;
                if (i10 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long c(o2.a0 a0Var, int i7, int i8) {
        a0Var.O(i7);
        if (a0Var.a() < 5) {
            return -9223372036854775807L;
        }
        int m7 = a0Var.m();
        if ((8388608 & m7) != 0 || ((2096896 & m7) >> 8) != i8) {
            return -9223372036854775807L;
        }
        if (((m7 & 32) != 0) && a0Var.C() >= 7 && a0Var.a() >= 7) {
            if ((a0Var.C() & 16) == 16) {
                byte[] bArr = new byte[6];
                a0Var.j(bArr, 0, 6);
                return d(bArr);
            }
        }
        return -9223372036854775807L;
    }

    private static long d(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
