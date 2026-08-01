package h4;

import g4.f;
import g4.n;
import g4.q;
import i3.d;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f1995a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(p3.a.f3089a);
        d.d(bytes, "this as java.lang.String).getBytes(charset)");
        f1995a = bytes;
    }

    public static final String a(long j2, f fVar) {
        if (j2 > 0) {
            long j4 = j2 - 1;
            if (fVar.o(j4) == 13) {
                String r4 = fVar.r(j4, p3.a.f3089a);
                fVar.skip(2L);
                return r4;
            }
        }
        String r5 = fVar.r(j2, p3.a.f3089a);
        fVar.skip(1L);
        return r5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005e, code lost:
    
        return -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int b(f fVar, n nVar, boolean z4) {
        int i;
        int i4;
        int i5;
        q qVar;
        int i6;
        d.e(nVar, "options");
        q qVar2 = fVar.f1934f;
        if (qVar2 == null) {
            return z4 ? -2 : -1;
        }
        byte[] bArr = qVar2.f1951a;
        int i7 = qVar2.f1952b;
        int i8 = qVar2.f1953c;
        int[] iArr = nVar.f1946g;
        q qVar3 = qVar2;
        int i9 = -1;
        int i10 = 0;
        loop0: while (true) {
            int i11 = i10 + 1;
            int i12 = iArr[i10];
            int i13 = i10 + 2;
            int i14 = iArr[i11];
            if (i14 != -1) {
                i9 = i14;
            }
            if (qVar3 == null) {
                break;
            }
            if (i12 >= 0) {
                int i15 = i7 + 1;
                int i16 = bArr[i7] & 255;
                int i17 = i13 + i12;
                while (i13 != i17) {
                    if (i16 == iArr[i13]) {
                        i = iArr[i13 + i12];
                        if (i15 == i8) {
                            qVar3 = qVar3.f1955f;
                            d.b(qVar3);
                            int i18 = qVar3.f1952b;
                            byte[] bArr2 = qVar3.f1951a;
                            i4 = qVar3.f1953c;
                            if (qVar3 == qVar2) {
                                i5 = i18;
                                bArr = bArr2;
                                qVar3 = null;
                            } else {
                                i5 = i18;
                                bArr = bArr2;
                            }
                        } else {
                            i4 = i8;
                            i5 = i15;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        int i19 = i4;
                        i10 = -i;
                        i7 = i5;
                        i8 = i19;
                    } else {
                        i13++;
                    }
                }
                break loop0;
            }
            int i20 = (i12 * (-1)) + i13;
            while (true) {
                int i21 = i7 + 1;
                int i22 = i13 + 1;
                if ((bArr[i7] & 255) != iArr[i13]) {
                    break loop0;
                }
                boolean z5 = i22 == i20;
                if (i21 == i8) {
                    d.b(qVar3);
                    q qVar4 = qVar3.f1955f;
                    d.b(qVar4);
                    i5 = qVar4.f1952b;
                    byte[] bArr3 = qVar4.f1951a;
                    i6 = qVar4.f1953c;
                    if (qVar4 != qVar2) {
                        qVar = qVar4;
                        bArr = bArr3;
                    } else {
                        if (!z5) {
                            break loop0;
                        }
                        bArr = bArr3;
                        qVar = null;
                    }
                } else {
                    qVar = qVar3;
                    i6 = i8;
                    i5 = i21;
                }
                if (z5) {
                    i = iArr[i22];
                    int i23 = i6;
                    qVar3 = qVar;
                    i4 = i23;
                    break;
                }
                i7 = i5;
                i8 = i6;
                qVar3 = qVar;
                i13 = i22;
            }
        }
        return i9;
    }
}
