package com.bytedance.sdk.openadsdk.component.reward.top;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.Jd;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.core.widget.ShadowImageView;
import com.bytedance.sdk.openadsdk.core.widget.ShadowTextView;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.so;

/* loaded from: classes2.dex */
public class TopLayoutDislike2 extends PAGLinearLayout implements pvs<TopLayoutDislike2> {
    private PAGImageView IP;
    private TextView Jd;
    private boolean Ju;
    private icD Mxy;
    private int NB;
    private boolean Wyp;
    private ImageView icD;
    private CharSequence kj;
    private View pvs;
    private boolean qh;
    private int sUS;
    private boolean so;
    private ShadowImageView vG;
    private boolean yiw;

    public TopLayoutDislike2(Context context) {
        this(context, null);
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.kj = "";
        setOrientation(0);
    }

    public void setShouldShowSkipTime(boolean z) {
        this.Wyp = z;
    }

    public TopLayoutDislike2 pvs(cR cRVar) {
        yiw();
        this.pvs.setVisibility(0);
        ((ImageView) this.pvs).setImageResource(uc.Jd(mnm.pvs(), "tt_reward_full_feedback"));
        this.icD.setImageResource(uc.Jd(mnm.pvs(), "tt_skip_btn"));
        if (this.icD.getDrawable() != null) {
            this.icD.getDrawable().setAutoMirrored(true);
        }
        this.icD.setVisibility(8);
        this.NB = cRVar.od() == null ? 0 : ((int) cRVar.od().sUS()) * cRVar.od().OT();
        if (com.bytedance.sdk.openadsdk.core.model.mnm.vG(cRVar) && cRVar.Mxy() != null) {
            this.NB = (int) cRVar.Mxy().icD();
        } else if (com.bytedance.sdk.openadsdk.core.model.mnm.Jd(cRVar) && cRVar.Mxy() != null) {
            this.NB = (int) cRVar.Mxy().Jd();
        }
        if (this.NB <= 0) {
            this.NB = 10;
        }
        if (cRVar.VLm() == 8 && cRVar.jlb() != null) {
            this.sUS = mnm.Jd().zM(cRVar.jlb().getCodeId());
        } else {
            this.sUS = mnm.Jd().Wyp(cRVar.jlb().getCodeId());
        }
        if (rCZ.qh(cRVar)) {
            this.sUS = mnm.Jd().pvs(String.valueOf(cRVar.yTz()), cRVar.FJ());
            this.NB = cRVar.AEt();
        }
        int i = this.sUS;
        this.Wyp = i == -1 || i >= this.NB;
        if (cRVar.SJ()) {
            this.pvs.setVisibility(8);
            this.yiw = true;
        }
        this.Jd.setVisibility(0);
        this.Jd.setText("");
        this.Jd.setEnabled(false);
        this.Jd.setClickable(false);
        so();
        return this;
    }

    private void yiw() {
        this.vG = new ShadowImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(Pj.icD(getContext(), 28.0f), Pj.icD(getContext(), 28.0f));
        layoutParams.leftMargin = Pj.icD(getContext(), 16.0f);
        layoutParams.topMargin = Pj.icD(getContext(), 20.0f);
        this.vG.setLayoutParams(layoutParams);
        this.vG.setScaleType(ImageView.ScaleType.CENTER);
        ShadowImageView shadowImageView = new ShadowImageView(getContext());
        this.pvs = shadowImageView;
        shadowImageView.setId(520093713);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(Pj.icD(getContext(), 28.0f), Pj.icD(getContext(), 28.0f));
        layoutParams2.topMargin = Pj.icD(getContext(), 20.0f);
        layoutParams2.leftMargin = Pj.icD(getContext(), 16.0f);
        this.pvs.setLayoutParams(layoutParams2);
        ((ImageView) this.pvs).setScaleType(ImageView.ScaleType.CENTER);
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        view.setLayoutParams(layoutParams3);
        ShadowTextView shadowTextView = new ShadowTextView(getContext());
        this.Jd = shadowTextView;
        shadowTextView.setId(520093714);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, Pj.icD(getContext(), 28.0f));
        layoutParams4.topMargin = Pj.icD(getContext(), 20.0f);
        int icD = Pj.icD(getContext(), 16.0f);
        layoutParams2.rightMargin = icD;
        layoutParams4.rightMargin = icD;
        this.Jd.setLayoutParams(layoutParams4);
        this.Jd.setGravity(17);
        this.Jd.setTextColor(-1);
        this.Jd.setTextSize(14.0f);
        this.Jd.setVisibility(8);
        this.icD = new ShadowImageView(getContext());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(Pj.icD(getContext(), 28.0f), Pj.icD(getContext(), 28.0f));
        layoutParams5.topMargin = Pj.icD(getContext(), 20.0f);
        layoutParams5.rightMargin = Pj.icD(getContext(), 16.0f);
        this.icD.setLayoutParams(layoutParams5);
        this.icD.setPadding(Pj.icD(getContext(), 4.0f), Pj.icD(getContext(), 4.0f), Pj.icD(getContext(), 4.0f), Pj.icD(getContext(), 4.0f));
        this.icD.setScaleType(ImageView.ScaleType.CENTER_CROP);
        PAGImageView pAGImageView = new PAGImageView(getContext());
        this.IP = pAGImageView;
        pAGImageView.setId(520093708);
        this.IP.setPadding(Pj.icD(getContext(), 8.0f), Pj.icD(getContext(), 8.0f), Pj.icD(getContext(), 8.0f), Pj.icD(getContext(), 8.0f));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(Pj.icD(getContext(), 28.0f), Pj.icD(getContext(), 28.0f));
        layoutParams6.gravity = 8388661;
        layoutParams6.topMargin = Pj.icD(getContext(), 20.0f);
        layoutParams6.rightMargin = Pj.icD(getContext(), 24.0f);
        this.IP.setBackground(so.pvs(getContext(), "tt_mute_btn_bg"));
        this.IP.setLayoutParams(layoutParams6);
        this.IP.setImageResource(uc.Jd(getContext(), "tt_video_close_drawable"));
        this.IP.setContentDescription(uc.pvs(getContext(), "tt_ad_close_text"));
        this.IP.setVisibility(8);
        addView(this.vG);
        addView(this.pvs);
        addView(view);
        addView(this.Jd);
        addView(this.icD);
        addView(this.IP);
    }

    private void so() {
        View view = this.pvs;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.Mxy != null) {
                        TopLayoutDislike2.this.Mxy.vG(view2);
                    }
                }
            });
        }
        ShadowImageView shadowImageView = this.vG;
        if (shadowImageView != null) {
            shadowImageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Drawable pvs;
                    TopLayoutDislike2.this.so = !r0.so;
                    if (TopLayoutDislike2.this.icD != null) {
                        pvs = TopLayoutDislike2.this.so ? uc.vG(TopLayoutDislike2.this.getContext(), "tt_reward_full_mute") : uc.vG(TopLayoutDislike2.this.getContext(), "tt_reward_full_unmute");
                    } else {
                        pvs = TopLayoutDislike2.this.so ? so.pvs(TopLayoutDislike2.this.getContext(), "tt_mute_wrapper") : so.pvs(TopLayoutDislike2.this.getContext(), "tt_unmute_wrapper");
                    }
                    TopLayoutDislike2.this.vG.setImageDrawable(pvs);
                    if (TopLayoutDislike2.this.vG.getDrawable() != null) {
                        TopLayoutDislike2.this.vG.getDrawable().setAutoMirrored(true);
                    }
                    if (TopLayoutDislike2.this.Mxy != null) {
                        TopLayoutDislike2.this.Mxy.icD(view2);
                    }
                }
            });
        }
        ImageView imageView = this.icD;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.Mxy != null) {
                        TopLayoutDislike2.this.Mxy.pvs(view2);
                    }
                }
            });
        } else {
            TextView textView = this.Jd;
            if (textView != null) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TopLayoutDislike2.this.Mxy != null) {
                            TopLayoutDislike2.this.Mxy.pvs(view2);
                        }
                    }
                });
            }
        }
        PAGImageView pAGImageView = this.IP;
        if (pAGImageView != null) {
            pAGImageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.Mxy != null) {
                        TopLayoutDislike2.this.Mxy.Jd(view2);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pvs
    public void setShowSkip(boolean z) {
        TextView textView = this.Jd;
        if (textView == null) {
            return;
        }
        if (!z) {
            textView.setText("");
        }
        if (this.icD.getVisibility() == 4) {
            return;
        }
        this.qh = !z;
        this.icD.setVisibility((z && this.Ju) ? 0 : 8);
        this.Jd.setVisibility(z ? 0 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pvs
    public void setSkipEnable(boolean z) {
        ImageView imageView = this.icD;
        if (imageView != null) {
            imageView.setEnabled(z);
            this.icD.setClickable(z);
            return;
        }
        TextView textView = this.Jd;
        if (textView != null) {
            textView.setEnabled(z);
            this.Jd.setClickable(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pvs
    public void setShowSound(boolean z) {
        ShadowImageView shadowImageView = this.vG;
        if (shadowImageView != null) {
            shadowImageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pvs
    public void setSoundMute(boolean z) {
        Drawable pvs;
        this.so = z;
        if (this.icD != null) {
            if (z) {
                pvs = uc.vG(getContext(), "tt_reward_full_mute");
            } else {
                pvs = uc.vG(getContext(), "tt_reward_full_unmute");
            }
        } else if (z) {
            pvs = so.pvs(getContext(), "tt_mute_wrapper");
        } else {
            pvs = so.pvs(getContext(), "tt_unmute_wrapper");
        }
        this.vG.setImageDrawable(pvs);
        if (this.vG.getDrawable() != null) {
            this.vG.getDrawable().setAutoMirrored(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pvs
    public void pvs(CharSequence charSequence, CharSequence charSequence2) {
        int parseInt;
        if (!TextUtils.isEmpty(charSequence)) {
            this.kj = charSequence;
        }
        if (this.icD == null) {
            return;
        }
        this.Ju = true;
        if (this.Wyp) {
            this.Jd.setText(((Object) this.kj) + "s");
            pvs(false);
            return;
        }
        String str = (String) this.kj;
        try {
            int i = this.sUS;
            if (i == 0) {
                parseInt = Integer.parseInt(str);
            } else {
                parseInt = i - (this.NB - Integer.parseInt(str));
            }
            if (parseInt > 0) {
                if (this.sUS == 0) {
                    pvs(false);
                    return;
                } else {
                    this.Jd.setText(String.format(uc.pvs(Jd.pvs(), "tt_reward_full_skip"), Integer.valueOf(parseInt)));
                    pvs(true);
                    return;
                }
            }
            this.Jd.setText(((Object) this.kj) + "s");
            pvs(false);
        } catch (Exception unused) {
        }
    }

    private void pvs(boolean z) {
        if (this.qh) {
            return;
        }
        if (this.Wyp) {
            this.icD.setVisibility(8);
            this.Jd.setVisibility(0);
        } else if (z) {
            this.Jd.setVisibility(0);
            this.icD.setVisibility(8);
        } else {
            this.Jd.setVisibility(8);
            this.icD.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pvs
    public void setSkipText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.Jd.setText(charSequence);
        ImageView imageView = this.icD;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pvs
    public void setShowDislike(boolean z) {
        View view = this.pvs;
        if (view == null || this.yiw) {
            return;
        }
        view.setVisibility(z ? 0 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pvs
    public void setListener(icD icd) {
        this.Mxy = icd;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pvs
    public void pvs() {
        ImageView imageView = this.icD;
        if (imageView != null) {
            imageView.performClick();
        }
        TextView textView = this.Jd;
        if (textView != null) {
            textView.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pvs
    public void icD() {
        ShadowImageView shadowImageView = this.vG;
        if (shadowImageView != null) {
            shadowImageView.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pvs
    public void Jd() {
        this.Jd.setVisibility(0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pvs
    public void NB() {
        ImageView imageView = this.icD;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.Jd.setVisibility(8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pvs
    public void sUS() {
        vG();
        this.icD.setVisibility(8);
        this.IP.setVisibility(0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pvs
    public View getCloseButton() {
        return this.IP;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pvs
    public void vG() {
        this.Jd.setWidth(20);
        this.Jd.setVisibility(4);
        this.icD.setVisibility(4);
        this.qh = true;
    }
}
