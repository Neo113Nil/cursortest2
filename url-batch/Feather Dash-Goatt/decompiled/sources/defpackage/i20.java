package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class i20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i20(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                k20 k20Var = (k20) obj;
                if (k20Var == null) {
                    k20Var = new k20(-3);
                }
                ((yw) this.b).o(k20Var);
                return;
            default:
                k20 k20Var2 = (k20) obj;
                synchronized (l20.c) {
                    try {
                        qa1 qa1Var = l20.d;
                        ArrayList arrayList = (ArrayList) qa1Var.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        qa1Var.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((i20) arrayList.get(i)).a(k20Var2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
