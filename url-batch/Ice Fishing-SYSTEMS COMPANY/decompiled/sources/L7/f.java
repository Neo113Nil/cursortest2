package L7;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class f implements Iterator, F7.a {

    /* renamed from: n, reason: collision with root package name */
    public Object f1803n;

    /* renamed from: u, reason: collision with root package name */
    public int f1804u = -2;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f1805v;

    public f(g gVar) {
        this.f1805v = gVar;
    }

    public final void a() {
        Object invoke;
        int i = this.f1804u;
        g gVar = this.f1805v;
        if (i == -2) {
            gVar.getClass();
            invoke = Integer.valueOf(H7.e.f1218n.a() + com.anythink.basead.exoplayer.b.aX);
        } else {
            j jVar = (j) gVar.f1807b;
            Object obj = this.f1803n;
            kotlin.jvm.internal.h.b(obj);
            invoke = jVar.invoke(obj);
        }
        this.f1803n = invoke;
        this.f1804u = invoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f1804u < 0) {
            a();
        }
        return this.f1804u == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f1804u < 0) {
            a();
        }
        if (this.f1804u == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f1803n;
        kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f1804u = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
