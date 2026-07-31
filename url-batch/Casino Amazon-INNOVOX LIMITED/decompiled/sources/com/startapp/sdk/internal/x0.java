package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class x0 extends ka {
    public int b;
    public boolean c;

    public x0(Context context, pa paVar, pa paVar2, pa paVar3, pa paVar4, pa paVar5, pa paVar6, pa paVar7, pa paVar8, pa paVar9, int i) {
        super(context, AdPreferences.Placement.INAPP_BANNER, paVar, paVar2, paVar3, paVar4, paVar5, paVar6, paVar7, paVar8, paVar9);
        this.b = i;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final v1 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        Context context = this.context;
        pa paVar = this.httpClient;
        pa paVar2 = this.networkApiExecutor;
        pa paVar3 = this.eventTracer;
        pa paVar4 = this.motionProcessor;
        int i = this.b;
        this.b = i + 1;
        return new h7(context, this, adPreferences, adEventListener, paVar, paVar2, paVar3, paVar4, i);
    }
}
