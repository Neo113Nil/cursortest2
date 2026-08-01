package d1;

import O0.o;
import c.C0100g;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c implements Iterator, Y0.a {

    /* renamed from: a, reason: collision with root package name */
    public Object f2096a;

    /* renamed from: b, reason: collision with root package name */
    public int f2097b = -2;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f2098c;

    public c(o oVar) {
        this.f2098c = oVar;
    }

    public final void a() {
        Object c2;
        int i = this.f2097b;
        o oVar = this.f2098c;
        if (i == -2) {
            oVar.getClass();
            c2 = C0100g.f1656b.a();
        } else {
            e eVar = (e) oVar.f693b;
            Object obj = this.f2096a;
            X0.f.b(obj);
            c2 = eVar.c(obj);
        }
        this.f2096a = c2;
        this.f2097b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2097b < 0) {
            a();
        }
        return this.f2097b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2097b < 0) {
            a();
        }
        if (this.f2097b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f2096a;
        X0.f.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f2097b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
