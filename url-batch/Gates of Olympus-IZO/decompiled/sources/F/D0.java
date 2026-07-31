package F;

import I.C0093f;
import I.C0095g;
import I.C0122u;
import I.EnumC0121t0;
import a1.AbstractC0172j;
import a1.AbstractC0179q;
import android.os.CancellationSignal;
import android.view.View;
import androidx.lifecycle.C0238x;
import androidx.lifecycle.InterfaceC0236v;
import b0.C0254E;
import b0.C0264O;
import b0.C0265P;
import b0.C0278k;
import b0.C0283p;
import d0.InterfaceC0323d;
import e1.C0347J;
import e2.AbstractC0381e;
import f.AbstractC0382a;
import h.AbstractC0416e;
import h1.C0438i;
import j.C0475A;
import j.C0506x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import k2.AbstractC0552y;
import k2.C0536h;
import k2.EnumC0551x;
import l.C0567l;
import l.C0568m;
import m.AbstractC0595e;
import m.C0580E;
import m.C0583H;
import m.C0584I;
import m.InterfaceC0615z;
import n2.C0692Q;
import o.C0732h;
import o.C0743t;
import q1.C0775D;
import q1.C0778b;
import q1.C0784h;
import q1.C0786j;
import r.C0826x;
import r.RunnableC0789A;
import r1.C0857i;
import t.C0892b;
import t0.AbstractC0898f;
import u0.AbstractC0963b0;

/* loaded from: classes.dex */
public final class D0 extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f886e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f887f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f888g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D0(Object obj, int i3, Object obj2) {
        super(1);
        this.f886e = i3;
        this.f887f = obj;
        this.f888g = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.Object, java.util.List] */
    @Override // Y1.c
    public final Object j(Object obj) {
        L1.z zVar;
        L1.z zVar2;
        C0238x e3;
        int i3 = 2;
        int i4 = 1;
        int i5 = 0;
        switch (this.f886e) {
            case 0:
                ((G.f) this.f887f).f1518a.setValue(new C0826x((r.U) this.f888g, (r.U) obj));
                return L1.z.f2729a;
            case 1:
                return ((D1.E) this.f887f).j(((List) this.f888g).get(((Number) obj).intValue()));
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                C0095g c0095g = (C0095g) this.f887f;
                Object obj2 = c0095g.f2252e;
                C0093f c0093f = (C0093f) this.f888g;
                synchronized (obj2) {
                    c0095g.f2254g.remove(c0093f);
                    if (c0095g.f2254g.isEmpty()) {
                        c0095g.f2256i.set(0);
                    }
                }
                return L1.z.f2729a;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                I.T t3 = (I.T) this.f887f;
                Object obj3 = t3.f2198b;
                C0536h c0536h = (C0536h) this.f888g;
                synchronized (obj3) {
                    ((ArrayList) t3.f2199c).remove(c0536h);
                }
                return L1.z.f2729a;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                Throwable th = (Throwable) obj;
                I.A0 a02 = (I.A0) this.f887f;
                Object obj4 = a02.f2061b;
                Throwable th2 = (Throwable) this.f888g;
                synchronized (obj4) {
                    if (th2 == null) {
                        th2 = null;
                    } else if (th != null) {
                        try {
                            if (th instanceof CancellationException) {
                                th = null;
                            }
                            if (th != null) {
                                M1.B.o(th2, th);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    a02.f2063d = th2;
                    C0692Q c0692q = a02.f2076r;
                    EnumC0121t0 enumC0121t0 = EnumC0121t0.f2360d;
                    c0692q.getClass();
                    c0692q.k(null, enumC0121t0);
                }
                return L1.z.f2729a;
            case 5:
                ((C0122u) this.f887f).x(obj);
                C0475A c0475a = (C0475A) this.f888g;
                if (c0475a != null) {
                    c0475a.a(obj);
                }
                return L1.z.f2729a;
            case 6:
                return ((D1.E) this.f887f).j(((List) this.f888g).get(((Number) obj).intValue()));
            case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((D1.E) this.f887f).j(((List) this.f888g).get(((Number) obj).intValue()));
            case 8:
                ((CancellationSignal) this.f887f).cancel();
                ((k2.m0) this.f888g).a(null);
                return L1.z.f2729a;
            case AbstractC0382a.f4777a /* 9 */:
                r0.G.h((r0.G) obj, (r0.H) this.f887f, ((C0283p) this.f888g).f4286q);
                return L1.z.f2729a;
            case AbstractC0382a.f4779c /* 10 */:
                r0.G.h((r0.G) obj, (r0.H) this.f887f, ((C0264O) this.f888g).f4246G);
                return L1.z.f2729a;
            case 11:
                Throwable th4 = (Throwable) obj;
                ((C0047j0) this.f887f).j(th4);
                A2.k kVar = (A2.k) this.f888g;
                ((m2.e) kVar.f110d).k(th4, false);
                do {
                    Object f3 = ((m2.e) kVar.f110d).f();
                    if (f3 instanceof m2.k) {
                        f3 = null;
                    }
                    zVar = L1.z.f2729a;
                    if (f3 != null) {
                        C0347J.f4624e.g(f3, th4);
                        zVar2 = zVar;
                    } else {
                        zVar2 = null;
                    }
                } while (zVar2 != null);
                return zVar;
            case 12:
                r0.G g3 = (r0.G) obj;
                float g4 = ((l.w) this.f888g).f5512c.g();
                r0.H h3 = (r0.H) this.f887f;
                g3.getClass();
                long c3 = I2.d.c(0, 0);
                r0.G.a(g3, h3);
                h3.Q(M0.g.c(c3, h3.f7118h), g4, null);
                return L1.z.f2729a;
            case 13:
                m.m0 m0Var = (m.m0) obj;
                C0568m c0568m = (C0568m) this.f887f;
                Object b2 = m0Var.b();
                C0506x c0506x = c0568m.f5482d;
                I.X0 x02 = (I.X0) c0506x.e(b2);
                long j3 = x02 != null ? ((M0.i) x02.getValue()).f2774a : 0L;
                I.X0 x03 = (I.X0) c0506x.e(m0Var.c());
                long j4 = x03 != null ? ((M0.i) x03.getValue()).f2774a : 0L;
                l.M m3 = (l.M) ((C0567l) this.f888g).f5477b.getValue();
                if (m3 != null) {
                    InterfaceC0615z interfaceC0615z = (InterfaceC0615z) m3.f5446b.g(new M0.i(j3), new M0.i(j4));
                    if (interfaceC0615z != null) {
                        return interfaceC0615z;
                    }
                }
                return AbstractC0595e.h(0.0f, null, 7);
            case 14:
                C0583H c0583h = (C0583H) this.f887f;
                K.d dVar = c0583h.f5582a;
                C0580E c0580e = (C0580E) this.f888g;
                dVar.b(c0580e);
                c0583h.f5583b.setValue(Boolean.TRUE);
                return new C0584I(c0583h, i5, c0580e);
            case AbstractC0382a.f4781e /* 15 */:
                AbstractC0552y.q((p2.c) this.f887f, null, EnumC0551x.f5398g, new m.q0((m.s0) this.f888g, null), 1);
                return new m.r0(0);
            case 16:
                m.s0 s0Var = (m.s0) this.f887f;
                S.t tVar = s0Var.f5850j;
                m.s0 s0Var2 = (m.s0) this.f888g;
                tVar.add(s0Var2);
                return new C0584I(s0Var, i4, s0Var2);
            case 17:
                return new C0584I((m.s0) this.f887f, i3, (m.l0) this.f888g);
            case 18:
                t0.F f4 = (t0.F) obj;
                f4.b();
                InterfaceC0323d.S(f4, ((C0254E) this.f887f).f4211a, (C0265P) this.f888g, 0.0f, null, 60);
                return L1.z.f2729a;
            case 19:
                t0.F f5 = (t0.F) obj;
                f5.b();
                InterfaceC0323d.S(f5, (C0278k) this.f887f, (C0265P) this.f888g, 0.0f, null, 60);
                return L1.z.f2729a;
            case 20:
                ((q.j) this.f887f).c((q.h) this.f888g);
                return L1.z.f2729a;
            case 21:
                ((n0.f) this.f887f).f6213a.n((C0732h) this.f888g);
                return L1.z.f2729a;
            case 22:
                o0.c cVar = (o0.c) this.f887f;
                AbstractC0381e.k(cVar, (n0.m) obj);
                I.Y0 y02 = AbstractC0963b0.f8306q;
                o.g0 g0Var = (o.g0) this.f888g;
                float b3 = ((u0.D0) AbstractC0898f.i(g0Var, y02)).b();
                long j5 = M1.B.j(b3, b3);
                if (M0.n.b(j5) <= 0.0f || M0.n.c(j5) <= 0.0f) {
                    AbstractC0381e.N("maximumVelocity should be a positive value. You specified=" + ((Object) M0.n.f(j5)));
                    throw null;
                }
                float b4 = M0.n.b(j5);
                o0.b bVar = cVar.f6688a;
                float b5 = bVar.b(b4);
                float c4 = M0.n.c(j5);
                o0.b bVar2 = cVar.f6689b;
                long j6 = M1.B.j(b5, bVar2.b(c4));
                M1.k.c0(r12, 0, bVar.f6683d.length);
                bVar.f6684e = 0;
                M1.k.c0(r12, 0, bVar2.f6683d.length);
                bVar2.f6684e = 0;
                cVar.f6690c = 0L;
                m2.e eVar = g0Var.f6526w;
                if (eVar != null) {
                    int i6 = o.G.f6435a;
                    eVar.g(new C0743t(M1.B.j(Float.isNaN(M0.n.b(j6)) ? 0.0f : M0.n.b(j6), Float.isNaN(M0.n.c(j6)) ? 0.0f : M0.n.c(j6))));
                }
                return L1.z.f2729a;
            case 23:
                long j7 = ((o.r) obj).f6611a;
                long a3 = ((o.o0) this.f888g).f6595d == o.J.f6444e ? a0.c.a(j7, 1) : a0.c.a(j7, 2);
                o.o0 o0Var = ((o.l0) this.f887f).f6573a;
                o0Var.f6598g = 1;
                n.e0 e0Var = o0Var.f6593b;
                if (e0Var == null || !(o0Var.f6592a.a() || o0Var.f6592a.c())) {
                    o.o0.a(o0Var, o0Var.f6599h, a3, 1);
                } else {
                    e0Var.c(a3, o0Var.f6598g, o0Var.f6601j);
                }
                return L1.z.f2729a;
            case 24:
                ((Number) obj).longValue();
                o.A0 a03 = (o.A0) this.f887f;
                float f6 = a03.f6412e;
                a03.f6412e = 0.0f;
                ((Y1.c) this.f888g).j(Float.valueOf(f6));
                return L1.z.f2729a;
            case 25:
                q1.H h4 = (q1.H) obj;
                Z1.i.f(h4, "$this$navOptions");
                q1.F f7 = h4.f6867a;
                f7.f6858f = 0;
                f7.f6859g = 0;
                q1.w wVar = (q1.w) this.f887f;
                if (wVar instanceof q1.z) {
                    int i7 = q1.w.f6961l;
                    Iterator it = g2.i.Q(wVar).iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        C0775D c0775d = (C0775D) this.f888g;
                        if (hasNext) {
                            q1.w wVar2 = (q1.w) it.next();
                            C0784h c0784h = (C0784h) c0775d.f6834g.k();
                            q1.w wVar3 = c0784h != null ? c0784h.f6895e : null;
                            if (Z1.i.a(wVar2, wVar3 != null ? wVar3.f6963e : null)) {
                            }
                        } else {
                            int i8 = q1.z.f6978q;
                            int i9 = AbstractC0416e.s(c0775d.f()).f6967i;
                            C0778b c0778b = C0778b.f6882k;
                            h4.f6870d = i9;
                            q1.L l3 = new q1.L();
                            c0778b.j(l3);
                            h4.f6871e = l3.f6876a;
                        }
                    }
                }
                return L1.z.f2729a;
            case 26:
                r.V v3 = (r.V) this.f887f;
                int i10 = v3.f7046s;
                View view = (View) this.f888g;
                if (i10 == 0) {
                    int i11 = AbstractC0179q.f3561a;
                    RunnableC0789A runnableC0789A = v3.f7047t;
                    AbstractC0172j.u(view, runnableC0789A);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(runnableC0789A);
                    AbstractC0179q.a(view, runnableC0789A);
                }
                v3.f7046s++;
                return new C0584I(v3, 3, view);
            case 27:
                C0775D c0775d2 = (C0775D) this.f887f;
                c0775d2.getClass();
                InterfaceC0236v interfaceC0236v = (InterfaceC0236v) this.f888g;
                Z1.i.f(interfaceC0236v, "owner");
                if (!interfaceC0236v.equals(c0775d2.f6842o)) {
                    InterfaceC0236v interfaceC0236v2 = c0775d2.f6842o;
                    C0786j c0786j = c0775d2.f6845s;
                    if (interfaceC0236v2 != null && (e3 = interfaceC0236v2.e()) != null) {
                        e3.f(c0786j);
                    }
                    c0775d2.f6842o = interfaceC0236v;
                    interfaceC0236v.e().a(c0786j);
                }
                return new m.r0(1);
            case 28:
                return new C0584I((I.X0) this.f887f, 5, (C0857i) this.f888g);
            default:
                E2.n q2 = ((t.u) this.f887f).q(((Number) obj).intValue());
                ?? r12 = q2.f844c;
                ArrayList arrayList = new ArrayList(r12.size());
                int size = r12.size();
                int i12 = q2.f843b;
                int i13 = 0;
                while (i5 < size) {
                    int i14 = (int) ((C0892b) r12.get(i5)).f7571a;
                    arrayList.add(new L1.j(Integer.valueOf(i12), new M0.a(((t.l) this.f888g).a(i13, i14))));
                    i12++;
                    i13 += i14;
                    i5++;
                }
                return arrayList;
        }
    }
}
