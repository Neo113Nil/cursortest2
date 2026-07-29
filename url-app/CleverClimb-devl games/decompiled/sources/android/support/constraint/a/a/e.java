package android.support.constraint.a.a;

import android.support.constraint.a.a.b;

/* compiled from: Optimizer.java */
/* loaded from: classes.dex */
public class e {
    static void a(c cVar, android.support.constraint.a.e eVar, int i, b bVar) {
        int i2;
        float f;
        float f2;
        float h;
        b bVar2 = bVar;
        b bVar3 = null;
        int i3 = 0;
        int i4 = 0;
        float f3 = 0.0f;
        while (true) {
            if (bVar2 == null) {
                break;
            }
            if (!(bVar2.d() == 8)) {
                i3++;
                if (bVar2.G != b.a.MATCH_CONSTRAINT) {
                    i4 = i4 + bVar2.h() + (bVar2.i.f1398c != null ? bVar2.i.d() : 0) + (bVar2.k.f1398c != null ? bVar2.k.d() : 0);
                } else {
                    f3 += bVar2.W;
                }
            }
            b bVar4 = bVar2.k.f1398c != null ? bVar2.k.f1398c.f1396a : null;
            if (bVar4 != null && (bVar4.i.f1398c == null || (bVar4.i.f1398c != null && bVar4.i.f1398c.f1396a != bVar2))) {
                bVar4 = null;
            }
            b bVar5 = bVar4;
            bVar3 = bVar2;
            bVar2 = bVar5;
        }
        if (bVar3 != null) {
            i2 = bVar3.k.f1398c != null ? bVar3.k.f1398c.f1396a.f() : 0;
            if (bVar3.k.f1398c != null && bVar3.k.f1398c.f1396a == cVar) {
                i2 = cVar.t();
            }
        } else {
            i2 = 0;
        }
        float f4 = (i2 - 0) - i4;
        float f5 = f4 / (i3 + 1);
        if (i == 0) {
            f2 = f5;
            f = f2;
        } else {
            f = f4 / i;
            f2 = 0.0f;
        }
        b bVar6 = bVar;
        while (bVar6 != null) {
            int d2 = bVar6.i.f1398c != null ? bVar6.i.d() : 0;
            int d3 = bVar6.k.f1398c != null ? bVar6.k.d() : 0;
            if (bVar6.d() != 8) {
                float f6 = d2;
                float f7 = f2 + f6;
                eVar.a(bVar6.i.f, (int) (f7 + 0.5f));
                if (bVar6.G == b.a.MATCH_CONSTRAINT) {
                    h = f3 == 0.0f ? f7 + ((f - f6) - d3) : f7 + ((((bVar6.W * f4) / f3) - f6) - d3);
                } else {
                    h = f7 + bVar6.h();
                }
                eVar.a(bVar6.k.f, (int) (0.5f + h));
                if (i == 0) {
                    h += f;
                }
                f2 = h + d3;
            } else {
                int i5 = (int) ((f2 - (f / 2.0f)) + 0.5f);
                eVar.a(bVar6.i.f, i5);
                eVar.a(bVar6.k.f, i5);
            }
            b bVar7 = bVar6.k.f1398c != null ? bVar6.k.f1398c.f1396a : null;
            if (bVar7 != null && bVar7.i.f1398c != null && bVar7.i.f1398c.f1396a != bVar6) {
                bVar7 = null;
            }
            bVar6 = bVar7 == cVar ? null : bVar7;
        }
    }

    static void b(c cVar, android.support.constraint.a.e eVar, int i, b bVar) {
        int i2;
        float f;
        float f2;
        float l;
        b bVar2 = bVar;
        b bVar3 = null;
        int i3 = 0;
        int i4 = 0;
        float f3 = 0.0f;
        while (true) {
            if (bVar2 == null) {
                break;
            }
            if (!(bVar2.d() == 8)) {
                i3++;
                if (bVar2.H != b.a.MATCH_CONSTRAINT) {
                    i4 = i4 + bVar2.l() + (bVar2.j.f1398c != null ? bVar2.j.d() : 0) + (bVar2.l.f1398c != null ? bVar2.l.d() : 0);
                } else {
                    f3 += bVar2.X;
                }
            }
            b bVar4 = bVar2.l.f1398c != null ? bVar2.l.f1398c.f1396a : null;
            if (bVar4 != null && (bVar4.j.f1398c == null || (bVar4.j.f1398c != null && bVar4.j.f1398c.f1396a != bVar2))) {
                bVar4 = null;
            }
            b bVar5 = bVar4;
            bVar3 = bVar2;
            bVar2 = bVar5;
        }
        if (bVar3 != null) {
            i2 = bVar3.l.f1398c != null ? bVar3.l.f1398c.f1396a.f() : 0;
            if (bVar3.l.f1398c != null && bVar3.l.f1398c.f1396a == cVar) {
                i2 = cVar.u();
            }
        } else {
            i2 = 0;
        }
        float f4 = (i2 - 0) - i4;
        float f5 = f4 / (i3 + 1);
        if (i == 0) {
            f2 = f5;
            f = f2;
        } else {
            f = f4 / i;
            f2 = 0.0f;
        }
        b bVar6 = bVar;
        while (bVar6 != null) {
            int d2 = bVar6.j.f1398c != null ? bVar6.j.d() : 0;
            int d3 = bVar6.l.f1398c != null ? bVar6.l.d() : 0;
            if (bVar6.d() != 8) {
                float f6 = d2;
                float f7 = f2 + f6;
                eVar.a(bVar6.j.f, (int) (f7 + 0.5f));
                if (bVar6.H == b.a.MATCH_CONSTRAINT) {
                    l = f3 == 0.0f ? f7 + ((f - f6) - d3) : f7 + ((((bVar6.X * f4) / f3) - f6) - d3);
                } else {
                    l = f7 + bVar6.l();
                }
                eVar.a(bVar6.l.f, (int) (0.5f + l));
                if (i == 0) {
                    l += f;
                }
                f2 = l + d3;
            } else {
                int i5 = (int) ((f2 - (f / 2.0f)) + 0.5f);
                eVar.a(bVar6.j.f, i5);
                eVar.a(bVar6.l.f, i5);
            }
            b bVar7 = bVar6.l.f1398c != null ? bVar6.l.f1398c.f1396a : null;
            if (bVar7 != null && bVar7.j.f1398c != null && bVar7.j.f1398c.f1396a != bVar6) {
                bVar7 = null;
            }
            bVar6 = bVar7 == cVar ? null : bVar7;
        }
    }

    static void a(c cVar, android.support.constraint.a.e eVar, b bVar) {
        if (cVar.G != b.a.WRAP_CONTENT && bVar.G == b.a.MATCH_PARENT) {
            bVar.i.f = eVar.a(bVar.i);
            bVar.k.f = eVar.a(bVar.k);
            int i = bVar.i.f1399d;
            int h = cVar.h() - bVar.k.f1399d;
            eVar.a(bVar.i.f, i);
            eVar.a(bVar.k.f, h);
            bVar.c(i, h);
            bVar.f1412a = 2;
        }
        if (cVar.H == b.a.WRAP_CONTENT || bVar.H != b.a.MATCH_PARENT) {
            return;
        }
        bVar.j.f = eVar.a(bVar.j);
        bVar.l.f = eVar.a(bVar.l);
        int i2 = bVar.j.f1399d;
        int l = cVar.l() - bVar.l.f1399d;
        eVar.a(bVar.j.f, i2);
        eVar.a(bVar.l.f, l);
        if (bVar.A > 0 || bVar.d() == 8) {
            bVar.m.f = eVar.a(bVar.m);
            eVar.a(bVar.m.f, bVar.A + i2);
        }
        bVar.d(i2, l);
        bVar.f1413b = 2;
    }

    static void b(c cVar, android.support.constraint.a.e eVar, b bVar) {
        float E;
        int h;
        if (bVar.G == b.a.MATCH_CONSTRAINT) {
            bVar.f1412a = 1;
            return;
        }
        if (cVar.G != b.a.WRAP_CONTENT && bVar.G == b.a.MATCH_PARENT) {
            bVar.i.f = eVar.a(bVar.i);
            bVar.k.f = eVar.a(bVar.k);
            int i = bVar.i.f1399d;
            int h2 = cVar.h() - bVar.k.f1399d;
            eVar.a(bVar.i.f, i);
            eVar.a(bVar.k.f, h2);
            bVar.c(i, h2);
            bVar.f1412a = 2;
            return;
        }
        if (bVar.i.f1398c != null && bVar.k.f1398c != null) {
            if (bVar.i.f1398c.f1396a == cVar && bVar.k.f1398c.f1396a == cVar) {
                int d2 = bVar.i.d();
                int d3 = bVar.k.d();
                if (cVar.G == b.a.MATCH_CONSTRAINT) {
                    h = cVar.h() - d3;
                } else {
                    d2 += (int) (((((cVar.h() - d2) - d3) - bVar.h()) * bVar.E) + 0.5f);
                    h = bVar.h() + d2;
                }
                bVar.i.f = eVar.a(bVar.i);
                bVar.k.f = eVar.a(bVar.k);
                eVar.a(bVar.i.f, d2);
                eVar.a(bVar.k.f, h);
                bVar.f1412a = 2;
                bVar.c(d2, h);
                return;
            }
            bVar.f1412a = 1;
            return;
        }
        if (bVar.i.f1398c != null && bVar.i.f1398c.f1396a == cVar) {
            int d4 = bVar.i.d();
            int h3 = bVar.h() + d4;
            bVar.i.f = eVar.a(bVar.i);
            bVar.k.f = eVar.a(bVar.k);
            eVar.a(bVar.i.f, d4);
            eVar.a(bVar.k.f, h3);
            bVar.f1412a = 2;
            bVar.c(d4, h3);
            return;
        }
        if (bVar.k.f1398c != null && bVar.k.f1398c.f1396a == cVar) {
            bVar.i.f = eVar.a(bVar.i);
            bVar.k.f = eVar.a(bVar.k);
            int h4 = cVar.h() - bVar.k.d();
            int h5 = h4 - bVar.h();
            eVar.a(bVar.i.f, h5);
            eVar.a(bVar.k.f, h4);
            bVar.f1412a = 2;
            bVar.c(h5, h4);
            return;
        }
        if (bVar.i.f1398c != null && bVar.i.f1398c.f1396a.f1412a == 2) {
            android.support.constraint.a.g gVar = bVar.i.f1398c.f;
            bVar.i.f = eVar.a(bVar.i);
            bVar.k.f = eVar.a(bVar.k);
            int d5 = (int) (gVar.f1447d + bVar.i.d() + 0.5f);
            int h6 = bVar.h() + d5;
            eVar.a(bVar.i.f, d5);
            eVar.a(bVar.k.f, h6);
            bVar.f1412a = 2;
            bVar.c(d5, h6);
            return;
        }
        if (bVar.k.f1398c != null && bVar.k.f1398c.f1396a.f1412a == 2) {
            android.support.constraint.a.g gVar2 = bVar.k.f1398c.f;
            bVar.i.f = eVar.a(bVar.i);
            bVar.k.f = eVar.a(bVar.k);
            int d6 = (int) ((gVar2.f1447d - bVar.k.d()) + 0.5f);
            int h7 = d6 - bVar.h();
            eVar.a(bVar.i.f, h7);
            eVar.a(bVar.k.f, d6);
            bVar.f1412a = 2;
            bVar.c(h7, d6);
            return;
        }
        boolean z = bVar.i.f1398c != null;
        boolean z2 = bVar.k.f1398c != null;
        if (z || z2) {
            return;
        }
        if (bVar instanceof d) {
            d dVar = (d) bVar;
            if (dVar.D() == 1) {
                bVar.i.f = eVar.a(bVar.i);
                bVar.k.f = eVar.a(bVar.k);
                if (dVar.F() != -1) {
                    E = dVar.F();
                } else if (dVar.G() != -1) {
                    E = cVar.h() - dVar.G();
                } else {
                    E = dVar.E() * cVar.h();
                }
                int i2 = (int) (E + 0.5f);
                eVar.a(bVar.i.f, i2);
                eVar.a(bVar.k.f, i2);
                bVar.f1412a = 2;
                bVar.f1413b = 2;
                bVar.c(i2, i2);
                bVar.d(0, cVar.l());
                return;
            }
            return;
        }
        bVar.i.f = eVar.a(bVar.i);
        bVar.k.f = eVar.a(bVar.k);
        int f = bVar.f();
        int h8 = bVar.h() + f;
        eVar.a(bVar.i.f, f);
        eVar.a(bVar.k.f, h8);
        bVar.f1412a = 2;
    }

    static void c(c cVar, android.support.constraint.a.e eVar, b bVar) {
        float E;
        int l;
        if (bVar.H == b.a.MATCH_CONSTRAINT) {
            bVar.f1413b = 1;
            return;
        }
        if (cVar.H != b.a.WRAP_CONTENT && bVar.H == b.a.MATCH_PARENT) {
            bVar.j.f = eVar.a(bVar.j);
            bVar.l.f = eVar.a(bVar.l);
            int i = bVar.j.f1399d;
            int l2 = cVar.l() - bVar.l.f1399d;
            eVar.a(bVar.j.f, i);
            eVar.a(bVar.l.f, l2);
            if (bVar.A > 0 || bVar.d() == 8) {
                bVar.m.f = eVar.a(bVar.m);
                eVar.a(bVar.m.f, bVar.A + i);
            }
            bVar.d(i, l2);
            bVar.f1413b = 2;
            return;
        }
        if (bVar.j.f1398c != null && bVar.l.f1398c != null) {
            if (bVar.j.f1398c.f1396a == cVar && bVar.l.f1398c.f1396a == cVar) {
                int d2 = bVar.j.d();
                int d3 = bVar.l.d();
                if (cVar.H == b.a.MATCH_CONSTRAINT) {
                    l = bVar.l() + d2;
                } else {
                    d2 = (int) (d2 + ((((cVar.l() - d2) - d3) - bVar.l()) * bVar.F) + 0.5f);
                    l = bVar.l() + d2;
                }
                bVar.j.f = eVar.a(bVar.j);
                bVar.l.f = eVar.a(bVar.l);
                eVar.a(bVar.j.f, d2);
                eVar.a(bVar.l.f, l);
                if (bVar.A > 0 || bVar.d() == 8) {
                    bVar.m.f = eVar.a(bVar.m);
                    eVar.a(bVar.m.f, bVar.A + d2);
                }
                bVar.f1413b = 2;
                bVar.d(d2, l);
                return;
            }
            bVar.f1413b = 1;
            return;
        }
        if (bVar.j.f1398c != null && bVar.j.f1398c.f1396a == cVar) {
            int d4 = bVar.j.d();
            int l3 = bVar.l() + d4;
            bVar.j.f = eVar.a(bVar.j);
            bVar.l.f = eVar.a(bVar.l);
            eVar.a(bVar.j.f, d4);
            eVar.a(bVar.l.f, l3);
            if (bVar.A > 0 || bVar.d() == 8) {
                bVar.m.f = eVar.a(bVar.m);
                eVar.a(bVar.m.f, bVar.A + d4);
            }
            bVar.f1413b = 2;
            bVar.d(d4, l3);
            return;
        }
        if (bVar.l.f1398c != null && bVar.l.f1398c.f1396a == cVar) {
            bVar.j.f = eVar.a(bVar.j);
            bVar.l.f = eVar.a(bVar.l);
            int l4 = cVar.l() - bVar.l.d();
            int l5 = l4 - bVar.l();
            eVar.a(bVar.j.f, l5);
            eVar.a(bVar.l.f, l4);
            if (bVar.A > 0 || bVar.d() == 8) {
                bVar.m.f = eVar.a(bVar.m);
                eVar.a(bVar.m.f, bVar.A + l5);
            }
            bVar.f1413b = 2;
            bVar.d(l5, l4);
            return;
        }
        if (bVar.j.f1398c != null && bVar.j.f1398c.f1396a.f1413b == 2) {
            android.support.constraint.a.g gVar = bVar.j.f1398c.f;
            bVar.j.f = eVar.a(bVar.j);
            bVar.l.f = eVar.a(bVar.l);
            int d5 = (int) (gVar.f1447d + bVar.j.d() + 0.5f);
            int l6 = bVar.l() + d5;
            eVar.a(bVar.j.f, d5);
            eVar.a(bVar.l.f, l6);
            if (bVar.A > 0 || bVar.d() == 8) {
                bVar.m.f = eVar.a(bVar.m);
                eVar.a(bVar.m.f, bVar.A + d5);
            }
            bVar.f1413b = 2;
            bVar.d(d5, l6);
            return;
        }
        if (bVar.l.f1398c != null && bVar.l.f1398c.f1396a.f1413b == 2) {
            android.support.constraint.a.g gVar2 = bVar.l.f1398c.f;
            bVar.j.f = eVar.a(bVar.j);
            bVar.l.f = eVar.a(bVar.l);
            int d6 = (int) ((gVar2.f1447d - bVar.l.d()) + 0.5f);
            int l7 = d6 - bVar.l();
            eVar.a(bVar.j.f, l7);
            eVar.a(bVar.l.f, d6);
            if (bVar.A > 0 || bVar.d() == 8) {
                bVar.m.f = eVar.a(bVar.m);
                eVar.a(bVar.m.f, bVar.A + l7);
            }
            bVar.f1413b = 2;
            bVar.d(l7, d6);
            return;
        }
        if (bVar.m.f1398c != null && bVar.m.f1398c.f1396a.f1413b == 2) {
            android.support.constraint.a.g gVar3 = bVar.m.f1398c.f;
            bVar.j.f = eVar.a(bVar.j);
            bVar.l.f = eVar.a(bVar.l);
            int i2 = (int) ((gVar3.f1447d - bVar.A) + 0.5f);
            int l8 = bVar.l() + i2;
            eVar.a(bVar.j.f, i2);
            eVar.a(bVar.l.f, l8);
            bVar.m.f = eVar.a(bVar.m);
            eVar.a(bVar.m.f, bVar.A + i2);
            bVar.f1413b = 2;
            bVar.d(i2, l8);
            return;
        }
        boolean z = bVar.m.f1398c != null;
        boolean z2 = bVar.j.f1398c != null;
        boolean z3 = bVar.l.f1398c != null;
        if (z || z2 || z3) {
            return;
        }
        if (bVar instanceof d) {
            d dVar = (d) bVar;
            if (dVar.D() == 0) {
                bVar.j.f = eVar.a(bVar.j);
                bVar.l.f = eVar.a(bVar.l);
                if (dVar.F() != -1) {
                    E = dVar.F();
                } else if (dVar.G() != -1) {
                    E = cVar.l() - dVar.G();
                } else {
                    E = dVar.E() * cVar.l();
                }
                int i3 = (int) (E + 0.5f);
                eVar.a(bVar.j.f, i3);
                eVar.a(bVar.l.f, i3);
                bVar.f1413b = 2;
                bVar.f1412a = 2;
                bVar.d(i3, i3);
                bVar.c(0, cVar.h());
                return;
            }
            return;
        }
        bVar.j.f = eVar.a(bVar.j);
        bVar.l.f = eVar.a(bVar.l);
        int g = bVar.g();
        int l9 = bVar.l() + g;
        eVar.a(bVar.j.f, g);
        eVar.a(bVar.l.f, l9);
        if (bVar.A > 0 || bVar.d() == 8) {
            bVar.m.f = eVar.a(bVar.m);
            eVar.a(bVar.m.f, g + bVar.A);
        }
        bVar.f1413b = 2;
    }
}
