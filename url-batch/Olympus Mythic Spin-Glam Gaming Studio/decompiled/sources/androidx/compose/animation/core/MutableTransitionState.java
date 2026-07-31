package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* compiled from: Transition.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005R+\u0010\f\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0005R+\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00008F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\u0005R+\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00118@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/animation/core/MutableTransitionState;", "S", "", "initialState", "<init>", "(Ljava/lang/Object;)V", "<set-?>", "currentState$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentState", "()Ljava/lang/Object;", "setCurrentState$animation_core_release", "currentState", "targetState$delegate", "getTargetState", "setTargetState", "targetState", "", "isRunning$delegate", "isRunning$animation_core_release", "()Z", "setRunning$animation_core_release", "(Z)V", "isRunning", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MutableTransitionState<S> {
    public static final int $stable = 0;

    /* renamed from: currentState$delegate, reason: from kotlin metadata */
    private final MutableState currentState;

    /* renamed from: isRunning$delegate, reason: from kotlin metadata */
    private final MutableState isRunning = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* renamed from: targetState$delegate, reason: from kotlin metadata */
    private final MutableState targetState;

    public MutableTransitionState(Object obj) {
        this.currentState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
        this.targetState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
    }

    public final Object getCurrentState() {
        return this.currentState.getValue();
    }

    public final void setCurrentState$animation_core_release(Object obj) {
        this.currentState.setValue(obj);
    }

    public final Object getTargetState() {
        return this.targetState.getValue();
    }

    public final void setTargetState(Object obj) {
        this.targetState.setValue(obj);
    }

    public final void setRunning$animation_core_release(boolean z) {
        this.isRunning.setValue(Boolean.valueOf(z));
    }
}
