package t5;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final q f8917c = new q(c.f8886g, k.f8908j);

    /* renamed from: d, reason: collision with root package name */
    public static final q f8918d = new q(c.f8887h, s.f8921e);

    /* renamed from: a, reason: collision with root package name */
    public final c f8919a;

    /* renamed from: b, reason: collision with root package name */
    public final s f8920b;

    public q(c cVar, s sVar) {
        this.f8919a = cVar;
        this.f8920b = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f8919a.equals(qVar.f8919a) && this.f8920b.equals(qVar.f8920b);
    }

    public final int hashCode() {
        return this.f8920b.hashCode() + (this.f8919a.f8889f.hashCode() * 31);
    }

    public final String toString() {
        return "NamedNode{name=" + this.f8919a + ", node=" + this.f8920b + '}';
    }
}
