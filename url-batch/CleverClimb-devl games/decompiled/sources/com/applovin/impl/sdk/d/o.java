package com.applovin.impl.sdk.d;

import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class o extends m {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.c f3111a;

    public o(com.applovin.impl.sdk.ad.c cVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super(com.applovin.impl.sdk.ad.d.a("adtoken_zone", jVar), appLovinAdLoadListener, "TaskFetchTokenAd", jVar);
        this.f3111a = cVar;
    }

    @Override // com.applovin.impl.sdk.d.m, com.applovin.impl.sdk.d.a
    public com.applovin.impl.sdk.c.i a() {
        return com.applovin.impl.sdk.c.i.p;
    }

    @Override // com.applovin.impl.sdk.d.m
    Map<String, String> f() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("adtoken", com.applovin.impl.sdk.e.i.e(this.f3111a.a()));
        hashMap.put("adtoken_prefix", com.applovin.impl.sdk.e.i.e(this.f3111a.c()));
        return hashMap;
    }

    @Override // com.applovin.impl.sdk.d.m
    protected com.applovin.impl.sdk.ad.b g() {
        return com.applovin.impl.sdk.ad.b.REGULAR_AD_TOKEN;
    }
}
