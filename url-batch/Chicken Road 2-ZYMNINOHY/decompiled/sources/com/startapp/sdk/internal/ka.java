package com.startapp.sdk.internal;

import E.AbstractC0005f;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.ActivityExtra;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class ka extends m8 implements com.startapp.sdk.adsbase.f {
    public ka(Context context, AdPreferences.Placement placement, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5, ib ibVar6, ib ibVar7, ib ibVar8, ib ibVar9) {
        super(context, placement, ibVar, ibVar2, ibVar3, ibVar4, ibVar5, ibVar6, ibVar7, ibVar8, ibVar9);
    }

    public boolean a() {
        return false;
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f
    public final Long getAdCacheTtl() {
        return super.getAdCacheTtl();
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f
    public final Long getLastLoadTime() {
        return super.getLastLoadTime();
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f
    public final boolean getVideoCancelCallBack() {
        return super.getVideoCancelCallBack();
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f
    public final boolean hasAdCacheTtlPassed() {
        return super.hasAdCacheTtlPassed();
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f
    public final void setVideoCancelCallBack(boolean z) {
        super.setVideoCancelCallBack(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.io.Serializable, java.lang.Boolean[]] */
    @Override // com.startapp.sdk.adsbase.f
    public final boolean a(String str) {
        int i4;
        String a3 = g0.a();
        if (a() && AdsCommonMetaData.k().F().a().equals(VideoConfig.BackMode.DISABLED) && a3.equals("back")) {
            setNotDisplayedReason(NotDisplayedReason.VIDEO_BACK);
            return false;
        }
        if (!h0.f7040f.booleanValue()) {
            setState(Ad.AdState.UN_INITIALIZED);
        }
        if (this.f7258b == null) {
            setNotDisplayedReason(NotDisplayedReason.INTERNAL_ERROR);
            return false;
        }
        if (super.hasAdCacheTtlPassed()) {
            setNotDisplayedReason(NotDisplayedReason.AD_EXPIRED);
            return false;
        }
        ActivityExtra activityExtra = this.activityExtra;
        boolean z = activityExtra != null && activityExtra.a();
        Intent intent = new Intent(this.context, (Class<?>) OverlayActivity.class);
        intent.putExtra("fileUrl", "exit.html");
        String[] strArr = this.f7265i;
        String concat = "&position=".concat(g0.a());
        for (int i5 = 0; i5 < strArr.length; i5++) {
            String str2 = strArr[i5];
            if (str2 != null && !"".equals(str2)) {
                strArr[i5] = AbstractC0005f.q(new StringBuilder(), strArr[i5], concat);
            }
        }
        synchronized (hh.class) {
            int i6 = hh.f7063a;
            i4 = i6 < Integer.MAX_VALUE ? i6 + 1 : 1;
            hh.f7063a = i4;
            HashMap hashMap = hh.f7064b;
            if (hashMap.containsKey(Integer.valueOf(i4))) {
                throw new IllegalStateException();
            }
            hashMap.put(Integer.valueOf(i4), this);
        }
        intent.putExtra("tracking", strArr);
        intent.putExtra("trackingClickUrl", this.f7263g);
        intent.putExtra("packageNames", this.f7257a);
        intent.putExtra("smartRedirect", this.f7264h);
        intent.putExtra("browserEnabled", this.f7270p);
        AdPreferences.Placement placement = this.placement;
        intent.putExtra("placement", placement != null ? placement.getIndex() : -1);
        intent.putExtra("adInfoOverride", getAdInfoOverride());
        intent.putExtra("ad", i4);
        intent.putExtra("videoAd", a());
        intent.putExtra("fullscreen", z);
        int i7 = this.f7261e;
        if (i7 == 0) {
            i7 = this.context.getResources().getConfiguration().orientation;
        }
        intent.putExtra("orientation", i7);
        intent.putExtra("activityShouldLockOrientation", this.f7262f);
        intent.putExtra("adTag", str);
        intent.putExtra("lastLoadTime", super.getLastLoadTime());
        intent.putExtra("adCacheTtl", super.getAdCacheTtl());
        intent.putExtra("closingUrl", this.n);
        intent.putExtra("rewardDuration", this.f7268l);
        intent.putExtra("rewardedHideTimer", this.f7269m);
        Long l4 = this.f7266j;
        if (l4 != null) {
            intent.putExtra("delayImpressionSeconds", l4);
        }
        Long l5 = this.f7267k;
        if (l5 != null) {
            intent.putExtra("delayCloseInterval", l5);
        }
        intent.putExtra("sendRedirectHops", (Serializable) this.o);
        intent.putExtra("position", a3);
        intent.addFlags(343932928);
        if (((g6) this.consentManager.a()).f6976e) {
            ((g6) this.consentManager.a()).f6975d = intent;
            return true;
        }
        try {
            this.context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e4) {
            Log.e("StartAppSDK", "Failed to show Ad for placement " + this.placement, e4);
            ((p) this.adCacheManager.a()).a(this.placement);
            return false;
        } catch (Throwable th) {
            hh.a(i4, Object.class);
            d9.a(th);
            return false;
        }
    }
}
