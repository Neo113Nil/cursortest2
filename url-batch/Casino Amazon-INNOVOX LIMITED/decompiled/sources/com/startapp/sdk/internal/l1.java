package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class l1 extends x7 {
    public int r;
    public boolean s;
    public int t;

    public l1(Context context, pa paVar, pa paVar2, pa paVar3, pa paVar4, pa paVar5, pa paVar6, pa paVar7, pa paVar8, pa paVar9, int i) {
        super(context, AdPreferences.Placement.INAPP_BANNER, paVar, paVar2, paVar3, paVar4, paVar5, paVar6, paVar7, paVar8, paVar9);
        this.r = i;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final v1 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        Context context = this.context;
        if (str != null) {
            return new i7(context, this, adEventListener, this.networkApiExecutor, this.eventTracer, this.webViewCacheLoader, str);
        }
        pa paVar = this.httpClient;
        pa paVar2 = this.networkApiExecutor;
        pa paVar3 = this.eventTracer;
        pa paVar4 = this.motionProcessor;
        pa paVar5 = this.webViewCacheLoader;
        int i = this.r;
        this.r = i + 1;
        return new j7(context, this, adPreferences, adEventListener, paVar, paVar2, paVar3, paVar4, paVar5, i);
    }
}
