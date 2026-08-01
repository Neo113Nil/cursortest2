package m1;

import c.C0085c;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, h1.a {

    /* renamed from: a, reason: collision with root package name */
    public Object f3097a;

    /* renamed from: b, reason: collision with root package name */
    public int f3098b = -2;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f3099c;

    public b(c cVar) {
        this.f3099c = cVar;
    }

    public final void a() {
        Object g2;
        int i = this.f3098b;
        c cVar = this.f3099c;
        if (i == -2) {
            cVar.getClass();
            g2 = C0085c.f1707b.c();
        } else {
            g gVar = (g) cVar.f3101b;
            Object obj = this.f3097a;
            g1.f.b(obj);
            g2 = gVar.g(obj);
        }
        this.f3097a = g2;
        this.f3098b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3098b < 0) {
            a();
        }
        return this.f3098b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3098b < 0) {
            a();
        }
        if (this.f3098b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f3097a;
        g1.f.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f3098b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
