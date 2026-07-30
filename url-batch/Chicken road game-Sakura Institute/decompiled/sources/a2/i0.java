package a2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f402a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f403b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f404c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f405d;

    public i0(d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4) {
        this.f402a = d0Var;
        this.f403b = d0Var2;
        this.f404c = d0Var3;
        this.f405d = d0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return r6.k.a(this.f402a, i0Var.f402a) && r6.k.a(this.f403b, i0Var.f403b) && r6.k.a(this.f404c, i0Var.f404c) && r6.k.a(this.f405d, i0Var.f405d);
    }

    public final int hashCode() {
        d0 d0Var = this.f402a;
        int hashCode = (d0Var != null ? d0Var.hashCode() : 0) * 31;
        d0 d0Var2 = this.f403b;
        int hashCode2 = (hashCode + (d0Var2 != null ? d0Var2.hashCode() : 0)) * 31;
        d0 d0Var3 = this.f404c;
        int hashCode3 = (hashCode2 + (d0Var3 != null ? d0Var3.hashCode() : 0)) * 31;
        d0 d0Var4 = this.f405d;
        return hashCode3 + (d0Var4 != null ? d0Var4.hashCode() : 0);
    }
}
