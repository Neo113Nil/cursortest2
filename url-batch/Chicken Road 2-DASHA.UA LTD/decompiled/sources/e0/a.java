package e0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f486a;

    /* renamed from: b, reason: collision with root package name */
    public int f487b;

    public a(Object[] objArr) {
        this.f486a = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f487b < this.f486a.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object[] objArr = this.f486a;
            int i2 = this.f487b;
            this.f487b = i2 + 1;
            return objArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f487b--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
