package com.bytedance.adsdk.ugeno.hhw.zmn;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* loaded from: classes13.dex */
public class fs extends zmn {
    public fs(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.hhw.zmn.zmn
    public Drawable fs(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }
}
