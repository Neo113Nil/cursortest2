package cn.hutool.core.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class w implements Iterator {
    private boolean finished;
    private Object next;

    protected abstract Object computeNext();

    public void finish() {
        this.finished = true;
        this.next = null;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.next != null) {
            return true;
        }
        if (this.finished) {
            return false;
        }
        Object computeNext = computeNext();
        if (computeNext == null) {
            this.finished = true;
            return false;
        }
        this.next = computeNext;
        return true;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more lines");
        }
        Object obj = this.next;
        this.next = null;
        return obj;
    }
}
