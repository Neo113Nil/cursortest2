package p;

import C0.C0025a;
import a0.C0238c;
import android.view.KeyEvent;
import h2.AbstractC0508a;
import l0.C0591a;
import l2.InterfaceC0604e;
import m.C0637w;
import n.C0672O;
import n0.C0702C;
import n0.C0711i;
import n0.EnumC0712j;
import q.C0805a;
import q.C0806b;
import q.C0807c;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;
import t0.AbstractC0993f;
import t0.AbstractC1000m;
import t0.InterfaceC0998k;
import u.C1082i;

/* renamed from: p.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0776m0 extends AbstractC1000m implements t0.d0, Z.n, l0.d, t0.o0, t0.m0, InterfaceC0998k {

    /* renamed from: A, reason: collision with root package name */
    public n.l0 f7717A;

    /* renamed from: B, reason: collision with root package name */
    public C0775m f7718B;
    public final G1.m C;
    public final V D;

    /* renamed from: E, reason: collision with root package name */
    public final C0775m f7719E;

    /* renamed from: F, reason: collision with root package name */
    public final C0793v0 f7720F;

    /* renamed from: G, reason: collision with root package name */
    public final C0756c0 f7721G;

    /* renamed from: H, reason: collision with root package name */
    public final C0771k f7722H;

    /* renamed from: I, reason: collision with root package name */
    public C0751a f7723I;

    /* renamed from: J, reason: collision with root package name */
    public C0025a f7724J;

    /* renamed from: K, reason: collision with root package name */
    public C0774l0 f7725K;

    /* renamed from: s, reason: collision with root package name */
    public P f7726s;

    /* renamed from: t, reason: collision with root package name */
    public f2.k f7727t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7728u;

    /* renamed from: v, reason: collision with root package name */
    public q.k f7729v;

    /* renamed from: w, reason: collision with root package name */
    public s2.g f7730w;

    /* renamed from: x, reason: collision with root package name */
    public C0806b f7731x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7732y;

    /* renamed from: z, reason: collision with root package name */
    public C0702C f7733z;

    public C0776m0(n.l0 l0Var, InterfaceC0757d interfaceC0757d, C0775m c0775m, P p3, InterfaceC0778n0 interfaceC0778n0, q.k kVar, boolean z3, boolean z4) {
        C0759e c0759e = C0759e.f7657g;
        this.f7726s = p3;
        this.f7727t = c0759e;
        this.f7728u = z3;
        this.f7729v = kVar;
        this.f7717A = l0Var;
        this.f7718B = c0775m;
        G1.m mVar = new G1.m(10);
        this.C = mVar;
        V v3 = new V();
        v3.f7615q = z3;
        y0(v3);
        this.D = v3;
        C0775m c0775m2 = new C0775m(new C0637w(new B.Y((O0.b) androidx.compose.foundation.gestures.a.f4803c)));
        this.f7719E = c0775m2;
        n.l0 l0Var2 = this.f7717A;
        C0775m c0775m3 = this.f7718B;
        C0793v0 c0793v0 = new C0793v0(interfaceC0778n0, l0Var2, c0775m3 == null ? c0775m2 : c0775m3, p3, z4, mVar);
        this.f7720F = c0793v0;
        C0756c0 c0756c0 = new C0756c0(c0793v0, z3);
        this.f7721G = c0756c0;
        C0771k c0771k = new C0771k(p3, c0793v0, z4, interfaceC0757d);
        y0(c0771k);
        this.f7722H = c0771k;
        y0(new m0.e(c0756c0, mVar));
        y0(new Z.t());
        C1082i c1082i = new C1082i();
        c1082i.f9112q = c0771k;
        y0(c1082i);
        A0.l lVar = new A0.l(28, this);
        C0672O c0672o = new C0672O();
        c0672o.f7064q = lVar;
        y0(c0672o);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object B0(C0776m0 c0776m0, X1.c cVar) {
        G g3;
        int i3;
        c0776m0.getClass();
        if (cVar instanceof G) {
            g3 = (G) cVar;
            int i4 = g3.f7518j;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                g3.f7518j = i4 - Integer.MIN_VALUE;
                Object obj = g3.f7516h;
                W1.a aVar = W1.a.f4608d;
                i3 = g3.f7518j;
                if (i3 != 0) {
                    R1.a.e(obj);
                    C0806b c0806b = c0776m0.f7731x;
                    if (c0806b != null) {
                        q.k kVar = c0776m0.f7729v;
                        if (kVar != null) {
                            C0805a c0805a = new C0805a(c0806b);
                            g3.f7515g = c0776m0;
                            g3.f7518j = 1;
                            if (kVar.b(c0805a, g3) == aVar) {
                                return aVar;
                            }
                        }
                    }
                    c0776m0.G0(0L);
                    return R1.y.f4171a;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0776m0 = g3.f7515g;
                R1.a.e(obj);
                c0776m0.f7731x = null;
                c0776m0.G0(0L);
                return R1.y.f4171a;
            }
        }
        g3 = new G(c0776m0, cVar);
        Object obj2 = g3.f7516h;
        W1.a aVar2 = W1.a.f4608d;
        i3 = g3.f7518j;
        if (i3 != 0) {
        }
        c0776m0.f7731x = null;
        c0776m0.G0(0L);
        return R1.y.f4171a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object C0(C0776m0 c0776m0, C0788t c0788t, X1.c cVar) {
        H h3;
        int i3;
        q.k kVar;
        C0806b c0806b;
        q.k kVar2;
        C0776m0 c0776m02;
        C0806b c0806b2;
        c0776m0.getClass();
        if (cVar instanceof H) {
            h3 = (H) cVar;
            int i4 = h3.f7526l;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                h3.f7526l = i4 - Integer.MIN_VALUE;
                Object obj = h3.f7524j;
                W1.a aVar = W1.a.f4608d;
                i3 = h3.f7526l;
                if (i3 != 0) {
                    R1.a.e(obj);
                    C0806b c0806b3 = c0776m0.f7731x;
                    if (c0806b3 != null && (kVar = c0776m0.f7729v) != null) {
                        C0805a c0805a = new C0805a(c0806b3);
                        h3.f7521g = c0776m0;
                        h3.f7522h = c0788t;
                        h3.f7526l = 1;
                        if (kVar.b(c0805a, h3) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0806b2 = h3.f7523i;
                        c0788t = h3.f7522h;
                        c0776m02 = h3.f7521g;
                        R1.a.e(obj);
                        c0806b = c0806b2;
                        c0776m0 = c0776m02;
                        c0776m0.f7731x = c0806b;
                        long j3 = c0788t.f7768a;
                        c0776m0.getClass();
                        return R1.y.f4171a;
                    }
                    c0788t = h3.f7522h;
                    c0776m0 = h3.f7521g;
                    R1.a.e(obj);
                }
                c0806b = new C0806b();
                kVar2 = c0776m0.f7729v;
                if (kVar2 != null) {
                    h3.f7521g = c0776m0;
                    h3.f7522h = c0788t;
                    h3.f7523i = c0806b;
                    h3.f7526l = 2;
                    if (kVar2.b(c0806b, h3) == aVar) {
                        return aVar;
                    }
                    c0776m02 = c0776m0;
                    c0806b2 = c0806b;
                    c0806b = c0806b2;
                    c0776m0 = c0776m02;
                }
                c0776m0.f7731x = c0806b;
                long j32 = c0788t.f7768a;
                c0776m0.getClass();
                return R1.y.f4171a;
            }
        }
        h3 = new H(c0776m0, cVar);
        Object obj2 = h3.f7524j;
        W1.a aVar2 = W1.a.f4608d;
        i3 = h3.f7526l;
        if (i3 != 0) {
        }
        c0806b = new C0806b();
        kVar2 = c0776m0.f7729v;
        if (kVar2 != null) {
        }
        c0776m0.f7731x = c0806b;
        long j322 = c0788t.f7768a;
        c0776m0.getClass();
        return R1.y.f4171a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object D0(C0776m0 c0776m0, C0790u c0790u, X1.c cVar) {
        I i3;
        int i4;
        c0776m0.getClass();
        if (cVar instanceof I) {
            i3 = (I) cVar;
            int i5 = i3.f7535k;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                i3.f7535k = i5 - Integer.MIN_VALUE;
                Object obj = i3.f7533i;
                W1.a aVar = W1.a.f4608d;
                i4 = i3.f7535k;
                if (i4 != 0) {
                    R1.a.e(obj);
                    C0806b c0806b = c0776m0.f7731x;
                    if (c0806b != null) {
                        q.k kVar = c0776m0.f7729v;
                        if (kVar != null) {
                            C0807c c0807c = new C0807c(c0806b);
                            i3.f7531g = c0776m0;
                            i3.f7532h = c0790u;
                            i3.f7535k = 1;
                            if (kVar.b(c0807c, i3) == aVar) {
                                return aVar;
                            }
                        }
                    }
                    c0776m0.G0(c0790u.f7773a);
                    return R1.y.f4171a;
                }
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0790u = i3.f7532h;
                c0776m0 = i3.f7531g;
                R1.a.e(obj);
                c0776m0.f7731x = null;
                c0776m0.G0(c0790u.f7773a);
                return R1.y.f4171a;
            }
        }
        i3 = new I(c0776m0, cVar);
        Object obj2 = i3.f7533i;
        W1.a aVar2 = W1.a.f4608d;
        i4 = i3.f7535k;
        if (i4 != 0) {
        }
        c0776m0.f7731x = null;
        c0776m0.G0(c0790u.f7773a);
        return R1.y.f4171a;
    }

    public final void E0() {
        C0806b c0806b = this.f7731x;
        if (c0806b != null) {
            q.k kVar = this.f7729v;
            if (kVar != null) {
                kVar.c(new C0805a(c0806b));
            }
            this.f7731x = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [e2.a, f2.k] */
    public final void G0(long j3) {
        InterfaceC0835w interfaceC0835w = (InterfaceC0835w) ((f2.k) this.C.f2117c).b();
        if (interfaceC0835w == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        AbstractC0837y.r(interfaceC0835w, null, null, new C0762f0(this, j3, null), 3);
    }

    @Override // t0.m0
    public final void N() {
        C0702C c0702c = this.f7733z;
        if (c0702c != null) {
            c0702c.N();
        }
    }

    @Override // t0.d0
    public final void e0() {
        AbstractC0993f.q(this, new E(this, 2));
    }

    @Override // Z.n
    public final void f0(Z.k kVar) {
        kVar.b(false);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [e2.c, f2.k] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    @Override // t0.m0
    public final void g0(C0711i c0711i, EnumC0712j enumC0712j, long j3) {
        long j4;
        ?? r12 = c0711i.f7292a;
        int size = r12.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            if (((Boolean) this.f7727t.n((n0.s) r12.get(i3))).booleanValue()) {
                if (this.f7728u && this.f7733z == null) {
                    F f3 = new F(this, null);
                    C0711i c0711i2 = n0.w.f7336a;
                    C0702C c0702c = new C0702C(null, null, null, f3);
                    y0(c0702c);
                    this.f7733z = c0702c;
                }
                C0702C c0702c2 = this.f7733z;
                if (c0702c2 != null) {
                    c0702c2.g0(c0711i, enumC0712j, j3);
                }
            } else {
                i3++;
            }
        }
        if (enumC0712j == EnumC0712j.f7296e && n0.q.d(c0711i.f7294c, 6)) {
            ?? r9 = c0711i.f7292a;
            int size2 = r9.size();
            for (int i4 = 0; i4 < size2; i4++) {
                if (((n0.s) r9.get(i4)).b()) {
                    return;
                }
            }
            f2.j.c(this.f7723I);
            O0.b bVar = AbstractC0993f.t(this).f8556t;
            C0238c c0238c = new C0238c(0L);
            int size3 = r9.size();
            int i5 = 0;
            while (true) {
                j4 = c0238c.f4722a;
                if (i5 >= size3) {
                    break;
                }
                c0238c = new C0238c(C0238c.h(j4, ((n0.s) r9.get(i5)).f7317j));
                i5++;
            }
            AbstractC0837y.r(m0(), null, null, new C0770j0(this, C0238c.i(j4, -bVar.J(64)), null), 3);
            int size4 = r9.size();
            for (int i6 = 0; i6 < size4; i6++) {
                ((n0.s) r9.get(i6)).a();
            }
        }
    }

    @Override // t0.o0
    public final void j(A0.i iVar) {
        if (this.f7728u && (this.f7724J == null || this.f7725K == null)) {
            this.f7724J = new C0025a(9, this);
            this.f7725K = new C0774l0(this, null);
        }
        C0025a c0025a = this.f7724J;
        if (c0025a != null) {
            InterfaceC0604e[] interfaceC0604eArr = A0.u.f193a;
            iVar.c(A0.h.f106d, new A0.a(null, c0025a));
        }
        C0774l0 c0774l0 = this.f7725K;
        if (c0774l0 != null) {
            InterfaceC0604e[] interfaceC0604eArr2 = A0.u.f193a;
            iVar.c(A0.h.f107e, c0774l0);
        }
    }

    @Override // U.p
    public final boolean n0() {
        return false;
    }

    @Override // l0.d
    public final boolean o(KeyEvent keyEvent) {
        return false;
    }

    @Override // U.p
    public final void q0() {
        AbstractC0993f.q(this, new E(this, 2));
        this.f7723I = C0751a.f7637a;
    }

    @Override // U.p
    public final void r0() {
        this.f7732y = false;
        E0();
    }

    @Override // l0.d
    public final boolean t(KeyEvent keyEvent) {
        long e3;
        if (!this.f7728u) {
            return false;
        }
        if ((!C0591a.a(l0.c.y(keyEvent), C0591a.f6570l) && !C0591a.a(l0.c.d(keyEvent.getKeyCode()), C0591a.f6569k)) || !AbstractC0508a.y(l0.c.z(keyEvent), 2) || keyEvent.isCtrlPressed()) {
            return false;
        }
        boolean z3 = this.f7720F.f7781d == P.f7567d;
        C0771k c0771k = this.f7722H;
        if (z3) {
            int i3 = (int) (c0771k.f7700y & 4294967295L);
            e3 = l0.c.e(0.0f, C0591a.a(l0.c.d(keyEvent.getKeyCode()), C0591a.f6569k) ? i3 : -i3);
        } else {
            int i4 = (int) (c0771k.f7700y >> 32);
            e3 = l0.c.e(C0591a.a(l0.c.d(keyEvent.getKeyCode()), C0591a.f6569k) ? i4 : -i4, 0.0f);
        }
        AbstractC0837y.r(m0(), null, null, new C0766h0(this, e3, null), 3);
        return true;
    }

    public final void F0(long j3) {
    }
}
