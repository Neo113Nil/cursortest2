package k0;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g extends a {

    /* renamed from: h, reason: collision with root package name */
    public final Object[] f5310h;

    /* renamed from: i, reason: collision with root package name */
    public final j f5311i;

    public g(Object[] objArr, Object[] objArr2, int i7, int i8, int i9) {
        super(i7, i8);
        this.f5310h = objArr2;
        int i10 = (i8 - 1) & (-32);
        this.f5311i = new j(objArr, i7 > i10 ? i10 : i7, i10, i9);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        j jVar = this.f5311i;
        if (jVar.hasNext()) {
            this.f5292f++;
            return jVar.next();
        }
        int i7 = this.f5292f;
        this.f5292f = i7 + 1;
        return this.f5310h[i7 - jVar.f5293g];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f5292f;
        j jVar = this.f5311i;
        int i8 = jVar.f5293g;
        if (i7 <= i8) {
            this.f5292f = i7 - 1;
            return jVar.previous();
        }
        int i9 = i7 - 1;
        this.f5292f = i9;
        return this.f5310h[i9 - i8];
    }
}
