package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry;
import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientExecutorProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ProcessDetector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.g4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2642g4 implements InterfaceC2564d6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39032a;

    /* renamed from: b, reason: collision with root package name */
    public final C2644g6 f39033b = new C2644g6(new D5());

    /* renamed from: c, reason: collision with root package name */
    public final C3108y4 f39034c = new C3108y4(C3082x4.l().b(getContext()));

    /* renamed from: d, reason: collision with root package name */
    public final C3037vb f39035d = new C3037vb();

    /* renamed from: e, reason: collision with root package name */
    public final C2818n f39036e = C3082x4.l().a();

    /* renamed from: f, reason: collision with root package name */
    public final C2588e4 f39037f = new C2588e4();

    /* renamed from: g, reason: collision with root package name */
    public final C2780ld f39038g = new C2780ld();

    /* renamed from: h, reason: collision with root package name */
    public final C2615f4 f39039h = new C2615f4();

    public C2642g4(@NotNull Context context) {
        this.f39032a = context;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ActivityLifecycleRegistry getActivityLifecycleRegistry() {
        return this.f39036e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ModuleClientActivator getClientActivator() {
        return this.f39037f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ModuleClientExecutorProvider getClientExecutorProvider() {
        return this.f39038g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ClientStorageProvider getClientStorageProvider() {
        return this.f39034c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final Context getContext() {
        return this.f39032a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final InternalClientModuleFacade getInternalClientModuleFacade() {
        return this.f39035d;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2564d6, io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final InterfaceC2617f6 getModuleAdRevenueContext() {
        return this.f39033b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ProcessDetector getProcessDetector() {
        return this.f39039h;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleAdRevenueContext getModuleAdRevenueContext() {
        return this.f39033b;
    }
}
