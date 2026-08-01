package t0;

import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f extends a {

    /* renamed from: i, reason: collision with root package name */
    public final Object[] f9212i;

    /* renamed from: r, reason: collision with root package name */
    public final i f9213r;

    public f(int i3, int i10, int i11, Object[] objArr, Object[] objArr2) {
        super(i3, i10);
        this.f9212i = objArr2;
        int i12 = (i10 - 1) & (-32);
        this.f9213r = new i(objArr, i3 > i12 ? i12 : i3, i12, i11);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            i0.c();
            return null;
        }
        i iVar = this.f9213r;
        if (iVar.hasNext()) {
            this.f9196d++;
            return iVar.next();
        }
        int i3 = this.f9196d;
        this.f9196d = i3 + 1;
        return this.f9212i[i3 - iVar.f9197e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            i0.c();
            return null;
        }
        int i3 = this.f9196d;
        i iVar = this.f9213r;
        int i10 = iVar.f9197e;
        if (i3 <= i10) {
            this.f9196d = i3 - 1;
            return iVar.previous();
        }
        int i11 = i3 - 1;
        this.f9196d = i11;
        return this.f9212i[i11 - i10];
    }
}
