package a0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final q f128a;

    /* renamed from: b, reason: collision with root package name */
    public final q f129b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f130c;

    public r(q qVar, q qVar2, boolean z8) {
        this.f128a = qVar;
        this.f129b = qVar2;
        this.f130c = z8;
    }

    public static r a(r rVar, q qVar, q qVar2, boolean z8, int i7) {
        if ((i7 & 1) != 0) {
            qVar = rVar.f128a;
        }
        if ((i7 & 2) != 0) {
            qVar2 = rVar.f129b;
        }
        rVar.getClass();
        return new r(qVar, qVar2, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return r6.k.a(this.f128a, rVar.f128a) && r6.k.a(this.f129b, rVar.f129b) && this.f130c == rVar.f130c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f130c) + ((this.f129b.hashCode() + (this.f128a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.f128a + ", end=" + this.f129b + ", handlesCrossed=" + this.f130c + ')';
    }
}
