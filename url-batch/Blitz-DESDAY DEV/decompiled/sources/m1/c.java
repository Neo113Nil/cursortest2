package m1;

import X0.q;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c implements Iterator, h1.a {

    /* renamed from: a, reason: collision with root package name */
    public Object f3209a;

    /* renamed from: b, reason: collision with root package name */
    public int f3210b = -2;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f3211c;

    public c(q qVar) {
        this.f3211c = qVar;
    }

    public final void a() {
        Object c2;
        int i = this.f3210b;
        q qVar = this.f3211c;
        if (i == -2) {
            qVar.getClass();
            c2 = c.c.f1717b.a();
        } else {
            e eVar = (e) qVar.f990b;
            Object obj = this.f3209a;
            g1.d.b(obj);
            c2 = eVar.c(obj);
        }
        this.f3209a = c2;
        this.f3210b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3210b < 0) {
            a();
        }
        return this.f3210b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3210b < 0) {
            a();
        }
        if (this.f3210b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f3209a;
        g1.d.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f3210b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
