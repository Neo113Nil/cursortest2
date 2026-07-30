package com.blankj.utilcode.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class u0 {

    static class a implements Runnable {
        final /* synthetic */ b val$listener;
        final /* synthetic */ View val$view;

        a(b bVar, View view) {
            this.val$view = view;
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public interface b {
    }

    private u0() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static float applyDimension(float f8, int i8) {
        float f9;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        if (i8 == 0) {
            return f8;
        }
        if (i8 == 1) {
            f9 = displayMetrics.density;
        } else if (i8 == 2) {
            f9 = displayMetrics.scaledDensity;
        } else if (i8 == 3) {
            f8 *= displayMetrics.xdpi;
            f9 = 0.013888889f;
        } else if (i8 == 4) {
            f9 = displayMetrics.xdpi;
        } else {
            if (i8 != 5) {
                return 0.0f;
            }
            f8 *= displayMetrics.xdpi;
            f9 = 0.03937008f;
        }
        return f8 * f9;
    }

    public static int dp2px(float f8) {
        return (int) ((f8 * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static void forceGetViewSize(View view, b bVar) {
        view.post(new a(bVar, view));
    }

    public static int getMeasuredHeight(View view) {
        return measureView(view)[1];
    }

    public static int getMeasuredWidth(View view) {
        return measureView(view)[0];
    }

    public static int[] measureView(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i8 = layoutParams.height;
        view.measure(childMeasureSpec, i8 > 0 ? View.MeasureSpec.makeMeasureSpec(i8, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
        return new int[]{view.getMeasuredWidth(), view.getMeasuredHeight()};
    }

    public static int px2dp(float f8) {
        return (int) ((f8 / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static int px2sp(float f8) {
        return (int) ((f8 / Resources.getSystem().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static int sp2px(float f8) {
        return (int) ((f8 * Resources.getSystem().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
