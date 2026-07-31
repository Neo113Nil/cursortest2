package C5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import y5.InterfaceC0766a;

/* loaded from: classes.dex */
public final class b implements Iterator, InterfaceC0766a {

    /* renamed from: f, reason: collision with root package name */
    public final int f231f;

    /* renamed from: g, reason: collision with root package name */
    public final int f232g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f233h;

    /* renamed from: i, reason: collision with root package name */
    public int f234i;

    public b(int i7, int i8, int i9) {
        this.f231f = i9;
        this.f232g = i8;
        boolean z5 = false;
        if (i9 <= 0 ? i7 >= i8 : i7 <= i8) {
            z5 = true;
        }
        this.f233h = z5;
        this.f234i = z5 ? i7 : i8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f233h;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f234i;
        if (i7 != this.f232g) {
            this.f234i = this.f231f + i7;
        } else {
            if (!this.f233h) {
                throw new NoSuchElementException();
            }
            this.f233h = false;
        }
        return Integer.valueOf(i7);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
