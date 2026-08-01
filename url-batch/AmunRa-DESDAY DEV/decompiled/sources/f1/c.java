package f1;

import R0.o;
import c.C0080c;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c implements Iterator, a1.a {

    /* renamed from: a, reason: collision with root package name */
    public Object f2256a;

    /* renamed from: b, reason: collision with root package name */
    public int f2257b = -2;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f2258c;

    public c(o oVar) {
        this.f2258c = oVar;
    }

    public final void a() {
        Object c2;
        int i = this.f2257b;
        o oVar = this.f2258c;
        if (i == -2) {
            oVar.getClass();
            c2 = C0080c.f1547b.a();
        } else {
            e eVar = (e) oVar.f710b;
            Object obj = this.f2256a;
            Z0.d.b(obj);
            c2 = eVar.c(obj);
        }
        this.f2256a = c2;
        this.f2257b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2257b < 0) {
            a();
        }
        return this.f2257b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2257b < 0) {
            a();
        }
        if (this.f2257b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f2256a;
        Z0.d.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f2257b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
