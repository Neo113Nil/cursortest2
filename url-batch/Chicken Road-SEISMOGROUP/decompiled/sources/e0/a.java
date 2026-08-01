package e0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f542b;

    /* renamed from: c, reason: collision with root package name */
    public int f543c;

    public a(Object[] objArr) {
        this.f542b = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f543c < this.f542b.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object[] objArr = this.f542b;
            int i2 = this.f543c;
            this.f543c = i2 + 1;
            return objArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f543c--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
