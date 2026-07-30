package g2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final a2.g f4010a;

    /* renamed from: b, reason: collision with root package name */
    public final q f4011b;

    public d0(a2.g gVar, q qVar) {
        this.f4010a = gVar;
        this.f4011b = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return r6.k.a(this.f4010a, d0Var.f4010a) && r6.k.a(this.f4011b, d0Var.f4011b);
    }

    public final int hashCode() {
        return this.f4011b.hashCode() + (this.f4010a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f4010a) + ", offsetMapping=" + this.f4011b + ')';
    }
}
