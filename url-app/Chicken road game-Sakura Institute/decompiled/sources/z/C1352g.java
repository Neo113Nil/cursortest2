package z;

import A0.C0036g;
import A0.H;
import A0.I;
import A0.L;
import M2.p;
import Z.C0323u;
import Z.InterfaceC0324v;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r0.AbstractC1065f;

/* renamed from: z.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1352g extends p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1353h f11745e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1352g(C1353h c1353h, int i2) {
        super(1);
        this.f11744d = i2;
        this.f11745e = c1353h;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        I i2;
        switch (this.f11744d) {
            case 0:
                List list = (List) obj;
                C1353h c1353h = this.f11745e;
                I i4 = c1353h.B0().f11719n;
                if (i4 != null) {
                    H h4 = i4.f289a;
                    C0036g c0036g = h4.f279a;
                    L l4 = c1353h.f11755u;
                    InterfaceC0324v interfaceC0324v = c1353h.f11748D;
                    i2 = new I(new H(c0036g, L.e(l4, interfaceC0324v != null ? interfaceC0324v.a() : C0323u.f4547g, 0L, null, null, null, 0L, null, 0, 0L, 16777214), h4.f281c, h4.f282d, h4.f283e, h4.f284f, h4.f285g, h4.f286h, h4.f287i, h4.f288j), i4.f290b, i4.f291c);
                    list.add(i2);
                } else {
                    i2 = null;
                }
                break;
            case 1:
                C0036g c0036g2 = (C0036g) obj;
                C1353h c1353h2 = this.f11745e;
                C1351f c1351f = c1353h2.f11753I;
                if (c1351f == null) {
                    C1351f c1351f2 = new C1351f(c1353h2.f11754t, c0036g2);
                    C1349d c1349d = new C1349d(c0036g2, c1353h2.f11755u, c1353h2.f11756v, c1353h2.f11758x, c1353h2.f11759y, c1353h2.f11760z, c1353h2.f11746A, c1353h2.B);
                    c1349d.c(c1353h2.B0().f11716k);
                    c1351f2.f11743d = c1349d;
                    c1353h2.f11753I = c1351f2;
                } else if (!Intrinsics.a(c0036g2, c1351f.f11741b)) {
                    c1351f.f11741b = c0036g2;
                    C1349d c1349d2 = c1351f.f11743d;
                    if (c1349d2 != null) {
                        L l5 = c1353h2.f11755u;
                        F0.d dVar = c1353h2.f11756v;
                        int i5 = c1353h2.f11758x;
                        boolean z4 = c1353h2.f11759y;
                        int i6 = c1353h2.f11760z;
                        int i7 = c1353h2.f11746A;
                        List list2 = c1353h2.B;
                        c1349d2.f11706a = c0036g2;
                        c1349d2.f11707b = l5;
                        c1349d2.f11708c = dVar;
                        c1349d2.f11709d = i5;
                        c1349d2.f11710e = z4;
                        c1349d2.f11711f = i6;
                        c1349d2.f11712g = i7;
                        c1349d2.f11713h = list2;
                        c1349d2.f11717l = null;
                        c1349d2.f11719n = null;
                        c1349d2.f11721p = -1;
                        c1349d2.f11720o = -1;
                        Unit unit = Unit.f7487a;
                    }
                }
                AbstractC1065f.p(c1353h2);
                AbstractC1065f.o(c1353h2);
                AbstractC1065f.n(c1353h2);
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C1353h c1353h3 = this.f11745e;
                C1351f c1351f3 = c1353h3.f11753I;
                if (c1351f3 != null) {
                    Function1 function1 = c1353h3.f11749E;
                    if (function1 != null) {
                        function1.invoke(c1351f3);
                    }
                    C1351f c1351f4 = c1353h3.f11753I;
                    if (c1351f4 != null) {
                        c1351f4.f11742c = booleanValue;
                    }
                    AbstractC1065f.p(c1353h3);
                    AbstractC1065f.o(c1353h3);
                    AbstractC1065f.n(c1353h3);
                    break;
                } else {
                    break;
                }
        }
        return Boolean.TRUE;
    }
}
