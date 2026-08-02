package t3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p3.InterfaceC1349a;

/* renamed from: t3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1442b implements Iterator, InterfaceC1349a {

    /* renamed from: a, reason: collision with root package name */
    public final int f15427a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15428b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15429c;

    /* renamed from: d, reason: collision with root package name */
    public int f15430d;

    public C1442b(int i4, int i5, int i6) {
        this.f15427a = i6;
        this.f15428b = i5;
        boolean z = false;
        if (i6 <= 0 ? i4 >= i5 : i4 <= i5) {
            z = true;
        }
        this.f15429c = z;
        this.f15430d = z ? i4 : i5;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15429c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i4 = this.f15430d;
        if (i4 != this.f15428b) {
            this.f15430d = this.f15427a + i4;
            return i4;
        }
        if (!this.f15429c) {
            throw new NoSuchElementException();
        }
        this.f15429c = false;
        return i4;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
