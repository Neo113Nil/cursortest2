package m;

/* loaded from: classes.dex */
public final class n0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5809a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5810b;

    public n0(Object obj, Object obj2) {
        this.f5809a = obj;
        this.f5810b = obj2;
    }

    @Override // m.m0
    public final Object b() {
        return this.f5809a;
    }

    @Override // m.m0
    public final Object c() {
        return this.f5810b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m0) {
            m0 m0Var = (m0) obj;
            if (Z1.i.a(this.f5809a, m0Var.b())) {
                if (Z1.i.a(this.f5810b, m0Var.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f5809a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f5810b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
