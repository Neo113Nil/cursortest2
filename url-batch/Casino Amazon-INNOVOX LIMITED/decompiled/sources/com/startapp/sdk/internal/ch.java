package com.startapp.sdk.internal;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ch extends PhoneStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dh f204a;

    public ch(dh dhVar) {
        this.f204a = dhVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        this.f204a.a(ServiceState.class, serviceState);
    }

    @Override // android.telephony.PhoneStateListener
    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        this.f204a.e.a(signalStrength);
        this.f204a.a(SignalStrength.class, signalStrength);
    }
}
