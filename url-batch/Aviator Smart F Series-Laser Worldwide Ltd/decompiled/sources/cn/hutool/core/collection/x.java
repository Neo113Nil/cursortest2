package cn.hutool.core.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class x implements Iterator {
    private final cn.hutool.core.lang.a0 filter;
    private final Iterator<Object> iterator;
    private Object nextObject;
    private boolean nextObjectSet = false;

    public x(Iterator<Object> it, cn.hutool.core.lang.a0 a0Var) {
        this.iterator = (Iterator) cn.hutool.core.lang.q.notNull(it);
        this.filter = a0Var;
    }

    private boolean setNextObject() {
        while (this.iterator.hasNext()) {
            Object next = this.iterator.next();
            cn.hutool.core.lang.a0 a0Var = this.filter;
            if (a0Var == null || a0Var.accept(next)) {
                this.nextObject = next;
                this.nextObjectSet = true;
                return true;
            }
        }
        return false;
    }

    public cn.hutool.core.lang.a0 getFilter() {
        return this.filter;
    }

    public Iterator<Object> getIterator() {
        return this.iterator;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.nextObjectSet || setNextObject();
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.nextObjectSet && !setNextObject()) {
            throw new NoSuchElementException();
        }
        this.nextObjectSet = false;
        return this.nextObject;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.nextObjectSet) {
            throw new IllegalStateException("remove() cannot be called");
        }
        this.iterator.remove();
    }
}
