package com.applovin.impl.sdk;

import android.text.TextUtils;
import com.applovin.mediation.AppLovinNativeAdapter;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class AppLovinAdBase implements com.applovin.impl.sdk.ad.j, AppLovinAd {

    /* renamed from: a, reason: collision with root package name */
    private final int f2835a;
    protected final JSONObject adObject;
    protected final Object adObjectLock;

    /* renamed from: b, reason: collision with root package name */
    private com.applovin.impl.sdk.ad.d f2836b;

    /* renamed from: c, reason: collision with root package name */
    private final long f2837c;

    /* renamed from: d, reason: collision with root package name */
    private com.applovin.impl.sdk.ad.h f2838d;
    protected final JSONObject fullResponse;
    protected final j sdk;
    protected final com.applovin.impl.sdk.ad.b source;

    protected AppLovinAdBase(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, j jVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.adObject = jSONObject;
        this.fullResponse = jSONObject2;
        this.source = bVar;
        this.sdk = jVar;
        this.adObjectLock = new Object();
        this.f2837c = System.currentTimeMillis();
        char[] charArray = jSONObject.toString().toCharArray();
        Arrays.sort(charArray);
        this.f2835a = new String(charArray).hashCode();
    }

    public boolean equals(Object obj) {
        AppLovinAd b2;
        if ((obj instanceof com.applovin.impl.sdk.ad.h) && (b2 = ((com.applovin.impl.sdk.ad.h) obj).b()) != null) {
            obj = b2;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppLovinAdBase appLovinAdBase = (AppLovinAdBase) obj;
        if (this.f2836b == null ? appLovinAdBase.f2836b == null : this.f2836b.equals(appLovinAdBase.f2836b)) {
            return this.source == appLovinAdBase.source && this.f2835a == appLovinAdBase.f2835a;
        }
        return false;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public long getAdIdNumber() {
        return getLongFromAdObject(AppLovinNativeAdapter.KEY_EXTRA_AD_ID, -1L);
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getAdValue(String str) {
        JSONObject jsonObjectFromAdObject;
        if (TextUtils.isEmpty(str) || (jsonObjectFromAdObject = getJsonObjectFromAdObject("ad_values", null)) == null || jsonObjectFromAdObject.length() <= 0) {
            return null;
        }
        return com.applovin.impl.sdk.e.f.a(jsonObjectFromAdObject, str, (String) null, this.sdk);
    }

    public com.applovin.impl.sdk.ad.d getAdZone() {
        if (this.f2836b != null) {
            return this.f2836b;
        }
        this.f2836b = com.applovin.impl.sdk.ad.d.a(getSize(), getType(), com.applovin.impl.sdk.e.f.a(this.fullResponse, "zone_id", (String) null, this.sdk), this.sdk);
        return this.f2836b;
    }

    protected boolean getBooleanFromAdObject(String str, Boolean bool) {
        boolean booleanValue;
        if (!((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.fk)).booleanValue()) {
            return com.applovin.impl.sdk.e.f.a(this.adObject, str, bool, this.sdk).booleanValue();
        }
        synchronized (this.adObjectLock) {
            booleanValue = com.applovin.impl.sdk.e.f.a(this.adObject, str, bool, this.sdk).booleanValue();
        }
        return booleanValue;
    }

    public String getClCode() {
        String stringFromAdObject = getStringFromAdObject("clcode", "");
        return com.applovin.impl.sdk.e.i.b(stringFromAdObject) ? stringFromAdObject : com.applovin.impl.sdk.e.f.a(this.fullResponse, "clcode", "", this.sdk);
    }

    public long getCreatedAtMillis() {
        return this.f2837c;
    }

    public com.applovin.impl.sdk.ad.h getDummyAd() {
        return this.f2838d;
    }

    public long getFetchLatencyMillis() {
        return com.applovin.impl.sdk.e.f.a(this.fullResponse, "ad_fetch_latency_millis", -1L, this.sdk);
    }

    public long getFetchResponseSize() {
        return com.applovin.impl.sdk.e.f.a(this.fullResponse, "ad_fetch_response_size", -1L, this.sdk);
    }

    protected float getFloatFromAdObject(String str, float f) {
        float a2;
        if (!((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.fk)).booleanValue()) {
            return com.applovin.impl.sdk.e.f.a(this.adObject, str, f, this.sdk);
        }
        synchronized (this.adObjectLock) {
            a2 = com.applovin.impl.sdk.e.f.a(this.adObject, str, f, this.sdk);
        }
        return a2;
    }

    protected int getIntFromAdObject(String str, int i) {
        int a2;
        if (!((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.fk)).booleanValue()) {
            return com.applovin.impl.sdk.e.f.a(this.adObject, str, i, this.sdk);
        }
        synchronized (this.adObjectLock) {
            a2 = com.applovin.impl.sdk.e.f.a(this.adObject, str, i, this.sdk);
        }
        return a2;
    }

    protected JSONObject getJsonObjectFromAdObject(String str, JSONObject jSONObject) {
        JSONObject a2;
        if (!((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.fk)).booleanValue()) {
            return com.applovin.impl.sdk.e.f.a(this.adObject, str, jSONObject, this.sdk);
        }
        synchronized (this.adObjectLock) {
            a2 = com.applovin.impl.sdk.e.f.a(this.adObject, str, jSONObject, this.sdk);
        }
        return a2;
    }

    protected long getLongFromAdObject(String str, long j) {
        long a2;
        if (!((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.fk)).booleanValue()) {
            return com.applovin.impl.sdk.e.f.a(this.adObject, str, j, this.sdk);
        }
        synchronized (this.adObjectLock) {
            a2 = com.applovin.impl.sdk.e.f.a(this.adObject, str, j, this.sdk);
        }
        return a2;
    }

    public String getPrimaryKey() {
        return getStringFromAdObject("pk", "NA");
    }

    public String getSecondaryKey1() {
        return getStringFromAdObject("sk1", null);
    }

    public String getSecondaryKey2() {
        return getStringFromAdObject("sk2", null);
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return AppLovinAdSize.fromString(com.applovin.impl.sdk.e.f.a(this.fullResponse, "ad_size", (String) null, this.sdk));
    }

    public com.applovin.impl.sdk.ad.b getSource() {
        return this.source;
    }

    protected String getStringFromAdObject(String str, String str2) {
        String a2;
        if (!((Boolean) this.sdk.a(com.applovin.impl.sdk.b.b.fk)).booleanValue()) {
            return com.applovin.impl.sdk.e.f.a(this.adObject, str, str2, this.sdk);
        }
        synchronized (this.adObjectLock) {
            a2 = com.applovin.impl.sdk.e.f.a(this.adObject, str, str2, this.sdk);
        }
        return a2;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return AppLovinAdType.fromString(com.applovin.impl.sdk.e.f.a(this.fullResponse, "ad_type", (String) null, this.sdk));
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (getAdZone().l()) {
            return null;
        }
        return com.applovin.impl.sdk.e.f.a(this.fullResponse, "zone_id", (String) null, this.sdk);
    }

    public boolean hasShown() {
        return getBooleanFromAdObject("shown", false);
    }

    public boolean hasVideoUrl() {
        this.sdk.u().d("AppLovinAdBase", "Attempting to invoke hasVideoUrl() from base ad class");
        return false;
    }

    public int hashCode() {
        return this.f2835a;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public boolean isVideoAd() {
        return this.adObject.has("is_video_ad") ? getBooleanFromAdObject("is_video_ad", false) : hasVideoUrl();
    }

    public void setDummyAd(com.applovin.impl.sdk.ad.h hVar) {
        this.f2838d = hVar;
    }

    public void setHasShown(boolean z) {
        try {
            synchronized (this.adObjectLock) {
                this.adObject.put("shown", z);
            }
        } catch (Throwable unused) {
        }
    }

    public boolean shouldCancelHtmlCachingIfShown() {
        return getBooleanFromAdObject("chcis", false);
    }

    public String toString() {
        String a2;
        synchronized (this.adObjectLock) {
            a2 = com.applovin.impl.sdk.e.f.a(this.adObject, this.sdk);
        }
        return "[" + getClass().getSimpleName() + " #" + getAdIdNumber() + " source=" + getSource() + ", zoneId=" + getZoneId() + ", adObject=" + a2 + "]";
    }
}
