package com.yanzhenjie.recyclerview.widget;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.annotation.ColorInt;

/* loaded from: classes4.dex */
class a extends b {
    public a(int i8, int i9, int i10) {
        super(new ColorDrawable(opaqueColor(i8)), i9, i10);
    }

    @ColorInt
    public static int opaqueColor(@ColorInt int i8) {
        return Color.alpha(i8) == 0 ? i8 : Color.argb(255, Color.red(i8), Color.green(i8), Color.blue(i8));
    }
}
