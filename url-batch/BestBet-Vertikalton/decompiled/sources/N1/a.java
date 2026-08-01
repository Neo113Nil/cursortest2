package N1;

import M1.f;
import M1.n;
import M1.q;
import k1.e;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f838a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(r1.a.f3833a);
        e.d(bytes, "this as java.lang.String).getBytes(charset)");
        f838a = bytes;
    }

    public static final String a(f fVar, long j2) {
        e.e(fVar, "<this>");
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (fVar.d(j3) == 13) {
                String t2 = fVar.t(j3, r1.a.f3833a);
                fVar.u(2L);
                return t2;
            }
        }
        String t3 = fVar.t(j2, r1.a.f3833a);
        fVar.u(1L);
        return t3;
    }

    public static final int b(f fVar, n nVar, boolean z2) {
        int i;
        int i2;
        q qVar;
        byte[] bArr;
        int i3;
        e.e(fVar, "<this>");
        e.e(nVar, "options");
        q qVar2 = fVar.f798a;
        int i4 = -2;
        if (qVar2 == null) {
            return z2 ? -2 : -1;
        }
        int i5 = qVar2.f821b;
        int i6 = qVar2.f822c;
        byte[] bArr2 = qVar2.f820a;
        q qVar3 = qVar2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int[] iArr = nVar.f813b;
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
                            qVar3 = qVar3.f824f;
                            e.b(qVar3);
                            i2 = qVar3.f821b;
                            i6 = qVar3.f822c;
                            bArr2 = qVar3.f820a;
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
                    e.b(qVar3);
                    q qVar4 = qVar3.f824f;
                    e.b(qVar4);
                    i3 = qVar4.f821b;
                    int i19 = qVar4.f822c;
                    bArr = qVar4.f820a;
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
