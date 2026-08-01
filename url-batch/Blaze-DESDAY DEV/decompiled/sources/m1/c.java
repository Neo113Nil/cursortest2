package m1;

import V0.n;
import c.C0085c;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c implements Iterator, h1.a {

    /* renamed from: a, reason: collision with root package name */
    public Object f3215a;

    /* renamed from: b, reason: collision with root package name */
    public int f3216b = -2;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f3217c;

    public c(n nVar) {
        this.f3217c = nVar;
    }

    public final void a() {
        Object e2;
        int i = this.f3216b;
        n nVar = this.f3217c;
        if (i == -2) {
            nVar.getClass();
            e2 = C0085c.f1667b.b();
        } else {
            f fVar = (f) nVar.f915b;
            Object obj = this.f3215a;
            g1.d.b(obj);
            e2 = fVar.e(obj);
        }
        this.f3215a = e2;
        this.f3216b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3216b < 0) {
            a();
        }
        return this.f3216b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3216b < 0) {
            a();
        }
        if (this.f3216b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f3215a;
        g1.d.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f3216b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
