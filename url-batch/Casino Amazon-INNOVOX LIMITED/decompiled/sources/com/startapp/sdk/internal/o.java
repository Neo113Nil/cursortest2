package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final StartAppAd f355a;
    public final AdPreferences.Placement b;
    public final AdPreferences c;
    public final AdEventListener d;

    public o(StartAppAd startAppAd, AdPreferences.Placement placement, AdPreferences adPreferences, AdEventListener adEventListener) {
        this.f355a = startAppAd;
        this.b = placement;
        this.c = adPreferences;
        this.d = adEventListener;
    }
}
