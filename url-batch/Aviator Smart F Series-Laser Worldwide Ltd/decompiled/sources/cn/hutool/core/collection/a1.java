package cn.hutool.core.collection;

import java.util.Iterator;
import java.util.function.Function;

/* loaded from: classes.dex */
public class a1 implements Iterator {
    private final Iterator<Object> backingIterator;
    private final Function<Object, Object> func;

    public a1(Iterator<Object> it, Function<Object, Object> function) {
        this.backingIterator = (Iterator) cn.hutool.core.lang.q.notNull(it);
        this.func = v0.a(cn.hutool.core.lang.q.notNull(function));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.backingIterator.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object apply;
        apply = this.func.apply(this.backingIterator.next());
        return apply;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.backingIterator.remove();
    }
}
