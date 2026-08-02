package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;

/* loaded from: classes.dex */
public final class Y2 implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z2 f6885a;

    public Y2(Z2 z2) {
        this.f6885a = z2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        Intent intent = (Intent) obj;
        BatteryInfo batteryInfo = this.f6885a.f6926b;
        ChargeType chargeType = batteryInfo == null ? null : batteryInfo.chargeType;
        this.f6885a.getClass();
        BatteryInfo a3 = Z2.a(intent);
        this.f6885a.f6926b = a3;
        if (chargeType != a3.chargeType) {
            this.f6885a.f6925a.execute(new X2(this, a3));
        }
    }
}
