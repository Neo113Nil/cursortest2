package Q0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements Iterator, R0.a {

    /* renamed from: e, reason: collision with root package name */
    public final Object[] f962e;

    /* renamed from: f, reason: collision with root package name */
    public int f963f;

    public a(Object[] objArr) {
        this.f962e = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f963f < this.f962e.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object[] objArr = this.f962e;
            int i2 = this.f963f;
            this.f963f = i2 + 1;
            return objArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f963f--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
