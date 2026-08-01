package t0;

import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9198i = 1;

    /* renamed from: r, reason: collision with root package name */
    public final Object f9199r;

    public c(Object[] objArr, int i3, int i10) {
        super(i3, i10);
        this.f9199r = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f9198i) {
            case 0:
                if (!hasNext()) {
                    i0.c();
                    break;
                } else {
                    Object[] objArr = (Object[]) this.f9199r;
                    int i3 = this.f9196d;
                    this.f9196d = i3 + 1;
                    break;
                }
            default:
                if (!hasNext()) {
                    i0.c();
                    break;
                } else {
                    this.f9196d++;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f9198i) {
            case 0:
                if (!hasPrevious()) {
                    i0.c();
                    break;
                } else {
                    Object[] objArr = (Object[]) this.f9199r;
                    int i3 = this.f9196d - 1;
                    this.f9196d = i3;
                    break;
                }
            default:
                if (!hasPrevious()) {
                    i0.c();
                    break;
                } else {
                    this.f9196d--;
                    break;
                }
        }
        return null;
    }

    public c(int i3, Object obj) {
        super(i3, 1);
        this.f9199r = obj;
    }
}
