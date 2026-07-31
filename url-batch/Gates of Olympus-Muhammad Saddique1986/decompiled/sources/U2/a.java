package U2;

import T2.A;
import T2.C0231f;
import T2.u;
import f2.j;
import n2.AbstractC0721a;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f4515a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(AbstractC0721a.f7347a);
        j.e(bytes, "this as java.lang.String).getBytes(charset)");
        f4515a = bytes;
    }

    public static final String a(C0231f c0231f, long j3) {
        j.f(c0231f, "<this>");
        if (j3 > 0) {
            long j4 = j3 - 1;
            if (c0231f.b(j4) == 13) {
                String u3 = c0231f.u(j4, AbstractC0721a.f7347a);
                c0231f.v(2L);
                return u3;
            }
        }
        String u4 = c0231f.u(j3, AbstractC0721a.f7347a);
        c0231f.v(1L);
        return u4;
    }

    public static final int b(C0231f c0231f, u uVar, boolean z3) {
        int i3;
        int i4;
        A a3;
        byte[] bArr;
        int i5;
        j.f(c0231f, "<this>");
        j.f(uVar, "options");
        A a4 = c0231f.f4408d;
        int i6 = -2;
        if (a4 == null) {
            return z3 ? -2 : -1;
        }
        int i7 = a4.f4373b;
        int i8 = a4.f4374c;
        byte[] bArr2 = a4.f4372a;
        A a5 = a4;
        int i9 = -1;
        int i10 = 0;
        loop0: while (true) {
            int i11 = i10 + 1;
            int[] iArr = uVar.f4445e;
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
                            a5 = a5.f4377f;
                            j.c(a5);
                            i4 = a5.f4373b;
                            i8 = a5.f4374c;
                            bArr2 = a5.f4372a;
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
                    j.c(a5);
                    A a6 = a5.f4377f;
                    j.c(a6);
                    i5 = a6.f4373b;
                    int i21 = a6.f4374c;
                    bArr = a6.f4372a;
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
