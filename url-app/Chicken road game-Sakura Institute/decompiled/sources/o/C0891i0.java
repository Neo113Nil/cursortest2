package o;

import A0.C0030a;
import B1.C0097d;
import W2.InterfaceC0302y;
import a.AbstractC0345a;
import android.view.KeyEvent;
import f1.C0607a;
import j0.C0706a;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l.C0796w;
import l0.AbstractC0819q;
import l0.C0802C;
import l0.C0811i;
import l0.EnumC0812j;
import p.C0925a;
import p.C0926b;
import p.C0927c;
import p.C0935k;
import r0.AbstractC1065f;
import r0.AbstractC1073n;
import r0.InterfaceC1071l;
import y0.C1317a;
import y2.AbstractC1343r;

/* renamed from: o.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0891i0 extends AbstractC1073n implements r0.c0, X.n, j0.d, r0.n0, r0.l0, InterfaceC1071l {

    /* renamed from: A, reason: collision with root package name */
    public C0926b f8784A;
    public boolean B;

    /* renamed from: C, reason: collision with root package name */
    public C0802C f8785C;

    /* renamed from: D, reason: collision with root package name */
    public m.i0 f8786D;

    /* renamed from: E, reason: collision with root package name */
    public C0898m f8787E;

    /* renamed from: F, reason: collision with root package name */
    public final C0097d f8788F;

    /* renamed from: G, reason: collision with root package name */
    public final T f8789G;

    /* renamed from: H, reason: collision with root package name */
    public final C0898m f8790H;

    /* renamed from: I, reason: collision with root package name */
    public final C0908r0 f8791I;

    /* renamed from: J, reason: collision with root package name */
    public final H1.z f8792J;

    /* renamed from: K, reason: collision with root package name */
    public final C0894k f8793K;

    /* renamed from: L, reason: collision with root package name */
    public C0874a f8794L;

    /* renamed from: M, reason: collision with root package name */
    public C0030a f8795M;

    /* renamed from: N, reason: collision with root package name */
    public C0889h0 f8796N;

    /* renamed from: v, reason: collision with root package name */
    public N f8797v;

    /* renamed from: w, reason: collision with root package name */
    public C0882e f8798w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8799x;

    /* renamed from: y, reason: collision with root package name */
    public C0935k f8800y;

    /* renamed from: z, reason: collision with root package name */
    public Y2.e f8801z;

    public C0891i0(m.i0 i0Var, InterfaceC0880d interfaceC0880d, C0898m c0898m, N n2, InterfaceC0893j0 interfaceC0893j0, C0935k c0935k, boolean z4, boolean z5) {
        C0882e c0882e = C0882e.f8759i;
        this.f8797v = n2;
        this.f8798w = c0882e;
        this.f8799x = z4;
        this.f8800y = c0935k;
        this.f8786D = i0Var;
        this.f8787E = c0898m;
        C0097d c0097d = new C0097d(13);
        this.f8788F = c0097d;
        T t4 = new T();
        t4.f8714t = z4;
        B0(t4);
        this.f8789G = t4;
        C0898m c0898m2 = new C0898m(new C0796w(new C0607a(androidx.compose.foundation.gestures.a.f5056c)));
        this.f8790H = c0898m2;
        m.i0 i0Var2 = this.f8786D;
        C0898m c0898m3 = this.f8787E;
        C0908r0 c0908r0 = new C0908r0(interfaceC0893j0, i0Var2, c0898m3 == null ? c0898m2 : c0898m3, n2, z5, c0097d);
        this.f8791I = c0908r0;
        H1.z zVar = new H1.z(c0908r0, z4);
        this.f8792J = zVar;
        C0894k c0894k = new C0894k(n2, c0908r0, z5, interfaceC0880d);
        B0(c0894k);
        this.f8793K = c0894k;
        B0(new k0.e(zVar, c0097d));
        B0(new X.t());
        t.i iVar = new t.i();
        iVar.f10634t = c0894k;
        B0(iVar);
        A.g0 g0Var = new A.g0(22, this);
        m.M m4 = new m.M();
        m4.f8034t = g0Var;
        B0(m4);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object E0(C0891i0 c0891i0, E2.c cVar) {
        G g4;
        int i2;
        c0891i0.getClass();
        if (cVar instanceof G) {
            g4 = (G) cVar;
            int i4 = g4.f8625m;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                g4.f8625m = i4 - Integer.MIN_VALUE;
                Object obj = g4.f8623k;
                D2.a aVar = D2.a.f2163d;
                i2 = g4.f8625m;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    C0926b c0926b = c0891i0.f8784A;
                    if (c0926b != null) {
                        C0935k c0935k = c0891i0.f8800y;
                        if (c0935k != null) {
                            C0925a c0925a = new C0925a(c0926b);
                            g4.f8622j = c0891i0;
                            g4.f8625m = 1;
                            if (c0935k.b(c0925a, g4) == aVar) {
                                return aVar;
                            }
                        }
                    }
                    c0891i0.I0(0L);
                    return Unit.f7487a;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0891i0 = g4.f8622j;
                AbstractC1343r.b(obj);
                c0891i0.f8784A = null;
                c0891i0.I0(0L);
                return Unit.f7487a;
            }
        }
        g4 = new G(c0891i0, cVar);
        Object obj2 = g4.f8623k;
        D2.a aVar2 = D2.a.f2163d;
        i2 = g4.f8625m;
        if (i2 != 0) {
        }
        c0891i0.f8784A = null;
        c0891i0.I0(0L);
        return Unit.f7487a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object F0(C0891i0 c0891i0, C0911t c0911t, E2.c cVar) {
        H h4;
        int i2;
        C0935k c0935k;
        C0926b c0926b;
        C0935k c0935k2;
        C0891i0 c0891i02;
        C0926b c0926b2;
        c0891i0.getClass();
        if (cVar instanceof H) {
            h4 = (H) cVar;
            int i4 = h4.f8632o;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                h4.f8632o = i4 - Integer.MIN_VALUE;
                Object obj = h4.f8630m;
                D2.a aVar = D2.a.f2163d;
                i2 = h4.f8632o;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    C0926b c0926b3 = c0891i0.f8784A;
                    if (c0926b3 != null && (c0935k = c0891i0.f8800y) != null) {
                        C0925a c0925a = new C0925a(c0926b3);
                        h4.f8627j = c0891i0;
                        h4.f8628k = c0911t;
                        h4.f8632o = 1;
                        if (c0935k.b(c0925a, h4) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0926b2 = h4.f8629l;
                        c0911t = h4.f8628k;
                        c0891i02 = h4.f8627j;
                        AbstractC1343r.b(obj);
                        c0926b = c0926b2;
                        c0891i0 = c0891i02;
                        c0891i0.f8784A = c0926b;
                        long j4 = c0911t.f8876a;
                        return Unit.f7487a;
                    }
                    c0911t = h4.f8628k;
                    c0891i0 = h4.f8627j;
                    AbstractC1343r.b(obj);
                }
                c0926b = new C0926b();
                c0935k2 = c0891i0.f8800y;
                if (c0935k2 != null) {
                    h4.f8627j = c0891i0;
                    h4.f8628k = c0911t;
                    h4.f8629l = c0926b;
                    h4.f8632o = 2;
                    if (c0935k2.b(c0926b, h4) == aVar) {
                        return aVar;
                    }
                    c0891i02 = c0891i0;
                    c0926b2 = c0926b;
                    c0926b = c0926b2;
                    c0891i0 = c0891i02;
                }
                c0891i0.f8784A = c0926b;
                long j42 = c0911t.f8876a;
                return Unit.f7487a;
            }
        }
        h4 = new H(c0891i0, cVar);
        Object obj2 = h4.f8630m;
        D2.a aVar2 = D2.a.f2163d;
        i2 = h4.f8632o;
        if (i2 != 0) {
        }
        c0926b = new C0926b();
        c0935k2 = c0891i0.f8800y;
        if (c0935k2 != null) {
        }
        c0891i0.f8784A = c0926b;
        long j422 = c0911t.f8876a;
        return Unit.f7487a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object G0(C0891i0 c0891i0, C0913u c0913u, E2.c cVar) {
        I i2;
        int i4;
        c0891i0.getClass();
        if (cVar instanceof I) {
            i2 = (I) cVar;
            int i5 = i2.f8638n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                i2.f8638n = i5 - Integer.MIN_VALUE;
                Object obj = i2.f8636l;
                D2.a aVar = D2.a.f2163d;
                i4 = i2.f8638n;
                if (i4 != 0) {
                    AbstractC1343r.b(obj);
                    C0926b c0926b = c0891i0.f8784A;
                    if (c0926b != null) {
                        C0935k c0935k = c0891i0.f8800y;
                        if (c0935k != null) {
                            C0927c c0927c = new C0927c(c0926b);
                            i2.f8634j = c0891i0;
                            i2.f8635k = c0913u;
                            i2.f8638n = 1;
                            if (c0935k.b(c0927c, i2) == aVar) {
                                return aVar;
                            }
                        }
                    }
                    c0891i0.I0(c0913u.f8882a);
                    return Unit.f7487a;
                }
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0913u = i2.f8635k;
                c0891i0 = i2.f8634j;
                AbstractC1343r.b(obj);
                c0891i0.f8784A = null;
                c0891i0.I0(c0913u.f8882a);
                return Unit.f7487a;
            }
        }
        i2 = new I(c0891i0, cVar);
        Object obj2 = i2.f8636l;
        D2.a aVar2 = D2.a.f2163d;
        i4 = i2.f8638n;
        if (i4 != 0) {
        }
        c0891i0.f8784A = null;
        c0891i0.I0(c0913u.f8882a);
        return Unit.f7487a;
    }

    public final void H0() {
        C0926b c0926b = this.f8784A;
        if (c0926b != null) {
            C0935k c0935k = this.f8800y;
            if (c0935k != null) {
                c0935k.c(new C0925a(c0926b));
            }
            this.f8784A = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [M2.p, kotlin.jvm.functions.Function0] */
    public final void I0(long j4) {
        InterfaceC0302y interfaceC0302y = (InterfaceC0302y) ((M2.p) this.f8788F.f988i).invoke();
        if (interfaceC0302y == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        W2.B.m(interfaceC0302y, null, null, new C0877b0(this, j4, null), 3);
    }

    @Override // r0.l0
    public final void S() {
        C0802C c0802c = this.f8785C;
        if (c0802c != null) {
            c0802c.S();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.List] */
    @Override // r0.l0
    public final void Z(C0811i c0811i, EnumC0812j enumC0812j, long j4) {
        long j5;
        ?? r02 = c0811i.f7907a;
        int size = r02.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (((Boolean) this.f8798w.invoke((l0.s) r02.get(i2))).booleanValue()) {
                if (this.f8799x && this.f8785C == null) {
                    C0873F c0873f = new C0873F(this, null);
                    C0811i c0811i2 = l0.w.f7951a;
                    C0802C c0802c = new C0802C(null, null, null, c0873f);
                    B0(c0802c);
                    this.f8785C = c0802c;
                }
                C0802C c0802c2 = this.f8785C;
                if (c0802c2 != null) {
                    c0802c2.Z(c0811i, enumC0812j, j4);
                }
            } else {
                i2++;
            }
        }
        if (enumC0812j == EnumC0812j.f7911e && AbstractC0819q.d(c0811i.f7909c, 6)) {
            ?? r10 = c0811i.f7907a;
            int size2 = r10.size();
            for (int i4 = 0; i4 < size2; i4++) {
                if (((l0.s) r10.get(i4)).b()) {
                    return;
                }
            }
            Intrinsics.c(this.f8794L);
            M0.b bVar = AbstractC1065f.v(this).f9610w;
            Y.c cVar = new Y.c(0L);
            int size3 = r10.size();
            int i5 = 0;
            while (true) {
                j5 = cVar.f4372a;
                if (i5 >= size3) {
                    break;
                }
                cVar = new Y.c(Y.c.h(j5, ((l0.s) r10.get(i5)).f7932j));
                i5++;
            }
            W2.B.m(p0(), null, null, new C0885f0(this, Y.c.i(-bVar.L(64), j5), null), 3);
            int size4 = r10.size();
            for (int i6 = 0; i6 < size4; i6++) {
                ((l0.s) r10.get(i6)).a();
            }
        }
    }

    @Override // r0.c0
    public final void l0() {
        AbstractC1065f.s(this, new C0872E(this, 2));
    }

    @Override // j0.d
    public final boolean n(KeyEvent keyEvent) {
        return false;
    }

    @Override // X.n
    public final void n0(X.k kVar) {
        kVar.b(false);
    }

    @Override // r0.n0
    public final void p(y0.i iVar) {
        if (this.f8799x && (this.f8795M == null || this.f8796N == null)) {
            this.f8795M = new C0030a(8, this);
            this.f8796N = new C0889h0(this, null);
        }
        C0030a c0030a = this.f8795M;
        if (c0030a != null) {
            S2.e[] eVarArr = y0.s.f11639a;
            iVar.s(y0.h.f11553d, new C1317a(null, c0030a));
        }
        C0889h0 c0889h0 = this.f8796N;
        if (c0889h0 != null) {
            S2.e[] eVarArr2 = y0.s.f11639a;
            iVar.s(y0.h.f11554e, c0889h0);
        }
    }

    @Override // S.n
    public final boolean q0() {
        return false;
    }

    @Override // j0.d
    public final boolean r(KeyEvent keyEvent) {
        long c4;
        if (!this.f8799x) {
            return false;
        }
        if ((!C0706a.a(j0.c.A(keyEvent), C0706a.f7132l) && !C0706a.a(u3.d.d(keyEvent.getKeyCode()), C0706a.f7131k)) || !j0.c.w(j0.c.C(keyEvent), 2) || keyEvent.isCtrlPressed()) {
            return false;
        }
        boolean z4 = this.f8791I.f8868d == N.f8665d;
        C0894k c0894k = this.f8793K;
        if (z4) {
            int i2 = (int) (c0894k.B & 4294967295L);
            c4 = AbstractC0345a.c(0.0f, C0706a.a(u3.d.d(keyEvent.getKeyCode()), C0706a.f7131k) ? i2 : -i2);
        } else {
            int i4 = (int) (c0894k.B >> 32);
            c4 = AbstractC0345a.c(C0706a.a(u3.d.d(keyEvent.getKeyCode()), C0706a.f7131k) ? i4 : -i4, 0.0f);
        }
        W2.B.m(p0(), null, null, new C0881d0(this, c4, null), 3);
        return true;
    }

    @Override // S.n
    public final void t0() {
        AbstractC1065f.s(this, new C0872E(this, 2));
        this.f8794L = C0874a.f8741a;
    }

    @Override // S.n
    public final void u0() {
        this.B = false;
        H0();
    }
}
