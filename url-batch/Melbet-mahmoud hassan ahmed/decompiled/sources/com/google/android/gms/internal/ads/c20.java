package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public final class c20 extends e20 {

    /* renamed from: f, reason: collision with root package name */
    private final y2.f f3699f;

    /* renamed from: g, reason: collision with root package name */
    private final String f3700g;

    /* renamed from: h, reason: collision with root package name */
    private final String f3701h;

    public c20(y2.f fVar, String str, String str2) {
        this.f3699f = fVar;
        this.f3700g = str;
        this.f3701h = str2;
    }

    @Override // com.google.android.gms.internal.ads.f20
    public final void L0(x3.a aVar) {
        if (aVar == null) {
            return;
        }
        this.f3699f.b((View) x3.b.O0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.f20
    public final String a() {
        return this.f3700g;
    }

    @Override // com.google.android.gms.internal.ads.f20
    public final void b() {
        this.f3699f.a();
    }

    @Override // com.google.android.gms.internal.ads.f20
    public final String c() {
        return this.f3701h;
    }

    @Override // com.google.android.gms.internal.ads.f20
    public final void d() {
        this.f3699f.c();
    }
}
