package n1;

import A1.m;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class e implements Iterator, Y0.a, i1.a {

    /* renamed from: a, reason: collision with root package name */
    public int f3390a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3391b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f3392c;
    public Y0.a d;

    @Override // Y0.a
    public final void a(Object obj) {
        m.k0(obj);
        this.f3390a = 4;
    }

    public final RuntimeException b() {
        int i = this.f3390a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f3390a);
    }

    @Override // Y0.a
    public final Y0.b f() {
        return Y0.b.f988a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f3390a;
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
                Iterator it = this.f3392c;
                h1.d.b(it);
                if (it.hasNext()) {
                    this.f3390a = 2;
                    return true;
                }
                this.f3392c = null;
            }
            this.f3390a = 5;
            Y0.a aVar = this.d;
            h1.d.b(aVar);
            this.d = null;
            aVar.a(V0.e.f946c);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f3390a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f3390a = 1;
            Iterator it = this.f3392c;
            h1.d.b(it);
            return it.next();
        }
        if (i != 3) {
            throw b();
        }
        this.f3390a = 0;
        Object obj = this.f3391b;
        this.f3391b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
