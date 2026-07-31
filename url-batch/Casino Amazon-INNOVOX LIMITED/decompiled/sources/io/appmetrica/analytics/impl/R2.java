package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;

/* loaded from: classes3.dex */
public final class R2 implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S2 f1024a;

    public R2(S2 s2) {
        this.f1024a = s2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        Intent intent = (Intent) obj;
        BatteryInfo batteryInfo = this.f1024a.b;
        ChargeType chargeType = batteryInfo == null ? null : batteryInfo.chargeType;
        this.f1024a.getClass();
        BatteryInfo a2 = S2.a(intent);
        this.f1024a.b = a2;
        if (chargeType != a2.chargeType) {
            this.f1024a.f1036a.execute(new Q2(this, a2));
        }
    }
}
