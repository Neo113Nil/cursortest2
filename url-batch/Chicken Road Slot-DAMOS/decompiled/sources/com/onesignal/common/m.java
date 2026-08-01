package com.onesignal.common;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m {
    public static final m INSTANCE = new m();

    private m() {
    }

    private final int getDisplaySizeY(Activity activity) {
        Point point = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(point);
        return point.y;
    }

    private final int getWindowHeightAPI23Plus(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        decorView.getClass();
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

    public final int dpToPx(int i3) {
        return (int) (i3 * Resources.getSystem().getDisplayMetrics().density);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x003e, code lost:
    
        r5 = r5.getWindowManager().getDefaultDisplay().getCutout();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] getCutoutAndStatusBarInsets(Activity activity) {
        float f3;
        float f10;
        DisplayCutout cutout;
        int safeInsetRight;
        int safeInsetLeft;
        activity.getClass();
        Rect windowVisibleDisplayFrame = getWindowVisibleDisplayFrame(activity);
        View findViewById = activity.getWindow().findViewById(R.id.content);
        float top = (windowVisibleDisplayFrame.top - findViewById.getTop()) / Resources.getSystem().getDisplayMetrics().density;
        float bottom = (findViewById.getBottom() - windowVisibleDisplayFrame.bottom) / Resources.getSystem().getDisplayMetrics().density;
        if (Build.VERSION.SDK_INT != 29 || cutout == null) {
            f3 = 0.0f;
            f10 = 0.0f;
        } else {
            safeInsetRight = cutout.getSafeInsetRight();
            f3 = safeInsetRight / Resources.getSystem().getDisplayMetrics().density;
            safeInsetLeft = cutout.getSafeInsetLeft();
            f10 = safeInsetLeft / Resources.getSystem().getDisplayMetrics().density;
        }
        return new int[]{yd.c.a(top), yd.c.a(bottom), yd.c.a(f3), yd.c.a(f10)};
    }

    public final int getFullbleedWindowWidth(Activity activity) {
        activity.getClass();
        View decorView = activity.getWindow().getDecorView();
        decorView.getClass();
        return decorView.getWidth();
    }

    public final int getWindowHeight(Activity activity) {
        activity.getClass();
        return getWindowHeightAPI23Plus(activity);
    }

    public final int getWindowWidth(Activity activity) {
        activity.getClass();
        return getWindowVisibleDisplayFrame(activity).width();
    }
}
