package m;

/* loaded from: classes.dex */
public final class h0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6804a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6805b;

    public h0(Object obj, Object obj2) {
        this.f6804a = obj;
        this.f6805b = obj2;
    }

    @Override // m.g0
    public final Object b() {
        return this.f6804a;
    }

    @Override // m.g0
    public final Object c() {
        return this.f6805b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            if (f2.j.a(this.f6804a, g0Var.b())) {
                if (f2.j.a(this.f6805b, g0Var.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f6804a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f6805b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
