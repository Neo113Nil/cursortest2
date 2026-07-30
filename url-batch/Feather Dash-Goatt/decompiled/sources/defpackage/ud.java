package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ud implements vk0 {
    public static final ud b = new ud(0);
    public static final ud c = new ud(1);
    public static final q1 d = new q1(7);
    public static final ud e = new ud(2);
    public static final ud f = new ud(3);
    public final /* synthetic */ int a;

    public /* synthetic */ ud(int i) {
        this.a = i;
    }

    @Override // defpackage.vk0
    public final wk0 f(ej0 ej0Var, List list, long j) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return xk0.q(ej0Var, mm.j(j), mm.i(j), new q1(2));
            case 1:
                return xk0.q(ej0Var, mm.h(j), mm.g(j), d);
            case 2:
                return xk0.q(ej0Var, mm.j(j), mm.i(j), new q1(9));
            default:
                return xk0.q(ej0Var, mm.f(j) ? mm.h(j) : 0, mm.e(j) ? mm.g(j) : 0, new k61(10));
        }
    }
}
