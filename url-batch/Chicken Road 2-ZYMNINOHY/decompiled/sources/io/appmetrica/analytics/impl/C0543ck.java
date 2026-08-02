package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycle;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import io.appmetrica.analytics.coreapi.internal.system.ActiveNetworkTypeProvider;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;

/* renamed from: io.appmetrica.analytics.impl.ck, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0543ck implements ServiceContext {

    /* renamed from: a, reason: collision with root package name */
    public final ModuleServiceLifecycleController f11623a;

    /* renamed from: b, reason: collision with root package name */
    public final Sd f11624b = new Sd(getContext());

    /* renamed from: c, reason: collision with root package name */
    public final Zc f11625c = new Zc();

    /* renamed from: d, reason: collision with root package name */
    public final Ck f11626d = new Ck(getContext(), new Bk(new M1()));

    /* renamed from: e, reason: collision with root package name */
    public final C1138zk f11627e = new C1138zk(getContext(), C0817na.k().y(), C0817na.k().B().f(getContext()));

    /* renamed from: f, reason: collision with root package name */
    public final C1101y9 f11628f = new C1101y9();

    /* renamed from: g, reason: collision with root package name */
    public final C0865p6 f11629g = new C0865p6();

    public C0543ck(ModuleServiceLifecycleController moduleServiceLifecycleController) {
        this.f11623a = moduleServiceLifecycleController;
    }

    public final Sd a() {
        return this.f11624b;
    }

    public final Zc b() {
        return this.f11625c;
    }

    public final C1138zk c() {
        return this.f11627e;
    }

    public final Ck d() {
        return this.f11626d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ActivationBarrier getActivationBarrier() {
        return C0817na.f12417I.f12419B.getActivationBarrier();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ActiveNetworkTypeProvider getActiveNetworkTypeProvider() {
        return C0817na.f12417I.f12424G;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ApplicationStateProvider getApplicationStateProvider() {
        return C0817na.f12417I.l().f10276b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ChargeTypeProvider getChargeTypeProvider() {
        R2 r22;
        C0817na c0817na = C0817na.f12417I;
        R2 r23 = c0817na.f12430e;
        if (r23 != null) {
            return r23;
        }
        synchronized (c0817na) {
            try {
                r22 = c0817na.f12430e;
                if (r22 == null) {
                    r22 = new R2(c0817na.f12429d.a(), c0817na.l().f10275a);
                    c0817na.f12430e = r22;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r22;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final Context getContext() {
        return C0817na.f12417I.f12426a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final CryptoProvider getCryptoProvider() {
        return this.f11629g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final DataSendingRestrictionController getDataSendingRestrictionController() {
        return C0817na.f12417I.h();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ExecutorProvider getExecutorProvider() {
        return this.f11628f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final FirstExecutionConditionService getFirstExecutionConditionService() {
        return C0817na.f12417I.f12419B.getFirstExecutionService();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final LocationServiceApi getLocationServiceApi() {
        return C0817na.f12417I.m();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ModuleServiceLifecycleController getModuleServiceLifecycleController() {
        return this.f11623a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceNetworkContext getNetworkContext() {
        return this.f11624b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final PermissionExtractor getPermissionExtractor() {
        return C0817na.f12417I.j();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final PlatformIdentifiers getPlatformIdentifiers() {
        return C0817na.f12417I.s();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final SdkEnvironmentProvider getSdkEnvironmentProvider() {
        return C0817na.f12417I.v();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ModuleSelfReporter getSelfReporter() {
        return this.f11625c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceModuleReporterComponentLifecycle getServiceModuleReporterComponentLifecycle() {
        return C0817na.f12417I.f12423F;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceStorageProvider getServiceStorageProvider() {
        return this.f11627e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceWakeLock getServiceWakeLock() {
        return this.f11626d;
    }
}
