package org.apache.a.c.b;

/* compiled from: BasicRouteDirector.java */
/* loaded from: classes2.dex */
public class a implements c {
    @Override // org.apache.a.c.b.c
    public int a(e eVar, e eVar2) {
        if (eVar == null) {
            throw new IllegalArgumentException("Planned route may not be null.");
        }
        if (eVar2 == null || eVar2.c() < 1) {
            return a(eVar);
        }
        if (eVar.c() > 1) {
            return c(eVar, eVar2);
        }
        return b(eVar, eVar2);
    }

    protected int a(e eVar) {
        return eVar.c() > 1 ? 2 : 1;
    }

    protected int b(e eVar, e eVar2) {
        if (eVar2.c() <= 1 && eVar.a().equals(eVar2.a()) && eVar.g() == eVar2.g()) {
            return (eVar.b() == null || eVar.b().equals(eVar2.b())) ? 0 : -1;
        }
        return -1;
    }

    protected int c(e eVar, e eVar2) {
        int c2;
        int c3;
        if (eVar2.c() <= 1 || !eVar.a().equals(eVar2.a()) || (c2 = eVar.c()) < (c3 = eVar2.c())) {
            return -1;
        }
        for (int i = 0; i < c3 - 1; i++) {
            if (!eVar.a(i).equals(eVar2.a(i))) {
                return -1;
            }
        }
        if (c2 > c3) {
            return 4;
        }
        if ((eVar2.e() && !eVar.e()) || (eVar2.f() && !eVar.f())) {
            return -1;
        }
        if (eVar.e() && !eVar2.e()) {
            return 3;
        }
        if (!eVar.f() || eVar2.f()) {
            return eVar.g() != eVar2.g() ? -1 : 0;
        }
        return 5;
    }
}
