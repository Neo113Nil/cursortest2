package M;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: f, reason: collision with root package name */
    public final Object[] f2749f;

    /* renamed from: g, reason: collision with root package name */
    public final k f2750g;

    public h(Object[] objArr, Object[] objArr2, int i3, int i4, int i5) {
        super(i3, i4);
        this.f2749f = objArr2;
        int i6 = (i4 - 1) & (-32);
        this.f2750g = new k(objArr, i3 > i6 ? i6 : i3, i6, i5);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        k kVar = this.f2750g;
        if (kVar.hasNext()) {
            this.f2730d++;
            return kVar.next();
        }
        int i3 = this.f2730d;
        this.f2730d = i3 + 1;
        return this.f2749f[i3 - kVar.f2731e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f2730d;
        k kVar = this.f2750g;
        int i4 = kVar.f2731e;
        if (i3 <= i4) {
            this.f2730d = i3 - 1;
            return kVar.previous();
        }
        int i5 = i3 - 1;
        this.f2730d = i5;
        return this.f2749f[i5 - i4];
    }
}
