package com.applovin.impl.sdk.ad;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.h5;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.t1;
import com.applovin.impl.u;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class AppLovinAdImpl extends AppLovinAdBase implements AppLovinAd, t1 {
    private u a;
    private boolean b;
    private c c;

    protected AppLovinAdImpl(JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        super(jSONObject, jSONObject2, kVar);
    }

    private long b() {
        return getLongFromAdObject("ad_expiration_ms", ((Long) this.sdk.a(x4.c1)).longValue());
    }

    public boolean canExpire() {
        return getSize() == AppLovinAdSize.INTERSTITIAL && b() > 0;
    }

    public boolean equals(Object obj) {
        AppLovinAd c;
        if ((obj instanceof c) && (c = ((c) obj).c()) != null) {
            obj = c;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && getAdIdNumber() == ((AppLovinAdImpl) obj).getAdIdNumber();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getAdIdNumber() {
        return getLongFromAdObject(CreativeInfo.c, -1L);
    }

    public u getAdZone() {
        u uVar = this.a;
        if (uVar != null) {
            if (uVar.f() != null && this.a.g() != null) {
                return this.a;
            }
            if (getSize() == null && getType() == null) {
                return this.a;
            }
        }
        u a = u.a(getSize(), getType(), getStringFromFullResponse("zone_id", null), getBooleanFromFullResponse("is_bidding", false), getBooleanFromFullResponse("is_direct_sold", false));
        this.a = a;
        return a;
    }

    public c getDummyAd() {
        return this.c;
    }

    @Nullable
    public String getMediationServeId() {
        return getStringFromFullResponse("event_id", null);
    }

    public abstract JSONObject getOriginalFullResponse();

    public String getRawFullResponse() {
        String jSONObject;
        h5 h5Var = this.synchronizedFullResponse;
        if (h5Var != null) {
            return h5Var.toString();
        }
        synchronized (this.fullResponseLock) {
            jSONObject = this.fullResponse.toString();
        }
        return jSONObject;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return AppLovinAdSize.fromString(getStringFromFullResponse("ad_size", null));
    }

    @Override // com.applovin.impl.t1
    public long getTimeToLiveMillis() {
        if (!canExpire()) {
            return Long.MAX_VALUE;
        }
        return b() - (System.currentTimeMillis() - getCreatedAtMillis());
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return AppLovinAdType.fromString(getStringFromFullResponse("ad_type", null));
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (getAdZone().i()) {
            return null;
        }
        return getStringFromFullResponse("zone_id", null);
    }

    public boolean hasShown() {
        return getBooleanFromAdObject("shown", Boolean.FALSE);
    }

    public boolean hasVideoUrl() {
        this.sdk.O();
        if (!o.a()) {
            return false;
        }
        this.sdk.O().b("AppLovinAd", "Attempting to invoke hasVideoUrl() from base ad class");
        return false;
    }

    public int hashCode() {
        return (int) getAdIdNumber();
    }

    public boolean isExpired() {
        return this.b;
    }

    public boolean isVideoAd() {
        return this.adObject.has("is_video_ad") ? getBooleanFromAdObject("is_video_ad", Boolean.FALSE) : hasVideoUrl();
    }

    public void setDummyAd(c cVar) {
        this.c = cVar;
    }

    @Override // com.applovin.impl.t1
    public void setExpired() {
        this.b = true;
    }

    public void setHasShown(boolean z) {
        try {
            h5 h5Var = this.synchronizedAdObject;
            if (h5Var != null) {
                h5Var.a("shown", (Object) Boolean.valueOf(z));
                return;
            }
            synchronized (this.adObjectLock) {
                this.adObject.put("shown", z);
            }
        } catch (Throwable unused) {
        }
    }

    @NonNull
    public String toString() {
        return "AppLovinAd{adIdNumber=" + getAdIdNumber() + ", zoneId=\"" + getZoneId() + "\"}";
    }
}
