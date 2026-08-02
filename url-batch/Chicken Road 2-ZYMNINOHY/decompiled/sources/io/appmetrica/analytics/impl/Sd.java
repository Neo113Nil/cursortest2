package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext;

/* loaded from: classes.dex */
public final class Sd implements ServiceNetworkContext {

    /* renamed from: a, reason: collision with root package name */
    public final C0605f5 f10943a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10944b = new C0547co().a();

    /* renamed from: c, reason: collision with root package name */
    public final C0957sl f10945c = new C0957sl();

    public Sd(Context context) {
        this.f10943a = new C0605f5(new C0864p5(context), new C0877pi(C0817na.k().h()));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final IExecutionPolicy getExecutionPolicy() {
        return this.f10943a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final SimpleNetworkApi getNetworkApi() {
        return this.f10945c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final SslSocketFactoryProvider getSslSocketFactoryProvider() {
        return C0817na.f12417I.z();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final String getUserAgent() {
        return this.f10944b;
    }
}
