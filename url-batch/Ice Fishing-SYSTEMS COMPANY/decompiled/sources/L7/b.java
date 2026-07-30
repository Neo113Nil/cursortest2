package L7;

import java.util.Iterator;
import r7.AbstractC4980k;
import r7.s;

/* loaded from: classes2.dex */
public final class b implements Iterator, F7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1791n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final Iterator f1792u;

    /* renamed from: v, reason: collision with root package name */
    public int f1793v;

    public b(Iterator iterator) {
        kotlin.jvm.internal.h.e(iterator, "iterator");
        this.f1792u = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f1791n) {
            case 0:
                break;
            default:
                return this.f1792u.hasNext();
        }
        while (true) {
            int i = this.f1793v;
            it = this.f1792u;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f1793v--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f1791n) {
            case 0:
                break;
            default:
                int i = this.f1793v;
                this.f1793v = i + 1;
                if (i >= 0) {
                    return new s(i, this.f1792u.next());
                }
                AbstractC4980k.D();
                throw null;
        }
        while (true) {
            int i4 = this.f1793v;
            it = this.f1792u;
            if (i4 > 0 && it.hasNext()) {
                it.next();
                this.f1793v--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1791n) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(c cVar) {
        this.f1792u = cVar.f1794a.iterator();
        this.f1793v = cVar.f1795b;
    }
}
