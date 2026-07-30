package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class QK extends PK {

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f27141v;

    public QK(byte[] bArr) {
        bArr.getClass();
        this.f27141v = bArr;
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final byte e(int i) {
        return this.f27141v[i];
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final int f() {
        return this.f27141v.length;
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final SK g(int i, int i4) {
        byte[] bArr = this.f27141v;
        int c4 = SK.c(i, i4, bArr.length);
        return c4 == 0 ? SK.f27529u : new OK(bArr, i, c4);
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final SK h(int i, int i4) {
        byte[] bArr = this.f27141v;
        int c4 = SK.c(i, i4, bArr.length);
        return c4 == 0 ? SK.f27529u : new OK(bArr, i, c4);
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final void i(int i, int i4, int i9, byte[] bArr) {
        System.arraycopy(this.f27141v, i, bArr, i4, i9);
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final ByteBuffer j() {
        return ByteBuffer.wrap(this.f27141v).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final void k(XK xk) {
        byte[] bArr = this.f27141v;
        xk.a(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final boolean l(SK sk) {
        boolean z8 = sk instanceof QK;
        byte[] bArr = this.f27141v;
        return z8 ? Arrays.equals(bArr, ((QK) sk).f27141v) : sk instanceof OK ? v(sk, 0, bArr.length) : sk.l(this);
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final int n(int i, int i4, int i9) {
        return AbstractC3684oL.b(i, i4, i9, this.f27141v);
    }

    @Override // com.google.android.gms.internal.ads.SK
    public final S7.b o() {
        byte[] bArr = this.f27141v;
        return S7.b.f(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.PK
    public final boolean v(SK sk, int i, int i4) {
        int f6 = sk.f();
        byte[] bArr = this.f27141v;
        if (i4 > f6) {
            int length = String.valueOf(i4).length();
            int length2 = bArr.length;
            StringBuilder sb = new StringBuilder(length + 18 + String.valueOf(length2).length());
            sb.append("Length too large: ");
            sb.append(i4);
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        int i9 = i + i4;
        if (i9 > sk.f()) {
            int f9 = sk.f();
            int length3 = String.valueOf(i).length();
            StringBuilder sb2 = new StringBuilder(length3 + 24 + String.valueOf(i4).length() + 2 + String.valueOf(f9).length());
            AbstractC5051n.i(sb2, "Ran off end of other: ", i, ", ", i4);
            throw new IllegalArgumentException(D.y.j(f9, ", ", sb2));
        }
        if (sk instanceof QK) {
            return SK.d(bArr, 0, ((QK) sk).f27141v, i, i4);
        }
        if (!(sk instanceof OK)) {
            return sk.h(i, i9).equals(h(0, i4));
        }
        OK ok = (OK) sk;
        return SK.d(bArr, 0, ok.f26684v, ok.f26685w + i, i4);
    }
}
