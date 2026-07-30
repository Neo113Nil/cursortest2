package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ku extends o81 implements xt0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku(l30 l30Var, boolean z, Function0 function0) {
        super(3);
        this.m = 1;
        this.p = l30Var;
        this.n = z;
        this.o = function0;
    }

    @Override // defpackage.xt0
    public final Object a(Object obj, Object obj2, Object obj3) {
        int i = this.m;
        bn1 bn1Var = null;
        int i2 = 2;
        Object obj4 = sz.a;
        Object obj5 = this.o;
        Object obj6 = this.p;
        switch (i) {
            case 0:
                a00 a00Var = (a00) obj2;
                ((Number) obj3).intValue();
                a00Var.X(-756081143);
                z11 z11Var = (z11) a00Var.j(d.a);
                if (z11Var instanceof d21) {
                    a00Var.X(617140216);
                    a00Var.q(false);
                } else {
                    a00Var.X(617248189);
                    Object M = a00Var.M();
                    if (M == obj4) {
                        M = new bn1();
                        a00Var.i0(M);
                    }
                    bn1Var = (bn1) M;
                    a00Var.q(false);
                }
                vl1 c = a.c(sl1.a, bn1Var, z11Var, this.n, (String) obj6, null, (Function0) obj5);
                a00Var.q(false);
                return c;
            case 1:
                int i3 = 2;
                y20 y20Var = (y20) obj;
                a00 a00Var2 = (a00) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    if (a00Var2.f(y20Var)) {
                        i3 = 4;
                    }
                    intValue |= i3;
                }
                if ((intValue & 19) == 18 && a00Var2.B()) {
                    a00Var2.S();
                } else {
                    String str = (String) ((l30) obj6).invoke(a00Var2, 0);
                    if (up2.y(str)) {
                        lh.g("Label must not be blank");
                        return null;
                    }
                    k30.b(str, this.n, y20Var, (Function0) obj5, a00Var2, (intValue << 6) & 896);
                }
                return Unit.a;
            case 2:
                a00 a00Var3 = (a00) obj2;
                ((Number) obj3).intValue();
                a00Var3.X(-891038934);
                vl1 c2 = androidx.compose.ui.draw.a.c(sl1.a, new l8(pu2.d(this.n, ((Boolean) yk3.x((b41) obj6, a00Var3, 0).getValue()).booleanValue(), (du2) obj5, 2.0f, 1.0f, a00Var3, 0), i2));
                a00Var3.q(false);
                return c2;
            default:
                a00 a00Var4 = (a00) obj2;
                ((Number) obj3).intValue();
                dv2 dv2Var = (dv2) obj6;
                a00Var4.X(805428266);
                int i4 = 1;
                boolean z = ((ww1) dv2Var.e.getValue()) == ww1.m || !(a00Var4.j(p00.n) == u81.n);
                boolean f = a00Var4.f(dv2Var);
                Object M2 = a00Var4.M();
                if (f || M2 == obj4) {
                    M2 = new s72(13, dv2Var);
                    a00Var4.i0(M2);
                }
                zn1 k = ij2.k((Function1) M2, a00Var4);
                Object M3 = a00Var4.M();
                if (M3 == obj4) {
                    Object w80Var = new w80(new l8(k, i4));
                    a00Var4.i0(w80Var);
                    M3 = w80Var;
                }
                uf2 uf2Var = (uf2) M3;
                boolean f2 = a00Var4.f(uf2Var) | a00Var4.f(dv2Var);
                Object M4 = a00Var4.M();
                if (f2 || M4 == obj4) {
                    M4 = new bv2(uf2Var, dv2Var);
                    a00Var4.i0(M4);
                }
                vl1 b = androidx.compose.foundation.gestures.a.b(sl1.a, (bv2) M4, (ww1) dv2Var.e.getValue(), null, this.n && dv2Var.b.h() != 0.0f, z, null, (bn1) obj5, null);
                a00Var4.q(false);
                return b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ku(int i, Object obj, Object obj2, boolean z) {
        super(3);
        this.m = i;
        this.p = obj;
        this.n = z;
        this.o = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku(boolean z, String str, Function0 function0) {
        super(3);
        this.m = 0;
        this.n = z;
        this.p = str;
        this.o = function0;
    }
}
