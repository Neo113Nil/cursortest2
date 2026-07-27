package K;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g extends a {

    /* renamed from: i, reason: collision with root package name */
    public final Object[] f3436i;

    /* renamed from: j, reason: collision with root package name */
    public final j f3437j;

    public g(Object[] objArr, Object[] objArr2, int i2, int i4, int i5) {
        super(i2, i4);
        this.f3436i = objArr2;
        int i6 = (i4 - 1) & (-32);
        this.f3437j = new j(objArr, i2 > i6 ? i6 : i2, i6, i5);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        j jVar = this.f3437j;
        if (jVar.hasNext()) {
            this.f3418d++;
            return jVar.next();
        }
        int i2 = this.f3418d;
        this.f3418d = i2 + 1;
        return this.f3436i[i2 - jVar.f3419e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f3418d;
        j jVar = this.f3437j;
        int i4 = jVar.f3419e;
        if (i2 <= i4) {
            this.f3418d = i2 - 1;
            return jVar.previous();
        }
        int i5 = i2 - 1;
        this.f3418d = i5;
        return this.f3436i[i5 - i4];
    }
}
