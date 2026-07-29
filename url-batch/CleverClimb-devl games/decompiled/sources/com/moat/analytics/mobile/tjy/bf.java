package com.moat.analytics.mobile.tjy;

/* loaded from: classes2.dex */
class bf implements ba {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f7262a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ap f7263b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ReactiveVideoTrackerPlugin f7264c;

    bf(ReactiveVideoTrackerPlugin reactiveVideoTrackerPlugin, a aVar, ap apVar) {
        this.f7264c = reactiveVideoTrackerPlugin;
        this.f7262a = aVar;
        this.f7263b = apVar;
    }

    @Override // com.moat.analytics.mobile.tjy.ba
    public com.moat.analytics.mobile.tjy.base.functional.a a() {
        String str;
        str = this.f7264c.f7213a;
        return com.moat.analytics.mobile.tjy.base.functional.a.a(new bd(str, this.f7262a, this.f7263b));
    }
}
