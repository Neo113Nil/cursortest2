package Q6;

import E6.c;
import T6.i;
import kotlin.text.Charsets;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b f2356a = new b();

    public static final String a(i iVar, i[] iVarArr, int i2) {
        int i5;
        boolean z7;
        int i7;
        int i8;
        i iVar2 = a.f2352b;
        int a7 = iVar.a();
        int i9 = 0;
        while (i9 < a7) {
            int i10 = (i9 + a7) / 2;
            while (i10 > -1 && iVar.d(i10) != 10) {
                i10--;
            }
            int i11 = i10 + 1;
            int i12 = 1;
            while (true) {
                i5 = i11 + i12;
                if (iVar.d(i5) == 10) {
                    break;
                }
                i12++;
            }
            int i13 = i5 - i11;
            int i14 = i2;
            boolean z8 = false;
            int i15 = 0;
            int i16 = 0;
            while (true) {
                if (z8) {
                    i7 = 46;
                    z7 = false;
                } else {
                    byte d7 = iVarArr[i14].d(i15);
                    byte[] bArr = c.f709a;
                    int i17 = d7 & 255;
                    z7 = z8;
                    i7 = i17;
                }
                byte d8 = iVar.d(i11 + i16);
                byte[] bArr2 = c.f709a;
                i8 = i7 - (d8 & 255);
                if (i8 != 0) {
                    break;
                }
                i16++;
                i15++;
                if (i16 == i13) {
                    break;
                }
                if (iVarArr[i14].a() != i15) {
                    z8 = z7;
                } else {
                    if (i14 == iVarArr.length - 1) {
                        break;
                    }
                    i14++;
                    i15 = -1;
                    z8 = true;
                }
            }
            if (i8 >= 0) {
                if (i8 <= 0) {
                    int i18 = i13 - i16;
                    int a8 = iVarArr[i14].a() - i15;
                    int length = iVarArr.length;
                    for (int i19 = i14 + 1; i19 < length; i19++) {
                        a8 += iVarArr[i19].a();
                    }
                    if (a8 >= i18) {
                        if (a8 <= i18) {
                            return iVar.h(i11, i13 + i11).g(Charsets.UTF_8);
                        }
                    }
                }
                i9 = i5 + 1;
            }
            a7 = i10;
        }
        return null;
    }
}
