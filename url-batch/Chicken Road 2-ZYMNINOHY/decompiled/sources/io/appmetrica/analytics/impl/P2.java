package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class P2 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BatteryInfo f10787a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q2 f10788b;

    public P2(Q2 q22, BatteryInfo batteryInfo) {
        this.f10788b = q22;
        this.f10787a = batteryInfo;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        R2 r22 = this.f10788b.f10835a;
        ChargeType chargeType = this.f10787a.chargeType;
        ChargeType chargeType2 = R2.f10863d;
        synchronized (r22) {
            ArrayList arrayList = r22.f10866c;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                ((ChargeTypeChangeListener) obj).onChargeTypeChanged(chargeType);
            }
        }
    }
}
