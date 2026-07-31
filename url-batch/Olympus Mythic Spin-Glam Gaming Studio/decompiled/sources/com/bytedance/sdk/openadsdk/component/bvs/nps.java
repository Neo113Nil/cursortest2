package com.bytedance.sdk.openadsdk.component.bvs;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes4.dex */
public class nps extends com.bytedance.sdk.openadsdk.core.hhw.nps {
    private final com.bytedance.sdk.openadsdk.core.hhw.fb fs;
    private final com.bytedance.sdk.openadsdk.core.hhw.fb zmn;
    private final com.bytedance.sdk.openadsdk.core.hhw.zg zn;

    @Override // com.bytedance.sdk.openadsdk.core.hhw.nps, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.nps, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public nps(@NonNull Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int fs = jy.fs(context, 12.0f);
        int fs2 = jy.fs(context, 16.0f);
        int fs3 = jy.fs(context, 20.0f);
        int fs4 = jy.fs(context, 24.0f);
        int fs5 = jy.fs(context, 28.0f);
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        this.zmn = fbVar;
        fbVar.setId(520093713);
        int fs6 = jy.fs(getContext(), 5.0f);
        fbVar.setPadding(fs6, fs6, fs6, fs6);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        fbVar.setScaleType(scaleType);
        fbVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.fb.zmn());
        fbVar.setImageResource(doe.fb(kgc.zmn(), "tt_reward_full_feedback"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(fs5, fs5);
        layoutParams.topMargin = fs3;
        layoutParams.leftMargin = fs2;
        layoutParams.setMarginStart(fs2);
        fbVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar2 = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        this.fs = fbVar2;
        fbVar2.setId(520093714);
        fbVar2.setPadding(fs6, fs6, fs6, fs6);
        fbVar2.setScaleType(scaleType);
        fbVar2.setBackground(com.bytedance.sdk.openadsdk.core.widget.fb.zmn());
        fbVar2.setImageResource(doe.fb(kgc.zmn(), "tt_close_btn"));
        if (fbVar2.getDrawable() != null) {
            fbVar2.getDrawable().setAutoMirrored(true);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(fs5, fs5);
        layoutParams2.topMargin = fs3;
        layoutParams2.rightMargin = fs2;
        layoutParams2.setMarginEnd(fs2);
        layoutParams2.addRule(11);
        layoutParams2.addRule(21);
        fbVar2.setLayoutParams(layoutParams2);
        fbVar2.setVisibility(4);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        this.zn = zgVar;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, fs4);
        layoutParams3.topMargin = fs3;
        layoutParams3.rightMargin = fs2;
        layoutParams3.addRule(11);
        layoutParams3.setMarginEnd(fs2);
        layoutParams3.addRule(21);
        zgVar.setLayoutParams(layoutParams3);
        zgVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.fb.fs());
        zgVar.setGravity(17);
        zgVar.setPadding(fs, 0, fs, 0);
        zgVar.setTextColor(-1);
        zgVar.setTextSize(1, 14.0f);
        zgVar.setVisibility(4);
        addView(fbVar);
        addView(zgVar);
        addView(fbVar2);
    }

    public View getTopDislike() {
        return this.zmn;
    }

    public com.bytedance.sdk.openadsdk.core.hhw.fb getTopSkip() {
        return this.fs;
    }

    public com.bytedance.sdk.openadsdk.core.hhw.zg getTopCountDown() {
        return this.zn;
    }
}
