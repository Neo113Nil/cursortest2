package com.bytedance.adsdk.ugeno.yoga.fs;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.yoga.fs.zn;
import com.bytedance.adsdk.ugeno.yoga.iv;
import com.bytedance.adsdk.ugeno.yoga.nps;
import com.bytedance.adsdk.ugeno.yoga.rc;

/* loaded from: classes4.dex */
public class fs extends ViewGroup {
    public iv getYogaNode() {
        throw null;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof fs) {
            throw null;
        }
        iv zmn = rc.zmn();
        zn.zmn(new zn.zmn(layoutParams), zmn, view);
        zmn.zmn(view);
        zmn.zmn((nps) new zn.fs());
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw new RuntimeException("Attempting to layout a VirtualYogaLayout");
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new zn.zmn(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new zn.zmn(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof zn.zmn;
    }
}
