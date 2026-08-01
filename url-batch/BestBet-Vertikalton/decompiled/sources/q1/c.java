package q1;

import Y0.q;
import c.C0085c;
import java.util.Iterator;
import java.util.NoSuchElementException;
import l1.InterfaceC0284a;

/* loaded from: classes.dex */
public final class c implements Iterator, InterfaceC0284a {

    /* renamed from: a, reason: collision with root package name */
    public Object f3815a;

    /* renamed from: b, reason: collision with root package name */
    public int f3816b = -2;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f3817c;

    public c(q qVar) {
        this.f3817c = qVar;
    }

    public final void a() {
        Object g2;
        int i = this.f3816b;
        q qVar = this.f3817c;
        if (i == -2) {
            qVar.getClass();
            g2 = C0085c.f2055b.c();
        } else {
            h hVar = (h) qVar.f1514b;
            Object obj = this.f3815a;
            k1.e.b(obj);
            g2 = hVar.g(obj);
        }
        this.f3815a = g2;
        this.f3816b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3816b < 0) {
            a();
        }
        return this.f3816b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3816b < 0) {
            a();
        }
        if (this.f3816b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f3815a;
        k1.e.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f3816b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
