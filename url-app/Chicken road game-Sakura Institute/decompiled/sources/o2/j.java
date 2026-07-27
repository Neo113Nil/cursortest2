package o2;

import j2.AbstractC0720j;

/* loaded from: classes.dex */
public final class j extends o {

    /* renamed from: i, reason: collision with root package name */
    public final Double f8938i;

    public j(Double d4, s sVar) {
        super(sVar);
        this.f8938i = d4;
    }

    @Override // o2.o
    public final int e(o oVar) {
        return this.f8938i.compareTo(((j) oVar).f8938i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f8938i.equals(jVar.f8938i) && this.f8945d.equals(jVar.f8945d);
    }

    @Override // o2.s
    public final s f(s sVar) {
        AbstractC0720j.c(m3.s.n(sVar));
        return new j(this.f8938i, sVar);
    }

    @Override // o2.s
    public final Object getValue() {
        return this.f8938i;
    }

    @Override // o2.o
    public final int h() {
        return 3;
    }

    public final int hashCode() {
        return this.f8945d.hashCode() + this.f8938i.hashCode();
    }

    @Override // o2.s
    public final String u(int i2) {
        return (j(i2) + "number:") + AbstractC0720j.a(this.f8938i.doubleValue());
    }
}
