package com.applovin.mediation.unity;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.Looper;
import com.unity3d.player.UnityPlayer;

/* loaded from: classes9.dex */
public class Utils {
    static Activity getCurrentActivity() {
        return UnityPlayer.currentActivity;
    }

    static void runSafelyOnUiThread(Activity activity, final Runnable runnable) {
        activity.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.unity.Utils$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Utils.lambda$runSafelyOnUiThread$0(runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$runSafelyOnUiThread$0(Runnable runnable) {
        try {
            runnable.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    protected static boolean isCurrentProcessInForeground() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (Throwable unused) {
        }
        int i = runningAppProcessInfo.importance;
        return i == 100 || i == 200;
    }
}
