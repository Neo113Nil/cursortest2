package y0;

import T.InterfaceC0090h;
import W.J;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class k implements o {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0090h f16167b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16168c;

    /* renamed from: d, reason: collision with root package name */
    public long f16169d;

    /* renamed from: f, reason: collision with root package name */
    public int f16171f;

    /* renamed from: g, reason: collision with root package name */
    public int f16172g;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f16170e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f16166a = new byte[4096];

    static {
        T.A.a("media3.extractor");
    }

    public k(InterfaceC0090h interfaceC0090h, long j4, long j5) {
        this.f16167b = interfaceC0090h;
        this.f16169d = j4;
        this.f16168c = j5;
    }

    @Override // y0.o
    public final void E(byte[] bArr, int i4, int i5) {
        l(bArr, i4, i5, false);
    }

    public final boolean a(int i4, boolean z) {
        f(i4);
        int i5 = this.f16172g - this.f16171f;
        while (i5 < i4) {
            int i6 = i4;
            boolean z4 = z;
            i5 = g(this.f16170e, this.f16171f, i6, i5, z4);
            if (i5 == -1) {
                return false;
            }
            this.f16172g = this.f16171f + i5;
            i4 = i6;
            z = z4;
        }
        this.f16171f += i4;
        return true;
    }

    @Override // y0.o
    public final boolean d(byte[] bArr, int i4, int i5, boolean z) {
        int min;
        int i6 = this.f16172g;
        if (i6 == 0) {
            min = 0;
        } else {
            min = Math.min(i6, i5);
            System.arraycopy(this.f16170e, 0, bArr, i4, min);
            h(min);
        }
        int i7 = min;
        while (i7 < i5 && i7 != -1) {
            i7 = g(bArr, i4, i5, i7, z);
        }
        if (i7 != -1) {
            this.f16169d += i7;
        }
        return i7 != -1;
    }

    public final void f(int i4) {
        int i5 = this.f16171f + i4;
        byte[] bArr = this.f16170e;
        if (i5 > bArr.length) {
            this.f16170e = Arrays.copyOf(this.f16170e, J.j(bArr.length * 2, 65536 + i5, i5 + 524288));
        }
    }

    public final int g(byte[] bArr, int i4, int i5, int i6, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.f16167b.read(bArr, i4 + i6, i5 - i6);
        if (read != -1) {
            return i6 + read;
        }
        if (i6 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // y0.o
    public final long getLength() {
        return this.f16168c;
    }

    @Override // y0.o
    public final long getPosition() {
        return this.f16169d;
    }

    public final void h(int i4) {
        int i5 = this.f16172g - i4;
        this.f16172g = i5;
        this.f16171f = 0;
        byte[] bArr = this.f16170e;
        byte[] bArr2 = i5 < bArr.length - 524288 ? new byte[65536 + i5] : bArr;
        System.arraycopy(bArr, i4, bArr2, 0, i5);
        this.f16170e = bArr2;
    }

    @Override // y0.o
    public final boolean k(int i4, boolean z) {
        int min = Math.min(this.f16172g, i4);
        h(min);
        int i5 = min;
        while (i5 < i4 && i5 != -1) {
            byte[] bArr = this.f16166a;
            i5 = g(bArr, -i5, Math.min(i4, bArr.length + i5), i5, z);
        }
        if (i5 != -1) {
            this.f16169d += i5;
        }
        return i5 != -1;
    }

    @Override // y0.o
    public final boolean l(byte[] bArr, int i4, int i5, boolean z) {
        if (!a(i5, z)) {
            return false;
        }
        System.arraycopy(this.f16170e, this.f16171f - i5, bArr, i4, i5);
        return true;
    }

    @Override // y0.o
    public final long m() {
        return this.f16169d + this.f16171f;
    }

    @Override // y0.o
    public final void o(int i4) {
        a(i4, false);
    }

    @Override // y0.o
    public final int q(int i4) {
        k kVar;
        int min = Math.min(this.f16172g, i4);
        h(min);
        if (min == 0) {
            byte[] bArr = this.f16166a;
            kVar = this;
            min = kVar.g(bArr, 0, Math.min(i4, bArr.length), 0, true);
        } else {
            kVar = this;
        }
        if (min != -1) {
            kVar.f16169d += min;
        }
        return min;
    }

    @Override // T.InterfaceC0090h
    public final int read(byte[] bArr, int i4, int i5) {
        k kVar;
        int i6 = this.f16172g;
        int i7 = 0;
        if (i6 != 0) {
            int min = Math.min(i6, i5);
            System.arraycopy(this.f16170e, 0, bArr, i4, min);
            h(min);
            i7 = min;
        }
        if (i7 == 0) {
            kVar = this;
            i7 = kVar.g(bArr, i4, i5, 0, true);
        } else {
            kVar = this;
        }
        if (i7 != -1) {
            kVar.f16169d += i7;
        }
        return i7;
    }

    @Override // y0.o
    public final void readFully(byte[] bArr, int i4, int i5) {
        d(bArr, i4, i5, false);
    }

    @Override // y0.o
    public final int s(byte[] bArr, int i4, int i5) {
        k kVar;
        int min;
        f(i5);
        int i6 = this.f16172g;
        int i7 = this.f16171f;
        int i8 = i6 - i7;
        if (i8 == 0) {
            kVar = this;
            min = kVar.g(this.f16170e, i7, i5, 0, true);
            if (min == -1) {
                return -1;
            }
            kVar.f16172g += min;
        } else {
            kVar = this;
            min = Math.min(i5, i8);
        }
        System.arraycopy(kVar.f16170e, kVar.f16171f, bArr, i4, min);
        kVar.f16171f += min;
        return min;
    }

    @Override // y0.o
    public final void u() {
        this.f16171f = 0;
    }

    @Override // y0.o
    public final void v(int i4) {
        k(i4, false);
    }
}
