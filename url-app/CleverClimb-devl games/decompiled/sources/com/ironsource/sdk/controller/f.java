package com.ironsource.sdk.controller;

import com.ironsource.sdk.data.e;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ProductParametersCollection.java */
/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private Map<e.d, com.ironsource.sdk.data.c> f7139a = new HashMap();

    public com.ironsource.sdk.data.c a(e.d dVar, String str, String str2) {
        com.ironsource.sdk.data.c cVar = new com.ironsource.sdk.data.c(str, str2);
        this.f7139a.put(dVar, cVar);
        return cVar;
    }

    public com.ironsource.sdk.data.c a(e.d dVar) {
        if (dVar != null) {
            return this.f7139a.get(dVar);
        }
        return null;
    }
}
