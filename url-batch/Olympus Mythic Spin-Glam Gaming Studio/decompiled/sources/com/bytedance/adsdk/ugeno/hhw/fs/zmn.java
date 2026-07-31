package com.bytedance.adsdk.ugeno.hhw.fs;

import android.view.View;
import com.bytedance.adsdk.ugeno.zg.zn;

/* loaded from: classes4.dex */
public class zmn implements zn.btk {
    @Override // com.bytedance.adsdk.ugeno.zg.zn.btk
    public void zmn(View view, float f) {
        view.setPivotX(f < 0.0f ? view.getWidth() : 0.0f);
        view.setPivotY(view.getHeight() * 0.5f);
        view.setRotationY(f * 90.0f);
    }
}
