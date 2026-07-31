package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import com.yandex.div.core.ScrollDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SnapshotLongState.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\"B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u0007R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableLongStateImpl;", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/MutableLongState;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "", "value", "<init>", "(J)V", "Landroidx/compose/runtime/snapshots/StateRecord;", "", "prependStateRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "previous", "current", "applied", "mergeRecords", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/runtime/SnapshotMutableLongStateImpl$LongStateStateRecord;", ScrollDirection.NEXT, "Landroidx/compose/runtime/SnapshotMutableLongStateImpl$LongStateStateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getLongValue", "()J", "setLongValue", "longValue", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "policy", "LongStateStateRecord", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.SnapshotMutableLongStateImpl, reason: from toString */
/* loaded from: classes15.dex */
public class MutableLongState extends StateObjectImpl implements androidx.compose.runtime.MutableLongState, SnapshotMutableState<Long> {
    private LongStateStateRecord next;

    public MutableLongState(long j) {
        Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
        LongStateStateRecord longStateStateRecord = new LongStateStateRecord(currentSnapshot.getSnapshotId(), j);
        if (!(currentSnapshot instanceof GlobalSnapshot)) {
            longStateStateRecord.setNext$runtime(new LongStateStateRecord(SnapshotId_jvmKt.toSnapshotId(1), j));
        }
        this.next = longStateStateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.MutableLongState, androidx.compose.runtime.LongState
    public long getLongValue() {
        return ((LongStateStateRecord) SnapshotKt.readable(this.next, this)).getValue();
    }

    @Override // androidx.compose.runtime.MutableLongState
    public void setLongValue(long j) {
        Snapshot current;
        LongStateStateRecord longStateStateRecord = (LongStateStateRecord) SnapshotKt.current(this.next);
        if (longStateStateRecord.getValue() != j) {
            LongStateStateRecord longStateStateRecord2 = this.next;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                ((LongStateStateRecord) SnapshotKt.overwritableRecord(longStateStateRecord2, this, current, longStateStateRecord)).setValue(j);
                Unit unit = Unit.INSTANCE;
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    public SnapshotMutationPolicy getPolicy() {
        return SnapshotStateKt.structuralEqualityPolicy();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord value) {
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.next = (LongStateStateRecord) value;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord mergeRecords(StateRecord previous, StateRecord current, StateRecord applied) {
        Intrinsics.checkNotNull(current, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        Intrinsics.checkNotNull(applied, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        if (((LongStateStateRecord) current).getValue() == ((LongStateStateRecord) applied).getValue()) {
            return current;
        }
        return null;
    }

    public String toString() {
        return "MutableLongState(value=" + ((LongStateStateRecord) SnapshotKt.current(this.next)).getValue() + ")@" + hashCode();
    }

    /* compiled from: SnapshotLongState.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0001H\u0016J\b\u0010\u000e\u001a\u00020\u0001H\u0016J\u0019\u0010\u000e\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0002\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableLongStateImpl$LongStateStateRecord;", "Landroidx/compose/runtime/snapshots/StateRecord;", "snapshotId", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "value", "<init>", "(JJ)V", "getValue", "()J", "setValue", "(J)V", "assign", "", "create", "(J)Landroidx/compose/runtime/snapshots/StateRecord;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.SnapshotMutableLongStateImpl$LongStateStateRecord */
    private static final class LongStateStateRecord extends StateRecord {
        private long value;

        public final long getValue() {
            return this.value;
        }

        public final void setValue(long j) {
            this.value = j;
        }

        public LongStateStateRecord(long j, long j2) {
            super(j);
            this.value = j2;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord value) {
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            this.value = ((LongStateStateRecord) value).value;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return create(SnapshotKt.currentSnapshot().getSnapshotId());
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create(long snapshotId) {
            return new LongStateStateRecord(snapshotId, this.value);
        }
    }
}
