package K;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends a {

    /* renamed from: i, reason: collision with root package name */
    public int f3444i;

    /* renamed from: j, reason: collision with root package name */
    public Object[] f3445j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3446k;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public j(Object[] objArr, int i2, int i4, int i5) {
        super(i2, i4);
        this.f3444i = i5;
        Object[] objArr2 = new Object[i5];
        this.f3445j = objArr2;
        ?? r5 = i2 == i4 ? 1 : 0;
        this.f3446k = r5;
        objArr2[0] = objArr;
        c(i2 - r5, 1);
    }

    public final Object b() {
        int i2 = this.f3418d & 31;
        Object obj = this.f3445j[this.f3444i - 1];
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i2];
    }

    public final void c(int i2, int i4) {
        int i5 = (this.f3444i - i4) * 5;
        while (i4 < this.f3444i) {
            Object[] objArr = this.f3445j;
            Object obj = objArr[i4 - 1];
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i4] = ((Object[]) obj)[u3.d.J(i2, i5)];
            i5 -= 5;
            i4++;
        }
    }

    public final void d(int i2) {
        int i4 = 0;
        while (u3.d.J(this.f3418d, i4) == i2) {
            i4 += 5;
        }
        if (i4 > 0) {
            c(this.f3418d, ((this.f3444i - 1) - (i4 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b4 = b();
        int i2 = this.f3418d + 1;
        this.f3418d = i2;
        if (i2 == this.f3419e) {
            this.f3446k = true;
            return b4;
        }
        d(0);
        return b4;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f3418d--;
        if (this.f3446k) {
            this.f3446k = false;
            return b();
        }
        d(31);
        return b();
    }
}
