package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext;

/* loaded from: classes.dex */
public final class Zd implements ServiceNetworkContext {

    /* renamed from: a, reason: collision with root package name */
    public final C0815m5 f7781a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7782b = new C0627eo().a();

    /* renamed from: c, reason: collision with root package name */
    public final C1090wl f7783c = new C1090wl();

    public Zd(Context context) {
        this.f7781a = new C0815m5(new C1074w5(context), new C1035ui(C1027ua.k().h()));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final IExecutionPolicy getExecutionPolicy() {
        return this.f7781a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final SimpleNetworkApi getNetworkApi() {
        return this.f7783c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final SslSocketFactoryProvider getSslSocketFactoryProvider() {
        return C1027ua.f9366H.A();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final String getUserAgent() {
        return this.f7782b;
    }
}
