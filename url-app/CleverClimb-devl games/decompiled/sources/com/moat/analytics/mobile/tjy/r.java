package com.moat.analytics.mobile.tjy;

/* loaded from: classes2.dex */
class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ q f7297a;

    r(q qVar) {
        this.f7297a = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f7297a.f7296a.b();
        } catch (Exception e) {
            com.moat.analytics.mobile.tjy.base.exception.a.a(e);
        }
    }
}
