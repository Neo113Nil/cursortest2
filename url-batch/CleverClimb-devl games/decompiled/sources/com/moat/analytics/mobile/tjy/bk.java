package com.moat.analytics.mobile.tjy;

/* loaded from: classes2.dex */
class bk implements bc {

    /* renamed from: a, reason: collision with root package name */
    private static final com.moat.analytics.mobile.tjy.base.functional.a f7271a;

    static {
        com.moat.analytics.mobile.tjy.base.functional.a a2 = com.moat.analytics.mobile.tjy.base.functional.a.a();
        try {
            a2 = com.moat.analytics.mobile.tjy.base.functional.a.a(WebAdTracker.class.getMethod("track", new Class[0]));
        } catch (NoSuchMethodException e) {
            com.moat.analytics.mobile.tjy.base.exception.a.a(e);
        }
        f7271a = a2;
    }

    bk() {
    }

    @Override // com.moat.analytics.mobile.tjy.bc
    public Class a() {
        return WebAdTracker.class;
    }
}
