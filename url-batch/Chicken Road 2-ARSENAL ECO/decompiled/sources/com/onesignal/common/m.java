package com.onesignal.common;

import a1.AbstractC0223a;
import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;

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
        kotlin.jvm.internal.i.d(decorView, "getDecorView(...)");
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

    public final int dpToPx(int i7) {
        return (int) (i7 * Resources.getSystem().getDisplayMetrics().density);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0040, code lost:
    
        r5 = r5.getWindowManager().getDefaultDisplay().getCutout();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] getCutoutAndStatusBarInsets(Activity activity) {
        float f7;
        float f8;
        DisplayCutout cutout;
        int safeInsetRight;
        int safeInsetLeft;
        kotlin.jvm.internal.i.e(activity, "activity");
        Rect windowVisibleDisplayFrame = getWindowVisibleDisplayFrame(activity);
        View findViewById = activity.getWindow().findViewById(R.id.content);
        float top = (windowVisibleDisplayFrame.top - findViewById.getTop()) / Resources.getSystem().getDisplayMetrics().density;
        float bottom = (findViewById.getBottom() - windowVisibleDisplayFrame.bottom) / Resources.getSystem().getDisplayMetrics().density;
        if (Build.VERSION.SDK_INT != 29 || cutout == null) {
            f7 = 0.0f;
            f8 = 0.0f;
        } else {
            safeInsetRight = cutout.getSafeInsetRight();
            f7 = safeInsetRight / Resources.getSystem().getDisplayMetrics().density;
            safeInsetLeft = cutout.getSafeInsetLeft();
            f8 = safeInsetLeft / Resources.getSystem().getDisplayMetrics().density;
        }
        return new int[]{AbstractC0223a.F(top), AbstractC0223a.F(bottom), AbstractC0223a.F(f7), AbstractC0223a.F(f8)};
    }

    public final int getFullbleedWindowWidth(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        View decorView = activity.getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView, "getDecorView(...)");
        return decorView.getWidth();
    }

    public final int getWindowHeight(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        return getWindowHeightAPI23Plus(activity);
    }

    public final int getWindowWidth(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        return getWindowVisibleDisplayFrame(activity).width();
    }
}
