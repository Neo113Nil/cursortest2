package com.google.android.gms.internal.play_billing;

import E1.AbstractC0033i;
import androidx.datastore.preferences.protobuf.C0145l;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class Z0 extends AbstractC0216d1 {
    public static final Logger f = Logger.getLogger(Z0.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f2826g = M1.f2768e;

    /* renamed from: b, reason: collision with root package name */
    public C0257r1 f2827b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f2828c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2829d;

    /* renamed from: e, reason: collision with root package name */
    public int f2830e;

    public Z0(int i3, byte[] bArr) {
        super(11);
        int length = bArr.length;
        if (((length - i3) | i3) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(AbstractC0033i.g(length, i3, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.f2828c = bArr;
        this.f2830e = 0;
        this.f2829d = i3;
    }

    public static int N(long j3) {
        return (640 - (Long.numberOfLeadingZeros(j3) * 9)) >>> 6;
    }

    public static int c0(String str) {
        int length;
        try {
            length = O1.c(str);
        } catch (N1 unused) {
            length = str.getBytes(AbstractC0240l1.f2880a).length;
        }
        return d0(length) + length;
    }

    public static int d0(int i3) {
        return (352 - (Integer.numberOfLeadingZeros(i3) * 9)) >>> 6;
    }

    public final void O(int i3, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.f2828c, this.f2830e, i3);
            this.f2830e += i3;
        } catch (IndexOutOfBoundsException e3) {
            throw new C0145l(this.f2830e, this.f2829d, i3, e3);
        }
    }

    public final void P(int i3, Y0 y02) {
        Z((i3 << 3) | 2);
        Z(y02.d());
        O(y02.d(), y02.f2824b);
    }

    public final void Q(int i3, int i4) {
        Z((i3 << 3) | 5);
        R(i4);
    }

    public final void R(int i3) {
        int i4 = this.f2830e;
        try {
            byte[] bArr = this.f2828c;
            bArr[i4] = (byte) (i3 & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i4 + 1] = (byte) ((i3 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i4 + 2] = (byte) ((i3 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i4 + 3] = (byte) ((i3 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f2830e = i4 + 4;
        } catch (IndexOutOfBoundsException e3) {
            throw new C0145l(i4, this.f2829d, 4, e3);
        }
    }

    public final void S(int i3, long j3) {
        Z((i3 << 3) | 1);
        T(j3);
    }

    public final void T(long j3) {
        int i3 = this.f2830e;
        try {
            byte[] bArr = this.f2828c;
            bArr[i3] = (byte) (((int) j3) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i3 + 1] = (byte) (((int) (j3 >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i3 + 2] = (byte) (((int) (j3 >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i3 + 3] = (byte) (((int) (j3 >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i3 + 4] = (byte) (((int) (j3 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i3 + 5] = (byte) (((int) (j3 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i3 + 6] = (byte) (((int) (j3 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i3 + 7] = (byte) (((int) (j3 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f2830e = i3 + 8;
        } catch (IndexOutOfBoundsException e3) {
            throw new C0145l(i3, this.f2829d, 8, e3);
        }
    }

    public final void U(int i3, int i4) {
        Z(i3 << 3);
        V(i4);
    }

    public final void V(int i3) {
        if (i3 >= 0) {
            Z(i3);
        } else {
            b0(i3);
        }
    }

    public final void W(int i3, String str) {
        Z((i3 << 3) | 2);
        int i4 = this.f2830e;
        try {
            int d02 = d0(str.length() * 3);
            int d03 = d0(str.length());
            byte[] bArr = this.f2828c;
            int i5 = this.f2829d;
            if (d03 != d02) {
                Z(O1.c(str));
                int i6 = this.f2830e;
                this.f2830e = O1.b(str, bArr, i6, i5 - i6);
            } else {
                int i7 = i4 + d03;
                this.f2830e = i7;
                int b3 = O1.b(str, bArr, i7, i5 - i7);
                this.f2830e = i4;
                Z((b3 - i4) - d03);
                this.f2830e = b3;
            }
        } catch (N1 e3) {
            this.f2830e = i4;
            f.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(AbstractC0240l1.f2880a);
            try {
                int length = bytes.length;
                Z(length);
                O(length, bytes);
            } catch (IndexOutOfBoundsException e4) {
                throw new C0145l(e4);
            }
        } catch (IndexOutOfBoundsException e5) {
            throw new C0145l(e5);
        }
    }

    public final void X(int i3, int i4) {
        Z((i3 << 3) | i4);
    }

    public final void Y(int i3, int i4) {
        Z(i3 << 3);
        Z(i4);
    }

    public final void Z(int i3) {
        while (true) {
            int i4 = i3 & (-128);
            byte[] bArr = this.f2828c;
            if (i4 == 0) {
                int i5 = this.f2830e;
                this.f2830e = i5 + 1;
                bArr[i5] = (byte) i3;
                return;
            } else {
                try {
                    int i6 = this.f2830e;
                    this.f2830e = i6 + 1;
                    bArr[i6] = (byte) ((i3 | 128) & KotlinVersion.MAX_COMPONENT_VALUE);
                    i3 >>>= 7;
                } catch (IndexOutOfBoundsException e3) {
                    throw new C0145l(this.f2830e, this.f2829d, 1, e3);
                }
            }
            throw new C0145l(this.f2830e, this.f2829d, 1, e3);
        }
    }

    public final void a0(int i3, long j3) {
        Z(i3 << 3);
        b0(j3);
    }

    public final void b0(long j3) {
        byte[] bArr = this.f2828c;
        boolean z = f2826g;
        int i3 = this.f2829d;
        if (!z || i3 - this.f2830e < 10) {
            while ((j3 & (-128)) != 0) {
                try {
                    int i4 = this.f2830e;
                    this.f2830e = i4 + 1;
                    bArr[i4] = (byte) ((((int) j3) | 128) & KotlinVersion.MAX_COMPONENT_VALUE);
                    j3 >>>= 7;
                } catch (IndexOutOfBoundsException e3) {
                    throw new C0145l(this.f2830e, i3, 1, e3);
                }
            }
            int i5 = this.f2830e;
            this.f2830e = i5 + 1;
            bArr[i5] = (byte) j3;
            return;
        }
        while (true) {
            int i6 = (int) j3;
            if ((j3 & (-128)) == 0) {
                int i7 = this.f2830e;
                this.f2830e = i7 + 1;
                M1.f2766c.d(bArr, M1.f + i7, (byte) i6);
                return;
            }
            int i8 = this.f2830e;
            this.f2830e = i8 + 1;
            long j4 = i8;
            M1.f2766c.d(bArr, M1.f + j4, (byte) ((i6 | 128) & KotlinVersion.MAX_COMPONENT_VALUE));
            j3 >>>= 7;
        }
    }
}
