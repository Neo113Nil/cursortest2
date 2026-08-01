package b8;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class y extends i {

    /* renamed from: w, reason: collision with root package name */
    public static final Object[] f1459w;

    /* renamed from: x, reason: collision with root package name */
    public static final y f1460x;

    /* renamed from: r, reason: collision with root package name */
    public final transient Object[] f1461r;

    /* renamed from: s, reason: collision with root package name */
    public final transient int f1462s;

    /* renamed from: t, reason: collision with root package name */
    public final transient Object[] f1463t;

    /* renamed from: u, reason: collision with root package name */
    public final transient int f1464u;

    /* renamed from: v, reason: collision with root package name */
    public final transient int f1465v;

    static {
        Object[] objArr = new Object[0];
        f1459w = objArr;
        f1460x = new y(0, 0, 0, objArr, objArr);
    }

    public y(int i3, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.f1461r = objArr;
        this.f1462s = i3;
        this.f1463t = objArr2;
        this.f1464u = i10;
        this.f1465v = i11;
    }

    @Override // b8.b
    public final int c(Object[] objArr) {
        Object[] objArr2 = this.f1461r;
        int i3 = this.f1465v;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // b8.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f1463t;
            if (objArr.length != 0) {
                int K = g8.b.K(obj.hashCode());
                while (true) {
                    int i3 = K & this.f1464u;
                    Object obj2 = objArr[i3];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    K = i3 + 1;
                }
            }
        }
        return false;
    }

    @Override // b8.b
    public final Object[] e() {
        return this.f1461r;
    }

    @Override // b8.b
    public final int f() {
        return this.f1465v;
    }

    @Override // b8.b
    public final int g() {
        return 0;
    }

    @Override // b8.b
    public final boolean h() {
        return false;
    }

    @Override // b8.i, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f1462s;
    }

    @Override // b8.b
    /* renamed from: i */
    public final b0 iterator() {
        return b().listIterator(0);
    }

    @Override // b8.i
    public final g n() {
        return g.k(this.f1465v, this.f1461r);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f1465v;
    }
}
