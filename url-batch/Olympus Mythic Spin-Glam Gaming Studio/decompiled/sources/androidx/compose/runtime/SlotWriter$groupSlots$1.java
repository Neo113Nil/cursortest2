package androidx.compose.runtime;

import com.yandex.div.core.ScrollDirection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"androidx/compose/runtime/SlotWriter$groupSlots$1", "", "", "", "hasNext", "()Z", ScrollDirection.NEXT, "()Ljava/lang/Object;", "", "current", "I", "getCurrent", "()I", "setCurrent", "(I)V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SlotWriter$groupSlots$1 implements Iterator<Object>, KMappedMarker {
    final /* synthetic */ int $end;
    private int current;
    final /* synthetic */ SlotWriter this$0;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.current < this.$end;
    }

    @Override // java.util.Iterator
    public Object next() {
        int dataIndexToDataAddress;
        if (!hasNext()) {
            return null;
        }
        Object[] objArr = this.this$0.slots;
        SlotWriter slotWriter = this.this$0;
        int i = this.current;
        this.current = i + 1;
        dataIndexToDataAddress = slotWriter.dataIndexToDataAddress(i);
        return objArr[dataIndexToDataAddress];
    }
}
