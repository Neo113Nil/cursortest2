package com.ironsource.sdk.controller;

import android.text.TextUtils;
import com.ironsource.sdk.data.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: DemandSourceManager.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, com.ironsource.sdk.data.b> f7030a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private Map<String, com.ironsource.sdk.data.b> f7031b = new LinkedHashMap();

    private Map<String, com.ironsource.sdk.data.b> b(e.d dVar) {
        if (dVar.name().equalsIgnoreCase(e.d.RewardedVideo.name())) {
            return this.f7030a;
        }
        if (dVar.name().equalsIgnoreCase(e.d.Interstitial.name())) {
            return this.f7031b;
        }
        return null;
    }

    public Collection<com.ironsource.sdk.data.b> a(e.d dVar) {
        Map<String, com.ironsource.sdk.data.b> b2 = b(dVar);
        if (b2 != null) {
            return b2.values();
        }
        return new ArrayList();
    }

    public com.ironsource.sdk.data.b a(e.d dVar, String str) {
        Map<String, com.ironsource.sdk.data.b> b2;
        if (TextUtils.isEmpty(str) || (b2 = b(dVar)) == null) {
            return null;
        }
        return b2.get(str);
    }

    private void a(e.d dVar, String str, com.ironsource.sdk.data.b bVar) {
        Map<String, com.ironsource.sdk.data.b> b2;
        if (TextUtils.isEmpty(str) || bVar == null || (b2 = b(dVar)) == null) {
            return;
        }
        b2.put(str, bVar);
    }

    public com.ironsource.sdk.data.b a(e.d dVar, String str, Map<String, String> map, com.ironsource.sdk.e.a aVar) {
        com.ironsource.sdk.data.b bVar = new com.ironsource.sdk.data.b(str, map, aVar);
        a(dVar, str, bVar);
        return bVar;
    }
}
