package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class nn implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ xe f9178f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ sn f9179g;

    nn(sn snVar, xe xeVar) {
        this.f9179g = snVar;
        this.f9178f = xeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tn tnVar;
        tnVar = this.f9179g.f11879b;
        tnVar.j(this.f9178f);
    }
}
