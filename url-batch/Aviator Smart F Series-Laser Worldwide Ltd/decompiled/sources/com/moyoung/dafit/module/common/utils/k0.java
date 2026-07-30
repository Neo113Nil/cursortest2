package com.moyoung.dafit.module.common.utils;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.platform.comapi.bmsdk.BmLocated;
import com.google.android.exoplayer2.C;
import com.moyoung.dafit.module.common.R$color;
import com.moyoung.dafit.module.common.R$id;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class k0 {
    public static final int DEFAULT_STATUS_BAR_ALPHA = 112;
    private static final int FAKE_STATUS_BAR_VIEW_ID = R$id.statusbarutil_fake_status_bar_view;
    private static final int FAKE_TRANSLUCENT_VIEW_ID = R$id.statusbarutil_translucent_view;
    private static final int TAG_KEY_HAVE_SET_OFFSET = -123;

    private static void addTranslucentView(Activity activity, @IntRange(from = 0, to = 255) int i8) {
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        View findViewById = viewGroup.findViewById(FAKE_TRANSLUCENT_VIEW_ID);
        if (findViewById == null) {
            viewGroup.addView(createTranslucentStatusBarView(activity, i8));
            return;
        }
        if (findViewById.getVisibility() == 8) {
            findViewById.setVisibility(0);
        }
        findViewById.setBackgroundColor(Color.argb(i8, 0, 0, 0));
    }

    private static int calculateStatusColor(@ColorInt int i8, int i9) {
        if (i9 == 0) {
            return i8;
        }
        float f8 = 1.0f - (i9 / 255.0f);
        return ((int) (((i8 & 255) * f8) + 0.5d)) | (((int) ((((i8 >> 16) & 255) * f8) + 0.5d)) << 16) | (-16777216) | (((int) ((((i8 >> 8) & 255) * f8) + 0.5d)) << 8);
    }

    @TargetApi(19)
    private static void clearPreviousSetting(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        View findViewById = viewGroup.findViewById(FAKE_STATUS_BAR_VIEW_ID);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
            ((ViewGroup) ((ViewGroup) activity.findViewById(R.id.content)).getChildAt(0)).setPadding(0, 0, 0, 0);
        }
    }

    private static View createStatusBarView(Activity activity, @ColorInt int i8) {
        return createStatusBarView(activity, i8, 0);
    }

    private static View createTranslucentStatusBarView(Activity activity, int i8) {
        View view = new View(activity);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, getStatusBarHeight(activity)));
        view.setBackgroundColor(Color.argb(i8, 0, 0, 0));
        view.setId(FAKE_TRANSLUCENT_VIEW_ID);
        return view;
    }

    private static int getStatusBarHeight(Context context) {
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", HttpConstants.OS_TYPE_VALUE));
    }

    public static void hideFakeStatusBarView(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        View findViewById = viewGroup.findViewById(FAKE_STATUS_BAR_VIEW_ID);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        View findViewById2 = viewGroup.findViewById(FAKE_TRANSLUCENT_VIEW_ID);
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
    }

    public static void hideStatusBar(Window window) {
        WindowInsetsController insetsController;
        int statusBars;
        if (Build.VERSION.SDK_INT < 30) {
            window.addFlags(1024);
            return;
        }
        window.setDecorFitsSystemWindows(false);
        insetsController = window.getInsetsController();
        statusBars = WindowInsets.Type.statusBars();
        insetsController.hide(statusBars);
    }

    public static void setBgColor(Window window, @ColorInt int i8) {
        window.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(i8);
    }

    public static void setBgColorRes(Window window, @ColorRes int i8) {
        setBgColor(window, window.getContext().getResources().getColor(i8));
    }

    public static void setBgTransparent(Window window) {
        setBgColor(window, 0);
    }

    public static void setBlackTxt(Window window) {
        if (Build.VERSION.SDK_INT >= 23) {
            window.getDecorView().setSystemUiVisibility(BmLocated.HALF_RIGHT_TOP);
        }
    }

    public static void setColor(Activity activity, @ColorInt int i8) {
        setColor(activity, i8, 112);
    }

    @Deprecated
    public static void setColorDiff(Activity activity, @ColorInt int i8) {
        transparentStatusBar(activity);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        View findViewById = viewGroup.findViewById(FAKE_STATUS_BAR_VIEW_ID);
        if (findViewById != null) {
            if (findViewById.getVisibility() == 8) {
                findViewById.setVisibility(0);
            }
            findViewById.setBackgroundColor(i8);
        } else {
            viewGroup.addView(createStatusBarView(activity, i8));
        }
        setRootView(activity);
    }

    public static void setColorForDrawerLayout(Activity activity, DrawerLayout drawerLayout, @ColorInt int i8) {
        setColorForDrawerLayout(activity, drawerLayout, i8, 112);
    }

    @Deprecated
    public static void setColorForDrawerLayoutDiff(Activity activity, DrawerLayout drawerLayout, @ColorInt int i8) {
        activity.getWindow().addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        ViewGroup viewGroup = (ViewGroup) drawerLayout.getChildAt(0);
        View findViewById = viewGroup.findViewById(FAKE_STATUS_BAR_VIEW_ID);
        if (findViewById != null) {
            if (findViewById.getVisibility() == 8) {
                findViewById.setVisibility(0);
            }
            findViewById.setBackgroundColor(calculateStatusColor(i8, 112));
        } else {
            viewGroup.addView(createStatusBarView(activity, i8), 0);
        }
        if (!(viewGroup instanceof LinearLayout) && viewGroup.getChildAt(1) != null) {
            viewGroup.getChildAt(1).setPadding(0, getStatusBarHeight(activity), 0, 0);
        }
        setDrawerLayoutProperty(drawerLayout, viewGroup);
    }

    public static void setColorForSwipeBack(Activity activity, int i8) {
        setColorForSwipeBack(activity, i8, 112);
    }

    public static void setColorNoTranslucent(Activity activity, @ColorInt int i8) {
        setColor(activity, i8, 0);
    }

    public static void setColorNoTranslucentForDrawerLayout(Activity activity, DrawerLayout drawerLayout, @ColorInt int i8) {
        setColorForDrawerLayout(activity, drawerLayout, i8, 0);
    }

    public static void setColorTranslucent(Activity activity) {
        setColor(activity, ContextCompat.getColor(activity, R$color.translucent), 0);
    }

    public static void setDarkMode(Window window) {
        setBgColor(window, 0);
        setGrayTxt(window);
    }

    private static void setDrawerLayoutProperty(DrawerLayout drawerLayout, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) drawerLayout.getChildAt(1);
        drawerLayout.setFitsSystemWindows(false);
        viewGroup.setFitsSystemWindows(false);
        viewGroup.setClipToPadding(true);
        viewGroup2.setFitsSystemWindows(false);
    }

    public static void setGrayTxt(Window window) {
        window.getDecorView().setSystemUiVisibility(1280);
    }

    public static void setLightMode(Window window) {
        setBgColor(window, 0);
        setBlackTxt(window);
    }

    private static void setMIUIStatusBarDarkIcon(@NonNull Activity activity, boolean z7) {
        Class<?> cls = activity.getWindow().getClass();
        try {
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i8 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Class<?> cls3 = Integer.TYPE;
            Method method = cls.getMethod("setExtraFlags", cls3, cls3);
            Window window = activity.getWindow();
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(z7 ? i8 : 0);
            objArr[1] = Integer.valueOf(i8);
            method.invoke(window, objArr);
        } catch (Exception unused) {
        }
    }

    private static void setMeizuStatusBarDarkIcon(@NonNull Activity activity, boolean z7) {
        try {
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
            Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            int i8 = declaredField.getInt(null);
            int i9 = declaredField2.getInt(attributes);
            declaredField2.setInt(attributes, z7 ? i9 | i8 : (~i8) & i9);
            activity.getWindow().setAttributes(attributes);
        } catch (Exception unused) {
        }
    }

    private static void setRootView(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = viewGroup.getChildAt(i8);
            if (childAt instanceof ViewGroup) {
                childAt.setFitsSystemWindows(true);
                ((ViewGroup) childAt).setClipToPadding(true);
            }
        }
    }

    public static void setTranslucent(Activity activity) {
        setTranslucent(activity, 112);
    }

    @Deprecated
    public static void setTranslucentDiff(Activity activity) {
        activity.getWindow().addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        setRootView(activity);
    }

    public static void setTranslucentForCoordinatorLayout(Activity activity, @IntRange(from = 0, to = 255) int i8) {
        transparentStatusBar(activity);
        addTranslucentView(activity, i8);
    }

    public static void setTranslucentForDrawerLayout(Activity activity, DrawerLayout drawerLayout) {
        setTranslucentForDrawerLayout(activity, drawerLayout, 112);
    }

    @Deprecated
    public static void setTranslucentForDrawerLayoutDiff(Activity activity, DrawerLayout drawerLayout) {
        activity.getWindow().addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        ViewGroup viewGroup = (ViewGroup) drawerLayout.getChildAt(0);
        viewGroup.setFitsSystemWindows(true);
        viewGroup.setClipToPadding(true);
        ((ViewGroup) drawerLayout.getChildAt(1)).setFitsSystemWindows(false);
        drawerLayout.setFitsSystemWindows(false);
    }

    public static void setTranslucentForImageView(Activity activity, View view) {
        setTranslucentForImageView(activity, 112, view);
    }

    public static void setTranslucentForImageViewInFragment(Activity activity, View view) {
        setTranslucentForImageViewInFragment(activity, 112, view);
    }

    public static void setTransparent(Activity activity) {
        transparentStatusBar(activity);
        setRootView(activity);
    }

    public static void setTransparentForDrawerLayout(Activity activity, DrawerLayout drawerLayout) {
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        activity.getWindow().clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        activity.getWindow().setStatusBarColor(0);
        ViewGroup viewGroup = (ViewGroup) drawerLayout.getChildAt(0);
        if (!(viewGroup instanceof LinearLayout) && viewGroup.getChildAt(1) != null) {
            viewGroup.getChildAt(1).setPadding(0, getStatusBarHeight(activity), 0, 0);
        }
        setDrawerLayoutProperty(drawerLayout, viewGroup);
    }

    public static void setTransparentForImageView(Activity activity, View view) {
        setTranslucentForImageView(activity, 0, view);
    }

    public static void setTransparentForImageViewInFragment(Activity activity, View view) {
        setTranslucentForImageViewInFragment(activity, 0, view);
    }

    private static void setTransparentForWindow(Activity activity) {
        activity.getWindow().setStatusBarColor(0);
        activity.getWindow().getDecorView().setSystemUiVisibility(1280);
    }

    public static void showStatusBar(Window window) {
        WindowInsetsController insetsController;
        int statusBars;
        if (Build.VERSION.SDK_INT < 30) {
            window.clearFlags(1024);
            return;
        }
        window.setDecorFitsSystemWindows(true);
        insetsController = window.getInsetsController();
        statusBars = WindowInsets.Type.statusBars();
        insetsController.show(statusBars);
    }

    @TargetApi(19)
    private static void transparentStatusBar(Activity activity) {
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        activity.getWindow().clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        activity.getWindow().addFlags(C.BUFFER_FLAG_FIRST_SAMPLE);
        activity.getWindow().setStatusBarColor(0);
    }

    private static View createStatusBarView(Activity activity, @ColorInt int i8, int i9) {
        View view = new View(activity);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, getStatusBarHeight(activity)));
        view.setBackgroundColor(calculateStatusColor(i8, i9));
        view.setId(FAKE_STATUS_BAR_VIEW_ID);
        return view;
    }

    public static void setColor(Activity activity, @ColorInt int i8, @IntRange(from = 0, to = 255) int i9) {
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        activity.getWindow().clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        activity.getWindow().setStatusBarColor(calculateStatusColor(i8, i9));
    }

    public static void setColorForDrawerLayout(Activity activity, DrawerLayout drawerLayout, @ColorInt int i8, @IntRange(from = 0, to = 255) int i9) {
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        activity.getWindow().clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        activity.getWindow().setStatusBarColor(0);
        ViewGroup viewGroup = (ViewGroup) drawerLayout.getChildAt(0);
        View findViewById = viewGroup.findViewById(FAKE_STATUS_BAR_VIEW_ID);
        if (findViewById != null) {
            if (findViewById.getVisibility() == 8) {
                findViewById.setVisibility(0);
            }
            findViewById.setBackgroundColor(i8);
        } else {
            viewGroup.addView(createStatusBarView(activity, i8), 0);
        }
        if (!(viewGroup instanceof LinearLayout) && viewGroup.getChildAt(1) != null) {
            viewGroup.getChildAt(1).setPadding(viewGroup.getPaddingLeft(), getStatusBarHeight(activity) + viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
        }
        setDrawerLayoutProperty(drawerLayout, viewGroup);
        addTranslucentView(activity, i9);
    }

    public static void setColorForSwipeBack(Activity activity, @ColorInt int i8, @IntRange(from = 0, to = 255) int i9) {
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        View childAt = viewGroup.getChildAt(0);
        int statusBarHeight = getStatusBarHeight(activity);
        if (childAt == null || !(childAt instanceof CoordinatorLayout)) {
            viewGroup.setPadding(0, statusBarHeight, 0, 0);
            viewGroup.setBackgroundColor(calculateStatusColor(i8, i9));
        } else {
            ((CoordinatorLayout) childAt).setStatusBarBackgroundColor(calculateStatusColor(i8, i9));
        }
        setTransparentForWindow(activity);
    }

    public static void setTranslucent(Activity activity, @IntRange(from = 0, to = 255) int i8) {
        setTransparent(activity);
        addTranslucentView(activity, i8);
    }

    public static void setTranslucentForDrawerLayout(Activity activity, DrawerLayout drawerLayout, @IntRange(from = 0, to = 255) int i8) {
        setTransparentForDrawerLayout(activity, drawerLayout);
        addTranslucentView(activity, i8);
    }

    public static void setTranslucentForImageView(Activity activity, @IntRange(from = 0, to = 255) int i8, View view) {
        setTransparentForWindow(activity);
        addTranslucentView(activity, i8);
        if (view != null) {
            Object tag = view.getTag(TAG_KEY_HAVE_SET_OFFSET);
            if (tag == null || !((Boolean) tag).booleanValue()) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin + getStatusBarHeight(activity), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                view.setTag(TAG_KEY_HAVE_SET_OFFSET, Boolean.TRUE);
            }
        }
    }

    public static void setTranslucentForImageViewInFragment(Activity activity, @IntRange(from = 0, to = 255) int i8, View view) {
        setTranslucentForImageView(activity, i8, view);
    }

    @TargetApi(23)
    public static void setDarkMode(Activity activity) {
        setMIUIStatusBarDarkIcon(activity, false);
        setMeizuStatusBarDarkIcon(activity, false);
        if (Build.VERSION.SDK_INT >= 23) {
            activity.getWindow().getDecorView().setSystemUiVisibility(1024);
        }
    }

    @TargetApi(23)
    public static void setLightMode(Activity activity) {
        setMIUIStatusBarDarkIcon(activity, true);
        setMeizuStatusBarDarkIcon(activity, true);
        if (Build.VERSION.SDK_INT >= 23) {
            activity.getWindow().getDecorView().setSystemUiVisibility(BmLocated.HALF_RIGHT_TOP);
        }
    }
}
