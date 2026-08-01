package w1;

import X0.f;
import v1.o;
import v1.r;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f4591a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(e1.a.f2375a);
        f.d(bytes, "this as java.lang.String).getBytes(charset)");
        f4591a = bytes;
    }

    public static final String a(v1.f fVar, long j2) {
        f.e(fVar, "<this>");
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (fVar.h(j3) == 13) {
                String n2 = fVar.n(j3, e1.a.f2375a);
                fVar.o(2L);
                return n2;
            }
        }
        String n3 = fVar.n(j2, e1.a.f2375a);
        fVar.o(1L);
        return n3;
    }

    public static final int b(v1.f fVar, o oVar, boolean z2) {
        int i;
        int i2;
        r rVar;
        byte[] bArr;
        int i3;
        f.e(fVar, "<this>");
        f.e(oVar, "options");
        r rVar2 = fVar.f4487a;
        int i4 = -2;
        if (rVar2 == null) {
            return z2 ? -2 : -1;
        }
        int i5 = rVar2.f4513b;
        int i6 = rVar2.f4514c;
        byte[] bArr2 = rVar2.f4512a;
        r rVar3 = rVar2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int[] iArr = oVar.f4505b;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (rVar3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr2[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            rVar3 = rVar3.f4517f;
                            f.b(rVar3);
                            i2 = rVar3.f4513b;
                            i6 = rVar3.f4514c;
                            bArr2 = rVar3.f4512a;
                            if (rVar3 == rVar2) {
                                rVar3 = null;
                            }
                        } else {
                            i2 = i13;
                        }
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i16 = (i10 * (-1)) + i11;
            while (true) {
                int i17 = i5 + 1;
                int i18 = i11 + 1;
                if ((bArr2[i5] & 255) != iArr[i11]) {
                    return i7;
                }
                boolean z3 = i18 == i16;
                if (i17 == i6) {
                    f.b(rVar3);
                    r rVar4 = rVar3.f4517f;
                    f.b(rVar4);
                    i3 = rVar4.f4513b;
                    int i19 = rVar4.f4514c;
                    bArr = rVar4.f4512a;
                    if (rVar4 != rVar2) {
                        rVar = rVar4;
                        i6 = i19;
                    } else {
                        if (!z3) {
                            break loop0;
                        }
                        i6 = i19;
                        rVar = null;
                    }
                } else {
                    rVar = rVar3;
                    bArr = bArr2;
                    i3 = i17;
                }
                if (z3) {
                    i = iArr[i18];
                    i2 = i3;
                    bArr2 = bArr;
                    rVar3 = rVar;
                    break;
                }
                i5 = i3;
                bArr2 = bArr;
                rVar3 = rVar;
                i11 = i18;
            }
            if (i >= 0) {
                return i;
            }
            i8 = -i;
            i5 = i2;
            i4 = -2;
        }
        return z2 ? i4 : i7;
    }
}
