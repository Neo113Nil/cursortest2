package com.bytedance.adsdk.ugeno.zmn;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* loaded from: classes6.dex */
public class zg implements nps {
    private float btk;
    private float fb;
    private float fs;
    private float hhw;
    private View zmn;
    private float zn;

    public zg(View view) {
        this.zmn = view;
    }

    public void zmn(float f) {
        View view = this.zmn;
        if (view == null) {
            return;
        }
        this.fs = f;
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setCornerRadius(f);
        }
    }

    public float zmn() {
        return this.fs;
    }

    public void fs(float f) {
        View view = this.zmn;
        if (view == null) {
            return;
        }
        this.zn = f;
        view.postInvalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.nps
    public float getRipple() {
        return this.zn;
    }

    public void zn(float f) {
        View view = this.zmn;
        if (view == null) {
            return;
        }
        this.fb = f;
        view.postInvalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.nps
    public float getShine() {
        return this.fb;
    }

    public void fb(float f) {
        this.btk = f;
        this.zmn.postInvalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.nps
    public float getStretch() {
        return this.btk;
    }

    public void btk(float f) {
        this.hhw = f;
        this.zmn.postInvalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.zmn.nps
    public float getRubIn() {
        return this.hhw;
    }

    public void zmn(int i) {
        View view = this.zmn;
        if (view == null) {
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i);
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background.mutate()).setColor(i);
        }
    }
}
