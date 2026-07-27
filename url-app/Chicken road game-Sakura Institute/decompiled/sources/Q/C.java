package Q;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class C implements Iterator, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public final y f3802d;

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f3803e;

    /* renamed from: i, reason: collision with root package name */
    public int f3804i;

    /* renamed from: j, reason: collision with root package name */
    public Map.Entry f3805j;

    /* renamed from: k, reason: collision with root package name */
    public Map.Entry f3806k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3807l;

    public C(y yVar, Iterator it, int i2) {
        this.f3807l = i2;
        this.f3802d = yVar;
        this.f3803e = it;
        this.f3804i = yVar.b().f3900d;
        b();
    }

    public final void b() {
        this.f3805j = this.f3806k;
        Iterator it = this.f3803e;
        this.f3806k = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3806k != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3807l) {
            case 0:
                b();
                if (this.f3805j != null) {
                    return new B(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = this.f3806k;
                if (entry == null) {
                    throw new IllegalStateException();
                }
                b();
                return entry.getKey();
            default:
                Map.Entry entry2 = this.f3806k;
                if (entry2 == null) {
                    throw new IllegalStateException();
                }
                b();
                return entry2.getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        y yVar = this.f3802d;
        if (yVar.b().f3900d != this.f3804i) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.f3805j;
        if (entry == null) {
            throw new IllegalStateException();
        }
        yVar.remove(entry.getKey());
        this.f3805j = null;
        Unit unit = Unit.f7487a;
        this.f3804i = yVar.b().f3900d;
    }
}
