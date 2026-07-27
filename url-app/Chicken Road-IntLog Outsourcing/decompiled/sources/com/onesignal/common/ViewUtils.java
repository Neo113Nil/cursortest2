package com.onesignal.common;

import B0.f;
import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class ViewUtils {
    public static final ViewUtils INSTANCE = new ViewUtils();

    private ViewUtils() {
    }

    private final int getDisplaySizeY(Activity activity) {
        Point point = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(point);
        return point.y;
    }

    private final int getWindowHeightAPI23Plus(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        i.d(decorView, "getDecorView(...)");
        WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
        return rootWindowInsets == null ? decorView.getHeight() : (decorView.getHeight() - rootWindowInsets.getStableInsetBottom()) - rootWindowInsets.getStableInsetTop();
    }

    private final int getWindowHeightLollipop(Activity activity) {
        return activity.getResources().getConfiguration().orientation == 2 ? getWindowVisibleDisplayFrame(activity).height() : getDisplaySizeY(activity);
    }

    private final Rect getWindowVisibleDisplayFrame(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    public final int dpToPx(int i2) {
        return (int) (i2 * Resources.getSystem().getDisplayMetrics().density);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0040, code lost:
    
        r5 = r5.getWindowManager().getDefaultDisplay().getCutout();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] getCutoutAndStatusBarInsets(Activity activity) {
        float f3;
        float f6;
        DisplayCutout cutout;
        int safeInsetRight;
        int safeInsetLeft;
        i.e(activity, "activity");
        Rect windowVisibleDisplayFrame = getWindowVisibleDisplayFrame(activity);
        View findViewById = activity.getWindow().findViewById(R.id.content);
        float top = (windowVisibleDisplayFrame.top - findViewById.getTop()) / Resources.getSystem().getDisplayMetrics().density;
        float bottom = (findViewById.getBottom() - windowVisibleDisplayFrame.bottom) / Resources.getSystem().getDisplayMetrics().density;
        if (Build.VERSION.SDK_INT != 29 || cutout == null) {
            f3 = 0.0f;
            f6 = 0.0f;
        } else {
            safeInsetRight = cutout.getSafeInsetRight();
            f3 = safeInsetRight / Resources.getSystem().getDisplayMetrics().density;
            safeInsetLeft = cutout.getSafeInsetLeft();
            f6 = safeInsetLeft / Resources.getSystem().getDisplayMetrics().density;
        }
        return new int[]{f.J(top), f.J(bottom), f.J(f3), f.J(f6)};
    }

    public final int getFullbleedWindowWidth(Activity activity) {
        i.e(activity, "activity");
        View decorView = activity.getWindow().getDecorView();
        i.d(decorView, "getDecorView(...)");
        return decorView.getWidth();
    }

    public final int getWindowHeight(Activity activity) {
        i.e(activity, "activity");
        return getWindowHeightAPI23Plus(activity);
    }

    public final int getWindowWidth(Activity activity) {
        i.e(activity, "activity");
        return getWindowVisibleDisplayFrame(activity).width();
    }
}
