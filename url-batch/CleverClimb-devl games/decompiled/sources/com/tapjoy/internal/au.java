package com.tapjoy.internal;

import java.io.Closeable;
import java.io.Flushable;
import java.util.LinkedList;

/* loaded from: classes2.dex */
public final class au extends at implements ax, Closeable, Flushable {

    /* renamed from: a, reason: collision with root package name */
    private final ax f7836a;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedList f7837b = new LinkedList();

    /* renamed from: c, reason: collision with root package name */
    private final LinkedList f7838c = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    private int f7839d;
    private boolean e;

    public static au a(ax axVar) {
        return new au(axVar);
    }

    private au(ax axVar) {
        this.f7836a = axVar;
        this.f7839d = axVar.size();
        this.e = this.f7839d == 0;
    }

    protected final void finalize() {
        close();
        super.finalize();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            flush();
        } finally {
            if (this.f7836a instanceof Closeable) {
                ((Closeable) this.f7836a).close();
            }
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f7838c.isEmpty()) {
            return;
        }
        this.f7836a.addAll(this.f7838c);
        if (this.e) {
            this.f7837b.addAll(this.f7838c);
        }
        this.f7838c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f7839d;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        this.f7838c.add(obj);
        this.f7839d++;
        return true;
    }

    @Override // java.util.Queue
    public final Object poll() {
        Object remove;
        if (this.f7839d <= 0) {
            return null;
        }
        if (!this.f7837b.isEmpty()) {
            remove = this.f7837b.remove();
            this.f7836a.b(1);
        } else if (this.e) {
            remove = this.f7838c.remove();
        } else {
            remove = this.f7836a.remove();
            if (this.f7839d == this.f7838c.size() + 1) {
                this.e = true;
            }
        }
        this.f7839d--;
        return remove;
    }

    @Override // java.util.Queue
    public final Object peek() {
        if (this.f7839d <= 0) {
            return null;
        }
        if (!this.f7837b.isEmpty()) {
            return this.f7837b.element();
        }
        if (this.e) {
            return this.f7838c.element();
        }
        Object peek = this.f7836a.peek();
        this.f7837b.add(peek);
        if (this.f7839d == this.f7837b.size() + this.f7838c.size()) {
            this.e = true;
        }
        return peek;
    }

    @Override // com.tapjoy.internal.ax
    public final Object a(int i) {
        if (i < 0 || i >= this.f7839d) {
            throw new IndexOutOfBoundsException();
        }
        int size = this.f7837b.size();
        if (i < size) {
            return this.f7837b.get(i);
        }
        if (this.e) {
            return this.f7838c.get(i - size);
        }
        if (i < this.f7836a.size()) {
            Object obj = null;
            while (size <= i) {
                obj = this.f7836a.a(size);
                this.f7837b.add(obj);
                size++;
            }
            if (i + 1 + this.f7838c.size() == this.f7839d) {
                this.e = true;
            }
            return obj;
        }
        return this.f7838c.get(i - this.f7836a.size());
    }

    @Override // com.tapjoy.internal.ax
    public final void b(int i) {
        if (i <= 0 || i > this.f7839d) {
            throw new IndexOutOfBoundsException();
        }
        if (i <= this.f7837b.size()) {
            aw.a(this.f7837b, i);
            this.f7836a.b(i);
        } else {
            this.f7837b.clear();
            int size = (this.f7838c.size() + i) - this.f7839d;
            if (size < 0) {
                this.f7836a.b(i);
            } else {
                this.f7836a.clear();
                this.e = true;
                if (size > 0) {
                    aw.a(this.f7838c, size);
                }
            }
        }
        this.f7839d -= i;
    }
}
