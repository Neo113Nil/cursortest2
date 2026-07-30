package y6;

import d6.z;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g implements Iterator, h6.d, s6.a {

    /* renamed from: f, reason: collision with root package name */
    public int f9909f;

    /* renamed from: g, reason: collision with root package name */
    public Object f9910g;

    /* renamed from: h, reason: collision with root package name */
    public h6.d f9911h;

    public final RuntimeException a() {
        int i7 = this.f9909f;
        if (i7 == 4) {
            return new NoSuchElementException();
        }
        if (i7 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f9909f);
    }

    public final void b(Object obj, j6.h hVar) {
        this.f9910g = obj;
        this.f9909f = 3;
        this.f9911h = hVar;
    }

    @Override // h6.d
    public final h6.i getContext() {
        return h6.j.f4661f;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7;
        while (true) {
            i7 = this.f9909f;
            if (i7 != 0) {
                break;
            }
            this.f9909f = 5;
            h6.d dVar = this.f9911h;
            r6.k.c(dVar);
            this.f9911h = null;
            dVar.resumeWith(z.f2639a);
        }
        if (i7 == 1) {
            r6.k.c(null);
            throw null;
        }
        if (i7 == 2 || i7 == 3) {
            return true;
        }
        if (i7 == 4) {
            return false;
        }
        throw a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f9909f;
        if (i7 == 0 || i7 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i7 == 2) {
            this.f9909f = 1;
            r6.k.c(null);
            throw null;
        }
        if (i7 != 3) {
            throw a();
        }
        this.f9909f = 0;
        Object obj = this.f9910g;
        this.f9910g = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // h6.d
    public final void resumeWith(Object obj) {
        d6.a.e(obj);
        this.f9909f = 4;
    }
}
