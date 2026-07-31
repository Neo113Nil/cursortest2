package E;

import B.Y;
import I.C0150g0;
import N2.C0203a;
import a0.C0238c;
import a0.C0241f;
import b0.C0352v;
import d0.C0401b;
import d0.C0406g;
import e2.InterfaceC0422a;
import h2.AbstractC0508a;
import j.C0538l;
import java.io.IOException;
import java.util.ArrayList;
import m.AbstractC0620e;
import m.AbstractC0639y;
import m.C0619d;
import m.t0;
import m.y0;
import n0.C0709g;
import n0.C0710h;
import q.C0805a;
import q.C0806b;
import q.C0807c;
import q.C0808d;
import q.C0809e;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;
import u0.C1123s;
import z.C1256t;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public boolean f922a;

    /* renamed from: b, reason: collision with root package name */
    public Object f923b;

    /* renamed from: c, reason: collision with root package name */
    public Object f924c = AbstractC0620e.a();

    /* renamed from: d, reason: collision with root package name */
    public Object f925d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public Object f926e;

    /* JADX WARN: Multi-variable type inference failed */
    public F(InterfaceC0422a interfaceC0422a, boolean z3) {
        this.f922a = z3;
        this.f923b = (f2.k) interfaceC0422a;
    }

    public IOException a(boolean z3, boolean z4, IOException iOException) {
        if (iOException != null) {
            h(iOException);
        }
        K2.g gVar = (K2.g) this.f923b;
        if (z4) {
            if (iOException != null) {
                f2.j.f(gVar, "call");
            } else {
                f2.j.f(gVar, "call");
            }
        }
        if (z3) {
            if (iOException != null) {
                f2.j.f(gVar, "call");
            } else {
                f2.j.f(gVar, "call");
            }
        }
        return gVar.f(this, z4, z3, iOException);
    }

    public void b(t0.G g3, float f3, long j3) {
        float floatValue = ((Number) ((C0619d) this.f924c).d()).floatValue();
        if (floatValue > 0.0f) {
            long b3 = C0352v.b(j3, floatValue);
            if (!this.f922a) {
                g3.M(b3, f3, (r18 & 4) != 0 ? g3.y() : 0L, 1.0f, C0406g.f5653a, null, 3);
                return;
            }
            C0401b c0401b = g3.f8573d;
            float d3 = C0241f.d(c0401b.d());
            float b4 = C0241f.b(c0401b.d());
            G1.m mVar = c0401b.f5649e;
            long n3 = mVar.n();
            mVar.h().f();
            try {
                ((G1.m) ((Y) mVar.f2116b).f334d).h().r(0.0f, 0.0f, d3, b4, 1);
                g3.M(b3, f3, (r18 & 4) != 0 ? g3.y() : 0L, 1.0f, C0406g.f5653a, null, 3);
            } finally {
                A.k.q(mVar, n3);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [e2.a, f2.k] */
    public void c(q.i iVar, InterfaceC0835w interfaceC0835w) {
        boolean z3 = iVar instanceof q.g;
        ArrayList arrayList = (ArrayList) this.f925d;
        if (z3) {
            arrayList.add(iVar);
        } else if (iVar instanceof q.h) {
            arrayList.remove(((q.h) iVar).f7842a);
        } else if (iVar instanceof C0808d) {
            arrayList.add(iVar);
        } else if (iVar instanceof C0809e) {
            arrayList.remove(((C0809e) iVar).f7838a);
        } else if (iVar instanceof C0806b) {
            arrayList.add(iVar);
        } else if (iVar instanceof C0807c) {
            arrayList.remove(((C0807c) iVar).f7837a);
        } else if (!(iVar instanceof C0805a)) {
            return;
        } else {
            arrayList.remove(((C0805a) iVar).f7836a);
        }
        q.i iVar2 = (q.i) S1.l.R0(arrayList);
        if (f2.j.a((q.i) this.f926e, iVar2)) {
            return;
        }
        if (iVar2 != null) {
            C0080h c0080h = (C0080h) ((f2.k) this.f923b).b();
            float f3 = z3 ? c0080h.f962c : iVar instanceof C0808d ? c0080h.f961b : iVar instanceof C0806b ? c0080h.f960a : 0.0f;
            t0 t0Var = w.f1008a;
            boolean z4 = iVar2 instanceof q.g;
            t0 t0Var2 = w.f1008a;
            if (!z4) {
                if (iVar2 instanceof C0808d) {
                    t0Var2 = new t0(45, 0, AbstractC0639y.f6912d);
                } else if (iVar2 instanceof C0806b) {
                    t0Var2 = new t0(45, 0, AbstractC0639y.f6912d);
                }
            }
            AbstractC0837y.r(interfaceC0835w, null, null, new D(this, f3, t0Var2, null), 3);
        } else {
            q.i iVar3 = (q.i) this.f926e;
            t0 t0Var3 = w.f1008a;
            boolean z5 = iVar3 instanceof q.g;
            t0 t0Var4 = w.f1008a;
            if (!z5 && !(iVar3 instanceof C0808d) && (iVar3 instanceof C0806b)) {
                t0Var4 = new t0(150, 0, AbstractC0639y.f6912d);
            }
            AbstractC0837y.r(interfaceC0835w, null, null, new E(this, t0Var4, null), 3);
        }
        this.f926e = iVar2;
    }

    public G2.v d(G2.u uVar) {
        L2.e eVar = (L2.e) this.f925d;
        try {
            String a3 = G2.u.a(uVar, "Content-Type");
            long a4 = eVar.a(uVar);
            return new G2.v(a3, a4, AbstractC0508a.p(new K2.c(this, eVar.g(uVar), a4)), 1);
        } catch (IOException e3) {
            f2.j.f((K2.g) this.f923b, "call");
            h(e3);
            throw e3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int e(C1256t c1256t, C1123s c1123s, boolean z3) {
        Object[] objArr;
        G1.m mVar;
        int i3;
        t0.r rVar = (t0.r) this.f926e;
        if (this.f922a) {
            return 0;
        }
        try {
            this.f922a = true;
            C1256t m3 = ((y0) this.f925d).m(c1256t, c1123s);
            C0538l c0538l = (C0538l) m3.f10466e;
            int c2 = c0538l.c();
            for (int i4 = 0; i4 < c2; i4++) {
                n0.s sVar = (n0.s) c0538l.d(i4);
                if (!sVar.f7311d && !sVar.f7315h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int c3 = c0538l.c();
            int i5 = 0;
            while (true) {
                mVar = (G1.m) this.f924c;
                if (i5 >= c3) {
                    break;
                }
                n0.s sVar2 = (n0.s) c0538l.d(i5);
                if (objArr != false || n0.q.a(sVar2)) {
                    ((t0.E) this.f923b).w(sVar2.f7310c, (t0.r) this.f926e, n0.q.e(sVar2.f7316i, 1), true);
                    if (!rVar.isEmpty()) {
                        mVar.a(sVar2.f7308a, rVar, n0.q.a(sVar2));
                        rVar.clear();
                    }
                }
                i5++;
            }
            ((C0710h) mVar.f2117c).d();
            boolean c4 = mVar.c(m3, z3);
            int c5 = c0538l.c();
            int i6 = 0;
            while (true) {
                if (i6 >= c5) {
                    i3 = 0;
                    break;
                }
                n0.s sVar3 = (n0.s) c0538l.d(i6);
                if (!C0238c.b(n0.q.h(sVar3, true), 0L) && sVar3.b()) {
                    i3 = 2;
                    break;
                }
                i6++;
            }
            int i7 = (c4 ? 1 : 0) | i3;
            this.f922a = false;
            return i7;
        } catch (Throwable th) {
            this.f922a = false;
            throw th;
        }
    }

    public void f() {
        if (this.f922a) {
            return;
        }
        C0538l c0538l = (C0538l) ((y0) this.f925d).f6913d;
        int i3 = c0538l.f6290g;
        Object[] objArr = c0538l.f6289f;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            objArr[i5] = null;
        }
        c0538l.f6290g = 0;
        c0538l.f6287d = false;
        G1.m mVar = (G1.m) this.f924c;
        K.d dVar = ((C0710h) mVar.f2117c).f7291a;
        int i6 = dVar.f3216f;
        if (i6 > 0) {
            Object[] objArr2 = dVar.f3214d;
            do {
                ((C0709g) objArr2[i4]).f();
                i4++;
            } while (i4 < i6);
        }
        ((C0710h) mVar.f2117c).f7291a.h();
    }

    public G2.t g(boolean z3) {
        try {
            G2.t f3 = ((L2.e) this.f925d).f(z3);
            if (f3 != null) {
                f3.f2293m = this;
            }
            return f3;
        } catch (IOException e3) {
            f2.j.f((K2.g) this.f923b, "call");
            h(e3);
            throw e3;
        }
    }

    public void h(IOException iOException) {
        this.f922a = true;
        ((K2.d) this.f924c).c(iOException);
        K2.j h3 = ((L2.e) this.f925d).h();
        K2.g gVar = (K2.g) this.f923b;
        synchronized (h3) {
            try {
                f2.j.f(gVar, "call");
                if (!(iOException instanceof N2.D)) {
                    if (!(h3.f3312g != null) || (iOException instanceof C0203a)) {
                        h3.f3315j = true;
                        if (h3.f3318m == 0) {
                            K2.j.d(gVar.f3287d, h3.f3307b, iOException);
                            h3.f3317l++;
                        }
                    }
                } else if (((N2.D) iOException).f3579d == 8) {
                    int i3 = h3.f3319n + 1;
                    h3.f3319n = i3;
                    if (i3 > 1) {
                        h3.f3315j = true;
                        h3.f3317l++;
                    }
                } else if (((N2.D) iOException).f3579d != 9 || !gVar.f3299p) {
                    h3.f3315j = true;
                    h3.f3317l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(int i3, int i4) {
        if (i3 < 0.0f) {
            throw new IllegalArgumentException(("Index should be non-negative (" + i3 + ')').toString());
        }
        ((C0150g0) this.f923b).h(i3);
        t.v vVar = (t.v) this.f926e;
        if (i3 != vVar.f8516e) {
            vVar.f8516e = i3;
            int i5 = (i3 / 30) * 30;
            vVar.f8515d.setValue(O2.d.g0(Math.max(i5 - 100, 0), i5 + 130));
        }
        ((C0150g0) this.f924c).h(i4);
    }
}
