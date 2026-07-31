package F;

/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final w.d f1675a;

    /* renamed from: b, reason: collision with root package name */
    public final w.d f1676b;

    /* renamed from: c, reason: collision with root package name */
    public final w.d f1677c;

    /* renamed from: d, reason: collision with root package name */
    public final w.d f1678d;

    /* renamed from: e, reason: collision with root package name */
    public final w.d f1679e;

    public m1() {
        w.d dVar = l1.f1653a;
        w.d dVar2 = l1.f1654b;
        w.d dVar3 = l1.f1655c;
        w.d dVar4 = l1.f1656d;
        w.d dVar5 = l1.f1657e;
        this.f1675a = dVar;
        this.f1676b = dVar2;
        this.f1677c = dVar3;
        this.f1678d = dVar4;
        this.f1679e = dVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return f2.j.a(this.f1675a, m1Var.f1675a) && f2.j.a(this.f1676b, m1Var.f1676b) && f2.j.a(this.f1677c, m1Var.f1677c) && f2.j.a(this.f1678d, m1Var.f1678d) && f2.j.a(this.f1679e, m1Var.f1679e);
    }

    public final int hashCode() {
        return this.f1679e.hashCode() + ((this.f1678d.hashCode() + ((this.f1677c.hashCode() + ((this.f1676b.hashCode() + (this.f1675a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f1675a + ", small=" + this.f1676b + ", medium=" + this.f1677c + ", large=" + this.f1678d + ", extraLarge=" + this.f1679e + ')';
    }
}
