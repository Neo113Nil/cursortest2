package P0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements Iterator {

    /* renamed from: e, reason: collision with root package name */
    public final Object[] f788e;

    /* renamed from: f, reason: collision with root package name */
    public int f789f;

    public a(Object[] objArr) {
        this.f788e = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f789f < this.f788e.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object[] objArr = this.f788e;
            int i2 = this.f789f;
            this.f789f = i2 + 1;
            return objArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f789f--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
