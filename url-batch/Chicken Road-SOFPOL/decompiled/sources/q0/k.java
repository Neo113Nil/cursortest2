package q0;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k extends a {

    /* renamed from: f, reason: collision with root package name */
    public int f5957f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f5958g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5959h;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public k(Object[] objArr, int i, int i8, int i9) {
        super(i, i8);
        this.f5957f = i9;
        Object[] objArr2 = new Object[i9];
        this.f5958g = objArr2;
        ?? r52 = i == i8 ? 1 : 0;
        this.f5959h = r52;
        objArr2[0] = objArr;
        b(i - r52, 1);
    }

    public final Object a() {
        int i = this.f5931d & 31;
        Object obj = this.f5958g[this.f5957f - 1];
        q6.i.c(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i];
    }

    public final void b(int i, int i8) {
        int i9 = (this.f5957f - i8) * 5;
        while (i8 < this.f5957f) {
            Object[] objArr = this.f5958g;
            Object obj = objArr[i8 - 1];
            q6.i.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i8] = ((Object[]) obj)[m.a.F(i, i9)];
            i9 -= 5;
            i8++;
        }
    }

    public final void c(int i) {
        int i8 = 0;
        while (m.a.F(this.f5931d, i8) == i) {
            i8 += 5;
        }
        if (i8 > 0) {
            b(this.f5931d, ((this.f5957f - 1) - (i8 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object a8 = a();
        int i = this.f5931d + 1;
        this.f5931d = i;
        if (i == this.f5932e) {
            this.f5959h = true;
            return a8;
        }
        c(0);
        return a8;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f5931d--;
        if (this.f5959h) {
            this.f5959h = false;
            return a();
        }
        c(31);
        return a();
    }
}
