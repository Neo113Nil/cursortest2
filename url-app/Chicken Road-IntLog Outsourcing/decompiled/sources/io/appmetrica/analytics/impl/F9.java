package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class F9 implements ExecutorProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C0882ok f6780a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f6781b;

    public F9() {
        C0882ok x5 = C1027ua.k().x();
        this.f6780a = x5;
        this.f6781b = x5.c();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getDefaultExecutor() {
        return this.f6780a.a();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final InterruptionSafeThread getInterruptionThread(String str, String str2, Runnable runnable) {
        return new InterruptionSafeThread(runnable, (str + '-' + str2) + "-" + Gd.f6832a.incrementAndGet());
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getModuleExecutor() {
        return this.f6781b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final Executor getReportRunnableExecutor() {
        return this.f6780a.e();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getSupportIOExecutor() {
        C0882ok c0882ok = this.f6780a;
        if (c0882ok.f8954f == null) {
            synchronized (c0882ok) {
                try {
                    if (c0882ok.f8954f == null) {
                        c0882ok.f8949a.getClass();
                        HandlerThreadC0743jb a6 = G9.a("IAA-SIO");
                        c0882ok.f8954f = new G9(a6, a6.getLooper(), new Handler(a6.getLooper()));
                    }
                } finally {
                }
            }
        }
        return c0882ok.f8954f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final Executor getUiExecutor() {
        C0882ok c0882ok = this.f6780a;
        if (c0882ok.f8956h == null) {
            synchronized (c0882ok) {
                try {
                    if (c0882ok.f8956h == null) {
                        c0882ok.f8949a.getClass();
                        c0882ok.f8956h = new ExecutorC0830mk(new Handler(Looper.getMainLooper()));
                    }
                } finally {
                }
            }
        }
        return c0882ok.f8956h;
    }
}
