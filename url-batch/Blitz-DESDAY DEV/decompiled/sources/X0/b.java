package X0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class b implements Iterator, h1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f978a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f979b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f980c;

    public b(Object[] objArr) {
        g1.d.e(objArr, "array");
        this.f980c = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f978a) {
            case 0:
                return this.f979b < ((e) this.f980c).a();
            case 1:
                return this.f979b < ((Object[]) this.f980c).length;
        }
        while (true) {
            int i = this.f979b;
            it = (Iterator) this.f980c;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f979b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f978a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.f979b;
                this.f979b = i + 1;
                return ((e) this.f980c).get(i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f980c;
                    int i2 = this.f979b;
                    this.f979b = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.f979b--;
                    throw new NoSuchElementException(e2.getMessage());
                }
        }
        while (true) {
            int i3 = this.f979b;
            it = (Iterator) this.f980c;
            if (i3 > 0 && it.hasNext()) {
                it.next();
                this.f979b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f978a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(e eVar) {
        this.f980c = eVar;
    }

    public b(m1.b bVar) {
        this.f980c = bVar.f3207a.iterator();
        this.f979b = bVar.f3208b;
    }
}
