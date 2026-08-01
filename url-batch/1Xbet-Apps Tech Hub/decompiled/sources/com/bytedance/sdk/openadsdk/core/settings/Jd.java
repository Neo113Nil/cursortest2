package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* compiled from: AppSetIdAndScope.java */
/* loaded from: classes2.dex */
public class Jd {
    private static int Jd = 0;
    private static volatile String icD = "";
    private static volatile String pvs = "";
    private static String vG;

    public static void pvs() {
        try {
            AppSet.getClient(com.bytedance.sdk.openadsdk.core.mnm.pvs()).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.bytedance.sdk.openadsdk.core.settings.AppSetIdAndScope$1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public void onSuccess(AppSetIdInfo appSetIdInfo) {
                    String unused = Jd.pvs = Integer.toString(appSetIdInfo.getScope());
                    String unused2 = Jd.icD = appSetIdInfo.getId();
                    int unused3 = Jd.Jd = 1;
                }
            });
        } catch (Throwable unused) {
            Jd = 2;
        }
    }

    public static String icD() {
        if (Jd != 0) {
            return pvs;
        }
        pvs();
        return pvs;
    }

    public static String vG() {
        if (Jd != 0) {
            return icD;
        }
        pvs();
        return icD;
    }

    public static String Jd() {
        if (TextUtils.isEmpty(vG)) {
            vG = com.bytedance.sdk.openadsdk.core.mnm.pvs().getPackageManager().getInstallerPackageName(jlb.NB());
        }
        if (vG == null) {
            vG = "";
        }
        return vG;
    }
}
