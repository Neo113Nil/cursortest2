package n4;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f7058a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7059b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7060c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7061d;

    public g(f0 f0Var, boolean z10, boolean z11) {
        if (!f0Var.f7057a && z10) {
            a2.r.h(f0Var.b().concat(" does not allow nullable values"));
            throw null;
        }
        this.f7058a = f0Var;
        this.f7059b = z10;
        this.f7060c = z11;
        this.f7061d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f7059b == gVar.f7059b && this.f7060c == gVar.f7060c && this.f7058a.equals(gVar.f7058a);
    }

    public final int hashCode() {
        return ((((this.f7058a.hashCode() * 31) + (this.f7059b ? 1 : 0)) * 31) + (this.f7060c ? 1 : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(wd.c0.a(g.class).c());
        sb2.append(" Type: " + this.f7058a);
        sb2.append(" Nullable: " + this.f7059b);
        if (this.f7060c) {
            sb2.append(" DefaultValue: null");
        }
        return sb2.toString();
    }
}
