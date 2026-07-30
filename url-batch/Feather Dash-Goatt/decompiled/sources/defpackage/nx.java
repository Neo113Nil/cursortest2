package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class nx implements sg0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ nx(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.sg0
    public final void e(vg0 vg0Var, ng0 ng0Var) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                z8 z8Var = (z8) obj;
                int i2 = qx.a[ng0Var.ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 3 || i2 == 4) {
                        z8Var.s(false);
                        break;
                    }
                } else {
                    z8Var.s(true);
                    break;
                }
                break;
            default:
                d61 d61Var = (d61) obj;
                if (ng0Var != ng0.ON_START) {
                    if (ng0Var == ng0.ON_STOP) {
                        d61Var.h = false;
                        break;
                    }
                } else {
                    d61Var.h = true;
                    break;
                }
                break;
        }
    }
}
