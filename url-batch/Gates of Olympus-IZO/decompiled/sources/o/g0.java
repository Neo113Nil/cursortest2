package o;

import D1.C0014b;
import F.C0036e;
import F.C0047j0;
import android.view.KeyEvent;
import f.AbstractC0382a;
import f2.InterfaceC0390e;
import h.AbstractC0416e;
import k2.AbstractC0552y;
import k2.InterfaceC0550w;
import l0.C0571a;
import l0.InterfaceC0573c;
import m.C0612w;
import m0.C0620e;
import n.C0642M;
import q.C0766a;
import q.C0767b;
import q.C0768c;
import t0.AbstractC0898f;
import t0.AbstractC0905m;
import t0.InterfaceC0903k;
import v.C1017f;
import z0.C1076a;

/* loaded from: classes.dex */
public final class g0 extends AbstractC0905m implements t0.c0, Z.l, InterfaceC0573c, t0.n0, t0.l0, InterfaceC0903k {

    /* renamed from: A, reason: collision with root package name */
    public n.e0 f6514A;
    public C0737m B;
    public final C0014b C;
    public final O D;

    /* renamed from: E, reason: collision with root package name */
    public final C0737m f6515E;

    /* renamed from: F, reason: collision with root package name */
    public final o0 f6516F;

    /* renamed from: G, reason: collision with root package name */
    public final X f6517G;

    /* renamed from: H, reason: collision with root package name */
    public final C0735k f6518H;

    /* renamed from: I, reason: collision with root package name */
    public C0724a f6519I;

    /* renamed from: J, reason: collision with root package name */
    public C0036e f6520J;

    /* renamed from: K, reason: collision with root package name */
    public f0 f6521K;

    /* renamed from: s, reason: collision with root package name */
    public J f6522s;

    /* renamed from: t, reason: collision with root package name */
    public Z1.j f6523t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6524u;

    /* renamed from: v, reason: collision with root package name */
    public q.j f6525v;

    /* renamed from: w, reason: collision with root package name */
    public m2.e f6526w;

    /* renamed from: x, reason: collision with root package name */
    public C0767b f6527x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f6528y;

    /* renamed from: z, reason: collision with root package name */
    public n0.v f6529z;

    public g0(n.e0 e0Var, InterfaceC0728d interfaceC0728d, C0737m c0737m, J j3, h0 h0Var, q.j jVar, boolean z3, boolean z4) {
        C0729e c0729e = C0729e.f6502g;
        this.f6522s = j3;
        this.f6523t = c0729e;
        this.f6524u = z3;
        this.f6525v = jVar;
        this.f6514A = e0Var;
        this.B = c0737m;
        C0014b c0014b = new C0014b(9);
        this.C = c0014b;
        O o3 = new O();
        o3.f6459q = z3;
        v0(o3);
        this.D = o3;
        C0737m c0737m2 = new C0737m(new C0612w(new A2.g(androidx.compose.foundation.gestures.a.f3625c)));
        this.f6515E = c0737m2;
        n.e0 e0Var2 = this.f6514A;
        C0737m c0737m3 = this.B;
        o0 o0Var = new o0(h0Var, e0Var2, c0737m3 == null ? c0737m2 : c0737m3, j3, z4, c0014b);
        this.f6516F = o0Var;
        X x3 = new X(o0Var, z3);
        this.f6517G = x3;
        C0735k c0735k = new C0735k(j3, o0Var, z4, interfaceC0728d);
        v0(c0735k);
        this.f6518H = c0735k;
        v0(new C0620e(x3, c0014b));
        v0(new Z.q());
        C1017f c1017f = new C1017f();
        c1017f.f8570q = c0735k;
        v0(c1017f);
        C0047j0 c0047j0 = new C0047j0(24, this);
        C0642M c0642m = new C0642M();
        c0642m.f6019q = c0047j0;
        v0(c0642m);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object A0(g0 g0Var, C0743t c0743t, R1.c cVar) {
        C0723C c0723c;
        int i3;
        g0Var.getClass();
        if (cVar instanceof C0723C) {
            c0723c = (C0723C) cVar;
            int i4 = c0723c.f6423h;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0723c.f6423h = i4 - Integer.MIN_VALUE;
                Object obj = c0723c.f6421f;
                Q1.a aVar = Q1.a.f3113d;
                i3 = c0723c.f6423h;
                if (i3 != 0) {
                    I2.l.Q(obj);
                    C0767b c0767b = g0Var.f6527x;
                    if (c0767b != null) {
                        q.j jVar = g0Var.f6525v;
                        if (jVar != null) {
                            C0768c c0768c = new C0768c(c0767b);
                            c0723c.f6419d = g0Var;
                            c0723c.f6420e = c0743t;
                            c0723c.f6423h = 1;
                            if (jVar.b(c0768c, c0723c) == aVar) {
                                return aVar;
                            }
                        }
                    }
                    g0Var.D0(c0743t.f6618a);
                    return L1.z.f2729a;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0743t = c0723c.f6420e;
                g0Var = c0723c.f6419d;
                I2.l.Q(obj);
                g0Var.f6527x = null;
                g0Var.D0(c0743t.f6618a);
                return L1.z.f2729a;
            }
        }
        c0723c = new C0723C(g0Var, cVar);
        Object obj2 = c0723c.f6421f;
        Q1.a aVar2 = Q1.a.f3113d;
        i3 = c0723c.f6423h;
        if (i3 != 0) {
        }
        g0Var.f6527x = null;
        g0Var.D0(c0743t.f6618a);
        return L1.z.f2729a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object y0(g0 g0Var, R1.c cVar) {
        C0721A c0721a;
        int i3;
        g0Var.getClass();
        if (cVar instanceof C0721A) {
            c0721a = (C0721A) cVar;
            int i4 = c0721a.f6406g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0721a.f6406g = i4 - Integer.MIN_VALUE;
                Object obj = c0721a.f6404e;
                Q1.a aVar = Q1.a.f3113d;
                i3 = c0721a.f6406g;
                if (i3 != 0) {
                    I2.l.Q(obj);
                    C0767b c0767b = g0Var.f6527x;
                    if (c0767b != null) {
                        q.j jVar = g0Var.f6525v;
                        if (jVar != null) {
                            C0766a c0766a = new C0766a(c0767b);
                            c0721a.f6403d = g0Var;
                            c0721a.f6406g = 1;
                            if (jVar.b(c0766a, c0721a) == aVar) {
                                return aVar;
                            }
                        }
                    }
                    g0Var.D0(0L);
                    return L1.z.f2729a;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g0Var = c0721a.f6403d;
                I2.l.Q(obj);
                g0Var.f6527x = null;
                g0Var.D0(0L);
                return L1.z.f2729a;
            }
        }
        c0721a = new C0721A(g0Var, cVar);
        Object obj2 = c0721a.f6404e;
        Q1.a aVar2 = Q1.a.f3113d;
        i3 = c0721a.f6406g;
        if (i3 != 0) {
        }
        g0Var.f6527x = null;
        g0Var.D0(0L);
        return L1.z.f2729a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object z0(g0 g0Var, C0742s c0742s, R1.c cVar) {
        C0722B c0722b;
        int i3;
        q.j jVar;
        C0767b c0767b;
        q.j jVar2;
        g0 g0Var2;
        C0767b c0767b2;
        g0Var.getClass();
        if (cVar instanceof C0722B) {
            c0722b = (C0722B) cVar;
            int i4 = c0722b.f6418i;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0722b.f6418i = i4 - Integer.MIN_VALUE;
                Object obj = c0722b.f6416g;
                Q1.a aVar = Q1.a.f3113d;
                i3 = c0722b.f6418i;
                if (i3 != 0) {
                    I2.l.Q(obj);
                    C0767b c0767b3 = g0Var.f6527x;
                    if (c0767b3 != null && (jVar = g0Var.f6525v) != null) {
                        C0766a c0766a = new C0766a(c0767b3);
                        c0722b.f6413d = g0Var;
                        c0722b.f6414e = c0742s;
                        c0722b.f6418i = 1;
                        if (jVar.b(c0766a, c0722b) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0767b2 = c0722b.f6415f;
                        c0742s = c0722b.f6414e;
                        g0Var2 = c0722b.f6413d;
                        I2.l.Q(obj);
                        c0767b = c0767b2;
                        g0Var = g0Var2;
                        g0Var.f6527x = c0767b;
                        long j3 = c0742s.f6616a;
                        g0Var.getClass();
                        return L1.z.f2729a;
                    }
                    c0742s = c0722b.f6414e;
                    g0Var = c0722b.f6413d;
                    I2.l.Q(obj);
                }
                c0767b = new C0767b();
                jVar2 = g0Var.f6525v;
                if (jVar2 != null) {
                    c0722b.f6413d = g0Var;
                    c0722b.f6414e = c0742s;
                    c0722b.f6415f = c0767b;
                    c0722b.f6418i = 2;
                    if (jVar2.b(c0767b, c0722b) == aVar) {
                        return aVar;
                    }
                    g0Var2 = g0Var;
                    c0767b2 = c0767b;
                    c0767b = c0767b2;
                    g0Var = g0Var2;
                }
                g0Var.f6527x = c0767b;
                long j32 = c0742s.f6616a;
                g0Var.getClass();
                return L1.z.f2729a;
            }
        }
        c0722b = new C0722B(g0Var, cVar);
        Object obj2 = c0722b.f6416g;
        Q1.a aVar2 = Q1.a.f3113d;
        i3 = c0722b.f6418i;
        if (i3 != 0) {
        }
        c0767b = new C0767b();
        jVar2 = g0Var.f6525v;
        if (jVar2 != null) {
        }
        g0Var.f6527x = c0767b;
        long j322 = c0742s.f6616a;
        g0Var.getClass();
        return L1.z.f2729a;
    }

    public final void B0() {
        C0767b c0767b = this.f6527x;
        if (c0767b != null) {
            q.j jVar = this.f6525v;
            if (jVar != null) {
                jVar.c(new C0766a(c0767b));
            }
            this.f6527x = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Y1.a, Z1.j] */
    public final void D0(long j3) {
        InterfaceC0550w interfaceC0550w = (InterfaceC0550w) ((Z1.j) this.C.f537c).b();
        if (interfaceC0550w == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        AbstractC0552y.q(interfaceC0550w, null, null, new Z(this, j3, null), 3);
    }

    @Override // t0.l0
    public final void K() {
        n0.v vVar = this.f6529z;
        if (vVar != null) {
            vVar.K();
        }
    }

    @Override // t0.c0
    public final void d0() {
        AbstractC0898f.q(this, new C0748y(this, 2));
    }

    @Override // Z.l
    public final void e0(Z.i iVar) {
        iVar.b(false);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [Y1.c, Z1.j] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    @Override // t0.l0
    public final void f0(n0.g gVar, n0.h hVar, long j3) {
        long j4;
        ?? r12 = gVar.f6214a;
        int size = r12.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            if (((Boolean) this.f6523t.j((n0.m) r12.get(i3))).booleanValue()) {
                if (this.f6524u && this.f6529z == null) {
                    C0749z c0749z = new C0749z(this, null);
                    n0.g gVar2 = n0.r.f6252a;
                    n0.v vVar = new n0.v(null, null, null, c0749z);
                    v0(vVar);
                    this.f6529z = vVar;
                }
                n0.v vVar2 = this.f6529z;
                if (vVar2 != null) {
                    vVar2.f0(gVar, hVar, j3);
                }
            } else {
                i3++;
            }
        }
        if (hVar == n0.h.f6217e && n0.s.c(gVar.f6215b, 6)) {
            ?? r9 = gVar.f6214a;
            int size2 = r9.size();
            for (int i4 = 0; i4 < size2; i4++) {
                if (((n0.m) r9.get(i4)).b()) {
                    return;
                }
            }
            Z1.i.c(this.f6519I);
            M0.b bVar = AbstractC0898f.t(this).f7730s;
            a0.c cVar = new a0.c(0L);
            int size3 = r9.size();
            int i5 = 0;
            while (true) {
                j4 = cVar.f3489a;
                if (i5 >= size3) {
                    break;
                }
                cVar = new a0.c(a0.c.h(j4, ((n0.m) r9.get(i5)).f6232j));
                i5++;
            }
            AbstractC0552y.q(j0(), null, null, new d0(this, a0.c.i(j4, -bVar.F(64)), null), 3);
            int size4 = r9.size();
            for (int i6 = 0; i6 < size4; i6++) {
                ((n0.m) r9.get(i6)).a();
            }
        }
    }

    @Override // t0.n0
    public final void h(z0.i iVar) {
        if (this.f6524u && (this.f6520J == null || this.f6521K == null)) {
            this.f6520J = new C0036e(9, this);
            this.f6521K = new f0(this, null);
        }
        C0036e c0036e = this.f6520J;
        if (c0036e != null) {
            InterfaceC0390e[] interfaceC0390eArr = z0.s.f9036a;
            iVar.d(z0.h.f8960d, new C1076a(null, c0036e));
        }
        f0 f0Var = this.f6521K;
        if (f0Var != null) {
            InterfaceC0390e[] interfaceC0390eArr2 = z0.s.f9036a;
            iVar.d(z0.h.f8961e, f0Var);
        }
    }

    @Override // U.k
    public final boolean k0() {
        return false;
    }

    @Override // l0.InterfaceC0573c
    public final boolean n(KeyEvent keyEvent) {
        return false;
    }

    @Override // U.k
    public final void n0() {
        AbstractC0898f.q(this, new C0748y(this, 2));
        this.f6519I = C0724a.f6486a;
    }

    @Override // U.k
    public final void o0() {
        this.f6528y = false;
        B0();
    }

    @Override // l0.InterfaceC0573c
    public final boolean r(KeyEvent keyEvent) {
        long f3;
        if (!this.f6524u) {
            return false;
        }
        if ((!C0571a.a(AbstractC0416e.d(keyEvent.getKeyCode()), C0571a.f5537l) && !C0571a.a(AbstractC0416e.d(keyEvent.getKeyCode()), C0571a.f5536k)) || !AbstractC0382a.i(g2.i.R(keyEvent), 2) || keyEvent.isCtrlPressed()) {
            return false;
        }
        boolean z3 = this.f6516F.f6595d == J.f6443d;
        C0735k c0735k = this.f6518H;
        if (z3) {
            int i3 = (int) (c0735k.f6557y & 4294967295L);
            f3 = I2.l.f(0.0f, C0571a.a(AbstractC0416e.d(keyEvent.getKeyCode()), C0571a.f5536k) ? i3 : -i3);
        } else {
            int i4 = (int) (c0735k.f6557y >> 32);
            f3 = I2.l.f(C0571a.a(AbstractC0416e.d(keyEvent.getKeyCode()), C0571a.f5536k) ? i4 : -i4, 0.0f);
        }
        AbstractC0552y.q(j0(), null, null, new b0(this, f3, null), 3);
        return true;
    }

    public final void C0(long j3) {
    }
}
