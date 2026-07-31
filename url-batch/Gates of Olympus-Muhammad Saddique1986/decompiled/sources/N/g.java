package N;

import g2.InterfaceC0439a;
import h0.AbstractC0455H;
import h0.C0453F;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class g implements Iterator, InterfaceC0439a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3514d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f3515e;

    public g(Q.c cVar) {
        n[] nVarArr = new n[8];
        for (int i3 = 0; i3 < 8; i3++) {
            nVarArr[i3] = new p(this);
        }
        this.f3515e = new e(cVar, nVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3514d) {
            case 0:
                return ((e) this.f3515e).f3507f;
            default:
                return this.f3515e.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3514d) {
            case 0:
                return (Map.Entry) ((e) this.f3515e).next();
            default:
                return (AbstractC0455H) this.f3515e.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3514d) {
            case 0:
                ((e) this.f3515e).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(C0453F c0453f) {
        this.f3515e = c0453f.f5880m.iterator();
    }
}
