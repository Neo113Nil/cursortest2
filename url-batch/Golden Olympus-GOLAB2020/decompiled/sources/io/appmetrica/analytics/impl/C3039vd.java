package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.vd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3039vd implements ModuleServiceLifecycleController {

    /* renamed from: a, reason: collision with root package name */
    public final Q1 f39975a;

    public C3039vd(@NotNull Q1 q12) {
        this.f39975a = q12;
    }

    public static final void a(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onFirstClientConnected();
    }

    public static final void b(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onAllClientsDisconnected();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController
    public final void registerObserver(@NotNull final ModuleServiceLifecycleObserver moduleServiceLifecycleObserver) {
        this.f39975a.b(new P1() { // from class: io.appmetrica.analytics.impl.Dp
            @Override // io.appmetrica.analytics.impl.P1
            public final void a(Intent intent) {
                C3039vd.a(ModuleServiceLifecycleObserver.this, intent);
            }
        });
        this.f39975a.a(new P1() { // from class: io.appmetrica.analytics.impl.Ep
            @Override // io.appmetrica.analytics.impl.P1
            public final void a(Intent intent) {
                C3039vd.b(ModuleServiceLifecycleObserver.this, intent);
            }
        });
    }
}
