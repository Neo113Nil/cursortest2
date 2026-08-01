package X0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class b implements Iterator, k1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1369a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f1370b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1371c;

    public b(Object[] objArr) {
        j1.h.e(objArr, "array");
        this.f1371c = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f1369a) {
            case 0:
                return this.f1370b < ((e) this.f1371c).a();
            case 1:
                return this.f1370b < ((Object[]) this.f1371c).length;
        }
        while (true) {
            int i = this.f1370b;
            it = (Iterator) this.f1371c;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f1370b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f1369a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.f1370b;
                this.f1370b = i + 1;
                return ((e) this.f1371c).get(i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f1371c;
                    int i2 = this.f1370b;
                    this.f1370b = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f1370b--;
                    throw new NoSuchElementException(e.getMessage());
                }
        }
        while (true) {
            int i3 = this.f1370b;
            it = (Iterator) this.f1371c;
            if (i3 > 0 && it.hasNext()) {
                it.next();
                this.f1370b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1369a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(e eVar) {
        this.f1371c = eVar;
    }

    public b(p1.b bVar) {
        this.f1371c = bVar.f3877a.iterator();
        this.f1370b = bVar.f3878b;
    }
}
