package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class i41 extends gd0 {
    public static final i41 b = new i41(0);
    public final /* synthetic */ int a;

    public /* synthetic */ i41(int i) {
        this.a = i;
    }

    @Override // defpackage.vk0
    public final wk0 f(ej0 ej0Var, List list, long j) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int size = list.size();
                if (size == 0) {
                    return xk0.q(ej0Var, mm.j(j), mm.i(j), h41.e);
                }
                if (size == 1) {
                    zw0 c = ((qk0) list.get(0)).c(j);
                    return xk0.q(ej0Var, nm.f(c.d, j), nm.e(c.e, j), new q3(c, 2));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < size2; i3++) {
                    zw0 c2 = ((qk0) list.get(i3)).c(j);
                    i = Math.max(c2.d, i);
                    i2 = Math.max(c2.e, i2);
                    arrayList.add(c2);
                }
                return xk0.q(ej0Var, nm.f(i, j), nm.e(i2, j), new a3(19, arrayList));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
