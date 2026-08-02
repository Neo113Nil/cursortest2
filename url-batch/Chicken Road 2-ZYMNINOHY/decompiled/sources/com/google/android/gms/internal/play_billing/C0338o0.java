package com.google.android.gms.internal.play_billing;

import E.AbstractC0005f;
import a.AbstractC0124a;
import androidx.datastore.preferences.protobuf.C0179l;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.play_billing.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0338o0 extends AbstractC0124a {

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f5988e = Logger.getLogger(C0338o0.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f5989f = AbstractC0303b1.f5937e;

    /* renamed from: a, reason: collision with root package name */
    public H0 f5990a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f5991b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5992c;

    /* renamed from: d, reason: collision with root package name */
    public int f5993d;

    public C0338o0(int i4, byte[] bArr) {
        int length = bArr.length;
        if (((length - i4) | i4) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(AbstractC0005f.i(length, i4, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.f5991b = bArr;
        this.f5993d = 0;
        this.f5992c = i4;
    }

    public static int V(String str) {
        int length;
        try {
            length = AbstractC0309d1.c(str);
        } catch (C0306c1 unused) {
            length = str.getBytes(B0.f5803a).length;
        }
        return W(length) + length;
    }

    public static int W(int i4) {
        return (352 - (Integer.numberOfLeadingZeros(i4) * 9)) >>> 6;
    }

    public static int X(long j4) {
        return (640 - (Long.numberOfLeadingZeros(j4) * 9)) >>> 6;
    }

    public final void Y(int i4, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.f5991b, this.f5993d, i4);
            this.f5993d += i4;
        } catch (IndexOutOfBoundsException e4) {
            throw new C0179l(this.f5993d, this.f5992c, i4, e4);
        }
    }

    public final void Z(int i4, C0336n0 c0336n0) {
        j0((i4 << 3) | 2);
        j0(c0336n0.d());
        Y(c0336n0.d(), c0336n0.f5983b);
    }

    public final void a0(int i4, int i5) {
        j0((i4 << 3) | 5);
        b0(i5);
    }

    public final void b0(int i4) {
        int i5 = this.f5993d;
        try {
            byte[] bArr = this.f5991b;
            bArr[i5] = (byte) i4;
            bArr[i5 + 1] = (byte) (i4 >> 8);
            bArr[i5 + 2] = (byte) (i4 >> 16);
            bArr[i5 + 3] = (byte) (i4 >> 24);
            this.f5993d = i5 + 4;
        } catch (IndexOutOfBoundsException e4) {
            throw new C0179l(i5, this.f5992c, 4, e4);
        }
    }

    public final void c0(int i4, long j4) {
        j0((i4 << 3) | 1);
        d0(j4);
    }

    public final void d0(long j4) {
        int i4 = this.f5993d;
        try {
            byte[] bArr = this.f5991b;
            bArr[i4] = (byte) j4;
            bArr[i4 + 1] = (byte) (j4 >> 8);
            bArr[i4 + 2] = (byte) (j4 >> 16);
            bArr[i4 + 3] = (byte) (j4 >> 24);
            bArr[i4 + 4] = (byte) (j4 >> 32);
            bArr[i4 + 5] = (byte) (j4 >> 40);
            bArr[i4 + 6] = (byte) (j4 >> 48);
            bArr[i4 + 7] = (byte) (j4 >> 56);
            this.f5993d = i4 + 8;
        } catch (IndexOutOfBoundsException e4) {
            throw new C0179l(i4, this.f5992c, 8, e4);
        }
    }

    public final void e0(int i4, int i5) {
        j0(i4 << 3);
        f0(i5);
    }

    public final void f0(int i4) {
        if (i4 >= 0) {
            j0(i4);
        } else {
            l0(i4);
        }
    }

    public final void g0(int i4, String str) {
        j0((i4 << 3) | 2);
        int i5 = this.f5993d;
        try {
            int W4 = W(str.length() * 3);
            int W5 = W(str.length());
            int i6 = this.f5992c;
            byte[] bArr = this.f5991b;
            if (W5 != W4) {
                j0(AbstractC0309d1.c(str));
                int i7 = this.f5993d;
                this.f5993d = AbstractC0309d1.b(str, bArr, i7, i6 - i7);
            } else {
                int i8 = i5 + W5;
                this.f5993d = i8;
                int b4 = AbstractC0309d1.b(str, bArr, i8, i6 - i8);
                this.f5993d = i5;
                j0((b4 - i5) - W5);
                this.f5993d = b4;
            }
        } catch (C0306c1 e4) {
            this.f5993d = i5;
            f5988e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e4);
            byte[] bytes = str.getBytes(B0.f5803a);
            try {
                int length = bytes.length;
                j0(length);
                Y(length, bytes);
            } catch (IndexOutOfBoundsException e5) {
                throw new C0179l(e5);
            }
        } catch (IndexOutOfBoundsException e6) {
            throw new C0179l(e6);
        }
    }

    public final void h0(int i4, int i5) {
        j0((i4 << 3) | i5);
    }

    public final void i0(int i4, int i5) {
        j0(i4 << 3);
        j0(i5);
    }

    public final void j0(int i4) {
        int i5;
        int i6 = this.f5993d;
        while (true) {
            int i7 = i4 & (-128);
            byte[] bArr = this.f5991b;
            if (i7 == 0) {
                i5 = i6 + 1;
                bArr[i6] = (byte) i4;
                this.f5993d = i5;
                return;
            } else {
                i5 = i6 + 1;
                try {
                    bArr[i6] = (byte) (i4 | 128);
                    i4 >>>= 7;
                    i6 = i5;
                } catch (IndexOutOfBoundsException e4) {
                    throw new C0179l(i5, this.f5992c, 1, e4);
                }
            }
            throw new C0179l(i5, this.f5992c, 1, e4);
        }
    }

    public final void k0(int i4, long j4) {
        j0(i4 << 3);
        l0(j4);
    }

    public final void l0(long j4) {
        int i4;
        int i5 = this.f5993d;
        boolean z = f5989f;
        int i6 = this.f5992c;
        byte[] bArr = this.f5991b;
        if (!z || i6 - i5 < 10) {
            long j5 = j4;
            while ((j5 & (-128)) != 0) {
                i4 = i5 + 1;
                try {
                    bArr[i5] = (byte) (((int) j5) | 128);
                    j5 >>>= 7;
                    i5 = i4;
                } catch (IndexOutOfBoundsException e4) {
                    throw new C0179l(i4, i6, 1, e4);
                }
            }
            i4 = i5 + 1;
            bArr[i5] = (byte) j5;
        } else {
            long j6 = j4;
            while ((j6 & (-128)) != 0) {
                AbstractC0303b1.f5935c.d(bArr, AbstractC0303b1.f5938f + i5, (byte) (((int) j6) | 128));
                j6 >>>= 7;
                i5++;
            }
            i4 = i5 + 1;
            AbstractC0303b1.f5935c.d(bArr, AbstractC0303b1.f5938f + i5, (byte) j6);
        }
        this.f5993d = i4;
    }
}
