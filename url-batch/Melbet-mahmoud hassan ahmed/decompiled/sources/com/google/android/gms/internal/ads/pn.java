package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class pn implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f10288f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f10289g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f10290h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ float f10291i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ sn f10292j;

    pn(sn snVar, int i7, int i8, int i9, float f7) {
        this.f10292j = snVar;
        this.f10288f = i7;
        this.f10289g = i8;
        this.f10290h = i9;
        this.f10291i = f7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tn tnVar;
        tnVar = this.f10292j.f11879b;
        tnVar.m(this.f10288f, this.f10289g, this.f10290h, this.f10291i);
    }
}
