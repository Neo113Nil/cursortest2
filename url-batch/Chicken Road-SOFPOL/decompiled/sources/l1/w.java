package l1;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class w implements Iterator, r6.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4823d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f4824e;

    public w(u0.f fVar) {
        r0.k[] kVarArr = new r0.k[8];
        for (int i = 0; i < 8; i++) {
            kVarArr[i] = new r0.m(this);
        }
        this.f4824e = new r0.d(fVar, kVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4823d) {
            case 0:
                return this.f4824e.hasNext();
            default:
                return ((r0.d) this.f4824e).f6478f;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4823d) {
            case 0:
                return (z) this.f4824e.next();
            default:
                return (Map.Entry) ((r0.d) this.f4824e).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4823d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((r0.d) this.f4824e).remove();
                return;
        }
    }

    public w(x xVar) {
        this.f4824e = xVar.f4826e.iterator();
    }
}
