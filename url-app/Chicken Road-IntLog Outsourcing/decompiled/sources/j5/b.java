package j5;

import b2.AbstractC0279e;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import kotlin.KotlinVersion;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final e f10480a = new e();

    public static final boolean a(int i2, int i3, int i6, byte[] a6, byte[] b6) {
        kotlin.jvm.internal.i.e(a6, "a");
        kotlin.jvm.internal.i.e(b6, "b");
        for (int i7 = 0; i7 < i6; i7++) {
            if (a6[i7 + i2] != b6[i7 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static final q b(w wVar) {
        kotlin.jvm.internal.i.e(wVar, "<this>");
        return new q(wVar);
    }

    public static void c(long j2, f fVar, int i2, ArrayList arrayList, int i3, int i6, ArrayList arrayList2) {
        int i7;
        int i8;
        int i9;
        int i10;
        f fVar2;
        int i11 = i2;
        if (i3 >= i6) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i12 = i3; i12 < i6; i12++) {
            if (((i) arrayList.get(i12)).a() < i11) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        i iVar = (i) arrayList.get(i3);
        i iVar2 = (i) arrayList.get(i6 - 1);
        int i13 = -1;
        if (i11 == iVar.a()) {
            int intValue = ((Number) arrayList2.get(i3)).intValue();
            int i14 = i3 + 1;
            i iVar3 = (i) arrayList.get(i14);
            i7 = i14;
            i8 = intValue;
            iVar = iVar3;
        } else {
            i7 = i3;
            i8 = -1;
        }
        if (iVar.d(i11) == iVar2.d(i11)) {
            int min = Math.min(iVar.a(), iVar2.a());
            int i15 = 0;
            for (int i16 = i11; i16 < min && iVar.d(i16) == iVar2.d(i16); i16++) {
                i15++;
            }
            long j6 = 4;
            long j7 = (fVar.f10495b / j6) + j2 + 2 + i15 + 1;
            fVar.M(-i15);
            fVar.M(i8);
            int i17 = i15 + i11;
            while (i11 < i17) {
                fVar.M(iVar.d(i11) & KotlinVersion.MAX_COMPONENT_VALUE);
                i11++;
            }
            if (i7 + 1 == i6) {
                if (i17 != ((i) arrayList.get(i7)).a()) {
                    throw new IllegalStateException("Check failed.");
                }
                fVar.M(((Number) arrayList2.get(i7)).intValue());
                return;
            } else {
                f fVar3 = new f();
                fVar.M(((int) ((fVar3.f10495b / j6) + j7)) * (-1));
                c(j7, fVar3, i17, arrayList, i7, i6, arrayList2);
                fVar.I(fVar3);
                return;
            }
        }
        int i18 = 1;
        for (int i19 = i7 + 1; i19 < i6; i19++) {
            if (((i) arrayList.get(i19 - 1)).d(i11) != ((i) arrayList.get(i19)).d(i11)) {
                i18++;
            }
        }
        long j8 = 4;
        long j9 = (fVar.f10495b / j8) + j2 + 2 + (i18 * 2);
        fVar.M(i18);
        fVar.M(i8);
        for (int i20 = i7; i20 < i6; i20++) {
            int d6 = ((i) arrayList.get(i20)).d(i11);
            if (i20 == i7 || d6 != ((i) arrayList.get(i20 - 1)).d(i11)) {
                fVar.M(d6 & KotlinVersion.MAX_COMPONENT_VALUE);
            }
        }
        f fVar4 = new f();
        int i21 = i7;
        while (i21 < i6) {
            byte d7 = ((i) arrayList.get(i21)).d(i11);
            int i22 = i21 + 1;
            int i23 = i22;
            while (true) {
                if (i23 >= i6) {
                    i9 = i6;
                    break;
                } else {
                    if (d7 != ((i) arrayList.get(i23)).d(i11)) {
                        i9 = i23;
                        break;
                    }
                    i23++;
                }
            }
            if (i22 == i9 && i11 + 1 == ((i) arrayList.get(i21)).a()) {
                fVar.M(((Number) arrayList2.get(i21)).intValue());
                i10 = i9;
                fVar2 = fVar4;
            } else {
                fVar.M(((int) ((fVar4.f10495b / j8) + j9)) * i13);
                i10 = i9;
                fVar2 = fVar4;
                c(j9, fVar4, i11 + 1, arrayList, i21, i9, arrayList2);
            }
            fVar4 = fVar2;
            i21 = i10;
            i13 = -1;
        }
        fVar.I(fVar4);
    }

    public static final void d(long j2, long j6, long j7) {
        if ((j6 | j7) < 0 || j6 > j2 || j2 - j6 < j7) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j6 + " byteCount=" + j7);
        }
    }

    public static final int e(int i2) {
        return ((i2 & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (((-16777216) & i2) >>> 24) | ((16711680 & i2) >>> 8) | ((65280 & i2) << 8);
    }

    public static long f(String str) {
        int i2;
        int length = str.length();
        kotlin.jvm.internal.i.e(str, "<this>");
        if (length < 0) {
            throw new IllegalArgumentException(B0.o.h("endIndex < beginIndex: ", length, 0, " < ").toString());
        }
        if (length > str.length()) {
            StringBuilder i3 = AbstractC0279e.i(length, "endIndex > string.length: ", " > ");
            i3.append(str.length());
            throw new IllegalArgumentException(i3.toString().toString());
        }
        long j2 = 0;
        int i6 = 0;
        while (i6 < length) {
            char charAt = str.charAt(i6);
            if (charAt < 128) {
                j2++;
            } else {
                if (charAt < 2048) {
                    i2 = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i2 = 3;
                } else {
                    int i7 = i6 + 1;
                    char charAt2 = i7 < length ? str.charAt(i7) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j2++;
                        i6 = i7;
                    } else {
                        j2 += 4;
                        i6 += 2;
                    }
                }
                j2 += i2;
            }
            i6++;
        }
        return j2;
    }

    public static final String g(int i2) {
        int i3 = 0;
        if (i2 == 0) {
            return CommonUrlParts.Values.FALSE_INTEGER;
        }
        char[] cArr = k5.b.f10725a;
        char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
        while (i3 < 8 && cArr2[i3] == '0') {
            i3++;
        }
        AbstractC1477a.c(i3, 8, 8);
        return new String(cArr2, i3, 8 - i3);
    }
}
