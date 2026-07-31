package com.google.android.gms.internal.ads;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;

/* loaded from: classes.dex */
final class ao2 extends PhoneStateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bp2 f2897a;

    /* synthetic */ ao2(bp2 bp2Var, ym2 ym2Var) {
        this.f2897a = bp2Var;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        bp2.c(this.f2897a, true != (overrideNetworkType == 3 || overrideNetworkType == 4) ? 5 : 10);
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        String serviceState2 = serviceState == null ? "" : serviceState.toString();
        bp2.c(this.f2897a, true != (serviceState2.contains("nrState=CONNECTED") || serviceState2.contains("nrState=NOT_RESTRICTED")) ? 5 : 10);
    }
}
