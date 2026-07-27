package T2;

import java.util.Iterator;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import z2.C1441y;

/* loaded from: classes.dex */
public final class b implements Iterator, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4035d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f4036e;

    /* renamed from: i, reason: collision with root package name */
    public int f4037i;

    public b(Iterator iterator) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f4036e = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f4035d) {
            case 0:
                break;
            default:
                return this.f4036e.hasNext();
        }
        while (true) {
            int i2 = this.f4037i;
            it = this.f4036e;
            if (i2 > 0 && it.hasNext()) {
                it.next();
                this.f4037i--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f4035d) {
            case 0:
                break;
            default:
                int i2 = this.f4037i;
                this.f4037i = i2 + 1;
                if (i2 >= 0) {
                    return new IndexedValue(i2, this.f4036e.next());
                }
                C1441y.g();
                throw null;
        }
        while (true) {
            int i4 = this.f4037i;
            it = this.f4036e;
            if (i4 > 0 && it.hasNext()) {
                it.next();
                this.f4037i--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4035d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(c cVar) {
        this.f4036e = cVar.f4038a.iterator();
        this.f4037i = cVar.f4039b;
    }
}
