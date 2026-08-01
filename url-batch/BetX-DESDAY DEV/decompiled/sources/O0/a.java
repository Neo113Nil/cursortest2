package O0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class a implements Iterator, Y0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f679a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f680b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f681c;

    public a(Object[] objArr) {
        X0.f.e(objArr, "array");
        this.f681c = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f679a) {
            case 0:
                return this.f680b < ((d) this.f681c).a();
            case 1:
                return this.f680b < ((Object[]) this.f681c).length;
        }
        while (true) {
            int i = this.f680b;
            it = (Iterator) this.f681c;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f680b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f679a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.f680b;
                this.f680b = i + 1;
                return ((d) this.f681c).get(i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f681c;
                    int i2 = this.f680b;
                    this.f680b = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.f680b--;
                    throw new NoSuchElementException(e2.getMessage());
                }
        }
        while (true) {
            int i3 = this.f680b;
            it = (Iterator) this.f681c;
            if (i3 > 0 && it.hasNext()) {
                it.next();
                this.f680b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f679a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(d dVar) {
        this.f681c = dVar;
    }

    public a(d1.b bVar) {
        this.f681c = bVar.f2094a.iterator();
        this.f680b = bVar.f2095b;
    }
}
