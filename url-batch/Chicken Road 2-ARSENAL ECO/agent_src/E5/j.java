package E5;

import java.util.Iterator;
import y5.InterfaceC0766a;

/* loaded from: classes.dex */
public final class j implements Iterator, InterfaceC0766a {

    /* renamed from: f, reason: collision with root package name */
    public final Iterator f703f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f704g;

    public j(e eVar) {
        this.f704g = eVar;
        this.f703f = eVar.f698c.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f703f.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f704g.f697b.invoke(this.f703f.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
