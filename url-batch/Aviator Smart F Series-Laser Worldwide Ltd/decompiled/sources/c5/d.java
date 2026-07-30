package c5;

import android.app.Activity;
import android.util.DisplayMetrics;

/* loaded from: classes4.dex */
public class d {
    public static DisplayMetrics getDisplayMetrics(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static int getScreenHeight(Activity activity) {
        return getDisplayMetrics(activity).heightPixels;
    }

    public static int getScreenWidth(Activity activity) {
        return getDisplayMetrics(activity).widthPixels;
    }
}
