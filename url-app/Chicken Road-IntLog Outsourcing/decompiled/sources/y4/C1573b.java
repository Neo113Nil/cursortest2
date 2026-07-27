package y4;

import java.util.Iterator;
import java.util.NoSuchElementException;
import u4.InterfaceC1481a;

/* renamed from: y4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1573b implements Iterator, InterfaceC1481a {

    /* renamed from: a, reason: collision with root package name */
    public final int f12442a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12443b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12444c;

    /* renamed from: d, reason: collision with root package name */
    public int f12445d;

    public C1573b(int i2, int i3, int i6) {
        this.f12442a = i6;
        this.f12443b = i3;
        boolean z = false;
        if (i6 <= 0 ? i2 >= i3 : i2 <= i3) {
            z = true;
        }
        this.f12444c = z;
        this.f12445d = z ? i2 : i3;
    }

    public final int a() {
        int i2 = this.f12445d;
        if (i2 != this.f12443b) {
            this.f12445d = this.f12442a + i2;
        } else {
            if (!this.f12444c) {
                throw new NoSuchElementException();
            }
            this.f12444c = false;
        }
        return i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12444c;
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
