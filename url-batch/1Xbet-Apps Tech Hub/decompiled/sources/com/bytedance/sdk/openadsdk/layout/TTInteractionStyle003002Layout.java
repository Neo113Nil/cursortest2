package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.kj;

/* loaded from: classes2.dex */
public class TTInteractionStyle003002Layout extends TTInteractionStyleBaseFrameLayout {
    private PAGTextView so;
    private PAGImageView yiw;

    public TTInteractionStyle003002Layout(Context context) {
        this(context, null);
    }

    public TTInteractionStyle003002Layout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTInteractionStyle003002Layout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    protected void pvs(Context context) {
        int icD = Pj.icD(context, 6.0f);
        setPadding(icD, icD, icD, icD);
        this.pvs = NB(context);
        this.pvs.setId(kj.Tdd);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        int icD2 = Pj.icD(context, 26.0f);
        layoutParams.topMargin = icD2;
        this.pvs.setLayoutParams(layoutParams);
        addView(this.pvs);
        PAGImageView pAGImageView = new PAGImageView(context);
        this.yiw = pAGImageView;
        pAGImageView.setId(kj.ABo);
        this.yiw.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.topMargin = icD2;
        this.yiw.setLayoutParams(layoutParams2);
        addView(this.yiw);
        PAGLogoView so = so(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 80;
        int icD3 = Pj.icD(context, 10.0f);
        layoutParams3.leftMargin = icD3;
        layoutParams3.topMargin = icD3;
        layoutParams3.bottomMargin = icD3;
        so.setLayoutParams(layoutParams3);
        addView(so);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        pAGLinearLayout.setOrientation(0);
        pAGLinearLayout.setGravity(17);
        addView(pAGLinearLayout);
        PAGTextView pAGTextView = new PAGTextView(context);
        this.so = pAGTextView;
        pAGTextView.setId(kj.RKd);
        this.so.setEllipsize(TextUtils.TruncateAt.END);
        this.so.setMaxLines(1);
        this.so.setTextColor(-1);
        this.so.setTextSize(2, 12.0f);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        this.so.setLayoutParams(layoutParams4);
        pAGLinearLayout.addView(this.so);
    }

    public PAGImageView getTtBuImg() {
        return this.yiw;
    }

    public PAGTextView getTtBuDescTV() {
        return this.so;
    }
}
