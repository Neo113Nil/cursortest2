package F0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements Iterator {

    /* renamed from: e, reason: collision with root package name */
    public final Object[] f303e;

    /* renamed from: f, reason: collision with root package name */
    public int f304f;

    public a(Object[] objArr) {
        this.f303e = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f304f < this.f303e.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object[] objArr = this.f303e;
            int i2 = this.f304f;
            this.f304f = i2 + 1;
            return objArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f304f--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
