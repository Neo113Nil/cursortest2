package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gq extends l0 {
    public final /* synthetic */ int o = 1;
    public final Object p;

    public gq(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.p = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.o) {
            case 0:
                if (!hasNext()) {
                    b71.f();
                    break;
                } else {
                    Object[] objArr = (Object[]) this.p;
                    int i = this.m;
                    this.m = i + 1;
                    break;
                }
            default:
                if (!hasNext()) {
                    b71.f();
                    break;
                } else {
                    this.m++;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.o) {
            case 0:
                if (!hasPrevious()) {
                    b71.f();
                    break;
                } else {
                    Object[] objArr = (Object[]) this.p;
                    int i = this.m - 1;
                    this.m = i;
                    break;
                }
            default:
                if (!hasPrevious()) {
                    b71.f();
                    break;
                } else {
                    this.m--;
                    break;
                }
        }
        return null;
    }

    public gq(int i, Object obj) {
        super(i, 1);
        this.p = obj;
    }
}
