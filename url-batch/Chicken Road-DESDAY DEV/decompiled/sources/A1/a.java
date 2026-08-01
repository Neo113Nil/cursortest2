package A1;

import b1.d;
import z1.f;
import z1.n;
import z1.q;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f0a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(i1.a.f2460a);
        d.d(bytes, "this as java.lang.String).getBytes(charset)");
        f0a = bytes;
    }

    public static final String a(f fVar, long j2) {
        d.e(fVar, "<this>");
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (fVar.h(j3) == 13) {
                String n2 = fVar.n(j3, i1.a.f2460a);
                fVar.o(2L);
                return n2;
            }
        }
        String n3 = fVar.n(j2, i1.a.f2460a);
        fVar.o(1L);
        return n3;
    }

    public static final int b(f fVar, n nVar, boolean z2) {
        int i;
        int i2;
        q qVar;
        byte[] bArr;
        int i3;
        d.e(fVar, "<this>");
        d.e(nVar, "options");
        q qVar2 = fVar.f4267a;
        int i4 = -2;
        if (qVar2 == null) {
            return z2 ? -2 : -1;
        }
        int i5 = qVar2.f4290b;
        int i6 = qVar2.f4291c;
        byte[] bArr2 = qVar2.f4289a;
        q qVar3 = qVar2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int[] iArr = nVar.f4282b;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (qVar3 == null) {
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
                            qVar3 = qVar3.f4293f;
                            d.b(qVar3);
                            i2 = qVar3.f4290b;
                            i6 = qVar3.f4291c;
                            bArr2 = qVar3.f4289a;
                            if (qVar3 == qVar2) {
                                qVar3 = null;
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
                    d.b(qVar3);
                    q qVar4 = qVar3.f4293f;
                    d.b(qVar4);
                    i3 = qVar4.f4290b;
                    int i19 = qVar4.f4291c;
                    bArr = qVar4.f4289a;
                    if (qVar4 != qVar2) {
                        qVar = qVar4;
                        i6 = i19;
                    } else {
                        if (!z3) {
                            break loop0;
                        }
                        i6 = i19;
                        qVar = null;
                    }
                } else {
                    qVar = qVar3;
                    bArr = bArr2;
                    i3 = i17;
                }
                if (z3) {
                    i = iArr[i18];
                    i2 = i3;
                    bArr2 = bArr;
                    qVar3 = qVar;
                    break;
                }
                i5 = i3;
                bArr2 = bArr;
                qVar3 = qVar;
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
