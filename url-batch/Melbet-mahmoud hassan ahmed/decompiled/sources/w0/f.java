package w0;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import o2.m0;
import r0.p1;

/* loaded from: classes.dex */
public final class f implements m {

    /* renamed from: b, reason: collision with root package name */
    private final n2.i f22899b;

    /* renamed from: c, reason: collision with root package name */
    private final long f22900c;

    /* renamed from: d, reason: collision with root package name */
    private long f22901d;

    /* renamed from: f, reason: collision with root package name */
    private int f22903f;

    /* renamed from: g, reason: collision with root package name */
    private int f22904g;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f22902e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f22898a = new byte[4096];

    static {
        p1.a("goog.exo.extractor");
    }

    public f(n2.i iVar, long j7, long j8) {
        this.f22899b = iVar;
        this.f22901d = j7;
        this.f22900c = j8;
    }

    private void q(int i7) {
        if (i7 != -1) {
            this.f22901d += i7;
        }
    }

    private void r(int i7) {
        int i8 = this.f22903f + i7;
        byte[] bArr = this.f22902e;
        if (i8 > bArr.length) {
            this.f22902e = Arrays.copyOf(this.f22902e, m0.q(bArr.length * 2, 65536 + i8, i8 + 524288));
        }
    }

    private int s(byte[] bArr, int i7, int i8) {
        int i9 = this.f22904g;
        if (i9 == 0) {
            return 0;
        }
        int min = Math.min(i9, i8);
        System.arraycopy(this.f22902e, 0, bArr, i7, min);
        w(min);
        return min;
    }

    private int t(byte[] bArr, int i7, int i8, int i9, boolean z6) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.f22899b.read(bArr, i7 + i9, i8 - i9);
        if (read != -1) {
            return i9 + read;
        }
        if (i9 == 0 && z6) {
            return -1;
        }
        throw new EOFException();
    }

    private int u(int i7) {
        int min = Math.min(this.f22904g, i7);
        w(min);
        return min;
    }

    private void w(int i7) {
        int i8 = this.f22904g - i7;
        this.f22904g = i8;
        this.f22903f = 0;
        byte[] bArr = this.f22902e;
        byte[] bArr2 = i8 < bArr.length - 524288 ? new byte[65536 + i8] : bArr;
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        this.f22902e = bArr2;
    }

    @Override // w0.m
    public long a() {
        return this.f22900c;
    }

    @Override // w0.m
    public int c(int i7) {
        int u6 = u(i7);
        if (u6 == 0) {
            byte[] bArr = this.f22898a;
            u6 = t(bArr, 0, Math.min(i7, bArr.length), 0, true);
        }
        q(u6);
        return u6;
    }

    @Override // w0.m
    public boolean e(byte[] bArr, int i7, int i8, boolean z6) {
        int s7 = s(bArr, i7, i8);
        while (s7 < i8 && s7 != -1) {
            s7 = t(bArr, i7, i8, s7, z6);
        }
        q(s7);
        return s7 != -1;
    }

    @Override // w0.m
    public int f(byte[] bArr, int i7, int i8) {
        int min;
        r(i8);
        int i9 = this.f22904g;
        int i10 = this.f22903f;
        int i11 = i9 - i10;
        if (i11 == 0) {
            min = t(this.f22902e, i10, i8, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f22904g += min;
        } else {
            min = Math.min(i8, i11);
        }
        System.arraycopy(this.f22902e, this.f22903f, bArr, i7, min);
        this.f22903f += min;
        return min;
    }

    @Override // w0.m
    public void h() {
        this.f22903f = 0;
    }

    @Override // w0.m
    public void i(int i7) {
        v(i7, false);
    }

    @Override // w0.m
    public boolean j(int i7, boolean z6) {
        r(i7);
        int i8 = this.f22904g - this.f22903f;
        while (i8 < i7) {
            i8 = t(this.f22902e, this.f22903f, i7, i8, z6);
            if (i8 == -1) {
                return false;
            }
            this.f22904g = this.f22903f + i8;
        }
        this.f22903f += i7;
        return true;
    }

    @Override // w0.m
    public boolean l(byte[] bArr, int i7, int i8, boolean z6) {
        if (!j(i8, z6)) {
            return false;
        }
        System.arraycopy(this.f22902e, this.f22903f - i8, bArr, i7, i8);
        return true;
    }

    @Override // w0.m
    public long m() {
        return this.f22901d + this.f22903f;
    }

    @Override // w0.m
    public void n(byte[] bArr, int i7, int i8) {
        l(bArr, i7, i8, false);
    }

    @Override // w0.m
    public void o(int i7) {
        j(i7, false);
    }

    @Override // w0.m
    public long p() {
        return this.f22901d;
    }

    @Override // w0.m, n2.i
    public int read(byte[] bArr, int i7, int i8) {
        int s7 = s(bArr, i7, i8);
        if (s7 == 0) {
            s7 = t(bArr, i7, i8, 0, true);
        }
        q(s7);
        return s7;
    }

    @Override // w0.m
    public void readFully(byte[] bArr, int i7, int i8) {
        e(bArr, i7, i8, false);
    }

    public boolean v(int i7, boolean z6) {
        int u6 = u(i7);
        while (u6 < i7 && u6 != -1) {
            u6 = t(this.f22898a, -u6, Math.min(i7, this.f22898a.length + u6), u6, z6);
        }
        q(u6);
        return u6 != -1;
    }
}
