package com.bytedance.sdk.openadsdk.core.iv.zmn;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.utils.jy;

/* loaded from: classes4.dex */
public class zn implements com.bytedance.sdk.openadsdk.mw.zmn {
    private final View zmn;

    public zn(View view) {
        this.zmn = view;
    }

    @Override // com.bytedance.sdk.openadsdk.mw.zmn
    public int zmn() {
        View view = this.zmn;
        int measuredHeight = view != null ? view.getMeasuredHeight() : -1;
        return measuredHeight <= 0 ? jy.btk(kgc.zmn()) : measuredHeight;
    }

    @Override // com.bytedance.sdk.openadsdk.mw.zmn
    public int fs() {
        View view = this.zmn;
        int measuredWidth = view != null ? view.getMeasuredWidth() : -1;
        return measuredWidth <= 0 ? jy.zn(kgc.zmn()) : measuredWidth;
    }
}
