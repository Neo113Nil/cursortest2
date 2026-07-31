package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import com.ironsource.B5;
import com.yandex.div.core.ScrollDirection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/GroupIterator;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "Landroidx/compose/runtime/SlotTable;", B5.R, "", "start", "end", "<init>", "(Landroidx/compose/runtime/SlotTable;II)V", "", "validateRead", "()V", "", "hasNext", "()Z", ScrollDirection.NEXT, "()Landroidx/compose/runtime/tooling/CompositionGroup;", "Landroidx/compose/runtime/SlotTable;", "getTable", "()Landroidx/compose/runtime/SlotTable;", "I", "getEnd", "()I", "index", "version", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class GroupIterator implements Iterator<CompositionGroup>, KMappedMarker {
    private final int end;
    private int index;
    private final SlotTable table;
    private final int version;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public GroupIterator(SlotTable slotTable, int i, int i2) {
        this.table = slotTable;
        this.end = i2;
        this.index = i;
        this.version = slotTable.getVersion();
        if (slotTable.getWriter()) {
            SlotTableKt.throwConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.end;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public CompositionGroup next() {
        int groupSize;
        validateRead();
        int i = this.index;
        groupSize = SlotTableKt.groupSize(this.table.getGroups(), i);
        this.index = groupSize + i;
        return new SlotTableGroup(this.table, i, this.version);
    }

    private final void validateRead() {
        if (this.table.getVersion() != this.version) {
            SlotTableKt.throwConcurrentModificationException();
        }
    }
}
