package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes5.dex */
public class ev extends hhw implements com.bytedance.sdk.component.adexpress.dynamic.btk {
    FrameLayout fs;
    boolean iqz;
    TextView zmn;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk
    public boolean btk() {
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public ev(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        super(context, dynamicRootView, zgVar);
        this.iqz = false;
        View view = new View(context);
        this.cn = view;
        view.setTag(Integer.valueOf(getClickArea()));
        this.zmn = new TextView(context);
        this.fs = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(context, 40.0f), (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(context, 15.0f));
        layoutParams.gravity = 8388693;
        layoutParams.rightMargin = 20;
        layoutParams.bottomMargin = 20;
        this.zmn.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(25.0f);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.zmn.setBackground(gradientDrawable);
        this.zmn.setTextSize(10.0f);
        this.zmn.setGravity(17);
        this.zmn.setTextColor(-1);
        this.zmn.setVisibility(8);
        if (com.bytedance.sdk.component.adexpress.fb.fs()) {
            addView(this.fs, new FrameLayout.LayoutParams(-1, -1));
        }
        addView(this.zmn);
        addView(this.cn, getWidgetLayoutParams());
        if (!com.bytedance.sdk.component.adexpress.fb.fs()) {
            addView(this.fs, getWidgetLayoutParams());
        }
        dynamicRootView.videoView = this.fs;
        dynamicRootView.setVideoListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tf
    public boolean bvs() {
        super.bvs();
        double d = 0.0d;
        double d2 = 0.0d;
        for (com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar = this.mw; zgVar != null; zgVar = zgVar.klz()) {
            d2 = (d2 + zgVar.hhw()) - zgVar.fb();
            d = (d + zgVar.nps()) - zgVar.btk();
        }
        try {
            float f = (float) d2;
            int zmn = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(getContext(), f);
            int zmn2 = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(getContext(), f + this.btk);
            if (com.bytedance.sdk.component.adexpress.fb.fs.zmn(getContext())) {
                int dynamicWidth = ((kgc) this.rt.getChildAt(0)).getDynamicWidth();
                int i = dynamicWidth - zmn2;
                zmn2 = dynamicWidth - zmn;
                zmn = i;
            }
            if (!"open_ad".equals(this.rt.getRenderRequest().fb())) {
                float f2 = (float) d;
                ((kgc) this.rt.getChildAt(0)).zmn.zmn(zmn, (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(getContext(), f2), zmn2, (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(getContext(), f2 + this.hhw));
            } else {
                this.rt.videoView = this.fs;
            }
        } catch (Exception unused) {
        }
        this.rt.updateRenderInfoForVideo(d2, d, this.btk, this.hhw, this.klz.cn());
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.btk
    public void setTimeUpdate(int i) {
        if (this.mw.iv().btk().lwz() && i > 0 && !this.iqz) {
            String str = (i >= 60 ? "0" + (i / 60) : "00") + ":";
            int i2 = i % 60;
            this.zmn.setText(i2 > 9 ? str + i2 : str + "0" + i2);
            this.zmn.setVisibility(0);
            return;
        }
        this.iqz = true;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            zn(getChildAt(i3));
        }
        this.zmn.setVisibility(8);
    }

    private void zn(View view) {
        if (view == this.zmn || view == ((hhw) this).kw) {
            return;
        }
        try {
            if (((Integer) view.getTag(com.bytedance.sdk.component.adexpress.dynamic.zmn.hhw)).intValue() == 1) {
                return;
            }
        } catch (Throwable unused) {
        }
        int i = 0;
        view.setVisibility(0);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                return;
            }
            zn(viewGroup.getChildAt(i));
            i++;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.btk
    public void zmn() {
        this.zmn.setVisibility(8);
    }
}
