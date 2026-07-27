package A;

import B1.C0097d;
import D.L1;
import D.R0;
import D.S0;
import G.C0196f;
import G.C0198g;
import G.C0205j0;
import G.C0225u;
import G.C0236z0;
import G.EnumC0224t0;
import G.X0;
import G.Y0;
import G0.C0237a;
import G0.C0242f;
import G0.C0243g;
import W2.C0286h;
import W2.EnumC0303z;
import Z.C0313j;
import Z.C0318o;
import android.content.ClipDescription;
import android.graphics.Typeface;
import b0.C0494b;
import b0.InterfaceC0496d;
import com.appsflyer.attribution.RequestError;
import i.C0661B;
import java.util.concurrent.CancellationException;
import k.C0745k;
import k.C0746l;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l.AbstractC0779e;
import l.InterfaceC0799z;
import l.o0;
import l0.C0810h;
import m0.C0854b;
import m0.C0855c;
import n.AbstractC0864b;
import o.C0888h;
import o.C0891i0;
import o.C0903o0;
import o.C0908r0;
import o.C0909s;
import o.C0913u;
import o.U0;
import p.C0935k;
import p.InterfaceC0933i;
import p0.AbstractC0953N;
import p0.AbstractC0954O;
import q.AbstractC1024c;
import q.C1046y;
import q.InterfaceC1021Z;
import q.m0;
import r0.AbstractC1065f;
import s0.AbstractC1144g0;
import s0.C1145h;
import s0.InterfaceC1138d0;
import s0.P0;
import w.C1269i;
import w2.C1294c;
import y2.C1331f;
import z2.C1436t;

/* renamed from: A.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0028y extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f205e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f206i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0028y(Object obj, int i2, Object obj2) {
        super(1);
        this.f204d = i2;
        this.f205e = obj;
        this.f206i = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x046c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0617  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        w.P p4;
        boolean z4;
        InterfaceC1138d0 interfaceC1138d0;
        F0.t tVar;
        Typeface c4;
        String concat;
        Unit unit;
        switch (this.f204d) {
            case 0:
                l0.s sVar = (l0.s) obj;
                long j4 = sVar.f7925c;
                C0022s c0022s = (C0022s) this.f206i;
                C1294c c1294c = (C1294c) this.f205e;
                a0 a0Var = (a0) c1294c.f11388d;
                boolean z5 = false;
                if (a0Var.h() && a0Var.j().f3093a.f328a.length() != 0 && (p4 = a0Var.f87d) != null && p4.d() != null) {
                    c1294c.s(a0Var.j(), j4, false, c0022s);
                    z5 = true;
                }
                if (z5) {
                    sVar.a();
                }
                return Unit.f7487a;
            case 1:
                n.j jVar = (n.j) obj;
                a0 a0Var2 = (a0) this.f205e;
                boolean b4 = A0.K.b(a0Var2.j().f3094b);
                C0205j0 c0205j0 = a0Var2.f93j;
                boolean z6 = !b4 && ((Boolean) c0205j0.getValue()).booleanValue();
                C1269i c1269i = new C1269i(1);
                n.o oVar = (n.o) this.f206i;
                n.j.b(jVar, c1269i, z6, new e0(oVar, a0Var2, 0));
                n.j.b(jVar, new C1269i(2), !b4, new e0(oVar, a0Var2, 1));
                if (((Boolean) c0205j0.getValue()).booleanValue() && (interfaceC1138d0 = a0Var2.f89f) != null) {
                    ClipDescription primaryClipDescription = ((C1145h) interfaceC1138d0).f10234a.getPrimaryClipDescription();
                    if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                        z4 = true;
                        n.j.b(jVar, new C1269i(3), z4, new e0(oVar, a0Var2, 2));
                        n.j.b(jVar, new C1269i(4), A0.K.c(a0Var2.j().f3094b) != a0Var2.j().f3093a.f328a.length(), new e0(oVar, a0Var2, 3));
                        return Unit.f7487a;
                    }
                }
                z4 = false;
                n.j.b(jVar, new C1269i(3), z4, new e0(oVar, a0Var2, 2));
                n.j.b(jVar, new C1269i(4), A0.K.c(a0Var2.j().f3094b) != a0Var2.j().f3093a.f328a.length(), new e0(oVar, a0Var2, 3));
                return Unit.f7487a;
            case 2:
                r0.G g4 = (r0.G) obj;
                long j5 = ((Y.f) ((E.j) this.f205e).get()).f4386a;
                float d4 = Y.f.d(j5);
                if (d4 > 0.0f) {
                    float L3 = g4.L(S0.f1617a);
                    float L4 = g4.L(((InterfaceC1021Z) this.f206i).b(g4.getLayoutDirection())) - L3;
                    float f4 = 2;
                    float f5 = (L3 * f4) + d4 + L4;
                    M0.k layoutDirection = g4.getLayoutDirection();
                    int[] iArr = R0.f1613a;
                    int i2 = iArr[layoutDirection.ordinal()];
                    C0494b c0494b = g4.f9624d;
                    float d5 = i2 == 1 ? Y.f.d(c0494b.h()) - f5 : kotlin.ranges.b.a(L4, 0.0f);
                    if (iArr[g4.getLayoutDirection().ordinal()] == 1) {
                        f5 = Y.f.d(c0494b.h()) - kotlin.ranges.b.a(L4, 0.0f);
                    }
                    float f6 = f5;
                    float b5 = Y.f.b(j5);
                    float f7 = (-b5) / f4;
                    float f8 = b5 / f4;
                    C0097d c0097d = c0494b.f5603e;
                    long s4 = c0097d.s();
                    c0097d.k().g();
                    try {
                        ((C0097d) ((C1294c) c0097d.f987e).f11388d).k().p(d5, f7, f6, f8, 0);
                        g4.a();
                    } finally {
                        c0097d.k().b();
                        c0097d.G(s4);
                    }
                } else {
                    g4.a();
                }
                return Unit.f7487a;
            case 3:
                ((E.g) this.f205e).f2190a.setValue(new C1046y((m0) this.f206i, (m0) obj));
                return Unit.f7487a;
            case 4:
                Z.K.m((InterfaceC0496d) obj, (Z.I) this.f205e, ((L1) this.f206i).a());
                return Unit.f7487a;
            case 5:
                W.c cVar = (W.c) obj;
                return cVar.a(new g0(8, new C0028y(((Z.P) this.f205e).a(cVar.f4193d.h(), cVar.f4193d.getLayoutDirection(), cVar), 4, (L1) this.f206i)));
            case 6:
                F0.e eVar = (F0.e) this.f205e;
                eVar.f2607d.getClass();
                F0.s sVar2 = (F0.s) this.f206i;
                C1294c c1294c2 = eVar.f2608e;
                c1294c2.getClass();
                F0.r rVar = sVar2.f2627a;
                boolean z7 = rVar == null ? true : rVar instanceof F0.b;
                F0.q qVar = (F0.q) c1294c2.f11388d;
                int i4 = sVar2.f2629c;
                F0.k kVar = sVar2.f2628b;
                if (z7) {
                    c4 = qVar.b(kVar, i4);
                } else {
                    if (!(rVar instanceof F0.m)) {
                        tVar = null;
                        if (tVar == null) {
                            return tVar;
                        }
                        throw new IllegalStateException("Could not load font");
                    }
                    c4 = qVar.c((F0.m) rVar, kVar, i4);
                }
                tVar = new F0.t(c4, true);
                if (tVar == null) {
                }
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                F0.t tVar2 = (F0.t) obj;
                y.t tVar3 = (y.t) this.f205e;
                E1.i iVar = (E1.i) tVar3.f11494e;
                F0.s sVar3 = (F0.s) this.f206i;
                synchronized (iVar) {
                    try {
                        if (tVar2.f2633e) {
                            ((E0.b) tVar3.f11495i).b(sVar3, tVar2);
                        } else {
                            ((E0.b) tVar3.f11495i).c(sVar3);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Unit.f7487a;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                C0198g c0198g = (C0198g) this.f205e;
                Object obj2 = c0198g.f2806e;
                C0196f c0196f = (C0196f) this.f206i;
                synchronized (obj2) {
                    c0198g.f2808j.remove(c0196f);
                    if (c0198g.f2808j.isEmpty()) {
                        c0198g.f2810l.set(0);
                    }
                }
                return Unit.f7487a;
            case AbstractC1024c.f9242c /* 9 */:
                G.S s5 = (G.S) this.f205e;
                Object obj3 = s5.f2749a;
                C0286h c0286h = (C0286h) this.f206i;
                synchronized (obj3) {
                    s5.f2750b.remove(c0286h);
                }
                return Unit.f7487a;
            case 10:
                Throwable th2 = (Throwable) obj;
                C0236z0 c0236z0 = (C0236z0) this.f205e;
                Object obj4 = c0236z0.f2983b;
                Throwable th3 = (Throwable) this.f206i;
                synchronized (obj4) {
                    if (th3 == null) {
                        th3 = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                C1331f.a(th3, th2);
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    c0236z0.f2985d = th3;
                    Z2.S s6 = c0236z0.f2999r;
                    EnumC0224t0 enumC0224t0 = EnumC0224t0.f2916d;
                    s6.getClass();
                    s6.l(null, enumC0224t0);
                }
                return Unit.f7487a;
            case RequestError.STOP_TRACKING /* 11 */:
                ((C0225u) this.f205e).x(obj);
                C0661B c0661b = (C0661B) this.f206i;
                if (c0661b != null) {
                    c0661b.a(obj);
                }
                return Unit.f7487a;
            case 12:
                G0.i iVar2 = (G0.i) obj;
                String str = ((G0.i) this.f205e) == iVar2 ? " > " : "   ";
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                ((y.t) this.f206i).getClass();
                if (iVar2 instanceof C0237a) {
                    StringBuilder sb2 = new StringBuilder("CommitTextCommand(text.length=");
                    C0237a c0237a = (C0237a) iVar2;
                    sb2.append(c0237a.f3030a.f328a.length());
                    sb2.append(", newCursorPosition=");
                    concat = AbstractC0017m.l(sb2, c0237a.f3031b, ')');
                } else if (iVar2 instanceof G0.w) {
                    StringBuilder sb3 = new StringBuilder("SetComposingTextCommand(text.length=");
                    G0.w wVar = (G0.w) iVar2;
                    sb3.append(wVar.f3089a.f328a.length());
                    sb3.append(", newCursorPosition=");
                    concat = AbstractC0017m.l(sb3, wVar.f3090b, ')');
                } else if (iVar2 instanceof G0.v) {
                    concat = iVar2.toString();
                } else if (iVar2 instanceof C0243g) {
                    concat = iVar2.toString();
                } else if (iVar2 instanceof G0.h) {
                    concat = iVar2.toString();
                } else if (iVar2 instanceof G0.x) {
                    concat = iVar2.toString();
                } else if (iVar2 instanceof G0.k) {
                    ((G0.k) iVar2).getClass();
                    concat = "FinishComposingTextCommand()";
                } else if (iVar2 instanceof C0242f) {
                    ((C0242f) iVar2).getClass();
                    concat = "DeleteAllCommand()";
                } else {
                    String b6 = M2.F.a(iVar2.getClass()).b();
                    if (b6 == null) {
                        b6 = "{anonymous EditCommand}";
                    }
                    concat = "Unknown EditCommand: ".concat(b6);
                }
                sb.append(concat);
                return sb.toString();
            case 13:
                P0.B b7 = (P0.B) this.f205e;
                b7.setPositionProvider((P0.E) this.f206i);
                b7.l();
                return new P0.j();
            case 14:
                AbstractC0953N.h((AbstractC0953N) obj, (AbstractC0954O) this.f205e, 0, 0, ((C0318o) this.f206i).f4538t, 4);
                return Unit.f7487a;
            case AbstractC1024c.f9246g /* 15 */:
                AbstractC0953N.h((AbstractC0953N) obj, (AbstractC0954O) this.f205e, 0, 0, ((Z.Q) this.f206i).f4500J, 4);
                return Unit.f7487a;
            case 16:
                Throwable th5 = (Throwable) obj;
                ((g0) this.f205e).invoke(th5);
                Y0.b bVar = (Y0.b) this.f206i;
                ((Y2.e) bVar.f4392k).g(th5, false);
                do {
                    Object m4 = ((Y2.e) bVar.f4392k).m();
                    unit = null;
                    if (m4 instanceof Y2.k) {
                        m4 = null;
                    }
                    if (m4 != null) {
                        f1.J.f6504d.h(m4, th5);
                        unit = Unit.f7487a;
                    }
                } while (unit != null);
                return Unit.f7487a;
            case 17:
                AbstractC0953N abstractC0953N = (AbstractC0953N) obj;
                float d6 = ((k.v) this.f206i).f7336c.d();
                AbstractC0954O abstractC0954O = (AbstractC0954O) this.f205e;
                abstractC0953N.getClass();
                long g5 = j0.c.g(0, 0);
                AbstractC0953N.a(abstractC0953N, abstractC0954O);
                abstractC0954O.n0(M0.h.c(g5, abstractC0954O.f9009k), d6, null);
                return Unit.f7487a;
            case 18:
                l.h0 h0Var = (l.h0) obj;
                C0746l c0746l = (C0746l) this.f205e;
                Object b8 = h0Var.b();
                i.y yVar = c0746l.f7303d;
                X0 x02 = (X0) yVar.e(b8);
                long j6 = x02 != null ? ((M0.j) x02.getValue()).f3554a : 0L;
                X0 x03 = (X0) yVar.e(h0Var.c());
                long j7 = x03 != null ? ((M0.j) x03.getValue()).f3554a : 0L;
                k.M m5 = (k.M) ((C0745k) this.f206i).f7298b.getValue();
                if (m5 != null) {
                    InterfaceC0799z interfaceC0799z = (InterfaceC0799z) m5.f7266b.h(new M0.j(j6), new M0.j(j7));
                    if (interfaceC0799z != null) {
                        return interfaceC0799z;
                    }
                }
                return AbstractC0779e.i(0.0f, null, 7);
            case 19:
                W2.B.m((b3.c) this.f205e, null, EnumC0303z.f4307j, new l.k0((l.m0) this.f206i, null), 1);
                return new l.l0(0);
            case 20:
                l.m0 m0Var = (l.m0) this.f205e;
                Q.v vVar = m0Var.f7809j;
                l.m0 m0Var2 = (l.m0) this.f206i;
                vVar.add(m0Var2);
                return new o0(m0Var, 0, m0Var2);
            case 21:
                return new o0((l.m0) this.f205e, 1, (l.g0) this.f206i);
            case 22:
                l.m0 m0Var3 = (l.m0) this.f205e;
                Q.v vVar2 = m0Var3.f7808i;
                l.j0 j0Var = (l.j0) this.f206i;
                vVar2.add(j0Var);
                return new o0(m0Var3, 2, j0Var);
            case 23:
                r0.G g6 = (r0.G) obj;
                g6.a();
                InterfaceC0496d.U(g6, ((Z.F) this.f205e).f4457a, (Z.S) this.f206i, 0.0f, null, 60);
                return Unit.f7487a;
            case 24:
                r0.G g7 = (r0.G) obj;
                g7.a();
                InterfaceC0496d.U(g7, (C0313j) this.f205e, (Z.S) this.f206i, 0.0f, null, 60);
                return Unit.f7487a;
            case 25:
                ((C0935k) this.f205e).c((InterfaceC0933i) this.f206i);
                return Unit.f7487a;
            case 26:
                ((C0810h) this.f205e).f7906a.m((C0888h) this.f206i);
                return Unit.f7487a;
            case 27:
                C0855c c0855c = (C0855c) this.f205e;
                u3.l.Q(c0855c, (l0.s) obj);
                Y0 y02 = AbstractC1144g0.f10229q;
                C0891i0 c0891i0 = (C0891i0) this.f206i;
                float d7 = ((P0) AbstractC1065f.i(c0891i0, y02)).d();
                long k4 = M1.a.k(d7, d7);
                if (M0.o.b(k4) <= 0.0f || M0.o.c(k4) <= 0.0f) {
                    AbstractC0864b.D("maximumVelocity should be a positive value. You specified=" + ((Object) M0.o.f(k4)));
                    throw null;
                }
                float b9 = M0.o.b(k4);
                C0854b c0854b = c0855c.f8245a;
                float b10 = c0854b.b(b9);
                float c5 = M0.o.c(k4);
                C0854b c0854b2 = c0855c.f8246b;
                long k5 = M1.a.k(b10, c0854b2.b(c5));
                C1436t.k(r0, 0, c0854b.f8240d.length);
                c0854b.f8241e = 0;
                C1436t.k(r4, 0, c0854b2.f8240d.length);
                c0854b2.f8241e = 0;
                c0855c.f8247c = 0L;
                Y2.e eVar2 = c0891i0.f8801z;
                if (eVar2 != null) {
                    eVar2.o(new C0913u(M1.a.k(Float.isNaN(M0.o.b(k5)) ? 0.0f : M0.o.b(k5), Float.isNaN(M0.o.c(k5)) ? 0.0f : M0.o.c(k5))));
                }
                return Unit.f7487a;
            case 28:
                long j8 = ((C0909s) obj).f8875a;
                long a4 = ((C0908r0) this.f206i).f8868d == o.N.f8666e ? Y.c.a(j8, 0.0f, 1) : Y.c.a(j8, 0.0f, 2);
                C0908r0 c0908r0 = ((C0903o0) this.f205e).f8848a;
                c0908r0.f8871g = 1;
                m.i0 i0Var = c0908r0.f8866b;
                if (i0Var == null || !(c0908r0.f8865a.a() || c0908r0.f8865a.c())) {
                    C0908r0.a(c0908r0, c0908r0.f8872h, a4, 1);
                } else {
                    i0Var.f(a4, c0908r0.f8871g, c0908r0.f8874j);
                }
                return Unit.f7487a;
            default:
                ((Number) obj).longValue();
                U0 u02 = (U0) this.f205e;
                float f9 = u02.f8727e;
                u02.f8727e = 0.0f;
                ((Function1) this.f206i).invoke(Float.valueOf(f9));
                return Unit.f7487a;
        }
    }
}
