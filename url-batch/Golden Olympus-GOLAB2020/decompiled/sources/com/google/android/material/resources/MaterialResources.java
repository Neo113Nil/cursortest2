package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.Z;
import f.AbstractC2415a;

/* loaded from: classes.dex */
public abstract class MaterialResources {
    public static ColorStateList getColorStateList(Context context, TypedArray typedArray, int i4) {
        int resourceId;
        ColorStateList a4;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0 || (a4 = AbstractC2415a.a(context, resourceId)) == null) ? typedArray.getColorStateList(i4) : a4;
    }

    public static int getDimensionPixelSize(Context context, TypedArray typedArray, int i4, int i5) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i4, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i4, i5);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i5);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable getDrawable(Context context, TypedArray typedArray, int i4) {
        int resourceId;
        Drawable b4;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0 || (b4 = AbstractC2415a.b(context, resourceId)) == null) ? typedArray.getDrawable(i4) : b4;
    }

    static int getIndexWithValue(TypedArray typedArray, int i4, int i5) {
        return typedArray.hasValue(i4) ? i4 : i5;
    }

    public static TextAppearance getTextAppearance(Context context, TypedArray typedArray, int i4) {
        int resourceId;
        if (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0) {
            return null;
        }
        return new TextAppearance(context, resourceId);
    }

    public static boolean isFontScaleAtLeast1_3(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean isFontScaleAtLeast2_0(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    public static ColorStateList getColorStateList(Context context, Z z4, int i4) {
        int n4;
        ColorStateList a4;
        return (!z4.s(i4) || (n4 = z4.n(i4, 0)) == 0 || (a4 = AbstractC2415a.a(context, n4)) == null) ? z4.c(i4) : a4;
    }
}
