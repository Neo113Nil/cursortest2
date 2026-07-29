package com.facebook.ads.internal.q.a;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;

/* loaded from: classes.dex */
public class g {
    public static boolean a(int i, int i2) {
        return i >= 640 && i2 >= 640;
    }

    public static boolean a(Context context) {
        boolean z;
        try {
            ActivityManager.RunningTaskInfo runningTaskInfo = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(2).get(0);
            String str = runningTaskInfo.topActivity.getPackageName() + ".UnityPlayerActivity";
            if (runningTaskInfo.topActivity.getClassName() != str && !a(str)) {
                z = false;
                Boolean valueOf = Boolean.valueOf(z);
                Log.d("IS_UNITY", Boolean.toString(valueOf.booleanValue()));
                return valueOf.booleanValue();
            }
            z = true;
            Boolean valueOf2 = Boolean.valueOf(z);
            Log.d("IS_UNITY", Boolean.toString(valueOf2.booleanValue()));
            return valueOf2.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
