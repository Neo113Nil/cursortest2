package com.applovin.impl.sdk.d;

import com.applovin.impl.sdk.ad.NativeAdImpl;
import com.applovin.mediation.AppLovinNativeAdapter;
import com.applovin.nativeAds.AppLovinNativeAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class u extends a {

    /* renamed from: a, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f3138a;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f3139c;

    u(JSONObject jSONObject, com.applovin.impl.sdk.j jVar, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        super("TaskRenderNativeAd", jVar);
        this.f3138a = appLovinNativeAdLoadListener;
        this.f3139c = jSONObject;
    }

    private String a(String str, Map<String, String> map, String str2) {
        String str3 = map.get(str);
        if (str3 != null) {
            return str3.replace("{CLCODE}", str2);
        }
        return null;
    }

    private String a(Map<String, String> map, String str, String str2) {
        String str3 = map.get(TapjoyConstants.TJC_CLICK_URL);
        if (str2 == null) {
            str2 = "";
        }
        return str3.replace("{CLCODE}", str).replace("{EVENT_ID}", str2);
    }

    private void a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        JSONArray optJSONArray = jSONObject2.optJSONArray("native_ads");
        JSONObject optJSONObject = jSONObject2.optJSONObject("native_settings");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            c("No ads were returned from the server");
            this.f3138a.onNativeAdsFailedToLoad(204);
            return;
        }
        List b2 = com.applovin.impl.sdk.e.f.b(optJSONArray);
        ArrayList arrayList = new ArrayList(b2.size());
        Map<String, String> a2 = optJSONObject != null ? com.applovin.impl.sdk.e.f.a(optJSONObject) : new HashMap<>(0);
        Iterator it = b2.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            String str = (String) map.get("clcode");
            String a3 = com.applovin.impl.sdk.e.f.a(jSONObject2, "zone_id", (String) null, this.f3073b);
            String str2 = (String) map.get("event_id");
            com.applovin.impl.sdk.ad.d b3 = com.applovin.impl.sdk.ad.d.b(a3, this.f3073b);
            String a4 = a("simp_url", a2, str);
            String a5 = a(a2, str, str2);
            List<com.applovin.impl.sdk.c.a> a6 = com.applovin.impl.sdk.e.l.a("simp_urls", optJSONObject, str, a4, this.f3073b);
            Iterator it2 = it;
            JSONObject jSONObject3 = optJSONObject;
            List<com.applovin.impl.sdk.c.a> a7 = com.applovin.impl.sdk.e.l.a("click_tracking_urls", optJSONObject, str, str2, com.applovin.impl.sdk.e.f.a(optJSONObject, "should_post_click_url", (Boolean) true, this.f3073b).booleanValue() ? a5 : null, this.f3073b);
            if (a6.size() == 0) {
                throw new IllegalArgumentException("No impression URL available");
            }
            if (a7.size() == 0) {
                throw new IllegalArgumentException("No click tracking URL available");
            }
            String str3 = (String) map.get("resource_cache_prefix");
            NativeAdImpl a8 = new NativeAdImpl.a().a(b3).e(a3).f((String) map.get(TJAdUnitConstants.String.TITLE)).g((String) map.get("description")).h((String) map.get("caption")).q((String) map.get("cta")).a((String) map.get("icon_url")).b((String) map.get("image_url")).d((String) map.get("video_url")).c((String) map.get("star_rating_url")).i((String) map.get("icon_url")).j((String) map.get("image_url")).k((String) map.get("video_url")).a(Float.parseFloat((String) map.get("star_rating"))).p(str).l(a5).m(a4).n(a("video_start_url", a2, str)).o(a("video_end_url", a2, str)).a(a6).b(a7).a(Long.parseLong((String) map.get(AppLovinNativeAdapter.KEY_EXTRA_AD_ID))).c(str3 != null ? com.applovin.impl.sdk.e.c.a(str3) : this.f3073b.b(com.applovin.impl.sdk.b.b.bu)).a(this.f3073b).a();
            arrayList.add(a8);
            a("Prepared native ad: " + a8.getAdId());
            it = it2;
            optJSONObject = jSONObject3;
            jSONObject2 = jSONObject;
        }
        if (this.f3138a != null) {
            this.f3138a.onNativeAdsLoaded(arrayList);
        }
    }

    @Override // com.applovin.impl.sdk.d.a
    public com.applovin.impl.sdk.c.i a() {
        return com.applovin.impl.sdk.c.i.u;
    }

    void a(int i) {
        try {
            if (this.f3138a != null) {
                this.f3138a.onNativeAdsFailedToLoad(i);
            }
        } catch (Exception e) {
            a("Unable to notify listener about failure.", e);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f3139c != null && this.f3139c.length() != 0) {
                a(this.f3139c);
                return;
            }
            a(AppLovinErrorCodes.UNABLE_TO_PREPARE_NATIVE_AD);
        } catch (Exception e) {
            a("Unable to render native ad.", e);
            a(AppLovinErrorCodes.UNABLE_TO_PREPARE_NATIVE_AD);
            this.f3073b.E().a(a());
        }
    }
}
