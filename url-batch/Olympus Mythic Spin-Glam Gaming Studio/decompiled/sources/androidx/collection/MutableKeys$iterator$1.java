package androidx.collection;

import com.yandex.div.core.ScrollDirection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequencesKt;

/* JADX INFO: Add missing generic type declarations: [K] */
/* compiled from: ScatterMap.kt */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010\b\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"androidx/collection/MutableKeys$iterator$1", "", "", "hasNext", "()Z", ScrollDirection.NEXT, "()Ljava/lang/Object;", "", "remove", "()V", "", "", "iterator", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "current", "I", "getCurrent", "()I", "setCurrent", "(I)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MutableKeys$iterator$1<K> implements Iterator<K>, KMappedMarker {
    private int current = -1;
    private final Iterator iterator;
    final /* synthetic */ MutableKeys this$0;

    MutableKeys$iterator$1(MutableKeys mutableKeys) {
        this.this$0 = mutableKeys;
        this.iterator = SequencesKt.iterator(new MutableKeys$iterator$1$iterator$1(mutableKeys, null));
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        MutableScatterMap mutableScatterMap;
        this.current = ((Number) this.iterator.next()).intValue();
        mutableScatterMap = this.this$0.parent;
        return mutableScatterMap.keys[this.current];
    }

    @Override // java.util.Iterator
    public void remove() {
        MutableScatterMap mutableScatterMap;
        if (this.current >= 0) {
            mutableScatterMap = this.this$0.parent;
            mutableScatterMap.removeValueAt(this.current);
            this.current = -1;
        }
    }
}
