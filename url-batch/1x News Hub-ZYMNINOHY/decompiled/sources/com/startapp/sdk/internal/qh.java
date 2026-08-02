package com.startapp.sdk.internal;

import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyCallback;

/* loaded from: classes.dex */
public final class qh extends TelephonyCallback implements TelephonyCallback.ServiceStateListener, TelephonyCallback.SignalStrengthsListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh f4373a;

    public qh(rh rhVar) {
        this.f4373a = rhVar;
    }

    public final void onServiceStateChanged(ServiceState serviceState) {
        this.f4373a.a(ServiceState.class, serviceState);
    }

    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        this.f4373a.f4401e.a(signalStrength);
        this.f4373a.a(SignalStrength.class, signalStrength);
    }
}
