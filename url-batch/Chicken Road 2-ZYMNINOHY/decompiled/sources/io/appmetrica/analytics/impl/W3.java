package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig;

/* loaded from: classes.dex */
public final class W3 implements ModuleServiceConfig {

    /* renamed from: a, reason: collision with root package name */
    public final SdkIdentifiers f11159a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11160b;

    public W3(SdkIdentifiers sdkIdentifiers, Object obj) {
        this.f11159a = sdkIdentifiers;
        this.f11160b = obj;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig
    public final Object getFeaturesConfig() {
        return this.f11160b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig
    public final SdkIdentifiers getIdentifiers() {
        return this.f11159a;
    }
}
