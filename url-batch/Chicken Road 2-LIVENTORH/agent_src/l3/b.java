package l3;

import a.e0;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b implements Iterator, g3.a {

    /* renamed from: f, reason: collision with root package name */
    public Object f2674f;

    /* renamed from: g, reason: collision with root package name */
    public int f2675g = -2;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f2676h;

    public b(c cVar) {
        this.f2676h = cVar;
    }

    public final void a() {
        Object b4;
        int i = this.f2675g;
        c cVar = this.f2676h;
        if (i == -2) {
            b4 = cVar.f2677a.a();
        } else {
            e0 e0Var = cVar.f2678b;
            Object obj = this.f2674f;
            f3.d.b(obj);
            b4 = e0Var.b(obj);
        }
        this.f2674f = b4;
        this.f2675g = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2675g < 0) {
            a();
        }
        return this.f2675g == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2675g < 0) {
            a();
        }
        if (this.f2675g == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f2674f;
        f3.d.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f2675g = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
