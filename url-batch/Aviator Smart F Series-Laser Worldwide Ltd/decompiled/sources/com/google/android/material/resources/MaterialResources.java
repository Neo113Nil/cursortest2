package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class MaterialResources {
    private static final float FONT_SCALE_1_3 = 1.3f;
    private static final float FONT_SCALE_2_0 = 2.0f;

    private MaterialResources() {
    }

    @Nullable
    public static ColorStateList getColorStateList(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i8) {
        int resourceId;
        ColorStateList colorStateList;
        return (!typedArray.hasValue(i8) || (resourceId = typedArray.getResourceId(i8, 0)) == 0 || (colorStateList = AppCompatResources.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i8) : colorStateList;
    }

    private static int getComplexUnit(TypedValue typedValue) {
        int complexUnit;
        if (Build.VERSION.SDK_INT < 22) {
            return typedValue.data & 15;
        }
        complexUnit = typedValue.getComplexUnit();
        return complexUnit;
    }

    public static int getDimensionPixelSize(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i8, int i9) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i8, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i8, i9);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i9);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    @Nullable
    public static Drawable getDrawable(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i8) {
        int resourceId;
        Drawable drawable;
        return (!typedArray.hasValue(i8) || (resourceId = typedArray.getResourceId(i8, 0)) == 0 || (drawable = AppCompatResources.getDrawable(context, resourceId)) == null) ? typedArray.getDrawable(i8) : drawable;
    }

    public static float getFontScale(@NonNull Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    @StyleableRes
    static int getIndexWithValue(@NonNull TypedArray typedArray, @StyleableRes int i8, @StyleableRes int i9) {
        return typedArray.hasValue(i8) ? i8 : i9;
    }

    @Nullable
    public static TextAppearance getTextAppearance(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i8) {
        int resourceId;
        if (!typedArray.hasValue(i8) || (resourceId = typedArray.getResourceId(i8, 0)) == 0) {
            return null;
        }
        return new TextAppearance(context, resourceId);
    }

    public static int getUnscaledLineHeight(@NonNull Context context, @StyleRes int i8, int i9) {
        if (i8 == 0) {
            return i9;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i8, R.styleable.MaterialTextAppearance);
        TypedValue typedValue = new TypedValue();
        boolean value = obtainStyledAttributes.getValue(R.styleable.MaterialTextAppearance_lineHeight, typedValue);
        if (!value) {
            value = obtainStyledAttributes.getValue(R.styleable.MaterialTextAppearance_android_lineHeight, typedValue);
        }
        obtainStyledAttributes.recycle();
        return !value ? i9 : getComplexUnit(typedValue) == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
    }

    public static int getUnscaledTextSize(@NonNull Context context, @StyleRes int i8, int i9) {
        if (i8 == 0) {
            return i9;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i8, androidx.appcompat.R.styleable.TextAppearance);
        TypedValue typedValue = new TypedValue();
        boolean value = obtainStyledAttributes.getValue(androidx.appcompat.R.styleable.TextAppearance_android_textSize, typedValue);
        obtainStyledAttributes.recycle();
        return !value ? i9 : getComplexUnit(typedValue) == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
    }

    public static boolean isFontScaleAtLeast1_3(@NonNull Context context) {
        return context.getResources().getConfiguration().fontScale >= FONT_SCALE_1_3;
    }

    public static boolean isFontScaleAtLeast2_0(@NonNull Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    @Nullable
    public static ColorStateList getColorStateList(@NonNull Context context, @NonNull TintTypedArray tintTypedArray, @StyleableRes int i8) {
        int resourceId;
        ColorStateList colorStateList;
        return (!tintTypedArray.hasValue(i8) || (resourceId = tintTypedArray.getResourceId(i8, 0)) == 0 || (colorStateList = AppCompatResources.getColorStateList(context, resourceId)) == null) ? tintTypedArray.getColorStateList(i8) : colorStateList;
    }
}
