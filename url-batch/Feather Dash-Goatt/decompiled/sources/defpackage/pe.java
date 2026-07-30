package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class pe implements Function1 {
    public final /* synthetic */ int d;
    public Object e;

    public /* synthetic */ pe(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((uf) this.e).cancel();
                return Unit.a;
            case 1:
                mb1 mb1Var = (mb1) obj;
                synchronized (pb1.c) {
                    j = pb1.e;
                    pb1.e = 1 + j;
                }
                return new f11(j, mb1Var, (Function1) this.e);
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                xx0 xx0Var = (xx0) this.e;
                if (xx0Var != null) {
                    xx0Var.c = booleanValue;
                }
                return Unit.a;
        }
    }

    public /* synthetic */ pe() {
        this.d = 2;
    }
}
