package m4;

/* loaded from: classes.dex */
final class l0<E> extends s<E> {

    /* renamed from: m, reason: collision with root package name */
    private static final Object[] f19175m;

    /* renamed from: n, reason: collision with root package name */
    static final l0<Object> f19176n;

    /* renamed from: h, reason: collision with root package name */
    final transient Object[] f19177h;

    /* renamed from: i, reason: collision with root package name */
    private final transient int f19178i;

    /* renamed from: j, reason: collision with root package name */
    final transient Object[] f19179j;

    /* renamed from: k, reason: collision with root package name */
    private final transient int f19180k;

    /* renamed from: l, reason: collision with root package name */
    private final transient int f19181l;

    static {
        Object[] objArr = new Object[0];
        f19175m = objArr;
        f19176n = new l0<>(objArr, 0, objArr, 0, 0);
    }

    l0(Object[] objArr, int i7, Object[] objArr2, int i8, int i9) {
        this.f19177h = objArr;
        this.f19178i = i7;
        this.f19179j = objArr2;
        this.f19180k = i8;
        this.f19181l = i9;
    }

    @Override // m4.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f19179j;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int b7 = n.b(obj);
        while (true) {
            int i7 = b7 & this.f19180k;
            Object obj2 = objArr[i7];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            b7 = i7 + 1;
        }
    }

    @Override // m4.s, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f19178i;
    }

    @Override // m4.o
    int j(Object[] objArr, int i7) {
        System.arraycopy(this.f19177h, 0, objArr, i7, this.f19181l);
        return i7 + this.f19181l;
    }

    @Override // m4.o
    Object[] k() {
        return this.f19177h;
    }

    @Override // m4.o
    int l() {
        return this.f19181l;
    }

    @Override // m4.o
    int m() {
        return 0;
    }

    @Override // m4.o
    boolean n() {
        return false;
    }

    @Override // m4.s, m4.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: o */
    public s0<E> iterator() {
        return i().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f19181l;
    }

    @Override // m4.s
    q<E> t() {
        return q.q(this.f19177h, this.f19181l);
    }

    @Override // m4.s
    boolean u() {
        return true;
    }
}
