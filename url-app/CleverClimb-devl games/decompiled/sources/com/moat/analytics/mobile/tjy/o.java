package com.moat.analytics.mobile.tjy;

/* loaded from: classes2.dex */
class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f7294a;

    o(n nVar) {
        this.f7294a = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f7294a.e();
        } catch (Exception e) {
            com.moat.analytics.mobile.tjy.base.exception.a.a(e);
        }
    }
}
