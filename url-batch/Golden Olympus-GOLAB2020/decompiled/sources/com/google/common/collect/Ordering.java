package com.google.common.collect;

import com.google.common.base.Function;
import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class Ordering<T> implements Comparator<T> {
    protected Ordering() {
    }

    public static <T> Ordering<T> from(Comparator<T> comparator) {
        return comparator instanceof Ordering ? (Ordering) comparator : new ComparatorOrdering(comparator);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t4, T t5);

    public <F> Ordering<F> onResultOf(Function<F, ? extends T> function) {
        return new ByFunctionOrdering(function, this);
    }
}
