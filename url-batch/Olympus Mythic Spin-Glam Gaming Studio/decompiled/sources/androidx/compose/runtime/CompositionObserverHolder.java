package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Composition.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000b\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/CompositionObserverHolder;", "", "Landroidx/compose/runtime/tooling/CompositionObserver;", "observer", "", "root", "Landroidx/compose/runtime/CompositionContext;", "parent", "<init>", "(Landroidx/compose/runtime/tooling/CompositionObserver;ZLandroidx/compose/runtime/CompositionContext;)V", "current", "()Landroidx/compose/runtime/tooling/CompositionObserver;", "Landroidx/compose/runtime/tooling/CompositionObserver;", "getObserver", "setObserver", "(Landroidx/compose/runtime/tooling/CompositionObserver;)V", "Z", "getRoot", "()Z", "setRoot", "(Z)V", "Landroidx/compose/runtime/CompositionContext;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CompositionObserverHolder {
    private CompositionObserver observer;
    private final CompositionContext parent;
    private boolean root;

    public CompositionObserverHolder(CompositionObserver compositionObserver, boolean z, CompositionContext compositionContext) {
        this.observer = compositionObserver;
        this.root = z;
        this.parent = compositionContext;
    }

    public /* synthetic */ CompositionObserverHolder(CompositionObserver compositionObserver, boolean z, CompositionContext compositionContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : compositionObserver, (i & 2) != 0 ? false : z, compositionContext);
    }

    public final CompositionObserver current() {
        if (this.root) {
            return this.observer;
        }
        CompositionObserverHolder observerHolder$runtime = this.parent.getObserverHolder$runtime();
        CompositionObserver compositionObserver = observerHolder$runtime != null ? observerHolder$runtime.observer : null;
        if (Intrinsics.areEqual(compositionObserver, this.observer)) {
            return compositionObserver;
        }
        this.observer = compositionObserver;
        return compositionObserver;
    }
}
