package com.applovin.impl.sdk.ad;

import android.util.Log;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h extends AppLovinAdBase {

    /* renamed from: a, reason: collision with root package name */
    private AppLovinAd f2988a;

    /* renamed from: b, reason: collision with root package name */
    private final d f2989b;

    public h(d dVar, com.applovin.impl.sdk.j jVar) {
        super(new JSONObject(), new JSONObject(), b.UNKNOWN, jVar);
        this.f2989b = dVar;
    }

    private AppLovinAd c() {
        return (AppLovinAd) this.sdk.L().c(this.f2989b);
    }

    private String d() {
        d adZone = getAdZone();
        if (adZone == null || adZone.l()) {
            return null;
        }
        return adZone.a();
    }

    public AppLovinAd a() {
        return this.f2988a;
    }

    public void a(AppLovinAd appLovinAd) {
        this.f2988a = appLovinAd;
    }

    public AppLovinAd b() {
        return this.f2988a != null ? this.f2988a : c();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppLovinAd b2 = b();
        return b2 != null ? b2.equals(obj) : super.equals(obj);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.sdk.AppLovinAd
    public long getAdIdNumber() {
        try {
            AppLovinAd b2 = b();
            if (b2 != null) {
                return b2.getAdIdNumber();
            }
            return 0L;
        } catch (Throwable th) {
            Log.e("AppLovinAd", "Failed to retrieve ad id number", th);
            return 0L;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public d getAdZone() {
        AppLovinAdBase appLovinAdBase = (AppLovinAdBase) b();
        return appLovinAdBase != null ? appLovinAdBase.getAdZone() : this.f2989b;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        AppLovinAdSize appLovinAdSize = AppLovinAdSize.INTERSTITIAL;
        try {
            return getAdZone().b();
        } catch (Throwable th) {
            Log.e("AppLovinAd", "Failed to retrieve ad size", th);
            return appLovinAdSize;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public b getSource() {
        AppLovinAdBase appLovinAdBase = (AppLovinAdBase) b();
        return appLovinAdBase != null ? appLovinAdBase.getSource() : b.UNKNOWN;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        AppLovinAdType appLovinAdType = AppLovinAdType.REGULAR;
        try {
            return getAdZone().c();
        } catch (Throwable th) {
            Log.e("AppLovinAd", "Failed to retrieve ad type", th);
            return appLovinAdType;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        try {
            if (this.f2989b.l()) {
                return null;
            }
            return this.f2989b.a();
        } catch (Throwable th) {
            Log.e("AppLovinAd", "Failed to return zone id", th);
            return null;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public int hashCode() {
        AppLovinAd b2 = b();
        return b2 != null ? b2.hashCode() : super.hashCode();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.sdk.AppLovinAd
    public boolean isVideoAd() {
        try {
            AppLovinAd b2 = b();
            if (b2 != null) {
                return b2.isVideoAd();
            }
            return false;
        } catch (Throwable th) {
            Log.e("AppLovinAd", "Failed to return whether ad is video ad", th);
            return false;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public String toString() {
        return "[AppLovinAd #" + getAdIdNumber() + " adType=" + getType() + ", adSize=" + getSize() + ", zoneId=" + d() + "]";
    }
}
