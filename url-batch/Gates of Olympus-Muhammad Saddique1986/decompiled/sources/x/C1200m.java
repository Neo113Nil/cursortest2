package x;

import a.AbstractC0235a;
import e2.InterfaceC0424c;
import java.util.LinkedHashMap;
import java.util.List;
import r0.AbstractC0906c;
import r0.InterfaceC0885G;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;
import r0.InterfaceC0916m;

/* renamed from: x.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1200m implements InterfaceC0885G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q f10165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f10166b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I0.z f10167c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ I0.t f10168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O0.b f10169e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10170f;

    public C1200m(Q q3, InterfaceC0424c interfaceC0424c, I0.z zVar, I0.t tVar, O0.b bVar, int i3) {
        this.f10165a = q3;
        this.f10166b = interfaceC0424c;
        this.f10167c = zVar;
        this.f10168d = tVar;
        this.f10169e = bVar;
        this.f10170f = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0284  */
    @Override // r0.InterfaceC0885G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC0886H f(InterfaceC0887I interfaceC0887I, List list, long j3) {
        Q q3;
        p0 p0Var;
        C0.H h3;
        int j4;
        int h4;
        C0.q qVar;
        C0.H h5;
        C1200m c1200m;
        Q q4;
        int i3;
        Q q5 = this.f10165a;
        S.i c2 = S.u.c();
        InterfaceC0424c f3 = c2 != null ? c2.f() : null;
        S.i d3 = S.u.d(c2);
        try {
            p0 d4 = q5.d();
            C0.H h6 = d4 != null ? d4.f10230a : null;
            Y y3 = q5.f9975a;
            O0.k layoutDirection = interfaceC0887I.getLayoutDirection();
            int i4 = y3.f10044f;
            boolean z3 = y3.f10043e;
            int i5 = y3.f10041c;
            if (h6 != null) {
                C0.o oVar = h6.f558b;
                if (!oVar.f618a.b()) {
                    C0.G g3 = h6.f557a;
                    if (f2.j.a(g3.f547a, y3.f10039a) && g3.f548b.c(y3.f10040b) && f2.j.a(g3.f549c, y3.f10047i) && g3.f550d == i5 && g3.f551e == z3 && AbstractC0235a.v(g3.f552f, i4) && f2.j.a(g3.f553g, y3.f10045g) && g3.f554h == layoutDirection && f2.j.a(g3.f555i, y3.f10046h)) {
                        int j5 = O0.a.j(j3);
                        long j6 = g3.f556j;
                        if (j5 == O0.a.j(j6) && (!(z3 || AbstractC0235a.v(i4, 2)) || (O0.a.h(j3) == O0.a.h(j6) && O0.a.g(j3) == O0.a.g(j6)))) {
                            q3 = q5;
                            h3 = h6;
                            p0Var = d4;
                            h5 = new C0.H(new C0.G(g3.f547a, y3.f10040b, g3.f549c, g3.f550d, g3.f551e, g3.f552f, g3.f553g, g3.f554h, g3.f555i, j3), oVar, O2.d.A(j3, O2.d.d(N.k(oVar.f621d), N.k(oVar.f622e))));
                            long j7 = h5.f559c;
                            Integer valueOf = Integer.valueOf((int) (j7 >> 32));
                            Integer valueOf2 = Integer.valueOf((int) (j7 & 4294967295L));
                            int intValue = valueOf.intValue();
                            int intValue2 = valueOf2.intValue();
                            if (f2.j.a(h3, h5)) {
                                p0 p0Var2 = p0Var;
                                p0 p0Var3 = new p0(h5, p0Var2 != null ? p0Var2.f10232c : null);
                                q4 = q3;
                                q4.f9983i.setValue(p0Var3);
                                i3 = 0;
                                q4.f9990p = false;
                                c1200m = this;
                                c1200m.f10166b.n(h5);
                                N.q(q4, c1200m.f10167c, c1200m.f10168d);
                            } else {
                                c1200m = this;
                                q4 = q3;
                                i3 = 0;
                            }
                            q4.f9981g.setValue(new O0.e(c1200m.f10169e.Y(c1200m.f10170f != 1 ? N.k(h5.f558b.b(i3)) : i3)));
                            R1.i[] iVarArr = {new R1.i(AbstractC0906c.f8150a, Integer.valueOf(Math.round(h5.f560d))), new R1.i(AbstractC0906c.f8151b, Integer.valueOf(Math.round(h5.f561e)))};
                            LinkedHashMap linkedHashMap = new LinkedHashMap(S1.B.J(2));
                            S1.B.K(linkedHashMap, iVarArr);
                            return interfaceC0887I.i0(intValue, intValue2, linkedHashMap, C1192e.f10075g);
                        }
                        q3 = q5;
                        h3 = h6;
                        p0Var = d4;
                        y3.a(layoutDirection);
                        j4 = O0.a.j(j3);
                        h4 = ((!z3 || AbstractC0235a.v(i4, 2)) && O0.a.d(j3)) ? O0.a.h(j3) : Integer.MAX_VALUE;
                        int i6 = (z3 && AbstractC0235a.v(i4, 2)) ? 1 : i5;
                        if (j4 != h4) {
                            C0.q qVar2 = y3.f10048j;
                            if (qVar2 == null) {
                                throw new IllegalStateException("layoutIntrinsics must be called first");
                            }
                            h4 = O2.d.y(N.k(qVar2.c()), j4, h4);
                        }
                        qVar = y3.f10048j;
                        if (qVar != null) {
                            throw new IllegalStateException("layoutIntrinsics must be called first");
                        }
                        int g4 = O0.a.g(j3);
                        int min = Math.min(0, 262142);
                        int min2 = h4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(h4, 262142);
                        int l3 = O2.d.l(min2 == Integer.MAX_VALUE ? min : min2);
                        C0.o oVar2 = new C0.o(qVar, O2.d.a(min, min2, Math.min(l3, 0), g4 != Integer.MAX_VALUE ? Math.min(l3, g4) : Integer.MAX_VALUE), i6, AbstractC0235a.v(i4, 2));
                        h5 = new C0.H(new C0.G(y3.f10039a, y3.f10040b, y3.f10047i, y3.f10041c, y3.f10043e, y3.f10044f, y3.f10045g, layoutDirection, y3.f10046h, j3), oVar2, O2.d.A(j3, O2.d.d(N.k(oVar2.f621d), N.k(oVar2.f622e))));
                        long j72 = h5.f559c;
                        Integer valueOf3 = Integer.valueOf((int) (j72 >> 32));
                        Integer valueOf22 = Integer.valueOf((int) (j72 & 4294967295L));
                        int intValue3 = valueOf3.intValue();
                        int intValue22 = valueOf22.intValue();
                        if (f2.j.a(h3, h5)) {
                        }
                        q4.f9981g.setValue(new O0.e(c1200m.f10169e.Y(c1200m.f10170f != 1 ? N.k(h5.f558b.b(i3)) : i3)));
                        R1.i[] iVarArr2 = {new R1.i(AbstractC0906c.f8150a, Integer.valueOf(Math.round(h5.f560d))), new R1.i(AbstractC0906c.f8151b, Integer.valueOf(Math.round(h5.f561e)))};
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(S1.B.J(2));
                        S1.B.K(linkedHashMap2, iVarArr2);
                        return interfaceC0887I.i0(intValue3, intValue22, linkedHashMap2, C1192e.f10075g);
                    }
                }
            }
            q3 = q5;
            p0Var = d4;
            h3 = h6;
            y3.a(layoutDirection);
            j4 = O0.a.j(j3);
            if (z3) {
            }
            if (z3) {
            }
            if (j4 != h4) {
            }
            qVar = y3.f10048j;
            if (qVar != null) {
            }
        } finally {
            S.u.f(c2, d3, f3);
        }
    }

    @Override // r0.InterfaceC0885G
    public final int h(InterfaceC0916m interfaceC0916m, List list, int i3) {
        Q q3 = this.f10165a;
        q3.f9975a.a(interfaceC0916m.getLayoutDirection());
        C0.q qVar = q3.f9975a.f10048j;
        if (qVar != null) {
            return N.k(qVar.c());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }
}
