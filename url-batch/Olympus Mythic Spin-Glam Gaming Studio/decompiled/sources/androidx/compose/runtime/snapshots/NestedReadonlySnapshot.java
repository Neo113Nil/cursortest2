package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* compiled from: Snapshot.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B9\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u00002\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001e\u0010\u001cR(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\"\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\"¨\u0006,"}, d2 = {"Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "parent", "<init>", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/snapshots/Snapshot;)V", "takeNestedSnapshot", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "notifyObjectsInitialized$runtime", "()V", "notifyObjectsInitialized", "dispose", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "", "recordModified$runtime", "(Landroidx/compose/runtime/snapshots/StateObject;)Ljava/lang/Void;", "recordModified", "snapshot", "nestedDeactivated$runtime", "(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;", "nestedDeactivated", "nestedActivated$runtime", "nestedActivated", "Lkotlin/jvm/functions/Function1;", "getReadObserver$runtime", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/runtime/snapshots/Snapshot;", "getParent", "()Landroidx/compose/runtime/snapshots/Snapshot;", "", "getReadOnly", "()Z", "readOnly", "getWriteObserver$runtime", "writeObserver", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NestedReadonlySnapshot extends Snapshot {
    private final Snapshot parent;
    private final Function1 readObserver;

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getWriteObserver$runtime */
    public Function1 getWriteObserver() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime() {
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public NestedReadonlySnapshot takeNestedSnapshot(Function1 readObserver) {
        PersistentList persistentList;
        Map map;
        persistentList = SnapshotObserverKt.observers;
        if (persistentList != null) {
            Pair mergeObservers = SnapshotObserverKt.mergeObservers(persistentList, this, true, readObserver, null);
            SnapshotInstanceObservers snapshotInstanceObservers = (SnapshotInstanceObservers) mergeObservers.getFirst();
            Function1 readObserver2 = snapshotInstanceObservers.getReadObserver();
            snapshotInstanceObservers.getWriteObserver();
            map = (Map) mergeObservers.getSecond();
            readObserver = readObserver2;
        } else {
            map = null;
        }
        NestedReadonlySnapshot nestedReadonlySnapshot = new NestedReadonlySnapshot(getSnapshotId(), getInvalid(), SnapshotKt.mergedReadObserver$default(readObserver, getReadObserver(), false, 4, null), getParent());
        if (persistentList != null) {
            SnapshotObserverKt.dispatchCreatedObservers(persistentList, this, nestedReadonlySnapshot, map);
        }
        return nestedReadonlySnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getReadObserver$runtime, reason: from getter */
    public Function1 getReadObserver() {
        return this.readObserver;
    }

    public final Snapshot getParent() {
        return this.parent;
    }

    public NestedReadonlySnapshot(long j, SnapshotIdSet snapshotIdSet, Function1 function1, Snapshot snapshot) {
        super(j, snapshotIdSet, null);
        this.readObserver = function1;
        this.parent = snapshot;
        snapshot.mo1212nestedActivated$runtime(this);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed()) {
            return;
        }
        if (getSnapshotId() != this.parent.getSnapshotId()) {
            closeAndReleasePinning$runtime();
        }
        this.parent.mo1213nestedDeactivated$runtime(this);
        super.dispose();
        SnapshotObserverKt.dispatchObserverOnPreDispose(this);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime, reason: merged with bridge method [inline-methods] */
    public Void mo1214recordModified$runtime(StateObject state) {
        SnapshotKt.reportReadonlySnapshotWrite();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime, reason: merged with bridge method [inline-methods] */
    public Void mo1213nestedDeactivated$runtime(Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime, reason: merged with bridge method [inline-methods] */
    public Void mo1212nestedActivated$runtime(Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }
}
