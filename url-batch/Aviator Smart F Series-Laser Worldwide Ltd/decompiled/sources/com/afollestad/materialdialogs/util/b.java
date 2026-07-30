package com.afollestad.materialdialogs.util;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.ColorInt;

/* loaded from: classes.dex */
public class b {
    public static void applyColor(Drawable drawable, @ColorInt int i8) {
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(ColorStateList.valueOf(i8));
        }
    }
}
