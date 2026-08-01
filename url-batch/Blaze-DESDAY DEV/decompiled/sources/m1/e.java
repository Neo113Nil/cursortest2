package m1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import z1.l;

/* loaded from: classes.dex */
public final class e implements Iterator, X0.a, h1.a {

    /* renamed from: a, reason: collision with root package name */
    public int f3218a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3219b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f3220c;
    public X0.a d;

    @Override // X0.a
    public final void a(Object obj) {
        l.a0(obj);
        this.f3218a = 4;
    }

    public final RuntimeException b() {
        int i = this.f3218a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f3218a);
    }

    @Override // X0.a
    public final X0.b f() {
        return X0.b.f945a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f3218a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw b();
                }
                Iterator it = this.f3220c;
                g1.d.b(it);
                if (it.hasNext()) {
                    this.f3218a = 2;
                    return true;
                }
                this.f3220c = null;
            }
            this.f3218a = 5;
            X0.a aVar = this.d;
            g1.d.b(aVar);
            this.d = null;
            aVar.a(U0.f.f904c);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f3218a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f3218a = 1;
            Iterator it = this.f3220c;
            g1.d.b(it);
            return it.next();
        }
        if (i != 3) {
            throw b();
        }
        this.f3218a = 0;
        Object obj = this.f3219b;
        this.f3219b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
