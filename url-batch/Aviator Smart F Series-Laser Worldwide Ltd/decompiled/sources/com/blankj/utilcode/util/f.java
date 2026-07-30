package com.blankj.utilcode.util;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.provider.Settings;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.baidu.ar.constants.HttpConstants;

/* loaded from: classes2.dex */
public final class f {
    private static final int KEY_OFFSET = -123;
    private static final String TAG_OFFSET = "TAG_OFFSET";
    private static final String TAG_STATUS_BAR = "TAG_STATUS_BAR";

    private f() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void addMarginTopEqualStatusBarHeight(@NonNull View view) {
        view.setTag(TAG_OFFSET);
        Object tag = view.getTag(KEY_OFFSET);
        if (tag == null || !((Boolean) tag).booleanValue()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin + getStatusBarHeight(), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            view.setTag(KEY_OFFSET, Boolean.TRUE);
        }
    }

    private static View applyStatusBarColor(@NonNull Activity activity, int i8, boolean z7) {
        return applyStatusBarColor(activity.getWindow(), i8, z7);
    }

    private static View createStatusBarView(@NonNull Context context, int i8) {
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, getStatusBarHeight()));
        view.setBackgroundColor(i8);
        view.setTag(TAG_STATUS_BAR);
        return view;
    }

    public static int getActionBarHeight() {
        TypedValue typedValue = new TypedValue();
        if (z0.getApp().getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            return TypedValue.complexToDimensionPixelSize(typedValue.data, z0.getApp().getResources().getDisplayMetrics());
        }
        return 0;
    }

    @RequiresApi(21)
    public static int getNavBarColor(@NonNull Activity activity) {
        return getNavBarColor(activity.getWindow());
    }

    public static int getNavBarHeight() {
        Resources resources = z0.getApp().getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", HttpConstants.OS_TYPE_VALUE);
        if (identifier != 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private static String getResNameById(int i8) {
        try {
            return z0.getApp().getResources().getResourceEntryName(i8);
        } catch (Exception unused) {
            return "";
        }
    }

    public static int getStatusBarHeight() {
        Resources resources = z0.getApp().getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", HttpConstants.OS_TYPE_VALUE));
    }

    private static void hideStatusBarView(@NonNull Activity activity) {
        hideStatusBarView(activity.getWindow());
    }

    private static void invokePanels(String str) {
        try {
            Class.forName("android.app.StatusBarManager").getMethod(str, new Class[0]).invoke(z0.getApp().getSystemService("statusbar"), new Object[0]);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public static boolean isNavBarLightMode(@NonNull Activity activity) {
        return isNavBarLightMode(activity.getWindow());
    }

    public static boolean isNavBarVisible(@NonNull Activity activity) {
        return isNavBarVisible(activity.getWindow());
    }

    public static boolean isStatusBarLightMode(@NonNull Activity activity) {
        return isStatusBarLightMode(activity.getWindow());
    }

    public static boolean isStatusBarVisible(@NonNull Activity activity) {
        return (activity.getWindow().getAttributes().flags & 1024) == 0;
    }

    public static boolean isSupportNavBar() {
        WindowManager windowManager = (WindowManager) z0.getApp().getSystemService("window");
        if (windowManager == null) {
            return false;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        Point point2 = new Point();
        defaultDisplay.getSize(point);
        defaultDisplay.getRealSize(point2);
        return (point2.y == point.y && point2.x == point.x) ? false : true;
    }

    @RequiresApi(21)
    public static void setNavBarColor(@NonNull Activity activity, @ColorInt int i8) {
        setNavBarColor(activity.getWindow(), i8);
    }

    public static void setNavBarLightMode(@NonNull Activity activity, boolean z7) {
        setNavBarLightMode(activity.getWindow(), z7);
    }

    public static void setNavBarVisibility(@NonNull Activity activity, boolean z7) {
        setNavBarVisibility(activity.getWindow(), z7);
    }

    @RequiresPermission("android.permission.EXPAND_STATUS_BAR")
    public static void setNotificationBarVisibility(boolean z7) {
        invokePanels(z7 ? "expandNotificationsPanel" : "collapsePanels");
    }

    public static View setStatusBarColor(@NonNull Activity activity, @ColorInt int i8) {
        return setStatusBarColor(activity, i8, false);
    }

    public static void setStatusBarColor4Drawer(@NonNull DrawerLayout drawerLayout, @NonNull View view, @ColorInt int i8) {
        setStatusBarColor4Drawer(drawerLayout, view, i8, false);
    }

    public static void setStatusBarCustom(@NonNull View view) {
        Activity activityByContext = c1.getActivityByContext(view.getContext());
        if (activityByContext == null) {
            return;
        }
        transparentStatusBar(activityByContext);
        view.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, getStatusBarHeight()));
        } else {
            layoutParams.width = -1;
            layoutParams.height = getStatusBarHeight();
        }
    }

    public static void setStatusBarLightMode(@NonNull Activity activity, boolean z7) {
        setStatusBarLightMode(activity.getWindow(), z7);
    }

    public static void setStatusBarVisibility(@NonNull Activity activity, boolean z7) {
        setStatusBarVisibility(activity.getWindow(), z7);
    }

    private static void showStatusBarView(@NonNull Window window) {
        View findViewWithTag = ((ViewGroup) window.getDecorView()).findViewWithTag(TAG_STATUS_BAR);
        if (findViewWithTag == null) {
            return;
        }
        findViewWithTag.setVisibility(0);
    }

    public static void subtractMarginTopEqualStatusBarHeight(@NonNull View view) {
        Object tag = view.getTag(KEY_OFFSET);
        if (tag == null || !((Boolean) tag).booleanValue()) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin - getStatusBarHeight(), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        view.setTag(KEY_OFFSET, Boolean.FALSE);
    }

    public static void transparentStatusBar(@NonNull Activity activity) {
        transparentStatusBar(activity.getWindow());
    }

    private static View applyStatusBarColor(@NonNull Window window, int i8, boolean z7) {
        ViewGroup viewGroup = z7 ? (ViewGroup) window.getDecorView() : (ViewGroup) window.findViewById(R.id.content);
        View findViewWithTag = viewGroup.findViewWithTag(TAG_STATUS_BAR);
        if (findViewWithTag == null) {
            View createStatusBarView = createStatusBarView(window.getContext(), i8);
            viewGroup.addView(createStatusBarView);
            return createStatusBarView;
        }
        if (findViewWithTag.getVisibility() == 8) {
            findViewWithTag.setVisibility(0);
        }
        findViewWithTag.setBackgroundColor(i8);
        return findViewWithTag;
    }

    @RequiresApi(21)
    public static int getNavBarColor(@NonNull Window window) {
        return window.getNavigationBarColor();
    }

    private static void hideStatusBarView(@NonNull Window window) {
        View findViewWithTag = ((ViewGroup) window.getDecorView()).findViewWithTag(TAG_STATUS_BAR);
        if (findViewWithTag == null) {
            return;
        }
        findViewWithTag.setVisibility(8);
    }

    public static boolean isNavBarLightMode(@NonNull Window window) {
        return Build.VERSION.SDK_INT >= 26 && (window.getDecorView().getSystemUiVisibility() & 16) != 0;
    }

    public static boolean isNavBarVisible(@NonNull Window window) {
        boolean z7;
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        int childCount = viewGroup.getChildCount();
        int i8 = 0;
        while (true) {
            if (i8 >= childCount) {
                z7 = false;
                break;
            }
            View childAt = viewGroup.getChildAt(i8);
            int id = childAt.getId();
            if (id != -1 && "navigationBarBackground".equals(getResNameById(id)) && childAt.getVisibility() == 0) {
                z7 = true;
                break;
            }
            i8++;
        }
        if (!z7) {
            return z7;
        }
        if (c1.isSamsung() && Build.VERSION.SDK_INT < 29) {
            try {
                return Settings.Global.getInt(z0.getApp().getContentResolver(), "navigationbar_hide_bar_enabled") == 0;
            } catch (Exception unused) {
            }
        }
        return (viewGroup.getSystemUiVisibility() & 2) == 0;
    }

    public static boolean isStatusBarLightMode(@NonNull Window window) {
        return Build.VERSION.SDK_INT >= 23 && (window.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    @RequiresApi(21)
    public static void setNavBarColor(@NonNull Window window, @ColorInt int i8) {
        window.addFlags(Integer.MIN_VALUE);
        window.setNavigationBarColor(i8);
    }

    public static void setNavBarLightMode(@NonNull Window window, boolean z7) {
        if (Build.VERSION.SDK_INT >= 26) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z7 ? systemUiVisibility | 16 : systemUiVisibility & (-17));
        }
    }

    public static void setNavBarVisibility(@NonNull Window window, boolean z7) {
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = viewGroup.getChildAt(i8);
            int id = childAt.getId();
            if (id != -1 && "navigationBarBackground".equals(getResNameById(id))) {
                childAt.setVisibility(z7 ? 0 : 4);
            }
        }
        if (z7) {
            viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() & (-4611));
        } else {
            viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() | 4610);
        }
    }

    public static View setStatusBarColor(@NonNull Activity activity, @ColorInt int i8, boolean z7) {
        transparentStatusBar(activity);
        return applyStatusBarColor(activity, i8, z7);
    }

    public static void setStatusBarColor4Drawer(@NonNull DrawerLayout drawerLayout, @NonNull View view, @ColorInt int i8, boolean z7) {
        Activity activityByContext = c1.getActivityByContext(view.getContext());
        if (activityByContext == null) {
            return;
        }
        transparentStatusBar(activityByContext);
        drawerLayout.setFitsSystemWindows(false);
        setStatusBarColor(view, i8);
        int childCount = drawerLayout.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            drawerLayout.getChildAt(i9).setFitsSystemWindows(false);
        }
        if (z7) {
            hideStatusBarView(activityByContext);
        } else {
            setStatusBarColor(activityByContext, i8, false);
        }
    }

    public static void setStatusBarLightMode(@NonNull Window window, boolean z7) {
        if (Build.VERSION.SDK_INT >= 23) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z7 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
    }

    public static void setStatusBarVisibility(@NonNull Window window, boolean z7) {
        if (z7) {
            window.clearFlags(1024);
            showStatusBarView(window);
            addMarginTopEqualStatusBarHeight(window);
        } else {
            window.addFlags(1024);
            hideStatusBarView(window);
            subtractMarginTopEqualStatusBarHeight(window);
        }
    }

    public static void transparentStatusBar(@NonNull Window window) {
        window.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1280);
        window.setStatusBarColor(0);
    }

    public static View setStatusBarColor(@NonNull Window window, @ColorInt int i8) {
        return setStatusBarColor(window, i8, false);
    }

    public static View setStatusBarColor(@NonNull Window window, @ColorInt int i8, boolean z7) {
        transparentStatusBar(window);
        return applyStatusBarColor(window, i8, z7);
    }

    public static void setStatusBarColor(@NonNull View view, @ColorInt int i8) {
        Activity activityByContext = c1.getActivityByContext(view.getContext());
        if (activityByContext == null) {
            return;
        }
        transparentStatusBar(activityByContext);
        view.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = getStatusBarHeight();
        view.setBackgroundColor(i8);
    }

    private static void subtractMarginTopEqualStatusBarHeight(@NonNull Window window) {
        View findViewWithTag = window.getDecorView().findViewWithTag(TAG_OFFSET);
        if (findViewWithTag == null) {
            return;
        }
        subtractMarginTopEqualStatusBarHeight(findViewWithTag);
    }

    private static void addMarginTopEqualStatusBarHeight(@NonNull Window window) {
        View findViewWithTag = window.getDecorView().findViewWithTag(TAG_OFFSET);
        if (findViewWithTag == null) {
            return;
        }
        addMarginTopEqualStatusBarHeight(findViewWithTag);
    }
}
