package x;

import C0.C0031g;
import I.C0173s0;
import I.C0176u;
import I0.C0188a;
import I0.C0193f;
import e2.InterfaceC0424c;
import java.util.List;
import r0.InterfaceC0919p;
import u0.C1103h0;
import u0.K0;

/* renamed from: x.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1204q extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10233e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Q f10234f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1204q(Q q3, int i3) {
        super(1);
        this.f10233e = i3;
        this.f10234f = q3;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        InterfaceC0424c interfaceC0424c;
        R1.y yVar;
        K0 k02;
        boolean z3 = false;
        R1.y yVar2 = null;
        R1.y yVar3 = R1.y.f4171a;
        Q q3 = this.f10234f;
        switch (this.f10233e) {
            case 0:
                InterfaceC0919p interfaceC0919p = (InterfaceC0919p) obj;
                p0 d3 = q3.d();
                if (d3 != null) {
                    d3.f10232c = interfaceC0919p;
                }
                return yVar3;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                q3.f9991q.setValue(bool);
                return yVar3;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                List list = (List) obj;
                if (q3.d() != null) {
                    p0 d4 = q3.d();
                    f2.j.c(d4);
                    list.add(d4.f10230a);
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                C0031g c0031g = (C0031g) obj;
                I0.F f3 = q3.f9979e;
                C1204q c1204q = q3.f9994t;
                if (f3 != null) {
                    I0.z i3 = q3.f9978d.i(S1.m.A0(new C0193f(), new C0188a(c0031g, 1)));
                    f3.a(null, i3);
                    c1204q.n(i3);
                    yVar2 = yVar3;
                }
                if (yVar2 == null) {
                    String str = c0031g.f596a;
                    int length = str.length();
                    c1204q.n(new I0.z(str, O2.l.J(length, length), 4));
                }
                return Boolean.TRUE;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                int i4 = ((I0.l) obj).f3070a;
                G1.m mVar = q3.f9992r;
                mVar.getClass();
                if (I0.l.a(i4, 7)) {
                    interfaceC0424c = mVar.l().f9962a;
                } else if (I0.l.a(i4, 2)) {
                    interfaceC0424c = mVar.l().f9963b;
                } else if (I0.l.a(i4, 6)) {
                    interfaceC0424c = mVar.l().f9964c;
                } else if (I0.l.a(i4, 5)) {
                    interfaceC0424c = mVar.l().f9965d;
                } else if (I0.l.a(i4, 3)) {
                    interfaceC0424c = mVar.l().f9966e;
                } else if (I0.l.a(i4, 4)) {
                    interfaceC0424c = mVar.l().f9967f;
                } else {
                    if (!(I0.l.a(i4, 1) ? true : I0.l.a(i4, 0))) {
                        throw new IllegalStateException("invalid ImeAction");
                    }
                    interfaceC0424c = null;
                }
                if (interfaceC0424c != null) {
                    interfaceC0424c.n(mVar);
                    yVar = yVar3;
                } else {
                    yVar = null;
                }
                if (yVar == null) {
                    if (I0.l.a(i4, 6)) {
                        Z.h hVar = (Z.h) mVar.f2118d;
                        if (hVar == null) {
                            f2.j.j("focusManager");
                            throw null;
                        }
                        ((androidx.compose.ui.focus.b) hVar).d(1);
                    } else if (I0.l.a(i4, 5)) {
                        Z.h hVar2 = (Z.h) mVar.f2118d;
                        if (hVar2 == null) {
                            f2.j.j("focusManager");
                            throw null;
                        }
                        ((androidx.compose.ui.focus.b) hVar2).d(2);
                    } else if (I0.l.a(i4, 7) && (k02 = (K0) mVar.f2116b) != null) {
                        ((C1103h0) k02).a();
                    }
                }
                return yVar3;
            default:
                I0.z zVar = (I0.z) obj;
                String str2 = zVar.f3097a.f596a;
                C0031g c0031g2 = q3.f9984j;
                if (!f2.j.a(str2, c0031g2 != null ? c0031g2.f596a : null)) {
                    q3.f9985k.setValue(F.f9944d);
                }
                long j3 = C0.J.f567b;
                q3.f(j3);
                q3.e(j3);
                q3.f9993s.n(zVar);
                C0173s0 c0173s0 = q3.f9976b;
                C0176u c0176u = c0173s0.f2904b;
                if (c0176u != null) {
                    c0176u.p(c0173s0, null);
                }
                return yVar3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1204q(Q q3, A0.i iVar) {
        super(1);
        this.f10233e = 3;
        this.f10234f = q3;
    }
}
