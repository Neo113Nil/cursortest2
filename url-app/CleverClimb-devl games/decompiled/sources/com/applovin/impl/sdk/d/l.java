package com.applovin.impl.sdk.d;

import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class l extends m {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f3104a;

    public l(List<String> list, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super(com.applovin.impl.sdk.ad.d.a(a(list), jVar), appLovinAdLoadListener, "TaskFetchMultizoneAd", jVar);
        this.f3104a = Collections.unmodifiableList(list);
    }

    private static String a(List<String> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("No zone identifiers specified");
        }
        return list.get(0);
    }

    @Override // com.applovin.impl.sdk.d.m, com.applovin.impl.sdk.d.a
    public com.applovin.impl.sdk.c.i a() {
        return com.applovin.impl.sdk.c.i.m;
    }

    @Override // com.applovin.impl.sdk.d.m
    Map<String, String> f() {
        HashMap hashMap = new HashMap(1);
        hashMap.put("zone_ids", com.applovin.impl.sdk.e.i.e(com.applovin.impl.sdk.e.c.a(this.f3104a, this.f3104a.size())));
        return hashMap;
    }

    @Override // com.applovin.impl.sdk.d.m
    protected com.applovin.impl.sdk.ad.b g() {
        return com.applovin.impl.sdk.ad.b.APPLOVIN_MULTIZONE;
    }
}
