package x6;

import c6.m;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f implements Iterator, g6.c, r6.a {

    /* renamed from: d, reason: collision with root package name */
    public int f8672d;

    /* renamed from: e, reason: collision with root package name */
    public Object f8673e;

    /* renamed from: f, reason: collision with root package name */
    public g6.c f8674f;

    public final RuntimeException a() {
        int i = this.f8672d;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f8672d);
    }

    public final void b(Object obj, i6.h hVar) {
        this.f8673e = obj;
        this.f8672d = 3;
        this.f8674f = hVar;
    }

    @Override // g6.c
    public final g6.h f() {
        return g6.i.f3046d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.f8672d;
            if (i != 0) {
                break;
            }
            this.f8672d = 5;
            g6.c cVar = this.f8674f;
            q6.i.b(cVar);
            this.f8674f = null;
            cVar.k(m.f1757a);
        }
        if (i == 1) {
            q6.i.b(null);
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw a();
    }

    @Override // g6.c
    public final void k(Object obj) {
        s6.a.K(obj);
        this.f8672d = 4;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f8672d;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f8672d = 1;
            q6.i.b(null);
            throw null;
        }
        if (i != 3) {
            throw a();
        }
        this.f8672d = 0;
        Object obj = this.f8673e;
        this.f8673e = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
