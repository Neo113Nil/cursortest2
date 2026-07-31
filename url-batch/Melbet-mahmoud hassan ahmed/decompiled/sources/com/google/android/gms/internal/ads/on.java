package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class on implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f9722f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f9723g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ sn f9724h;

    on(sn snVar, int i7, long j7) {
        this.f9724h = snVar;
        this.f9722f = i7;
        this.f9723g = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tn tnVar;
        tnVar = this.f9724h.f11879b;
        tnVar.s(this.f9722f, this.f9723g);
    }
}
