package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceContext f9915a;

    /* renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f9917c;

    /* renamed from: d, reason: collision with root package name */
    public final n f9918d;

    /* renamed from: e, reason: collision with root package name */
    public volatile IdSyncConfig f9919e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f9920f;

    /* renamed from: b, reason: collision with root package name */
    public final long f9916b = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: g, reason: collision with root package name */
    public final C0468f f9921g = new C0468f(this);

    public h(ServiceContext serviceContext, SdkIdentifiers sdkIdentifiers) {
        this.f9915a = serviceContext;
        this.f9917c = serviceContext.getExecutorProvider().getModuleExecutor();
        this.f9918d = new n(serviceContext, new G(serviceContext.getServiceStorageProvider().modulePreferences("id-sync")), sdkIdentifiers);
    }

    public final synchronized void a(IdSyncConfig idSyncConfig, SdkIdentifiers sdkIdentifiers) {
        try {
            this.f9918d.f9947c = sdkIdentifiers;
            if (!kotlin.jvm.internal.i.a(this.f9919e, idSyncConfig)) {
                this.f9919e = idSyncConfig;
                if (a(idSyncConfig) && !this.f9920f) {
                    this.f9915a.getActivationBarrier().subscribe(idSyncConfig.getLaunchDelay(), this.f9917c, new C0469g(this));
                    this.f9920f = true;
                } else if (!a(idSyncConfig) && this.f9920f) {
                    this.f9920f = false;
                    IHandlerExecutor iHandlerExecutor = this.f9917c;
                    C0468f c0468f = this.f9921g;
                    if (c0468f == null) {
                        kotlin.jvm.internal.i.i("syncRunnable");
                        throw null;
                    }
                    iHandlerExecutor.remove(c0468f);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean a(IdSyncConfig idSyncConfig) {
        idSyncConfig.getEnabled();
        return idSyncConfig.getEnabled() && !idSyncConfig.getRequests().isEmpty();
    }
}
