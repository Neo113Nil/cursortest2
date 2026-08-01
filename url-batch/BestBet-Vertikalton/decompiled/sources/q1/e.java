package q1;

import H1.l;
import b1.k;
import java.util.Iterator;
import java.util.NoSuchElementException;
import l1.InterfaceC0284a;

/* loaded from: classes.dex */
public final class e implements Iterator, b1.d, InterfaceC0284a {

    /* renamed from: a, reason: collision with root package name */
    public int f3818a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3819b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f3820c;
    public b1.d d;

    public final RuntimeException a() {
        int i = this.f3818a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f3818a);
    }

    @Override // b1.d
    public final void b(Object obj) {
        l.h0(obj);
        this.f3818a = 4;
    }

    @Override // b1.d
    public final b1.j h() {
        return k.f2050a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f3818a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw a();
                }
                Iterator it = this.f3820c;
                k1.e.b(it);
                if (it.hasNext()) {
                    this.f3818a = 2;
                    return true;
                }
                this.f3820c = null;
            }
            this.f3818a = 5;
            b1.d dVar = this.d;
            k1.e.b(dVar);
            this.d = null;
            dVar.b(X0.g.f1277c);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f3818a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f3818a = 1;
            Iterator it = this.f3820c;
            k1.e.b(it);
            return it.next();
        }
        if (i != 3) {
            throw a();
        }
        this.f3818a = 0;
        Object obj = this.f3819b;
        this.f3819b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
