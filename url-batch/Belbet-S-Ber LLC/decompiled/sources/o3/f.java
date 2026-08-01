package o3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f implements Iterator, a3.a, j3.a {

    /* renamed from: f, reason: collision with root package name */
    public int f3031f;

    /* renamed from: g, reason: collision with root package name */
    public Object f3032g;
    public Iterator h;
    public a3.a i;

    @Override // a3.a
    public final a3.b a() {
        return a3.b.f137f;
    }

    @Override // a3.a
    public final void b(Object obj) {
        r1.b.C(obj);
        this.f3031f = 4;
    }

    public final RuntimeException c() {
        int i = this.f3031f;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f3031f);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f3031f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw c();
                }
                Iterator it = this.h;
                i3.d.b(it);
                if (it.hasNext()) {
                    this.f3031f = 2;
                    return true;
                }
                this.h = null;
            }
            this.f3031f = 5;
            a3.a aVar = this.i;
            i3.d.b(aVar);
            this.i = null;
            aVar.b(w2.d.f3820c);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f3031f;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f3031f = 1;
            Iterator it = this.h;
            i3.d.b(it);
            return it.next();
        }
        if (i != 3) {
            throw c();
        }
        this.f3031f = 0;
        Object obj = this.f3032g;
        this.f3032g = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
