package Q0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class a implements Iterator, Y0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f656a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f657b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f658c;

    public a(Object[] objArr) {
        X0.d.e(objArr, "array");
        this.f658c = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f656a) {
            case 0:
                return this.f657b < ((d) this.f658c).a();
            case 1:
                return this.f657b < ((Object[]) this.f658c).length;
        }
        while (true) {
            int i = this.f657b;
            it = (Iterator) this.f658c;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f657b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f656a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.f657b;
                this.f657b = i + 1;
                return ((d) this.f658c).get(i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f658c;
                    int i2 = this.f657b;
                    this.f657b = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.f657b--;
                    throw new NoSuchElementException(e2.getMessage());
                }
        }
        while (true) {
            int i3 = this.f657b;
            it = (Iterator) this.f658c;
            if (i3 > 0 && it.hasNext()) {
                it.next();
                this.f657b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f656a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(d dVar) {
        this.f658c = dVar;
    }

    public a(d1.b bVar) {
        this.f658c = bVar.f1905a.iterator();
        this.f657b = bVar.f1906b;
    }
}
