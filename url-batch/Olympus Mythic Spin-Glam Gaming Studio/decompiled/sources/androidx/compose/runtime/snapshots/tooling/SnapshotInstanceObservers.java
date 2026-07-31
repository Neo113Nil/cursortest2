package androidx.compose.runtime.snapshots.tooling;

import androidx.compose.runtime.ExperimentalComposeRuntimeApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: SnapshotObserver.kt */
@StabilityInferred
@ExperimentalComposeRuntimeApi
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;", "", "readObserver", "Lkotlin/Function1;", "", "writeObserver", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getReadObserver", "()Lkotlin/jvm/functions/Function1;", "getWriteObserver", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SnapshotInstanceObservers {
    private final Function1 readObserver;
    private final Function1 writeObserver;

    public SnapshotInstanceObservers(Function1 function1, Function1 function12) {
        this.readObserver = function1;
        this.writeObserver = function12;
    }

    public final Function1 getReadObserver() {
        return this.readObserver;
    }

    public final Function1 getWriteObserver() {
        return this.writeObserver;
    }
}
