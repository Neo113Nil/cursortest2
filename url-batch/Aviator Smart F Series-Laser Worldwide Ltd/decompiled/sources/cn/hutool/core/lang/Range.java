package cn.hutool.core.lang;

import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class Range<T> implements Iterable<T>, Iterator<T>, Serializable {
    private static final long serialVersionUID = 1;
    private final T end;
    private final boolean includeEnd;
    private final boolean includeStart;
    private int index;
    private Lock lock;
    private T next;
    private final T start;
    private final a stepper;

    public interface a {
        Object step(Object obj, Object obj2, int i8);
    }

    public Range(T t7, a aVar) {
        this(t7, null, aVar);
    }

    private T nextUncheck() {
        T t7;
        int i8 = this.index;
        if (i8 == 0) {
            t7 = this.start;
            if (!this.includeStart) {
                this.index = i8 + 1;
                return nextUncheck();
            }
        } else {
            t7 = this.next;
            this.next = safeStep(t7);
        }
        this.index++;
        return t7;
    }

    private T safeStep(T t7) {
        try {
            return (T) this.stepper.step(t7, this.end, this.index);
        } catch (Exception unused) {
            return null;
        }
    }

    public Range<T> disableLock() {
        this.lock = new u.a();
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if (r0.equals(r4.end) != false) goto L14;
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean hasNext() {
        this.lock.lock();
        try {
            if (this.index == 0 && this.includeStart) {
                return true;
            }
            T t7 = this.next;
            if (t7 != null) {
                if (!this.includeEnd) {
                }
                return true;
            }
            return false;
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public T next() {
        this.lock.lock();
        try {
            if (hasNext()) {
                return nextUncheck();
            }
            throw new NoSuchElementException("Has no next range!");
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Can not remove ranged element!");
    }

    public Range<T> reset() {
        this.lock.lock();
        try {
            this.index = 0;
            this.next = safeStep(this.start);
            return this;
        } finally {
            this.lock.unlock();
        }
    }

    public Range(T t7, T t8, a aVar) {
        this(t7, t8, aVar, true, true);
    }

    public Range(T t7, T t8, a aVar, boolean z7, boolean z8) {
        this.lock = new ReentrantLock();
        this.index = 0;
        q.notNull(t7, "First element must be not null!", new Object[0]);
        this.start = t7;
        this.end = t8;
        this.stepper = aVar;
        this.next = safeStep(t7);
        this.includeStart = z7;
        this.includeEnd = z8;
    }
}
