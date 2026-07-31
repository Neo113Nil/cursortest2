package com.bytedance.adsdk.ugeno.hhw.zmn;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* loaded from: classes6.dex */
public class zn extends zmn {
    public zn(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.hhw.zmn.zmn
    public Drawable fs(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }
}
