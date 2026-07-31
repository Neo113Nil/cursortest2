package com.bytedance.adsdk.ugeno.hhw.fs;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.adsdk.ugeno.zg.zn;

/* loaded from: classes4.dex */
public class fb implements zn.btk {
    private String zmn;

    public void zmn(String str) {
        this.zmn = str;
    }

    @Override // com.bytedance.adsdk.ugeno.zg.zn.btk
    public void zmn(View view, float f) {
        if (f >= -1.0f && f <= 1.0f) {
            view.setAlpha(1.0f);
            view.setTranslationX(view.getWidth() * (-f));
            view.setTranslationY(view.getHeight() * f);
        } else {
            view.setAlpha(0.0f);
        }
        if (TextUtils.equals(this.zmn, "cube")) {
            float height = f < 0.0f ? view.getHeight() : 0.0f;
            view.setPivotX(view.getWidth() * 0.5f);
            view.setPivotY(height);
            view.setRotationX(f * (-90.0f));
        }
    }
}
