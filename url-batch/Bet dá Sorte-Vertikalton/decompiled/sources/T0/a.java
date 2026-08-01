package T0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class a implements Iterator, c1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f830a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f831b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f832c;

    public a(Object[] objArr) {
        b1.d.e(objArr, "array");
        this.f832c = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f830a) {
            case 0:
                return this.f831b < ((d) this.f832c).a();
            case 1:
                return this.f831b < ((Object[]) this.f832c).length;
        }
        while (true) {
            int i = this.f831b;
            it = (Iterator) this.f832c;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f831b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f830a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.f831b;
                this.f831b = i + 1;
                return ((d) this.f832c).get(i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f832c;
                    int i2 = this.f831b;
                    this.f831b = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.f831b--;
                    throw new NoSuchElementException(e2.getMessage());
                }
        }
        while (true) {
            int i3 = this.f831b;
            it = (Iterator) this.f832c;
            if (i3 > 0 && it.hasNext()) {
                it.next();
                this.f831b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f830a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(d dVar) {
        this.f832c = dVar;
    }

    public a(h1.b bVar) {
        this.f832c = bVar.f2489a.iterator();
        this.f831b = bVar.f2490b;
    }
}
