package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class cf1 extends pc0 implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ df1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cf1(df1 df1Var, int i) {
        super(2);
        this.d = i;
        this.e = df1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        int i = this.d;
        df1 df1Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                df1Var.a().e = (ml) obj2;
                break;
            case 1:
                ((jd0) obj).a0(new td0(df1Var.a(), (Function2) obj2));
                break;
            default:
                jd0 jd0Var = (jd0) obj;
                yw ywVar = df1Var.a;
                xd0 xd0Var = jd0Var.L;
                if (xd0Var == null) {
                    xd0Var = new xd0(jd0Var, ywVar);
                    jd0Var.L = xd0Var;
                }
                df1Var.b = xd0Var;
                df1Var.a().h();
                xd0 a = df1Var.a();
                if (a.g != ywVar) {
                    a.g = ywVar;
                    a.i(false);
                    jd0.T(a.d, false, 7);
                }
                break;
        }
        return Unit.a;
    }
}
