package y3;

import java.io.OutputStream;
import kotlin.KotlinVersion;

/* renamed from: y3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1569c {

    /* renamed from: e, reason: collision with root package name */
    public static final int f12386e;

    /* renamed from: f, reason: collision with root package name */
    public static final ThreadLocal f12387f;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f12388a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12389b;

    /* renamed from: c, reason: collision with root package name */
    public int f12390c;

    /* renamed from: d, reason: collision with root package name */
    public OutputStream f12391d;

    static {
        int i2 = 51200;
        try {
            String b6 = V2.d.b("otel.experimental.otlp.buffer-size", "");
            if (!b6.isEmpty()) {
                i2 = Integer.parseInt(b6);
            }
        } catch (Throwable unused) {
        }
        f12386e = i2;
        f12387f = new ThreadLocal();
    }

    public C1569c(OutputStream outputStream) {
        int i2 = f12386e;
        this.f12388a = new byte[i2];
        this.f12389b = i2;
        this.f12391d = outputStream;
    }

    public static int a(long j2) {
        int i2;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            j2 >>>= 28;
            i2 = 6;
        } else {
            i2 = 2;
        }
        if (((-2097152) & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        if ((j2 & (-16384)) != 0) {
            i2++;
        }
        return i2;
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
        this.f12391d.write(this.f12388a, 0, this.f12390c);
        this.f12390c = 0;
    }

    public final void d(int i2) {
        if (this.f12389b - this.f12390c < i2) {
            c();
        }
    }

    public final void e(byte b6) {
        if (this.f12390c == this.f12389b) {
            c();
        }
        int i2 = this.f12390c;
        this.f12390c = i2 + 1;
        this.f12388a[i2] = b6;
    }

    public final void f(int i2, byte[] bArr) {
        int i3 = this.f12390c;
        int i6 = this.f12389b;
        int i7 = i6 - i3;
        byte[] bArr2 = this.f12388a;
        if (i7 >= i2) {
            System.arraycopy(bArr, 0, bArr2, i3, i2);
            this.f12390c += i2;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i3, i7);
        int i8 = i2 - i7;
        this.f12390c = i6;
        c();
        if (i8 > i6) {
            this.f12391d.write(bArr, i7, i8);
        } else {
            System.arraycopy(bArr, i7, bArr2, 0, i8);
            this.f12390c = i8;
        }
    }

    public final void g(long j2) {
        d(8);
        int i2 = this.f12390c;
        int i3 = i2 + 1;
        this.f12390c = i3;
        byte[] bArr = this.f12388a;
        bArr[i2] = (byte) (j2 & 255);
        int i6 = i2 + 2;
        this.f12390c = i6;
        bArr[i3] = (byte) ((j2 >> 8) & 255);
        int i7 = i2 + 3;
        this.f12390c = i7;
        bArr[i6] = (byte) ((j2 >> 16) & 255);
        int i8 = i2 + 4;
        this.f12390c = i8;
        bArr[i7] = (byte) (255 & (j2 >> 24));
        int i9 = i2 + 5;
        this.f12390c = i9;
        bArr[i8] = (byte) (((int) (j2 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i10 = i2 + 6;
        this.f12390c = i10;
        bArr[i9] = (byte) (((int) (j2 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i11 = i2 + 7;
        this.f12390c = i11;
        bArr[i10] = (byte) (((int) (j2 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f12390c = i2 + 8;
        bArr[i11] = (byte) (((int) (j2 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public final void h(int i2) {
        d(5);
        while (true) {
            int i3 = i2 & (-128);
            byte[] bArr = this.f12388a;
            if (i3 == 0) {
                int i6 = this.f12390c;
                this.f12390c = i6 + 1;
                bArr[i6] = (byte) i2;
                return;
            } else {
                int i7 = this.f12390c;
                this.f12390c = i7 + 1;
                bArr[i7] = (byte) ((i2 & 127) | 128);
                i2 >>>= 7;
            }
        }
    }

    public final void i(long j2) {
        d(10);
        while (true) {
            long j6 = (-128) & j2;
            byte[] bArr = this.f12388a;
            if (j6 == 0) {
                int i2 = this.f12390c;
                this.f12390c = i2 + 1;
                bArr[i2] = (byte) j2;
                return;
            } else {
                int i3 = this.f12390c;
                this.f12390c = i3 + 1;
                bArr[i3] = (byte) ((((int) j2) & 127) | 128);
                j2 >>>= 7;
            }
        }
    }
}
