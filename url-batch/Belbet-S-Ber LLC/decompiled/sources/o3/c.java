package o3;

import a.a0;
import a.g0;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c implements Iterator, j3.a {

    /* renamed from: f, reason: collision with root package name */
    public Object f3026f;

    /* renamed from: g, reason: collision with root package name */
    public int f3027g = -2;
    public final /* synthetic */ d h;

    public c(d dVar) {
        this.h = dVar;
    }

    public final void a() {
        Object b2;
        int i = this.f3027g;
        d dVar = this.h;
        if (i == -2) {
            b2 = ((a0) dVar.f3029b).a();
        } else {
            g0 g0Var = (g0) dVar.f3030c;
            Object obj = this.f3026f;
            i3.d.b(obj);
            b2 = g0Var.b(obj);
        }
        this.f3026f = b2;
        this.f3027g = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3027g < 0) {
            a();
        }
        return this.f3027g == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3027g < 0) {
            a();
        }
        if (this.f3027g == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f3026f;
        i3.d.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f3027g = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
