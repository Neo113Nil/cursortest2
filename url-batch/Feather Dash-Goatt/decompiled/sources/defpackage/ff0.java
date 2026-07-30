package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ff0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ if0 e;

    public /* synthetic */ ff0(if0 if0Var, int i) {
        this.d = i;
        this.e = if0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        if0 if0Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                mf0 mf0Var = (mf0) if0Var.s.invoke();
                int c = mf0Var.c();
                int i2 = 0;
                while (true) {
                    if (i2 >= c) {
                        i2 = -1;
                    } else if (!mf0Var.d(i2).equals(obj)) {
                        i2++;
                    }
                }
                return Integer.valueOf(i2);
            default:
                int intValue = ((Integer) obj).intValue();
                mf0 mf0Var2 = (mf0) if0Var.s.invoke();
                if (intValue < 0 || intValue >= mf0Var2.c()) {
                    StringBuilder n = qy0.n("Can't scroll to index ", intValue, ", it is out of bounds [0, ");
                    n.append(mf0Var2.c());
                    n.append(')');
                    r80.a(n.toString());
                }
                uq1.N(if0Var.n0(), null, new hf0(if0Var, intValue, null), 3);
                return Boolean.TRUE;
        }
    }
}
