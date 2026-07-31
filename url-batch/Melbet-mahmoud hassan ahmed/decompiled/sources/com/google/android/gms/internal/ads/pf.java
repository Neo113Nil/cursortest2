package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class pf implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ xe f10213f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ uf f10214g;

    pf(uf ufVar, xe xeVar) {
        this.f10214g = ufVar;
        this.f10213f = xeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vf vfVar;
        vfVar = this.f10214g.f12771b;
        vfVar.y(this.f10213f);
    }
}
