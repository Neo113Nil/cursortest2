package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class R2 implements ChargeTypeProvider {

    /* renamed from: d, reason: collision with root package name */
    public static final ChargeType f10863d = ChargeType.UNKNOWN;

    /* renamed from: a, reason: collision with root package name */
    public final ICommonExecutor f10864a;

    /* renamed from: b, reason: collision with root package name */
    public volatile BatteryInfo f10865b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f10866c = new ArrayList();

    public R2(ICommonExecutor iCommonExecutor, O2 o22) {
        Q2 q22 = new Q2(this);
        this.f10864a = iCommonExecutor;
        this.f10865b = a(o22.a(q22));
    }

    public static BatteryInfo a(Intent intent) {
        ChargeType chargeType = f10863d;
        Integer num = null;
        if (intent != null) {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra > 0 && intExtra2 > 0) {
                num = Integer.valueOf((intExtra * 100) / intExtra2);
            }
            int intExtra3 = intent.getIntExtra("plugged", -1);
            chargeType = ChargeType.NONE;
            if (intExtra3 == 1) {
                chargeType = ChargeType.AC;
            } else if (intExtra3 == 2) {
                chargeType = ChargeType.USB;
            } else if (intExtra3 == 4) {
                chargeType = ChargeType.WIRELESS;
            }
        }
        return new BatteryInfo(num, chargeType);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider
    public final Integer getBatteryLevel() {
        BatteryInfo batteryInfo = this.f10865b;
        if (batteryInfo == null) {
            return null;
        }
        return batteryInfo.batteryLevel;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider
    public final ChargeType getChargeType() {
        BatteryInfo batteryInfo = this.f10865b;
        return batteryInfo == null ? ChargeType.UNKNOWN : batteryInfo.chargeType;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider
    public final synchronized void registerChargeTypeListener(ChargeTypeChangeListener chargeTypeChangeListener) {
        this.f10866c.add(chargeTypeChangeListener);
        chargeTypeChangeListener.onChargeTypeChanged(getChargeType());
    }
}
