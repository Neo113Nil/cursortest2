package kotlin.collections;

import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import androidx.compose.runtime.snapshots.SubList;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes9.dex */
public final class ReversedList$listIterator$1 implements ListIterator, KMappedMarker {
    public final /* synthetic */ int $r8$classId = 0;
    public final Object delegateIterator;
    public final /* synthetic */ Object this$0;

    public ReversedList$listIterator$1(ReversedList reversedList, int i) {
        this.this$0 = reversedList;
        this.delegateIterator = ((ArrayList) reversedList.delegate).listIterator(CollectionsKt__ReversedViewsKt.access$reversePositionIndex(i, reversedList));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ListIterator listIterator = (ListIterator) this.delegateIterator;
                listIterator.add(obj);
                listIterator.previous();
                return;
            case 1:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.$r8$classId;
        Object obj = this.delegateIterator;
        switch (i) {
            case 1:
                if (((Ref$IntRef) obj).element < ((SubList) this.this$0).size - 1) {
                }
                break;
        }
        return ((ListIterator) obj).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.$r8$classId;
        Object obj = this.delegateIterator;
        switch (i) {
            case 1:
                if (((Ref$IntRef) obj).element >= 0) {
                }
                break;
        }
        return ((ListIterator) obj).hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.$r8$classId;
        Object obj = this.delegateIterator;
        switch (i) {
            case 0:
                return ((ListIterator) obj).previous();
            case 1:
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj;
                int i2 = ref$IntRef.element + 1;
                SubList subList = (SubList) this.this$0;
                SnapshotId_jvmKt.access$validateRange(i2, subList.size);
                ref$IntRef.element = i2;
                return subList.get(i2);
            default:
                return ((ListIterator) obj).previous();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int previousIndex;
        int size;
        int i = this.$r8$classId;
        Object obj = this.this$0;
        Object obj2 = this.delegateIterator;
        switch (i) {
            case 0:
                previousIndex = ((ListIterator) obj2).previousIndex();
                size = ((ReversedList) obj).size();
                break;
            case 1:
                return ((Ref$IntRef) obj2).element + 1;
            default:
                previousIndex = ((ListIterator) obj2).previousIndex();
                size = ((ReversedListReadOnly) obj).size();
                break;
        }
        return (size - 1) - previousIndex;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.$r8$classId;
        Object obj = this.delegateIterator;
        switch (i) {
            case 0:
                return ((ListIterator) obj).next();
            case 1:
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj;
                int i2 = ref$IntRef.element;
                SubList subList = (SubList) this.this$0;
                SnapshotId_jvmKt.access$validateRange(i2, subList.size);
                ref$IntRef.element = i2 - 1;
                return subList.get(i2);
            default:
                return ((ListIterator) obj).next();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int nextIndex;
        int size;
        int i = this.$r8$classId;
        Object obj = this.this$0;
        Object obj2 = this.delegateIterator;
        switch (i) {
            case 0:
                nextIndex = ((ListIterator) obj2).nextIndex();
                size = ((ReversedList) obj).size();
                break;
            case 1:
                return ((Ref$IntRef) obj2).element;
            default:
                nextIndex = ((ListIterator) obj2).nextIndex();
                size = ((ReversedListReadOnly) obj).size();
                break;
        }
        return (size - 1) - nextIndex;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.$r8$classId) {
            case 0:
                ((ListIterator) this.delegateIterator).remove();
                return;
            case 1:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((ListIterator) this.delegateIterator).set(obj);
                return;
            case 1:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ReversedList$listIterator$1(ReversedListReadOnly reversedListReadOnly, int i) {
        this.this$0 = reversedListReadOnly;
        this.delegateIterator = reversedListReadOnly.delegate.listIterator(CollectionsKt__ReversedViewsKt.access$reversePositionIndex(i, reversedListReadOnly));
    }

    public ReversedList$listIterator$1(Ref$IntRef ref$IntRef, SubList subList) {
        this.delegateIterator = ref$IntRef;
        this.this$0 = subList;
    }
}
