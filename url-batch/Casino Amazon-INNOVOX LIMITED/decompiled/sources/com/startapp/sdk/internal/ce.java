package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ce extends r9 {
    public ce(Context context, pa paVar, pa paVar2, pa paVar3, pa paVar4, pa paVar5, pa paVar6, pa paVar7, pa paVar8, pa paVar9) {
        super(context, AdPreferences.Placement.INAPP_NATIVE, paVar, paVar2, paVar3, paVar4, paVar5, paVar6, paVar7, paVar8, paVar9);
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final v1 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        setErrorMessage("Disabled");
        return null;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final void load(AdPreferences adPreferences, AdEventListener adEventListener) {
        setErrorMessage("Disabled");
        if (adEventListener != null) {
            adEventListener.onFailedToReceiveAd(this);
        }
    }
}
