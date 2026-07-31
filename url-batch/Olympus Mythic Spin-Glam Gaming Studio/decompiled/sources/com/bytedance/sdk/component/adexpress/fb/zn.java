package com.bytedance.sdk.component.adexpress.fb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* loaded from: classes6.dex */
public class zn {
    public static Drawable zmn(Context context, com.bytedance.sdk.component.adexpress.dynamic.fb.nps npsVar) {
        if (context == null || npsVar == null) {
            return null;
        }
        return zmn(context, (int) nps.zmn(context, npsVar.olo()), npsVar.cyb(), npsVar.zak());
    }

    public static Drawable zmn(Context context, int i, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        if (context != null) {
            gradientDrawable.setStroke(i, i2);
        }
        gradientDrawable.setColor(i3);
        return gradientDrawable;
    }
}
