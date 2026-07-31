package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.h6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2670h6 extends BaseRequestConfig.DataSource {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final C2633fm f39126a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final SdkEnvironmentProvider f39127b;

    public C2670h6(@NonNull C2633fm c2633fm, @NonNull SdkEnvironmentProvider sdkEnvironmentProvider, @NonNull PlatformIdentifiers platformIdentifiers, Object obj) {
        super(new SdkIdentifiers(c2633fm.e(), c2633fm.a(), c2633fm.b()), sdkEnvironmentProvider, platformIdentifiers, obj);
        this.f39126a = c2633fm;
        this.f39127b = sdkEnvironmentProvider;
    }
}
