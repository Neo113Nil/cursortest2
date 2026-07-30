package k0;

import java.util.NoSuchElementException;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j extends a {

    /* renamed from: h, reason: collision with root package name */
    public int f5318h;

    /* renamed from: i, reason: collision with root package name */
    public Object[] f5319i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5320j;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public j(Object[] objArr, int i7, int i8, int i9) {
        super(i7, i8);
        this.f5318h = i9;
        Object[] objArr2 = new Object[i9];
        this.f5319i = objArr2;
        ?? r52 = i7 == i8 ? 1 : 0;
        this.f5320j = r52;
        objArr2[0] = objArr;
        b(i7 - r52, 1);
    }

    public final Object a() {
        int i7 = this.f5292f & 31;
        Object obj = this.f5319i[this.f5318h - 1];
        k.d(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i7];
    }

    public final void b(int i7, int i8) {
        int i9 = (this.f5318h - i8) * 5;
        while (i8 < this.f5318h) {
            Object[] objArr = this.f5319i;
            Object obj = objArr[i8 - 1];
            k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i8] = ((Object[]) obj)[j1.c.f0(i7, i9)];
            i9 -= 5;
            i8++;
        }
    }

    public final void c(int i7) {
        int i8 = 0;
        while (j1.c.f0(this.f5292f, i8) == i7) {
            i8 += 5;
        }
        if (i8 > 0) {
            b(this.f5292f, ((this.f5318h - 1) - (i8 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object a3 = a();
        int i7 = this.f5292f + 1;
        this.f5292f = i7;
        if (i7 == this.f5293g) {
            this.f5320j = true;
            return a3;
        }
        c(0);
        return a3;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f5292f--;
        if (this.f5320j) {
            this.f5320j = false;
            return a();
        }
        c(31);
        return a();
    }
}
