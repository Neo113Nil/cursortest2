package defpackage;

import android.content.Intent;
import com.android.installreferrer.api.InstallReferrerClient;
import com.feathherdashh.dashgame.MainActivity;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class i2 extends uq1 {
    public final /* synthetic */ int v;

    public /* synthetic */ i2(int i) {
        this.v = i;
    }

    @Override // defpackage.uq1
    public j41 K(MainActivity mainActivity, Object obj) {
        switch (this.v) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (p4.t(mainActivity, (String) obj) == 0) {
                    return new j41(12);
                }
                return null;
            default:
                return super.K(mainActivity, obj);
        }
    }

    @Override // defpackage.uq1
    public final Object O(int i, Intent intent) {
        switch (this.v) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (intent == null || i != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z = false;
                if (intArrayExtra != null) {
                    int length = intArrayExtra.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            if (intArrayExtra[i2] == 0) {
                                z = true;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                return new h2(i, intent);
        }
    }

    @Override // defpackage.uq1
    public final Intent y(MainActivity mainActivity, Object obj) {
        switch (this.v) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{(String) obj});
                putExtra.getClass();
                return putExtra;
            default:
                return (Intent) obj;
        }
    }
}
