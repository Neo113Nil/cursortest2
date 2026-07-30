package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.internal.l;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class r71 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ v71 e;

    public /* synthetic */ r71(v71 v71Var, int i) {
        this.d = i;
        this.e = v71Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        v71 v71Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Boolean.valueOf(v71Var.r);
            default:
                o10 o10Var = v71Var.T;
                if (!o10Var.d.r) {
                    return null;
                }
                j10 E0 = o10Var.E0();
                int ordinal = E0.ordinal();
                if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
                    if (ordinal == 3) {
                        return null;
                    }
                    l.a();
                    return null;
                }
                if (E0.a()) {
                    return o10Var.C0(null);
                }
                o10 f = ((e10) ((d4) op.J(o10Var)).getFocusOwner()).f();
                if (f != null) {
                    return f.C0(op.H(o10Var));
                }
                return null;
        }
    }
}
