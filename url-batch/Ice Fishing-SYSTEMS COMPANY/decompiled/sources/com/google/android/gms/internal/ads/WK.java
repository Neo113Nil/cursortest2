package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class WK extends XK {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f28380d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28381e;

    /* renamed from: f, reason: collision with root package name */
    public int f28382f;

    /* renamed from: g, reason: collision with root package name */
    public final OutputStream f28383g;

    public WK(OutputStream outputStream, int i) {
        this.f28383g = outputStream;
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i, 20);
        this.f28380d = new byte[max];
        this.f28381e = max;
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void A(int i) {
        K(5);
        M(i);
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void B(int i) {
        K(4);
        H(i);
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void C(long j9) {
        K(10);
        G(j9);
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void D(long j9) {
        K(8);
        I(j9);
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void E(String str) {
        int length = str.length() * 3;
        int j9 = XK.j(length);
        int i = j9 + length;
        int i4 = this.f28381e;
        if (i > i4) {
            byte[] bArr = new byte[length];
            int c4 = AbstractC3145eM.c(bArr, 0, length, str);
            A(c4);
            J(bArr, 0, c4);
            return;
        }
        if (i > i4 - this.f28382f) {
            L();
        }
        int j10 = XK.j(str.length());
        int i9 = this.f28382f;
        byte[] bArr2 = this.f28380d;
        try {
            if (j10 == j9) {
                int i10 = i9 + j10;
                this.f28382f = i10;
                int c9 = AbstractC3145eM.c(bArr2, i10, i4 - i10, str);
                this.f28382f = i9;
                M((c9 - i9) - j10);
                this.f28382f = c9;
            } else {
                int b9 = AbstractC3145eM.b(str);
                M(b9);
                this.f28382f = AbstractC3145eM.c(bArr2, this.f28382f, b9, str);
            }
        } catch (ArrayIndexOutOfBoundsException e6) {
            throw new B1.y(e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final int F() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    public final void G(long j9) {
        boolean z8 = XK.f28631c;
        byte[] bArr = this.f28380d;
        if (z8) {
            while (true) {
                int i = (int) j9;
                if ((j9 & (-128)) == 0) {
                    int i4 = this.f28382f;
                    this.f28382f = i4 + 1;
                    AbstractC3036cM.l(bArr, i4, (byte) i);
                    return;
                } else {
                    int i9 = this.f28382f;
                    this.f28382f = i9 + 1;
                    AbstractC3036cM.l(bArr, i9, (byte) (i | 128));
                    j9 >>>= 7;
                }
            }
        } else {
            while (true) {
                int i10 = (int) j9;
                if ((j9 & (-128)) == 0) {
                    int i11 = this.f28382f;
                    this.f28382f = i11 + 1;
                    bArr[i11] = (byte) i10;
                    return;
                } else {
                    int i12 = this.f28382f;
                    this.f28382f = i12 + 1;
                    bArr[i12] = (byte) (i10 | 128);
                    j9 >>>= 7;
                }
            }
        }
    }

    public final void H(int i) {
        int i4 = this.f28382f;
        byte[] bArr = this.f28380d;
        bArr[i4] = (byte) i;
        bArr[i4 + 1] = (byte) (i >> 8);
        bArr[i4 + 2] = (byte) (i >> 16);
        bArr[i4 + 3] = (byte) (i >> 24);
        this.f28382f = i4 + 4;
    }

    public final void I(long j9) {
        int i = this.f28382f;
        byte[] bArr = this.f28380d;
        bArr[i] = (byte) j9;
        bArr[i + 1] = (byte) (j9 >> 8);
        bArr[i + 2] = (byte) (j9 >> 16);
        bArr[i + 3] = (byte) (j9 >> 24);
        bArr[i + 4] = (byte) (j9 >> 32);
        bArr[i + 5] = (byte) (j9 >> 40);
        bArr[i + 6] = (byte) (j9 >> 48);
        bArr[i + 7] = (byte) (j9 >> 56);
        this.f28382f = i + 8;
    }

    public final void J(byte[] bArr, int i, int i4) {
        int i9 = this.f28382f;
        int i10 = this.f28381e;
        int i11 = i10 - i9;
        byte[] bArr2 = this.f28380d;
        if (i11 >= i4) {
            System.arraycopy(bArr, i, bArr2, i9, i4);
            this.f28382f += i4;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i9, i11);
        int i12 = i + i11;
        this.f28382f = i10;
        L();
        int i13 = i4 - i11;
        if (i13 > i10) {
            this.f28383g.write(bArr, i12, i13);
        } else {
            System.arraycopy(bArr, i12, bArr2, 0, i13);
            this.f28382f = i13;
        }
    }

    public final void K(int i) {
        if (this.f28381e - this.f28382f < i) {
            L();
        }
    }

    public final void L() {
        this.f28383g.write(this.f28380d, 0, this.f28382f);
        this.f28382f = 0;
    }

    public final void M(int i) {
        boolean z8 = XK.f28631c;
        byte[] bArr = this.f28380d;
        if (z8) {
            while ((i & (-128)) != 0) {
                int i4 = this.f28382f;
                this.f28382f = i4 + 1;
                AbstractC3036cM.l(bArr, i4, (byte) (i | 128));
                i >>>= 7;
            }
            int i9 = this.f28382f;
            this.f28382f = i9 + 1;
            AbstractC3036cM.l(bArr, i9, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            int i10 = this.f28382f;
            this.f28382f = i10 + 1;
            bArr[i10] = (byte) (i | 128);
            i >>>= 7;
        }
        int i11 = this.f28382f;
        this.f28382f = i11 + 1;
        bArr[i11] = (byte) i;
    }

    @Override // com.google.android.gms.internal.ads.YD
    public final void a(byte[] bArr, int i, int i4) {
        J(bArr, i, i4);
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void m(int i, int i4) {
        A((i << 3) | i4);
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void n(int i, int i4) {
        K(20);
        M(i << 3);
        if (i4 >= 0) {
            M(i4);
        } else {
            G(i4);
        }
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void o(int i, int i4) {
        K(20);
        M(i << 3);
        M(i4);
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void p(int i, int i4) {
        K(14);
        M((i << 3) | 5);
        H(i4);
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void q(int i, long j9) {
        K(20);
        M(i << 3);
        G(j9);
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void r(int i, long j9) {
        K(18);
        M((i << 3) | 1);
        I(j9);
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void s(int i, boolean z8) {
        K(11);
        M(i << 3);
        int i4 = this.f28382f;
        this.f28380d[i4] = z8 ? (byte) 1 : (byte) 0;
        this.f28382f = i4 + 1;
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void t(int i, String str) {
        A((i << 3) | 2);
        E(str);
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void u(int i, SK sk) {
        A((i << 3) | 2);
        v(sk);
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void v(SK sk) {
        A(sk.f());
        sk.k(this);
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void w(int i, byte[] bArr) {
        A(i);
        J(bArr, 0, i);
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void x(IK ik) {
        A(((AbstractC3199fL) ik).d(null));
        ((AbstractC3199fL) ik).v(this);
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void y(byte b9) {
        if (this.f28382f == this.f28381e) {
            L();
        }
        int i = this.f28382f;
        this.f28380d[i] = b9;
        this.f28382f = i + 1;
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void z(int i) {
        if (i >= 0) {
            A(i);
        } else {
            C(i);
        }
    }
}
