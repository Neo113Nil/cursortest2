package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c1 implements y1 {

    /* renamed from: f, reason: collision with root package name */
    public final y1 f5421f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5422g;

    public c1(y1 y1Var, long j8) {
        this.f5421f = y1Var;
        this.f5422g = j8;
    }

    @Override // l.y1
    public final boolean a() {
        return this.f5421f.a();
    }

    @Override // l.y1
    public final long b(q qVar, q qVar2, q qVar3) {
        return this.f5421f.b(qVar, qVar2, qVar3) + this.f5422g;
    }

    @Override // l.y1
    public final q e(long j8, q qVar, q qVar2, q qVar3) {
        long j9 = this.f5422g;
        return j8 < j9 ? qVar : this.f5421f.e(j8 - j9, qVar, qVar2, qVar3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return c1Var.f5422g == this.f5422g && r6.k.a(c1Var.f5421f, this.f5421f);
    }

    @Override // l.y1
    public final q f(long j8, q qVar, q qVar2, q qVar3) {
        long j9 = this.f5422g;
        return j8 < j9 ? qVar3 : this.f5421f.f(j8 - j9, qVar, qVar2, qVar3);
    }

    public final int hashCode() {
        return Long.hashCode(this.f5422g) + (this.f5421f.hashCode() * 31);
    }
}
