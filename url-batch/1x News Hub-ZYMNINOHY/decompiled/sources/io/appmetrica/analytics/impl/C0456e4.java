package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig;

/* renamed from: io.appmetrica.analytics.impl.e4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0456e4 implements ModuleServiceConfig {

    /* renamed from: a, reason: collision with root package name */
    public final SdkIdentifiers f7223a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7224b;

    public C0456e4(SdkIdentifiers sdkIdentifiers, Object obj) {
        this.f7223a = sdkIdentifiers;
        this.f7224b = obj;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig
    public final Object getFeaturesConfig() {
        return this.f7224b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig
    public final SdkIdentifiers getIdentifiers() {
        return this.f7223a;
    }
}
