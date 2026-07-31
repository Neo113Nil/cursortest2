package com.bytedance.adsdk.ugeno.hhw.fs;

import android.view.View;
import com.bytedance.adsdk.ugeno.zg.zn;

/* loaded from: classes3.dex */
public class zn implements zn.btk {
    final float zmn = 0.8f;
    final float fs = 0.5f;

    @Override // com.bytedance.adsdk.ugeno.zg.zn.btk
    public void zmn(View view, float f) {
        float f2 = ((f < 0.0f ? 0.19999999f : -0.19999999f) * f) + 1.0f;
        float f3 = (f * (f < 0.0f ? 0.5f : -0.5f)) + 1.0f;
        if (f < 0.0f) {
            view.setPivotX(view.getWidth());
            view.setPivotY(view.getHeight() / 2);
        } else {
            view.setPivotX(0.0f);
            view.setPivotY(view.getHeight() / 2);
        }
        view.setScaleX(f2);
        view.setScaleY(f2);
        view.setAlpha(Math.abs(f3));
    }
}
