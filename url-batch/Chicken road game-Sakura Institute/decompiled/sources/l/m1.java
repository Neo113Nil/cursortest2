package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m1 implements l1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5572a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5573b;

    public m1(Object obj, Object obj2) {
        this.f5572a = obj;
        this.f5573b = obj2;
    }

    @Override // l.l1
    public final Object b() {
        return this.f5572a;
    }

    @Override // l.l1
    public final Object c() {
        return this.f5573b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return r6.k.a(this.f5572a, l1Var.b()) && r6.k.a(this.f5573b, l1Var.c());
    }

    public final int hashCode() {
        Object obj = this.f5572a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f5573b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
