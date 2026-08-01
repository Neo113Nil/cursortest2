package com.google.android.gms.internal.measurement;

import java.util.Locale;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z0 extends b1 {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f3026c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3027d;

    /* renamed from: e, reason: collision with root package name */
    public int f3028e;

    public z0(int i3, byte[] bArr) {
        int length = bArr.length;
        if (((length - i3) | i3) >= 0) {
            this.f3026c = bArr;
            this.f3028e = 0;
            this.f3027d = i3;
        } else {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("Array range is invalid. Buffer.length=" + length + ", offset=0, length=" + i3);
        }
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void c(byte[] bArr, int i3, int i10) {
        w(bArr, i3, i10);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void d(int i3, int i10) {
        r((i3 << 3) | i10);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void e(int i3, int i10) {
        r(i3 << 3);
        q(i10);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void f(int i3, int i10) {
        r(i3 << 3);
        r(i10);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void g(int i3, int i10) {
        r((i3 << 3) | 5);
        s(i10);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void h(int i3, long j) {
        r(i3 << 3);
        t(j);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void i(int i3, long j) {
        r((i3 << 3) | 1);
        u(j);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void j(int i3, boolean z10) {
        r(i3 << 3);
        p(z10 ? (byte) 1 : (byte) 0);
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
        w(bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void o(o0 o0Var) {
        k1 k1Var = (k1) o0Var;
        r(k1Var.m());
        k1Var.f(this);
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void p(byte b10) {
        int i3 = this.f3028e;
        try {
            int i10 = i3 + 1;
            try {
                this.f3026c[i3] = b10;
                this.f3028e = i10;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                i3 = i10;
                throw new androidx.datastore.preferences.protobuf.k(i3, this.f3027d, 1, e);
            }
        } catch (IndexOutOfBoundsException e9) {
            e = e9;
        }
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
        int i10;
        int i11 = this.f3028e;
        while (true) {
            int i12 = i3 & (-128);
            byte[] bArr = this.f3026c;
            if (i12 == 0) {
                i10 = i11 + 1;
                bArr[i11] = (byte) i3;
                this.f3028e = i10;
                return;
            } else {
                i10 = i11 + 1;
                try {
                    bArr[i11] = (byte) (i3 | 128);
                    i3 >>>= 7;
                    i11 = i10;
                } catch (IndexOutOfBoundsException e2) {
                    throw new androidx.datastore.preferences.protobuf.k(i10, this.f3027d, 1, e2);
                }
            }
            throw new androidx.datastore.preferences.protobuf.k(i10, this.f3027d, 1, e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void s(int i3) {
        int i10 = this.f3028e;
        try {
            byte[] bArr = this.f3026c;
            bArr[i10] = (byte) i3;
            bArr[i10 + 1] = (byte) (i3 >> 8);
            bArr[i10 + 2] = (byte) (i3 >> 16);
            bArr[i10 + 3] = (byte) (i3 >> 24);
            this.f3028e = i10 + 4;
        } catch (IndexOutOfBoundsException e2) {
            throw new androidx.datastore.preferences.protobuf.k(i10, this.f3027d, 4, e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void t(long j) {
        int i3;
        int i10 = this.f3028e;
        byte[] bArr = this.f3026c;
        int i11 = this.f3027d;
        if (!b1.f2157b || i11 - i10 < 10) {
            while ((j & (-128)) != 0) {
                int i12 = i10 + 1;
                try {
                    bArr[i10] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i10 = i12;
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    i3 = i12;
                    throw new androidx.datastore.preferences.protobuf.k(i3, i11, 1, e);
                }
            }
            i3 = i10 + 1;
            try {
                bArr[i10] = (byte) j;
            } catch (IndexOutOfBoundsException e9) {
                e = e9;
                throw new androidx.datastore.preferences.protobuf.k(i3, i11, 1, e);
            }
        } else {
            while ((j & (-128)) != 0) {
                z2.k(bArr, i10, (byte) (((int) j) | 128));
                j >>>= 7;
                i10++;
            }
            i3 = i10 + 1;
            z2.k(bArr, i10, (byte) j);
        }
        this.f3028e = i3;
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void u(long j) {
        int i3 = this.f3028e;
        try {
            byte[] bArr = this.f3026c;
            bArr[i3] = (byte) j;
            bArr[i3 + 1] = (byte) (j >> 8);
            bArr[i3 + 2] = (byte) (j >> 16);
            bArr[i3 + 3] = (byte) (j >> 24);
            bArr[i3 + 4] = (byte) (j >> 32);
            bArr[i3 + 5] = (byte) (j >> 40);
            bArr[i3 + 6] = (byte) (j >> 48);
            bArr[i3 + 7] = (byte) (j >> 56);
            this.f3028e = i3 + 8;
        } catch (IndexOutOfBoundsException e2) {
            throw new androidx.datastore.preferences.protobuf.k(i3, this.f3027d, 8, e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.b1
    public final void v(String str) {
        int i3 = this.f3028e;
        try {
            int a9 = b1.a(str.length() * 3);
            int a10 = b1.a(str.length());
            byte[] bArr = this.f3026c;
            if (a10 != a9) {
                r(b3.b(str));
                int i10 = this.f3028e;
                this.f3028e = b3.c(str, bArr, i10, bArr.length - i10);
            } else {
                int i11 = i3 + a10;
                this.f3028e = i11;
                int c10 = b3.c(str, bArr, i11, bArr.length - i11);
                this.f3028e = i3;
                r((c10 - i3) - a10);
                this.f3028e = c10;
            }
        } catch (IndexOutOfBoundsException e2) {
            throw new androidx.datastore.preferences.protobuf.k(e2);
        }
    }

    public final void w(byte[] bArr, int i3, int i10) {
        try {
            System.arraycopy(bArr, i3, this.f3026c, this.f3028e, i10);
            this.f3028e += i10;
        } catch (IndexOutOfBoundsException e2) {
            throw new androidx.datastore.preferences.protobuf.k(this.f3028e, this.f3027d, i10, e2);
        }
    }

    public final int x() {
        return this.f3027d - this.f3028e;
    }
}
