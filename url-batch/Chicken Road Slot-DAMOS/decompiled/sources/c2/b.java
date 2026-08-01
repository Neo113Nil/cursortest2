package c2;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends d1.k implements v, l, x1, t1, b2.c, r1, u, m, i1.p, p1 {
    public d1.j C;

    @Override // d1.k
    public final void A() {
        I(true);
    }

    @Override // d1.k
    public final void B() {
        if (!this.B) {
            z1.a.b("unInitializeModifier called on unattached node");
        }
        if ((this.f3307i & 8) != 0) {
            k.v(this).C();
        }
    }

    public final void I(boolean z10) {
        if (!this.B) {
            z1.a.b("initializeModifier called on unattached node");
        }
        d1.j jVar = this.C;
        if ((this.f3307i & 4) != 0 && !z10) {
            k.s(this, 2).K0();
        }
        if ((this.f3307i & 2) != 0) {
            z1 z1Var = (z1) k.u(this).S.f1495f;
            z1Var.getClass();
            if (z1Var.C) {
                i1 i1Var = this.f3312v;
                i1Var.getClass();
                ((x) i1Var).c1(this);
                o1 o1Var = i1Var.Y;
                if (o1Var != null) {
                    ((d2.i1) o1Var).c();
                }
            }
            if (!z10) {
                k.s(this, 2).K0();
                k.u(this).B();
            }
        }
        int i3 = this.f3307i;
        if ((i3 & 16) != 0 && (jVar instanceof x1.q)) {
            ((x1.q) jVar).f10314d.f1820a = this.f3312v;
        }
        if ((i3 & 8) != 0) {
            k.v(this).C();
        }
    }

    public final void J() {
        d1.j jVar = this.C;
        z1.a.b("onFocusEvent called on wrong node");
        jVar.getClass();
        throw new ClassCastException();
    }

    @Override // c2.i, c2.t1
    public final void a() {
        if (this.C instanceof x1.q) {
            m();
        }
    }

    @Override // b2.c
    public final b2.a c() {
        return b2.a.f1048a;
    }

    @Override // c2.l
    public final void f(i0 i0Var) {
        d1.j jVar = this.C;
        jVar.getClass();
        i0Var.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0130 A[ORIG_RETURN, RETURN] */
    @Override // c2.t1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(b1.c0 c0Var, x1.h hVar, long j) {
        boolean z10;
        boolean z11;
        boolean z12;
        d1.j jVar = this.C;
        jVar.getClass();
        c6.i iVar = ((x1.q) jVar).f10314d;
        x1.q qVar = (x1.q) iVar.f1823d;
        List list = (List) c0Var.f954b;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            x1.l lVar = (x1.l) list.get(i3);
            if (c6.f.l(lVar) || c6.f.m(lVar)) {
                z10 = false;
                break;
            }
        }
        z10 = true;
        if (z10) {
            int size2 = list.size();
            for (int i10 = 0; i10 < size2; i10++) {
                if (!((x1.l) list.get(i10)).b()) {
                }
            }
            z11 = true;
            if (!qVar.f10313c) {
                int size3 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size3) {
                        x1.l lVar2 = (x1.l) list.get(i11);
                        if (c6.f.l(lVar2) || c6.f.m(lVar2)) {
                            break;
                        } else {
                            i11++;
                        }
                    } else if (!z11) {
                        z12 = false;
                    }
                }
            }
            z12 = true;
            if (((x1.o) iVar.f1821b) != x1.o.f10307i) {
                if (hVar == x1.h.f10270d && z12) {
                    iVar.f1822c = c0Var;
                    iVar.e(c0Var, !z10 || qVar.f10313c);
                }
                if (hVar == x1.h.f10271e && z10 && c0Var.equals((b1.c0) iVar.f1822c) && qVar.f10313c) {
                    int size4 = list.size();
                    for (int i12 = 0; i12 < size4; i12++) {
                        ((x1.l) list.get(i12)).a();
                    }
                }
                if (hVar == x1.h.f10272i && !z12 && !c0Var.equals((b1.c0) iVar.f1822c)) {
                    iVar.e(c0Var, true);
                }
            }
            if (hVar != x1.h.f10272i) {
                int size5 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size5) {
                        iVar.f1821b = x1.o.f10305d;
                        ((x1.q) iVar.f1823d).f10313c = false;
                        iVar.f1822c = null;
                        break;
                    } else if (!c6.f.m((x1.l) list.get(i13))) {
                        break;
                    } else {
                        i13++;
                    }
                }
                if (c0Var.equals((b1.c0) iVar.f1822c) && z10) {
                    int size6 = list.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size6) {
                            break;
                        }
                        if (!((x1.l) list.get(i14)).b()) {
                            i14++;
                        } else if (!qVar.f10313c) {
                            iVar.h(c0Var);
                            return;
                        }
                    }
                    int size7 = list.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        ((x1.l) list.get(i15)).a();
                    }
                    return;
                }
                return;
            }
            return;
        }
        z11 = false;
        if (!qVar.f10313c) {
        }
        z12 = true;
        if (((x1.o) iVar.f1821b) != x1.o.f10307i) {
        }
        if (hVar != x1.h.f10272i) {
        }
    }

    @Override // c2.t1
    public final boolean k() {
        d1.j jVar = this.C;
        jVar.getClass();
        ((x1.q) jVar).f10314d.getClass();
        return true;
    }

    @Override // i1.p
    public final void l(i1.m mVar) {
        d1.j jVar = this.C;
        z1.a.b("applyFocusProperties called on wrong node");
        jVar.getClass();
        throw new ClassCastException();
    }

    @Override // c2.t1
    public final void m() {
        d1.j jVar = this.C;
        jVar.getClass();
        c6.i iVar = ((x1.q) jVar).f10314d;
        x1.o oVar = (x1.o) iVar.f1821b;
        x1.q qVar = (x1.q) iVar.f1823d;
        if (oVar == x1.o.f10306e) {
            long uptimeMillis = SystemClock.uptimeMillis();
            x1.p pVar = new x1.p(qVar, 0);
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setSource(0);
            pVar.invoke(obtain);
            obtain.recycle();
            iVar.f1821b = x1.o.f10305d;
            qVar.f10313c = false;
            iVar.f1822c = null;
        }
    }

    @Override // c2.p1
    public final boolean o() {
        return this.B;
    }

    @Override // c2.r1
    public final Object q(Object obj) {
        d1.j jVar = this.C;
        jVar.getClass();
        return (u.j) jVar;
    }

    @Override // c2.l
    public final void r() {
        k.l(this);
    }

    @Override // c2.t1
    public final void s() {
        d1.j jVar = this.C;
        jVar.getClass();
        ((x1.q) jVar).f10314d.getClass();
    }

    @Override // c2.m
    public final void t(i1 i1Var) {
        this.C.getClass();
        throw new ClassCastException();
    }

    public final String toString() {
        return this.C.toString();
    }

    @Override // c2.x1
    public final void u(j2.u uVar) {
        int i3;
        d1.j jVar = this.C;
        jVar.getClass();
        j2.b bVar = (j2.b) jVar;
        j2.j jVar2 = new j2.j();
        jVar2.f4977i = bVar.f4930a;
        bVar.f4931b.invoke(jVar2);
        uVar.getClass();
        j2.j jVar3 = (j2.j) uVar;
        s.h0 h0Var = jVar3.f4975d;
        if (jVar2.f4977i) {
            jVar3.f4977i = true;
        }
        if (jVar2.f4978r) {
            jVar3.f4978r = true;
        }
        s.h0 h0Var2 = jVar2.f4975d;
        Object[] objArr = h0Var2.f8313b;
        Object[] objArr2 = h0Var2.f8314c;
        long[] jArr = h0Var2.f8312a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8;
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((255 & j) < 128) {
                        int i14 = (i10 << 3) + i13;
                        Object obj = objArr[i14];
                        Object obj2 = objArr2[i14];
                        j2.t tVar = (j2.t) obj;
                        if (!h0Var.b(tVar)) {
                            h0Var.m(tVar, obj2);
                        } else if (obj2 instanceof j2.a) {
                            Object g = h0Var.g(tVar);
                            g.getClass();
                            j2.a aVar = (j2.a) g;
                            i3 = i11;
                            String str = aVar.f4928a;
                            if (str == null) {
                                str = ((j2.a) obj2).f4928a;
                            }
                            hd.c cVar = aVar.f4929b;
                            if (cVar == null) {
                                cVar = ((j2.a) obj2).f4929b;
                            }
                            h0Var.m(tVar, new j2.a(str, cVar));
                            j >>= i3;
                            i13++;
                            i11 = i3;
                        }
                    }
                    i3 = i11;
                    j >>= i3;
                    i13++;
                    i11 = i3;
                }
                if (i12 != i11) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // c2.v
    public final a2.h0 v(o0 o0Var, a2.f0 f0Var, long j) {
        this.C.getClass();
        throw new ClassCastException();
    }

    @Override // c2.u
    public final void e(long j) {
    }

    @Override // c2.u
    public final void g(a2.n nVar) {
    }
}
