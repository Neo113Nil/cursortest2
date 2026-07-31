package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class p7 extends o1 {
    public p7(Context context, jd jdVar, AdPreferences adPreferences, AdEventListener adEventListener, pa paVar, pa paVar2, pa paVar3, pa paVar4, pa paVar5) {
        super(context, jdVar, adPreferences, adEventListener, AdPreferences.Placement.INAPP_OVERLAY, paVar, paVar2, paVar3, paVar4, paVar5, true);
    }

    @Override // com.startapp.sdk.adsbase.c
    /* renamed from: c */
    public final void b(boolean z) {
        super.b(z);
        d(z);
    }
}
