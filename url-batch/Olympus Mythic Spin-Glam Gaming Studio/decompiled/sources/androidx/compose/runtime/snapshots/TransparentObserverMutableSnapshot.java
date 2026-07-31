package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Thread_jvmKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: Snapshot.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0019\u001a\u00020\u00182\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u001c\u001a\u00020\u00012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u001e\u0010\u000eJ\u0017\u0010$\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0018H\u0010¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0018H\u0010¢\u0006\u0004\b%\u0010#R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010(R0\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R0\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010)\u001a\u0004\b.\u0010+\"\u0004\b/\u0010-R\u001a\u00101\u001a\u0002008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R,\u0010=\u001a\u000600j\u0002`82\n\u00109\u001a\u000600j\u0002`88V@PX\u0096\u000e¢\u0006\f\u001a\u0004\b:\u00104\"\u0004\b;\u0010<R$\u0010C\u001a\u00020>2\u0006\u00109\u001a\u00020>8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR4\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010D2\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010D8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010O\u001a\u00020J2\u0006\u00109\u001a\u00020J8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0014\u0010R\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006S"}, d2 = {"Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "parentSnapshot", "Lkotlin/Function1;", "", "", "specifiedReadObserver", "specifiedWriteObserver", "", "mergeParentObservers", "ownsParentSnapshot", "<init>", "(Landroidx/compose/runtime/snapshots/MutableSnapshot;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZ)V", "dispose", "()V", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "apply", "()Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "recordModified$runtime", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "recordModified", "readObserver", "Landroidx/compose/runtime/snapshots/Snapshot;", "takeNestedSnapshot", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "writeObserver", "takeNestedMutableSnapshot", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/MutableSnapshot;", "notifyObjectsInitialized$runtime", "notifyObjectsInitialized", "snapshot", "", "nestedActivated$runtime", "(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;", "nestedActivated", "nestedDeactivated$runtime", "nestedDeactivated", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Z", "Lkotlin/jvm/functions/Function1;", "getReadObserver$runtime", "()Lkotlin/jvm/functions/Function1;", "setReadObserver$runtime", "(Lkotlin/jvm/functions/Function1;)V", "getWriteObserver$runtime", "setWriteObserver$runtime", "", "threadId", "J", "getThreadId$runtime", "()J", "getCurrentSnapshot", "()Landroidx/compose/runtime/snapshots/MutableSnapshot;", "currentSnapshot", "Landroidx/compose/runtime/snapshots/SnapshotId;", "value", "getSnapshotId", "setSnapshotId$runtime", "(J)V", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getInvalid$runtime", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setInvalid$runtime", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "invalid", "Landroidx/collection/MutableScatterSet;", "getModified$runtime", "()Landroidx/collection/MutableScatterSet;", "setModified$runtime", "(Landroidx/collection/MutableScatterSet;)V", "modified", "", "getWriteCount$runtime", "()I", "setWriteCount$runtime", "(I)V", "writeCount", "getReadOnly", "()Z", "readOnly", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TransparentObserverMutableSnapshot extends MutableSnapshot {
    private final boolean mergeParentObservers;
    private final boolean ownsParentSnapshot;
    private final MutableSnapshot parentSnapshot;
    private Function1 readObserver;
    private final long threadId;
    private Function1 writeObserver;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TransparentObserverMutableSnapshot(MutableSnapshot mutableSnapshot, Function1 function1, Function1 function12, boolean z, boolean z2) {
        super(r1, r3, r4, r5);
        long j;
        GlobalSnapshot globalSnapshot;
        Function1 readObserver;
        Function1 mergedReadObserver;
        GlobalSnapshot globalSnapshot2;
        Function1 writeObserver;
        Function1 mergedWriteObserver;
        j = SnapshotKt.INVALID_SNAPSHOT;
        SnapshotIdSet empty = SnapshotIdSet.INSTANCE.getEMPTY();
        if (mutableSnapshot == null || (readObserver = mutableSnapshot.getReadObserver()) == null) {
            globalSnapshot = SnapshotKt.globalSnapshot;
            readObserver = globalSnapshot.getReadObserver();
        }
        mergedReadObserver = SnapshotKt.mergedReadObserver(function1, readObserver, z);
        if (mutableSnapshot == null || (writeObserver = mutableSnapshot.getWriteObserver()) == null) {
            globalSnapshot2 = SnapshotKt.globalSnapshot;
            writeObserver = globalSnapshot2.getWriteObserver();
        }
        mergedWriteObserver = SnapshotKt.mergedWriteObserver(function12, writeObserver);
        this.parentSnapshot = mutableSnapshot;
        this.mergeParentObservers = z;
        this.ownsParentSnapshot = z2;
        this.readObserver = super.getReadObserver();
        this.writeObserver = super.getWriteObserver();
        this.threadId = Thread_jvmKt.currentThreadId();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getReadObserver$runtime, reason: from getter */
    public Function1 getReadObserver() {
        return this.readObserver;
    }

    public void setReadObserver$runtime(Function1 function1) {
        this.readObserver = function1;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getWriteObserver$runtime, reason: from getter */
    public Function1 getWriteObserver() {
        return this.writeObserver;
    }

    public void setWriteObserver$runtime(Function1 function1) {
        this.writeObserver = function1;
    }

    /* renamed from: getThreadId$runtime, reason: from getter */
    public final long getThreadId() {
        return this.threadId;
    }

    private final MutableSnapshot getCurrentSnapshot() {
        GlobalSnapshot globalSnapshot;
        MutableSnapshot mutableSnapshot = this.parentSnapshot;
        if (mutableSnapshot != null) {
            return mutableSnapshot;
        }
        globalSnapshot = SnapshotKt.globalSnapshot;
        return globalSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        MutableSnapshot mutableSnapshot;
        setDisposed$runtime(true);
        if (!this.ownsParentSnapshot || (mutableSnapshot = this.parentSnapshot) == null) {
            return;
        }
        mutableSnapshot.dispose();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public long getSnapshotId() {
        return getCurrentSnapshot().getSnapshotId();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setSnapshotId$runtime(long j) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getInvalid$runtime */
    public SnapshotIdSet getInvalid() {
        return getCurrentSnapshot().getInvalid();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setInvalid$runtime(SnapshotIdSet snapshotIdSet) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    /* renamed from: getModified$runtime */
    public MutableScatterSet getModified() {
        return getCurrentSnapshot().getModified();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public void setModified$runtime(MutableScatterSet mutableScatterSet) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getWriteCount$runtime */
    public int getWriteCount() {
        return getCurrentSnapshot().getWriteCount();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void setWriteCount$runtime(int i) {
        getCurrentSnapshot().setWriteCount$runtime(i);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return getCurrentSnapshot().getReadOnly();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public SnapshotApplyResult apply() {
        return getCurrentSnapshot().apply();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime */
    public void mo1214recordModified$runtime(StateObject state) {
        getCurrentSnapshot().mo1214recordModified$runtime(state);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(Function1 readObserver) {
        Snapshot createTransparentSnapshotWithNoParentReadObserver;
        Function1 mergedReadObserver$default = SnapshotKt.mergedReadObserver$default(readObserver, getReadObserver(), false, 4, null);
        if (!this.mergeParentObservers) {
            createTransparentSnapshotWithNoParentReadObserver = SnapshotKt.createTransparentSnapshotWithNoParentReadObserver(getCurrentSnapshot().takeNestedSnapshot(null), mergedReadObserver$default, true);
            return createTransparentSnapshotWithNoParentReadObserver;
        }
        return getCurrentSnapshot().takeNestedSnapshot(mergedReadObserver$default);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public MutableSnapshot takeNestedMutableSnapshot(Function1 readObserver, Function1 writeObserver) {
        Function1 mergedWriteObserver;
        Function1 mergedReadObserver$default = SnapshotKt.mergedReadObserver$default(readObserver, getReadObserver(), false, 4, null);
        mergedWriteObserver = SnapshotKt.mergedWriteObserver(writeObserver, getWriteObserver());
        if (!this.mergeParentObservers) {
            return new TransparentObserverMutableSnapshot(getCurrentSnapshot().takeNestedMutableSnapshot(null, mergedWriteObserver), mergedReadObserver$default, mergedWriteObserver, false, true);
        }
        return getCurrentSnapshot().takeNestedMutableSnapshot(mergedReadObserver$default, mergedWriteObserver);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime() {
        getCurrentSnapshot().notifyObjectsInitialized$runtime();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime, reason: merged with bridge method [inline-methods] */
    public Void mo1212nestedActivated$runtime(Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime, reason: merged with bridge method [inline-methods] */
    public Void mo1213nestedDeactivated$runtime(Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }
}
