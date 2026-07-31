package N;

import a2.InterfaceC0184a;
import h0.F;
import h0.H;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class g implements Iterator, InterfaceC0184a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2832d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f2833e;

    public g(Q.c cVar) {
        n[] nVarArr = new n[8];
        for (int i3 = 0; i3 < 8; i3++) {
            nVarArr[i3] = new p(this);
        }
        this.f2833e = new e(cVar, nVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2832d) {
            case 0:
                return ((e) this.f2833e).f2825f;
            default:
                return this.f2833e.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2832d) {
            case 0:
                return (Map.Entry) ((e) this.f2833e).next();
            default:
                return (H) this.f2833e.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2832d) {
            case 0:
                ((e) this.f2833e).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(F f3) {
        this.f2833e = f3.f4892m.iterator();
    }
}
