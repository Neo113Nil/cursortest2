package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h1 implements g1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6301a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6302b;

    public h1(Object obj, Object obj2) {
        this.f6301a = obj;
        this.f6302b = obj2;
    }

    @Override // r.g1
    public final Object b() {
        return this.f6301a;
    }

    @Override // r.g1
    public final Object c() {
        return this.f6302b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return q6.i.a(this.f6301a, g1Var.b()) && q6.i.a(this.f6302b, g1Var.c());
    }

    public final int hashCode() {
        Object obj = this.f6301a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f6302b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
