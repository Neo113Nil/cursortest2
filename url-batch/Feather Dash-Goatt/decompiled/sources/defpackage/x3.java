package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class x3 extends pc0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ z11 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x3(int i, z11 z11Var) {
        super(1);
        this.d = i;
        this.e = z11Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.d;
        z11 z11Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                z11Var.d = (o10) obj;
                return Boolean.TRUE;
            default:
                yq yqVar = (kj1) obj;
                if (((zl0) yqVar).d.r) {
                    z11Var.d = yqVar;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
