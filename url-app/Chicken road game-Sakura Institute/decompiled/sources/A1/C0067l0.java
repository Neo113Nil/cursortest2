package A1;

import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.InterfaceC0191c0;
import androidx.compose.foundation.layout.FillElement;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import z1.AbstractC1366J;
import z1.C1374S;
import z1.C1377c;
import z1.C1389o;

/* renamed from: A1.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0067l0 extends M2.p implements L2.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f628e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0067l0(int i2, List list) {
        super(4);
        this.f627d = i2;
        this.f628e = list;
    }

    @Override // L2.d
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        Object obj5;
        int i4;
        int i5;
        switch (this.f627d) {
            case 0:
                r.c cVar = (r.c) obj;
                int intValue = ((Number) obj2).intValue();
                C0216p c0216p = (C0216p) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i2 = (c0216p.f(cVar) ? 4 : 2) | intValue2;
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i2 |= c0216p.d(intValue) ? 32 : 16;
                }
                if ((i2 & 147) == 146 && c0216p.z()) {
                    c0216p.N();
                } else {
                    C1389o c1389o = (C1389o) this.f628e.get(intValue);
                    c0216p.S(1358729469);
                    ListIterator listIterator = AbstractC1366J.f11818d.listIterator();
                    while (true) {
                        A2.b bVar = (A2.b) listIterator;
                        if (bVar.hasNext()) {
                            obj5 = bVar.next();
                            if (Intrinsics.a(((C1377c) obj5).f11851a, c1389o.f11901a)) {
                            }
                        } else {
                            obj5 = null;
                        }
                    }
                    AbstractC0864b.f(null, 0L, O.f.b(1754942157, new C0065k0(c1389o, 0, (C1377c) obj5), c0216p), c0216p, 384, 3);
                    c0216p.q(false);
                }
                break;
            case 1:
                r.c cVar2 = (r.c) obj;
                int intValue3 = ((Number) obj2).intValue();
                C0216p c0216p2 = (C0216p) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i4 = (c0216p2.f(cVar2) ? 4 : 2) | intValue4;
                } else {
                    i4 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i4 |= c0216p2.d(intValue3) ? 32 : 16;
                }
                if ((i4 & 147) == 146 && c0216p2.z()) {
                    c0216p2.N();
                } else {
                    M0 m02 = (M0) this.f628e.get(intValue3);
                    c0216p2.S(839622838);
                    c0216p2.S(1551104934);
                    Object I3 = c0216p2.I();
                    G.W w4 = C0208l.f2826a;
                    if (I3 == w4) {
                        I3 = C0192d.K(Boolean.FALSE, G.W.f2779l);
                        c0216p2.c0(I3);
                    }
                    InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) I3;
                    c0216p2.q(false);
                    FillElement fillElement = androidx.compose.foundation.layout.c.f5081a;
                    c0216p2.S(1551108316);
                    Object I4 = c0216p2.I();
                    if (I4 == w4) {
                        I4 = new C0047b0(1, interfaceC0191c0);
                        c0216p2.c0(I4);
                    }
                    c0216p2.q(false);
                    AbstractC0864b.f(androidx.compose.foundation.a.e(fillElement, false, null, (Function0) I4, 7), 0L, O.f.b(-635220377, new C0065k0(m02, 1, interfaceC0191c0), c0216p2), c0216p2, 384, 2);
                    c0216p2.q(false);
                }
                break;
            default:
                r.c cVar3 = (r.c) obj;
                int intValue5 = ((Number) obj2).intValue();
                C0216p c0216p3 = (C0216p) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    i5 = (c0216p3.f(cVar3) ? 4 : 2) | intValue6;
                } else {
                    i5 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i5 |= c0216p3.d(intValue5) ? 32 : 16;
                }
                if ((i5 & 147) == 146 && c0216p3.z()) {
                    c0216p3.N();
                } else {
                    C1374S c1374s = (C1374S) this.f628e.get(intValue5);
                    c0216p3.S(-235158695);
                    R0.d(c1374s, c0216p3, 0);
                    c0216p3.q(false);
                }
                break;
        }
        return Unit.f7487a;
    }
}
