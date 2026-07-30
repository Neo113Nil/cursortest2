package androidx.collection;

import g6.d;
import java.util.Iterator;
import kotlin.sequences.q;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: classes.dex */
public final class MutableScatterSet$MutableSetWrapper$iterator$1<E> implements Iterator<E>, d {
    private int current = -1;
    private final Iterator<E> iterator;
    final /* synthetic */ MutableScatterSet<E> this$0;

    MutableScatterSet$MutableSetWrapper$iterator$1(MutableScatterSet<E> mutableScatterSet) {
        Iterator<E> it;
        this.this$0 = mutableScatterSet;
        it = q.iterator(new MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1(mutableScatterSet, this, null));
        this.iterator = it;
    }

    public final int getCurrent() {
        return this.current;
    }

    public final Iterator<E> getIterator() {
        return this.iterator;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public E next() {
        return this.iterator.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        int i8 = this.current;
        if (i8 != -1) {
            this.this$0.removeElementAt(i8);
            this.current = -1;
        }
    }

    public final void setCurrent(int i8) {
        this.current = i8;
    }
}
