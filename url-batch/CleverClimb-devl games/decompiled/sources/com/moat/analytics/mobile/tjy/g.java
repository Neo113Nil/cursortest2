package com.moat.analytics.mobile.tjy;

/* loaded from: classes2.dex */
class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f7284a;

    g(f fVar) {
        this.f7284a = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ad adVar;
        try {
            this.f7284a.a("Shutting down.");
            adVar = this.f7284a.l;
            adVar.b();
            this.f7284a.l = null;
        } catch (Exception e) {
            com.moat.analytics.mobile.tjy.base.exception.a.a(e);
        }
    }
}
