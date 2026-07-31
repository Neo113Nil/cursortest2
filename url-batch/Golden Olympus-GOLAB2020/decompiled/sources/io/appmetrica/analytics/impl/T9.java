package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class T9 implements ExecutorProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C2942rk f38299a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f38300b;

    public T9() {
        C2942rk w4 = Ia.j().w();
        this.f38299a = w4;
        this.f38300b = w4.c();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final IHandlerExecutor getDefaultExecutor() {
        return this.f38299a.a();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final InterruptionSafeThread getInterruptionThread(@NotNull String str, @NotNull String str2, @NotNull Runnable runnable) {
        return new InterruptionSafeThread(runnable, (str + '-' + str2) + "-" + Od.f38077a.incrementAndGet());
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final IHandlerExecutor getModuleExecutor() {
        return this.f38300b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final IHandlerExecutor getSupportIOExecutor() {
        C2942rk c2942rk = this.f38299a;
        if (c2942rk.f39749f == null) {
            synchronized (c2942rk) {
                try {
                    if (c2942rk.f39749f == null) {
                        c2942rk.f39744a.getClass();
                        HandlerThreadC3089xb a4 = U9.a("IAA-SIO");
                        c2942rk.f39749f = new U9(a4, a4.getLooper(), new Handler(a4.getLooper()));
                    }
                } finally {
                }
            }
        }
        return c2942rk.f39749f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final Executor getUiExecutor() {
        return this.f38299a.f();
    }
}
