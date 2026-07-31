package kotlin.jvm.internal;

import i2.InterfaceC2471a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: kotlin.jvm.internal.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3236b implements Iterator, InterfaceC2471a {

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f41145b;

    /* renamed from: c, reason: collision with root package name */
    private int f41146c;

    public C3236b(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f41145b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41146c < this.f41145b.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f41145b;
            int i4 = this.f41146c;
            this.f41146c = i4 + 1;
            return objArr[i4];
        } catch (ArrayIndexOutOfBoundsException e4) {
            this.f41146c--;
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
