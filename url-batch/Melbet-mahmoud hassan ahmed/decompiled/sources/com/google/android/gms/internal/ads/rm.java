package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class rm {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f11225a;

    /* renamed from: b, reason: collision with root package name */
    private int f11226b;

    /* renamed from: c, reason: collision with root package name */
    private int f11227c;

    public rm() {
    }

    public rm(int i7) {
        this.f11225a = new byte[i7];
        this.f11227c = i7;
    }

    public rm(byte[] bArr) {
        this.f11225a = bArr;
        this.f11227c = bArr.length;
    }

    public final int a() {
        return this.f11227c - this.f11226b;
    }

    public final int b() {
        byte[] bArr = this.f11225a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final int c() {
        return this.f11226b;
    }

    public final int d() {
        return this.f11227c;
    }

    public final int e() {
        byte[] bArr = this.f11225a;
        int i7 = this.f11226b;
        int i8 = i7 + 1;
        this.f11226b = i8;
        byte b7 = bArr[i7];
        int i9 = i8 + 1;
        this.f11226b = i9;
        byte b8 = bArr[i8];
        int i10 = i9 + 1;
        this.f11226b = i10;
        byte b9 = bArr[i9];
        this.f11226b = i10 + 1;
        return (bArr[i10] & 255) | ((b7 & 255) << 24) | ((b8 & 255) << 16) | ((b9 & 255) << 8);
    }

    public final int f() {
        byte[] bArr = this.f11225a;
        int i7 = this.f11226b;
        int i8 = i7 + 1;
        this.f11226b = i8;
        byte b7 = bArr[i7];
        this.f11226b = i8 + 1;
        return ((bArr[i8] & 255) << 8) | (b7 & 255);
    }

    public final int g() {
        byte[] bArr = this.f11225a;
        int i7 = this.f11226b;
        this.f11226b = i7 + 1;
        return bArr[i7] & 255;
    }

    public final int h() {
        byte[] bArr = this.f11225a;
        int i7 = this.f11226b;
        int i8 = i7 + 1;
        this.f11226b = i8;
        byte b7 = bArr[i7];
        int i9 = i8 + 1;
        this.f11226b = i9;
        byte b8 = bArr[i8];
        this.f11226b = i9 + 2;
        return (b8 & 255) | ((b7 & 255) << 8);
    }

    public final int i() {
        int e7 = e();
        if (e7 >= 0) {
            return e7;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(e7);
        throw new IllegalStateException(sb.toString());
    }

    public final int j() {
        byte[] bArr = this.f11225a;
        int i7 = this.f11226b;
        int i8 = i7 + 1;
        this.f11226b = i8;
        byte b7 = bArr[i7];
        this.f11226b = i8 + 1;
        return (bArr[i8] & 255) | ((b7 & 255) << 8);
    }

    public final long k() {
        byte[] bArr = this.f11225a;
        int i7 = this.f11226b;
        int i8 = i7 + 1;
        this.f11226b = i8;
        byte b7 = bArr[i7];
        int i9 = i8 + 1;
        this.f11226b = i9;
        byte b8 = bArr[i8];
        int i10 = i9 + 1;
        this.f11226b = i10;
        byte b9 = bArr[i9];
        this.f11226b = i10 + 1;
        return ((b8 & 255) << 8) | (b7 & 255) | ((b9 & 255) << 16) | ((bArr[i10] & 255) << 24);
    }

    public final long l() {
        byte[] bArr = this.f11225a;
        int i7 = this.f11226b;
        int i8 = i7 + 1;
        this.f11226b = i8;
        byte b7 = bArr[i7];
        int i9 = i8 + 1;
        this.f11226b = i9;
        byte b8 = bArr[i8];
        int i10 = i9 + 1;
        this.f11226b = i10;
        byte b9 = bArr[i9];
        int i11 = i10 + 1;
        this.f11226b = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.f11226b = i12;
        byte b11 = bArr[i11];
        int i13 = i12 + 1;
        this.f11226b = i13;
        byte b12 = bArr[i12];
        int i14 = i13 + 1;
        this.f11226b = i14;
        byte b13 = bArr[i13];
        this.f11226b = i14 + 1;
        return ((b8 & 255) << 48) | ((b7 & 255) << 56) | ((b9 & 255) << 40) | ((b10 & 255) << 32) | ((b11 & 255) << 24) | ((b12 & 255) << 16) | ((b13 & 255) << 8) | (bArr[i14] & 255);
    }

    public final long m() {
        byte[] bArr = this.f11225a;
        int i7 = this.f11226b;
        int i8 = i7 + 1;
        this.f11226b = i8;
        byte b7 = bArr[i7];
        int i9 = i8 + 1;
        this.f11226b = i9;
        byte b8 = bArr[i8];
        int i10 = i9 + 1;
        this.f11226b = i10;
        byte b9 = bArr[i9];
        this.f11226b = i10 + 1;
        return ((b8 & 255) << 16) | ((b7 & 255) << 24) | ((b9 & 255) << 8) | (bArr[i10] & 255);
    }

    public final long n() {
        long l7 = l();
        if (l7 >= 0) {
            return l7;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(l7);
        throw new IllegalStateException(sb.toString());
    }

    public final String o(int i7) {
        if (i7 == 0) {
            return "";
        }
        int i8 = this.f11226b;
        int i9 = (i8 + i7) - 1;
        String str = new String(this.f11225a, i8, (i9 >= this.f11227c || this.f11225a[i9] != 0) ? i7 : i7 - 1);
        this.f11226b += i7;
        return str;
    }

    public final short p() {
        byte[] bArr = this.f11225a;
        int i7 = this.f11226b;
        int i8 = i7 + 1;
        this.f11226b = i8;
        byte b7 = bArr[i7];
        this.f11226b = i8 + 1;
        return (short) ((bArr[i8] & 255) | ((b7 & 255) << 8));
    }

    public final void q(byte[] bArr, int i7, int i8) {
        System.arraycopy(this.f11225a, this.f11226b, bArr, i7, i8);
        this.f11226b += i8;
    }

    public final void r() {
        this.f11226b = 0;
        this.f11227c = 0;
    }

    public final void s(int i7) {
        t(b() < i7 ? new byte[i7] : this.f11225a, i7);
    }

    public final void t(byte[] bArr, int i7) {
        this.f11225a = bArr;
        this.f11227c = i7;
        this.f11226b = 0;
    }

    public final void u(int i7) {
        boolean z6 = false;
        if (i7 >= 0 && i7 <= this.f11225a.length) {
            z6 = true;
        }
        jm.c(z6);
        this.f11227c = i7;
    }

    public final void v(int i7) {
        boolean z6 = false;
        if (i7 >= 0 && i7 <= this.f11227c) {
            z6 = true;
        }
        jm.c(z6);
        this.f11226b = i7;
    }

    public final void w(int i7) {
        v(this.f11226b + i7);
    }
}
