package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* loaded from: classes.dex */
public final class c8 extends s1 {
    public c8(Context context, ud udVar, AdPreferences adPreferences, AdEventListener adEventListener, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5) {
        super(context, udVar, adPreferences, adEventListener, AdPreferences.Placement.INAPP_OFFER_WALL, ibVar, ibVar2, ibVar3, ibVar4, ibVar5, true);
    }

    @Override // com.startapp.sdk.adsbase.c
    public final com.startapp.sdk.adsbase.model.a c() {
        com.startapp.sdk.adsbase.model.a c3 = super.c();
        if (c3 == null) {
            return null;
        }
        c3.f3384t0 = AdsCommonMetaData.k().t();
        return c3;
    }

    @Override // com.startapp.sdk.adsbase.c
    /* renamed from: c */
    public final void b(boolean z) {
        super.b(z);
        e(z);
    }
}
