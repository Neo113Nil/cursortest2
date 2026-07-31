package g2;

import a2.InterfaceC0184a;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class m implements Iterator, InterfaceC0184a {

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f4856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f4857e;

    public m(l lVar) {
        this.f4857e = lVar;
        this.f4856d = ((InterfaceC0410f) lVar.f4854b).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4856d.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Y1.c, Z1.j] */
    @Override // java.util.Iterator
    public final Object next() {
        return this.f4857e.f4855c.j(this.f4856d.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
