package t5;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j extends o {

    /* renamed from: h, reason: collision with root package name */
    public final Double f8907h;

    public j(Double d8, s sVar) {
        super(sVar);
        this.f8907h = d8;
    }

    @Override // t5.o
    public final int a(o oVar) {
        return this.f8907h.compareTo(((j) oVar).f8907h);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f8907h.equals(jVar.f8907h) && this.f8914f.equals(jVar.f8914f);
    }

    @Override // t5.s
    public final String f(int i7) {
        return (m(i7) + "number:") + o5.j.a(this.f8907h.doubleValue());
    }

    @Override // t5.o
    public final int g() {
        return 3;
    }

    @Override // t5.s
    public final Object getValue() {
        return this.f8907h;
    }

    public final int hashCode() {
        return this.f8914f.hashCode() + this.f8907h.hashCode();
    }

    @Override // t5.s
    public final s n(s sVar) {
        o5.j.c(j1.c.h0(sVar));
        return new j(this.f8907h, sVar);
    }
}
