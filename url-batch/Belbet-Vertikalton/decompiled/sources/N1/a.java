package N1;

import M1.f;
import M1.n;
import M1.q;
import j1.h;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f970a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(q1.a.f3995a);
        h.d(bytes, "this as java.lang.String).getBytes(charset)");
        f970a = bytes;
    }

    public static final String a(f fVar, long j) {
        h.e(fVar, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (fVar.d(j2) == 13) {
                String F2 = fVar.F(j2, q1.a.f3995a);
                fVar.G(2L);
                return F2;
            }
        }
        String F3 = fVar.F(j, q1.a.f3995a);
        fVar.G(1L);
        return F3;
    }

    public static final int b(f fVar, n nVar, boolean z2) {
        int i;
        int i2;
        q qVar;
        byte[] bArr;
        int i3;
        h.e(fVar, "<this>");
        h.e(nVar, "options");
        q qVar2 = fVar.f826a;
        int i4 = -2;
        if (qVar2 == null) {
            return z2 ? -2 : -1;
        }
        int i5 = qVar2.f850b;
        int i6 = qVar2.f851c;
        byte[] bArr2 = qVar2.f849a;
        q qVar3 = qVar2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int[] iArr = nVar.f842b;
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
                            qVar3 = qVar3.f853f;
                            h.b(qVar3);
                            i2 = qVar3.f850b;
                            i6 = qVar3.f851c;
                            bArr2 = qVar3.f849a;
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
                    h.b(qVar3);
                    q qVar4 = qVar3.f853f;
                    h.b(qVar4);
                    i3 = qVar4.f850b;
                    int i19 = qVar4.f851c;
                    bArr = qVar4.f849a;
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
