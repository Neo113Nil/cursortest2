package n;

import A.a0;
import A0.C0036g;
import A0.K;
import G.C0216p;
import G0.s;
import G0.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import w.C1269i;
import w.EnumC1257F;
import w.P;

/* loaded from: classes.dex */
public final class i extends M2.p implements L2.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8517d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f8518e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f8519i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f8520j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f8521k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f8522l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(s sVar, boolean z4, y yVar, a0 a0Var, P p4) {
        super(3);
        this.f8519i = sVar;
        this.f8518e = z4;
        this.f8520j = yVar;
        this.f8521k = a0Var;
        this.f8522l = p4;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [M2.p, kotlin.jvm.functions.Function0] */
    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        Object obj4 = this.f8522l;
        Object obj5 = this.f8521k;
        Object obj6 = this.f8520j;
        boolean z4 = false;
        Object obj7 = this.f8519i;
        switch (this.f8517d) {
            case 0:
                c cVar = (c) obj;
                C0216p c0216p = (C0216p) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c0216p.f(cVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18 && c0216p.z()) {
                    c0216p.N();
                } else {
                    String str = (String) ((C1269i) obj7).h(c0216p, 0);
                    if (kotlin.text.y.x(str)) {
                        throw new IllegalStateException("Label must not be blank");
                    }
                    r.b(str, this.f8518e, cVar, (S.o) obj6, (L2.c) obj5, (M2.p) obj4, c0216p, (intValue << 6) & 896);
                }
                return Unit.f7487a;
            default:
                int intValue2 = ((Number) obj).intValue();
                int intValue3 = ((Number) obj2).intValue();
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                s sVar = (s) obj7;
                if (!booleanValue) {
                    intValue2 = sVar.a(intValue2);
                }
                if (!booleanValue) {
                    intValue3 = sVar.a(intValue3);
                }
                if (this.f8518e) {
                    y yVar = (y) obj6;
                    int i2 = K.f300c;
                    long j4 = yVar.f3094b;
                    if (intValue2 != ((int) (j4 >> 32)) || intValue3 != ((int) (j4 & 4294967295L))) {
                        int min = Math.min(intValue2, intValue3);
                        a0 a0Var = (a0) obj5;
                        EnumC1257F enumC1257F = EnumC1257F.f11023d;
                        if (min >= 0) {
                            int max = Math.max(intValue2, intValue3);
                            C0036g c0036g = yVar.f3093a;
                            if (max <= c0036g.f328a.length()) {
                                if (booleanValue || intValue2 == intValue3) {
                                    a0Var.p(false);
                                    a0Var.n(enumC1257F);
                                } else {
                                    a0Var.f(true);
                                }
                                ((P) obj4).f11073t.invoke(new y(c0036g, M1.a.j(intValue2, intValue3), (K) null));
                                z4 = true;
                            }
                        }
                        a0Var.p(false);
                        a0Var.n(enumC1257F);
                    }
                }
                return Boolean.valueOf(z4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(C1269i c1269i, boolean z4, S.o oVar, L2.c cVar, Function0 function0) {
        super(3);
        this.f8519i = c1269i;
        this.f8518e = z4;
        this.f8520j = oVar;
        this.f8521k = cVar;
        this.f8522l = (M2.p) function0;
    }
}
