package com.bytedance.sdk.openadsdk.component.reward.top;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.openadsdk.core.hhw.btk;
import com.bytedance.sdk.openadsdk.core.hhw.fb;
import com.bytedance.sdk.openadsdk.core.hhw.zg;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.bjh;
import com.bytedance.sdk.openadsdk.core.model.iqz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.settings.rc;
import com.bytedance.sdk.openadsdk.core.widget.hhw;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.olo;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* loaded from: classes13.dex */
public class TopLayoutDislike2 extends btk implements zmn<TopLayoutDislike2> {
    btk container;
    private boolean hasCutDown;
    private boolean hasShowClose;
    private boolean isVast;
    private fb mCloseBackupBtn;
    private fb mCloseBtn;
    private View mImgDislike;
    private ImageView mImgSound;
    private boolean mIsSoundMute;
    private TextView mNextAdTextTv;
    private btk mPlayableNextAd;
    private com.bytedance.sdk.openadsdk.core.mw.fs.fb.zmn mProgressBar;
    private int mProgressBgColor;
    private int mProgressColor;
    private int mProgressRadiusSize;
    private com.bytedance.sdk.openadsdk.core.mw.fs.fb.zmn mProgressRing;
    private int mProgressSize;
    private CharSequence mProgressStr;
    private int mProgressType;
    private ImageView mSkipIV;
    private TextView mTextViewCountDown;
    private fs mTopListener;
    private boolean shouldShowSkipTime;
    private int skipTime;
    private int videoDuration;

    public void clickDislike() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.btk, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.btk, android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public TopLayoutDislike2(@NonNull Context context) {
        this(context, null);
    }

    public TopLayoutDislike2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TopLayoutDislike2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mProgressStr = "";
        this.mProgressColor = com.bytedance.adsdk.ugeno.nps.zmn.zmn("#FFD813");
        this.mProgressBgColor = com.bytedance.adsdk.ugeno.nps.zmn.zmn("rgba(0, 0, 0, 0.5)");
        setOrientation(1);
    }

    public void setShouldShowSkipTime(boolean z) {
        this.shouldShowSkipTime = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TopLayoutDislike2 load(@NonNull nqi nqiVar) {
        boolean z;
        initProgressBar(nqiVar);
        initView(nqiVar);
        this.mImgDislike.setVisibility(0);
        ((ImageView) this.mImgDislike).setImageResource(doe.fb(kgc.zmn(), "tt_reward_full_feedback"));
        if (!rc.fs().cn(String.valueOf(nqiVar.qvo())) || nqiVar.cd() == 5 || nqiVar.cd() == 6) {
            this.mSkipIV.setImageResource(doe.fb(kgc.zmn(), "tt_close_btn"));
        } else {
            this.mSkipIV.setImageResource(doe.fb(kgc.zmn(), "tt_skip_btn"));
        }
        if (this.mSkipIV.getDrawable() != null) {
            this.mSkipIV.getDrawable().setAutoMirrored(true);
        }
        this.mSkipIV.setVisibility(8);
        this.videoDuration = nqiVar.mrt() == null ? 0 : ((int) nqiVar.mrt().hhw()) * nqiVar.mrt().doe();
        if (iqz.fb(nqiVar) && nqiVar.uqh() != null) {
            this.videoDuration = (int) nqiVar.uqh().fs();
        } else if (iqz.zg(nqiVar) && nqiVar.uqh() != null) {
            this.videoDuration = (int) nqiVar.uqh().fb();
        }
        if (this.videoDuration <= 0) {
            this.videoDuration = 10;
        }
        if (nqiVar.ldx() == 8 && nqiVar.utx() != null) {
            this.skipTime = nqiVar.ab();
        } else {
            this.skipTime = nqiVar.nkw();
        }
        if (am.zn(nqiVar)) {
            this.skipTime = nqiVar.ur();
            this.videoDuration = nqiVar.ioo();
        } else {
            int i = this.skipTime;
            if (i != -1 && i < this.videoDuration) {
                z = false;
                this.shouldShowSkipTime = z;
                if (nqiVar.ch()) {
                    this.mImgDislike.setVisibility(8);
                    this.isVast = true;
                }
                this.mTextViewCountDown.setVisibility(4);
                this.mTextViewCountDown.setText("");
                this.mTextViewCountDown.setEnabled(false);
                this.mTextViewCountDown.setClickable(false);
                initListener(nqiVar);
                return this;
            }
        }
        z = true;
        this.shouldShowSkipTime = z;
        if (nqiVar.ch()) {
        }
        this.mTextViewCountDown.setVisibility(4);
        this.mTextViewCountDown.setText("");
        this.mTextViewCountDown.setEnabled(false);
        this.mTextViewCountDown.setClickable(false);
        initListener(nqiVar);
        return this;
    }

    private ImageView getCommonRingBGImageView() {
        fb fbVar = new fb(getContext());
        int fs = jy.fs(getContext(), 5.0f);
        fbVar.setPadding(fs, fs, fs, fs);
        fbVar.setScaleType(ImageView.ScaleType.CENTER);
        fbVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.fb.zmn());
        return fbVar;
    }

    private void initView(nqi nqiVar) {
        btk btkVar = new btk(getContext());
        this.container = btkVar;
        btkVar.setOrientation(0);
        int fs = jy.fs(getContext(), 16.0f);
        int fs2 = jy.fs(getContext(), 12.0f);
        int fs3 = jy.fs(getContext(), 24.0f);
        int fs4 = jy.fs(getContext(), 28.0f);
        ImageView commonRingBGImageView = getCommonRingBGImageView();
        this.mImgDislike = commonRingBGImageView;
        commonRingBGImageView.setId(520093713);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(fs4, fs4);
        layoutParams.topMargin = fs3;
        layoutParams.leftMargin = fs;
        this.mImgDislike.setLayoutParams(layoutParams);
        this.mImgSound = getCommonRingBGImageView();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(fs4, fs4);
        layoutParams2.leftMargin = fs2;
        layoutParams2.topMargin = fs3;
        this.mImgSound.setId(olo.dy);
        this.mImgSound.setLayoutParams(layoutParams2);
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        view.setLayoutParams(layoutParams3);
        zg zgVar = new zg(getContext());
        this.mTextViewCountDown = zgVar;
        zgVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.fb.fs());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, jy.fs(getContext(), 28.0f));
        layoutParams4.topMargin = fs3;
        layoutParams4.rightMargin = fs;
        this.mTextViewCountDown.setPadding(fs2, 0, fs2, 0);
        this.mTextViewCountDown.setLayoutParams(layoutParams4);
        this.mTextViewCountDown.setGravity(17);
        this.mTextViewCountDown.setTextColor(-1);
        this.mTextViewCountDown.setTextSize(14.0f);
        this.mTextViewCountDown.setVisibility(8);
        btk btkVar2 = new btk(getContext());
        this.mPlayableNextAd = btkVar2;
        btkVar2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, fs4);
        layoutParams5.topMargin = fs3;
        if (nqiVar != null && nqiVar.nlo()) {
            layoutParams5.rightMargin = jy.fs(getContext(), 8.0f);
        } else {
            layoutParams5.rightMargin = fs;
        }
        this.mPlayableNextAd.setLayoutParams(layoutParams5);
        this.mPlayableNextAd.setBackground(com.bytedance.sdk.openadsdk.core.widget.fb.fs());
        this.mPlayableNextAd.setVisibility(8);
        this.mNextAdTextTv = new zg(getContext());
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, jy.fs(getContext(), 28.0f));
        layoutParams6.gravity = 16;
        this.mNextAdTextTv.setLayoutParams(layoutParams6);
        this.mNextAdTextTv.setPadding(fs2, 0, 0, 0);
        String doe = am.doe(nqiVar);
        if (!TextUtils.isEmpty(doe)) {
            this.mNextAdTextTv.setText(doe);
        } else {
            this.mNextAdTextTv.setText(doe.fs(getContext(), "tt_multiple_playable_next_ad_tips"));
        }
        this.mNextAdTextTv.setGravity(17);
        this.mNextAdTextTv.setTextColor(-1);
        this.mNextAdTextTv.setTextSize(14.0f);
        fb fbVar = new fb(getContext());
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(fs2, fs2);
        layoutParams7.rightMargin = fs2;
        fbVar.setScaleType(ImageView.ScaleType.CENTER);
        layoutParams7.gravity = 16;
        fbVar.setLayoutParams(layoutParams7);
        fbVar.setImageResource(doe.fb(kgc.zmn(), "tt_ad_arrow_right"));
        this.mPlayableNextAd.addView(this.mNextAdTextTv);
        this.mPlayableNextAd.addView(fbVar);
        ImageView commonRingBGImageView2 = getCommonRingBGImageView();
        this.mSkipIV = commonRingBGImageView2;
        commonRingBGImageView2.setId(520093714);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(fs4, fs4);
        layoutParams8.topMargin = fs3;
        layoutParams8.rightMargin = fs;
        this.mSkipIV.setLayoutParams(layoutParams8);
        this.mSkipIV.setScaleType(ImageView.ScaleType.CENTER_CROP);
        fb fs5 = hhw.fs(getContext());
        this.mCloseBtn = fs5;
        fs5.setId(520093708);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams9.gravity = 8388661;
        layoutParams9.topMargin = fs3;
        layoutParams9.rightMargin = fs3;
        this.mCloseBtn.setLayoutParams(layoutParams9);
        this.mCloseBtn.setContentDescription(doe.zmn(getContext(), "tt_ad_close_text"));
        this.mCloseBtn.setVisibility(8);
        fb zmn = hhw.zmn(getContext(), this.container);
        this.mCloseBackupBtn = zmn;
        zmn.setId(olo.efd);
        this.mCloseBackupBtn.setContentDescription(doe.zmn(getContext(), "tt_close_backup_button_text"));
        if (this.mProgressType == 1) {
            this.mProgressRing = new com.bytedance.sdk.openadsdk.core.mw.fs.fb.zmn(getContext());
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(Color.parseColor("#66666666"));
            gradientDrawable.setCornerRadius(jy.fs(getContext(), 14.0f));
            gradientDrawable.setShape(0);
            this.mProgressRing.setBackground(gradientDrawable);
            LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(fs4, fs4);
            layoutParams10.topMargin = fs3;
            layoutParams10.rightMargin = fs;
            this.mProgressRing.setLayoutParams(layoutParams10);
            this.mProgressRing.zmn("ring").zmn(this.mProgressSize).zmn(this.mProgressColor).fs(this.mProgressBgColor).fs(this.mProgressRadiusSize);
            this.mProgressRing.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar = new com.bytedance.sdk.openadsdk.core.hhw.zn(getContext());
        znVar.addView(this.mSkipIV);
        com.bytedance.sdk.openadsdk.core.mw.fs.fb.zmn zmnVar = this.mProgressRing;
        if (zmnVar != null) {
            znVar.addView(zmnVar);
        }
        if (this.mProgressType == 2) {
            this.mProgressBar = new com.bytedance.sdk.openadsdk.core.mw.fs.fb.zmn(getContext());
            this.mProgressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.mProgressBar.zmn("line").zmn(this.mProgressSize).zmn(this.mProgressColor).fs(this.mProgressBgColor).fs(this.mProgressRadiusSize);
            this.mProgressBar.setVisibility(8);
        }
        this.container.addView(this.mImgDislike);
        this.container.addView(this.mImgSound);
        this.container.addView(view);
        if (this.mProgressRing == null) {
            this.container.addView(this.mPlayableNextAd);
        } else {
            znVar.addView(this.mPlayableNextAd);
        }
        this.container.addView(this.mTextViewCountDown);
        this.container.addView(znVar);
        this.container.addView(this.mCloseBtn);
        com.bytedance.sdk.openadsdk.core.mw.fs.fb.zmn zmnVar2 = this.mProgressBar;
        if (zmnVar2 != null) {
            addView(zmnVar2);
        }
        addView(this.container);
    }

    private void initListener(final nqi nqiVar) {
        View view = this.mImgDislike;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/top/TopLayoutDislike2$1;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view2);
                    safedk_TopLayoutDislike2$1_onClick_07c8465f593befce97bf882266401e5e(view2);
                }

                public void safedk_TopLayoutDislike2$1_onClick_07c8465f593befce97bf882266401e5e(View p0) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.fs(p0);
                    }
                }
            });
        }
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/top/TopLayoutDislike2$2;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view2);
                    safedk_TopLayoutDislike2$2_onClick_3ac04b14d259e05ac6c7043f98736e22(view2);
                }

                public void safedk_TopLayoutDislike2$2_onClick_3ac04b14d259e05ac6c7043f98736e22(View p0) {
                    Drawable zmn;
                    String str;
                    TopLayoutDislike2.this.mIsSoundMute = !r0.mIsSoundMute;
                    if (TopLayoutDislike2.this.mSkipIV != null) {
                        zmn = TopLayoutDislike2.this.mIsSoundMute ? doe.zn(TopLayoutDislike2.this.getContext(), "tt_reward_full_mute") : doe.zn(TopLayoutDislike2.this.getContext(), "tt_reward_full_unmute");
                    } else {
                        zmn = TopLayoutDislike2.this.mIsSoundMute ? com.bytedance.sdk.openadsdk.utils.rc.zmn(TopLayoutDislike2.this.getContext(), "tt_mute_wrapper") : com.bytedance.sdk.openadsdk.utils.rc.zmn(TopLayoutDislike2.this.getContext(), "tt_unmute_wrapper");
                    }
                    TopLayoutDislike2.this.mImgSound.setImageDrawable(zmn);
                    if (TopLayoutDislike2.this.mImgSound.getDrawable() != null) {
                        TopLayoutDislike2.this.mImgSound.getDrawable().setAutoMirrored(true);
                    }
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        Object tag = TopLayoutDislike2.this.mImgSound.getTag(TopLayoutDislike2.this.mImgSound.getId());
                        if (!(tag instanceof String)) {
                            str = "nativeClick";
                        } else {
                            str = tag.toString();
                        }
                        TopLayoutDislike2.this.mTopListener.zmn(p0, str);
                    }
                    View p02 = TopLayoutDislike2.this.mImgSound;
                    p02.setTag(TopLayoutDislike2.this.mImgSound.getId(), null);
                }
            });
        }
        ImageView imageView2 = this.mSkipIV;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/top/TopLayoutDislike2$3;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view2);
                    safedk_TopLayoutDislike2$3_onClick_27400631db877f6de09e30aa42f2ac4b(view2);
                }

                public void safedk_TopLayoutDislike2$3_onClick_27400631db877f6de09e30aa42f2ac4b(View p0) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.zmn(p0);
                    }
                }
            });
        } else {
            TextView textView = this.mTextViewCountDown;
            if (textView != null) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/top/TopLayoutDislike2$4;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(h.u, view2);
                        safedk_TopLayoutDislike2$4_onClick_bb506814ec67772454de11ab04684503(view2);
                    }

                    public void safedk_TopLayoutDislike2$4_onClick_bb506814ec67772454de11ab04684503(View p0) {
                        if (TopLayoutDislike2.this.mTopListener != null) {
                            TopLayoutDislike2.this.mTopListener.zmn(p0);
                        }
                    }
                });
            }
        }
        fb fbVar = this.mCloseBtn;
        if (fbVar != null) {
            fbVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/top/TopLayoutDislike2$5;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view2);
                    safedk_TopLayoutDislike2$5_onClick_ccdece47b8e4c126ceaafe865e66e5a9(view2);
                }

                public void safedk_TopLayoutDislike2$5_onClick_ccdece47b8e4c126ceaafe865e66e5a9(View p0) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.zn(p0);
                    }
                }
            });
        }
        fb fbVar2 = this.mCloseBackupBtn;
        if (fbVar2 != null) {
            fbVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/top/TopLayoutDislike2$6;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view2);
                    safedk_TopLayoutDislike2$6_onClick_de9ead704de5f29bb914af0dc93be5b7(view2);
                }

                public void safedk_TopLayoutDislike2$6_onClick_de9ead704de5f29bb914af0dc93be5b7(View p0) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.zn(p0);
                        com.bytedance.sdk.openadsdk.component.fb.fs.zmn("force_button_tracker", "click", nqiVar);
                    }
                }
            });
        }
        btk btkVar = this.mPlayableNextAd;
        if (btkVar != null) {
            btkVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/top/TopLayoutDislike2$7;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view2);
                    safedk_TopLayoutDislike2$7_onClick_1134cba380acacb01ad367968b1cbca1(view2);
                }

                public void safedk_TopLayoutDislike2$7_onClick_1134cba380acacb01ad367968b1cbca1(View p0) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.fb(p0);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void setShowSkip(boolean z) {
        TextView textView = this.mTextViewCountDown;
        if (textView == null) {
            return;
        }
        if (!z) {
            textView.setText("");
        }
        if (this.mSkipIV.getVisibility() == 4) {
            return;
        }
        this.hasShowClose = !z;
        this.mSkipIV.setVisibility((z && this.hasCutDown) ? 0 : 8);
        this.mTextViewCountDown.setVisibility(z & (TextUtils.isEmpty(this.mTextViewCountDown.getText()) ^ true) ? 0 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void setSkipEnable(boolean z) {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setEnabled(z);
            this.mSkipIV.setClickable(z);
            return;
        }
        TextView textView = this.mTextViewCountDown;
        if (textView != null) {
            textView.setEnabled(z);
            this.mTextViewCountDown.setClickable(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void setShowSound(boolean z) {
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void setSoundMute(boolean z) {
        Drawable zmn;
        this.mIsSoundMute = z;
        if (this.mSkipIV != null) {
            if (z) {
                zmn = doe.zn(getContext(), "tt_reward_full_mute");
            } else {
                zmn = doe.zn(getContext(), "tt_reward_full_unmute");
            }
        } else if (z) {
            zmn = com.bytedance.sdk.openadsdk.utils.rc.zmn(getContext(), "tt_mute_wrapper");
        } else {
            zmn = com.bytedance.sdk.openadsdk.utils.rc.zmn(getContext(), "tt_unmute_wrapper");
        }
        this.mImgSound.setImageDrawable(zmn);
        if (this.mImgSound.getDrawable() != null) {
            this.mImgSound.getDrawable().setAutoMirrored(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    @SuppressLint({"SetTextI18n"})
    public void setTime(CharSequence charSequence, CharSequence charSequence2) {
        int parseInt;
        if (!TextUtils.isEmpty(charSequence)) {
            this.mProgressStr = charSequence;
        }
        if (this.mSkipIV == null) {
            return;
        }
        this.hasCutDown = true;
        if (this.shouldShowSkipTime) {
            this.mTextViewCountDown.setText(((Object) this.mProgressStr) + "s");
            updateTime(false);
            return;
        }
        String str = (String) this.mProgressStr;
        try {
            int i = this.skipTime;
            if (i == 0) {
                parseInt = Integer.parseInt(str);
            } else {
                parseInt = i - (this.videoDuration - Integer.parseInt(str));
            }
            if (parseInt > 0) {
                if (this.skipTime == 0) {
                    updateTime(false);
                    return;
                }
                this.mTextViewCountDown.setText(parseInt + "s");
                updateTime(true);
                return;
            }
            this.mTextViewCountDown.setText(((Object) this.mProgressStr) + "s");
            updateTime(false);
        } catch (Exception unused) {
        }
    }

    private void updateTime(boolean z) {
        if (this.hasShowClose) {
            return;
        }
        if (this.shouldShowSkipTime) {
            this.mSkipIV.setVisibility(8);
            this.mTextViewCountDown.setVisibility(0);
        } else if (z) {
            this.mTextViewCountDown.setVisibility(0);
            this.mSkipIV.setVisibility(8);
        } else {
            this.mTextViewCountDown.setVisibility(8);
            this.mSkipIV.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void setSkipText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.mTextViewCountDown.setVisibility(8);
            return;
        }
        this.mTextViewCountDown.setText(charSequence);
        if (this.mTextViewCountDown.getVisibility() != 0) {
            this.mTextViewCountDown.setVisibility(0);
        }
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void setCountDownFor1InN(CharSequence charSequence, int i) {
        int i2 = this.mProgressType;
        if (i2 == 1) {
            this.mTextViewCountDown.setVisibility(8);
            if (i < 0) {
                this.mProgressRing.setVisibility(8);
                this.mSkipIV.setVisibility(8);
                return;
            }
            this.mProgressRing.setVisibility(0);
            this.mProgressRing.setAnimationDuration(1000);
            this.mProgressRing.setProgress(i);
            this.mProgressRing.setClickable(false);
            this.mProgressRing.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/top/TopLayoutDislike2$8;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_TopLayoutDislike2$8_onClick_760538fba60068b16dab81199456224d(view);
                }

                public void safedk_TopLayoutDislike2$8_onClick_760538fba60068b16dab81199456224d(View p0) {
                }
            });
            ImageView imageView = this.mSkipIV;
            if (imageView != null) {
                imageView.setVisibility(0);
                return;
            }
            return;
        }
        if (i2 == 2) {
            this.mTextViewCountDown.setVisibility(8);
            if (i < 0) {
                this.mProgressBar.setVisibility(8);
                this.mSkipIV.setVisibility(8);
                return;
            } else {
                this.mProgressBar.setVisibility(0);
                this.mProgressBar.setAnimationDuration(1000);
                this.mProgressBar.setProgress(i);
                return;
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.mTextViewCountDown.setVisibility(8);
            return;
        }
        this.mTextViewCountDown.setText(charSequence);
        if (this.mTextViewCountDown.getVisibility() != 0) {
            this.mTextViewCountDown.setVisibility(0);
        }
        ImageView imageView2 = this.mSkipIV;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void setShowDislike(boolean z) {
        View view = this.mImgDislike;
        if (view == null || this.isVast) {
            return;
        }
        view.setVisibility(z ? 0 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void setShowPlayableNextAd(boolean z, nqi nqiVar) {
        btk btkVar = this.mPlayableNextAd;
        if (btkVar != null) {
            btkVar.setVisibility(z ? 0 : 8);
            if (this.mNextAdTextTv == null || !z) {
                return;
            }
            String doe = am.doe(nqiVar);
            if (!TextUtils.isEmpty(doe)) {
                this.mNextAdTextTv.setText(doe);
            } else {
                this.mNextAdTextTv.setText(doe.fs(getContext(), "tt_multiple_playable_next_ad_tips"));
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void setShowEndCardNextAd(boolean z, nqi nqiVar) {
        btk btkVar = this.mPlayableNextAd;
        if (btkVar != null) {
            btkVar.setVisibility(z ? 0 : 8);
            if (this.mNextAdTextTv == null || !z || nqiVar == null || nqiVar.xcf() == null) {
                return;
            }
            String zn = nqiVar.xcf().zn();
            if (TextUtils.isEmpty(zn)) {
                return;
            }
            this.mNextAdTextTv.setText(zn);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void setListener(fs fsVar) {
        this.mTopListener = fsVar;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void clickSkip() {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.performClick();
        }
        TextView textView = this.mTextViewCountDown;
        if (textView != null) {
            textView.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void clickSound(String str) {
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setTag(imageView.getId(), str);
            this.mImgSound.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void showCountDownText() {
        this.mTextViewCountDown.setVisibility(0);
    }

    public void hideCountDownText() {
        this.mTextViewCountDown.setVisibility(8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void showSkipButton() {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.mTextViewCountDown.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.mw.fs.fb.zmn zmnVar = this.mProgressRing;
        if (zmnVar != null) {
            zmnVar.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.mw.fs.fb.zmn zmnVar2 = this.mProgressBar;
        if (zmnVar2 != null) {
            zmnVar2.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void showCloseButton() {
        setSkipInvisiable();
        this.mSkipIV.setVisibility(8);
        this.mCloseBtn.setVisibility(0);
        com.bytedance.sdk.openadsdk.core.mw.fs.fb.zmn zmnVar = this.mProgressRing;
        if (zmnVar != null) {
            zmnVar.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.mw.fs.fb.zmn zmnVar2 = this.mProgressBar;
        if (zmnVar2 != null) {
            zmnVar2.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public View getCloseButton() {
        return this.mCloseBtn;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public View getCloseBackupButton() {
        return this.mCloseBackupBtn;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zmn
    public void setSkipInvisiable() {
        this.mTextViewCountDown.setWidth(20);
        this.mTextViewCountDown.setVisibility(4);
        this.mSkipIV.setVisibility(4);
        this.hasShowClose = true;
    }

    private void initProgressBar(nqi nqiVar) {
        bjh rc;
        bjh.fs olo;
        if (nqiVar == null || nqiVar.fb() == null || nqiVar.fb().rc() == null || (rc = nqiVar.fb().rc()) == null || rc.olo() == null || (olo = rc.olo()) == null) {
            return;
        }
        if (!TextUtils.isEmpty(olo.fs())) {
            this.mProgressColor = com.bytedance.adsdk.ugeno.nps.zmn.zmn(olo.fs());
        }
        if (!TextUtils.isEmpty(olo.zn())) {
            this.mProgressBgColor = com.bytedance.adsdk.ugeno.nps.zmn.zmn(olo.zn());
        }
        if (olo.fb() <= 0.0f) {
            this.mProgressSize = jy.fs(getContext(), 1.0f);
        } else {
            this.mProgressSize = jy.fs(getContext(), olo.fb());
        }
        if (olo.btk() > 0.0f) {
            this.mProgressRadiusSize = jy.fs(getContext(), olo.btk());
        }
        this.mProgressType = olo.zmn();
    }
}
