package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class r24 extends u14 {

    /* renamed from: i, reason: collision with root package name */
    private int f10997i;

    /* renamed from: j, reason: collision with root package name */
    private int f10998j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f10999k;

    /* renamed from: l, reason: collision with root package name */
    private int f11000l;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f11001m = n13.f8870f;

    /* renamed from: n, reason: collision with root package name */
    private int f11002n;

    /* renamed from: o, reason: collision with root package name */
    private long f11003o;

    @Override // com.google.android.gms.internal.ads.u14, com.google.android.gms.internal.ads.w04
    public final ByteBuffer a() {
        int i7;
        if (super.f() && (i7 = this.f11002n) > 0) {
            j(i7).put(this.f11001m, 0, this.f11002n).flip();
            this.f11002n = 0;
        }
        return super.a();
    }

    @Override // com.google.android.gms.internal.ads.u14, com.google.android.gms.internal.ads.w04
    public final boolean f() {
        return super.f() && this.f11002n == 0;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final void h(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        if (i7 == 0) {
            return;
        }
        int min = Math.min(i7, this.f11000l);
        this.f11003o += min / this.f12567b.f12549d;
        this.f11000l -= min;
        byteBuffer.position(position + min);
        if (this.f11000l > 0) {
            return;
        }
        int i8 = i7 - min;
        int length = (this.f11002n + i8) - this.f11001m.length;
        ByteBuffer j7 = j(length);
        int L = n13.L(length, 0, this.f11002n);
        j7.put(this.f11001m, 0, L);
        int L2 = n13.L(length - L, 0, i8);
        byteBuffer.limit(byteBuffer.position() + L2);
        j7.put(byteBuffer);
        byteBuffer.limit(limit);
        int i9 = i8 - L2;
        int i10 = this.f11002n - L;
        this.f11002n = i10;
        byte[] bArr = this.f11001m;
        System.arraycopy(bArr, L, bArr, 0, i10);
        byteBuffer.get(this.f11001m, this.f11002n, i9);
        this.f11002n += i9;
        j7.flip();
    }

    @Override // com.google.android.gms.internal.ads.u14
    public final u04 i(u04 u04Var) {
        if (u04Var.f12548c != 2) {
            throw new v04(u04Var);
        }
        this.f10999k = true;
        return (this.f10997i == 0 && this.f10998j == 0) ? u04.f12545e : u04Var;
    }

    @Override // com.google.android.gms.internal.ads.u14
    protected final void k() {
        if (this.f10999k) {
            this.f10999k = false;
            int i7 = this.f10998j;
            int i8 = this.f12567b.f12549d;
            this.f11001m = new byte[i7 * i8];
            this.f11000l = this.f10997i * i8;
        }
        this.f11002n = 0;
    }

    @Override // com.google.android.gms.internal.ads.u14
    protected final void l() {
        if (this.f10999k) {
            if (this.f11002n > 0) {
                this.f11003o += r0 / this.f12567b.f12549d;
            }
            this.f11002n = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.u14
    protected final void m() {
        this.f11001m = n13.f8870f;
    }

    public final long o() {
        return this.f11003o;
    }

    public final void p() {
        this.f11003o = 0L;
    }

    public final void q(int i7, int i8) {
        this.f10997i = i7;
        this.f10998j = i8;
    }
}
