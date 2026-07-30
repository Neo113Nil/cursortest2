package k5;

import java.io.OutputStream;

/* renamed from: k5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0603c {

    /* renamed from: e, reason: collision with root package name */
    public static final int f6060e;

    /* renamed from: f, reason: collision with root package name */
    public static final ThreadLocal f6061f;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f6062a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6063b;

    /* renamed from: c, reason: collision with root package name */
    public int f6064c;

    /* renamed from: d, reason: collision with root package name */
    public OutputStream f6065d;

    static {
        int i2 = 51200;
        try {
            String b7 = H4.d.b("otel.experimental.otlp.buffer-size", "");
            if (!b7.isEmpty()) {
                i2 = Integer.parseInt(b7);
            }
        } catch (Throwable unused) {
        }
        f6060e = i2;
        f6061f = new ThreadLocal();
    }

    public C0603c(OutputStream outputStream) {
        int i2 = f6060e;
        this.f6062a = new byte[i2];
        this.f6063b = i2;
        this.f6065d = outputStream;
    }

    public static int a(long j) {
        int i2;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i2 = 6;
        } else {
            i2 = 2;
        }
        if (((-2097152) & j) != 0) {
            i2 += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i2 + 1 : i2;
    }

    public static int b(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    public final void c() {
        this.f6065d.write(this.f6062a, 0, this.f6064c);
        this.f6064c = 0;
    }

    public final void d(int i2) {
        if (this.f6063b - this.f6064c < i2) {
            c();
        }
    }

    public final void e(byte b7) {
        if (this.f6064c == this.f6063b) {
            c();
        }
        int i2 = this.f6064c;
        this.f6064c = i2 + 1;
        this.f6062a[i2] = b7;
    }

    public final void f(byte[] bArr, int i2) {
        int i5 = this.f6064c;
        int i7 = this.f6063b;
        int i8 = i7 - i5;
        byte[] bArr2 = this.f6062a;
        if (i8 >= i2) {
            System.arraycopy(bArr, 0, bArr2, i5, i2);
            this.f6064c += i2;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i5, i8);
        int i9 = i2 - i8;
        this.f6064c = i7;
        c();
        if (i9 > i7) {
            this.f6065d.write(bArr, i8, i9);
        } else {
            System.arraycopy(bArr, i8, bArr2, 0, i9);
            this.f6064c = i9;
        }
    }

    public final void g(long j) {
        d(8);
        int i2 = this.f6064c;
        int i5 = i2 + 1;
        this.f6064c = i5;
        byte[] bArr = this.f6062a;
        bArr[i2] = (byte) (j & 255);
        int i7 = i2 + 2;
        this.f6064c = i7;
        bArr[i5] = (byte) ((j >> 8) & 255);
        int i8 = i2 + 3;
        this.f6064c = i8;
        bArr[i7] = (byte) ((j >> 16) & 255);
        int i9 = i2 + 4;
        this.f6064c = i9;
        bArr[i8] = (byte) (255 & (j >> 24));
        int i10 = i2 + 5;
        this.f6064c = i10;
        bArr[i9] = (byte) (((int) (j >> 32)) & 255);
        int i11 = i2 + 6;
        this.f6064c = i11;
        bArr[i10] = (byte) (((int) (j >> 40)) & 255);
        int i12 = i2 + 7;
        this.f6064c = i12;
        bArr[i11] = (byte) (((int) (j >> 48)) & 255);
        this.f6064c = i2 + 8;
        bArr[i12] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void h(int i2) {
        d(5);
        while (true) {
            int i5 = i2 & (-128);
            byte[] bArr = this.f6062a;
            if (i5 == 0) {
                int i7 = this.f6064c;
                this.f6064c = i7 + 1;
                bArr[i7] = (byte) i2;
                return;
            } else {
                int i8 = this.f6064c;
                this.f6064c = i8 + 1;
                bArr[i8] = (byte) ((i2 & 127) | 128);
                i2 >>>= 7;
            }
        }
    }

    public final void i(long j) {
        d(10);
        while (true) {
            long j7 = (-128) & j;
            byte[] bArr = this.f6062a;
            if (j7 == 0) {
                int i2 = this.f6064c;
                this.f6064c = i2 + 1;
                bArr[i2] = (byte) j;
                return;
            } else {
                int i5 = this.f6064c;
                this.f6064c = i5 + 1;
                bArr[i5] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
        }
    }
}
