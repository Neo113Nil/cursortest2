package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
final class ap1 implements e43<w5, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ double f2904a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f2905b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bp1 f2906c;

    ap1(bp1 bp1Var, double d7, boolean z6) {
        this.f2906c = bp1Var;
        this.f2904a = d7;
        this.f2905b = z6;
    }

    @Override // com.google.android.gms.internal.ads.e43
    public final /* bridge */ /* synthetic */ Bitmap apply(w5 w5Var) {
        return bp1.a(this.f2906c, w5Var.f13717b, this.f2904a, this.f2905b);
    }
}
