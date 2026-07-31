package androidx.compose.runtime.snapshots;

import com.safedk.android.analytics.brandsafety.m;
import com.yandex.div.core.ScrollDirection;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: SnapshotStateList.kt */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010+\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\r\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\fJ\t\u0010\r\u001a\u00020\u0003H\u0096\u0002J\u000e\u0010\u000e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0015\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\f¨\u0006\u0011"}, d2 = {"androidx/compose/runtime/snapshots/SubList$listIterator$1", "", "hasPrevious", "", "nextIndex", "", "previous", "()Ljava/lang/Object;", "previousIndex", m.l, "", "element", "(Ljava/lang/Object;)Ljava/lang/Void;", "hasNext", ScrollDirection.NEXT, "remove", "set", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SubList$listIterator$1<T> implements ListIterator<T>, KMappedMarker {
    final /* synthetic */ Ref$IntRef $current;
    final /* synthetic */ SubList this$0;

    SubList$listIterator$1(Ref$IntRef ref$IntRef, SubList subList) {
        this.$current = ref$IntRef;
        this.this$0 = subList;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.$current.element >= 0;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.$current.element + 1;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        int i = this.$current.element;
        SnapshotStateListKt.validateRange(i, this.this$0.size());
        this.$current.element = i - 1;
        return this.this$0.get(i);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.$current.element;
    }

    @Override // java.util.ListIterator
    public Void add(Object element) {
        SnapshotStateListKt.modificationError();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.$current.element < this.this$0.size() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        int i = this.$current.element + 1;
        SnapshotStateListKt.validateRange(i, this.this$0.size());
        this.$current.element = i;
        return this.this$0.get(i);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Void remove() {
        SnapshotStateListKt.modificationError();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.ListIterator
    public Void set(Object element) {
        SnapshotStateListKt.modificationError();
        throw new KotlinNothingValueException();
    }
}
