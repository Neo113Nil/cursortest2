package p2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, m2.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f10221a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10222b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10223c;

    /* renamed from: d, reason: collision with root package name */
    public int f10224d;

    public b(int i3, int i4, int i5) {
        this.f10221a = i5;
        this.f10222b = i4;
        boolean z = false;
        if (i5 <= 0 ? i3 >= i4 : i3 <= i4) {
            z = true;
        }
        this.f10223c = z;
        this.f10224d = z ? i3 : i4;
    }

    public final int a() {
        int i3 = this.f10224d;
        if (i3 != this.f10222b) {
            this.f10224d = this.f10221a + i3;
            return i3;
        }
        if (!this.f10223c) {
            throw new NoSuchElementException();
        }
        this.f10223c = false;
        return i3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10223c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
