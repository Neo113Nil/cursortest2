package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes.dex */
public final class S5 extends BaseRequestConfig.DataSource {

    /* renamed from: a, reason: collision with root package name */
    public final C0603jm f6596a;

    /* renamed from: b, reason: collision with root package name */
    public final SdkEnvironmentProvider f6597b;

    public S5(C0603jm c0603jm, SdkEnvironmentProvider sdkEnvironmentProvider, PlatformIdentifiers platformIdentifiers, Object obj) {
        super(new SdkIdentifiers(c0603jm.c(), c0603jm.a(), c0603jm.b()), sdkEnvironmentProvider, platformIdentifiers, obj);
        this.f6596a = c0603jm;
        this.f6597b = sdkEnvironmentProvider;
    }
}
