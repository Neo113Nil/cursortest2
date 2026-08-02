package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry;
import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientExecutorProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ProcessDetector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;

/* loaded from: classes.dex */
public final class S3 implements O5 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6588a;

    /* renamed from: b, reason: collision with root package name */
    public final R5 f6589b = new R5(new C0742p5());

    /* renamed from: c, reason: collision with root package name */
    public final C0611k4 f6590c = new C0611k4(C0585j4.l().b(getContext()));

    /* renamed from: d, reason: collision with root package name */
    public final C0541hb f6591d = new C0541hb();

    /* renamed from: e, reason: collision with root package name */
    public final C0710o f6592e = C0585j4.l().a();
    public final Q3 f = new Q3();

    /* renamed from: g, reason: collision with root package name */
    public final Xc f6593g = new Xc();

    /* renamed from: h, reason: collision with root package name */
    public final R3 f6594h = new R3();

    public S3(Context context) {
        this.f6588a = context;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ActivityLifecycleRegistry getActivityLifecycleRegistry() {
        return this.f6592e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleClientActivator getClientActivator() {
        return this.f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleClientExecutorProvider getClientExecutorProvider() {
        return this.f6593g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ClientStorageProvider getClientStorageProvider() {
        return this.f6590c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final Context getContext() {
        return this.f6588a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final InternalClientModuleFacade getInternalClientModuleFacade() {
        return this.f6591d;
    }

    @Override // io.appmetrica.analytics.impl.O5, io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final Q5 getModuleAdRevenueContext() {
        return this.f6589b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ProcessDetector getProcessDetector() {
        return this.f6594h;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleAdRevenueContext getModuleAdRevenueContext() {
        return this.f6589b;
    }
}
