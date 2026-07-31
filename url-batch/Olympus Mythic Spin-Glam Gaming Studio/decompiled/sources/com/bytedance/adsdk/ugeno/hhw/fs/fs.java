package com.bytedance.adsdk.ugeno.hhw.fs;

import android.view.View;
import com.bytedance.adsdk.ugeno.zg.zn;

/* loaded from: classes4.dex */
public class fs implements zn.btk {
    @Override // com.bytedance.adsdk.ugeno.zg.zn.btk
    public void zmn(View view, float f) {
        int width = view.getWidth();
        if (f >= -1.0f && f <= 1.0f) {
            if (f < 0.0f) {
                view.setTranslationX((-width) * f);
            } else {
                view.setTranslationX(width);
                view.setTranslationX((-width) * f);
            }
            view.setAlpha(Math.max(0.0f, 1.0f - Math.abs(f)));
            return;
        }
        view.setAlpha(0.0f);
    }
}
