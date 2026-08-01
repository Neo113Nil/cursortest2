package j1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import w1.l;

/* loaded from: classes.dex */
public final class e implements Iterator, U0.a, e1.a {

    /* renamed from: a, reason: collision with root package name */
    public int f2604a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2605b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f2606c;
    public U0.a d;

    @Override // U0.a
    public final void a(Object obj) {
        l.Z(obj);
        this.f2604a = 4;
    }

    public final RuntimeException b() {
        int i = this.f2604a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f2604a);
    }

    @Override // U0.a
    public final U0.b f() {
        return U0.b.f888a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f2604a;
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
                Iterator it = this.f2606c;
                d1.d.b(it);
                if (it.hasNext()) {
                    this.f2604a = 2;
                    return true;
                }
                this.f2606c = null;
            }
            this.f2604a = 5;
            U0.a aVar = this.d;
            d1.d.b(aVar);
            this.d = null;
            aVar.a(R0.f.f780c);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f2604a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f2604a = 1;
            Iterator it = this.f2606c;
            d1.d.b(it);
            return it.next();
        }
        if (i != 3) {
            throw b();
        }
        this.f2604a = 0;
        Object obj = this.f2605b;
        this.f2605b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
