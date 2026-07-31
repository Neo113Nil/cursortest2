package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.ads.nativead.NativeAdPreferences;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class vc extends ka {
    public final NativeAdPreferences b;

    public vc(Context context, pa paVar, pa paVar2, pa paVar3, pa paVar4, pa paVar5, pa paVar6, pa paVar7, pa paVar8, pa paVar9, NativeAdPreferences nativeAdPreferences) {
        super(context, AdPreferences.Placement.INAPP_NATIVE, paVar, paVar2, paVar3, paVar4, paVar5, paVar6, paVar7, paVar8, paVar9);
        this.b = nativeAdPreferences;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final v1 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        Context context = this.context;
        return str == null ? new com.startapp.sdk.ads.nativead.a(context, this, adPreferences, adEventListener, this.httpClient, this.networkApiExecutor, this.eventTracer, this.motionProcessor, this.b) : new m7(context, this, adEventListener, this.networkApiExecutor, this.eventTracer, str);
    }
}
