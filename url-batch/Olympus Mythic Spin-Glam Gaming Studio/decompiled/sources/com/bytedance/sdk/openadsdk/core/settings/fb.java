package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* loaded from: classes14.dex */
public class fb {
    private static volatile int fb = 0;
    private static volatile String fs = "";
    private static volatile String zmn = "";
    private static String zn;

    public static void zmn() {
        try {
            AppSet.getClient(kgc.zmn()).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.bytedance.sdk.openadsdk.core.settings.AppSetIdAndScope$1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                @Keep
                public void onSuccess(AppSetIdInfo appSetIdInfo) {
                    String unused = fb.zmn = Integer.toString(appSetIdInfo.getScope());
                    String unused2 = fb.fs = appSetIdInfo.getId();
                    int unused3 = fb.fb = 1;
                }
            });
        } catch (Throwable unused) {
            fb = 2;
        }
    }

    public static String fs() {
        if (fb != 0) {
            return zmn;
        }
        zmn();
        return zmn;
    }

    public static String zn() {
        if (fb != 0) {
            return fs;
        }
        zmn();
        return fs;
    }

    public static String fb() {
        if (TextUtils.isEmpty(zn)) {
            zn = kgc.zmn().getPackageManager().getInstallerPackageName(oub.hhw());
        }
        if (zn == null) {
            zn = "";
        }
        return zn;
    }
}
