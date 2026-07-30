package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v1 implements x {

    /* renamed from: a, reason: collision with root package name */
    public final int f5693a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5694b;

    /* renamed from: c, reason: collision with root package name */
    public final y f5695c;

    public v1(int i7, int i8, y yVar) {
        this.f5693a = i7;
        this.f5694b = i8;
        this.f5695c = yVar;
    }

    @Override // l.k
    public final y1 a(w1 w1Var) {
        return new f2(this.f5693a, this.f5694b, this.f5695c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            if (v1Var.f5693a == this.f5693a && v1Var.f5694b == this.f5694b && r6.k.a(v1Var.f5695c, this.f5695c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f5695c.hashCode() + (this.f5693a * 31)) * 31) + this.f5694b;
    }

    @Override // l.x, l.k
    public final z1 a(w1 w1Var) {
        return new f2(this.f5693a, this.f5694b, this.f5695c);
    }
}
