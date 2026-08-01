package t0;

import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i extends a {

    /* renamed from: i, reason: collision with root package name */
    public int f9220i;

    /* renamed from: r, reason: collision with root package name */
    public Object[] f9221r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9222s;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public i(Object[] objArr, int i3, int i10, int i11) {
        super(i3, i10);
        this.f9220i = i11;
        Object[] objArr2 = new Object[i11];
        this.f9221r = objArr2;
        ?? r52 = i3 == i10 ? 1 : 0;
        this.f9222s = r52;
        objArr2[0] = objArr;
        b(i3 - r52, 1);
    }

    public final Object a() {
        int i3 = this.f9196d & 31;
        Object obj = this.f9221r[this.f9220i - 1];
        obj.getClass();
        return ((Object[]) obj)[i3];
    }

    public final void b(int i3, int i10) {
        int i11 = (this.f9220i - i10) * 5;
        while (i10 < this.f9220i) {
            Object[] objArr = this.f9221r;
            Object obj = objArr[i10 - 1];
            obj.getClass();
            objArr[i10] = ((Object[]) obj)[k7.e.x(i3, i11)];
            i11 -= 5;
            i10++;
        }
    }

    public final void c(int i3) {
        int i10 = 0;
        while (k7.e.x(this.f9196d, i10) == i3) {
            i10 += 5;
        }
        if (i10 > 0) {
            b(this.f9196d, ((this.f9220i - 1) - (i10 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            i0.c();
            return null;
        }
        Object a9 = a();
        int i3 = this.f9196d + 1;
        this.f9196d = i3;
        if (i3 == this.f9197e) {
            this.f9222s = true;
            return a9;
        }
        c(0);
        return a9;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            i0.c();
            return null;
        }
        this.f9196d--;
        if (this.f9222s) {
            this.f9222s = false;
            return a();
        }
        c(31);
        return a();
    }
}
