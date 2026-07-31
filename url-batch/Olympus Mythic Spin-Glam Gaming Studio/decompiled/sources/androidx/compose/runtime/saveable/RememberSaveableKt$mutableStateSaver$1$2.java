package androidx.compose.runtime.saveable;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RememberSaveable.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class RememberSaveableKt$mutableStateSaver$1$2 implements Function1 {
    final /* synthetic */ Saver $this_with;

    @Override // kotlin.jvm.functions.Function1
    public final MutableState invoke(MutableState mutableState) {
        Object obj;
        if (!(mutableState instanceof SnapshotMutableState)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        SnapshotMutableState snapshotMutableState = (SnapshotMutableState) mutableState;
        if (snapshotMutableState.getValue() != null) {
            Saver saver = this.$this_with;
            Object value = snapshotMutableState.getValue();
            Intrinsics.checkNotNull(value);
            obj = saver.restore(value);
        } else {
            obj = null;
        }
        SnapshotMutationPolicy policy = snapshotMutableState.getPolicy();
        Intrinsics.checkNotNull(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver?>");
        MutableState mutableStateOf = SnapshotStateKt.mutableStateOf(obj, policy);
        Intrinsics.checkNotNull(mutableStateOf, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver>");
        return mutableStateOf;
    }
}
