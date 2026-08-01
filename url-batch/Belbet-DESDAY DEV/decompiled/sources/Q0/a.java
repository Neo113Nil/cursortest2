package Q0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class a implements Iterator, Y0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f657a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f658b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f659c;

    public a(Object[] objArr) {
        X0.d.e(objArr, "array");
        this.f659c = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f657a) {
            case 0:
                return this.f658b < ((d) this.f659c).a();
            case 1:
                return this.f658b < ((Object[]) this.f659c).length;
        }
        while (true) {
            int i = this.f658b;
            it = (Iterator) this.f659c;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f658b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f657a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.f658b;
                this.f658b = i + 1;
                return ((d) this.f659c).get(i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f659c;
                    int i2 = this.f658b;
                    this.f658b = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.f658b--;
                    throw new NoSuchElementException(e2.getMessage());
                }
        }
        while (true) {
            int i3 = this.f658b;
            it = (Iterator) this.f659c;
            if (i3 > 0 && it.hasNext()) {
                it.next();
                this.f658b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f657a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(d dVar) {
        this.f659c = dVar;
    }

    public a(d1.b bVar) {
        this.f659c = bVar.f1906a.iterator();
        this.f658b = bVar.f1907b;
    }
}
