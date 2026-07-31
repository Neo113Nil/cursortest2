package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: classes.dex */
public final class z30 extends m40 {

    /* renamed from: f, reason: collision with root package name */
    private final Drawable f14919f;

    /* renamed from: g, reason: collision with root package name */
    private final Uri f14920g;

    /* renamed from: h, reason: collision with root package name */
    private final double f14921h;

    /* renamed from: i, reason: collision with root package name */
    private final int f14922i;

    /* renamed from: j, reason: collision with root package name */
    private final int f14923j;

    public z30(Drawable drawable, Uri uri, double d7, int i7, int i8) {
        this.f14919f = drawable;
        this.f14920g = uri;
        this.f14921h = d7;
        this.f14922i = i7;
        this.f14923j = i8;
    }

    @Override // com.google.android.gms.internal.ads.n40
    public final double a() {
        return this.f14921h;
    }

    @Override // com.google.android.gms.internal.ads.n40
    public final Uri b() {
        return this.f14920g;
    }

    @Override // com.google.android.gms.internal.ads.n40
    public final int c() {
        return this.f14923j;
    }

    @Override // com.google.android.gms.internal.ads.n40
    public final x3.a d() {
        return x3.b.B3(this.f14919f);
    }

    @Override // com.google.android.gms.internal.ads.n40
    public final int g() {
        return this.f14922i;
    }
}
