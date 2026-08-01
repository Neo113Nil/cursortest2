package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.vG.so;

/* loaded from: classes.dex */
public class DynamicPrivacyView extends DynamicBaseWidgetImp {
    private TextView OT;
    private TextView icD;
    private LinearLayout ny;
    private TextView pvs;
    private TextView rCZ;
    private TextView uc;

    public DynamicPrivacyView(Context context, DynamicRootView dynamicRootView, so soVar) {
        super(context, dynamicRootView, soVar);
        this.pvs = new TextView(this.qh);
        this.icD = new TextView(this.qh);
        this.uc = new TextView(this.qh);
        this.ny = new LinearLayout(this.qh);
        this.rCZ = new TextView(this.qh);
        this.OT = new TextView(this.qh);
        this.pvs.setTag(9);
        this.icD.setTag(10);
        this.uc.setTag(12);
        this.ny.addView(this.uc);
        this.ny.addView(this.OT);
        this.ny.addView(this.icD);
        this.ny.addView(this.rCZ);
        this.ny.addView(this.pvs);
        addView(this.ny, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    protected boolean Jd() {
        this.pvs.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.pvs.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.icD.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.icD.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.uc.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.uc.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.yiw, this.so);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Jd
    public boolean Mxy() {
        this.uc.setText("Function");
        this.icD.setText("Permission list");
        this.rCZ.setText(" | ");
        this.OT.setText(" | ");
        this.pvs.setText("Privacy policy");
        if (this.kj != null) {
            this.uc.setTextColor(this.kj.yiw());
            this.uc.setTextSize(this.kj.NB());
            this.icD.setTextColor(this.kj.yiw());
            this.icD.setTextSize(this.kj.NB());
            this.rCZ.setTextColor(this.kj.yiw());
            this.OT.setTextColor(this.kj.yiw());
            this.pvs.setTextColor(this.kj.yiw());
            this.pvs.setTextSize(this.kj.NB());
            return false;
        }
        this.uc.setTextColor(-1);
        this.uc.setTextSize(12.0f);
        this.icD.setTextColor(-1);
        this.icD.setTextSize(12.0f);
        this.rCZ.setTextColor(-1);
        this.OT.setTextColor(-1);
        this.pvs.setTextColor(-1);
        this.pvs.setTextSize(12.0f);
        return false;
    }
}
