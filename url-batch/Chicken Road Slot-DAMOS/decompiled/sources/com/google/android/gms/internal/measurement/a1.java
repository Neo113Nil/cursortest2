package com.google.android.gms.internal.measurement;

import java.io.OutputStream;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a1 extends b1 {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f2127c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2128d;

    /* renamed from: e, reason: collision with root package name */
    public int f2129e;

    /* renamed from: f, reason: collision with root package name */
    public final OutputStream f2130f;

    public a1(OutputStream outputStream, int i3) {
        if (outputStream == null) {
            a2.r.j("out");
            throw null;
        }
        this.f2130f = outputStream;
        if (i3 < 0) {
            te.a1.e("bufferSize must be >= 0");
            throw null;
        }
        byte[] bArr = new byte[Math.max(i3, 20)];
        this.f2127c = bArr;
        this.f2128d = bArr.length;
    }

    public final void A(int i3) {
        if (this.f2128d - this.f2129e < i3) {
            B();
        }
    }

    public final void B() {
        this.f2130f.write(this.f2127c, 0, this.f2129e);
        this.f2129e = 0;
    }

    public final void C(int i3) {
        boolean z10 = b1.f2157b;
        byte[] bArr = this.f2127c;
        if (z10) {
            while (true) {
                int i10 = i3 & (-128);
                int i11 = this.f2129e;
                if (i10 == 0) {
                    this.f2129e = i11 + 1;
                    z2.k(bArr, i11, (byte) i3);
                    return;
                } else {
                    this.f2129e = i11 + 1;
                    z2.k(bArr, i11, (byte) (i3 | 128));
                    i3 >>>= 7;
                }
            }
        } else {
            while (true) {
                int i12 = i3 & (-128);
                int i13 = this.f2129e;
                if (i12 == 0) {
                    this.f2129e = i13 + 1;
                    bArr[i13] = (byte) i3;
                    return;
                } else {
                    this.f2129e = i13 + 1;
                    bArr[i13] = (byte) (i3 | 128);
                    i3 >>>= 7;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void c(byte[] bArr, int i3, int i10) {
        z(bArr, i3, i10);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void d(int i3, int i10) {
        r((i3 << 3) | i10);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void e(int i3, int i10) {
        A(20);
        C(i3 << 3);
        if (i10 >= 0) {
            C(i10);
        } else {
            w(i10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void f(int i3, int i10) {
        A(20);
        C(i3 << 3);
        C(i10);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void g(int i3, int i10) {
        A(14);
        C((i3 << 3) | 5);
        x(i10);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void h(int i3, long j) {
        A(20);
        C(i3 << 3);
        w(j);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void i(int i3, long j) {
        A(18);
        C((i3 << 3) | 1);
        y(j);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void j(int i3, boolean z10) {
        A(11);
        C(i3 << 3);
        int i10 = this.f2129e;
        this.f2127c[i10] = z10 ? (byte) 1 : (byte) 0;
        this.f2129e = i10 + 1;
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void k(int i3, String str) {
        r((i3 << 3) | 2);
        v(str);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void l(int i3, v0 v0Var) {
        r((i3 << 3) | 2);
        m(v0Var);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void m(v0 v0Var) {
        r(v0Var.c());
        v0Var.g(this);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void n(int i3, byte[] bArr) {
        r(i3);
        z(bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void o(o0 o0Var) {
        k1 k1Var = (k1) o0Var;
        r(k1Var.m());
        k1Var.f(this);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void p(byte b10) {
        if (this.f2129e == this.f2128d) {
            B();
        }
        int i3 = this.f2129e;
        this.f2127c[i3] = b10;
        this.f2129e = i3 + 1;
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void q(int i3) {
        if (i3 >= 0) {
            r(i3);
        } else {
            t(i3);
        }
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void r(int i3) {
        A(5);
        C(i3);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void s(int i3) {
        A(4);
        x(i3);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void t(long j) {
        A(10);
        w(j);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void u(long j) {
        A(8);
        y(j);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void v(String str) {
        int length = str.length() * 3;
        int a9 = b1.a(length);
        int i3 = a9 + length;
        int i10 = this.f2128d;
        if (i3 > i10) {
            byte[] bArr = new byte[length];
            int c10 = b3.c(str, bArr, 0, length);
            r(c10);
            z(bArr, 0, c10);
            return;
        }
        if (i3 > i10 - this.f2129e) {
            B();
        }
        int a10 = b1.a(str.length());
        int i11 = this.f2129e;
        byte[] bArr2 = this.f2127c;
        try {
            if (a10 == a9) {
                int i12 = i11 + a10;
                this.f2129e = i12;
                int c11 = b3.c(str, bArr2, i12, i10 - i12);
                this.f2129e = i11;
                C((c11 - i11) - a10);
                this.f2129e = c11;
            } else {
                int b10 = b3.b(str);
                C(b10);
                this.f2129e = b3.c(str, bArr2, this.f2129e, b10);
            }
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new androidx.datastore.preferences.protobuf.k(e2);
        }
    }

    public final void w(long j) {
        boolean z10 = b1.f2157b;
        byte[] bArr = this.f2127c;
        if (z10) {
            while (true) {
                long j3 = j & (-128);
                int i3 = (int) j;
                int i10 = this.f2129e;
                if (j3 == 0) {
                    this.f2129e = i10 + 1;
                    z2.k(bArr, i10, (byte) i3);
                    return;
                } else {
                    this.f2129e = i10 + 1;
                    z2.k(bArr, i10, (byte) (i3 | 128));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j10 = j & (-128);
                int i11 = (int) j;
                int i12 = this.f2129e;
                if (j10 == 0) {
                    this.f2129e = i12 + 1;
                    bArr[i12] = (byte) i11;
                    return;
                } else {
                    this.f2129e = i12 + 1;
                    bArr[i12] = (byte) (i11 | 128);
                    j >>>= 7;
                }
            }
        }
    }

    public final void x(int i3) {
        int i10 = this.f2129e;
        byte[] bArr = this.f2127c;
        bArr[i10] = (byte) i3;
        bArr[i10 + 1] = (byte) (i3 >> 8);
        bArr[i10 + 2] = (byte) (i3 >> 16);
        bArr[i10 + 3] = (byte) (i3 >> 24);
        this.f2129e = i10 + 4;
    }

    public final void y(long j) {
        int i3 = this.f2129e;
        byte[] bArr = this.f2127c;
        bArr[i3] = (byte) j;
        bArr[i3 + 1] = (byte) (j >> 8);
        bArr[i3 + 2] = (byte) (j >> 16);
        bArr[i3 + 3] = (byte) (j >> 24);
        bArr[i3 + 4] = (byte) (j >> 32);
        bArr[i3 + 5] = (byte) (j >> 40);
        bArr[i3 + 6] = (byte) (j >> 48);
        bArr[i3 + 7] = (byte) (j >> 56);
        this.f2129e = i3 + 8;
    }

    public final void z(byte[] bArr, int i3, int i10) {
        int i11 = this.f2129e;
        int i12 = this.f2128d;
        int i13 = i12 - i11;
        byte[] bArr2 = this.f2127c;
        if (i13 >= i10) {
            System.arraycopy(bArr, i3, bArr2, i11, i10);
            this.f2129e += i10;
            return;
        }
        System.arraycopy(bArr, i3, bArr2, i11, i13);
        int i14 = i3 + i13;
        this.f2129e = i12;
        B();
        int i15 = i10 - i13;
        if (i15 > i12) {
            this.f2130f.write(bArr, i14, i15);
        } else {
            System.arraycopy(bArr, i14, bArr2, 0, i15);
            this.f2129e = i15;
        }
    }
}
