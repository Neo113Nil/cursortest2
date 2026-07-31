package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes5.dex */
public class PAGLogoView extends LinearLayout {
    protected int containerHeight;
    private com.bytedance.sdk.openadsdk.core.hhw.fb mAdLogo;
    private com.bytedance.sdk.openadsdk.core.hhw.zg mAdText;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    public PAGLogoView(Context context) {
        this(context, null);
    }

    public PAGLogoView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PAGLogoView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }

    @RequiresApi
    public PAGLogoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initView(context);
    }

    private void initView(Context context) {
        int fs = jy.fs(context, 2.0f);
        this.containerHeight = jy.fs(getContext(), 12.0f);
        this.mAdLogo = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(jy.fs(context, 14.0f), jy.fs(context, 6.0f));
        layoutParams.leftMargin = fs;
        this.mAdLogo.setLayoutParams(layoutParams);
        this.mAdLogo.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.mAdText = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, this.containerHeight);
        layoutParams2.leftMargin = fs;
        layoutParams2.rightMargin = fs;
        this.mAdText.setLayoutParams(layoutParams2);
        this.mAdText.setTextSize(1, 8.0f);
        this.mAdText.setGravity(17);
        this.mAdText.setTextColor(Color.parseColor("#BFFFFFFF"));
        addView(this.mAdLogo);
        addView(this.mAdText);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#26000000"));
        gradientDrawable.setCornerRadius(fs);
        setBackground(gradientDrawable);
        setGravity(16);
    }

    public static PAGLogoView createPAGLogoViewByMaterial(Context context, nqi nqiVar) {
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        pAGLogoView.initData(nqiVar);
        return pAGLogoView;
    }

    public void initData(nqi nqiVar) {
        if (nqiVar == null) {
            return;
        }
        initData(nqiVar.ew());
    }

    public void initData(com.bytedance.sdk.openadsdk.core.model.fs fsVar) {
        if (fsVar == null) {
            return;
        }
        if (fsVar.hhw()) {
            this.mAdLogo.setImageDrawable(doe.zn(com.bytedance.sdk.openadsdk.core.kgc.zmn(), "tt_ad_logo"));
        } else {
            String zmn = fsVar.zmn();
            if (TextUtils.isEmpty(zmn)) {
                this.mAdLogo.setVisibility(8);
            } else {
                if (zmn.contains("logo")) {
                    this.mAdLogo.setImageDrawable(doe.zn(com.bytedance.sdk.openadsdk.core.kgc.zmn(), "tt_ad_logo"));
                } else {
                    com.bytedance.sdk.openadsdk.iv.fb.zmn(zmn).zn(1).zmn(this.mAdLogo);
                }
                this.mAdLogo.setVisibility(0);
            }
        }
        String fs = fsVar.fs();
        if (fsVar.hhw()) {
            this.mAdText.setText(doe.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn(), "tt_logo_en"));
        } else if (TextUtils.isEmpty(fs)) {
            this.mAdText.setVisibility(8);
        } else {
            this.mAdText.setText(fs);
            this.mAdText.setVisibility(0);
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = this.containerHeight;
        super.setLayoutParams(com.bytedance.sdk.openadsdk.core.hhw.bvs.zmn(this, layoutParams));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }
}
