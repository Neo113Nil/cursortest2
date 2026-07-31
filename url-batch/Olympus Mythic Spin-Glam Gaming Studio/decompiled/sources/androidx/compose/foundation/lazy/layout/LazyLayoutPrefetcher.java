package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LazyLayoutPrefetcher.android.kt */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 02\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u000201B%\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000fH\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000fH\u0016J \u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000fH\u0002J\b\u0010$\u001a\u00020\u001eH\u0016J\b\u0010%\u001a\u00020\u001eH\u0016J\b\u0010&\u001a\u00020\u001eH\u0016J\b\u0010'\u001a\u00020\u001eH\u0016J%\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;", "Landroidx/compose/runtime/RememberObserver;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$Prefetcher;", "Ljava/lang/Runnable;", "Landroid/view/Choreographer$FrameCallback;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "subcomposeLayoutState", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "itemContentFactory", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "view", "Landroid/view/View;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroid/view/View;)V", "averagePrecomposeTimeNs", "", "averagePremeasureTimeNs", "choreographer", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "isActive", "", "prefetchRequests", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$PrefetchRequest;", "prefetchScheduled", "calculateAverageTime", "new", "current", "doFrame", "", "frameTimeNanos", "enoughTimeLeft", "now", "nextFrame", "average", "onAbandoned", "onForgotten", "onRemembered", "run", "schedulePrefetch", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "index", "", "constraints", "Landroidx/compose/ui/unit/Constraints;", "schedulePrefetch-0kLqBqw", "(IJ)Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "Companion", "PrefetchRequest", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LazyLayoutPrefetcher implements RememberObserver, LazyLayoutPrefetchState.Prefetcher, Runnable, Choreographer.FrameCallback {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static long frameIntervalNs;
    private long averagePrecomposeTimeNs;
    private long averagePremeasureTimeNs;
    private final Choreographer choreographer;
    private boolean isActive;
    private final LazyLayoutItemContentFactory itemContentFactory;
    private final MutableVector prefetchRequests;
    private boolean prefetchScheduled;
    private final LazyLayoutPrefetchState prefetchState;
    private final SubcomposeLayoutState subcomposeLayoutState;
    private final View view;

    private final boolean enoughTimeLeft(long now, long nextFrame, long average) {
        return now > nextFrame || now + average < nextFrame;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }

    public LazyLayoutPrefetcher(LazyLayoutPrefetchState prefetchState, SubcomposeLayoutState subcomposeLayoutState, LazyLayoutItemContentFactory itemContentFactory, View view) {
        Intrinsics.checkNotNullParameter(prefetchState, "prefetchState");
        Intrinsics.checkNotNullParameter(subcomposeLayoutState, "subcomposeLayoutState");
        Intrinsics.checkNotNullParameter(itemContentFactory, "itemContentFactory");
        Intrinsics.checkNotNullParameter(view, "view");
        this.prefetchState = prefetchState;
        this.subcomposeLayoutState = subcomposeLayoutState;
        this.itemContentFactory = itemContentFactory;
        this.view = view;
        this.prefetchRequests = new MutableVector(new PrefetchRequest[16], 0);
        this.choreographer = Choreographer.getInstance();
        INSTANCE.calculateFrameIntervalIfNeeded(view);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prefetchRequests.isEmpty() || !this.prefetchScheduled || !this.isActive || this.view.getWindowVisibility() != 0) {
            this.prefetchScheduled = false;
            return;
        }
        long nanos = TimeUnit.MILLISECONDS.toNanos(this.view.getDrawingTime()) + frameIntervalNs;
        boolean z = false;
        while (this.prefetchRequests.isNotEmpty() && !z) {
            PrefetchRequest prefetchRequest = (PrefetchRequest) this.prefetchRequests.getContent()[0];
            LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) this.itemContentFactory.getItemProvider().mo4828invoke();
            if (!prefetchRequest.getCanceled()) {
                int itemCount = lazyLayoutItemProvider.getItemCount();
                int index = prefetchRequest.getIndex();
                if (index >= 0 && index < itemCount) {
                    if (prefetchRequest.getPrecomposeHandle() == null) {
                        Trace.beginSection("compose:lazylist:prefetch:compose");
                        try {
                            long nanoTime = System.nanoTime();
                            if (enoughTimeLeft(nanoTime, nanos, this.averagePrecomposeTimeNs)) {
                                Object key = lazyLayoutItemProvider.getKey(prefetchRequest.getIndex());
                                prefetchRequest.setPrecomposeHandle(this.subcomposeLayoutState.precompose(key, this.itemContentFactory.getContent(prefetchRequest.getIndex(), key)));
                                this.averagePrecomposeTimeNs = calculateAverageTime(System.nanoTime() - nanoTime, this.averagePrecomposeTimeNs);
                            } else {
                                z = true;
                            }
                            Unit unit = Unit.INSTANCE;
                            Trace.endSection();
                        } finally {
                        }
                    } else if (!prefetchRequest.getMeasured()) {
                        Trace.beginSection("compose:lazylist:prefetch:measure");
                        try {
                            long nanoTime2 = System.nanoTime();
                            if (enoughTimeLeft(nanoTime2, nanos, this.averagePremeasureTimeNs)) {
                                SubcomposeLayoutState.PrecomposedSlotHandle precomposeHandle = prefetchRequest.getPrecomposeHandle();
                                Intrinsics.checkNotNull(precomposeHandle);
                                int placeablesCount = precomposeHandle.getPlaceablesCount();
                                for (int i = 0; i < placeablesCount; i++) {
                                    precomposeHandle.mo1952premeasure0kLqBqw(i, prefetchRequest.getConstraints());
                                }
                                this.averagePremeasureTimeNs = calculateAverageTime(System.nanoTime() - nanoTime2, this.averagePremeasureTimeNs);
                                this.prefetchRequests.removeAt(0);
                            } else {
                                Unit unit2 = Unit.INSTANCE;
                                z = true;
                            }
                            Trace.endSection();
                        } finally {
                        }
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                }
            }
            this.prefetchRequests.removeAt(0);
        }
        if (z) {
            this.choreographer.postFrameCallback(this);
        } else {
            this.prefetchScheduled = false;
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long frameTimeNanos) {
        if (this.isActive) {
            this.view.post(this);
        }
    }

    private final long calculateAverageTime(long r5, long current) {
        if (current == 0) {
            return r5;
        }
        long j = 4;
        return (r5 / j) + ((current / j) * 3);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.Prefetcher
    /* renamed from: schedulePrefetch-0kLqBqw */
    public LazyLayoutPrefetchState.PrefetchHandle mo496schedulePrefetch0kLqBqw(int index, long constraints) {
        PrefetchRequest prefetchRequest = new PrefetchRequest(index, constraints, null);
        this.prefetchRequests.add(prefetchRequest);
        if (!this.prefetchScheduled) {
            this.prefetchScheduled = true;
            this.view.post(this);
        }
        return prefetchRequest;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.prefetchState.setPrefetcher$foundation_release(this);
        this.isActive = true;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.isActive = false;
        this.prefetchState.setPrefetcher$foundation_release(null);
        this.view.removeCallbacks(this);
        this.choreographer.removeFrameCallback(this);
    }

    /* compiled from: LazyLayoutPrefetcher.android.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$PrefetchRequest;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "", "index", "Landroidx/compose/ui/unit/Constraints;", "constraints", "<init>", "(IJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "cancel", "()V", "I", "getIndex", "()I", "J", "getConstraints-msEJaDk", "()J", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "precomposeHandle", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "getPrecomposeHandle", "()Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "setPrecomposeHandle", "(Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;)V", "", "canceled", "Z", "getCanceled", "()Z", "setCanceled", "(Z)V", "measured", "getMeasured", "setMeasured", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class PrefetchRequest implements LazyLayoutPrefetchState.PrefetchHandle {
        private boolean canceled;
        private final long constraints;
        private final int index;
        private boolean measured;
        private SubcomposeLayoutState.PrecomposedSlotHandle precomposeHandle;

        public /* synthetic */ PrefetchRequest(int i, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, j);
        }

        private PrefetchRequest(int i, long j) {
            this.index = i;
            this.constraints = j;
        }

        public final int getIndex() {
            return this.index;
        }

        /* renamed from: getConstraints-msEJaDk, reason: not valid java name and from getter */
        public final long getConstraints() {
            return this.constraints;
        }

        public final SubcomposeLayoutState.PrecomposedSlotHandle getPrecomposeHandle() {
            return this.precomposeHandle;
        }

        public final void setPrecomposeHandle(SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle) {
            this.precomposeHandle = precomposedSlotHandle;
        }

        public final boolean getCanceled() {
            return this.canceled;
        }

        public final boolean getMeasured() {
            return this.measured;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
        public void cancel() {
            if (this.canceled) {
                return;
            }
            this.canceled = true;
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
            if (precomposedSlotHandle != null) {
                precomposedSlotHandle.dispose();
            }
            this.precomposeHandle = null;
        }
    }

    /* compiled from: LazyLayoutPrefetcher.android.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$Companion;", "", "()V", "frameIntervalNs", "", "calculateFrameIntervalIfNeeded", "", "view", "Landroid/view/View;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
        
            if (r5 >= 30.0f) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void calculateFrameIntervalIfNeeded(View view) {
            float f;
            if (LazyLayoutPrefetcher.frameIntervalNs == 0) {
                Display display = view.getDisplay();
                if (!view.isInEditMode() && display != null) {
                    f = display.getRefreshRate();
                }
                f = 60.0f;
                LazyLayoutPrefetcher.frameIntervalNs = (long) (1000000000 / f);
            }
        }
    }
}
