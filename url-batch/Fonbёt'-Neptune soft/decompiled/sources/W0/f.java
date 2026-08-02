package W0;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class f implements Iterator, R0.a {

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f1116e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f1117f;

    public f(g gVar) {
        this.f1117f = gVar;
        this.f1116e = new X0.a(gVar.f1118a);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1116e.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f1117f.f1119b.i(this.f1116e.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
