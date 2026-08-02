package com.startapp.sdk.internal;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;

/* loaded from: classes.dex */
public final class th extends PhoneStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uh f7626a;

    public th(uh uhVar) {
        this.f7626a = uhVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        this.f7626a.a(ServiceState.class, serviceState);
    }

    @Override // android.telephony.PhoneStateListener
    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        this.f7626a.f7711e.a(signalStrength);
        this.f7626a.a(SignalStrength.class, signalStrength);
    }
}
