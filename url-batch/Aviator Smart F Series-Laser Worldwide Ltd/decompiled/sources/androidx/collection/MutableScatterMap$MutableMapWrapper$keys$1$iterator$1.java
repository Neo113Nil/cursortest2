package androidx.collection;

import g6.d;
import java.util.Iterator;
import kotlin.sequences.q;

/* JADX INFO: Add missing generic type declarations: [K] */
/* loaded from: classes.dex */
public final class MutableScatterMap$MutableMapWrapper$keys$1$iterator$1<K> implements Iterator<K>, d {
    private int current;
    private final Iterator<Integer> iterator;
    final /* synthetic */ MutableScatterMap<K, V> this$0;

    MutableScatterMap$MutableMapWrapper$keys$1$iterator$1(MutableScatterMap<K, V> mutableScatterMap) {
        Iterator<Integer> it;
        this.this$0 = mutableScatterMap;
        it = q.iterator(new MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1(mutableScatterMap, null));
        this.iterator = it;
        this.current = -1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public K next() {
        int intValue = this.iterator.next().intValue();
        this.current = intValue;
        return (K) this.this$0.keys[intValue];
    }

    @Override // java.util.Iterator
    public void remove() {
        int i8 = this.current;
        if (i8 >= 0) {
            this.this$0.removeValueAt(i8);
            this.current = -1;
        }
    }
}
