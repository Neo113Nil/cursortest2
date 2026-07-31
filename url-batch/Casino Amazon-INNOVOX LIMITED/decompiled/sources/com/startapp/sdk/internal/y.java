package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class y {
    public static void a(Context context, AdDisplayListener adDisplayListener, Ad ad) {
        boolean z = adDisplayListener != null;
        String errorMessage = ad != null ? ad.getErrorMessage() : null;
        u6.a("adNotDisplayed", z, null, errorMessage);
        e0.a(adDisplayListener != null ? new x(context, adDisplayListener, ad, errorMessage) : null);
    }
}
