package j1;

import S0.n;
import c.C0083c;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c implements Iterator, e1.a {

    /* renamed from: a, reason: collision with root package name */
    public Object f2601a;

    /* renamed from: b, reason: collision with root package name */
    public int f2602b = -2;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f2603c;

    public c(n nVar) {
        this.f2603c = nVar;
    }

    public final void a() {
        Object e2;
        int i = this.f2602b;
        n nVar = this.f2603c;
        if (i == -2) {
            nVar.getClass();
            e2 = C0083c.f1637b.b();
        } else {
            f fVar = (f) nVar.f793b;
            Object obj = this.f2601a;
            d1.d.b(obj);
            e2 = fVar.e(obj);
        }
        this.f2601a = e2;
        this.f2602b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2602b < 0) {
            a();
        }
        return this.f2602b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2602b < 0) {
            a();
        }
        if (this.f2602b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f2601a;
        d1.d.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f2602b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
