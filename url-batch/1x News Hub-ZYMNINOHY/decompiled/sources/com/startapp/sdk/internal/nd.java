package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.ads.nativead.NativeAdPreferences;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* loaded from: classes.dex */
public final class nd extends db {

    /* renamed from: b, reason: collision with root package name */
    public final NativeAdPreferences f4205b;

    public nd(Context context, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5, ib ibVar6, ib ibVar7, ib ibVar8, ib ibVar9, NativeAdPreferences nativeAdPreferences) {
        super(context, AdPreferences.Placement.INAPP_NATIVE, ibVar, ibVar2, ibVar3, ibVar4, ibVar5, ibVar6, ibVar7, ibVar8, ibVar9);
        this.f4205b = nativeAdPreferences;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final a2 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        return str == null ? new com.startapp.sdk.ads.nativead.a(this.context, this, adPreferences, adEventListener, this.httpClient, this.networkApiExecutor, this.eventTracer, this.motionProcessor, this.f4205b) : new b8(this.context, this, adEventListener, this.networkApiExecutor, this.eventTracer, str);
    }
}
