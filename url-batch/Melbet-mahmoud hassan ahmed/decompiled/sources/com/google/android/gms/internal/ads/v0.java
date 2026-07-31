package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class v0 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    private final dr2 f13054a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13055b;

    /* renamed from: c, reason: collision with root package name */
    private final int f13056c;

    /* renamed from: d, reason: collision with root package name */
    private int f13057d;

    /* renamed from: e, reason: collision with root package name */
    private int f13058e;

    public v0(p0 p0Var) {
        dr2 dr2Var = p0Var.f9963b;
        this.f13054a = dr2Var;
        dr2Var.f(12);
        this.f13056c = dr2Var.v() & 255;
        this.f13055b = dr2Var.v();
    }

    @Override // com.google.android.gms.internal.ads.s0
    public final int a() {
        return this.f13055b;
    }

    @Override // com.google.android.gms.internal.ads.s0
    public final int c() {
        int i7 = this.f13056c;
        if (i7 == 8) {
            return this.f13054a.s();
        }
        if (i7 == 16) {
            return this.f13054a.w();
        }
        int i8 = this.f13057d;
        this.f13057d = i8 + 1;
        if (i8 % 2 != 0) {
            return this.f13058e & 15;
        }
        int s7 = this.f13054a.s();
        this.f13058e = s7;
        return (s7 & 240) >> 4;
    }

    @Override // com.google.android.gms.internal.ads.s0
    public final int zza() {
        return -1;
    }
}
