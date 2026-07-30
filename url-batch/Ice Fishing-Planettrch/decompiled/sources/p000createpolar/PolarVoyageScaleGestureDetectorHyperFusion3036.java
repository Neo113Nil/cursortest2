package p000createpolar;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageScaleGestureDetectorHyperFusion3036 implements ScheduledExecutorService, AutoCloseable {
    public final ExecutorService PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final ScheduledExecutorService PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageScaleGestureDetectorHyperFusion3036(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = executorService;
        this.PolarVoyageStrictModeLegendEpic1532 = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        if (this == ForkJoinPool.commonPool() || isTerminated()) {
            return;
        }
        shutdown();
        throw null;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return new PolarVoyageLifecycleCameraControllerAlphaQuantumRogue3425(new PolarVoyageTypefaceHeroGammaBlaze6657(this, runnable, j, timeUnit, 0));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return new PolarVoyageLifecycleCameraControllerAlphaQuantumRogue3425(new PolarVoyageZoomStateCyberVortexEpic8930(this, runnable, j, j2, timeUnit, 0));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return new PolarVoyageLifecycleCameraControllerAlphaQuantumRogue3425(new PolarVoyageZoomStateCyberVortexEpic8930(this, runnable, j, j2, timeUnit, 1));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.submit(runnable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return new PolarVoyageLifecycleCameraControllerAlphaQuantumRogue3425(new PolarVoyageTypefaceHeroGammaBlaze6657(this, callable, j, timeUnit, 1));
    }
}
