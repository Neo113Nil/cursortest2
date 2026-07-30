package me.zhanghai.android.materialprogressbar.internal;

import android.content.Context;
import android.content.res.TypedArray;

/* loaded from: classes5.dex */
public class ThemeUtils {
    private ThemeUtils() {
    }

    public static int getColorFromAttrRes(int i8, int i9, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i8});
        try {
            return obtainStyledAttributes.getColor(0, i9);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static float getFloatFromAttrRes(int i8, float f8, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i8});
        try {
            return obtainStyledAttributes.getFloat(0, f8);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
