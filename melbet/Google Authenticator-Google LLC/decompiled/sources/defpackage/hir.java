package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hir extends hdy {
    static final hir b = new hir();
    final transient Object[] c;
    public final transient hir d;
    private final transient Object e;
    private final transient int f;
    private final transient int g;

    public hir(Object[] objArr, int i) {
        this.c = objArr;
        this.g = i;
        this.f = 0;
        int d = i >= 2 ? hfm.d(i) : 0;
        this.e = hix.n(objArr, i, d, 0);
        this.d = new hir(hix.n(objArr, i, d, 1), objArr, i, this);
    }

    @Override // defpackage.hdy
    public final hdy a() {
        return this.d;
    }

    @Override // defpackage.her
    public final boolean e() {
        return false;
    }

    @Override // defpackage.her
    public final hfm f() {
        return new hiu(this, this.c, this.f, this.g);
    }

    @Override // defpackage.her
    public final hfm g() {
        return new hiv(this, new hiw(this.c, this.f, this.g));
    }

    @Override // defpackage.her, java.util.Map
    public final Object get(Object obj) {
        Object o = hix.o(this.e, this.c, this.g, this.f, obj);
        if (o == null) {
            return null;
        }
        return o;
    }

    @Override // java.util.Map
    public final int size() {
        return this.g;
    }

    @Override // defpackage.hdy, defpackage.her
    public Object writeReplace() {
        return super.writeReplace();
    }

    private hir(Object obj, Object[] objArr, int i, hir hirVar) {
        this.e = obj;
        this.c = objArr;
        this.f = 1;
        this.g = i;
        this.d = hirVar;
    }

    private hir() {
        this.e = null;
        this.c = new Object[0];
        this.f = 0;
        this.g = 0;
        this.d = this;
    }
}
