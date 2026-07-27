package w;

import A0.AbstractC0037h;
import A0.C0036g;
import B1.C0097d;
import G.C0192d;
import G.C0205j0;
import G.C0222s0;
import Z.C0311h;
import Z.C0323u;
import kotlin.jvm.functions.Function1;
import p0.InterfaceC0980p;
import s0.L0;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public X f11054a;

    /* renamed from: b, reason: collision with root package name */
    public final C0222s0 f11055b;

    /* renamed from: c, reason: collision with root package name */
    public final L0 f11056c;

    /* renamed from: d, reason: collision with root package name */
    public final y.t f11057d;

    /* renamed from: e, reason: collision with root package name */
    public G0.E f11058e;

    /* renamed from: f, reason: collision with root package name */
    public final C0205j0 f11059f;

    /* renamed from: g, reason: collision with root package name */
    public final C0205j0 f11060g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0980p f11061h;

    /* renamed from: i, reason: collision with root package name */
    public final C0205j0 f11062i;

    /* renamed from: j, reason: collision with root package name */
    public C0036g f11063j;

    /* renamed from: k, reason: collision with root package name */
    public final C0205j0 f11064k;

    /* renamed from: l, reason: collision with root package name */
    public final C0205j0 f11065l;

    /* renamed from: m, reason: collision with root package name */
    public final C0205j0 f11066m;

    /* renamed from: n, reason: collision with root package name */
    public final C0205j0 f11067n;

    /* renamed from: o, reason: collision with root package name */
    public final C0205j0 f11068o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11069p;

    /* renamed from: q, reason: collision with root package name */
    public final C0205j0 f11070q;

    /* renamed from: r, reason: collision with root package name */
    public final C0097d f11071r;

    /* renamed from: s, reason: collision with root package name */
    public Function1 f11072s;

    /* renamed from: t, reason: collision with root package name */
    public final C1277q f11073t;

    /* renamed from: u, reason: collision with root package name */
    public final C1277q f11074u;

    /* renamed from: v, reason: collision with root package name */
    public final C0311h f11075v;

    /* renamed from: w, reason: collision with root package name */
    public long f11076w;

    /* renamed from: x, reason: collision with root package name */
    public final C0205j0 f11077x;

    /* renamed from: y, reason: collision with root package name */
    public final C0205j0 f11078y;

    public P(X x2, C0222s0 c0222s0, L0 l02) {
        this.f11054a = x2;
        this.f11055b = c0222s0;
        this.f11056c = l02;
        y.t tVar = new y.t(6, false);
        C0036g c0036g = AbstractC0037h.f332a;
        long j4 = A0.K.f299b;
        G0.y yVar = new G0.y(c0036g, j4, (A0.K) null);
        tVar.f11494e = yVar;
        tVar.f11495i = new G0.j(c0036g, yVar.f3094b);
        this.f11057d = tVar;
        Boolean bool = Boolean.FALSE;
        G.W w4 = G.W.f2779l;
        this.f11059f = C0192d.K(bool, w4);
        this.f11060g = C0192d.K(new M0.e(0), w4);
        this.f11062i = C0192d.K(null, w4);
        this.f11064k = C0192d.K(EnumC1257F.f11023d, w4);
        this.f11065l = C0192d.K(bool, w4);
        this.f11066m = C0192d.K(bool, w4);
        this.f11067n = C0192d.K(bool, w4);
        this.f11068o = C0192d.K(bool, w4);
        this.f11069p = true;
        this.f11070q = C0192d.K(Boolean.TRUE, w4);
        this.f11071r = new C0097d(l02);
        this.f11072s = C1265e.f11165k;
        this.f11073t = new C1277q(this, 5);
        this.f11074u = new C1277q(this, 4);
        this.f11075v = Z.K.g();
        this.f11076w = C0323u.f4547g;
        this.f11077x = C0192d.K(new A0.K(j4), w4);
        this.f11078y = C0192d.K(new A0.K(j4), w4);
    }

    public final EnumC1257F a() {
        return (EnumC1257F) this.f11064k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f11059f.getValue()).booleanValue();
    }

    public final InterfaceC0980p c() {
        InterfaceC0980p interfaceC0980p = this.f11061h;
        if (interfaceC0980p == null || !interfaceC0980p.p()) {
            return null;
        }
        return interfaceC0980p;
    }

    public final o0 d() {
        return (o0) this.f11062i.getValue();
    }

    public final void e(long j4) {
        this.f11078y.setValue(new A0.K(j4));
    }

    public final void f(long j4) {
        this.f11077x.setValue(new A0.K(j4));
    }
}
