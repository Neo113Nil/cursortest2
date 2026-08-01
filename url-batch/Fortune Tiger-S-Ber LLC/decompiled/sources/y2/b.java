package y2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b implements Iterator, v2.a {

    /* renamed from: f, reason: collision with root package name */
    public final int f3618f;
    public final int g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public int f3619i;

    public b(int i4, int i5, int i6) {
        this.f3618f = i6;
        this.g = i5;
        boolean z3 = false;
        if (i6 <= 0 ? i4 >= i5 : i4 <= i5) {
            z3 = true;
        }
        this.h = z3;
        this.f3619i = z3 ? i4 : i5;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.h;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i4 = this.f3619i;
        if (i4 != this.g) {
            this.f3619i = this.f3618f + i4;
        } else {
            if (!this.h) {
                throw new NoSuchElementException();
            }
            this.h = false;
        }
        return Integer.valueOf(i4);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
