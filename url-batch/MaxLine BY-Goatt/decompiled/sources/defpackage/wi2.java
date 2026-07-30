package defpackage;

import defpackage.aa2;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wi2 extends xi2 implements Iterator, o30, k71 {
    public int m;
    public Object n;
    public o30 o;

    @Override // defpackage.xi2
    public final void a(Object obj, z92 z92Var) {
        this.n = obj;
        this.m = 3;
        this.o = z92Var;
        b50 b50Var = b50.m;
    }

    public final RuntimeException b() {
        int i = this.m;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.m);
    }

    @Override // defpackage.o30
    public final CoroutineContext getContext() {
        return h.m;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.m;
            if (i != 0) {
                break;
            }
            this.m = 5;
            o30 o30Var = this.o;
            o30Var.getClass();
            this.o = null;
            Unit unit = Unit.a;
            aa2.a aVar = aa2.m;
            o30Var.resumeWith(unit);
        }
        if (i == 1) {
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw b();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.m;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            b71.f();
            return null;
        }
        if (i == 2) {
            this.m = 1;
            throw null;
        }
        if (i != 3) {
            throw b();
        }
        this.m = 0;
        Object obj = this.n;
        this.n = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.o30
    public final void resumeWith(Object obj) {
        ca2.b(obj);
        this.m = 4;
    }
}
