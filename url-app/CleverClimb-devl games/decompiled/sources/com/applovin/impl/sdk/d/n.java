package com.applovin.impl.sdk.d;

import com.applovin.nativeAds.AppLovinNativeAdLoadListener;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class n extends m {

    /* renamed from: a, reason: collision with root package name */
    private final int f3109a;

    /* renamed from: c, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f3110c;

    public n(String str, int i, com.applovin.impl.sdk.j jVar, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        super(com.applovin.impl.sdk.ad.d.b(str, jVar), null, "TaskFetchNextNativeAd", jVar);
        this.f3109a = i;
        this.f3110c = appLovinNativeAdLoadListener;
    }

    @Override // com.applovin.impl.sdk.d.m, com.applovin.impl.sdk.d.a
    public com.applovin.impl.sdk.c.i a() {
        return com.applovin.impl.sdk.c.i.o;
    }

    @Override // com.applovin.impl.sdk.d.m
    protected a a(JSONObject jSONObject) {
        return new u(jSONObject, this.f3073b, this.f3110c);
    }

    @Override // com.applovin.impl.sdk.d.m
    protected void a(int i) {
        if (this.f3110c != null) {
            this.f3110c.onNativeAdsFailedToLoad(i);
        }
    }

    @Override // com.applovin.impl.sdk.d.m
    Map<String, String> f() {
        Map<String, String> f = super.f();
        f.put("slot_count", Integer.toString(this.f3109a));
        return f;
    }

    @Override // com.applovin.impl.sdk.d.m
    protected String h() {
        return ((String) this.f3073b.a(com.applovin.impl.sdk.b.b.aw)) + "4.0/nad";
    }

    @Override // com.applovin.impl.sdk.d.m
    protected String i() {
        return ((String) this.f3073b.a(com.applovin.impl.sdk.b.b.ax)) + "4.0/nad";
    }
}
