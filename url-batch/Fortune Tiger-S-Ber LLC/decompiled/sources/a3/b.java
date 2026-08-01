package a3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class b implements Iterator, v2.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f71f = 0;
    public int g;
    public final Object h;

    public b(Object[] objArr) {
        u2.c.e(objArr, "array");
        this.h = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f71f) {
            case 0:
                Iterator it = (Iterator) this.h;
                while (this.g > 0 && it.hasNext()) {
                    it.next();
                    this.g--;
                }
                return it.hasNext();
            case 1:
                return this.g < ((n2.c) this.h).a();
            default:
                return this.g < ((Object[]) this.h).length;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f71f) {
            case 0:
                Iterator it = (Iterator) this.h;
                while (this.g > 0 && it.hasNext()) {
                    it.next();
                    this.g--;
                }
                return it.next();
            case 1:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                n2.c cVar = (n2.c) this.h;
                int i4 = this.g;
                this.g = i4 + 1;
                return cVar.get(i4);
            default:
                try {
                    Object[] objArr = (Object[]) this.h;
                    int i5 = this.g;
                    this.g = i5 + 1;
                    return objArr[i5];
                } catch (ArrayIndexOutOfBoundsException e4) {
                    this.g--;
                    throw new NoSuchElementException(e4.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f71f) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(n2.c cVar) {
        this.h = cVar;
    }

    public b(c cVar) {
        this.h = cVar.f72a.iterator();
        this.g = cVar.f73b;
    }
}
