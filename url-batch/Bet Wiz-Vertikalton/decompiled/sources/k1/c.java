package k1;

import W0.o;
import c.C0079c;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c implements Iterator, f1.a {

    /* renamed from: a, reason: collision with root package name */
    public Object f2823a;

    /* renamed from: b, reason: collision with root package name */
    public int f2824b = -2;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f2825c;

    public c(o oVar) {
        this.f2825c = oVar;
    }

    public final void a() {
        Object c2;
        int i = this.f2824b;
        o oVar = this.f2825c;
        if (i == -2) {
            oVar.getClass();
            c2 = C0079c.f1614b.a();
        } else {
            e eVar = (e) oVar.f894b;
            Object obj = this.f2823a;
            e1.d.b(obj);
            c2 = eVar.c(obj);
        }
        this.f2823a = c2;
        this.f2824b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2824b < 0) {
            a();
        }
        return this.f2824b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2824b < 0) {
            a();
        }
        if (this.f2824b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f2823a;
        e1.d.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f2824b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
