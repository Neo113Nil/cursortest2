package com.moat.analytics.mobile.tjy;

/* loaded from: classes2.dex */
class aw implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ar f7244a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ av f7245b;

    aw(av avVar, ar arVar) {
        this.f7245b = avVar;
        this.f7244a = arVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ax axVar;
        try {
            axVar = this.f7245b.f7243d;
            axVar.a(this.f7244a);
        } catch (Exception e) {
            com.moat.analytics.mobile.tjy.base.exception.a.a(e);
        }
    }
}
