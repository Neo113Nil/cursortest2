package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* loaded from: classes.dex */
public final class Vj extends X4 {
    public Vj(Context context, C0622fm c0622fm, Q4 q4, C0837o4 c0837o4, InterfaceC0669hh interfaceC0669hh, V4 v4, P4 p4) {
        this(context, q4, new C0729k0(), new TimePassedChecker(), new C0528c5(context, q4, c0837o4, v4, c0622fm, interfaceC0669hh, C0817na.k().w().c(), PackageManagerUtils.getAppVersionCodeInt(context), C0817na.k().l(), p4), c0837o4);
    }

    @Override // io.appmetrica.analytics.impl.X4, io.appmetrica.analytics.impl.Ea
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.SELF_SDK;
    }

    public Vj(Context context, Q4 q4, C0729k0 c0729k0, TimePassedChecker timePassedChecker, C0528c5 c0528c5, C0837o4 c0837o4) {
        super(context, q4, c0729k0, timePassedChecker, c0528c5, c0837o4);
    }
}
