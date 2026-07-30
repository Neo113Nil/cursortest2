package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ir implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ jr e;

    public /* synthetic */ ir(jr jrVar, int i) {
        this.d = i;
        this.e = jrVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        jr jrVar = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                y31 y31Var = (y31) mo.k(jrVar, b41.a);
                j6 j6Var = jrVar.y;
                if (y31Var == null) {
                    if (j6Var != null) {
                        jrVar.A0(j6Var);
                    }
                    jrVar.y = null;
                } else if (j6Var == null) {
                    s40 s40Var = new s40(20, jrVar);
                    ir irVar = new ir(jrVar, 1);
                    gn0 gn0Var = jrVar.u;
                    boolean z = jrVar.v;
                    float f = jrVar.w;
                    sj1 sj1Var = c41.a;
                    j6 j6Var2 = new j6(gn0Var, z, f, s40Var, irVar);
                    jrVar.z0(j6Var2);
                    jrVar.y = j6Var2;
                }
                return Unit.a;
            default:
                return la0.s;
        }
    }
}
