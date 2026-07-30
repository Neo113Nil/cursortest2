package com.blankj.utilcode.util;

import android.app.Activity;
import com.blankj.utilcode.util.UtilsTransActivity;
import com.blankj.utilcode.util.z0;

/* loaded from: classes2.dex */
public class UtilsTransActivity4MainProcess extends UtilsTransActivity {
    public static void start(UtilsTransActivity.TransActivityDelegate transActivityDelegate) {
        UtilsTransActivity.start(null, null, transActivityDelegate, UtilsTransActivity4MainProcess.class);
    }

    public static void start(z0.b bVar, UtilsTransActivity.TransActivityDelegate transActivityDelegate) {
        UtilsTransActivity.start(null, bVar, transActivityDelegate, UtilsTransActivity4MainProcess.class);
    }

    public static void start(Activity activity, UtilsTransActivity.TransActivityDelegate transActivityDelegate) {
        UtilsTransActivity.start(activity, null, transActivityDelegate, UtilsTransActivity4MainProcess.class);
    }

    public static void start(Activity activity, z0.b bVar, UtilsTransActivity.TransActivityDelegate transActivityDelegate) {
        UtilsTransActivity.start(activity, bVar, transActivityDelegate, UtilsTransActivity4MainProcess.class);
    }
}
