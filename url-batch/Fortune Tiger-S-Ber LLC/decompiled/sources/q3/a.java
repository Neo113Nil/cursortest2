package q3;

import p3.f;
import p3.n;
import p3.q;
import u2.c;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f3136a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(b3.a.f967a);
        c.d(bytes, "this as java.lang.String).getBytes(charset)");
        f3136a = bytes;
    }

    public static final String a(long j4, f fVar) {
        if (j4 > 0) {
            long j5 = j4 - 1;
            if (fVar.o(j5) == 13) {
                String r3 = fVar.r(j5, b3.a.f967a);
                fVar.skip(2L);
                return r3;
            }
        }
        String r4 = fVar.r(j4, b3.a.f967a);
        fVar.skip(1L);
        return r4;
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
    public static final int b(f fVar, n nVar, boolean z3) {
        int i4;
        int i5;
        int i6;
        q qVar;
        int i7;
        c.e(nVar, "options");
        q qVar2 = fVar.f3028f;
        if (qVar2 == null) {
            return z3 ? -2 : -1;
        }
        byte[] bArr = qVar2.f3041a;
        int i8 = qVar2.f3042b;
        int i9 = qVar2.c;
        int[] iArr = nVar.g;
        q qVar3 = qVar2;
        int i10 = -1;
        int i11 = 0;
        loop0: while (true) {
            int i12 = i11 + 1;
            int i13 = iArr[i11];
            int i14 = i11 + 2;
            int i15 = iArr[i12];
            if (i15 != -1) {
                i10 = i15;
            }
            if (qVar3 == null) {
                break;
            }
            if (i13 >= 0) {
                int i16 = i8 + 1;
                int i17 = bArr[i8] & 255;
                int i18 = i14 + i13;
                while (i14 != i18) {
                    if (i17 == iArr[i14]) {
                        i4 = iArr[i14 + i13];
                        if (i16 == i9) {
                            qVar3 = qVar3.f3045f;
                            c.b(qVar3);
                            int i19 = qVar3.f3042b;
                            byte[] bArr2 = qVar3.f3041a;
                            i5 = qVar3.c;
                            if (qVar3 == qVar2) {
                                i6 = i19;
                                bArr = bArr2;
                                qVar3 = null;
                            } else {
                                i6 = i19;
                                bArr = bArr2;
                            }
                        } else {
                            i5 = i9;
                            i6 = i16;
                        }
                        if (i4 >= 0) {
                            return i4;
                        }
                        int i20 = i5;
                        i11 = -i4;
                        i8 = i6;
                        i9 = i20;
                    } else {
                        i14++;
                    }
                }
                break loop0;
            }
            int i21 = (i13 * (-1)) + i14;
            while (true) {
                int i22 = i8 + 1;
                int i23 = i14 + 1;
                if ((bArr[i8] & 255) != iArr[i14]) {
                    break loop0;
                }
                boolean z4 = i23 == i21;
                if (i22 == i9) {
                    c.b(qVar3);
                    q qVar4 = qVar3.f3045f;
                    c.b(qVar4);
                    i6 = qVar4.f3042b;
                    byte[] bArr3 = qVar4.f3041a;
                    i7 = qVar4.c;
                    if (qVar4 != qVar2) {
                        qVar = qVar4;
                        bArr = bArr3;
                    } else {
                        if (!z4) {
                            break loop0;
                        }
                        bArr = bArr3;
                        qVar = null;
                    }
                } else {
                    qVar = qVar3;
                    i7 = i9;
                    i6 = i22;
                }
                if (z4) {
                    i4 = iArr[i23];
                    int i24 = i7;
                    qVar3 = qVar;
                    i5 = i24;
                    break;
                }
                i8 = i6;
                i9 = i7;
                qVar3 = qVar;
                i14 = i23;
            }
        }
        return i10;
    }
}
