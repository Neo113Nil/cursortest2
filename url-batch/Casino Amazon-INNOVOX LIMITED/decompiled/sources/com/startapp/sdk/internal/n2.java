package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class n2 extends Ad {
    public n2(Context context, AdPreferences.Placement placement, pa paVar, pa paVar2, pa paVar3, pa paVar4, pa paVar5, pa paVar6, pa paVar7, pa paVar8, pa paVar9) {
        super(context, placement, paVar, paVar2, paVar3, paVar4, paVar5, paVar6, paVar7, paVar8, paVar9);
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final v1 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        return null;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final String getAdId() {
        return null;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final String getErrorMessage() {
        return "explicit call: nofill [204]";
    }
}
