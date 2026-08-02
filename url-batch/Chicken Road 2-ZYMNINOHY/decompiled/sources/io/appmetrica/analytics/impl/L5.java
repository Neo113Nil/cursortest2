package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes.dex */
public final class L5 extends BaseRequestConfig.DataSource {

    /* renamed from: a, reason: collision with root package name */
    public final C0622fm f10564a;

    /* renamed from: b, reason: collision with root package name */
    public final SdkEnvironmentProvider f10565b;

    public L5(C0622fm c0622fm, SdkEnvironmentProvider sdkEnvironmentProvider, PlatformIdentifiers platformIdentifiers, Object obj) {
        super(new SdkIdentifiers(c0622fm.c(), c0622fm.a(), c0622fm.b()), sdkEnvironmentProvider, platformIdentifiers, obj);
        this.f10564a = c0622fm;
        this.f10565b = sdkEnvironmentProvider;
    }
}
