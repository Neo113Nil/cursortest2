package r;

import A.g0;
import A0.C0030a;
import B1.C0097d;
import C.F;
import G.C0192d;
import G.C0199g0;
import G.C0205j0;
import G.InterfaceC0191c0;
import G.W;
import M2.J;
import Q.AbstractC0274j;
import W2.B;
import f1.C0607a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l.C0788n;
import l.C0789o;
import l.w0;
import l0.C0810h;
import m.b0;
import o.C0906q;
import o.InterfaceC0893j0;
import p.C0935k;
import r0.E;
import s.C1094J;
import s.C1099c;
import s.C1102f;
import s.RunnableC1097a;
import s.z;
import y2.AbstractC1343r;
import z2.C1403G;

/* loaded from: classes.dex */
public final class v implements InterfaceC0893j0 {

    /* renamed from: w, reason: collision with root package name */
    public static final y.t f9550w;

    /* renamed from: a, reason: collision with root package name */
    public final C1057a f9551a = new C1057a(2);

    /* renamed from: b, reason: collision with root package name */
    public boolean f9552b;

    /* renamed from: c, reason: collision with root package name */
    public n f9553c;

    /* renamed from: d, reason: collision with root package name */
    public final F f9554d;

    /* renamed from: e, reason: collision with root package name */
    public final C0205j0 f9555e;

    /* renamed from: f, reason: collision with root package name */
    public final C0935k f9556f;

    /* renamed from: g, reason: collision with root package name */
    public float f9557g;

    /* renamed from: h, reason: collision with root package name */
    public final C0906q f9558h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f9559i;

    /* renamed from: j, reason: collision with root package name */
    public E f9560j;

    /* renamed from: k, reason: collision with root package name */
    public final q f9561k;

    /* renamed from: l, reason: collision with root package name */
    public final C1099c f9562l;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.a f9563m;

    /* renamed from: n, reason: collision with root package name */
    public final C0810h f9564n;

    /* renamed from: o, reason: collision with root package name */
    public final z f9565o;

    /* renamed from: p, reason: collision with root package name */
    public final C0607a f9566p;

    /* renamed from: q, reason: collision with root package name */
    public final s.w f9567q;

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC0191c0 f9568r;

    /* renamed from: s, reason: collision with root package name */
    public final C0205j0 f9569s;

    /* renamed from: t, reason: collision with root package name */
    public final C0205j0 f9570t;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC0191c0 f9571u;

    /* renamed from: v, reason: collision with root package name */
    public C0788n f9572v;

    static {
        p pVar = p.f9535d;
        m mVar = m.f9500i;
        C0030a c0030a = new C0030a(pVar);
        J.d(1, mVar);
        y.t tVar = P.o.f3675a;
        f9550w = new y.t(c0030a, 13, mVar);
    }

    public v(int i2, int i4) {
        F f4 = new F();
        f4.f1052b = C0192d.J(i2);
        f4.f1053c = C0192d.J(i4);
        f4.f1055e = new s.u(i2);
        this.f9554d = f4;
        n nVar = y.f9577b;
        W w4 = W.f2776i;
        this.f9555e = C0192d.K(nVar, w4);
        this.f9556f = new C0935k();
        this.f9558h = new C0906q(new g0(25, this));
        this.f9559i = true;
        this.f9561k = new q(this);
        this.f9562l = new C1099c();
        this.f9563m = new androidx.compose.foundation.lazy.layout.a();
        this.f9564n = new C0810h(2);
        this.f9565o = new z(new Q.u(i2, 2, this));
        this.f9566p = new C0607a(16, this);
        this.f9567q = new s.w();
        Unit unit = Unit.f7487a;
        this.f9568r = C0192d.K(unit, w4);
        Boolean bool = Boolean.FALSE;
        W w5 = W.f2779l;
        this.f9569s = C0192d.K(bool, w5);
        this.f9570t = C0192d.K(bool, w5);
        this.f9571u = C0192d.K(unit, w4);
        this.f9572v = new C0788n(w0.f7856a, Float.valueOf(0.0f), new C0789o(0.0f), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    @Override // o.InterfaceC0893j0
    public final boolean a() {
        return ((Boolean) this.f9569s.getValue()).booleanValue();
    }

    @Override // o.InterfaceC0893j0
    public final float b(float f4) {
        return this.f9558h.b(f4);
    }

    @Override // o.InterfaceC0893j0
    public final boolean c() {
        return ((Boolean) this.f9570t.getValue()).booleanValue();
    }

    @Override // o.InterfaceC0893j0
    public final boolean d() {
        return this.f9558h.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // o.InterfaceC0893j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(b0 b0Var, Function2 function2, E2.c cVar) {
        r rVar;
        D2.a aVar;
        int i2;
        v vVar;
        C0906q c0906q;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i4 = rVar.f9542o;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                rVar.f9542o = i4 - Integer.MIN_VALUE;
                Object obj = rVar.f9540m;
                aVar = D2.a.f2163d;
                i2 = rVar.f9542o;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    rVar.f9537j = this;
                    rVar.f9538k = b0Var;
                    rVar.f9539l = function2;
                    rVar.f9542o = 1;
                    if (this.f9562l.l(rVar) == aVar) {
                        return aVar;
                    }
                    vVar = this;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1343r.b(obj);
                        return Unit.f7487a;
                    }
                    function2 = rVar.f9539l;
                    b0Var = rVar.f9538k;
                    vVar = rVar.f9537j;
                    AbstractC1343r.b(obj);
                }
                c0906q = vVar.f9558h;
                rVar.f9537j = null;
                rVar.f9538k = null;
                rVar.f9539l = null;
                rVar.f9542o = 2;
                if (c0906q.e(b0Var, function2, rVar) == aVar) {
                    return aVar;
                }
                return Unit.f7487a;
            }
        }
        rVar = new r(this, cVar);
        Object obj2 = rVar.f9540m;
        aVar = D2.a.f2163d;
        i2 = rVar.f9542o;
        if (i2 != 0) {
        }
        c0906q = vVar.f9558h;
        rVar.f9537j = null;
        rVar.f9538k = null;
        rVar.f9539l = null;
        rVar.f9542o = 2;
        if (c0906q.e(b0Var, function2, rVar) == aVar) {
        }
        return Unit.f7487a;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void f(n nVar, boolean z4, boolean z5) {
        if (!z4 && this.f9552b) {
            this.f9553c = nVar;
            return;
        }
        if (z4) {
            this.f9552b = true;
        }
        o oVar = nVar.f9502a;
        this.f9570t.setValue(Boolean.valueOf(((oVar != null ? oVar.f9519a : 0) == 0 && nVar.f9503b == 0) ? false : true));
        this.f9569s.setValue(Boolean.valueOf(nVar.f9504c));
        this.f9557g -= nVar.f9505d;
        this.f9555e.setValue(nVar);
        F f4 = this.f9554d;
        if (z5) {
            int i2 = nVar.f9503b;
            if (i2 < 0.0f) {
                f4.getClass();
                throw new IllegalStateException(("scrollOffset should be non-negative (" + i2 + ')').toString());
            }
            ((C0199g0) f4.f1053c).f(i2);
        } else {
            f4.getClass();
            f4.f1054d = oVar != null ? oVar.f9526h : null;
            if (f4.f1051a || nVar.f9514m > 0) {
                f4.f1051a = true;
                int i4 = nVar.f9503b;
                if (i4 < 0.0f) {
                    throw new IllegalStateException(("scrollOffset should be non-negative (" + i4 + ')').toString());
                }
                f4.i(oVar != null ? oVar.f9519a : 0, i4);
            }
            if (this.f9559i) {
                C1057a c1057a = this.f9551a;
                if (c1057a.f9434b != -1) {
                    ?? r4 = nVar.f9511j;
                    if (!r4.isEmpty()) {
                        if (c1057a.f9434b != (c1057a.f9436d ? ((o) C1403G.x(r4)).f9519a + 1 : ((o) C1403G.q(r4)).f9519a - 1)) {
                            c1057a.f9434b = -1;
                            s.y yVar = c1057a.f9435c;
                            if (yVar != null) {
                                yVar.cancel();
                            }
                            c1057a.f9435c = null;
                        }
                    }
                }
            }
        }
        if (z4) {
            float L3 = nVar.f9509h.L(y.f9576a);
            float f5 = nVar.f9506e;
            if (f5 <= L3) {
                return;
            }
            AbstractC0274j c4 = Q.w.c();
            Function1 f6 = c4 != null ? c4.f() : null;
            AbstractC0274j d4 = Q.w.d(c4);
            try {
                float floatValue = ((Number) this.f9572v.f7813e.getValue()).floatValue();
                C0788n c0788n = this.f9572v;
                boolean z6 = c0788n.f7817l;
                b3.c cVar = nVar.f9508g;
                if (z6) {
                    this.f9572v = new C0788n(c0788n.f7812d, Float.valueOf(floatValue - f5), new C0789o(((C0789o) c0788n.f7814i).f7819a), c0788n.f7815j, c0788n.f7816k, z6);
                    B.m(cVar, null, null, new t(this, null), 3);
                } else {
                    this.f9572v = new C0788n(w0.f7856a, Float.valueOf(-f5), null, 60);
                    B.m(cVar, null, null, new u(this, null), 3);
                }
                Q.w.f(c4, d4, f6);
            } catch (Throwable th) {
                Q.w.f(c4, d4, f6);
                throw th;
            }
        }
    }

    public final n g() {
        return (n) this.f9555e.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public final void h(float f4, n nVar) {
        s.y yVar;
        s.y yVar2;
        s.y yVar3;
        s.y yVar4;
        if (this.f9559i) {
            C1057a c1057a = this.f9551a;
            if (nVar.f9511j.isEmpty()) {
                return;
            }
            boolean z4 = f4 < 0.0f;
            ?? r32 = nVar.f9511j;
            int i2 = z4 ? ((o) C1403G.x(r32)).f9519a + 1 : ((o) C1403G.q(r32)).f9519a - 1;
            if (i2 < 0 || i2 >= nVar.f9514m) {
                return;
            }
            if (i2 != c1057a.f9434b) {
                if (c1057a.f9436d != z4 && (yVar4 = c1057a.f9435c) != null) {
                    yVar4.cancel();
                }
                c1057a.f9436d = z4;
                c1057a.f9434b = i2;
                v vVar = (v) this.f9566p.f6561e;
                AbstractC0274j c4 = Q.w.c();
                Function1 f5 = c4 != null ? c4.f() : null;
                AbstractC0274j d4 = Q.w.d(c4);
                try {
                    long j4 = ((n) vVar.f9555e.getValue()).f9510i;
                    Q.w.f(c4, d4, f5);
                    z zVar = vVar.f9565o;
                    C0097d c0097d = zVar.f9980c;
                    if (c0097d != null) {
                        yVar3 = new C1094J(c0097d, i2, j4, zVar.f9979b);
                        RunnableC1097a runnableC1097a = (RunnableC1097a) c0097d.f989j;
                        runnableC1097a.f9916e.b(yVar3);
                        if (!runnableC1097a.f9917i) {
                            runnableC1097a.f9917i = true;
                            runnableC1097a.f9915d.post(runnableC1097a);
                        }
                    } else {
                        yVar3 = C1102f.f9928a;
                    }
                    c1057a.f9435c = yVar3;
                } catch (Throwable th) {
                    Q.w.f(c4, d4, f5);
                    throw th;
                }
            }
            if (!z4) {
                if (nVar.f9512k - ((o) C1403G.q(r32)).f9529k >= f4 || (yVar = c1057a.f9435c) == null) {
                    return;
                }
                yVar.a();
                return;
            }
            o oVar = (o) C1403G.x(r32);
            if (((oVar.f9529k + oVar.f9530l) + nVar.f9517p) - nVar.f9513l >= (-f4) || (yVar2 = c1057a.f9435c) == null) {
                return;
            }
            yVar2.a();
        }
    }
}
