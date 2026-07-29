package com.moat.analytics.mobile.tjy;

/* loaded from: classes2.dex */
class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f7285a;

    j(i iVar) {
        this.f7285a = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f7285a.f.get() == null || this.f7285a.e()) {
                this.f7285a.c();
            } else if (Boolean.valueOf(this.f7285a.i()).booleanValue()) {
                this.f7285a.f7283d.postDelayed(this, 200L);
            } else {
                this.f7285a.c();
            }
        } catch (Exception e) {
            this.f7285a.c();
            com.moat.analytics.mobile.tjy.base.exception.a.a(e);
        }
    }
}
