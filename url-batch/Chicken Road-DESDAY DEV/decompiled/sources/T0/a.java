package T0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class a implements Iterator, c1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f815a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f816b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f817c;

    public a(Object[] objArr) {
        b1.d.e(objArr, "array");
        this.f817c = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f815a) {
            case 0:
                return this.f816b < ((d) this.f817c).a();
            case 1:
                return this.f816b < ((Object[]) this.f817c).length;
        }
        while (true) {
            int i = this.f816b;
            it = (Iterator) this.f817c;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f816b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f815a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.f816b;
                this.f816b = i + 1;
                return ((d) this.f817c).get(i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f817c;
                    int i2 = this.f816b;
                    this.f816b = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.f816b--;
                    throw new NoSuchElementException(e2.getMessage());
                }
        }
        while (true) {
            int i3 = this.f816b;
            it = (Iterator) this.f817c;
            if (i3 > 0 && it.hasNext()) {
                it.next();
                this.f816b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f815a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(d dVar) {
        this.f817c = dVar;
    }

    public a(h1.b bVar) {
        this.f817c = bVar.f2450a.iterator();
        this.f816b = bVar.f2451b;
    }
}
