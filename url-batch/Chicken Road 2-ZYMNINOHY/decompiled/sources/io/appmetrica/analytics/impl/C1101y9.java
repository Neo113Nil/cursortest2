package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.y9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1101y9 implements ExecutorProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C0749kk f13054a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f13055b;

    public C1101y9() {
        C0749kk w4 = C0817na.k().w();
        this.f13054a = w4;
        this.f13055b = w4.b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getDefaultExecutor() {
        return this.f13054a.a();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final InterruptionSafeThread getInterruptionThread(String str, String str2, Runnable runnable) {
        return new InterruptionSafeThread(runnable, (str + '-' + str2) + TokenBuilder.TOKEN_DELIMITER + ThreadFactoryC1131zd.f13101a.incrementAndGet());
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getModuleExecutor() {
        return this.f13055b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final Executor getReportRunnableExecutor() {
        return this.f13054a.d();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getSupportIOExecutor() {
        C0749kk c0749kk = this.f13054a;
        if (c0749kk.f12249f == null) {
            synchronized (c0749kk) {
                try {
                    if (c0749kk.f12249f == null) {
                        c0749kk.f12244a.getClass();
                        HandlerThreadC0534cb a3 = C1127z9.a("IAA-SIO");
                        c0749kk.f12249f = new C1127z9(a3, a3.getLooper(), new Handler(a3.getLooper()));
                    }
                } finally {
                }
            }
        }
        return c0749kk.f12249f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final Executor getUiExecutor() {
        C0749kk c0749kk = this.f13054a;
        if (c0749kk.f12251h == null) {
            synchronized (c0749kk) {
                try {
                    if (c0749kk.f12251h == null) {
                        c0749kk.f12244a.getClass();
                        c0749kk.f12251h = new ExecutorC0697ik(new Handler(Looper.getMainLooper()));
                    }
                } finally {
                }
            }
        }
        return c0749kk.f12251h;
    }
}
