package W0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class a implements Iterator, f1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f882a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f883b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f884c;

    public a(Object[] objArr) {
        e1.d.e(objArr, "array");
        this.f884c = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f882a) {
            case 0:
                return this.f883b < ((d) this.f884c).a();
            case 1:
                return this.f883b < ((Object[]) this.f884c).length;
        }
        while (true) {
            int i = this.f883b;
            it = (Iterator) this.f884c;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f883b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f882a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.f883b;
                this.f883b = i + 1;
                return ((d) this.f884c).get(i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f884c;
                    int i2 = this.f883b;
                    this.f883b = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.f883b--;
                    throw new NoSuchElementException(e2.getMessage());
                }
        }
        while (true) {
            int i3 = this.f883b;
            it = (Iterator) this.f884c;
            if (i3 > 0 && it.hasNext()) {
                it.next();
                this.f883b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f882a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(d dVar) {
        this.f884c = dVar;
    }

    public a(k1.b bVar) {
        this.f884c = bVar.f2821a.iterator();
        this.f883b = bVar.f2822b;
    }
}
