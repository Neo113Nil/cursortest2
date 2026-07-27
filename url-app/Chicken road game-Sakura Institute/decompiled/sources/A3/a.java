package A3;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import z3.A;
import z3.C1448f;
import z3.u;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f842a;

    static {
        Intrinsics.checkNotNullParameter("0123456789abcdef", "<this>");
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        f842a = bytes;
    }

    public static final String a(C1448f c1448f, long j4) {
        Intrinsics.checkNotNullParameter(c1448f, "<this>");
        if (j4 > 0) {
            long j5 = j4 - 1;
            if (c1448f.b(j5) == 13) {
                String r2 = c1448f.r(j5, Charsets.UTF_8);
                c1448f.s(2L);
                return r2;
            }
        }
        c1448f.getClass();
        String r4 = c1448f.r(j4, Charsets.UTF_8);
        c1448f.s(1L);
        return r4;
    }

    public static final int b(C1448f c1448f, u options, boolean z4) {
        int i2;
        byte[] bArr;
        int i4;
        int i5;
        A a4;
        byte[] bArr2;
        int i6;
        Intrinsics.checkNotNullParameter(c1448f, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        A a5 = c1448f.f11998d;
        if (a5 == null) {
            return z4 ? -2 : -1;
        }
        int i7 = a5.f11963b;
        int i8 = a5.f11964c;
        int[] iArr = options.f12036i;
        byte[] bArr3 = a5.f11962a;
        A a6 = a5;
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
            if (a6 == null) {
                break;
            }
            if (i12 >= 0) {
                int i15 = i7 + 1;
                int i16 = bArr3[i7] & 255;
                int i17 = i13 + i12;
                while (i13 != i17) {
                    if (i16 == iArr[i13]) {
                        i2 = iArr[i13 + i12];
                        if (i15 == i8) {
                            a6 = a6.f11967f;
                            Intrinsics.c(a6);
                            i5 = a6.f11963b;
                            i4 = a6.f11964c;
                            bArr = a6.f11962a;
                            if (a6 == a5) {
                                a6 = null;
                            }
                        } else {
                            bArr = bArr3;
                            i4 = i8;
                            i5 = i15;
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
                if ((bArr3[i7] & 255) != iArr[i13]) {
                    return i9;
                }
                boolean z5 = i20 == i18;
                if (i19 == i8) {
                    Intrinsics.c(a6);
                    A a7 = a6.f11967f;
                    Intrinsics.c(a7);
                    i6 = a7.f11963b;
                    int i21 = a7.f11964c;
                    bArr2 = a7.f11962a;
                    if (a7 != a5) {
                        a4 = a7;
                        i8 = i21;
                    } else {
                        if (!z5) {
                            break loop0;
                        }
                        i8 = i21;
                        a4 = null;
                    }
                } else {
                    a4 = a6;
                    bArr2 = bArr3;
                    i6 = i19;
                }
                if (z5) {
                    i2 = iArr[i20];
                    int i22 = i6;
                    i4 = i8;
                    i5 = i22;
                    byte[] bArr4 = bArr2;
                    a6 = a4;
                    bArr = bArr4;
                    break;
                }
                i7 = i6;
                bArr3 = bArr2;
                a6 = a4;
                i13 = i20;
            }
            if (i2 >= 0) {
                return i2;
            }
            byte[] bArr5 = bArr;
            i10 = -i2;
            i7 = i5;
            i8 = i4;
            bArr3 = bArr5;
        }
        if (z4) {
            return -2;
        }
        return i9;
    }
}
