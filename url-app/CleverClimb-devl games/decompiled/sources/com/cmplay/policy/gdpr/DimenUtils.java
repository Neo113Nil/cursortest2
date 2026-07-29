package com.cmplay.policy.gdpr;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
public class DimenUtils {
    public static final float BASE_SCREEN_DENSITY = 2.0f;
    public static final float BASE_SCREEN_HEIGHT = 1280.0f;
    public static final float BASE_SCREEN_WIDH = 720.0f;
    public static final int DENSITY_HIGH = 240;
    public static final int DENSITY_LOW = 120;
    public static final int DENSITY_MEDIUM = 160;
    public static final int DENSITY_XHIGH = 320;
    private static final int DP_SCALE_H = 9;
    private static final int DP_TO_PX = 1;
    private static final int DP_TO_PX_SCALE_H = 8;
    private static final int DP_TO_PX_SCALE_W = 10;
    private static final int PX_TO_DP = 6;
    private static final int PX_TO_SP = 7;
    private static final int SP_TO_PX = 2;
    public static Float sScaleH;
    public static Float sScaleW;

    private static float applyDimension(Context context, int i, float f, DisplayMetrics displayMetrics) {
        switch (i) {
            case 1:
            case 2:
                return TypedValue.applyDimension(i, f, displayMetrics);
            case 3:
            case 4:
            case 5:
            default:
                return 0.0f;
            case 6:
                return f / displayMetrics.density;
            case 7:
                return f / displayMetrics.scaledDensity;
            case 8:
                return TypedValue.applyDimension(1, f * getScaleFactorH(context), displayMetrics);
            case 9:
                return f * getScaleFactorH(context);
            case 10:
                return TypedValue.applyDimension(1, f * getScaleFactorW(context), displayMetrics);
        }
    }

    public static int dp2px(Context context, float f) {
        return (int) applyDimension(context, 1, f, context.getResources().getDisplayMetrics());
    }

    public static int sp2px(Context context, float f) {
        return (int) applyDimension(context, 2, f, context.getResources().getDisplayMetrics());
    }

    public static int px2dp(Context context, float f) {
        return (int) applyDimension(context, 6, f, context.getResources().getDisplayMetrics());
    }

    public static int px2sp(Context context, float f) {
        return (int) applyDimension(context, 7, f, context.getResources().getDisplayMetrics());
    }

    public static int dp2pxScaleW(Context context, float f) {
        return (int) applyDimension(context, 10, f, context.getResources().getDisplayMetrics());
    }

    public static int dp2pxScaleH(Context context, float f) {
        return (int) applyDimension(context, 8, f, context.getResources().getDisplayMetrics());
    }

    public static int dpScaleH(Context context, float f) {
        return (int) applyDimension(context, 9, f, context.getResources().getDisplayMetrics());
    }

    public static float getScaleFactorW(Context context) {
        if (sScaleW == null) {
            sScaleW = Float.valueOf((getScreenWidth(context) * 2.0f) / (getDensity(context) * 720.0f));
        }
        return sScaleW.floatValue();
    }

    public static float getScaleFactorH(Context context) {
        if (sScaleH == null) {
            sScaleH = Float.valueOf((getScreenHeight(context) * 2.0f) / (getDensity(context) * 1280.0f));
        }
        return sScaleH.floatValue();
    }

    public static int getScreenWidth(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int getScreenHeight(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static float getDensity(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static void updateLayout(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return;
        }
        if (i != -3) {
            layoutParams.width = i;
        }
        if (i2 != -3) {
            layoutParams.height = i2;
        }
        view.setLayoutParams(layoutParams);
    }

    public static void updateLayoutMargin(View view, int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            updateMargin(view, (RelativeLayout.LayoutParams) layoutParams, i, i2, i3, i4);
        } else if (layoutParams instanceof LinearLayout.LayoutParams) {
            updateMargin(view, (LinearLayout.LayoutParams) layoutParams, i, i2, i3, i4);
        } else if (layoutParams instanceof FrameLayout.LayoutParams) {
            updateMargin(view, (FrameLayout.LayoutParams) layoutParams, i, i2, i3, i4);
        }
    }

    private static void updateMargin(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        if (view == null) {
            return;
        }
        if (i != -3) {
            marginLayoutParams.leftMargin = i;
        }
        if (i2 != -3) {
            marginLayoutParams.topMargin = i2;
        }
        if (i3 != -3) {
            marginLayoutParams.rightMargin = i3;
        }
        if (i4 != -3) {
            marginLayoutParams.bottomMargin = i4;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    public static void createListviewLayout(View view, int i, int i2) {
        if (view != null && ((AbsListView.LayoutParams) view.getLayoutParams()) == null) {
            if (i == -3) {
                i = -1;
            }
            if (i2 == -3) {
                i2 = -1;
            }
            view.setLayoutParams(new AbsListView.LayoutParams(i, i2));
        }
    }

    public static void disappearLayout(View view) {
        updateLayoutMargin(view, 0, 0, 0, 0);
        updateLayout(view, 0, 0);
    }

    public static int getWindowWidth(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int getWindowHeight(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static String getRatio(Context context) {
        return String.format("%s*%s", Integer.valueOf(context.getResources().getDisplayMetrics().widthPixels), Integer.valueOf(context.getResources().getDisplayMetrics().heightPixels));
    }

    public static boolean isSmallSize(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels * context.getResources().getDisplayMetrics().heightPixels <= 384000;
    }
}
