package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.IP;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.Ju;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.sUS;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.RatioFrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.RatioImageView;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.so;
import com.google.android.material.card.MaterialCardViewHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class BannerExpressBackupView extends BackupView {
    private pvs IP;
    private NativeExpressView bNS;
    private String mnm;
    private PAGBannerAdWrapperListener vA;
    public static Ju[] pvs = {new Ju(1, 6.4f, 320, 50), new Ju(4, 1.2f, MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION)};
    private static final AtomicInteger Ju = new AtomicInteger(1);

    public void setClosedListenerKey(String str) {
        this.mnm = str;
    }

    public BannerExpressBackupView(Context context) {
        super(context);
        this.icD = context;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView
    protected void pvs(View view, int i, IP ip) {
        pvs pvsVar;
        if (this.bNS != null) {
            if ((i == 1 || i == 2) && (pvsVar = this.IP) != null) {
                ImageView imageView = pvsVar.Wyp;
                if (i == 1) {
                    this.bNS.getClickListener().icD(imageView);
                } else {
                    this.bNS.getClickCreativeListener().icD(imageView);
                }
            }
            this.bNS.pvs(view, i, ip);
        }
    }

    void pvs(cR cRVar, NativeExpressView nativeExpressView, com.com.bytedance.overseas.sdk.pvs.vG vGVar) {
        setBackgroundColor(-1);
        this.vG = cRVar;
        this.bNS = nativeExpressView;
        this.sUS = "banner_ad";
        this.bNS.addView(this, new ViewGroup.LayoutParams(-2, -2));
        icD();
    }

    private void icD() {
        Ju pvs2 = pvs(this.bNS.getExpectExpressWidth(), this.bNS.getExpectExpressHeight());
        if (this.bNS.getExpectExpressWidth() > 0 && this.bNS.getExpectExpressHeight() > 0) {
            this.yiw = Pj.icD(this.icD, this.bNS.getExpectExpressWidth());
            this.so = Pj.icD(this.icD, this.bNS.getExpectExpressHeight());
        } else {
            this.yiw = Pj.vG(this.icD);
            this.so = Float.valueOf(this.yiw / pvs2.icD).intValue();
        }
        if (this.yiw > 0 && this.yiw > Pj.vG(this.icD)) {
            this.yiw = Pj.vG(this.icD);
            this.so = Float.valueOf(this.so * (Pj.vG(this.icD) / this.yiw)).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.yiw, this.so);
        }
        layoutParams.width = this.yiw;
        layoutParams.height = this.so;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        if (pvs2.pvs == 1) {
            vG();
        } else {
            Jd();
        }
    }

    private void pvs(ImageView imageView) {
        com.bytedance.sdk.openadsdk.qh.vG.pvs().pvs(this.vG.BSi().get(0), imageView, this.vG);
    }

    private void vG() {
        float icD = (this.so * 1.0f) / Pj.icD(this.icD, 50.0f);
        if ((this.so * 1.0f) / this.yiw > 0.21875f) {
            icD = (this.yiw * 1.0f) / Pj.icD(this.icD, 320.0f);
        }
        pvs NB = NB();
        this.IP = NB;
        ImageView imageView = NB.Wyp;
        ImageView imageView2 = this.IP.Jd;
        TextView textView = this.IP.NB;
        TextView textView2 = this.IP.sUS;
        TTRatingBar2 tTRatingBar2 = this.IP.yiw;
        TextView textView3 = this.IP.Mxy;
        textView.setTextSize(2, Pj.pvs(this.icD, textView.getTextSize()) * icD);
        textView2.setTextSize(2, Pj.pvs(this.icD, textView2.getTextSize()) * icD);
        textView3.setTextSize(2, Pj.pvs(this.icD, textView3.getTextSize()) * icD);
        View view = this.IP.so;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    TTWebsiteActivity.pvs(BannerExpressBackupView.this.icD, BannerExpressBackupView.this.vG, BannerExpressBackupView.this.sUS);
                }
            });
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                BannerExpressBackupView.this.pvs();
            }
        });
        ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) (Pj.icD(this.icD, 45.0f) * icD);
            layoutParams.height = (int) (Pj.icD(this.icD, 45.0f) * icD);
        }
        if (this.vG.ea() != null && !TextUtils.isEmpty(this.vG.ea().pvs())) {
            com.bytedance.sdk.openadsdk.qh.vG.pvs().pvs(this.vG.ea().pvs(), this.vG.ea().icD(), this.vG.ea().vG(), imageView2, this.vG);
        }
        textView.setText(getTitle());
        if (!TextUtils.isEmpty(this.vG.Cwg())) {
            textView3.setText(this.vG.Cwg());
        } else {
            textView3.setVisibility(8);
        }
        Pj.pvs(textView2, tTRatingBar2, this.vG);
        pvs((View) imageView2, true);
        imageView2.setTag(520093762, Boolean.TRUE);
        pvs((View) this, true);
        pvs((View) textView3, true);
    }

    private void Jd() {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        if (this.vG != null) {
            int Ye = this.vG.Ye();
            float icD = (this.so * 1.0f) / Pj.icD(this.icD, 250.0f);
            if (this.vG.od() == null) {
                pvs sUS = sUS();
                this.IP = sUS;
                ImageView imageView = sUS.Wyp;
                RatioImageView ratioImageView = this.IP.pvs;
                ImageView imageView2 = this.IP.Jd;
                TextView textView5 = this.IP.NB;
                TextView textView6 = this.IP.icD;
                TextView textView7 = this.IP.vG;
                TextView textView8 = this.IP.Mxy;
                ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = (int) (Pj.icD(this.icD, 45.0f) * icD);
                    layoutParams.height = (int) (Pj.icD(this.icD, 45.0f) * icD);
                }
                textView5.setTextSize(2, Pj.pvs(this.icD, textView5.getTextSize()) * icD);
                textView6.setTextSize(2, Pj.pvs(this.icD, textView6.getTextSize()) * icD);
                textView7.setTextSize(2, Pj.pvs(this.icD, textView7.getTextSize()) * icD);
                textView8.setTextSize(2, Pj.pvs(this.icD, textView8.getTextSize()) * icD);
                try {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) textView5.getLayoutParams();
                    float f = icD - 1.0f;
                    if (f > 0.0f) {
                        layoutParams2.topMargin = Pj.icD(this.icD, f * 8.0f);
                    }
                    ((LinearLayout.LayoutParams) textView8.getLayoutParams()).setMargins(0, (int) (Pj.icD(this.icD, 16.0f) * icD), 0, 0);
                } catch (Throwable unused) {
                }
                View view = this.IP.so;
                if (view != null) {
                    view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.3
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            TTWebsiteActivity.pvs(BannerExpressBackupView.this.icD, BannerExpressBackupView.this.vG, BannerExpressBackupView.this.sUS);
                        }
                    });
                }
                if (Ye == 33) {
                    ratioImageView.setRatio(1.0f);
                } else {
                    if (ratioImageView.getParent() instanceof FrameLayout) {
                        ((LinearLayout.LayoutParams) ((FrameLayout) ratioImageView.getParent()).getLayoutParams()).weight = 2.5f;
                    }
                    ratioImageView.setRatio(1.91f);
                }
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        BannerExpressBackupView.this.pvs();
                    }
                });
                int icD2 = Pj.icD(this.icD, 15.0f);
                Pj.pvs(imageView, icD2, icD2, icD2, icD2);
                pvs((ImageView) ratioImageView);
                if (this.vG.ea() == null || TextUtils.isEmpty(this.vG.ea().pvs())) {
                    textView = textView8;
                    textView2 = textView7;
                    textView3 = textView6;
                    textView4 = textView5;
                } else {
                    textView = textView8;
                    textView2 = textView7;
                    textView3 = textView6;
                    textView4 = textView5;
                    com.bytedance.sdk.openadsdk.qh.vG.pvs().pvs(this.vG.ea().pvs(), this.vG.ea().icD(), this.vG.ea().vG(), imageView2, this.vG);
                }
                textView2.setText(getNameOrSource());
                textView4.setText(getNameOrSource());
                textView3.setText(getDescription());
                if (!TextUtils.isEmpty(this.vG.Cwg())) {
                    textView.setText(this.vG.Cwg());
                } else {
                    textView.setVisibility(8);
                }
                pvs((View) ratioImageView, true);
                ratioImageView.setTag(520093762, Boolean.TRUE);
                pvs((View) this, true);
                pvs((View) textView, true);
                return;
            }
            pvs yiw = yiw();
            this.IP = yiw;
            ImageView imageView3 = yiw.Wyp;
            TextView textView9 = this.IP.NB;
            TextView textView10 = this.IP.icD;
            TextView textView11 = this.IP.Mxy;
            RatioFrameLayout ratioFrameLayout = this.IP.qh;
            textView9.setTextSize(2, Pj.pvs(this.icD, textView9.getTextSize()) * icD);
            textView10.setTextSize(2, Pj.pvs(this.icD, textView10.getTextSize()) * icD);
            textView11.setTextSize(2, Pj.pvs(this.icD, textView11.getTextSize()) * icD);
            View view2 = this.IP.so;
            if (view2 != null) {
                view2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view3) {
                        TTWebsiteActivity.pvs(BannerExpressBackupView.this.icD, BannerExpressBackupView.this.vG, BannerExpressBackupView.this.sUS);
                    }
                });
            }
            if (Ye == 15) {
                ratioFrameLayout.setRatio(0.5625f);
            } else if (Ye == 5) {
                ratioFrameLayout.setRatio(1.7777778f);
            } else {
                ratioFrameLayout.setRatio(1.0f);
            }
            ratioFrameLayout.removeAllViews();
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            NativeVideoTsView videoView = getVideoView();
            if (videoView != null) {
                NativeExpressView nativeExpressView = this.bNS;
                if (nativeExpressView instanceof NativeExpressVideoView) {
                    videoView.setVideoAdInteractionListener((NativeExpressVideoView) nativeExpressView);
                }
                ratioFrameLayout.addView(videoView, layoutParams3);
                videoView.setAdCreativeClickListener(new NativeVideoTsView.pvs() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.6
                    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.pvs
                    public void pvs(View view3, int i) {
                        if (BannerExpressBackupView.this.vA != null) {
                            BannerExpressBackupView.this.vA.onAdClicked();
                        }
                    }
                });
                sUS clickCreativeListener = this.bNS.getClickCreativeListener();
                if (clickCreativeListener != null) {
                    clickCreativeListener.pvs(videoView.getNativeVideoController());
                }
            }
            textView9.setText(getNameOrSource());
            textView10.setText(getDescription());
            if (!TextUtils.isEmpty(this.vG.Cwg())) {
                textView11.setText(this.vG.Cwg());
            } else {
                textView11.setVisibility(8);
            }
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    BannerExpressBackupView.this.pvs();
                }
            });
            int icD3 = Pj.icD(this.icD, 15.0f);
            Pj.pvs(imageView3, icD3, icD3, icD3, icD3);
            pvs((View) videoView, true);
            if (videoView != null) {
                videoView.setTag(520093762, Boolean.TRUE);
            }
            pvs((View) this, true);
            pvs((View) textView11, true);
            pvs(ratioFrameLayout);
        }
    }

    public static Ju pvs(int i, int i2) {
        try {
            return ((double) i2) >= Math.floor((((double) i) * 450.0d) / 600.0d) ? pvs[1] : pvs[0];
        } catch (Throwable unused) {
            return pvs[0];
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView
    public void pvs() {
        if (this.NB != null) {
            this.NB.show();
        } else if (this.Jd != null) {
            this.Jd.pvs();
        } else {
            TTDelegateActivity.pvs(this.vG, this.mnm);
        }
    }

    private pvs NB() {
        int icD = Pj.icD(this.icD, 45.0f);
        int icD2 = Pj.icD(this.icD, 25.0f);
        int i = (int) (icD2 / 5.0d);
        int icD3 = Pj.icD(this.icD, 10.0f);
        int icD4 = Pj.icD(this.icD, 2.0f);
        int icD5 = Pj.icD(this.icD, 3.0f);
        Pj.icD(this.icD, 11.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.icD);
        addView(relativeLayout, -1, -1);
        ImageView imageView = new ImageView(this.icD);
        imageView.setId(520093738);
        TextView textView = new TextView(this.icD);
        textView.setId(520093730);
        TextView textView2 = new TextView(this.icD);
        textView2.setId(520093731);
        TTRatingBar2 tTRatingBar2 = new TTRatingBar2(this.icD, null);
        tTRatingBar2.setId(520093735);
        View pAGLogoView = new PAGLogoView(this.icD);
        pAGLogoView.setId(520093739);
        TextView textView3 = new TextView(this.icD);
        textView3.setId(520093703);
        ImageView imageView2 = new ImageView(this.icD);
        imageView2.setId(520093697);
        pvs pvsVar = new pvs(imageView, textView, textView2, tTRatingBar2, pAGLogoView, textView3, imageView2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(icD, icD);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        layoutParams.addRule(20);
        imageView.setLayoutParams(layoutParams);
        imageView.setBackgroundColor(uc.so(this.icD, "tt_white"));
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        relativeLayout.addView(imageView);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, icD2);
        layoutParams2.setMarginStart(icD3);
        layoutParams2.addRule(16, textView3.getId());
        layoutParams2.addRule(17, imageView.getId());
        textView.setTextDirection(5);
        layoutParams2.leftMargin = icD3;
        layoutParams2.addRule(0, textView3.getId());
        layoutParams2.addRule(1, imageView.getId());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(80);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF333333"));
        textView.setTextSize(12.0f);
        textView.setLayoutParams(layoutParams2);
        relativeLayout.addView(textView);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, icD2);
        layoutParams3.addRule(3, textView.getId());
        layoutParams3.setMarginStart(icD3);
        layoutParams3.addRule(17, imageView.getId());
        layoutParams3.leftMargin = icD3;
        layoutParams3.topMargin = icD4;
        layoutParams3.addRule(1, imageView.getId());
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(1);
        textView2.setTextColor(Color.parseColor("#FF333333"));
        textView2.setTextSize(12.0f);
        textView2.setTypeface(Typeface.defaultFromStyle(1));
        textView2.setLayoutParams(layoutParams3);
        relativeLayout.addView(textView2);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = icD4;
        layoutParams4.addRule(3, textView.getId());
        layoutParams4.addRule(6, textView2.getId());
        layoutParams4.setMarginStart(icD4);
        layoutParams4.addRule(17, textView2.getId());
        layoutParams4.addRule(16, textView3.getId());
        layoutParams4.leftMargin = icD4;
        layoutParams4.addRule(1, textView2.getId());
        layoutParams4.addRule(0, textView3.getId());
        tTRatingBar2.setLayoutParams(layoutParams4);
        relativeLayout.addView(tTRatingBar2);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(21);
        layoutParams5.setMarginEnd(icD5);
        layoutParams5.addRule(11);
        layoutParams5.addRule(12);
        layoutParams5.topMargin = icD5;
        layoutParams5.rightMargin = icD5;
        pAGLogoView.setLayoutParams(layoutParams5);
        relativeLayout.addView(pAGLogoView);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(11);
        layoutParams6.addRule(15);
        layoutParams6.setMarginEnd(icD2);
        layoutParams6.addRule(21);
        layoutParams6.rightMargin = icD2;
        textView3.setBackground(so.pvs(this.icD, "tt_backup_btn_1"));
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setGravity(17);
        textView3.setMaxLines(1);
        textView3.setPadding(icD3, i, icD3, i);
        textView3.setText(uc.pvs(this.icD, "tt_video_download_apk"));
        textView3.setTextColor(Color.parseColor("#f0f0f0"));
        textView3.setTextSize(10.0f);
        textView3.setLayoutParams(layoutParams6);
        relativeLayout.addView(textView3);
        int i2 = icD5 * 5;
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(i2, i2);
        layoutParams7.addRule(21);
        layoutParams7.setMarginEnd(icD5);
        layoutParams7.addRule(11);
        layoutParams7.topMargin = icD5;
        layoutParams7.rightMargin = icD5;
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setImageResource(uc.Jd(this.icD, "tt_dislike_icon"));
        imageView2.setLayoutParams(layoutParams7);
        relativeLayout.addView(imageView2);
        return pvsVar;
    }

    private pvs sUS() {
        float icD = Pj.icD(this.icD, 5.0f);
        float icD2 = Pj.icD(this.icD, 7.0f);
        float icD3 = Pj.icD(this.icD, 8.0f);
        float icD4 = Pj.icD(this.icD, 18.0f);
        float icD5 = Pj.icD(this.icD, 15.0f);
        float icD6 = Pj.icD(this.icD, 45.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.icD);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        int i = (int) icD3;
        relativeLayout.setPadding(i, i, i, i);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        TextView textView = new TextView(this.icD);
        textView.setId(520093730);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.width = -1;
        layoutParams2.setMarginEnd((int) icD4);
        textView.setTextDirection(5);
        int i2 = (int) icD4;
        layoutParams2.rightMargin = i2;
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(GravityCompat.START);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(14.0f);
        textView.setLayoutParams(layoutParams2);
        relativeLayout.addView(textView);
        TextView textView2 = new TextView(this.icD);
        textView2.setId(520093733);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.width = -1;
        layoutParams3.addRule(3, textView.getId());
        layoutParams3.topMargin = (int) (icD3 / 2.0f);
        layoutParams3.setMarginEnd(i2);
        textView2.setTextDirection(5);
        layoutParams3.rightMargin = i2;
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(GravityCompat.START);
        textView2.setMaxLines(2);
        textView2.setTextColor(Color.parseColor("#FFAEAEAE"));
        textView2.setTextSize(12.0f);
        textView2.setLayoutParams(layoutParams3);
        relativeLayout.addView(textView2);
        ImageView imageView = new ImageView(this.icD);
        imageView.setId(520093697);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        int i3 = (int) icD5;
        layoutParams4.width = i3;
        layoutParams4.height = i3;
        layoutParams4.addRule(21);
        layoutParams4.addRule(11);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageResource(uc.Jd(this.icD, "tt_titlebar_close_press_for_dark"));
        imageView.setLayoutParams(layoutParams4);
        relativeLayout.addView(imageView);
        LinearLayout linearLayout = new LinearLayout(this.icD);
        linearLayout.setLayoutDirection(3);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams5.addRule(3, textView2.getId());
        linearLayout.setLayoutParams(layoutParams5);
        linearLayout.setOrientation(0);
        relativeLayout.addView(linearLayout);
        FrameLayout frameLayout = new FrameLayout(this.icD);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, -1);
        layoutParams6.weight = 1.0f;
        frameLayout.setLayoutParams(layoutParams6);
        linearLayout.addView(frameLayout);
        RatioImageView ratioImageView = new RatioImageView(this.icD);
        ratioImageView.setId(520093736);
        ratioImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        frameLayout.addView(ratioImageView, new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout2 = new LinearLayout(this.icD);
        linearLayout2.setId(520093737);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -1);
        layoutParams7.weight = 1.0f;
        linearLayout2.setGravity(17);
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(layoutParams7);
        linearLayout.addView(linearLayout2);
        ImageView imageView2 = new ImageView(this.icD);
        imageView2.setId(520093738);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        int i4 = (int) icD6;
        layoutParams8.width = i4;
        layoutParams8.height = i4;
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setLayoutParams(layoutParams8);
        linearLayout2.addView(imageView2);
        TextView textView3 = new TextView(this.icD);
        textView3.setId(520093730);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams9.topMargin = (int) icD2;
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setGravity(17);
        textView3.setMaxLines(1);
        textView3.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView3.setTextSize(12.0f);
        textView3.setLayoutParams(layoutParams9);
        linearLayout2.addView(textView3);
        TextView textView4 = new TextView(this.icD);
        textView4.setId(520093703);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams10.topMargin = (int) (icD3 * 2.0f);
        textView4.setBackground(so.pvs(this.icD, "tt_backup_btn_1"));
        textView4.setEllipsize(TextUtils.TruncateAt.END);
        textView4.setMaxLines(1);
        int i5 = (int) (icD * 2.0f);
        int i6 = (int) icD;
        textView4.setPadding(i5, i6, i5, i6);
        textView4.setText(uc.pvs(this.icD, "tt_video_download_apk"));
        textView4.setTextColor(uc.so(this.icD, "tt_white"));
        textView4.setTextSize(10.0f);
        textView4.setLayoutParams(layoutParams10);
        linearLayout2.addView(textView4);
        View pAGLogoView = new PAGLogoView(this.icD);
        pAGLogoView.setId(520093739);
        RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams11.addRule(12);
        pAGLogoView.setLayoutParams(layoutParams11);
        relativeLayout.addView(pAGLogoView);
        return new pvs(imageView2, textView, pAGLogoView, textView4, imageView, textView3, textView2, ratioImageView);
    }

    private pvs yiw() {
        float icD = Pj.icD(this.icD, 4.0f);
        float icD2 = Pj.icD(this.icD, 5.0f);
        float icD3 = Pj.icD(this.icD, 8.0f);
        float icD4 = Pj.icD(this.icD, 15.0f);
        float icD5 = Pj.icD(this.icD, 18.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.icD);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        int i = (int) icD3;
        relativeLayout.setPadding(i, i, i, i);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        TextView textView = new TextView(this.icD);
        textView.setId(520093730);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.width = -1;
        layoutParams2.setMarginEnd((int) icD5);
        textView.setTextDirection(5);
        layoutParams2.rightMargin = (int) icD5;
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(GravityCompat.START);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(14.0f);
        textView.setLayoutParams(layoutParams2);
        relativeLayout.addView(textView);
        ImageView imageView = new ImageView(this.icD);
        imageView.setId(520093697);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        int i2 = (int) icD4;
        layoutParams3.width = i2;
        layoutParams3.height = i2;
        layoutParams3.addRule(21);
        layoutParams3.addRule(11);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageResource(uc.Jd(this.icD, "tt_titlebar_close_press_for_dark"));
        imageView.setLayoutParams(layoutParams3);
        relativeLayout.addView(imageView);
        TextView textView2 = new TextView(this.icD);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        textView2.setId(520093703);
        layoutParams4.addRule(11);
        layoutParams4.addRule(21);
        layoutParams4.addRule(12);
        layoutParams4.topMargin = i;
        textView2.setBackground(so.pvs(this.icD, "tt_backup_btn_1"));
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        textView2.setMaxLines(1);
        int i3 = (int) (2.0f * icD2);
        int i4 = (int) icD2;
        textView2.setPadding(i3, i4, i3, i4);
        textView2.setText(uc.pvs(this.icD, "tt_video_download_apk"));
        textView2.setTextColor(uc.so(this.icD, "tt_white"));
        textView2.setTextSize(10.0f);
        textView2.setLayoutParams(layoutParams4);
        relativeLayout.addView(textView2);
        TextView textView3 = new TextView(this.icD);
        textView3.setId(520093733);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(4, textView2.getId());
        layoutParams5.addRule(20);
        layoutParams5.addRule(16, textView2.getId());
        textView3.setTextDirection(5);
        layoutParams5.addRule(12);
        layoutParams5.rightMargin = (int) icD;
        layoutParams5.addRule(0, textView2.getId());
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setGravity(GravityCompat.START);
        textView3.setMaxLines(1);
        textView3.setTextColor(Color.parseColor("#FFAEAEAE"));
        textView3.setTextSize(12.0f);
        textView3.setLayoutParams(layoutParams5);
        relativeLayout.addView(textView3);
        FrameLayout frameLayout = new FrameLayout(this.icD);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams6.addRule(2, textView2.getId());
        layoutParams6.addRule(3, textView.getId());
        layoutParams6.topMargin = i;
        frameLayout.setLayoutParams(layoutParams6);
        relativeLayout.addView(frameLayout);
        RatioFrameLayout ratioFrameLayout = new RatioFrameLayout(this.icD);
        ratioFrameLayout.setId(520093736);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams7.gravity = 17;
        ratioFrameLayout.setLayoutParams(layoutParams7);
        frameLayout.addView(ratioFrameLayout);
        View pAGLogoView = new PAGLogoView(this.icD);
        pAGLogoView.setId(520093739);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(2, textView2.getId());
        pAGLogoView.setLayoutParams(layoutParams8);
        relativeLayout.addView(pAGLogoView);
        return new pvs(textView, pAGLogoView, textView2, imageView, textView3, ratioFrameLayout);
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.vA = pAGBannerAdWrapperListener;
    }

    private static class pvs {
        ImageView Jd;
        TextView Mxy;
        TextView NB;
        ImageView Wyp;
        public TextView icD;
        public RatioImageView pvs;
        private RatioFrameLayout qh;
        TextView sUS;
        View so;
        public TextView vG;
        TTRatingBar2 yiw;

        pvs(ImageView imageView, TextView textView, TextView textView2, TTRatingBar2 tTRatingBar2, View view, TextView textView3, ImageView imageView2) {
            this.Jd = imageView;
            this.NB = textView;
            this.sUS = textView2;
            this.yiw = tTRatingBar2;
            this.so = view;
            this.Mxy = textView3;
            this.Wyp = imageView2;
        }

        pvs(ImageView imageView, TextView textView, View view, TextView textView2, ImageView imageView2, TextView textView3, TextView textView4, RatioImageView ratioImageView) {
            this(imageView, textView, null, null, view, textView2, imageView2);
            this.vG = textView3;
            this.icD = textView4;
            this.pvs = ratioImageView;
        }

        pvs(TextView textView, View view, TextView textView2, ImageView imageView, TextView textView3, RatioFrameLayout ratioFrameLayout) {
            this(null, textView, null, null, view, textView2, imageView);
            this.icD = textView3;
            this.qh = ratioFrameLayout;
        }
    }
}
