package com.aiming.mdt;

import android.app.Activity;
import com.aiming.mdt.a.C0076;
import com.aiming.mdt.core.C0249;
import com.aiming.mdt.utils.C0282;

/* loaded from: classes.dex */
public class AdtAds {
    private AdtAds() {
    }

    public static void init(Activity activity, String str, Callback callback) {
        try {
            C0249.m865(activity, str, callback);
        } catch (Exception e) {
            C0282.m972("AdtAds init", e);
            C0076.m232().m236(e);
        }
    }

    public static boolean isInit() {
        return C0249.m861();
    }
}
