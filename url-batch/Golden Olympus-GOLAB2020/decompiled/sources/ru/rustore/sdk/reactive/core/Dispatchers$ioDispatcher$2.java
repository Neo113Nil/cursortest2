package ru.rustore.sdk.reactive.core;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ru.rustore.sdk.reactive.core.Dispatchers$ioDispatcher$2;

@Metadata
/* loaded from: classes3.dex */
final class Dispatchers$ioDispatcher$2 extends s implements Function0<AnonymousClass1> {
    public static final Dispatchers$ioDispatcher$2 INSTANCE = new Dispatchers$ioDispatcher$2();

    @Metadata
    /* renamed from: ru.rustore.sdk.reactive.core.Dispatchers$ioDispatcher$2$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Dispatcher {
        AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void executeDelayed$lambda$1(final Function0 function0) {
            ThreadPoolExecutor threadPool;
            threadPool = Dispatchers.INSTANCE.getThreadPool();
            threadPool.execute(new Runnable() { // from class: ru.rustore.sdk.reactive.core.a
                @Override // java.lang.Runnable
                public final void run() {
                    Function0.this.invoke();
                }
            });
        }

        @Override // ru.rustore.sdk.reactive.core.Dispatcher
        public void execute(final Function0<Unit> block) {
            ThreadPoolExecutor threadPool;
            Intrinsics.checkNotNullParameter(block, "block");
            threadPool = Dispatchers.INSTANCE.getThreadPool();
            threadPool.execute(new Runnable() { // from class: ru.rustore.sdk.reactive.core.b
                @Override // java.lang.Runnable
                public final void run() {
                    Function0.this.invoke();
                }
            });
        }

        @Override // ru.rustore.sdk.reactive.core.Dispatcher
        public Disposable executeDelayed(long j4, TimeUnit timeUnit, final Function0<Unit> block) {
            ScheduledThreadPoolExecutor scheduler;
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            Intrinsics.checkNotNullParameter(block, "block");
            Runnable runnable = new Runnable() { // from class: ru.rustore.sdk.reactive.core.c
                @Override // java.lang.Runnable
                public final void run() {
                    Dispatchers$ioDispatcher$2.AnonymousClass1.executeDelayed$lambda$1(Function0.this);
                }
            };
            scheduler = Dispatchers.INSTANCE.getScheduler();
            final ScheduledFuture<?> schedule = scheduler.schedule(runnable, j4, timeUnit);
            return new Disposable() { // from class: ru.rustore.sdk.reactive.core.Dispatchers$ioDispatcher$2$1$executeDelayed$disposable$1
                private final AtomicBoolean disposed = new AtomicBoolean();

                @Override // ru.rustore.sdk.reactive.core.Disposable
                public void dispose() {
                    if (this.disposed.compareAndSet(false, true)) {
                        schedule.cancel(false);
                    }
                }

                @Override // ru.rustore.sdk.reactive.core.Disposable
                public boolean isDisposed() {
                    return this.disposed.get();
                }
            };
        }
    }

    Dispatchers$ioDispatcher$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass1 invoke() {
        return new AnonymousClass1();
    }
}
