package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yandex.div.core.ScrollDirection;
import kotlin.Metadata;

/* compiled from: Snapshot.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\b'\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0000H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0000H&¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000b\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\rR&\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0006R$\u0010\u0012\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\n¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/snapshots/StateRecord;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "<init>", "(J)V", "value", "", "assign", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "create", "()Landroidx/compose/runtime/snapshots/StateRecord;", "(J)Landroidx/compose/runtime/snapshots/StateRecord;", "J", "getSnapshotId$runtime", "()J", "setSnapshotId$runtime", ScrollDirection.NEXT, "Landroidx/compose/runtime/snapshots/StateRecord;", "getNext$runtime", "setNext$runtime", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class StateRecord {
    private StateRecord next;
    private long snapshotId;

    public abstract void assign(StateRecord value);

    public abstract StateRecord create();

    public StateRecord(long j) {
        this.snapshotId = j;
    }

    /* renamed from: getSnapshotId$runtime, reason: from getter */
    public final long getSnapshotId() {
        return this.snapshotId;
    }

    public final void setSnapshotId$runtime(long j) {
        this.snapshotId = j;
    }

    /* renamed from: getNext$runtime, reason: from getter */
    public final StateRecord getNext() {
        return this.next;
    }

    public final void setNext$runtime(StateRecord stateRecord) {
        this.next = stateRecord;
    }

    public StateRecord create(long snapshotId) {
        StateRecord create = create();
        create.snapshotId = snapshotId;
        return create;
    }
}
