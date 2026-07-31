package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;

/* renamed from: io.appmetrica.analytics.impl.d3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2561d3 implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2587e3 f38816a;

    public C2561d3(C2587e3 c2587e3) {
        this.f38816a = c2587e3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        Intent intent = (Intent) obj;
        BatteryInfo batteryInfo = this.f38816a.f38902b;
        ChargeType chargeType = batteryInfo == null ? null : batteryInfo.chargeType;
        this.f38816a.getClass();
        BatteryInfo a4 = C2587e3.a(intent);
        this.f38816a.f38902b = a4;
        if (chargeType != a4.chargeType) {
            this.f38816a.f38901a.execute(new C2534c3(this, a4));
        }
    }
}
