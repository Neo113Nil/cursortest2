package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.ak, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0520ak extends C0608e5 {
    public C0520ak(Context context, C0754jm c0754jm, X4 x42, C1047v4 c1047v4, InterfaceC0827mh interfaceC0827mh, AbstractC0557c5 abstractC0557c5, W4 w42) {
        this(context, x42, new C0758k0(), new TimePassedChecker(), new C0737j5(context, x42, c1047v4, abstractC0557c5, c0754jm, interfaceC0827mh, C1027ua.k().x().d(), PackageManagerUtils.getAppVersionCodeInt(context), C1027ua.k().l(), w42), c1047v4);
    }

    @Override // io.appmetrica.analytics.impl.C0608e5, io.appmetrica.analytics.impl.La
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.SELF_SDK;
    }

    public C0520ak(Context context, X4 x42, C0758k0 c0758k0, TimePassedChecker timePassedChecker, C0737j5 c0737j5, C1047v4 c1047v4) {
        super(context, x42, c0758k0, timePassedChecker, c0737j5, c1047v4);
    }
}
