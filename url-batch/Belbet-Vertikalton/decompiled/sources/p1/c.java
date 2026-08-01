package p1;

import X0.r;
import d.C0112c;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c implements Iterator, k1.a {

    /* renamed from: a, reason: collision with root package name */
    public Object f3879a;

    /* renamed from: b, reason: collision with root package name */
    public int f3880b = -2;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f3881c;

    public c(r rVar) {
        this.f3881c = rVar;
    }

    public final void a() {
        Object g2;
        int i = this.f3880b;
        r rVar = this.f3881c;
        if (i == -2) {
            rVar.getClass();
            g2 = C0112c.f2645b.c();
        } else {
            g gVar = (g) rVar.f1383b;
            Object obj = this.f3879a;
            j1.h.b(obj);
            g2 = gVar.g(obj);
        }
        this.f3879a = g2;
        this.f3880b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3880b < 0) {
            a();
        }
        return this.f3880b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3880b < 0) {
            a();
        }
        if (this.f3880b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f3879a;
        j1.h.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f3880b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
