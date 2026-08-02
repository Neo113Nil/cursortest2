package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;

/* renamed from: io.appmetrica.analytics.impl.hd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0543hd implements ModuleServiceLifecycleController {

    /* renamed from: a, reason: collision with root package name */
    public final T1 f7442a;

    public C0543hd(T1 t12) {
        this.f7442a = t12;
    }

    public static final void a(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onFirstClientConnected();
    }

    public static final void b(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onAllClientsDisconnected();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController
    public final void registerObserver(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver) {
        this.f7442a.b(new Uo(0, moduleServiceLifecycleObserver));
        this.f7442a.a(new Uo(1, moduleServiceLifecycleObserver));
    }
}
