package M;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: f, reason: collision with root package name */
    public final Object[] f3440f;

    /* renamed from: g, reason: collision with root package name */
    public final k f3441g;

    public h(Object[] objArr, Object[] objArr2, int i3, int i4, int i5) {
        super(i3, i4);
        this.f3440f = objArr2;
        int i6 = (i4 - 1) & (-32);
        this.f3441g = new k(objArr, i3 > i6 ? i6 : i3, i6, i5);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        k kVar = this.f3441g;
        if (kVar.hasNext()) {
            this.f3421d++;
            return kVar.next();
        }
        int i3 = this.f3421d;
        this.f3421d = i3 + 1;
        return this.f3440f[i3 - kVar.f3422e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f3421d;
        k kVar = this.f3441g;
        int i4 = kVar.f3422e;
        if (i3 <= i4) {
            this.f3421d = i3 - 1;
            return kVar.previous();
        }
        int i5 = i3 - 1;
        this.f3421d = i5;
        return this.f3440f[i5 - i4];
    }
}
