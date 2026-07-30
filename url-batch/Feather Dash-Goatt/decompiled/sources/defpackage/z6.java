package defpackage;

import android.graphics.Canvas;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class z6 extends pc0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(pn1 pn1Var, jd0 jd0Var, pn1 pn1Var2) {
        super(1);
        this.d = 0;
        this.e = pn1Var;
        this.h = jd0Var;
        this.g = pn1Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        boolean z = false;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                pn1 pn1Var = (pn1) obj4;
                jd0 jd0Var = (jd0) obj2;
                pn1 pn1Var2 = (pn1) obj3;
                xf g = ((hu) obj).v().g();
                if (pn1Var.getView().getVisibility() != 8) {
                    pn1Var.C = true;
                    eu0 eu0Var = jd0Var.s;
                    d4 d4Var = eu0Var instanceof d4 ? (d4) eu0Var : null;
                    if (d4Var != null) {
                        Canvas a = k3.a(g);
                        d4Var.getAndroidViewsHandler$ui().getClass();
                        pn1Var2.draw(a);
                    }
                    pn1Var.C = false;
                }
                return Unit.a;
            case 1:
                kr0 kr0Var = (kr0) obj4;
                vg0 vg0Var = (vg0) obj3;
                qc qcVar = (qc) obj2;
                kr0Var.getClass();
                vg0Var.getClass();
                qcVar.getClass();
                xg0 f = vg0Var.f();
                if (f.c != og0.d) {
                    qcVar.b.add(new ir0(kr0Var, f, qcVar));
                    kr0Var.c();
                    qcVar.c = new v3(0, kr0Var, kr0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 9);
                }
                return new n2(2, qcVar);
            case 2:
                kj1 kj1Var = (kj1) obj;
                ft ftVar = (ft) kj1Var;
                if (!((e5) ((d4) op.J((ft) obj3)).m12getDragAndDropManager()).b.contains(ftVar) || !m90.h(ftVar, la0.I((s40) obj2))) {
                    return jj1.d;
                }
                ((z11) obj4).d = kj1Var;
                return jj1.g;
            default:
                o10 o10Var = (o10) obj;
                if (!Intrinsics.a(o10Var, (o10) obj4)) {
                    if (Intrinsics.a(o10Var, ((e10) obj3).c)) {
                        dd0.j("Focus search landed at the root.");
                        return null;
                    }
                    z = ((Boolean) ((Function1) obj2).invoke(o10Var)).booleanValue();
                }
                return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z6(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.d = i;
        this.e = obj;
        this.g = obj2;
        this.h = obj3;
    }
}
