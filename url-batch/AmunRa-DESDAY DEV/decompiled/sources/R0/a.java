package R0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class a implements Iterator, a1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f698a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f699b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f700c;

    public a(Object[] objArr) {
        Z0.d.e(objArr, "array");
        this.f700c = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f698a) {
            case 0:
                return this.f699b < ((d) this.f700c).a();
            case 1:
                return this.f699b < ((Object[]) this.f700c).length;
        }
        while (true) {
            int i = this.f699b;
            it = (Iterator) this.f700c;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f699b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f698a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.f699b;
                this.f699b = i + 1;
                return ((d) this.f700c).get(i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f700c;
                    int i2 = this.f699b;
                    this.f699b = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.f699b--;
                    throw new NoSuchElementException(e2.getMessage());
                }
        }
        while (true) {
            int i3 = this.f699b;
            it = (Iterator) this.f700c;
            if (i3 > 0 && it.hasNext()) {
                it.next();
                this.f699b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f698a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(d dVar) {
        this.f700c = dVar;
    }

    public a(f1.b bVar) {
        this.f700c = bVar.f2254a.iterator();
        this.f699b = bVar.f2255b;
    }
}
