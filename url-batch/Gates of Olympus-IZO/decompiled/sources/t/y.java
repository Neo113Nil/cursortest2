package t;

import D1.C0014b;
import F.C0036e;
import F.C0066t0;
import I.C0089d;
import I.C0102j0;
import I.InterfaceC0088c0;
import I.X;
import e2.AbstractC0381e;
import java.util.ArrayList;
import java.util.List;
import o.J;
import o.h0;
import s.C0858a;
import s.C0873p;
import s.C0875r;
import t0.D;
import u.C0922D;
import u.C0925G;
import u.C0936d;
import u.C0939g;
import u.InterfaceC0924F;
import u.Q;
import u.T;

/* loaded from: classes.dex */
public final class y implements h0 {

    /* renamed from: t, reason: collision with root package name */
    public static final C2.c f7687t;

    /* renamed from: b, reason: collision with root package name */
    public final C0873p f7689b;

    /* renamed from: e, reason: collision with root package name */
    public float f7692e;

    /* renamed from: h, reason: collision with root package name */
    public D f7695h;

    /* renamed from: m, reason: collision with root package name */
    public final C0925G f7700m;

    /* renamed from: r, reason: collision with root package name */
    public final C0102j0 f7704r;

    /* renamed from: s, reason: collision with root package name */
    public final C0102j0 f7705s;

    /* renamed from: a, reason: collision with root package name */
    public final C0858a f7688a = new C0858a(2, 1);

    /* renamed from: c, reason: collision with root package name */
    public final C0102j0 f7690c = C0089d.J(z.f7706a, X.f2225f);

    /* renamed from: d, reason: collision with root package name */
    public final q.j f7691d = new q.j();

    /* renamed from: f, reason: collision with root package name */
    public final H2.h f7693f = new H2.h(new x(0, this));

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7694g = true;

    /* renamed from: i, reason: collision with root package name */
    public final C0875r f7696i = new C0875r(this, 1);

    /* renamed from: j, reason: collision with root package name */
    public final C0936d f7697j = new C0936d();

    /* renamed from: k, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.a f7698k = new androidx.compose.foundation.lazy.layout.a();

    /* renamed from: l, reason: collision with root package name */
    public final n0.f f7699l = new n0.f(2);

    /* renamed from: n, reason: collision with root package name */
    public final n0.o f7701n = new n0.o(this);

    /* renamed from: o, reason: collision with root package name */
    public final C0922D f7702o = new C0922D();
    public final InterfaceC0088c0 p = AbstractC0381e.v();

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC0088c0 f7703q = AbstractC0381e.v();

    static {
        f fVar = f.f7582g;
        n nVar = n.f7623g;
        C0036e c0036e = new C0036e(fVar);
        Z1.w.d(1, nVar);
        C2.c cVar = R.o.f3164a;
        f7687t = new C2.c(c0036e, 3, nVar);
    }

    public y(int i3, int i4) {
        this.f7689b = new C0873p(i3, i4, 1);
        this.f7700m = new C0925G(new C0066t0(this, i3, 3));
        Boolean bool = Boolean.FALSE;
        X x3 = X.f2228i;
        this.f7704r = C0089d.J(bool, x3);
        this.f7705s = C0089d.J(bool, x3);
    }

    @Override // o.h0
    public final boolean a() {
        return ((Boolean) this.f7704r.getValue()).booleanValue();
    }

    @Override // o.h0
    public final float b(float f3) {
        return this.f7693f.b(f3);
    }

    @Override // o.h0
    public final boolean c() {
        return ((Boolean) this.f7705s.getValue()).booleanValue();
    }

    @Override // o.h0
    public final boolean d() {
        return this.f7693f.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // o.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(n.X x3, Y1.e eVar, R1.c cVar) {
        v vVar;
        Q1.a aVar;
        int i3;
        y yVar;
        H2.h hVar;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i4 = vVar.f7681i;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                vVar.f7681i = i4 - Integer.MIN_VALUE;
                Object obj = vVar.f7679g;
                aVar = Q1.a.f3113d;
                i3 = vVar.f7681i;
                if (i3 != 0) {
                    I2.l.Q(obj);
                    vVar.f7676d = this;
                    vVar.f7677e = x3;
                    vVar.f7678f = eVar;
                    vVar.f7681i = 1;
                    if (this.f7697j.h(vVar) == aVar) {
                        return aVar;
                    }
                    yVar = this;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        I2.l.Q(obj);
                        return L1.z.f2729a;
                    }
                    eVar = vVar.f7678f;
                    x3 = vVar.f7677e;
                    yVar = vVar.f7676d;
                    I2.l.Q(obj);
                }
                hVar = yVar.f7693f;
                vVar.f7676d = null;
                vVar.f7677e = null;
                vVar.f7678f = null;
                vVar.f7681i = 2;
                if (hVar.e(x3, eVar, vVar) == aVar) {
                    return aVar;
                }
                return L1.z.f2729a;
            }
        }
        vVar = new v(this, cVar);
        Object obj2 = vVar.f7679g;
        aVar = Q1.a.f3113d;
        i3 = vVar.f7681i;
        if (i3 != 0) {
        }
        hVar = yVar.f7693f;
        vVar.f7676d = null;
        vVar.f7677e = null;
        vVar.f7678f = null;
        vVar.f7681i = 2;
        if (hVar.e(x3, eVar, vVar) == aVar) {
        }
        return L1.z.f2729a;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f8  */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(p pVar, boolean z3) {
        Object obj;
        int i3;
        int i4;
        int i5;
        this.f7692e -= pVar.f7632d;
        this.f7690c.setValue(pVar);
        int i6 = 0;
        r rVar = pVar.f7629a;
        this.f7705s.setValue(Boolean.valueOf(((rVar != null ? rVar.f7660a : 0) == 0 && pVar.f7630b == 0) ? false : true));
        this.f7704r.setValue(Boolean.valueOf(pVar.f7631c));
        C0873p c0873p = this.f7689b;
        if (z3) {
            int i7 = pVar.f7630b;
            if (i7 >= 0.0f) {
                c0873p.f7453c.h(i7);
                return;
            }
            c0873p.getClass();
            throw new IllegalStateException(("scrollOffset should be non-negative (" + i7 + ')').toString());
        }
        c0873p.getClass();
        if (rVar != null) {
            q[] qVarArr = rVar.f7661b;
            q qVar = qVarArr.length == 0 ? null : qVarArr[0];
            if (qVar != null) {
                obj = qVar.f7644b;
                c0873p.f7455e = obj;
                if (!c0873p.f7454d || pVar.f7638j > 0) {
                    c0873p.f7454d = true;
                    i3 = pVar.f7630b;
                    if (i3 >= 0.0f) {
                        throw new IllegalStateException(("scrollOffset should be non-negative (" + i3 + ')').toString());
                    }
                    if (rVar != null) {
                        q[] qVarArr2 = rVar.f7661b;
                        q qVar2 = qVarArr2.length != 0 ? qVarArr2[0] : null;
                        if (qVar2 != null) {
                            i4 = qVar2.f7643a;
                            c0873p.a(i4, i3);
                        }
                    }
                    i4 = 0;
                    c0873p.a(i4, i3);
                }
                if (this.f7694g) {
                    C0858a c0858a = this.f7688a;
                    if (c0858a.f7342b != -1) {
                        ?? r12 = pVar.f7635g;
                        if (r12.isEmpty()) {
                            return;
                        }
                        boolean z4 = c0858a.f7343c;
                        J j3 = J.f6443d;
                        J j4 = pVar.f7639k;
                        if (z4) {
                            q qVar3 = (q) M1.l.s0(r12);
                            i5 = (j4 == j3 ? qVar3.f7658q : qVar3.f7659r) + 1;
                        } else {
                            q qVar4 = (q) M1.l.m0(r12);
                            i5 = (j4 == j3 ? qVar4.f7658q : qVar4.f7659r) - 1;
                        }
                        if (c0858a.f7342b != i5) {
                            c0858a.f7342b = -1;
                            K.d dVar = (K.d) c0858a.f7344d;
                            int i8 = dVar.f2642f;
                            if (i8 > 0) {
                                Object[] objArr = dVar.f2640d;
                                do {
                                    ((InterfaceC0924F) objArr[i6]).cancel();
                                    i6++;
                                } while (i6 < i8);
                            }
                            dVar.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        obj = null;
        c0873p.f7455e = obj;
        if (!c0873p.f7454d) {
        }
        c0873p.f7454d = true;
        i3 = pVar.f7630b;
        if (i3 >= 0.0f) {
        }
    }

    public final p g() {
        return (p) this.f7690c.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v9, types: [Y1.c, Z1.j] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    public final void h(float f3, p pVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C0939g c0939g;
        int i8;
        if (this.f7694g) {
            C0858a c0858a = this.f7688a;
            c0858a.getClass();
            if (pVar.f7635g.isEmpty()) {
                return;
            }
            boolean z3 = f3 < 0.0f;
            J j3 = J.f6443d;
            J j4 = pVar.f7639k;
            ?? r9 = pVar.f7635g;
            if (z3) {
                q qVar = (q) M1.l.s0(r9);
                i3 = (j4 == j3 ? qVar.f7658q : qVar.f7659r) + 1;
                i4 = ((q) M1.l.s0(r9)).f7643a + 1;
            } else {
                q qVar2 = (q) M1.l.m0(r9);
                i3 = (j4 == j3 ? qVar2.f7658q : qVar2.f7659r) - 1;
                i4 = ((q) M1.l.m0(r9)).f7643a - 1;
            }
            if (i4 < 0 || i4 >= pVar.f7638j) {
                return;
            }
            int i9 = c0858a.f7342b;
            K.d dVar = (K.d) c0858a.f7344d;
            if (i3 != i9 && i3 >= 0) {
                if (c0858a.f7343c != z3 && (i8 = dVar.f2642f) > 0) {
                    Object[] objArr = dVar.f2640d;
                    int i10 = 0;
                    do {
                        ((InterfaceC0924F) objArr[i10]).cancel();
                        i10++;
                    } while (i10 < i8);
                }
                c0858a.f7343c = z3;
                c0858a.f7342b = i3;
                dVar.h();
                n0.o oVar = this.f7701n;
                oVar.getClass();
                ArrayList arrayList = new ArrayList();
                y yVar = (y) oVar.f6239a;
                S.i c3 = S.u.c();
                Y1.c f4 = c3 != null ? c3.f() : null;
                S.i d3 = S.u.d(c3);
                try {
                    List list = (List) ((p) yVar.f7690c.getValue()).f7634f.j(Integer.valueOf(i3));
                    int size = list.size();
                    int i11 = 0;
                    while (i11 < size) {
                        L1.j jVar = (L1.j) list.get(i11);
                        List list2 = list;
                        C0925G c0925g = yVar.f7700m;
                        y yVar2 = yVar;
                        int intValue = ((Number) jVar.f2708d).intValue();
                        long j5 = ((M0.a) jVar.f2709e).f2760a;
                        C0014b c0014b = c0925g.f8010c;
                        if (c0014b != null) {
                            i7 = size;
                            Q q2 = new Q(c0014b, intValue, j5, c0925g.f8009b);
                            ((T) c0014b.f538d).d(q2);
                            c0939g = q2;
                        } else {
                            i7 = size;
                            c0939g = C0939g.f8065a;
                        }
                        arrayList.add(c0939g);
                        i11++;
                        list = list2;
                        yVar = yVar2;
                        size = i7;
                    }
                    S.u.f(c3, d3, f4);
                    dVar.d(dVar.f2642f, arrayList);
                } catch (Throwable th) {
                    S.u.f(c3, d3, f4);
                    throw th;
                }
            }
            if (!z3) {
                if (pVar.f7636h - g2.i.T((q) M1.l.m0(r9), j4) >= f3 || (i5 = dVar.f2642f) <= 0) {
                    return;
                }
                Object[] objArr2 = dVar.f2640d;
                int i12 = 0;
                do {
                    ((InterfaceC0924F) objArr2[i12]).a();
                    i12++;
                } while (i12 < i5);
                return;
            }
            q qVar3 = (q) M1.l.s0(r9);
            if (((g2.i.T(qVar3, j4) + ((int) (j4 == j3 ? qVar3.f7657o & 4294967295L : qVar3.f7657o >> 32))) + pVar.f7641m) - pVar.f7637i >= (-f3) || (i6 = dVar.f2642f) <= 0) {
                return;
            }
            Object[] objArr3 = dVar.f2640d;
            int i13 = 0;
            do {
                ((InterfaceC0924F) objArr3[i13]).a();
                i13++;
            } while (i13 < i6);
        }
    }
}
