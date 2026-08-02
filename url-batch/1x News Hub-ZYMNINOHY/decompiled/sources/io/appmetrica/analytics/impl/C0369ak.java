package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.ak, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0369ak extends C0457e5 {
    public C0369ak(Context context, C0603jm c0603jm, X4 x4, C0896v4 c0896v4, InterfaceC0676mh interfaceC0676mh, AbstractC0406c5 abstractC0406c5, W4 w4) {
        this(context, x4, new C0607k0(), new TimePassedChecker(), new C0586j5(context, x4, c0896v4, abstractC0406c5, c0603jm, interfaceC0676mh, C0876ua.k().x().d(), PackageManagerUtils.getAppVersionCodeInt(context), C0876ua.k().l(), w4), c0896v4);
    }

    @Override // io.appmetrica.analytics.impl.C0457e5, io.appmetrica.analytics.impl.La
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.SELF_SDK;
    }

    public C0369ak(Context context, X4 x4, C0607k0 c0607k0, TimePassedChecker timePassedChecker, C0586j5 c0586j5, C0896v4 c0896v4) {
        super(context, x4, c0607k0, timePassedChecker, c0586j5, c0896v4);
    }
}
