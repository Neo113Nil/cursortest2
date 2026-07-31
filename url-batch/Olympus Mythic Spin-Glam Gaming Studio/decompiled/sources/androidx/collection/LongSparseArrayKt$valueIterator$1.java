package androidx.collection;

import com.yandex.div.core.ScrollDirection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: LongSparseArray.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/collection/LongSparseArrayKt$valueIterator$1", "", "", "hasNext", "()Z", ScrollDirection.NEXT, "()Ljava/lang/Object;", "", "index", "I", "getIndex", "()I", "setIndex", "(I)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LongSparseArrayKt$valueIterator$1 implements Iterator<Object>, KMappedMarker {
    final /* synthetic */ LongSparseArray $this_valueIterator;
    private int index;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.$this_valueIterator.size();
    }

    @Override // java.util.Iterator
    public Object next() {
        LongSparseArray longSparseArray = this.$this_valueIterator;
        int i = this.index;
        this.index = i + 1;
        return longSparseArray.valueAt(i);
    }
}
