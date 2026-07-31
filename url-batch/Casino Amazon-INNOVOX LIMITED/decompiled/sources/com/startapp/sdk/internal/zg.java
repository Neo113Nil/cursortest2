package com.startapp.sdk.internal;

import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyCallback;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class zg extends TelephonyCallback implements TelephonyCallback.ServiceStateListener, TelephonyCallback.SignalStrengthsListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ah f527a;

    public zg(ah ahVar) {
        this.f527a = ahVar;
    }

    @Override // android.telephony.TelephonyCallback.ServiceStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        this.f527a.a(ServiceState.class, serviceState);
    }

    @Override // android.telephony.TelephonyCallback.SignalStrengthsListener
    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        this.f527a.e.a(signalStrength);
        this.f527a.a(SignalStrength.class, signalStrength);
    }
}
