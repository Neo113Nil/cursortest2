package com.moat.analytics.mobile.tjy;

/* loaded from: classes2.dex */
class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f7299a;

    t(s sVar) {
        this.f7299a = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f7299a.f7298a.c();
        } catch (com.moat.analytics.mobile.tjy.base.exception.b e) {
            com.moat.analytics.mobile.tjy.base.exception.a.a(e);
        }
    }
}
