package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class fj0 implements Iterator, pw {
    public final Iterator f;
    public final /* synthetic */ ij g;

    public fj0(ij ijVar) {
        this.g = ijVar;
        this.f = ((cd) ijVar.b).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((h) this.g.c).h(this.f.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
