package D4;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final int f518e;

    /* renamed from: f, reason: collision with root package name */
    public static final ThreadLocal f519f;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f520a;

    /* renamed from: b, reason: collision with root package name */
    public final int f521b;

    /* renamed from: c, reason: collision with root package name */
    public int f522c;

    /* renamed from: d, reason: collision with root package name */
    public OutputStream f523d;

    static {
        int i7 = 51200;
        try {
            String b7 = a4.d.b("otel.experimental.otlp.buffer-size", "");
            if (!b7.isEmpty()) {
                i7 = Integer.parseInt(b7);
            }
        } catch (Throwable unused) {
        }
        f518e = i7;
        f519f = new ThreadLocal();
    }

    public d(OutputStream outputStream) {
        int i7 = f518e;
        this.f520a = new byte[i7];
        this.f521b = i7;
        this.f523d = outputStream;
    }

    public static int a(long j4) {
        int i7;
        if (((-128) & j4) == 0) {
            return 1;
        }
        if (j4 < 0) {
            return 10;
        }
        if (((-34359738368L) & j4) != 0) {
            j4 >>>= 28;
            i7 = 6;
        } else {
            i7 = 2;
        }
        if (((-2097152) & j4) != 0) {
            i7 += 2;
            j4 >>>= 14;
        }
        return (j4 & (-16384)) != 0 ? i7 + 1 : i7;
    }

    public static int b(int i7) {
        if ((i7 & (-128)) == 0) {
            return 1;
        }
        if ((i7 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i7) == 0) {
            return 3;
        }
        return (i7 & (-268435456)) == 0 ? 4 : 5;
    }

    public final void c() {
        this.f523d.write(this.f520a, 0, this.f522c);
        this.f522c = 0;
    }

    public final void d(int i7) {
        if (this.f521b - this.f522c < i7) {
            c();
        }
    }

    public final void e(byte b7) {
        if (this.f522c == this.f521b) {
            c();
        }
        int i7 = this.f522c;
        this.f522c = i7 + 1;
        this.f520a[i7] = b7;
    }

    public final void f(int i7, byte[] bArr) {
        int i8 = this.f522c;
        int i9 = this.f521b;
        int i10 = i9 - i8;
        byte[] bArr2 = this.f520a;
        if (i10 >= i7) {
            System.arraycopy(bArr, 0, bArr2, i8, i7);
            this.f522c += i7;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i8, i10);
        int i11 = i7 - i10;
        this.f522c = i9;
        c();
        if (i11 > i9) {
            this.f523d.write(bArr, i10, i11);
        } else {
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            this.f522c = i11;
        }
    }

    public final void g(long j4) {
        d(8);
        int i7 = this.f522c;
        int i8 = i7 + 1;
        this.f522c = i8;
        byte[] bArr = this.f520a;
        bArr[i7] = (byte) (j4 & 255);
        int i9 = i7 + 2;
        this.f522c = i9;
        bArr[i8] = (byte) ((j4 >> 8) & 255);
        int i10 = i7 + 3;
        this.f522c = i10;
        bArr[i9] = (byte) ((j4 >> 16) & 255);
        int i11 = i7 + 4;
        this.f522c = i11;
        bArr[i10] = (byte) (255 & (j4 >> 24));
        int i12 = i7 + 5;
        this.f522c = i12;
        bArr[i11] = (byte) (((int) (j4 >> 32)) & 255);
        int i13 = i7 + 6;
        this.f522c = i13;
        bArr[i12] = (byte) (((int) (j4 >> 40)) & 255);
        int i14 = i7 + 7;
        this.f522c = i14;
        bArr[i13] = (byte) (((int) (j4 >> 48)) & 255);
        this.f522c = i7 + 8;
        bArr[i14] = (byte) (((int) (j4 >> 56)) & 255);
    }

    public final void h(int i7) {
        d(5);
        while (true) {
            int i8 = i7 & (-128);
            byte[] bArr = this.f520a;
            if (i8 == 0) {
                int i9 = this.f522c;
                this.f522c = i9 + 1;
                bArr[i9] = (byte) i7;
                return;
            } else {
                int i10 = this.f522c;
                this.f522c = i10 + 1;
                bArr[i10] = (byte) ((i7 & 127) | 128);
                i7 >>>= 7;
            }
        }
    }

    public final void i(long j4) {
        d(10);
        while (true) {
            long j7 = (-128) & j4;
            byte[] bArr = this.f520a;
            if (j7 == 0) {
                int i7 = this.f522c;
                this.f522c = i7 + 1;
                bArr[i7] = (byte) j4;
                return;
            } else {
                int i8 = this.f522c;
                this.f522c = i8 + 1;
                bArr[i8] = (byte) ((((int) j4) & 127) | 128);
                j4 >>>= 7;
            }
        }
    }
}
