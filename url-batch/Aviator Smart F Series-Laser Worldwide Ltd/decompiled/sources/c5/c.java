package c5;

import android.app.Activity;

/* loaded from: classes4.dex */
public class c {
    private static boolean isLandscapeScreen(Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        return rotation == 1 || rotation == 3;
    }

    public static void showFullscreenByOrientation(Activity activity) {
        showFullscreenByOrientation(activity, isLandscapeScreen(activity));
    }

    public static void showFullscreenByOrientation(Activity activity, boolean z7) {
        if (z7) {
            activity.getWindow().addFlags(1024);
        } else {
            activity.getWindow().clearFlags(1024);
        }
    }
}
