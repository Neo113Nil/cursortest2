package O2;

import N2.A;
import N2.C0150f;
import N2.u;
import Z1.i;
import h2.AbstractC0439a;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f2990a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(AbstractC0439a.f5056a);
        i.e(bytes, "this as java.lang.String).getBytes(charset)");
        f2990a = bytes;
    }

    public static final String a(C0150f c0150f, long j3) {
        i.f(c0150f, "<this>");
        if (j3 > 0) {
            long j4 = j3 - 1;
            if (c0150f.b(j4) == 13) {
                String u3 = c0150f.u(j4, AbstractC0439a.f5056a);
                c0150f.x(2L);
                return u3;
            }
        }
        String u4 = c0150f.u(j3, AbstractC0439a.f5056a);
        c0150f.x(1L);
        return u4;
    }

    public static final int b(C0150f c0150f, u uVar, boolean z3) {
        int i3;
        int i4;
        A a3;
        byte[] bArr;
        int i5;
        i.f(c0150f, "<this>");
        i.f(uVar, "options");
        A a4 = c0150f.f2928d;
        int i6 = -2;
        if (a4 == null) {
            return z3 ? -2 : -1;
        }
        int i7 = a4.f2893b;
        int i8 = a4.f2894c;
        byte[] bArr2 = a4.f2892a;
        A a5 = a4;
        int i9 = -1;
        int i10 = 0;
        loop0: while (true) {
            int i11 = i10 + 1;
            int[] iArr = uVar.f2965e;
            int i12 = iArr[i10];
            int i13 = i10 + 2;
            int i14 = iArr[i11];
            if (i14 != -1) {
                i9 = i14;
            }
            if (a5 == null) {
                break;
            }
            if (i12 >= 0) {
                int i15 = i7 + 1;
                int i16 = bArr2[i7] & 255;
                int i17 = i13 + i12;
                while (i13 != i17) {
                    if (i16 == iArr[i13]) {
                        i3 = iArr[i13 + i12];
                        if (i15 == i8) {
                            a5 = a5.f2897f;
                            i.c(a5);
                            i4 = a5.f2893b;
                            i8 = a5.f2894c;
                            bArr2 = a5.f2892a;
                            if (a5 == a4) {
                                a5 = null;
                            }
                        } else {
                            i4 = i15;
                        }
                    } else {
                        i13++;
                    }
                }
                return i9;
            }
            int i18 = (i12 * (-1)) + i13;
            while (true) {
                int i19 = i7 + 1;
                int i20 = i13 + 1;
                if ((bArr2[i7] & 255) != iArr[i13]) {
                    return i9;
                }
                boolean z4 = i20 == i18;
                if (i19 == i8) {
                    i.c(a5);
                    A a6 = a5.f2897f;
                    i.c(a6);
                    i5 = a6.f2893b;
                    int i21 = a6.f2894c;
                    bArr = a6.f2892a;
                    if (a6 != a4) {
                        a3 = a6;
                        i8 = i21;
                    } else {
                        if (!z4) {
                            break loop0;
                        }
                        i8 = i21;
                        a3 = null;
                    }
                } else {
                    a3 = a5;
                    bArr = bArr2;
                    i5 = i19;
                }
                if (z4) {
                    i3 = iArr[i20];
                    i4 = i5;
                    bArr2 = bArr;
                    a5 = a3;
                    break;
                }
                i7 = i5;
                bArr2 = bArr;
                a5 = a3;
                i13 = i20;
            }
            if (i3 >= 0) {
                return i3;
            }
            i10 = -i3;
            i7 = i4;
            i6 = -2;
        }
        return z3 ? i6 : i9;
    }
}
