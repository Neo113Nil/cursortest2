package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.o9;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class NetworkSettings {

    /* renamed from: r, reason: collision with root package name */
    private static final String f17693r = "customNetwork";

    /* renamed from: s, reason: collision with root package name */
    private static final String f17694s = "customNetworkPackage";

    /* renamed from: t, reason: collision with root package name */
    private static final String f17695t = "customNetworkAdapterName";

    /* renamed from: a, reason: collision with root package name */
    private String f17696a;

    /* renamed from: b, reason: collision with root package name */
    private String f17697b;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f17698c;

    /* renamed from: d, reason: collision with root package name */
    private JSONObject f17699d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f17700e;

    /* renamed from: f, reason: collision with root package name */
    private JSONObject f17701f;

    /* renamed from: g, reason: collision with root package name */
    private JSONObject f17702g;

    /* renamed from: h, reason: collision with root package name */
    private String f17703h;

    /* renamed from: i, reason: collision with root package name */
    private String f17704i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f17705j;

    /* renamed from: k, reason: collision with root package name */
    private String f17706k;

    /* renamed from: l, reason: collision with root package name */
    private int f17707l;

    /* renamed from: m, reason: collision with root package name */
    private int f17708m;

    /* renamed from: n, reason: collision with root package name */
    private int f17709n;

    /* renamed from: o, reason: collision with root package name */
    private int f17710o;

    /* renamed from: p, reason: collision with root package name */
    private String f17711p;

    /* renamed from: q, reason: collision with root package name */
    private String f17712q;

    public NetworkSettings(NetworkSettings networkSettings) {
        this.f17696a = networkSettings.getProviderName();
        this.f17706k = networkSettings.getProviderName();
        this.f17697b = networkSettings.getProviderTypeForReflection();
        this.f17699d = networkSettings.getRewardedVideoSettings();
        this.f17700e = networkSettings.getInterstitialSettings();
        this.f17701f = networkSettings.getBannerSettings();
        this.f17702g = networkSettings.getNativeAdSettings();
        this.f17698c = networkSettings.getApplicationSettings();
        this.f17707l = networkSettings.getRewardedVideoPriority();
        this.f17708m = networkSettings.getInterstitialPriority();
        this.f17709n = networkSettings.getBannerPriority();
        this.f17710o = networkSettings.getNativeAdPriority();
        this.f17711p = networkSettings.getProviderDefaultInstance();
        this.f17712q = networkSettings.getProviderNetworkKey();
    }

    public String getAdSourceNameForEvents() {
        return this.f17704i;
    }

    public JSONObject getApplicationSettings() {
        return this.f17698c;
    }

    public int getBannerPriority() {
        return this.f17709n;
    }

    public JSONObject getBannerSettings() {
        return this.f17701f;
    }

    public String getCustomNetwork() {
        JSONObject jSONObject = this.f17698c;
        if (jSONObject != null) {
            return jSONObject.optString("customNetwork");
        }
        return null;
    }

    public String getCustomNetworkAdapterName(IronSource.AD_UNIT ad_unit) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if ((ad_unit == null && (jSONObject2 = this.f17698c) != null) || ((ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO) && (jSONObject2 = this.f17699d) != null) || ((ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL) && (jSONObject2 = this.f17700e) != null) || (ad_unit.equals(IronSource.AD_UNIT.BANNER) && (jSONObject2 = this.f17701f) != null)))) {
            return jSONObject2.optString(f17695t);
        }
        if (!ad_unit.equals(IronSource.AD_UNIT.NATIVE_AD) || (jSONObject = this.f17702g) == null) {
            return null;
        }
        return jSONObject.optString(f17695t);
    }

    public String getCustomNetworkPackage() {
        JSONObject jSONObject = this.f17698c;
        return jSONObject != null ? jSONObject.optString(f17694s, "") : "";
    }

    public int getInstanceType(IronSource.AD_UNIT ad_unit) {
        JSONObject nativeAdSettings;
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            nativeAdSettings = getRewardedVideoSettings();
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            nativeAdSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            nativeAdSettings = getBannerSettings();
        } else {
            if (ad_unit != IronSource.AD_UNIT.NATIVE_AD) {
                return 1;
            }
            nativeAdSettings = getNativeAdSettings();
        }
        return nativeAdSettings.optInt("instanceType");
    }

    public int getInterstitialPriority() {
        return this.f17708m;
    }

    public JSONObject getInterstitialSettings() {
        return this.f17700e;
    }

    public int getMaxAdsPerSession(IronSource.AD_UNIT ad_unit) {
        JSONObject nativeAdSettings;
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            nativeAdSettings = getRewardedVideoSettings();
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            nativeAdSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            nativeAdSettings = getBannerSettings();
        } else {
            if (ad_unit != IronSource.AD_UNIT.NATIVE_AD) {
                return 99;
            }
            nativeAdSettings = getNativeAdSettings();
        }
        return nativeAdSettings.optInt("maxAdsPerSession", 99);
    }

    public int getNativeAdPriority() {
        return this.f17710o;
    }

    public JSONObject getNativeAdSettings() {
        return this.f17702g;
    }

    public String getProviderDefaultInstance() {
        return this.f17711p;
    }

    public String getProviderInstanceName() {
        return this.f17706k;
    }

    public String getProviderName() {
        return this.f17696a;
    }

    public String getProviderNetworkKey() {
        return this.f17712q;
    }

    public String getProviderTypeForReflection() {
        return this.f17697b;
    }

    public int getRewardedVideoPriority() {
        return this.f17707l;
    }

    public JSONObject getRewardedVideoSettings() {
        return this.f17699d;
    }

    public String getSubProviderId() {
        return this.f17703h;
    }

    public boolean isBidder(IronSource.AD_UNIT ad_unit) {
        return !isCustomNetwork() && getInstanceType(ad_unit) == 2;
    }

    public boolean isCustomNetwork() {
        return !TextUtils.isEmpty(getCustomNetwork());
    }

    public boolean isIronSource() {
        return getProviderTypeForReflection().equalsIgnoreCase("IronSource");
    }

    public boolean isMultipleInstances() {
        return this.f17705j;
    }

    public void setAdSourceNameForEvents(String str) {
        this.f17704i = str;
    }

    public void setApplicationSettings(JSONObject jSONObject) {
        this.f17698c = jSONObject;
    }

    public void setBannerPriority(int i4) {
        this.f17709n = i4;
    }

    public void setBannerSettings(String str, Object obj) {
        try {
            this.f17701f.put(str, obj);
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    public void setInterstitialPriority(int i4) {
        this.f17708m = i4;
    }

    public void setInterstitialSettings(String str, Object obj) {
        try {
            this.f17700e.put(str, obj);
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    public void setIsMultipleInstances(boolean z4) {
        this.f17705j = z4;
    }

    public void setNativeAdPriority(int i4) {
        this.f17710o = i4;
    }

    public void setNativeAdSettings(String str, Object obj) {
        try {
            this.f17702g.put(str, obj);
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    public void setProviderNetworkKey(String str) {
        this.f17712q = str;
    }

    public void setRewardedVideoPriority(int i4) {
        this.f17707l = i4;
    }

    public void setRewardedVideoSettings(String str, Object obj) {
        try {
            this.f17699d.put(str, obj);
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    public void setSubProviderId(String str) {
        this.f17703h = str;
    }

    public boolean shouldEarlyInit() {
        JSONObject jSONObject = this.f17698c;
        if (jSONObject != null) {
            return jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        }
        return false;
    }

    public NetworkSettings(String str) {
        this.f17696a = str;
        this.f17706k = str;
        this.f17697b = str;
        this.f17711p = str;
        this.f17712q = str;
        this.f17699d = new JSONObject();
        this.f17700e = new JSONObject();
        this.f17701f = new JSONObject();
        this.f17702g = new JSONObject();
        this.f17698c = new JSONObject();
        this.f17707l = -1;
        this.f17708m = -1;
        this.f17709n = -1;
        this.f17710o = -1;
    }

    public void setBannerSettings(JSONObject jSONObject) {
        this.f17701f = jSONObject;
    }

    public void setInterstitialSettings(JSONObject jSONObject) {
        this.f17700e = jSONObject;
    }

    public void setNativeAdSettings(JSONObject jSONObject) {
        this.f17702g = jSONObject;
    }

    public void setRewardedVideoSettings(JSONObject jSONObject) {
        this.f17699d = jSONObject;
    }

    public NetworkSettings(String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        this.f17696a = str;
        this.f17706k = str;
        this.f17697b = str2;
        this.f17711p = str3;
        this.f17712q = str4;
        this.f17699d = jSONObject2;
        this.f17700e = jSONObject3;
        this.f17701f = jSONObject4;
        this.f17702g = jSONObject5;
        this.f17698c = jSONObject;
        this.f17707l = -1;
        this.f17708m = -1;
        this.f17709n = -1;
        this.f17710o = -1;
    }
}
