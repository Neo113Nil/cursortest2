package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotContextElement;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.ThreadContextElement;

/* compiled from: SnapshotContextElement.jvm.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotContextElementImpl;", "Landroidx/compose/runtime/snapshots/SnapshotContextElement;", "Lkotlinx/coroutines/ThreadContextElement;", "Landroidx/compose/runtime/snapshots/Snapshot;", "Lkotlin/coroutines/CoroutineContext;", "context", "updateThreadContext", "(Lkotlin/coroutines/CoroutineContext;)Landroidx/compose/runtime/snapshots/Snapshot;", "oldState", "", "restoreThreadContext", "(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/snapshots/Snapshot;)V", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SnapshotContextElementImpl implements SnapshotContextElement, ThreadContextElement {
    private final Snapshot snapshot;

    @Override // kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 function2) {
        return SnapshotContextElement.DefaultImpls.fold(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.Key key) {
        return SnapshotContextElement.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key key) {
        return SnapshotContextElement.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return SnapshotContextElement.DefaultImpls.plus(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.Key getKey() {
        return SnapshotContextElement.INSTANCE;
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public Snapshot updateThreadContext(CoroutineContext context) {
        return this.snapshot.unsafeEnter();
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public void restoreThreadContext(CoroutineContext context, Snapshot oldState) {
        this.snapshot.unsafeLeave(oldState);
    }
}
