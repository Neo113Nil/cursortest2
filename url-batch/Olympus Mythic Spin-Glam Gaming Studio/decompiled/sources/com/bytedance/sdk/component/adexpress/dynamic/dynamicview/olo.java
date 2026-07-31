package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes10.dex */
public class olo extends hhw {
    private TextView doe;
    private TextView fs;
    private TextView iqz;
    private LinearLayout nqi;
    private TextView phc;
    private TextView zmn;

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

    public olo(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        super(context, dynamicRootView, zgVar);
        this.zmn = new TextView(this.rc);
        this.fs = new TextView(this.rc);
        this.iqz = new TextView(this.rc);
        this.nqi = new LinearLayout(this.rc);
        this.phc = new TextView(this.rc);
        this.doe = new TextView(this.rc);
        this.zmn.setTag(9);
        this.fs.setTag(10);
        this.iqz.setTag(12);
        this.nqi.addView(this.iqz);
        this.nqi.addView(this.doe);
        this.nqi.addView(this.fs);
        this.nqi.addView(this.phc);
        this.nqi.addView(this.zmn);
        addView(this.nqi, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk
    protected boolean fb() {
        this.zmn.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.zmn.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.fs.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.fs.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.iqz.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.iqz.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.nps, this.zg);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tf
    public boolean bvs() {
        this.iqz.setText("Function");
        this.fs.setText("Permission list");
        this.phc.setText(" | ");
        this.doe.setText(" | ");
        this.zmn.setText("Privacy policy");
        com.bytedance.sdk.component.adexpress.dynamic.fb.nps npsVar = this.klz;
        if (npsVar != null) {
            this.iqz.setTextColor(npsVar.nps());
            this.iqz.setTextSize(this.klz.btk());
            this.fs.setTextColor(this.klz.nps());
            this.fs.setTextSize(this.klz.btk());
            this.phc.setTextColor(this.klz.nps());
            this.doe.setTextColor(this.klz.nps());
            this.zmn.setTextColor(this.klz.nps());
            this.zmn.setTextSize(this.klz.btk());
            return false;
        }
        this.iqz.setTextColor(-1);
        this.iqz.setTextSize(12.0f);
        this.fs.setTextColor(-1);
        this.fs.setTextSize(12.0f);
        this.phc.setTextColor(-1);
        this.doe.setTextColor(-1);
        this.zmn.setTextColor(-1);
        this.zmn.setTextSize(12.0f);
        return false;
    }
}
