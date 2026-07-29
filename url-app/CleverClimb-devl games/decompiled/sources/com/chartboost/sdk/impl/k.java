package com.chartboost.sdk.impl;

import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Model.CBError;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes.dex */
class k extends ad<Void> {

    /* renamed from: a, reason: collision with root package name */
    final j f3844a;
    private final l k;
    private final ai l;

    k(l lVar, ai aiVar, j jVar, File file) {
        super("GET", jVar.f3842c, 2, file);
        this.j = 1;
        this.k = lVar;
        this.l = aiVar;
        this.f3844a = jVar;
    }

    @Override // com.chartboost.sdk.impl.ad
    public ae a() {
        HashMap hashMap = new HashMap();
        hashMap.put("X-Chartboost-App", com.chartboost.sdk.i.k);
        hashMap.put("X-Chartboost-Client", CBUtility.b());
        hashMap.put("X-Chartboost-Reachability", Integer.toString(this.l.a()));
        return new ae(hashMap, null, null);
    }

    @Override // com.chartboost.sdk.impl.ad
    public void a(Void r1, ag agVar) {
        this.k.a(this, null, null);
    }

    @Override // com.chartboost.sdk.impl.ad
    public void a(CBError cBError, ag agVar) {
        this.k.a(this, cBError, agVar);
    }
}
