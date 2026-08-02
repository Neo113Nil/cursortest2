package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;

/* renamed from: io.appmetrica.analytics.impl.ad, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0484ad implements ModuleServiceLifecycleController {

    /* renamed from: a, reason: collision with root package name */
    public final J1 f11436a;

    public C0484ad(J1 j12) {
        this.f11436a = j12;
    }

    public static final void a(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onFirstClientConnected();
    }

    public static final void b(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onAllClientsDisconnected();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController
    public final void registerObserver(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver) {
        this.f11436a.b(new Vo(0, moduleServiceLifecycleObserver));
        this.f11436a.a(new Vo(1, moduleServiceLifecycleObserver));
    }
}
