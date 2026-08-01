package kotlin.collections;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h implements Iterator, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5565d;

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f5566e;

    public h(x0.g gVar) {
        this.f5565d = 3;
        u0.j[] jVarArr = new u0.j[8];
        for (int i3 = 0; i3 < 8; i3++) {
            jVarArr[i3] = new u0.l(this);
        }
        this.f5566e = new u0.d(gVar, jVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5565d) {
            case 0:
                return this.f5566e.hasNext();
            case 1:
                return this.f5566e.hasNext();
            case 2:
                return this.f5566e.hasNext();
            default:
                return ((u0.d) this.f5566e).f9581i;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5565d) {
            case 0:
                return ((Map.Entry) this.f5566e.next()).getKey();
            case 1:
                return ((Map.Entry) this.f5566e.next()).getValue();
            case 2:
                return (q1.h0) this.f5566e.next();
            default:
                return (Map.Entry) ((u0.d) this.f5566e).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5565d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((u0.d) this.f5566e).remove();
                return;
        }
    }

    public /* synthetic */ h(Iterator it, int i3) {
        this.f5565d = i3;
        this.f5566e = it;
    }

    public h(q1.f0 f0Var) {
        this.f5565d = 2;
        this.f5566e = f0Var.f7865x.iterator();
    }
}
