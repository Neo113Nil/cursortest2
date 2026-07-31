package m2;

import R1.y;
import g2.InterfaceC0439a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: m2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0657g implements Iterator, V1.d, InterfaceC0439a {

    /* renamed from: d, reason: collision with root package name */
    public int f7003d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7004e;

    /* renamed from: f, reason: collision with root package name */
    public V1.d f7005f;

    public final RuntimeException a() {
        int i3 = this.f7003d;
        if (i3 == 4) {
            return new NoSuchElementException();
        }
        if (i3 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f7003d);
    }

    public final void b(Object obj, X1.h hVar) {
        this.f7004e = obj;
        this.f7003d = 3;
        this.f7005f = hVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i3;
        while (true) {
            i3 = this.f7003d;
            if (i3 != 0) {
                break;
            }
            this.f7003d = 5;
            V1.d dVar = this.f7005f;
            f2.j.c(dVar);
            this.f7005f = null;
            dVar.u(y.f4171a);
        }
        if (i3 == 1) {
            f2.j.c(null);
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
        int i3 = this.f7003d;
        if (i3 == 0 || i3 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i3 == 2) {
            this.f7003d = 1;
            f2.j.c(null);
            throw null;
        }
        if (i3 != 3) {
            throw a();
        }
        this.f7003d = 0;
        Object obj = this.f7004e;
        this.f7004e = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // V1.d
    public final V1.i t() {
        return V1.j.f4558d;
    }

    @Override // V1.d
    public final void u(Object obj) {
        R1.a.e(obj);
        this.f7003d = 4;
    }
}
