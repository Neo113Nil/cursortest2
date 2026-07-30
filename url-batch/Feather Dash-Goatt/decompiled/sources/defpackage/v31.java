package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class v31 extends pc0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ w31 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v31(w31 w31Var, int i) {
        super(1);
        this.d = i;
        this.e = w31Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        w31 w31Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Double.valueOf(w31Var.n.b(b11.a(((Number) obj).doubleValue(), w31Var.e, w31Var.f)));
            default:
                return Double.valueOf(b11.a(w31Var.k.b(((Number) obj).doubleValue()), w31Var.e, w31Var.f));
        }
    }
}
