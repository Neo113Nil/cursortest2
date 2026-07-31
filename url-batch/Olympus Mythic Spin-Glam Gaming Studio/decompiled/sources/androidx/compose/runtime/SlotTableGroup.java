package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import com.ironsource.B5;
import com.ironsource.C4901tg;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/SlotTableGroup;", "Landroidx/compose/runtime/tooling/CompositionGroup;", "", "Landroidx/compose/runtime/SlotTable;", B5.R, "", "group", "version", "<init>", "(Landroidx/compose/runtime/SlotTable;II)V", "", "validateRead", "()V", "", "iterator", "()Ljava/util/Iterator;", "Landroidx/compose/runtime/SlotTable;", "getTable", "()Landroidx/compose/runtime/SlotTable;", "I", "getGroup", "()I", C4901tg.b, "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class SlotTableGroup implements CompositionGroup, Iterable<CompositionGroup>, KMappedMarker {
    private final int group;
    private final SlotTable table;
    private final int version;

    public SlotTableGroup(SlotTable slotTable, int i, int i2) {
        this.table = slotTable;
        this.group = i;
        this.version = i2;
    }

    @Override // java.lang.Iterable
    public Iterator<CompositionGroup> iterator() {
        int groupSize;
        validateRead();
        GroupSourceInformation sourceInformationOf = this.table.sourceInformationOf(this.group);
        if (sourceInformationOf == null) {
            SlotTable slotTable = this.table;
            int i = this.group;
            groupSize = SlotTableKt.groupSize(slotTable.getGroups(), this.group);
            return new GroupIterator(slotTable, i + 1, i + groupSize);
        }
        SlotTable slotTable2 = this.table;
        int i2 = this.group;
        return new SourceInformationGroupIterator(slotTable2, i2, sourceInformationOf, new AnchoredGroupPath(i2));
    }

    private final void validateRead() {
        if (this.table.getVersion() != this.version) {
            SlotTableKt.throwConcurrentModificationException();
        }
    }
}
