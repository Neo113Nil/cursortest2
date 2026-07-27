package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class X2 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BatteryInfo f7690a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y2 f7691b;

    public X2(Y2 y22, BatteryInfo batteryInfo) {
        this.f7691b = y22;
        this.f7690a = batteryInfo;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Z2 z22 = this.f7691b.f7723a;
        ChargeType chargeType = this.f7690a.chargeType;
        ChargeType chargeType2 = Z2.f7764d;
        synchronized (z22) {
            Iterator it = z22.f7767c.iterator();
            while (it.hasNext()) {
                ((ChargeTypeChangeListener) it.next()).onChargeTypeChanged(chargeType);
            }
        }
    }
}
