package com.startapp.sdk.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.facebook.react.uimanager.ViewProps;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.ActivityExtra;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class r9 extends x7 implements com.startapp.sdk.adsbase.f {
    public r9(Context context, AdPreferences.Placement placement, pa paVar, pa paVar2, pa paVar3, pa paVar4, pa paVar5, pa paVar6, pa paVar7, pa paVar8, pa paVar9) {
        super(context, placement, paVar, paVar2, paVar3, paVar4, paVar5, paVar6, paVar7, paVar8, paVar9);
    }

    public boolean a() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.io.Serializable, java.lang.Boolean[]] */
    @Override // com.startapp.sdk.adsbase.f
    public final boolean a(String str) {
        int i;
        String a2 = e0.a();
        if (a() && AdsCommonMetaData.k().F().a().equals(VideoConfig.BackMode.DISABLED) && a2.equals("back")) {
            setNotDisplayedReason(NotDisplayedReason.VIDEO_BACK);
            return false;
        }
        if (!f0.f.booleanValue()) {
            setState(Ad.AdState.UN_INITIALIZED);
        }
        if (this.b == null) {
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
        String[] strArr = this.i;
        String concat = "&position=".concat(e0.a());
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str2 = strArr[i2];
            if (str2 != null && !"".equals(str2)) {
                strArr[i2] = strArr[i2] + concat;
            }
        }
        synchronized (rg.class) {
            int i3 = rg.f406a;
            i = i3 < Integer.MAX_VALUE ? i3 + 1 : 1;
            rg.f406a = i;
            HashMap hashMap = rg.b;
            if (hashMap.containsKey(Integer.valueOf(i))) {
                throw new IllegalStateException();
            }
            hashMap.put(Integer.valueOf(i), this);
        }
        intent.putExtra("tracking", strArr);
        intent.putExtra("trackingClickUrl", this.g);
        intent.putExtra("packageNames", this.f492a);
        intent.putExtra("smartRedirect", this.h);
        intent.putExtra("browserEnabled", this.p);
        AdPreferences.Placement placement = this.placement;
        intent.putExtra("placement", placement != null ? placement.getIndex() : -1);
        intent.putExtra("adInfoOverride", getAdInfoOverride());
        intent.putExtra("ad", i);
        intent.putExtra("videoAd", a());
        intent.putExtra("fullscreen", z);
        int i4 = this.e;
        if (i4 == 0) {
            i4 = this.context.getResources().getConfiguration().orientation;
        }
        intent.putExtra("orientation", i4);
        intent.putExtra("activityShouldLockOrientation", this.f);
        intent.putExtra("adTag", str);
        intent.putExtra("lastLoadTime", super.getLastLoadTime());
        intent.putExtra("adCacheTtl", super.getAdCacheTtl());
        intent.putExtra("closingUrl", this.n);
        intent.putExtra("rewardDuration", this.l);
        intent.putExtra("rewardedHideTimer", this.m);
        Long l = this.j;
        if (l != null) {
            intent.putExtra("delayImpressionSeconds", l);
        }
        Long l2 = this.k;
        if (l2 != null) {
            intent.putExtra("delayCloseInterval", l2);
        }
        intent.putExtra("sendRedirectHops", (Serializable) this.o);
        intent.putExtra(ViewProps.POSITION, a2);
        intent.addFlags(343932928);
        if (((x5) this.consentManager.a()).e) {
            ((x5) this.consentManager.a()).d = intent;
            return true;
        }
        try {
            this.context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            Log.e("StartAppSDK", "Failed to show Ad for placement " + this.placement, e);
            ((p) this.adCacheManager.a()).a(this.placement);
            return false;
        } catch (Throwable th) {
            rg.a(i, Object.class);
            n8.a(th);
            return false;
        }
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
}
