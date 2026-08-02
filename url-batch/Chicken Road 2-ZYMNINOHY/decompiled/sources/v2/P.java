package v2;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class P extends p0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15585a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15586b;

    public P(Object obj) {
        this.f15585a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f15586b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f15586b) {
            throw new NoSuchElementException();
        }
        this.f15586b = true;
        return this.f15585a;
    }
}
