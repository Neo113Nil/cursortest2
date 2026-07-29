package d1;

import Q0.k;
import c.C0079c;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c implements Iterator, Y0.a {

    /* renamed from: a, reason: collision with root package name */
    public Object f1905a;

    /* renamed from: b, reason: collision with root package name */
    public int f1906b = -2;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f1907c;

    public c(k kVar) {
        this.f1907c = kVar;
    }

    public final void a() {
        Object c2;
        int i = this.f1906b;
        k kVar = this.f1907c;
        if (i == -2) {
            kVar.getClass();
            c2 = C0079c.f1512b.a();
        } else {
            e eVar = (e) kVar.f663b;
            Object obj = this.f1905a;
            X0.e.b(obj);
            c2 = eVar.c(obj);
        }
        this.f1905a = c2;
        this.f1906b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f1906b < 0) {
            a();
        }
        return this.f1906b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f1906b < 0) {
            a();
        }
        if (this.f1906b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f1905a;
        X0.e.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f1906b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
