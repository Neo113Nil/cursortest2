package c0;

import a0.e0;
import c7.a0;
import g0.d1;
import java.io.IOException;
import java.util.ArrayList;
import l.v1;
import l.z;
import r1.d0;
import r1.f0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1513a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1514b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1515c = l.e.a();

    /* renamed from: d, reason: collision with root package name */
    public Object f1516d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public Object f1517e;

    /* JADX WARN: Multi-variable type inference failed */
    public w(q6.a aVar, boolean z8) {
        this.f1513a = z8;
        this.f1514b = (r6.l) aVar;
    }

    public void a(f0 f0Var, float f9, long j8) {
        b1.c cVar = f0Var.f7767f;
        float floatValue = ((Number) ((l.d) this.f1515c).d()).floatValue();
        if (floatValue > 0.0f) {
            long b9 = z0.u.b(j8, floatValue);
            if (!this.f1513a) {
                b1.e.p(f0Var, b9, f9, 0L, 124);
                return;
            }
            float d8 = y0.f.d(cVar.d());
            float b10 = y0.f.b(cVar.d());
            b1.b bVar = cVar.f1234g;
            long p6 = bVar.p();
            bVar.k().o();
            try {
                ((b1.b) ((b6.c) bVar.f1230g).f1394g).k().j(0.0f, 0.0f, d8, b10, 1);
                b1.e.p(f0Var, b9, f9, 0L, 124);
            } finally {
                a0.m.s(bVar, p6);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [q6.a, r6.l] */
    public void b(p.h hVar, c7.x xVar) {
        ArrayList arrayList = (ArrayList) this.f1516d;
        boolean z8 = hVar instanceof p.f;
        if (z8) {
            arrayList.add(hVar);
        } else if (hVar instanceof p.g) {
            arrayList.remove(((p.g) hVar).f6975a);
        } else if (hVar instanceof p.d) {
            arrayList.add(hVar);
        } else if (hVar instanceof p.e) {
            arrayList.remove(((p.e) hVar).f6974a);
        } else if (hVar instanceof p.b) {
            arrayList.add(hVar);
        } else if (hVar instanceof p.c) {
            arrayList.remove(((p.c) hVar).f6973a);
        } else if (!(hVar instanceof p.a)) {
            return;
        } else {
            arrayList.remove(((p.a) hVar).f6972a);
        }
        p.h hVar2 = (p.h) e6.l.o0(arrayList);
        if (r6.k.a((p.h) this.f1517e, hVar2)) {
            return;
        }
        h6.d dVar = null;
        if (hVar2 != null) {
            f fVar = (f) ((r6.l) this.f1514b).a();
            float f9 = z8 ? fVar.f1456c : hVar instanceof p.d ? fVar.f1455b : hVar instanceof p.b ? fVar.f1454a : 0.0f;
            v1 v1Var = p.f1494a;
            if (!(hVar2 instanceof p.f)) {
                if (hVar2 instanceof p.d) {
                    v1Var = new v1(45, 0, z.f5734c);
                } else if (hVar2 instanceof p.b) {
                    v1Var = new v1(45, 0, z.f5734c);
                }
            }
            a0.p(xVar, null, null, new v(this, f9, v1Var, (h6.d) null), 3);
        } else {
            p.h hVar3 = (p.h) this.f1517e;
            v1 v1Var2 = p.f1494a;
            if (!(hVar3 instanceof p.f) && !(hVar3 instanceof p.d) && (hVar3 instanceof p.b)) {
                v1Var2 = new v1(150, 0, z.f5734c);
            }
            a0.p(xVar, null, null, new e0(this, v1Var2, dVar, 4), 3);
        }
        this.f1517e = hVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int c(androidx.room.c cVar, s1.r rVar, boolean z8) {
        Object[] objArr;
        int i7;
        b1.b bVar = (b1.b) this.f1515c;
        r1.r rVar2 = (r1.r) this.f1517e;
        if (this.f1513a) {
            return 0;
        }
        try {
            this.f1513a = true;
            androidx.room.c p6 = ((l1.x) this.f1516d).p(cVar, rVar);
            i.l lVar = (i.l) p6.f1069g;
            int c4 = lVar.c();
            for (int i8 = 0; i8 < c4; i8++) {
                l1.v vVar = (l1.v) lVar.d(i8);
                if (!vVar.f5833d && !vVar.f5837h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int c6 = lVar.c();
            for (int i9 = 0; i9 < c6; i9++) {
                l1.v vVar2 = (l1.v) lVar.d(i9);
                if (objArr != false || l1.t.a(vVar2)) {
                    ((d0) this.f1514b).w(vVar2.f5832c, (r1.r) this.f1517e, vVar2.f5838i == 1, true);
                    if (!rVar2.isEmpty()) {
                        bVar.a(vVar2.f5830a, rVar2, l1.t.a(vVar2));
                        rVar2.clear();
                    }
                }
            }
            ((l1.i) bVar.f1231h).d();
            boolean e9 = bVar.e(p6, z8);
            int c9 = lVar.c();
            int i10 = 0;
            while (true) {
                if (i10 >= c9) {
                    i7 = 0;
                    break;
                }
                l1.v vVar3 = (l1.v) lVar.d(i10);
                if (!y0.c.b(l1.t.f(vVar3, true), 0L) && vVar3.b()) {
                    i7 = 2;
                    break;
                }
                i10++;
            }
            int i11 = (e9 ? 1 : 0) | i7;
            this.f1513a = false;
            return i11;
        } catch (Throwable th) {
            this.f1513a = false;
            throw th;
        }
    }

    public void d() {
        if (this.f1513a) {
            return;
        }
        i.l lVar = (i.l) ((l1.x) this.f1516d).f5847g;
        int i7 = lVar.f4758i;
        Object[] objArr = lVar.f4757h;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            objArr[i9] = null;
        }
        lVar.f4758i = 0;
        lVar.f4755f = false;
        b1.b bVar = (b1.b) this.f1515c;
        i0.d dVar = ((l1.i) bVar.f1231h).f5811a;
        int i10 = dVar.f4842h;
        if (i10 > 0) {
            Object[] objArr2 = dVar.f4840f;
            do {
                ((l1.h) objArr2[i8]).f();
                i8++;
            } while (i8 < i10);
        }
        ((l1.i) bVar.f1231h).f5811a.h();
    }

    public s7.r e(boolean z8) {
        try {
            s7.r f9 = ((x7.d) this.f1516d).f(z8);
            if (f9 == null) {
                return f9;
            }
            f9.f8682m = this;
            return f9;
        } catch (IOException e9) {
            f(e9);
            throw e9;
        }
    }

    public void f(IOException iOException) {
        this.f1513a = true;
        ((w7.d) this.f1515c).c(iOException);
        w7.i g9 = ((x7.d) this.f1516d).g();
        w7.g gVar = (w7.g) this.f1514b;
        synchronized (g9) {
            try {
                if (!(iOException instanceof z7.a0)) {
                    if (!(g9.f9572g != null) || (iOException instanceof z7.a)) {
                        g9.f9575j = true;
                        if (g9.f9578m == 0) {
                            w7.i.d(gVar.f9551f, g9.f9567b, iOException);
                            g9.f9577l++;
                        }
                    }
                } else if (((z7.a0) iOException).f10132f == 8) {
                    int i7 = g9.f9579n + 1;
                    g9.f9579n = i7;
                    if (i7 > 1) {
                        g9.f9575j = true;
                        g9.f9577l++;
                    }
                } else if (((z7.a0) iOException).f10132f != 9 || !gVar.f9563r) {
                    g9.f9575j = true;
                    g9.f9577l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g(int i7, int i8) {
        if (i7 < 0.0f) {
            throw new IllegalArgumentException(("Index should be non-negative (" + i7 + ')').toString());
        }
        ((d1) this.f1514b).f(i7);
        s.t tVar = (s.t) this.f1517e;
        if (i7 != tVar.f8060g) {
            tVar.f8060g = i7;
            int i9 = (i7 / 30) * 30;
            tVar.f8059f.setValue(v1.g.o(Math.max(i9 - 100, 0), i9 + 130));
        }
        ((d1) this.f1515c).f(i8);
    }
}
