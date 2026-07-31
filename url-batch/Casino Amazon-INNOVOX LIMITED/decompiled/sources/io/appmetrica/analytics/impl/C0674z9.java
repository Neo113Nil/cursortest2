package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.z9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0674z9 implements ExecutorProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C0336lk f1596a;
    public final IHandlerExecutor b;

    public C0674z9() {
        C0336lk w = C0401oa.k().w();
        this.f1596a = w;
        this.b = w.b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getDefaultExecutor() {
        return this.f1596a.a();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final InterruptionSafeThread getInterruptionThread(String str, String str2, Runnable runnable) {
        return new InterruptionSafeThread(runnable, (str + '-' + str2) + TokenBuilder.TOKEN_DELIMITER + Ad.f761a.incrementAndGet());
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getModuleExecutor() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final Executor getReportRunnableExecutor() {
        return this.f1596a.d();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getSupportIOExecutor() {
        C0336lk c0336lk = this.f1596a;
        if (c0336lk.f == null) {
            synchronized (c0336lk) {
                if (c0336lk.f == null) {
                    c0336lk.f1362a.getClass();
                    HandlerThreadC0121db a2 = A9.a("IAA-SIO");
                    c0336lk.f = new A9(a2, a2.getLooper(), new Handler(a2.getLooper()));
                }
            }
        }
        return c0336lk.f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final Executor getUiExecutor() {
        C0336lk c0336lk = this.f1596a;
        if (c0336lk.h == null) {
            synchronized (c0336lk) {
                if (c0336lk.h == null) {
                    c0336lk.f1362a.getClass();
                    c0336lk.h = new ExecutorC0284jk(new Handler(Looper.getMainLooper()));
                }
            }
        }
        return c0336lk.h;
    }
}
