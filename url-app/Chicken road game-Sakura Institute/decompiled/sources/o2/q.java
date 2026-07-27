package o2;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final q f8948c = new q(C0924c.f8917e, k.f8939k);

    /* renamed from: d, reason: collision with root package name */
    public static final q f8949d = new q(C0924c.f8918i, s.f8952g);

    /* renamed from: a, reason: collision with root package name */
    public final C0924c f8950a;

    /* renamed from: b, reason: collision with root package name */
    public final s f8951b;

    public q(C0924c c0924c, s sVar) {
        this.f8950a = c0924c;
        this.f8951b = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f8950a.equals(qVar.f8950a) && this.f8951b.equals(qVar.f8951b);
    }

    public final int hashCode() {
        return this.f8951b.hashCode() + (this.f8950a.f8920d.hashCode() * 31);
    }

    public final String toString() {
        return "NamedNode{name=" + this.f8950a + ", node=" + this.f8951b + '}';
    }
}
