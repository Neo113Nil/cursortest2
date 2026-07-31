package M;

import O2.l;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class k extends a {

    /* renamed from: f, reason: collision with root package name */
    public int f3448f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f3449g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3450h;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public k(Object[] objArr, int i3, int i4, int i5) {
        super(i3, i4);
        this.f3448f = i5;
        Object[] objArr2 = new Object[i5];
        this.f3449g = objArr2;
        ?? r5 = i3 == i4 ? 1 : 0;
        this.f3450h = r5;
        objArr2[0] = objArr;
        b(i3 - r5, 1);
    }

    public final Object a() {
        int i3 = this.f3421d & 31;
        Object obj = this.f3449g[this.f3448f - 1];
        f2.j.d(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i3];
    }

    public final void b(int i3, int i4) {
        int i5 = (this.f3448f - i4) * 5;
        while (i4 < this.f3448f) {
            Object[] objArr = this.f3449g;
            Object obj = objArr[i4 - 1];
            f2.j.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i4] = ((Object[]) obj)[l.h0(i3, i5)];
            i5 -= 5;
            i4++;
        }
    }

    public final void c(int i3) {
        int i4 = 0;
        while (l.h0(this.f3421d, i4) == i3) {
            i4 += 5;
        }
        if (i4 > 0) {
            b(this.f3421d, ((this.f3448f - 1) - (i4 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object a3 = a();
        int i3 = this.f3421d + 1;
        this.f3421d = i3;
        if (i3 == this.f3422e) {
            this.f3450h = true;
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
        this.f3421d--;
        if (this.f3450h) {
            this.f3450h = false;
            return a();
        }
        c(31);
        return a();
    }
}
