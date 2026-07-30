package defpackage;

import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class xq1 implements IntegrityManager {
    public final hr1 a;

    public xq1(hr1 hr1Var) {
        this.a = hr1Var;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        hr1 hr1Var = this.a;
        br1 br1Var = hr1Var.d;
        if (br1Var == null) {
            return t80.o(new ea0(-2, null));
        }
        try {
            byte[] decode = Base64.decode(integrityTokenRequest.b(), 10);
            Long a = integrityTokenRequest.a();
            hr1Var.a.a("requestIntegrityToken(%s)", integrityTokenRequest);
            ng1 ng1Var = new ng1();
            br1Var.a().post(new xr1(br1Var, ng1Var, ng1Var, new dr1(hr1Var, ng1Var, decode, a, ng1Var, integrityTokenRequest)));
            return ng1Var.a;
        } catch (IllegalArgumentException e) {
            return t80.o(new ea0(-13, e));
        }
    }
}
