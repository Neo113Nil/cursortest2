package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext;

/* loaded from: classes.dex */
public final class Zd implements ServiceNetworkContext {

    /* renamed from: a, reason: collision with root package name */
    public final C0664m5 f6941a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6942b = new C0476eo().a();

    /* renamed from: c, reason: collision with root package name */
    public final C0939wl f6943c = new C0939wl();

    public Zd(Context context) {
        this.f6941a = new C0664m5(new C0923w5(context), new C0884ui(C0876ua.k().h()));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final IExecutionPolicy getExecutionPolicy() {
        return this.f6941a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final SimpleNetworkApi getNetworkApi() {
        return this.f6943c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final SslSocketFactoryProvider getSslSocketFactoryProvider() {
        return C0876ua.f8420H.A();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final String getUserAgent() {
        return this.f6942b;
    }
}
