package defpackage;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class r4 extends pc0 implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(d4 d4Var, Function2 function2, int i) {
        super(2);
        this.d = 0;
        this.e = d4Var;
        this.g = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        int i = this.d;
        Object obj3 = this.g;
        Object obj4 = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Number) obj2).intValue();
                AndroidCompositionLocals_androidKt.a((d4) obj4, (Function2) obj3, (hl) obj, gb0.P(1));
                break;
            case 1:
                int intValue = ((Number) obj).intValue();
                l81 l81Var = (l81) obj2;
                z4 z4Var = (z4) obj3;
                if (!((m81) obj4).b.b(l81Var.g)) {
                    z4Var.l(intValue, l81Var);
                    z4Var.l.s(Unit.a);
                }
                break;
            case 2:
                hl hlVar = (hl) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (hlVar.O(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Boolean bool = (Boolean) ((pd0) obj4).g.getValue();
                    boolean booleanValue = bool.booleanValue();
                    Function2 function2 = (Function2) obj3;
                    hlVar.Z(bool);
                    boolean g = hlVar.g(booleanValue);
                    if (booleanValue) {
                        function2.b(hlVar, 0);
                    } else {
                        if (hlVar.l != 0) {
                            kl.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!hlVar.S) {
                            if (g) {
                                za1 za1Var = hlVar.G;
                                int i2 = za1Var.g;
                                int i3 = za1Var.h;
                                cl clVar = hlVar.M;
                                clVar.getClass();
                                clVar.d(false);
                                clVar.b.a.D(yr0.c);
                                la0.t(hlVar.s, i2, i3);
                                hlVar.G.t();
                            } else {
                                hlVar.Q();
                            }
                        }
                    }
                    if (hlVar.y && hlVar.G.i == hlVar.z) {
                        hlVar.z = -1;
                        hlVar.y = false;
                    }
                    hlVar.p(false);
                } else {
                    hlVar.R();
                }
                break;
            default:
                xf xfVar = (xf) obj;
                l50 l50Var = (l50) obj2;
                qp0 qp0Var = (qp0) obj4;
                jd0 jd0Var = qp0Var.s;
                if (jd0Var.G()) {
                    qp0Var.L = xfVar;
                    qp0Var.K = l50Var;
                    gu0 snapshotObserver = ((d4) md0.a(jd0Var)).getSnapshotObserver();
                    o31 o31Var = qp0.Q;
                    snapshotObserver.a.b(qp0Var, y3.x, (np0) obj3);
                    qp0Var.O = false;
                } else {
                    qp0Var.O = true;
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r4(Object obj, int i, Object obj2) {
        super(2);
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }
}
