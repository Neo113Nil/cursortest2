package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class mo3 extends qo3 {

    /* renamed from: k, reason: collision with root package name */
    private final int f8660k;

    /* renamed from: l, reason: collision with root package name */
    private final int f8661l;

    mo3(byte[] bArr, int i7, int i8) {
        super(bArr);
        uo3.D(i7, i7 + i8, bArr.length);
        this.f8660k = i7;
        this.f8661l = i8;
    }

    @Override // com.google.android.gms.internal.ads.qo3
    protected final int Q() {
        return this.f8660k;
    }

    @Override // com.google.android.gms.internal.ads.qo3, com.google.android.gms.internal.ads.uo3
    public final byte n(int i7) {
        uo3.j(i7, this.f8661l);
        return this.f10775j[this.f8660k + i7];
    }

    @Override // com.google.android.gms.internal.ads.qo3, com.google.android.gms.internal.ads.uo3
    final byte o(int i7) {
        return this.f10775j[this.f8660k + i7];
    }

    @Override // com.google.android.gms.internal.ads.qo3, com.google.android.gms.internal.ads.uo3
    public final int q() {
        return this.f8661l;
    }

    @Override // com.google.android.gms.internal.ads.qo3, com.google.android.gms.internal.ads.uo3
    protected final void r(byte[] bArr, int i7, int i8, int i9) {
        System.arraycopy(this.f10775j, this.f8660k + i7, bArr, i8, i9);
    }
}
