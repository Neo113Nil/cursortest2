package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import com.safedk.android.internal.d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Snapshot.kt */
@StabilityInferred
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001BO\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\f\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/snapshots/NestedMutableSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "writeObserver", "parent", "<init>", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/snapshots/MutableSnapshot;)V", "deactivate", "()V", "dispose", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "apply", "()Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "getParent", "()Landroidx/compose/runtime/snapshots/MutableSnapshot;", "", d.y, "Z", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NestedMutableSnapshot extends MutableSnapshot {
    private boolean deactivated;
    private final MutableSnapshot parent;

    public NestedMutableSnapshot(long j, SnapshotIdSet snapshotIdSet, Function1 function1, Function1 function12, MutableSnapshot mutableSnapshot) {
        super(j, snapshotIdSet, function1, function12);
        this.parent = mutableSnapshot;
        mutableSnapshot.mo1212nestedActivated$runtime(this);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed()) {
            return;
        }
        super.dispose();
        deactivate();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0085 A[Catch: all -> 0x0069, TryCatch #0 {all -> 0x0069, blocks: (B:11:0x0035, B:13:0x003a, B:16:0x0041, B:21:0x005d, B:23:0x0065, B:24:0x0079, B:26:0x0085, B:27:0x008a, B:32:0x006b, B:33:0x0074), top: B:10:0x0035 }] */
    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SnapshotApplyResult apply() {
        Map map;
        Map optimisticMerges;
        if (this.parent.getApplied() || this.parent.getDisposed()) {
            return new SnapshotApplyResult.Failure(this);
        }
        MutableScatterSet modified = getModified();
        long snapshotId = getSnapshotId();
        if (modified != null) {
            optimisticMerges = SnapshotKt.optimisticMerges(this.parent.getSnapshotId(), this, this.parent.getInvalid());
            map = optimisticMerges;
        } else {
            map = null;
        }
        synchronized (SnapshotKt.getLock()) {
            try {
                SnapshotKt.validateOpen(this);
                if (modified != null && modified.get_size() != 0) {
                    SnapshotApplyResult innerApplyLocked$runtime = innerApplyLocked$runtime(this.parent.getSnapshotId(), modified, map, this.parent.getInvalid());
                    if (!Intrinsics.areEqual(innerApplyLocked$runtime, SnapshotApplyResult.Success.INSTANCE)) {
                        return innerApplyLocked$runtime;
                    }
                    MutableScatterSet modified2 = this.parent.getModified();
                    if (modified2 != null) {
                        modified2.addAll(modified);
                    } else {
                        this.parent.setModified$runtime(modified);
                        setModified$runtime(null);
                    }
                    if (Intrinsics.compare(this.parent.getSnapshotId(), snapshotId) < 0) {
                        this.parent.advance$runtime();
                    }
                    MutableSnapshot mutableSnapshot = this.parent;
                    mutableSnapshot.setInvalid$runtime(mutableSnapshot.getInvalid().clear(snapshotId).andNot(getPreviousIds()));
                    this.parent.recordPrevious$runtime(snapshotId);
                    this.parent.recordPreviousPinnedSnapshot$runtime(takeoverPinnedSnapshot$runtime());
                    this.parent.recordPreviousList$runtime(getPreviousIds());
                    this.parent.recordPreviousPinnedSnapshots$runtime(getPreviousPinnedSnapshots());
                    Unit unit = Unit.INSTANCE;
                    setApplied$runtime(true);
                    deactivate();
                    SnapshotObserverKt.dispatchObserverOnApplied(this, modified);
                    return SnapshotApplyResult.Success.INSTANCE;
                }
                closeAndReleasePinning$runtime();
                Unit unit2 = Unit.INSTANCE;
                if (Intrinsics.compare(this.parent.getSnapshotId(), snapshotId) < 0) {
                }
                MutableSnapshot mutableSnapshot2 = this.parent;
                mutableSnapshot2.setInvalid$runtime(mutableSnapshot2.getInvalid().clear(snapshotId).andNot(getPreviousIds()));
                this.parent.recordPrevious$runtime(snapshotId);
                this.parent.recordPreviousPinnedSnapshot$runtime(takeoverPinnedSnapshot$runtime());
                this.parent.recordPreviousList$runtime(getPreviousIds());
                this.parent.recordPreviousPinnedSnapshots$runtime(getPreviousPinnedSnapshots());
                Unit unit3 = Unit.INSTANCE;
                setApplied$runtime(true);
                deactivate();
                SnapshotObserverKt.dispatchObserverOnApplied(this, modified);
                return SnapshotApplyResult.Success.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void deactivate() {
        if (this.deactivated) {
            return;
        }
        this.deactivated = true;
        this.parent.mo1213nestedDeactivated$runtime(this);
    }
}
