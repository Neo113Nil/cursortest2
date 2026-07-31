package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class ep3 extends hp3 {

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f4703d;

    /* renamed from: e, reason: collision with root package name */
    private final int f4704e;

    /* renamed from: f, reason: collision with root package name */
    private int f4705f;

    ep3(byte[] bArr, int i7, int i8) {
        super(null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i8) | i8) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i8)));
        }
        this.f4703d = bArr;
        this.f4705f = 0;
        this.f4704e = i8;
    }

    public final void E(byte[] bArr, int i7, int i8) {
        try {
            System.arraycopy(bArr, i7, this.f4703d, this.f4705f, i8);
            this.f4705f += i8;
        } catch (IndexOutOfBoundsException e7) {
            throw new fp3(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4705f), Integer.valueOf(this.f4704e), Integer.valueOf(i8)), e7);
        }
    }

    public final void F(String str) {
        int i7 = this.f4705f;
        try {
            int a7 = hp3.a(str.length() * 3);
            int a8 = hp3.a(str.length());
            if (a8 != a7) {
                u(lt3.e(str));
                byte[] bArr = this.f4703d;
                int i8 = this.f4705f;
                this.f4705f = lt3.d(str, bArr, i8, this.f4704e - i8);
                return;
            }
            int i9 = i7 + a8;
            this.f4705f = i9;
            int d7 = lt3.d(str, this.f4703d, i9, this.f4704e - i9);
            this.f4705f = i7;
            u((d7 - i7) - a8);
            this.f4705f = d7;
        } catch (kt3 e7) {
            this.f4705f = i7;
            e(str, e7);
        } catch (IndexOutOfBoundsException e8) {
            throw new fp3(e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.hp3
    public final int g() {
        return this.f4704e - this.f4705f;
    }

    @Override // com.google.android.gms.internal.ads.hp3
    public final void h(byte b7) {
        try {
            byte[] bArr = this.f4703d;
            int i7 = this.f4705f;
            this.f4705f = i7 + 1;
            bArr[i7] = b7;
        } catch (IndexOutOfBoundsException e7) {
            throw new fp3(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4705f), Integer.valueOf(this.f4704e), 1), e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.hp3
    public final void i(int i7, boolean z6) {
        u(i7 << 3);
        h(z6 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.hp3
    public final void j(int i7, uo3 uo3Var) {
        u((i7 << 3) | 2);
        u(uo3Var.q());
        uo3Var.B(this);
    }

    @Override // com.google.android.gms.internal.ads.hp3
    public final void k(int i7, int i8) {
        u((i7 << 3) | 5);
        l(i8);
    }

    @Override // com.google.android.gms.internal.ads.hp3
    public final void l(int i7) {
        try {
            byte[] bArr = this.f4703d;
            int i8 = this.f4705f;
            int i9 = i8 + 1;
            this.f4705f = i9;
            bArr[i8] = (byte) (i7 & 255);
            int i10 = i9 + 1;
            this.f4705f = i10;
            bArr[i9] = (byte) ((i7 >> 8) & 255);
            int i11 = i10 + 1;
            this.f4705f = i11;
            bArr[i10] = (byte) ((i7 >> 16) & 255);
            this.f4705f = i11 + 1;
            bArr[i11] = (byte) ((i7 >> 24) & 255);
        } catch (IndexOutOfBoundsException e7) {
            throw new fp3(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4705f), Integer.valueOf(this.f4704e), 1), e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.hp3
    public final void m(int i7, long j7) {
        u((i7 << 3) | 1);
        n(j7);
    }

    @Override // com.google.android.gms.internal.ads.hp3
    public final void n(long j7) {
        try {
            byte[] bArr = this.f4703d;
            int i7 = this.f4705f;
            int i8 = i7 + 1;
            this.f4705f = i8;
            bArr[i7] = (byte) (((int) j7) & 255);
            int i9 = i8 + 1;
            this.f4705f = i9;
            bArr[i8] = (byte) (((int) (j7 >> 8)) & 255);
            int i10 = i9 + 1;
            this.f4705f = i10;
            bArr[i9] = (byte) (((int) (j7 >> 16)) & 255);
            int i11 = i10 + 1;
            this.f4705f = i11;
            bArr[i10] = (byte) (((int) (j7 >> 24)) & 255);
            int i12 = i11 + 1;
            this.f4705f = i12;
            bArr[i11] = (byte) (((int) (j7 >> 32)) & 255);
            int i13 = i12 + 1;
            this.f4705f = i13;
            bArr[i12] = (byte) (((int) (j7 >> 40)) & 255);
            int i14 = i13 + 1;
            this.f4705f = i14;
            bArr[i13] = (byte) (((int) (j7 >> 48)) & 255);
            this.f4705f = i14 + 1;
            bArr[i14] = (byte) (((int) (j7 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e7) {
            throw new fp3(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4705f), Integer.valueOf(this.f4704e), 1), e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.hp3
    public final void o(int i7, int i8) {
        u(i7 << 3);
        p(i8);
    }

    @Override // com.google.android.gms.internal.ads.hp3
    public final void p(int i7) {
        if (i7 >= 0) {
            u(i7);
        } else {
            w(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.hp3
    public final void q(byte[] bArr, int i7, int i8) {
        E(bArr, 0, i8);
    }

    @Override // com.google.android.gms.internal.ads.hp3
    public final void r(int i7, String str) {
        u((i7 << 3) | 2);
        F(str);
    }

    @Override // com.google.android.gms.internal.ads.hp3
    public final void s(int i7, int i8) {
        u((i7 << 3) | i8);
    }

    @Override // com.google.android.gms.internal.ads.hp3
    public final void t(int i7, int i8) {
        u(i7 << 3);
        u(i8);
    }

    @Override // com.google.android.gms.internal.ads.hp3
    public final void u(int i7) {
        boolean z6;
        z6 = hp3.f6377c;
        if (z6) {
            int i8 = do3.f4265a;
        }
        while ((i7 & (-128)) != 0) {
            try {
                byte[] bArr = this.f4703d;
                int i9 = this.f4705f;
                this.f4705f = i9 + 1;
                bArr[i9] = (byte) ((i7 & 127) | 128);
                i7 >>>= 7;
            } catch (IndexOutOfBoundsException e7) {
                throw new fp3(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4705f), Integer.valueOf(this.f4704e), 1), e7);
            }
        }
        byte[] bArr2 = this.f4703d;
        int i10 = this.f4705f;
        this.f4705f = i10 + 1;
        bArr2[i10] = (byte) i7;
    }

    @Override // com.google.android.gms.internal.ads.hp3
    public final void v(int i7, long j7) {
        u(i7 << 3);
        w(j7);
    }

    @Override // com.google.android.gms.internal.ads.hp3
    public final void w(long j7) {
        boolean z6;
        z6 = hp3.f6377c;
        if (z6 && this.f4704e - this.f4705f >= 10) {
            while ((j7 & (-128)) != 0) {
                byte[] bArr = this.f4703d;
                int i7 = this.f4705f;
                this.f4705f = i7 + 1;
                gt3.y(bArr, i7, (byte) ((((int) j7) & 127) | 128));
                j7 >>>= 7;
            }
            byte[] bArr2 = this.f4703d;
            int i8 = this.f4705f;
            this.f4705f = i8 + 1;
            gt3.y(bArr2, i8, (byte) j7);
            return;
        }
        while ((j7 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f4703d;
                int i9 = this.f4705f;
                this.f4705f = i9 + 1;
                bArr3[i9] = (byte) ((((int) j7) & 127) | 128);
                j7 >>>= 7;
            } catch (IndexOutOfBoundsException e7) {
                throw new fp3(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4705f), Integer.valueOf(this.f4704e), 1), e7);
            }
        }
        byte[] bArr4 = this.f4703d;
        int i10 = this.f4705f;
        this.f4705f = i10 + 1;
        bArr4[i10] = (byte) j7;
    }
}
