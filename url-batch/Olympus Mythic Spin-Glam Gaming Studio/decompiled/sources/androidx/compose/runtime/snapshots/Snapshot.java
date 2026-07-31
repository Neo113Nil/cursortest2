package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Thread_jvmKt;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Snapshot.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 Q2\u00020\u0001:\u0001QB\u001d\b\u0004\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\u00002\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0000H\u0011¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0000H ¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0000H ¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH ¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\"\u001a\u00020\tH ¢\u0006\u0004\b!\u0010\u000bJ\u000f\u0010$\u001a\u00020\tH\u0000¢\u0006\u0004\b#\u0010\u000bJ\u000f\u0010&\u001a\u00020\tH\u0010¢\u0006\u0004\b%\u0010\u000bJ\u000f\u0010(\u001a\u00020\tH\u0010¢\u0006\u0004\b'\u0010\u000bJ\u000f\u0010*\u001a\u00020\tH\u0000¢\u0006\u0004\b)\u0010\u000bJ\u000f\u0010,\u001a\u00020\tH\u0000¢\u0006\u0004\b+\u0010\u000bJ\u000f\u00100\u001a\u00020-H\u0000¢\u0006\u0004\b.\u0010/R\"\u0010\u0006\u001a\u00020\u00058\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\u0006\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R2\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\u00106\u001a\u00060\u0002j\u0002`\u00038\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010=\u001a\u00020<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001c\u0010C\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bC\u0010D\u0012\u0004\bE\u0010\u000bR$\u0010I\u001a\u00020-2\u0006\u00106\u001a\u00020-8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\bF\u0010/\"\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020<8&X¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010@R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\f8 X¡\u0004¢\u0006\f\u0012\u0004\bN\u0010\u000b\u001a\u0004\bL\u0010MR\"\u0010P\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\f8 X \u0004¢\u0006\u0006\u001a\u0004\bO\u0010M\u0082\u0001\u0004RSTU¨\u0006V"}, d2 = {"Landroidx/compose/runtime/snapshots/Snapshot;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "<init>", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "", "dispose", "()V", "Lkotlin/Function1;", "readObserver", "takeNestedSnapshot", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "makeCurrent", "()Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "restoreCurrent", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "unsafeEnter", "oldSnapshot", "unsafeLeave", "nestedActivated$runtime", "nestedActivated", "nestedDeactivated$runtime", "nestedDeactivated", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "recordModified$runtime", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "recordModified", "notifyObjectsInitialized$runtime", "notifyObjectsInitialized", "closeAndReleasePinning$runtime", "closeAndReleasePinning", "closeLocked$runtime", "closeLocked", "releasePinnedSnapshotsForCloseLocked$runtime", "releasePinnedSnapshotsForCloseLocked", "validateNotDisposed$runtime", "validateNotDisposed", "releasePinnedSnapshotLocked$runtime", "releasePinnedSnapshotLocked", "", "takeoverPinnedSnapshot$runtime", "()I", "takeoverPinnedSnapshot", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getInvalid$runtime", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setInvalid$runtime", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "value", "J", "getSnapshotId", "()J", "setSnapshotId$runtime", "(J)V", "", "disposed", "Z", "getDisposed$runtime", "()Z", "setDisposed$runtime", "(Z)V", "pinningTrackingHandle", "I", "getPinningTrackingHandle$annotations", "getWriteCount$runtime", "setWriteCount$runtime", "(I)V", "writeCount", "getReadOnly", "readOnly", "getReadObserver", "()Lkotlin/jvm/functions/Function1;", "getReadObserver$annotations", "getWriteObserver$runtime", "writeObserver", "Companion", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/ReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/TransparentObserverSnapshot;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Snapshot {
    private boolean disposed;
    private SnapshotIdSet invalid;
    private int pinningTrackingHandle;
    private long snapshotId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ Snapshot(long j, SnapshotIdSet snapshotIdSet, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, snapshotIdSet);
    }

    public abstract Function1 getReadObserver();

    public abstract boolean getReadOnly();

    public int getWriteCount$runtime() {
        return 0;
    }

    /* renamed from: getWriteObserver$runtime */
    public abstract Function1 getWriteObserver();

    /* renamed from: nestedActivated$runtime */
    public abstract void mo1212nestedActivated$runtime(Snapshot snapshot);

    /* renamed from: nestedDeactivated$runtime */
    public abstract void mo1213nestedDeactivated$runtime(Snapshot snapshot);

    public abstract void notifyObjectsInitialized$runtime();

    /* renamed from: recordModified$runtime */
    public abstract void mo1214recordModified$runtime(StateObject state);

    public abstract Snapshot takeNestedSnapshot(Function1 readObserver);

    private Snapshot(long j, SnapshotIdSet snapshotIdSet) {
        long j2;
        this.invalid = snapshotIdSet;
        this.snapshotId = j;
        j2 = SnapshotKt.INVALID_SNAPSHOT;
        this.pinningTrackingHandle = j != j2 ? SnapshotKt.trackPinning(j, getInvalid()) : -1;
    }

    /* renamed from: getInvalid$runtime, reason: from getter */
    public SnapshotIdSet getInvalid() {
        return this.invalid;
    }

    public void setInvalid$runtime(SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
    }

    public long getSnapshotId() {
        return this.snapshotId;
    }

    public void setSnapshotId$runtime(long j) {
        this.snapshotId = j;
    }

    public void setWriteCount$runtime(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public void dispose() {
        this.disposed = true;
        synchronized (SnapshotKt.getLock()) {
            releasePinnedSnapshotLocked$runtime();
            Unit unit = Unit.INSTANCE;
        }
    }

    public Snapshot makeCurrent() {
        SnapshotThreadLocal snapshotThreadLocal;
        SnapshotThreadLocal snapshotThreadLocal2;
        snapshotThreadLocal = SnapshotKt.threadSnapshot;
        Snapshot snapshot = (Snapshot) snapshotThreadLocal.get();
        snapshotThreadLocal2 = SnapshotKt.threadSnapshot;
        snapshotThreadLocal2.set(this);
        return snapshot;
    }

    public void restoreCurrent(Snapshot snapshot) {
        SnapshotThreadLocal snapshotThreadLocal;
        snapshotThreadLocal = SnapshotKt.threadSnapshot;
        snapshotThreadLocal.set(snapshot);
    }

    public final Snapshot unsafeEnter() {
        return makeCurrent();
    }

    public final void unsafeLeave(Snapshot oldSnapshot) {
        SnapshotThreadLocal snapshotThreadLocal;
        snapshotThreadLocal = SnapshotKt.threadSnapshot;
        if (!(snapshotThreadLocal.get() == this)) {
            PreconditionsKt.throwIllegalStateException("Cannot leave snapshot; " + this + " is not the current snapshot");
        }
        restoreCurrent(oldSnapshot);
    }

    /* renamed from: getDisposed$runtime, reason: from getter */
    public final boolean getDisposed() {
        return this.disposed;
    }

    public final void setDisposed$runtime(boolean z) {
        this.disposed = z;
    }

    public void closeLocked$runtime() {
        SnapshotIdSet snapshotIdSet;
        snapshotIdSet = SnapshotKt.openSnapshots;
        SnapshotKt.openSnapshots = snapshotIdSet.clear(getSnapshotId());
    }

    public void releasePinnedSnapshotsForCloseLocked$runtime() {
        releasePinnedSnapshotLocked$runtime();
    }

    public final void validateNotDisposed$runtime() {
        if (this.disposed) {
            PreconditionsKt.throwIllegalArgumentException("Cannot use a disposed snapshot");
        }
    }

    public final void releasePinnedSnapshotLocked$runtime() {
        int i = this.pinningTrackingHandle;
        if (i >= 0) {
            SnapshotKt.releasePinningLocked(i);
            this.pinningTrackingHandle = -1;
        }
    }

    public final int takeoverPinnedSnapshot$runtime() {
        int i = this.pinningTrackingHandle;
        this.pinningTrackingHandle = -1;
        return i;
    }

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ=\u0010\f\u001a\u00020\u000b2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJQ\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0019\u001a\u00020\u00182\u001e\u0010\u0017\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00182\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u0003J\r\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u0003R\u0011\u0010 \u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\"\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/compose/runtime/snapshots/Snapshot$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "", "readObserver", "Landroidx/compose/runtime/snapshots/Snapshot;", "takeSnapshot", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "writeObserver", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "takeMutableSnapshot", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/MutableSnapshot;", "T", "Lkotlin/Function0;", "block", "observe", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "createNonObservableSnapshot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "Lkotlin/Function2;", "", "observer", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "registerApplyObserver", "(Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/snapshots/ObserverHandle;", "registerGlobalWriteObserver", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/ObserverHandle;", "notifyObjectsInitialized", "sendApplyNotifications", "getCurrent", "current", "", "isInSnapshot", "()Z", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Snapshot getCurrent() {
            return SnapshotKt.currentSnapshot();
        }

        public final boolean isInSnapshot() {
            SnapshotThreadLocal snapshotThreadLocal;
            snapshotThreadLocal = SnapshotKt.threadSnapshot;
            return snapshotThreadLocal.get() != null;
        }

        public final Snapshot takeSnapshot(Function1 readObserver) {
            return SnapshotKt.currentSnapshot().takeNestedSnapshot(readObserver);
        }

        public final MutableSnapshot takeMutableSnapshot(Function1 readObserver, Function1 writeObserver) {
            MutableSnapshot takeNestedMutableSnapshot;
            Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
            MutableSnapshot mutableSnapshot = currentSnapshot instanceof MutableSnapshot ? (MutableSnapshot) currentSnapshot : null;
            if (mutableSnapshot == null || (takeNestedMutableSnapshot = mutableSnapshot.takeNestedMutableSnapshot(readObserver, writeObserver)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            return takeNestedMutableSnapshot;
        }

        public final Object observe(Function1 readObserver, Function1 writeObserver, Function0 block) {
            SnapshotThreadLocal snapshotThreadLocal;
            Snapshot transparentObserverMutableSnapshot;
            Function1 mergedWriteObserver;
            if (readObserver != null || writeObserver != null) {
                snapshotThreadLocal = SnapshotKt.threadSnapshot;
                Snapshot snapshot = (Snapshot) snapshotThreadLocal.get();
                if (snapshot instanceof TransparentObserverMutableSnapshot) {
                    TransparentObserverMutableSnapshot transparentObserverMutableSnapshot2 = (TransparentObserverMutableSnapshot) snapshot;
                    if (transparentObserverMutableSnapshot2.getThreadId() == Thread_jvmKt.currentThreadId()) {
                        Function1 readObserver2 = transparentObserverMutableSnapshot2.getReadObserver();
                        Function1 writeObserver2 = transparentObserverMutableSnapshot2.getWriteObserver();
                        try {
                            ((TransparentObserverMutableSnapshot) snapshot).setReadObserver$runtime(SnapshotKt.mergedReadObserver$default(readObserver, readObserver2, false, 4, null));
                            mergedWriteObserver = SnapshotKt.mergedWriteObserver(writeObserver, writeObserver2);
                            ((TransparentObserverMutableSnapshot) snapshot).setWriteObserver$runtime(mergedWriteObserver);
                            return block.mo4828invoke();
                        } finally {
                            transparentObserverMutableSnapshot2.setReadObserver$runtime(readObserver2);
                            transparentObserverMutableSnapshot2.setWriteObserver$runtime(writeObserver2);
                        }
                    }
                }
                if (snapshot == null || (snapshot instanceof MutableSnapshot)) {
                    transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null, readObserver, writeObserver, true, false);
                } else {
                    if (readObserver == null) {
                        return block.mo4828invoke();
                    }
                    transparentObserverMutableSnapshot = snapshot.takeNestedSnapshot(readObserver);
                }
                try {
                    Snapshot makeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                    try {
                        return block.mo4828invoke();
                    } finally {
                        transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                    }
                } finally {
                    transparentObserverMutableSnapshot.dispose();
                }
            }
            return block.mo4828invoke();
        }

        public final Snapshot createNonObservableSnapshot() {
            SnapshotThreadLocal snapshotThreadLocal;
            snapshotThreadLocal = SnapshotKt.threadSnapshot;
            return SnapshotKt.createTransparentSnapshotWithNoParentReadObserver$default((Snapshot) snapshotThreadLocal.get(), null, false, 6, null);
        }

        public final ObserverHandle registerApplyObserver(final Function2 observer) {
            Function1 function1;
            List list;
            function1 = SnapshotKt.emptyLambda;
            SnapshotKt.advanceGlobalSnapshot(function1);
            synchronized (SnapshotKt.getLock()) {
                list = SnapshotKt.applyObservers;
                SnapshotKt.applyObservers = CollectionsKt.plus(list, observer);
                Unit unit = Unit.INSTANCE;
            }
            return new ObserverHandle() { // from class: androidx.compose.runtime.snapshots.Snapshot$Companion$$ExternalSyntheticLambda0
                @Override // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    Snapshot.Companion.registerApplyObserver$lambda$3(Function2.this);
                }
            };
        }

        public final void notifyObjectsInitialized() {
            SnapshotKt.currentSnapshot().notifyObjectsInitialized$runtime();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerApplyObserver$lambda$3(Function2 function2) {
            List list;
            synchronized (SnapshotKt.getLock()) {
                list = SnapshotKt.applyObservers;
                SnapshotKt.applyObservers = CollectionsKt.minus(list, function2);
                Unit unit = Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerGlobalWriteObserver$lambda$6(Function1 function1) {
            List list;
            synchronized (SnapshotKt.getLock()) {
                list = SnapshotKt.globalWriteObservers;
                SnapshotKt.globalWriteObservers = CollectionsKt.minus(list, function1);
                Unit unit = Unit.INSTANCE;
            }
            SnapshotKt.advanceGlobalSnapshot();
        }

        public final ObserverHandle registerGlobalWriteObserver(final Function1 observer) {
            List list;
            synchronized (SnapshotKt.getLock()) {
                list = SnapshotKt.globalWriteObservers;
                SnapshotKt.globalWriteObservers = CollectionsKt.plus(list, observer);
                Unit unit = Unit.INSTANCE;
            }
            SnapshotKt.advanceGlobalSnapshot();
            return new ObserverHandle() { // from class: androidx.compose.runtime.snapshots.Snapshot$Companion$$ExternalSyntheticLambda1
                @Override // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    Snapshot.Companion.registerGlobalWriteObserver$lambda$6(Function1.this);
                }
            };
        }

        public final void sendApplyNotifications() {
            GlobalSnapshot globalSnapshot;
            boolean hasPendingChanges;
            synchronized (SnapshotKt.getLock()) {
                globalSnapshot = SnapshotKt.globalSnapshot;
                hasPendingChanges = globalSnapshot.hasPendingChanges();
            }
            if (hasPendingChanges) {
                SnapshotKt.advanceGlobalSnapshot();
            }
        }
    }

    public final void closeAndReleasePinning$runtime() {
        synchronized (SnapshotKt.getLock()) {
            closeLocked$runtime();
            releasePinnedSnapshotsForCloseLocked$runtime();
            Unit unit = Unit.INSTANCE;
        }
    }
}
