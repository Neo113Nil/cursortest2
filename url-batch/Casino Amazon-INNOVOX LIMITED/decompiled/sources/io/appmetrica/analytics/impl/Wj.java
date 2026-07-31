package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* loaded from: classes3.dex */
public final class Wj extends Y4 {
    public Wj(Context context, C0209gm c0209gm, R4 r4, C0420p4 c0420p4, InterfaceC0255ih interfaceC0255ih, W4 w4, Q4 q4) {
        this(context, r4, new C0290k0(), new TimePassedChecker(), new C0115d5(context, r4, c0420p4, w4, c0209gm, interfaceC0255ih, C0401oa.k().w().c(), PackageManagerUtils.getAppVersionCodeInt(context), C0401oa.k().l(), q4), c0420p4);
    }

    @Override // io.appmetrica.analytics.impl.Y4, io.appmetrica.analytics.impl.Fa
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.SELF_SDK;
    }

    public Wj(Context context, R4 r4, C0290k0 c0290k0, TimePassedChecker timePassedChecker, C0115d5 c0115d5, C0420p4 c0420p4) {
        super(context, r4, c0290k0, timePassedChecker, c0115d5, c0420p4);
    }
}
