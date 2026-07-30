package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class d90 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ e90 e;

    public /* synthetic */ d90(e90 e90Var, int i) {
        this.d = i;
        this.e = e90Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        e90 e90Var = this.e;
        kj1 kj1Var = (kj1) obj;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                kj1Var.getClass();
                e90 e90Var2 = (e90) kj1Var;
                ro1 ro1Var = e90Var.t;
                if (!Intrinsics.a(e90Var2.s, ro1Var)) {
                    e90Var2.s = ro1Var;
                    e90Var2.z0();
                }
                return jj1.e;
            default:
                kj1Var.getClass();
                e90Var.s = ((e90) kj1Var).t;
                return Boolean.FALSE;
        }
    }
}
