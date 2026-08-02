package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class X2 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BatteryInfo f6853a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y2 f6854b;

    public X2(Y2 y22, BatteryInfo batteryInfo) {
        this.f6854b = y22;
        this.f6853a = batteryInfo;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Z2 z2 = this.f6854b.f6885a;
        ChargeType chargeType = this.f6853a.chargeType;
        ChargeType chargeType2 = Z2.f6924d;
        synchronized (z2) {
            Iterator it = z2.f6927c.iterator();
            while (it.hasNext()) {
                ((ChargeTypeChangeListener) it.next()).onChargeTypeChanged(chargeType);
            }
        }
    }
}
