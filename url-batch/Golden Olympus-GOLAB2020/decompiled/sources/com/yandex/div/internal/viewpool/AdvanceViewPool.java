package com.yandex.div.internal.viewpool;

import android.view.View;
import androidx.collection.a;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.util.UtilsKt;
import com.yandex.div.internal.viewpool.optimization.PerformanceDependentSessionProfiler;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class AdvanceViewPool implements ViewPool {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private final ViewPoolProfiler profiler;

    @NotNull
    private final PerformanceDependentSessionProfiler sessionProfiler;

    @NotNull
    private final ViewCreator viewCreator;

    @NotNull
    private final Map<String, Channel<? extends View>> viewFactories;

    @Metadata
    public static final class Channel<T extends View> implements ViewFactory<T> {

        @NotNull
        public static final Companion Companion = new Companion(null);
        private volatile int capacity;
        private final boolean notEmpty;

        @Nullable
        private final ViewPoolProfiler profiler;

        @NotNull
        private AtomicInteger realQueueSize;

        @NotNull
        private final PerformanceDependentSessionProfiler sessionProfiler;

        @NotNull
        private final AtomicBoolean stopped;

        @NotNull
        private final ViewCreator viewCreator;

        @NotNull
        private final ViewFactory<T> viewFactory;

        @NotNull
        private final String viewName;

        @NotNull
        private final BlockingQueue<T> viewQueue;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public Channel(@NotNull String viewName, @Nullable ViewPoolProfiler viewPoolProfiler, @NotNull PerformanceDependentSessionProfiler sessionProfiler, @NotNull ViewFactory<T> viewFactory, @NotNull ViewCreator viewCreator, int i4) {
            Intrinsics.checkNotNullParameter(viewName, "viewName");
            Intrinsics.checkNotNullParameter(sessionProfiler, "sessionProfiler");
            Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
            Intrinsics.checkNotNullParameter(viewCreator, "viewCreator");
            this.viewName = viewName;
            this.profiler = viewPoolProfiler;
            this.sessionProfiler = sessionProfiler;
            this.viewFactory = viewFactory;
            this.viewCreator = viewCreator;
            this.viewQueue = new LinkedBlockingQueue();
            this.realQueueSize = new AtomicInteger(i4);
            this.stopped = new AtomicBoolean(false);
            this.notEmpty = !r2.isEmpty();
            this.capacity = i4;
            for (int i5 = 0; i5 < i4; i5++) {
                this.viewCreator.request$div_release(this, 0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final T extractViewBlocked() {
            try {
                this.viewCreator.promote$div_release(this);
                T poll = this.viewQueue.poll(16L, TimeUnit.MILLISECONDS);
                if (poll == null) {
                    return this.viewFactory.createView();
                }
                this.realQueueSize.decrementAndGet();
                return poll;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return this.viewFactory.createView();
            }
        }

        private final void requestViewCreation() {
            if (this.capacity <= this.realQueueSize.get()) {
                return;
            }
            Companion companion = AdvanceViewPool.Companion;
            long nanoTime = System.nanoTime();
            this.viewCreator.request$div_release(this, this.viewQueue.size());
            this.realQueueSize.incrementAndGet();
            long nanoTime2 = System.nanoTime() - nanoTime;
            ViewPoolProfiler viewPoolProfiler = this.profiler;
            if (viewPoolProfiler != null) {
                viewPoolProfiler.onViewRequested$div_release(nanoTime2);
            }
        }

        public final void createAndEnqueueView() {
            if (this.stopped.get()) {
                return;
            }
            try {
                this.viewQueue.offer(this.viewFactory.createView());
            } catch (Exception unused) {
            }
        }

        @Override // com.yandex.div.internal.viewpool.ViewFactory
        @NotNull
        public T createView() {
            return extractView();
        }

        @NotNull
        public final T extractView() {
            Companion companion = AdvanceViewPool.Companion;
            long nanoTime = System.nanoTime();
            Object poll = this.viewQueue.poll();
            long nanoTime2 = System.nanoTime() - nanoTime;
            if (poll == null) {
                long nanoTime3 = System.nanoTime();
                poll = extractViewBlocked();
                long nanoTime4 = System.nanoTime() - nanoTime3;
                ViewPoolProfiler viewPoolProfiler = this.profiler;
                if (viewPoolProfiler != null) {
                    viewPoolProfiler.onViewObtainedWithBlock$div_release(this.viewName, nanoTime4);
                }
                PerformanceDependentSessionProfiler performanceDependentSessionProfiler = this.sessionProfiler;
                this.viewQueue.size();
                PerformanceDependentSessionProfiler.access$getSession$p(performanceDependentSessionProfiler);
            } else {
                this.realQueueSize.decrementAndGet();
                ViewPoolProfiler viewPoolProfiler2 = this.profiler;
                if (viewPoolProfiler2 != null) {
                    viewPoolProfiler2.onViewObtainedWithoutBlock$div_release(nanoTime2);
                }
                PerformanceDependentSessionProfiler performanceDependentSessionProfiler2 = this.sessionProfiler;
                this.viewQueue.size();
                PerformanceDependentSessionProfiler.access$getSession$p(performanceDependentSessionProfiler2);
            }
            requestViewCreation();
            Intrinsics.checkNotNull(poll);
            return (T) poll;
        }

        public final boolean getNotEmpty() {
            return this.notEmpty;
        }

        @NotNull
        public final String getViewName() {
            return this.viewName;
        }

        public final void setCapacity(int i4) {
            this.capacity = i4;
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AdvanceViewPool(@Nullable ViewPoolProfiler viewPoolProfiler, @NotNull PerformanceDependentSessionProfiler sessionProfiler, @NotNull ViewCreator viewCreator) {
        Intrinsics.checkNotNullParameter(sessionProfiler, "sessionProfiler");
        Intrinsics.checkNotNullParameter(viewCreator, "viewCreator");
        this.profiler = viewPoolProfiler;
        this.sessionProfiler = sessionProfiler;
        this.viewCreator = viewCreator;
        this.viewFactories = new a();
    }

    @Override // com.yandex.div.internal.viewpool.ViewPool
    public void changeCapacity(@NotNull String tag, int i4) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        synchronized (this.viewFactories) {
            Object orThrow = UtilsKt.getOrThrow(this.viewFactories, tag, "Factory is not registered");
            ((Channel) orThrow).setCapacity(i4);
        }
    }

    @Override // com.yandex.div.internal.viewpool.ViewPool
    @NotNull
    public <T extends View> T obtain(@NotNull String tag) {
        Channel channel;
        Intrinsics.checkNotNullParameter(tag, "tag");
        synchronized (this.viewFactories) {
            channel = (Channel) UtilsKt.getOrThrow(this.viewFactories, tag, "Factory is not registered");
        }
        T t4 = (T) channel.createView();
        Intrinsics.checkNotNull(t4, "null cannot be cast to non-null type T of com.yandex.div.internal.viewpool.AdvanceViewPool.obtain");
        return t4;
    }

    @Override // com.yandex.div.internal.viewpool.ViewPool
    public <T extends View> void register(@NotNull String tag, @NotNull ViewFactory<T> factory, int i4) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(factory, "factory");
        synchronized (this.viewFactories) {
            if (this.viewFactories.containsKey(tag)) {
                Assert.fail("Factory is already registered");
            } else {
                this.viewFactories.put(tag, new Channel<>(tag, this.profiler, this.sessionProfiler, factory, this.viewCreator, i4));
                Unit unit = Unit.f41027a;
            }
        }
    }
}
