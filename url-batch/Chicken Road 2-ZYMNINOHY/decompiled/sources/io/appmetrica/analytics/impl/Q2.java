package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;

/* loaded from: classes.dex */
public final class Q2 implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R2 f10835a;

    public Q2(R2 r22) {
        this.f10835a = r22;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        Intent intent = (Intent) obj;
        BatteryInfo batteryInfo = this.f10835a.f10865b;
        ChargeType chargeType = batteryInfo == null ? null : batteryInfo.chargeType;
        this.f10835a.getClass();
        BatteryInfo a3 = R2.a(intent);
        this.f10835a.f10865b = a3;
        if (chargeType != a3.chargeType) {
            this.f10835a.f10864a.execute(new P2(this, a3));
        }
    }
}
