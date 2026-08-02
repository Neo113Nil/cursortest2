package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jpn {
    private static final int[][] a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    private static final int[][] b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    private static final int[][] c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    private static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    static int a(int i, int i2) {
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
        int i3 = 32 - numberOfLeadingZeros;
        int i4 = i << (31 - numberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(i4) >= i3) {
            i4 ^= i2 << ((32 - Integer.numberOfLeadingZeros(i4)) - i3);
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void b(jpa jpaVar, jph jphVar, jpk jpkVar, int i, jpl jplVar) {
        int i2;
        int i3;
        char c2;
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        while (true) {
            byte[][] bArr = jplVar.a;
            i2 = -1;
            if (i13 >= bArr.length) {
                break;
            }
            Arrays.fill(bArr[i13], (byte) -1);
            i13++;
        }
        int length = a[0].length;
        d(0, 0, jplVar);
        int i14 = jplVar.b;
        int i15 = i14 - length;
        d(i15, 0, jplVar);
        d(0, i15, jplVar);
        c(0, 7, jplVar);
        int i16 = i14 - 8;
        c(i16, 7, jplVar);
        c(0, i16, jplVar);
        e(7, 0, jplVar);
        int i17 = jplVar.c;
        int i18 = i17 - 8;
        e(i18, 0, jplVar);
        int i19 = i17 - 7;
        e(7, i19, jplVar);
        int i20 = 8;
        if (jplVar.a(8, i18) == 0) {
            throw new joz();
        }
        jplVar.b(8, i18, 1);
        int i21 = jpkVar.a;
        int i22 = 5;
        if (i21 < 2) {
            i3 = 0;
            i4 = -1;
            c2 = 1;
        } else {
            int[] iArr = c[i21 - 1];
            i3 = 0;
            int length2 = iArr.length;
            c2 = 1;
            int i23 = 0;
            while (i23 < length2) {
                int i24 = i2;
                int i25 = iArr[i23];
                if (i25 >= 0) {
                    int length3 = iArr.length;
                    int i26 = 0;
                    while (i26 < length3) {
                        int i27 = iArr[i26];
                        if (i27 < 0 || !f(jplVar.a(i27, i25))) {
                            i5 = length2;
                        } else {
                            int i28 = i27 - 2;
                            int i29 = i25 - 2;
                            i5 = length2;
                            int i30 = 0;
                            while (i30 < i22) {
                                int[] iArr2 = b[i30];
                                int i31 = i30;
                                int i32 = 0;
                                while (i32 < i22) {
                                    int i33 = i32;
                                    jplVar.b(i28 + i32, i29 + i31, iArr2[i33]);
                                    i32 = i33 + 1;
                                    i26 = i26;
                                    i22 = 5;
                                }
                                i30 = i31 + 1;
                                i22 = 5;
                            }
                        }
                        i26++;
                        length2 = i5;
                        i22 = 5;
                    }
                }
                i23++;
                i2 = i24;
                length2 = length2;
                i22 = 5;
            }
            i4 = i2;
            i20 = 8;
        }
        while (i20 < i16) {
            int i34 = i20 + 1;
            int i35 = i34 % 2;
            if (f(jplVar.a(i20, 6))) {
                jplVar.b(i20, 6, i35);
            }
            if (f(jplVar.a(6, i20))) {
                jplVar.b(6, i20, i35);
            }
            i20 = i34;
        }
        jpa jpaVar2 = new jpa();
        if (!jps.a(i)) {
            throw new joz("Invalid mask pattern");
        }
        int i36 = (jphVar.e << 3) | i;
        jpaVar2.d(i36, 5);
        jpaVar2.d(a(i36, 1335), 10);
        jpa jpaVar3 = new jpa();
        jpaVar3.d(21522, 15);
        if (jpaVar2.b != jpaVar3.b) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i37 = i3;
        while (true) {
            int[] iArr3 = jpaVar2.a;
            if (i37 >= iArr3.length) {
                break;
            }
            iArr3[i37] = jpaVar3.a[i37] ^ iArr3[i37];
            i37++;
        }
        int i38 = jpaVar2.b;
        if (i38 != 15) {
            throw new joz(a.Y(i38, "should not happen but we got: "));
        }
        int i39 = i3;
        while (true) {
            int i40 = jpaVar2.b;
            if (i39 >= i40) {
                break;
            }
            boolean e = jpaVar2.e((i40 - 1) - i39);
            int[] iArr4 = d[i39];
            jplVar.c(iArr4[i3], iArr4[c2], e);
            if (i39 < 8) {
                i12 = (i14 - i39) - 1;
                i11 = 8;
            } else {
                i11 = (i39 - 8) + i19;
                i12 = 8;
            }
            jplVar.c(i12, i11, e);
            i39++;
        }
        if (i21 >= 7) {
            jpa jpaVar4 = new jpa();
            jpaVar4.d(i21, 6);
            jpaVar4.d(a(i21, 7973), 12);
            int i41 = jpaVar4.b;
            if (i41 != 18) {
                throw new joz(a.Y(i41, "should not happen but we got: "));
            }
            int i42 = 17;
            for (int i43 = i3; i43 < 6; i43++) {
                for (int i44 = i3; i44 < 3; i44++) {
                    boolean e2 = jpaVar4.e(i42);
                    i42--;
                    int i45 = (i17 - 11) + i44;
                    jplVar.c(i43, i45, e2);
                    jplVar.c(i45, i43, e2);
                }
            }
        }
        int i46 = i17 - 1;
        int i47 = i14 - 1;
        int i48 = i3;
        int i49 = i4;
        while (i47 > 0) {
            if (i47 == 6) {
                i47 = 5;
            }
            while (i46 >= 0 && i46 < i17) {
                int i50 = i3;
                while (i50 < 2) {
                    int i51 = i47 - i50;
                    if (f(jplVar.a(i51, i46))) {
                        if (i48 < jpaVar.b) {
                            z = jpaVar.e(i48);
                            i48++;
                        } else {
                            z = i3;
                        }
                        i6 = i4;
                        if (i != i6) {
                            switch (i) {
                                case 0:
                                    i7 = i46 + i51;
                                    i8 = i7 & 1;
                                    if (i8 == 0) {
                                        z = !z;
                                        break;
                                    }
                                    break;
                                case 1:
                                    i8 = i46 & 1;
                                    if (i8 == 0) {
                                    }
                                    break;
                                case 2:
                                    i8 = i51 % 3;
                                    if (i8 == 0) {
                                    }
                                    break;
                                case 3:
                                    i8 = (i46 + i51) % 3;
                                    if (i8 == 0) {
                                    }
                                    break;
                                case 4:
                                    i9 = i46 >> 1;
                                    i10 = i51 / 3;
                                    i7 = i9 + i10;
                                    i8 = i7 & 1;
                                    if (i8 == 0) {
                                    }
                                    break;
                                case 5:
                                    int i52 = i46 * i51;
                                    i8 = (i52 & 1) + (i52 % 3);
                                    if (i8 == 0) {
                                    }
                                    break;
                                case 6:
                                    int i53 = i46 * i51;
                                    i8 = ((i53 & 1) + (i53 % 3)) & 1;
                                    if (i8 == 0) {
                                    }
                                    break;
                                case 7:
                                    i10 = (i46 + i51) & 1;
                                    i9 = (i46 * i51) % 3;
                                    i7 = i9 + i10;
                                    i8 = i7 & 1;
                                    if (i8 == 0) {
                                    }
                                    break;
                                default:
                                    throw new IllegalArgumentException(a.Y(i, "Invalid mask pattern: "));
                            }
                        }
                        jplVar.c(i51, i46, z);
                    } else {
                        i6 = i4;
                    }
                    i50++;
                    i4 = i6;
                }
                i46 += i49;
            }
            i49 = -i49;
            i47 -= 2;
            i46 += i49;
            i4 = i4;
        }
        int i54 = jpaVar.b;
        if (i48 != i54) {
            throw new joz(a.af(i54, i48, "Not all bits consumed: ", "/"));
        }
    }

    private static void c(int i, int i2, jpl jplVar) {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (!f(jplVar.a(i4, i2))) {
                throw new joz();
            }
            jplVar.b(i4, i2, 0);
        }
    }

    private static void d(int i, int i2, jpl jplVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                jplVar.b(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    private static void e(int i, int i2, jpl jplVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (!f(jplVar.a(i, i4))) {
                throw new joz();
            }
            jplVar.b(i, i4, 0);
        }
    }

    private static boolean f(int i) {
        return i == -1;
    }
}
