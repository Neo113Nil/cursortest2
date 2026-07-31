package ru.rustore.sdk.metrics.internal;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.metrics.internal.y0;
import ru.rustore.sdk.reactive.core.Dispatcher;
import ru.rustore.sdk.reactive.core.Disposable;

/* loaded from: classes3.dex */
public final class y0 implements Dispatcher {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f43784a = new ScheduledThreadPoolExecutor(1);

    public static final class a implements Disposable {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f43785a = new AtomicBoolean();

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ScheduledFuture<?> f43786b;

        public a(ScheduledFuture<?> scheduledFuture) {
            this.f43786b = scheduledFuture;
        }

        @Override // ru.rustore.sdk.reactive.core.Disposable
        public final void dispose() {
            if (this.f43785a.compareAndSet(false, true)) {
                this.f43786b.cancel(false);
            }
        }

        @Override // ru.rustore.sdk.reactive.core.Disposable
        public final boolean isDisposed() {
            return this.f43785a.get();
        }
    }

    public static final void a(Function0 function0) {
        function0.invoke();
    }

    public static final void b(Function0 function0) {
        function0.invoke();
    }

    @Override // ru.rustore.sdk.reactive.core.Dispatcher
    public final void execute(final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f43784a.submit(new Runnable() { // from class: B3.c
            @Override // java.lang.Runnable
            public final void run() {
                y0.a(Function0.this);
            }
        });
    }

    @Override // ru.rustore.sdk.reactive.core.Dispatcher
    public final Disposable executeDelayed(long j4, TimeUnit timeUnit, final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(block, "block");
        return new a(this.f43784a.schedule(new Runnable() { // from class: B3.b
            @Override // java.lang.Runnable
            public final void run() {
                y0.b(Function0.this);
            }
        }, j4, timeUnit));
    }
}
