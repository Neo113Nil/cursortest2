package L;

import f0.AbstractC0577H;
import f0.C0575F;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class h implements Iterator, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3477d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f3478e;

    public h(e eVar) {
        n[] nVarArr = new n[8];
        for (int i2 = 0; i2 < 8; i2++) {
            nVarArr[i2] = new p(this);
        }
        this.f3478e = new f(eVar, nVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3477d) {
            case 0:
                return ((f) this.f3478e).f3464i;
            default:
                return this.f3478e.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3477d) {
            case 0:
                return (Map.Entry) ((f) this.f3478e).next();
            default:
                return (AbstractC0577H) this.f3478e.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3477d) {
            case 0:
                ((f) this.f3478e).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(C0575F c0575f) {
        this.f3478e = c0575f.f6304p.iterator();
    }
}
