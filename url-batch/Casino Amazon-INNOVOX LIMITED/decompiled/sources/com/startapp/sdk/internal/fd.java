package com.startapp.sdk.internal;

import android.content.Context;
import android.content.Intent;
import com.facebook.react.uimanager.ViewProps;
import com.startapp.sdk.ads.list3d.List3DActivity;
import com.startapp.sdk.adsbase.ActivityExtra;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.UUID;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class fd extends ka implements com.startapp.sdk.adsbase.f {
    public static String d;
    public final String b;
    public final pa c;

    public fd(Context context, pa paVar, pa paVar2, pa paVar3, pa paVar4, pa paVar5, pa paVar6, pa paVar7, pa paVar8, pa paVar9, pa paVar10) {
        super(context, AdPreferences.Placement.INAPP_OFFER_WALL, paVar, paVar2, paVar3, paVar4, paVar5, paVar6, paVar7, paVar8, paVar9);
        this.b = UUID.randomUUID().toString();
        this.c = paVar10;
        if (d == null) {
            d = zh.a(context);
        }
    }

    @Override // com.startapp.sdk.adsbase.f
    public final boolean a(String str) {
        ((za) this.c.a()).a(this.b).c = "&position=".concat(e0.a());
        ActivityExtra activityExtra = this.activityExtra;
        boolean z = activityExtra != null && activityExtra.a();
        if (super.hasAdCacheTtlPassed()) {
            setNotDisplayedReason(NotDisplayedReason.AD_EXPIRED);
            return false;
        }
        Intent intent = new Intent(this.context, (Class<?>) List3DActivity.class);
        intent.putExtra("adInfoOverride", getAdInfoOverride());
        intent.putExtra("fullscreen", z);
        intent.putExtra("adTag", str);
        intent.putExtra("lastLoadTime", super.getLastLoadTime());
        intent.putExtra("adCacheTtl", super.getAdCacheTtl());
        intent.putExtra(ViewProps.POSITION, e0.a());
        intent.putExtra("listModelUuid", this.b);
        intent.addFlags(343932928);
        try {
            this.context.startActivity(intent);
            if (!f0.f.booleanValue()) {
                setState(Ad.AdState.UN_INITIALIZED);
            }
            return true;
        } catch (Throwable th) {
            n8.a(th);
            return false;
        }
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final v1 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        return new o7(this.context, this, adPreferences, adEventListener, this.httpClient, this.networkApiExecutor, this.eventTracer, this.motionProcessor, this.c);
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
