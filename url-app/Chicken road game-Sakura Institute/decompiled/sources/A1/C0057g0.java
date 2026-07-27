package A1;

import G.C0208l;
import G.C0216p;
import androidx.compose.foundation.layout.FillElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import n.AbstractC0864b;
import z1.C1372P;

/* renamed from: A1.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0057g0 extends M2.p implements L2.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q.v f604e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function1 f605i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0057g0(Q.v vVar, Function1 function1, int i2) {
        super(4);
        this.f603d = i2;
        this.f604e = vVar;
        this.f605i = function1;
    }

    @Override // L2.d
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        int i4;
        switch (this.f603d) {
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
                    C1372P c1372p = (C1372P) this.f604e.get(intValue);
                    c0216p.S(335617456);
                    FillElement fillElement = androidx.compose.foundation.layout.c.f5081a;
                    c0216p.S(1673394892);
                    Function1 function1 = this.f605i;
                    boolean f4 = c0216p.f(function1) | c0216p.h(c1372p);
                    Object I3 = c0216p.I();
                    if (f4 || I3 == C0208l.f2826a) {
                        I3 = new C0051d0(function1, c1372p, 0);
                        c0216p.c0(I3);
                    }
                    c0216p.q(false);
                    AbstractC0864b.f(androidx.compose.foundation.a.e(fillElement, false, null, (Function0) I3, 7), 0L, O.f.b(-251812755, new C0053e0(c1372p, 0), c0216p), c0216p, 384, 2);
                    c0216p.q(false);
                }
                break;
            default:
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
                    C1372P c1372p2 = (C1372P) this.f604e.get(intValue3);
                    c0216p2.S(1481345173);
                    FillElement fillElement2 = androidx.compose.foundation.layout.c.f5081a;
                    c0216p2.S(2125996512);
                    Function1 function12 = this.f605i;
                    boolean f5 = c0216p2.f(function12) | c0216p2.h(c1372p2);
                    Object I4 = c0216p2.I();
                    if (f5 || I4 == C0208l.f2826a) {
                        I4 = new C0051d0(function12, c1372p2, 1);
                        c0216p2.c0(I4);
                    }
                    c0216p2.q(false);
                    AbstractC0864b.f(androidx.compose.foundation.a.e(fillElement2, false, null, (Function0) I4, 7), 0L, O.f.b(1028379818, new C0053e0(c1372p2, 1), c0216p2), c0216p2, 384, 2);
                    c0216p2.q(false);
                }
                break;
        }
        return Unit.f7487a;
    }
}
