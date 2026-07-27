package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;

/* loaded from: classes.dex */
public final class Y2 implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z2 f7723a;

    public Y2(Z2 z22) {
        this.f7723a = z22;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        Intent intent = (Intent) obj;
        BatteryInfo batteryInfo = this.f7723a.f7766b;
        ChargeType chargeType = batteryInfo == null ? null : batteryInfo.chargeType;
        this.f7723a.getClass();
        BatteryInfo a6 = Z2.a(intent);
        this.f7723a.f7766b = a6;
        if (chargeType != a6.chargeType) {
            this.f7723a.f7765a.execute(new X2(this, a6));
        }
    }
}
