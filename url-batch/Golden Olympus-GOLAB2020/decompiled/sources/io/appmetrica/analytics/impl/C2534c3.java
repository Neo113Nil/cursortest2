package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.c3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2534c3 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BatteryInfo f38763a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2561d3 f38764b;

    public C2534c3(C2561d3 c2561d3, BatteryInfo batteryInfo) {
        this.f38764b = c2561d3;
        this.f38763a = batteryInfo;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C2587e3 c2587e3 = this.f38764b.f38816a;
        ChargeType chargeType = this.f38763a.chargeType;
        ChargeType chargeType2 = C2587e3.f38900d;
        synchronized (c2587e3) {
            ArrayList arrayList = c2587e3.f38903c;
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
