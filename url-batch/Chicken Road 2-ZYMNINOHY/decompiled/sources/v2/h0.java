package v2;

/* loaded from: classes.dex */
public final class h0 extends M {

    /* renamed from: i, reason: collision with root package name */
    public static final Object[] f15637i;

    /* renamed from: j, reason: collision with root package name */
    public static final h0 f15638j;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f15639d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f15640e;

    /* renamed from: f, reason: collision with root package name */
    public final transient Object[] f15641f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f15642g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int f15643h;

    static {
        Object[] objArr = new Object[0];
        f15637i = objArr;
        f15638j = new h0(0, 0, 0, objArr, objArr);
    }

    public h0(int i4, int i5, int i6, Object[] objArr, Object[] objArr2) {
        this.f15639d = objArr;
        this.f15640e = i4;
        this.f15641f = objArr2;
        this.f15642g = i5;
        this.f15643h = i6;
    }

    @Override // v2.D
    public final int c(int i4, Object[] objArr) {
        Object[] objArr2 = this.f15639d;
        int i5 = this.f15643h;
        System.arraycopy(objArr2, 0, objArr, i4, i5);
        return i4 + i5;
    }

    @Override // v2.D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f15641f;
            if (objArr.length != 0) {
                int r4 = r.r(obj);
                while (true) {
                    int i4 = r4 & this.f15642g;
                    Object obj2 = objArr[i4];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    r4 = i4 + 1;
                }
            }
        }
        return false;
    }

    @Override // v2.D
    public final Object[] d() {
        return this.f15639d;
    }

    @Override // v2.D
    public final int e() {
        return this.f15643h;
    }

    @Override // v2.D
    public final int f() {
        return 0;
    }

    @Override // v2.D
    public final boolean g() {
        return false;
    }

    @Override // v2.D
    /* renamed from: h */
    public final p0 iterator() {
        return b().listIterator(0);
    }

    @Override // v2.M, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f15640e;
    }

    @Override // v2.M
    public final I l() {
        return I.i(this.f15643h, this.f15639d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f15643h;
    }
}
