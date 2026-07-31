package B;

import F.Y0;
import F.Z0;
import F.t1;
import I.C0147f;
import I.C0149g;
import I.C0156j0;
import I.C0176u;
import I.C0187z0;
import I.EnumC0175t0;
import I.W0;
import I.X0;
import I0.C0188a;
import I0.C0193f;
import I0.C0194g;
import I0.C0195h;
import a.AbstractC0235a;
import a0.C0241f;
import android.content.ClipDescription;
import b0.C0341j;
import b0.C0346o;
import d0.C0401b;
import d0.InterfaceC0403d;
import e2.InterfaceC0424c;
import j.C0519A;
import j.C0550x;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import l.C0585k;
import l.C0586l;
import m.AbstractC0620e;
import m.InterfaceC0640z;
import m.l0;
import m.n0;
import n.z0;
import n0.C0710h;
import o0.C0743b;
import o0.C0744c;
import p.C0765h;
import p.C0776m0;
import p.C0790u;
import q2.AbstractC0837y;
import q2.C0821h;
import q2.EnumC0836x;
import r.AbstractC0856c;
import r.C0877y;
import r.InterfaceC0849K;
import r0.AbstractC0892N;
import r0.AbstractC0893O;
import t0.AbstractC0993f;
import t2.C1045P;
import u0.AbstractC1101g0;
import u0.C1102h;
import u0.InterfaceC1095d0;
import u0.O0;
import x.C1196i;
import z.C1256t;

/* renamed from: B.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0022x extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f460e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f461f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f462g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0022x(Object obj, int i3, Object obj2) {
        super(1);
        this.f460e = i3;
        this.f461f = obj;
        this.f462g = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x0574  */
    @Override // e2.InterfaceC0424c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj) {
        x.Q q3;
        boolean z3;
        InterfaceC1095d0 interfaceC1095d0;
        String concat;
        R1.y yVar;
        R1.y yVar2;
        int i3 = 3;
        int i4 = 4;
        int i5 = 2;
        int i6 = 1;
        int i7 = 0;
        switch (this.f460e) {
            case 0:
                n0.s sVar = (n0.s) obj;
                long j3 = sVar.f7310c;
                r rVar = (r) this.f462g;
                Y y3 = (Y) this.f461f;
                a0 a0Var = (a0) y3.f334d;
                if (!a0Var.h() || a0Var.j().f3097a.f596a.length() == 0 || (q3 = a0Var.f345d) == null || q3.d() == null) {
                    i6 = 0;
                } else {
                    y3.t(a0Var.j(), j3, false, rVar);
                }
                if (i6 != 0) {
                    sVar.a();
                }
                return R1.y.f4171a;
            case 1:
                o.i iVar = (o.i) obj;
                a0 a0Var2 = (a0) this.f461f;
                boolean b3 = C0.J.b(a0Var2.j().f3098b);
                C0156j0 c0156j0 = a0Var2.f351j;
                boolean z4 = !b3 && ((Boolean) c0156j0.getValue()).booleanValue();
                C1196i c1196i = new C1196i(1);
                o.n nVar = (o.n) this.f462g;
                o.i.b(iVar, c1196i, z4, new e0(nVar, a0Var2, i7));
                o.i.b(iVar, new C1196i(2), !b3, new e0(nVar, a0Var2, i6));
                if (((Boolean) c0156j0.getValue()).booleanValue() && (interfaceC1095d0 = a0Var2.f347f) != null) {
                    ClipDescription primaryClipDescription = ((C1102h) interfaceC1095d0).f9370a.getPrimaryClipDescription();
                    if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                        z3 = true;
                        o.i.b(iVar, new C1196i(3), z3, new e0(nVar, a0Var2, i5));
                        o.i.b(iVar, new C1196i(4), C0.J.c(a0Var2.j().f3098b) != a0Var2.j().f3097a.f596a.length(), new e0(nVar, a0Var2, i3));
                        return R1.y.f4171a;
                    }
                }
                z3 = false;
                o.i.b(iVar, new C1196i(3), z3, new e0(nVar, a0Var2, i5));
                o.i.b(iVar, new C1196i(4), C0.J.c(a0Var2.j().f3098b) != a0Var2.j().f3097a.f596a.length(), new e0(nVar, a0Var2, i3));
                return R1.y.f4171a;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                t0.G g3 = (t0.G) obj;
                long j4 = ((C0241f) ((G.o) this.f461f).get()).f4736a;
                float d3 = C0241f.d(j4);
                if (d3 > 0.0f) {
                    float J3 = g3.J(Z0.f1459a);
                    float J4 = g3.J(((InterfaceC0849K) this.f462g).b(g3.getLayoutDirection())) - J3;
                    float f3 = 2;
                    float f4 = (J3 * f3) + d3 + J4;
                    O0.k layoutDirection = g3.getLayoutDirection();
                    int[] iArr = Y0.f1456a;
                    int i8 = iArr[layoutDirection.ordinal()];
                    C0401b c0401b = g3.f8573d;
                    float d4 = i8 == 1 ? C0241f.d(c0401b.d()) - f4 : O2.d.u(J4, 0.0f);
                    if (iArr[g3.getLayoutDirection().ordinal()] == 1) {
                        f4 = C0241f.d(c0401b.d()) - O2.d.u(J4, 0.0f);
                    }
                    float f5 = f4;
                    float b4 = C0241f.b(j4);
                    float f6 = (-b4) / f3;
                    float f7 = b4 / f3;
                    G1.m mVar = c0401b.f5649e;
                    long n3 = mVar.n();
                    mVar.h().f();
                    try {
                        ((G1.m) ((Y) mVar.f2116b).f334d).h().r(d4, f6, f5, f7, 0);
                        g3.b();
                    } finally {
                        A.k.q(mVar, n3);
                    }
                } else {
                    g3.b();
                }
                return R1.y.f4171a;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                ((G.l) this.f461f).f2006a.setValue(new C0877y((r.X) this.f462g, (r.X) obj));
                return R1.y.f4171a;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                b0.M.n((InterfaceC0403d) obj, (b0.K) this.f461f, ((t1) this.f462g).a());
                return R1.y.f4171a;
            case 5:
                Y.c cVar = (Y.c) obj;
                return cVar.b(new A0.l(14, new C0022x(((b0.Q) this.f461f).d(cVar.f4651d.d(), cVar.f4651d.getLayoutDirection(), cVar), i4, (t1) this.f462g)));
            case 6:
                C0149g c0149g = (C0149g) this.f461f;
                Object obj2 = c0149g.f2809e;
                C0147f c0147f = (C0147f) this.f462g;
                synchronized (obj2) {
                    c0149g.f2811g.remove(c0147f);
                    if (c0149g.f2811g.isEmpty()) {
                        c0149g.f2813i.set(0);
                    }
                }
                return R1.y.f4171a;
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                I.S s3 = (I.S) this.f461f;
                Object obj3 = s3.f2753b;
                C0821h c0821h = (C0821h) this.f462g;
                synchronized (obj3) {
                    ((ArrayList) s3.f2754c).remove(c0821h);
                }
                return R1.y.f4171a;
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                Throwable th = (Throwable) obj;
                C0187z0 c0187z0 = (C0187z0) this.f461f;
                Object obj4 = c0187z0.f2985b;
                Throwable th2 = (Throwable) this.f462g;
                synchronized (obj4) {
                    if (th2 == null) {
                        th2 = null;
                    } else if (th != null) {
                        try {
                            if (th instanceof CancellationException) {
                                th = null;
                            }
                            if (th != null) {
                                R1.a.a(th2, th);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    c0187z0.f2987d = th2;
                    C1045P c1045p = c0187z0.f3001r;
                    EnumC0175t0 enumC0175t0 = EnumC0175t0.f2919d;
                    c1045p.getClass();
                    c1045p.l(null, enumC0175t0);
                }
                return R1.y.f4171a;
            case AbstractC0856c.f8037c /* 9 */:
                ((C0176u) this.f461f).x(obj);
                C0519A c0519a = (C0519A) this.f462g;
                if (c0519a != null) {
                    c0519a.a(obj);
                }
                return R1.y.f4171a;
            case AbstractC0856c.f8039e /* 10 */:
                I0.i iVar2 = (I0.i) obj;
                String str = ((I0.i) this.f461f) == iVar2 ? " > " : "   ";
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                ((C1256t) this.f462g).getClass();
                if (iVar2 instanceof C0188a) {
                    StringBuilder sb2 = new StringBuilder("CommitTextCommand(text.length=");
                    C0188a c0188a = (C0188a) iVar2;
                    sb2.append(c0188a.f3034a.f596a.length());
                    sb2.append(", newCursorPosition=");
                    concat = A.k.j(sb2, c0188a.f3035b, ')');
                } else if (iVar2 instanceof I0.x) {
                    StringBuilder sb3 = new StringBuilder("SetComposingTextCommand(text.length=");
                    I0.x xVar = (I0.x) iVar2;
                    sb3.append(xVar.f3093a.f596a.length());
                    sb3.append(", newCursorPosition=");
                    concat = A.k.j(sb3, xVar.f3094b, ')');
                } else if (iVar2 instanceof I0.w) {
                    concat = iVar2.toString();
                } else if (iVar2 instanceof C0194g) {
                    concat = iVar2.toString();
                } else if (iVar2 instanceof C0195h) {
                    concat = iVar2.toString();
                } else if (iVar2 instanceof I0.y) {
                    concat = iVar2.toString();
                } else if (iVar2 instanceof I0.k) {
                    ((I0.k) iVar2).getClass();
                    concat = "FinishComposingTextCommand()";
                } else if (iVar2 instanceof C0193f) {
                    ((C0193f) iVar2).getClass();
                    concat = "DeleteAllCommand()";
                } else {
                    String b5 = f2.v.a(iVar2.getClass()).b();
                    if (b5 == null) {
                        b5 = "{anonymous EditCommand}";
                    }
                    concat = "Unknown EditCommand: ".concat(b5);
                }
                sb.append(concat);
                return sb.toString();
            case 11:
                return ((A2.i) this.f461f).n(((List) this.f462g).get(((Number) obj).intValue()));
            case 12:
                return ((A2.i) this.f461f).n(((List) this.f462g).get(((Number) obj).intValue()));
            case 13:
                return ((A2.i) this.f461f).n(((List) this.f462g).get(((Number) obj).intValue()));
            case 14:
                return ((A2.i) this.f461f).n(((List) this.f462g).get(((Number) obj).intValue()));
            case AbstractC0856c.f8041g /* 15 */:
                R0.A a3 = (R0.A) this.f461f;
                a3.setPositionProvider((R0.D) this.f462g);
                a3.l();
                return new R0.i();
            case 16:
                AbstractC0892N.h((AbstractC0892N) obj, (AbstractC0893O) this.f461f, ((C0346o) this.f462g).f5428q);
                return R1.y.f4171a;
            case 17:
                AbstractC0892N.h((AbstractC0892N) obj, (AbstractC0893O) this.f461f, ((b0.S) this.f462g).f5388G);
                return R1.y.f4171a;
            case 18:
                Throwable th4 = (Throwable) obj;
                ((A0.l) this.f461f).n(th4);
                G1.g gVar = (G1.g) this.f462g;
                ((s2.g) gVar.f2095g).k(th4, false);
                do {
                    Object a4 = s2.n.a(((s2.g) gVar.f2095g).o());
                    yVar = R1.y.f4171a;
                    if (a4 != null) {
                        h1.I.f6077e.h(a4, th4);
                        yVar2 = yVar;
                    } else {
                        yVar2 = null;
                    }
                } while (yVar2 != null);
                return yVar;
            case 19:
                AbstractC0892N abstractC0892N = (AbstractC0892N) obj;
                float g4 = ((l.w) this.f462g).f6545c.g();
                AbstractC0893O abstractC0893O = (AbstractC0893O) this.f461f;
                abstractC0892N.getClass();
                long c2 = l0.c.c(0, 0);
                AbstractC0892N.a(abstractC0892N, abstractC0893O);
                abstractC0893O.f0(O0.h.c(c2, abstractC0893O.f8130h), g4, null);
                return R1.y.f4171a;
            case 20:
                m.g0 g0Var = (m.g0) obj;
                C0586l c0586l = (C0586l) this.f461f;
                Object b6 = g0Var.b();
                C0550x c0550x = c0586l.f6504d;
                W0 w02 = (W0) c0550x.e(b6);
                long j5 = w02 != null ? ((O0.j) w02.getValue()).f3740a : 0L;
                W0 w03 = (W0) c0550x.e(g0Var.c());
                long j6 = w03 != null ? ((O0.j) w03.getValue()).f3740a : 0L;
                l.N n4 = (l.N) ((C0585k) this.f462g).f6499b.getValue();
                if (n4 != null) {
                    InterfaceC0640z interfaceC0640z = (InterfaceC0640z) n4.f6466b.h(new O0.j(j5), new O0.j(j6));
                    if (interfaceC0640z != null) {
                        return interfaceC0640z;
                    }
                }
                return AbstractC0620e.i(0.0f, null, 7);
            case 21:
                AbstractC0837y.r((v2.c) this.f461f, null, EnumC0836x.f7937g, new m.j0((l0) this.f462g, null), 1);
                return new m.k0(0);
            case 22:
                l0 l0Var = (l0) this.f461f;
                S.t tVar = l0Var.f6845j;
                l0 l0Var2 = (l0) this.f462g;
                tVar.add(l0Var2);
                return new n0(l0Var, i7, l0Var2);
            case 23:
                return new n0((l0) this.f461f, i6, (m.f0) this.f462g);
            case 24:
                l0 l0Var3 = (l0) this.f461f;
                S.t tVar2 = l0Var3.f6844i;
                m.i0 i0Var = (m.i0) this.f462g;
                tVar2.add(i0Var);
                return new n0(l0Var3, i5, i0Var);
            case 25:
                t0.G g5 = (t0.G) obj;
                g5.b();
                InterfaceC0403d.z(g5, ((b0.H) this.f461f).f5351a, (b0.T) this.f462g, 0.0f, null, 60);
                return R1.y.f4171a;
            case 26:
                t0.G g6 = (t0.G) obj;
                g6.b();
                InterfaceC0403d.z(g6, (C0341j) this.f461f, (b0.T) this.f462g, 0.0f, null, 60);
                return R1.y.f4171a;
            case 27:
                ((q.k) this.f461f).c((q.i) this.f462g);
                return R1.y.f4171a;
            case 28:
                ((C0710h) this.f461f).f7291a.n((C0765h) this.f462g);
                return R1.y.f4171a;
            default:
                C0744c c0744c = (C0744c) this.f461f;
                n.T.g(c0744c, (n0.s) obj);
                X0 x02 = AbstractC1101g0.f9365q;
                C0776m0 c0776m0 = (C0776m0) this.f462g;
                float d5 = ((O0) AbstractC0993f.i(c0776m0, x02)).d();
                long g7 = AbstractC0235a.g(d5, d5);
                if (O0.o.b(g7) <= 0.0f || O0.o.c(g7) <= 0.0f) {
                    z0.o("maximumVelocity should be a positive value. You specified=" + ((Object) O0.o.f(g7)));
                    throw null;
                }
                float b7 = O0.o.b(g7);
                C0743b c0743b = c0744c.f7434a;
                float b8 = c0743b.b(b7);
                float c3 = O0.o.c(g7);
                C0743b c0743b2 = c0744c.f7435b;
                long g8 = AbstractC0235a.g(b8, c0743b2.b(c3));
                S1.k.r0(r0, null, 0, c0743b.f7429d.length);
                c0743b.f7430e = 0;
                S1.k.r0(r0, null, 0, c0743b2.f7429d.length);
                c0743b2.f7430e = 0;
                c0744c.f7436c = 0L;
                s2.g gVar2 = c0776m0.f7730w;
                if (gVar2 != null) {
                    int i9 = p.M.f7552a;
                    gVar2.p(new C0790u(AbstractC0235a.g(Float.isNaN(O0.o.b(g8)) ? 0.0f : O0.o.b(g8), Float.isNaN(O0.o.c(g8)) ? 0.0f : O0.o.c(g8))));
                }
                return R1.y.f4171a;
        }
    }
}
