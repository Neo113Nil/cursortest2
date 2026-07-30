package T6;

import java.util.ArrayList;
import kotlin.collections.AbstractC0627f;
import kotlin.collections.C0624c;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final e f2603a = new e();

    public static final boolean a(int i2, int i5, int i7, byte[] a7, byte[] b7) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b7, "b");
        for (int i8 = 0; i8 < i7; i8++) {
            if (a7[i8 + i2] != b7[i8 + i5]) {
                return false;
            }
        }
        return true;
    }

    public static final q b(w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        return new q(wVar);
    }

    public static void c(long j, f fVar, int i2, ArrayList arrayList, int i5, int i7, ArrayList arrayList2) {
        int i8;
        int i9;
        ArrayList arrayList3;
        long j7;
        int i10;
        int i11 = i2;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i5 >= i7) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i12 = i5; i12 < i7; i12++) {
            if (((i) arrayList4.get(i12)).a() < i11) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        i iVar = (i) arrayList.get(i5);
        i iVar2 = (i) arrayList4.get(i7 - 1);
        if (i11 == iVar.a()) {
            int intValue = ((Number) arrayList5.get(i5)).intValue();
            int i13 = i5 + 1;
            i iVar3 = (i) arrayList4.get(i13);
            i8 = i13;
            i9 = intValue;
            iVar = iVar3;
        } else {
            i8 = i5;
            i9 = -1;
        }
        if (iVar.d(i11) == iVar2.d(i11)) {
            int min = Math.min(iVar.a(), iVar2.a());
            int i14 = 0;
            for (int i15 = i11; i15 < min && iVar.d(i15) == iVar2.d(i15); i15++) {
                i14++;
            }
            long j8 = 4;
            long j9 = (fVar.f2617e / j8) + j + 2 + i14 + 1;
            fVar.K(-i14);
            fVar.K(i9);
            int i16 = i11 + i14;
            while (i11 < i16) {
                fVar.K(iVar.d(i11) & 255);
                i11++;
            }
            if (i8 + 1 == i7) {
                if (i16 != ((i) arrayList4.get(i8)).a()) {
                    throw new IllegalStateException("Check failed.");
                }
                fVar.K(((Number) arrayList5.get(i8)).intValue());
                return;
            } else {
                f fVar2 = new f();
                fVar.K(((int) ((fVar2.f2617e / j8) + j9)) * (-1));
                c(j9, fVar2, i16, arrayList4, i8, i7, arrayList5);
                fVar.G(fVar2);
                return;
            }
        }
        int i17 = 1;
        for (int i18 = i8 + 1; i18 < i7; i18++) {
            if (((i) arrayList4.get(i18 - 1)).d(i11) != ((i) arrayList4.get(i18)).d(i11)) {
                i17++;
            }
        }
        long j10 = 4;
        long j11 = (fVar.f2617e / j10) + j + 2 + (i17 * 2);
        fVar.K(i17);
        fVar.K(i9);
        for (int i19 = i8; i19 < i7; i19++) {
            int d7 = ((i) arrayList4.get(i19)).d(i11);
            if (i19 == i8 || d7 != ((i) arrayList4.get(i19 - 1)).d(i11)) {
                fVar.K(d7 & 255);
            }
        }
        f fVar3 = new f();
        int i20 = i8;
        while (i20 < i7) {
            byte d8 = ((i) arrayList4.get(i20)).d(i11);
            int i21 = i20 + 1;
            int i22 = i21;
            while (true) {
                if (i22 >= i7) {
                    i22 = i7;
                    break;
                } else if (d8 != ((i) arrayList4.get(i22)).d(i11)) {
                    break;
                } else {
                    i22++;
                }
            }
            if (i21 == i22 && i11 + 1 == ((i) arrayList4.get(i20)).a()) {
                fVar.K(((Number) arrayList5.get(i20)).intValue());
                arrayList3 = arrayList5;
                j7 = j11;
                i10 = i22;
            } else {
                fVar.K(((int) ((fVar3.f2617e / j10) + j11)) * (-1));
                arrayList3 = arrayList5;
                j7 = j11;
                i10 = i22;
                c(j7, fVar3, i11 + 1, arrayList, i20, i10, arrayList3);
                arrayList4 = arrayList;
            }
            j11 = j7;
            i20 = i10;
            arrayList5 = arrayList3;
        }
        fVar.G(fVar3);
    }

    public static final void d(long j, long j7, long j8) {
        if ((j7 | j8) < 0 || j7 > j || j - j7 < j8) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j7 + " byteCount=" + j8);
        }
    }

    public static final int e(int i2) {
        return ((i2 & 255) << 24) | (((-16777216) & i2) >>> 24) | ((16711680 & i2) >>> 8) | ((65280 & i2) << 8);
    }

    public static long f(String str) {
        int i2;
        int length = str.length();
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (length < 0) {
            throw new IllegalArgumentException(C4.p.j("endIndex < beginIndex: ", " < ", length, 0).toString());
        }
        if (length > str.length()) {
            StringBuilder k7 = C4.p.k(length, "endIndex > string.length: ", " > ");
            k7.append(str.length());
            throw new IllegalArgumentException(k7.toString().toString());
        }
        long j = 0;
        int i5 = 0;
        while (i5 < length) {
            char charAt = str.charAt(i5);
            if (charAt < 128) {
                j++;
            } else {
                if (charAt < 2048) {
                    i2 = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i2 = 3;
                } else {
                    int i7 = i5 + 1;
                    char charAt2 = i7 < length ? str.charAt(i7) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j++;
                        i5 = i7;
                    } else {
                        j += 4;
                        i5 += 2;
                    }
                }
                j += i2;
            }
            i5++;
        }
        return j;
    }

    public static final String g(int i2) {
        if (i2 == 0) {
            return "0";
        }
        char[] cArr = U6.b.f2738a;
        int i5 = 0;
        char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
        while (i5 < 8 && cArr2[i5] == '0') {
            i5++;
        }
        Intrinsics.checkNotNullParameter(cArr2, "<this>");
        AbstractC0627f.f6131d.getClass();
        C0624c.a(i5, 8, 8);
        return new String(cArr2, i5, 8 - i5);
    }
}
