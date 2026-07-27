package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceContext f6410a;

    /* renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f6412c;

    /* renamed from: d, reason: collision with root package name */
    public final p f6413d;

    /* renamed from: e, reason: collision with root package name */
    public volatile IdSyncConfig f6414e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f6415f;

    /* renamed from: b, reason: collision with root package name */
    public final long f6411b = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: g, reason: collision with root package name */
    public final f f6416g = new f(this);

    public h(ServiceContext serviceContext) {
        this.f6410a = serviceContext;
        this.f6412c = serviceContext.getExecutorProvider().getModuleExecutor();
        this.f6413d = new p(serviceContext, new B(serviceContext.getServiceStorageProvider().modulePreferences("id-sync")));
    }

    public static boolean a(IdSyncConfig idSyncConfig) {
        idSyncConfig.getEnabled();
        return idSyncConfig.getEnabled() && !idSyncConfig.getRequests().isEmpty();
    }

    public final synchronized void b(IdSyncConfig idSyncConfig) {
        try {
            if (!kotlin.jvm.internal.i.a(this.f6414e, idSyncConfig)) {
                this.f6414e = idSyncConfig;
                if (a(idSyncConfig) && !this.f6415f) {
                    this.f6410a.getActivationBarrier().subscribe(idSyncConfig.getLaunchDelay(), this.f6412c, new g(this));
                    this.f6415f = true;
                } else if (!a(idSyncConfig) && this.f6415f) {
                    this.f6415f = false;
                    IHandlerExecutor iHandlerExecutor = this.f6412c;
                    f fVar = this.f6416g;
                    if (fVar == null) {
                        kotlin.jvm.internal.i.l("syncRunnable");
                        throw null;
                    }
                    iHandlerExecutor.remove(fVar);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
