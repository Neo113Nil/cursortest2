package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Thread_jvmKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: Snapshot.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\u00020\u00012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u0016\u0010\rJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001d\u0010\u001bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R0\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R(\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u001a\u0010)\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010/R\u0014\u00101\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010/R,\u00107\u001a\u00060(j\u0002`22\n\u00103\u001a\u00060(j\u0002`28V@PX\u0096\u000e¢\u0006\f\u001a\u0004\b4\u0010,\"\u0004\b5\u00106R$\u0010=\u001a\u0002082\u0006\u00103\u001a\u0002088P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0014\u0010@\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Landroidx/compose/runtime/snapshots/TransparentObserverSnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "parentSnapshot", "Lkotlin/Function1;", "", "", "specifiedReadObserver", "", "mergeParentObservers", "ownsParentSnapshot", "<init>", "(Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;ZZ)V", "dispose", "()V", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "recordModified$runtime", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "recordModified", "readObserver", "takeNestedSnapshot", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "notifyObjectsInitialized$runtime", "notifyObjectsInitialized", "snapshot", "", "nestedActivated$runtime", "(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;", "nestedActivated", "nestedDeactivated$runtime", "nestedDeactivated", "Landroidx/compose/runtime/snapshots/Snapshot;", "Z", "Lkotlin/jvm/functions/Function1;", "getReadObserver$runtime", "()Lkotlin/jvm/functions/Function1;", "setReadObserver$runtime", "(Lkotlin/jvm/functions/Function1;)V", "writeObserver", "getWriteObserver$runtime", "", "threadId", "J", "getThreadId$runtime", "()J", "root", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "getCurrentSnapshot", "currentSnapshot", "Landroidx/compose/runtime/snapshots/SnapshotId;", "value", "getSnapshotId", "setSnapshotId$runtime", "(J)V", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getInvalid$runtime", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setInvalid$runtime", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "invalid", "getReadOnly", "()Z", "readOnly", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TransparentObserverSnapshot extends Snapshot {
    private final boolean mergeParentObservers;
    private final boolean ownsParentSnapshot;
    private final Snapshot parentSnapshot;
    private Function1 readObserver;
    private final Snapshot root;
    private final long threadId;
    private final Function1 writeObserver;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TransparentObserverSnapshot(Snapshot snapshot, Function1 function1, boolean z, boolean z2) {
        super(r0, SnapshotIdSet.INSTANCE.getEMPTY(), null);
        long j;
        GlobalSnapshot globalSnapshot;
        Function1 readObserver;
        Function1 mergedReadObserver;
        j = SnapshotKt.INVALID_SNAPSHOT;
        this.parentSnapshot = snapshot;
        this.mergeParentObservers = z;
        this.ownsParentSnapshot = z2;
        if (snapshot == null || (readObserver = snapshot.getReadObserver()) == null) {
            globalSnapshot = SnapshotKt.globalSnapshot;
            readObserver = globalSnapshot.getReadObserver();
        }
        mergedReadObserver = SnapshotKt.mergedReadObserver(function1, readObserver, z);
        this.readObserver = mergedReadObserver;
        this.threadId = Thread_jvmKt.currentThreadId();
        this.root = this;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getReadObserver$runtime, reason: from getter */
    public Function1 getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getWriteObserver$runtime, reason: from getter */
    public Function1 getWriteObserver() {
        return this.writeObserver;
    }

    private final Snapshot getCurrentSnapshot() {
        GlobalSnapshot globalSnapshot;
        Snapshot snapshot = this.parentSnapshot;
        if (snapshot != null) {
            return snapshot;
        }
        globalSnapshot = SnapshotKt.globalSnapshot;
        return globalSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        Snapshot snapshot;
        setDisposed$runtime(true);
        if (!this.ownsParentSnapshot || (snapshot = this.parentSnapshot) == null) {
            return;
        }
        snapshot.dispose();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public long getSnapshotId() {
        return getCurrentSnapshot().getSnapshotId();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getInvalid$runtime */
    public SnapshotIdSet getInvalid() {
        return getCurrentSnapshot().getInvalid();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return getCurrentSnapshot().getReadOnly();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime */
    public void mo1214recordModified$runtime(StateObject state) {
        getCurrentSnapshot().mo1214recordModified$runtime(state);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(Function1 readObserver) {
        Snapshot createTransparentSnapshotWithNoParentReadObserver;
        Function1 mergedReadObserver$default = SnapshotKt.mergedReadObserver$default(readObserver, getReadObserver(), false, 4, null);
        if (!this.mergeParentObservers) {
            createTransparentSnapshotWithNoParentReadObserver = SnapshotKt.createTransparentSnapshotWithNoParentReadObserver(getCurrentSnapshot().takeNestedSnapshot(null), mergedReadObserver$default, true);
            return createTransparentSnapshotWithNoParentReadObserver;
        }
        return getCurrentSnapshot().takeNestedSnapshot(mergedReadObserver$default);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime() {
        getCurrentSnapshot().notifyObjectsInitialized$runtime();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime, reason: merged with bridge method [inline-methods] */
    public Void mo1212nestedActivated$runtime(Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime, reason: merged with bridge method [inline-methods] */
    public Void mo1213nestedDeactivated$runtime(Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }
}
