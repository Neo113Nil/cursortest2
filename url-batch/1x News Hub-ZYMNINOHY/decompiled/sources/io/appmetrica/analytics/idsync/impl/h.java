package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceContext f5642a;

    /* renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f5644c;

    /* renamed from: d, reason: collision with root package name */
    public final p f5645d;

    /* renamed from: e, reason: collision with root package name */
    public volatile IdSyncConfig f5646e;
    public volatile boolean f;

    /* renamed from: b, reason: collision with root package name */
    public final long f5643b = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: g, reason: collision with root package name */
    public final f f5647g = new f(this);

    public h(ServiceContext serviceContext) {
        this.f5642a = serviceContext;
        this.f5644c = serviceContext.getExecutorProvider().getModuleExecutor();
        this.f5645d = new p(serviceContext, new B(serviceContext.getServiceStorageProvider().modulePreferences("id-sync")));
    }

    public static boolean a(IdSyncConfig idSyncConfig) {
        idSyncConfig.getEnabled();
        return idSyncConfig.getEnabled() && !idSyncConfig.getRequests().isEmpty();
    }

    public final synchronized void b(IdSyncConfig idSyncConfig) {
        try {
            if (!kotlin.jvm.internal.j.a(this.f5646e, idSyncConfig)) {
                this.f5646e = idSyncConfig;
                if (a(idSyncConfig) && !this.f) {
                    this.f5642a.getActivationBarrier().subscribe(idSyncConfig.getLaunchDelay(), this.f5644c, new g(this));
                    this.f = true;
                } else if (!a(idSyncConfig) && this.f) {
                    this.f = false;
                    IHandlerExecutor iHandlerExecutor = this.f5644c;
                    f fVar = this.f5647g;
                    if (fVar == null) {
                        kotlin.jvm.internal.j.g("syncRunnable");
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
