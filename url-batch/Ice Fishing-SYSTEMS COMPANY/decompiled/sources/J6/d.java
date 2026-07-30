package J6;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final int f1408e;

    /* renamed from: f, reason: collision with root package name */
    public static final ThreadLocal f1409f;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1410a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1411b;

    /* renamed from: c, reason: collision with root package name */
    public int f1412c;

    /* renamed from: d, reason: collision with root package name */
    public OutputStream f1413d;

    static {
        int i = 51200;
        try {
            String b9 = g6.d.b("otel.experimental.otlp.buffer-size", "");
            if (!b9.isEmpty()) {
                i = Integer.parseInt(b9);
            }
        } catch (Throwable unused) {
        }
        f1408e = i;
        f1409f = new ThreadLocal();
    }

    public d(OutputStream outputStream) {
        int i = f1408e;
        this.f1410a = new byte[i];
        this.f1411b = i;
        this.f1413d = outputStream;
    }

    public static int a(long j9) {
        int i;
        if (((-128) & j9) == 0) {
            return 1;
        }
        if (j9 < 0) {
            return 10;
        }
        if (((-34359738368L) & j9) != 0) {
            j9 >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j9) != 0) {
            i += 2;
            j9 >>>= 14;
        }
        return (j9 & (-16384)) != 0 ? i + 1 : i;
    }

    public static int b(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public final void c() {
        this.f1413d.write(this.f1410a, 0, this.f1412c);
        this.f1412c = 0;
    }

    public final void d(int i) {
        if (this.f1411b - this.f1412c < i) {
            c();
        }
    }

    public final void e(byte b9) {
        if (this.f1412c == this.f1411b) {
            c();
        }
        int i = this.f1412c;
        this.f1412c = i + 1;
        this.f1410a[i] = b9;
    }

    public final void f(int i, byte[] bArr) {
        int i4 = this.f1412c;
        int i9 = this.f1411b;
        int i10 = i9 - i4;
        byte[] bArr2 = this.f1410a;
        if (i10 >= i) {
            System.arraycopy(bArr, 0, bArr2, i4, i);
            this.f1412c += i;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i4, i10);
        int i11 = i - i10;
        this.f1412c = i9;
        c();
        if (i11 > i9) {
            this.f1413d.write(bArr, i10, i11);
        } else {
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            this.f1412c = i11;
        }
    }

    public final void g(long j9) {
        d(8);
        int i = this.f1412c;
        int i4 = i + 1;
        this.f1412c = i4;
        byte[] bArr = this.f1410a;
        bArr[i] = (byte) (j9 & 255);
        int i9 = i + 2;
        this.f1412c = i9;
        bArr[i4] = (byte) ((j9 >> 8) & 255);
        int i10 = i + 3;
        this.f1412c = i10;
        bArr[i9] = (byte) ((j9 >> 16) & 255);
        int i11 = i + 4;
        this.f1412c = i11;
        bArr[i10] = (byte) (255 & (j9 >> 24));
        int i12 = i + 5;
        this.f1412c = i12;
        bArr[i11] = (byte) (((int) (j9 >> 32)) & com.anythink.basead.exoplayer.k.p.f8630b);
        int i13 = i + 6;
        this.f1412c = i13;
        bArr[i12] = (byte) (((int) (j9 >> 40)) & com.anythink.basead.exoplayer.k.p.f8630b);
        int i14 = i + 7;
        this.f1412c = i14;
        bArr[i13] = (byte) (((int) (j9 >> 48)) & com.anythink.basead.exoplayer.k.p.f8630b);
        this.f1412c = i + 8;
        bArr[i14] = (byte) (((int) (j9 >> 56)) & com.anythink.basead.exoplayer.k.p.f8630b);
    }

    public final void h(int i) {
        d(5);
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.f1410a;
            if (i4 == 0) {
                int i9 = this.f1412c;
                this.f1412c = i9 + 1;
                bArr[i9] = (byte) i;
                return;
            } else {
                int i10 = this.f1412c;
                this.f1412c = i10 + 1;
                bArr[i10] = (byte) ((i & com.anythink.expressad.video.module.a.a.f21886R) | 128);
                i >>>= 7;
            }
        }
    }

    public final void i(long j9) {
        d(10);
        while (true) {
            long j10 = (-128) & j9;
            byte[] bArr = this.f1410a;
            if (j10 == 0) {
                int i = this.f1412c;
                this.f1412c = i + 1;
                bArr[i] = (byte) j9;
                return;
            } else {
                int i4 = this.f1412c;
                this.f1412c = i4 + 1;
                bArr[i4] = (byte) ((((int) j9) & com.anythink.expressad.video.module.a.a.f21886R) | 128);
                j9 >>>= 7;
            }
        }
    }
}
