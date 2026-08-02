package com.startapp.sdk.internal;

import android.content.Context;
import android.content.Intent;
import com.startapp.sdk.ads.list3d.List3DActivity;
import com.startapp.sdk.adsbase.ActivityExtra;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.UUID;

/* loaded from: classes.dex */
public final class td extends db implements com.startapp.sdk.adsbase.f {

    /* renamed from: d, reason: collision with root package name */
    public static String f4480d;

    /* renamed from: b, reason: collision with root package name */
    public final String f4481b;

    /* renamed from: c, reason: collision with root package name */
    public final ib f4482c;

    public td(Context context, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5, ib ibVar6, ib ibVar7, ib ibVar8, ib ibVar9, ib ibVar10) {
        super(context, AdPreferences.Placement.INAPP_OFFER_WALL, ibVar, ibVar2, ibVar3, ibVar4, ibVar5, ibVar6, ibVar7, ibVar8, ibVar9);
        this.f4481b = UUID.randomUUID().toString();
        this.f4482c = ibVar10;
        if (f4480d == null) {
            f4480d = si.a(context);
        }
    }

    @Override // com.startapp.sdk.adsbase.f
    public final boolean a(String str) {
        ((sb) this.f4482c.a()).a(this.f4481b).f4393c = "&position=".concat(g0.a());
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
        intent.putExtra("position", g0.a());
        intent.putExtra("listModelUuid", this.f4481b);
        intent.addFlags(343932928);
        try {
            this.context.startActivity(intent);
            if (!h0.f.booleanValue()) {
                setState(Ad.AdState.UN_INITIALIZED);
            }
            return true;
        } catch (Throwable th) {
            d9.a(th);
            return false;
        }
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final a2 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        return new d8(this.context, this, adPreferences, adEventListener, this.httpClient, this.networkApiExecutor, this.eventTracer, this.motionProcessor, this.f4482c);
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
