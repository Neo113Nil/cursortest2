package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class n7 extends o1 {
    public n7(Context context, gd gdVar, AdPreferences adPreferences, AdEventListener adEventListener, pa paVar, pa paVar2, pa paVar3, pa paVar4, pa paVar5) {
        super(context, gdVar, adPreferences, adEventListener, AdPreferences.Placement.INAPP_OFFER_WALL, paVar, paVar2, paVar3, paVar4, paVar5, true);
    }

    @Override // com.startapp.sdk.adsbase.c
    public final com.startapp.sdk.adsbase.model.a c() {
        com.startapp.sdk.adsbase.model.a c = super.c();
        if (c == null) {
            return null;
        }
        c.t0 = AdsCommonMetaData.k().t();
        return c;
    }

    @Override // com.startapp.sdk.adsbase.c
    /* renamed from: c */
    public final void b(boolean z) {
        super.b(z);
        d(z);
    }
}
