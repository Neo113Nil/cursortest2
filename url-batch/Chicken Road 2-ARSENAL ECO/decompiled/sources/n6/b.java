package n6;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final e f5509a = new e();

    public static final boolean a(int i7, int i8, int i9, byte[] a7, byte[] b7) {
        kotlin.jvm.internal.i.e(a7, "a");
        kotlin.jvm.internal.i.e(b7, "b");
        for (int i10 = 0; i10 < i9; i10++) {
            if (a7[i10 + i7] != b7[i10 + i8]) {
                return false;
            }
        }
        return true;
    }

    public static final q b(w wVar) {
        kotlin.jvm.internal.i.e(wVar, "<this>");
        return new q(wVar);
    }

    public static void c(long j4, f fVar, int i7, ArrayList arrayList, int i8, int i9, ArrayList arrayList2) {
        int i10;
        int i11;
        ArrayList arrayList3;
        long j7;
        int i12;
        int i13 = i7;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i8 >= i9) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i14 = i8; i14 < i9; i14++) {
            if (((i) arrayList4.get(i14)).a() < i13) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        i iVar = (i) arrayList.get(i8);
        i iVar2 = (i) arrayList4.get(i9 - 1);
        if (i13 == iVar.a()) {
            int intValue = ((Number) arrayList5.get(i8)).intValue();
            int i15 = i8 + 1;
            i iVar3 = (i) arrayList4.get(i15);
            i10 = i15;
            i11 = intValue;
            iVar = iVar3;
        } else {
            i10 = i8;
            i11 = -1;
        }
        if (iVar.d(i13) == iVar2.d(i13)) {
            int min = Math.min(iVar.a(), iVar2.a());
            int i16 = 0;
            for (int i17 = i13; i17 < min && iVar.d(i17) == iVar2.d(i17); i17++) {
                i16++;
            }
            long j8 = 4;
            long j9 = (fVar.f5524g / j8) + j4 + 2 + i16 + 1;
            fVar.L(-i16);
            fVar.L(i11);
            int i18 = i13 + i16;
            while (i13 < i18) {
                fVar.L(iVar.d(i13) & 255);
                i13++;
            }
            if (i10 + 1 == i9) {
                if (i18 != ((i) arrayList4.get(i10)).a()) {
                    throw new IllegalStateException("Check failed.");
                }
                fVar.L(((Number) arrayList5.get(i10)).intValue());
                return;
            } else {
                f fVar2 = new f();
                fVar.L(((int) ((fVar2.f5524g / j8) + j9)) * (-1));
                c(j9, fVar2, i18, arrayList4, i10, i9, arrayList5);
                fVar.H(fVar2);
                return;
            }
        }
        int i19 = 1;
        for (int i20 = i10 + 1; i20 < i9; i20++) {
            if (((i) arrayList4.get(i20 - 1)).d(i13) != ((i) arrayList4.get(i20)).d(i13)) {
                i19++;
            }
        }
        long j10 = 4;
        long j11 = (fVar.f5524g / j10) + j4 + 2 + (i19 * 2);
        fVar.L(i19);
        fVar.L(i11);
        for (int i21 = i10; i21 < i9; i21++) {
            int d7 = ((i) arrayList4.get(i21)).d(i13);
            if (i21 == i10 || d7 != ((i) arrayList4.get(i21 - 1)).d(i13)) {
                fVar.L(d7 & 255);
            }
        }
        f fVar3 = new f();
        int i22 = i10;
        while (i22 < i9) {
            byte d8 = ((i) arrayList4.get(i22)).d(i13);
            int i23 = i22 + 1;
            int i24 = i23;
            while (true) {
                if (i24 >= i9) {
                    i24 = i9;
                    break;
                } else if (d8 != ((i) arrayList4.get(i24)).d(i13)) {
                    break;
                } else {
                    i24++;
                }
            }
            if (i23 == i24 && i13 + 1 == ((i) arrayList4.get(i22)).a()) {
                fVar.L(((Number) arrayList5.get(i22)).intValue());
                arrayList3 = arrayList5;
                j7 = j11;
                i12 = i24;
            } else {
                fVar.L(((int) ((fVar3.f5524g / j10) + j11)) * (-1));
                arrayList3 = arrayList5;
                j7 = j11;
                i12 = i24;
                c(j7, fVar3, i13 + 1, arrayList, i22, i12, arrayList3);
                arrayList4 = arrayList;
            }
            j11 = j7;
            i22 = i12;
            arrayList5 = arrayList3;
        }
        fVar.H(fVar3);
    }

    public static final void d(long j4, long j7, long j8) {
        if ((j7 | j8) < 0 || j7 > j4 || j4 - j7 < j8) {
            throw new ArrayIndexOutOfBoundsException("size=" + j4 + " offset=" + j7 + " byteCount=" + j8);
        }
    }

    public static final int e(int i7) {
        return ((i7 & 255) << 24) | (((-16777216) & i7) >>> 24) | ((16711680 & i7) >>> 8) | ((65280 & i7) << 8);
    }

    public static long f(String str) {
        int i7;
        int length = str.length();
        kotlin.jvm.internal.i.e(str, "<this>");
        if (length < 0) {
            throw new IllegalArgumentException(C1.c.f(length, 0, "endIndex < beginIndex: ", " < ").toString());
        }
        if (length > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + length + " > " + str.length()).toString());
        }
        long j4 = 0;
        int i8 = 0;
        while (i8 < length) {
            char charAt = str.charAt(i8);
            if (charAt < 128) {
                j4++;
            } else {
                if (charAt < 2048) {
                    i7 = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i7 = 3;
                } else {
                    int i9 = i8 + 1;
                    char charAt2 = i9 < length ? str.charAt(i9) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j4++;
                        i8 = i9;
                    } else {
                        j4 += 4;
                        i8 += 2;
                    }
                }
                j4 += i7;
            }
            i8++;
        }
        return j4;
    }

    public static final String g(int i7) {
        if (i7 == 0) {
            return "0";
        }
        char[] cArr = o6.b.f5625a;
        int i8 = 0;
        char[] cArr2 = {cArr[(i7 >> 28) & 15], cArr[(i7 >> 24) & 15], cArr[(i7 >> 20) & 15], cArr[(i7 >> 16) & 15], cArr[(i7 >> 12) & 15], cArr[(i7 >> 8) & 15], cArr[(i7 >> 4) & 15], cArr[i7 & 15]};
        while (i8 < 8 && cArr2[i8] == '0') {
            i8++;
        }
        i6.g.g(i8, 8, 8);
        return new String(cArr2, i8, 8 - i8);
    }
}
