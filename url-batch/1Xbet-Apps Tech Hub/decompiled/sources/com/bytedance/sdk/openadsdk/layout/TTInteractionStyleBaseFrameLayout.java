package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.so;

/* loaded from: classes2.dex */
public abstract class TTInteractionStyleBaseFrameLayout extends PAGFrameLayout {
    protected PAGTextView Jd;
    protected PAGTextView NB;
    protected PAGImageView icD;
    protected PAGFrameLayout pvs;
    protected PAGTextView sUS;
    protected TTRoundRectImageView vG;

    protected abstract void pvs(Context context);

    public TTInteractionStyleBaseFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        pvs(context);
    }

    public FrameLayout getTtAdContainer() {
        return this.pvs;
    }

    public ImageView getTtFullImg() {
        return this.icD;
    }

    public TTRoundRectImageView getTtFullAdIcon() {
        return this.vG;
    }

    public TextView getTtFullAdAppName() {
        return this.Jd;
    }

    public TextView getTtFullAdDesc() {
        return this.NB;
    }

    public TextView getTtFullAdDownload() {
        return this.sUS;
    }

    protected PAGFrameLayout NB(Context context) {
        return new PAGFrameLayout(context);
    }

    protected PAGImageView sUS(Context context) {
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return pAGImageView;
    }

    protected TTRoundRectImageView yiw(Context context) {
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        tTRoundRectImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        tTRoundRectImageView.setBackgroundColor(0);
        return tTRoundRectImageView;
    }

    protected PAGTextView icD(Context context) {
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setMaxLines(1);
        pAGTextView.setTextColor(Color.parseColor("#FF999999"));
        pAGTextView.setTextSize(2, 16.0f);
        return pAGTextView;
    }

    protected PAGTextView vG(Context context) {
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setMaxLines(1);
        pAGTextView.setSingleLine();
        pAGTextView.setTextColor(Color.parseColor("#FF999999"));
        pAGTextView.setTextSize(2, 12.0f);
        return pAGTextView;
    }

    protected PAGTextView Jd(Context context) {
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setBackground(so.pvs(context, "tt_backup_btn_1"));
        pAGTextView.setGravity(17);
        pAGTextView.setText(uc.icD(context, "tt_video_download_apk"));
        pAGTextView.setTextColor(-1);
        pAGTextView.setTextSize(2, 14.0f);
        return pAGTextView;
    }

    protected PAGLogoView so(Context context) {
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        pAGLogoView.setId(520093739);
        return pAGLogoView;
    }
}
