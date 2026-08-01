package d1;

import Q0.o;
import c.C0079c;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c implements Iterator, Y0.a {

    /* renamed from: a, reason: collision with root package name */
    public Object f1909a;

    /* renamed from: b, reason: collision with root package name */
    public int f1910b = -2;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f1911c;

    public c(o oVar) {
        this.f1911c = oVar;
    }

    public final void a() {
        Object c2;
        int i = this.f1910b;
        o oVar = this.f1911c;
        if (i == -2) {
            oVar.getClass();
            c2 = C0079c.f1515b.a();
        } else {
            e eVar = (e) oVar.f669b;
            Object obj = this.f1909a;
            X0.d.b(obj);
            c2 = eVar.c(obj);
        }
        this.f1909a = c2;
        this.f1910b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f1910b < 0) {
            a();
        }
        return this.f1910b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f1910b < 0) {
            a();
        }
        if (this.f1910b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f1909a;
        X0.d.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f1910b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
