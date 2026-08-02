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
public final class K3 implements H5 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10508a;

    /* renamed from: b, reason: collision with root package name */
    public final K5 f10509b = new K5(new C0683i5());

    /* renamed from: c, reason: collision with root package name */
    public final C0553d4 f10510c = new C0553d4(C0501b4.l().b(getContext()));

    /* renamed from: d, reason: collision with root package name */
    public final C0482ab f10511d = new C0482ab();

    /* renamed from: e, reason: collision with root package name */
    public final C0832o f10512e = C0501b4.l().a();

    /* renamed from: f, reason: collision with root package name */
    public final I3 f10513f = new I3();

    /* renamed from: g, reason: collision with root package name */
    public final Qc f10514g = new Qc();

    /* renamed from: h, reason: collision with root package name */
    public final J3 f10515h = new J3();

    public K3(Context context) {
        this.f10508a = context;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ActivityLifecycleRegistry getActivityLifecycleRegistry() {
        return this.f10512e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleClientActivator getClientActivator() {
        return this.f10513f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleClientExecutorProvider getClientExecutorProvider() {
        return this.f10514g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ClientStorageProvider getClientStorageProvider() {
        return this.f10510c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final Context getContext() {
        return this.f10508a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final InternalClientModuleFacade getInternalClientModuleFacade() {
        return this.f10511d;
    }

    @Override // io.appmetrica.analytics.impl.H5, io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final J5 getModuleAdRevenueContext() {
        return this.f10509b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ProcessDetector getProcessDetector() {
        return this.f10515h;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleAdRevenueContext getModuleAdRevenueContext() {
        return this.f10509b;
    }
}
