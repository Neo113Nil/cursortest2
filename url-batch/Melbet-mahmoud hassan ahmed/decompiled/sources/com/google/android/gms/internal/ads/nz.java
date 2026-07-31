package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class nz implements x2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uz f9401a;

    public /* synthetic */ nz(uz uzVar) {
        this.f9401a = uzVar;
    }

    @Override // x2.b
    public final Map a() {
        uz uzVar = this.f9401a;
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.gms.ads.MobileAds", new pz(uzVar));
        return hashMap;
    }
}
