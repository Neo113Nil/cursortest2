package d1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class a implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f76b;

    /* renamed from: c, reason: collision with root package name */
    public int f77c;

    public a(Object[] objArr) {
        this.f76b = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f77c < this.f76b.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object[] objArr = this.f76b;
            int i2 = this.f77c;
            this.f77c = i2 + 1;
            return objArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f77c--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
