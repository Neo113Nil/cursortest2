package com.moat.analytics.mobile.tjy;

import android.util.Log;

/* loaded from: classes2.dex */
class z implements ba {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ap f7316a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f7317b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ v f7318c;

    z(v vVar, ap apVar, String str) {
        this.f7318c = vVar;
        this.f7316a = apVar;
        this.f7317b = str;
    }

    @Override // com.moat.analytics.mobile.tjy.ba
    public com.moat.analytics.mobile.tjy.base.functional.a a() {
        a aVar;
        if (this.f7316a.b()) {
            Log.d("MoatFactory", "Creating NativeVideo tracker.");
        }
        String str = this.f7317b;
        aVar = this.f7318c.f7305b;
        return com.moat.analytics.mobile.tjy.base.functional.a.a(new ah(str, aVar, this.f7316a));
    }
}
