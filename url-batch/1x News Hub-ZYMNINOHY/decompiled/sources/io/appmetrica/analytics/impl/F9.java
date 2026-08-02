package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class F9 implements ExecutorProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C0731ok f5989a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f5990b;

    public F9() {
        C0731ok x3 = C0876ua.k().x();
        this.f5989a = x3;
        this.f5990b = x3.c();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getDefaultExecutor() {
        return this.f5989a.a();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final InterruptionSafeThread getInterruptionThread(String str, String str2, Runnable runnable) {
        return new InterruptionSafeThread(runnable, (str + '-' + str2) + TokenBuilder.TOKEN_DELIMITER + Gd.f6039a.incrementAndGet());
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getModuleExecutor() {
        return this.f5990b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final Executor getReportRunnableExecutor() {
        return this.f5989a.e();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getSupportIOExecutor() {
        C0731ok c0731ok = this.f5989a;
        if (c0731ok.f == null) {
            synchronized (c0731ok) {
                try {
                    if (c0731ok.f == null) {
                        c0731ok.f8027a.getClass();
                        HandlerThreadC0592jb a3 = G9.a("IAA-SIO");
                        c0731ok.f = new G9(a3, a3.getLooper(), new Handler(a3.getLooper()));
                    }
                } finally {
                }
            }
        }
        return c0731ok.f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final Executor getUiExecutor() {
        C0731ok c0731ok = this.f5989a;
        if (c0731ok.f8033h == null) {
            synchronized (c0731ok) {
                try {
                    if (c0731ok.f8033h == null) {
                        c0731ok.f8027a.getClass();
                        c0731ok.f8033h = new ExecutorC0679mk(new Handler(Looper.getMainLooper()));
                    }
                } finally {
                }
            }
        }
        return c0731ok.f8033h;
    }
}
