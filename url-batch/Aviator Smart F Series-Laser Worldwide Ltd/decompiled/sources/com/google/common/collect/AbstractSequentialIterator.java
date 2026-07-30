package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class AbstractSequentialIterator<T> extends UnmodifiableIterator<T> {

    @CheckForNull
    private T nextOrNull;

    protected AbstractSequentialIterator(@CheckForNull T t7) {
        this.nextOrNull = t7;
    }

    @CheckForNull
    protected abstract T computeNext(T t7);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.nextOrNull != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t7 = this.nextOrNull;
        if (t7 == null) {
            throw new NoSuchElementException();
        }
        this.nextOrNull = computeNext(t7);
        return t7;
    }
}
