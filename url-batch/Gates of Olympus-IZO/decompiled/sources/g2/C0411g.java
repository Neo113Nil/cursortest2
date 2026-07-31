package g2;

import L1.z;
import a2.InterfaceC0184a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: g2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0411g implements Iterator, P1.d, InterfaceC0184a {

    /* renamed from: d, reason: collision with root package name */
    public int f4848d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4849e;

    /* renamed from: f, reason: collision with root package name */
    public P1.d f4850f;

    public final RuntimeException a() {
        int i3 = this.f4848d;
        if (i3 == 4) {
            return new NoSuchElementException();
        }
        if (i3 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f4848d);
    }

    public final void b(Object obj, R1.h hVar) {
        this.f4849e = obj;
        this.f4848d = 3;
        this.f4850f = hVar;
        Q1.a aVar = Q1.a.f3113d;
    }

    @Override // P1.d
    public final P1.i getContext() {
        return P1.j.f3073d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i3;
        while (true) {
            i3 = this.f4848d;
            if (i3 != 0) {
                break;
            }
            this.f4848d = 5;
            P1.d dVar = this.f4850f;
            Z1.i.c(dVar);
            this.f4850f = null;
            dVar.resumeWith(z.f2729a);
        }
        if (i3 == 1) {
            Z1.i.c(null);
            throw null;
        }
        if (i3 == 2 || i3 == 3) {
            return true;
        }
        if (i3 == 4) {
            return false;
        }
        throw a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i3 = this.f4848d;
        if (i3 == 0 || i3 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i3 == 2) {
            this.f4848d = 1;
            Z1.i.c(null);
            throw null;
        }
        if (i3 != 3) {
            throw a();
        }
        this.f4848d = 0;
        Object obj = this.f4849e;
        this.f4849e = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // P1.d
    public final void resumeWith(Object obj) {
        I2.l.Q(obj);
        this.f4848d = 4;
    }
}
