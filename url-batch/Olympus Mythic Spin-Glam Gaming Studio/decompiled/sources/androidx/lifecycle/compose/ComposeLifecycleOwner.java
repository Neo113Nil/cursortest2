package androidx.lifecycle.compose;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import kotlin.Metadata;

/* compiled from: RememberLifecycleOwner.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR*\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/lifecycle/compose/ComposeLifecycleOwner;", "Landroidx/lifecycle/LifecycleOwner;", "", "updateLifecycleState", "()V", "Landroidx/lifecycle/Lifecycle$Event;", "event", "handleLifecycleEvent", "(Landroidx/lifecycle/Lifecycle$Event;)V", "Landroidx/lifecycle/LifecycleRegistry;", "lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "Landroidx/lifecycle/Lifecycle$State;", "parentLifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "value", "maxLifecycleState", "getMaxLifecycleState", "()Landroidx/lifecycle/Lifecycle$State;", "setMaxLifecycleState", "(Landroidx/lifecycle/Lifecycle$State;)V", "getLifecycle", "()Landroidx/lifecycle/LifecycleRegistry;", "lifecycle", "lifecycle-runtime-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ComposeLifecycleOwner implements LifecycleOwner {
    private final LifecycleRegistry lifecycleRegistry;
    private Lifecycle.State maxLifecycleState;
    private Lifecycle.State parentLifecycleState;

    @Override // androidx.lifecycle.LifecycleOwner
    /* renamed from: getLifecycle, reason: from getter */
    public LifecycleRegistry getLifecycleRegistry() {
        return this.lifecycleRegistry;
    }

    public final void setMaxLifecycleState(Lifecycle.State state) {
        this.maxLifecycleState = state;
        updateLifecycleState();
    }

    public final void handleLifecycleEvent(Lifecycle.Event event) {
        this.parentLifecycleState = event.getTargetState();
        updateLifecycleState();
    }

    private final void updateLifecycleState() {
        Lifecycle.State state;
        if (this.parentLifecycleState.ordinal() < this.maxLifecycleState.ordinal()) {
            state = this.parentLifecycleState;
        } else {
            state = this.maxLifecycleState;
        }
        if (this.lifecycleRegistry.getState() == Lifecycle.State.INITIALIZED && state == Lifecycle.State.DESTROYED) {
            return;
        }
        this.lifecycleRegistry.setCurrentState(state);
    }
}
