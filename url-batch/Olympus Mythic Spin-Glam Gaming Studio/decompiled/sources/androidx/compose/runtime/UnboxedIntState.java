package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* compiled from: SnapshotStateExtensions.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/UnboxedIntState;", "Landroidx/compose/runtime/IntState;", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/runtime/State;", "", "baseState", "Landroidx/compose/runtime/State;", "getIntValue", "()I", "intValue", "getValue", "()Ljava/lang/Integer;", "value", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UnboxedIntState implements IntState {
    private final State baseState;

    @Override // androidx.compose.runtime.IntState
    public int getIntValue() {
        return ((Number) this.baseState.getValue()).intValue();
    }

    @Override // androidx.compose.runtime.IntState, androidx.compose.runtime.State
    public Integer getValue() {
        return (Integer) this.baseState.getValue();
    }

    public String toString() {
        return "UnboxedIntState(baseState=" + this.baseState + ")@" + hashCode();
    }
}
