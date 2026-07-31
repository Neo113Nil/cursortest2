package com.bytedance.sdk.openadsdk.core.fb;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.cn.fs.hhw;
import com.bytedance.sdk.openadsdk.core.iv.iqz;
import com.bytedance.sdk.openadsdk.core.iv.kw;
import com.bytedance.sdk.openadsdk.core.iv.phc;
import com.bytedance.sdk.openadsdk.core.model.cyb;
import com.bytedance.sdk.openadsdk.core.model.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.klz;
import com.bytedance.sdk.openadsdk.core.widget.mw;
import com.bytedance.sdk.openadsdk.core.widget.olo;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.rc;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.vungle.ads.internal.protos.Sdk;
import com.yandex.div.internal.widget.DivLayoutParams;
import java.util.List;

/* loaded from: classes10.dex */
public class fs extends com.bytedance.sdk.openadsdk.core.iv.zmn {
    public static kw[] zmn = {new kw(1, 6.4f, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50), new kw(4, 1.2f, 300, POBCommonConstants.DEFAULT_MIN_BITRATE)};
    private PAGBannerAdWrapperListener cn;
    private zmn klz;
    private phc mw;
    private String rt;

    @Override // com.bytedance.sdk.openadsdk.core.iv.zmn, com.bytedance.sdk.openadsdk.core.hhw.zn, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.zmn, com.bytedance.sdk.openadsdk.core.hhw.zn, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setClosedListenerKey(String str) {
        this.rt = str;
    }

    public fs(@NonNull Context context) {
        super(context);
        this.fs = context;
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.zmn
    protected void zmn(View view, int i, cyb cybVar) {
        phc phcVar = this.mw;
        if (phcVar != null) {
            phcVar.zmn(view, i, cybVar);
        }
    }

    void zmn(nqi nqiVar, phc phcVar, com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn znVar) {
        setBackgroundColor(-1);
        this.zn = nqiVar;
        this.mw = phcVar;
        this.hhw = "banner_ad";
        phcVar.addView(this, new ViewGroup.LayoutParams(-2, -2));
        fs();
    }

    private void fs() {
        kw zmn2 = zmn(this.mw.getExpectExpressWidth(), this.mw.getExpectExpressHeight());
        if (this.mw.getExpectExpressWidth() > 0 && this.mw.getExpectExpressHeight() > 0) {
            this.nps = jy.fs(this.fs, this.mw.getExpectExpressWidth());
            this.zg = jy.fs(this.fs, this.mw.getExpectExpressHeight());
        } else {
            int zn = jy.zn(this.fs);
            this.nps = zn;
            this.zg = Float.valueOf(zn / zmn2.fs).intValue();
        }
        int i = this.nps;
        if (i > 0 && i > jy.zn(this.fs)) {
            this.nps = jy.zn(this.fs);
            this.zg = Float.valueOf(this.zg * (jy.zn(this.fs) / this.nps)).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.nps, this.zg);
        }
        layoutParams.width = this.nps;
        layoutParams.height = this.zg;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        nqi nqiVar = this.zn;
        if (nqiVar != null) {
            int zq = nqiVar.zq();
            if (zq == 1010 || zq == 1011 || zq == 1012) {
                fb();
            } else {
                zmn(zmn2);
            }
        }
    }

    private void zmn(kw kwVar) {
        if (kwVar.zmn == 1) {
            zn();
        } else {
            btk();
        }
    }

    private void zn() {
        jy.fs(this.fs, 50.0f);
        zmn nps = nps();
        this.klz = nps;
        ImageView imageView = nps.zn;
        TextView textView = nps.fs;
        com.bytedance.sdk.openadsdk.core.widget.cyb cybVar = nps.fb;
        TextView textView2 = nps.nps;
        View view = nps.hhw;
        if (view != null) {
            view.setOnClickListener(iv());
        }
        if (this.zn.uaq() != null && !TextUtils.isEmpty(this.zn.uaq().zmn())) {
            com.bytedance.sdk.openadsdk.iqz.fs.fs().zmn(this.zn.uaq().zmn(), this.zn.uaq().fs(), this.zn.uaq().zn(), imageView, this.zn);
        }
        textView.setText(this.zn.db());
        if (!TextUtils.isEmpty(this.zn.gt())) {
            textView2.setText(this.zn.gt());
        } else {
            textView2.setVisibility(8);
        }
        jy.zmn((TextView) null, cybVar, this.zn);
        zmn((View) imageView, true);
        imageView.setTag(520093762, Boolean.TRUE);
        zmn((View) this, true);
        zmn((View) textView2, true);
    }

    private void fb() {
        zmn hhw = hhw();
        this.klz = hhw;
        View view = hhw.hhw;
        if (view != null) {
            view.setOnClickListener(iv());
        }
        mw mwVar = this.klz.zmn;
        if (mwVar != null) {
            List<kgc> tj = this.zn.tj();
            if (tj != null && !tj.isEmpty()) {
                com.bytedance.sdk.openadsdk.iqz.fs.fs().zmn(tj.get(0), mwVar, this.zn);
            }
            zmn((View) mwVar, true);
            mwVar.setTag(520093762, Boolean.TRUE);
        }
    }

    private void btk() {
        TextView textView;
        nqi nqiVar = this.zn;
        if (nqiVar != null) {
            int zq = nqiVar.zq();
            if (this.zn.mrt() == null) {
                zmn zg = zg();
                this.klz = zg;
                mw mwVar = zg.zmn;
                ImageView imageView = zg.zn;
                TextView textView2 = zg.fs;
                TextView textView3 = zg.nps;
                View view = zg.hhw;
                if (view != null) {
                    view.setOnClickListener(iv());
                }
                ViewGroup.LayoutParams layoutParams = mwVar.getLayoutParams();
                if (this.nps - (jy.fs(this.fs, 8.0f) * 2) >= ((this.zg - jy.fs(this.fs, 8.0f)) - (jy.fs(this.fs, 21.0f) * 2)) - jy.fs(this.fs, 52.0f)) {
                    layoutParams.width = -2;
                    layoutParams.height = -1;
                } else {
                    layoutParams.width = -1;
                    layoutParams.height = -2;
                }
                mwVar.setLayoutParams(layoutParams);
                if (zq == 33) {
                    mwVar.setRatio(1.0f);
                } else {
                    mwVar.setRatio(1.91f);
                }
                List<kgc> tj = this.zn.tj();
                if (tj != null && !tj.isEmpty()) {
                    com.bytedance.sdk.openadsdk.iqz.fs.fs().zmn(tj.get(0), mwVar, this.zn);
                    com.bytedance.sdk.openadsdk.iqz.fs.fs().zmn(tj.get(0).zmn(), this.klz.btk);
                }
                if (this.zn.uaq() == null || TextUtils.isEmpty(this.zn.uaq().zmn())) {
                    textView = textView2;
                } else {
                    textView = textView2;
                    com.bytedance.sdk.openadsdk.iqz.fs.fs().zmn(this.zn.uaq().zmn(), this.zn.uaq().fs(), this.zn.uaq().zn(), imageView, this.zn);
                }
                textView.setText(this.zn.db());
                if (!TextUtils.isEmpty(this.zn.gt())) {
                    textView3.setText(this.zn.gt());
                } else {
                    textView3.setVisibility(8);
                }
                jy.zmn((TextView) null, this.klz.fb, this.zn);
                zmn((View) mwVar, true);
                mwVar.setTag(520093762, Boolean.TRUE);
                zmn((View) this, true);
                zmn((View) textView3, true);
                return;
            }
            zmn bvs = bvs();
            this.klz = bvs;
            TextView textView4 = bvs.fs;
            TextView textView5 = bvs.nps;
            klz klzVar = bvs.zg;
            com.bytedance.sdk.openadsdk.iqz.fs.fs().zmn(this.zn.mrt().iv(), this.klz.btk);
            View view2 = this.klz.hhw;
            if (view2 != null) {
                view2.setOnClickListener(iv());
            }
            ViewGroup.LayoutParams layoutParams2 = klzVar.getLayoutParams();
            if (zq == 15) {
                layoutParams2.width = -2;
                layoutParams2.height = -1;
                klzVar.setLayoutParams(layoutParams2);
                klzVar.setRatio(0.5625f);
            } else if (zq == 5) {
                layoutParams2.width = -1;
                layoutParams2.height = -2;
                klzVar.setLayoutParams(layoutParams2);
                klzVar.setRatio(1.7777778f);
            } else {
                if (this.nps - (jy.fs(this.fs, 8.0f) * 2) >= ((this.zg - jy.fs(this.fs, 8.0f)) - (jy.fs(this.fs, 21.0f) * 2)) - jy.fs(this.fs, 52.0f)) {
                    layoutParams2.width = -2;
                    layoutParams2.height = -1;
                } else {
                    layoutParams2.width = -1;
                    layoutParams2.height = -2;
                }
                klzVar.setLayoutParams(layoutParams2);
                klzVar.setRatio(1.0f);
            }
            klzVar.removeAllViews();
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            com.bytedance.sdk.openadsdk.core.cn.fs.hhw videoView = getVideoView();
            if (videoView != null) {
                if (this.mw instanceof iqz) {
                    videoView.setNeedSelfManagerVideo(!((iqz) r7).rt());
                    ((iqz) this.mw).setBackupVideoView(videoView);
                    videoView.setVideoAdInteractionListener((iqz) this.mw);
                }
                klzVar.addView(videoView, layoutParams3);
                videoView.setAdCreativeClickListener(new hhw.zmn() { // from class: com.bytedance.sdk.openadsdk.core.fb.fs.1
                    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.hhw.zmn
                    public void zmn(View view3, int i) {
                        if (fs.this.cn != null) {
                            fs.this.cn.onAdClicked();
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.core.iv.bvs clickCreativeListener = this.mw.getClickCreativeListener();
                if (clickCreativeListener != null) {
                    clickCreativeListener.zmn(videoView.getNativeVideoController());
                }
            }
            if (this.zn.uaq() != null && !TextUtils.isEmpty(this.zn.uaq().zmn())) {
                com.bytedance.sdk.openadsdk.iqz.fs.fs().zmn(this.zn.uaq().zmn(), this.zn.uaq().fs(), this.zn.uaq().zn(), this.klz.zn, this.zn);
            }
            textView4.setText(this.zn.db());
            jy.zmn((TextView) null, this.klz.fb, this.zn);
            if (!TextUtils.isEmpty(this.zn.gt())) {
                textView5.setText(this.zn.gt());
            } else {
                textView5.setVisibility(8);
            }
            zmn((View) videoView, true);
            if (videoView != null) {
                videoView.setTag(520093762, Boolean.TRUE);
            }
            zmn((View) this, true);
            zmn((View) textView5, true);
            zmn(klzVar);
        }
    }

    public static kw zmn(int i, int i2) {
        try {
            return ((double) i2) >= Math.floor((((double) i) * 450.0d) / 600.0d) ? zmn[1] : zmn[0];
        } catch (Throwable unused) {
            return zmn[0];
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.zmn
    public void zmn() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.btk;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.zn.zn znVar = this.fb;
        if (znVar != null) {
            znVar.zmn();
        } else {
            TTDelegateActivity.zmn(this.zn, this.rt);
        }
    }

    private zmn hhw() {
        int fs = jy.fs(this.fs, 8.0f);
        mw mwVar = new mw(this.fs);
        mwVar.setId(520093736);
        mwVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(mwVar, layoutParams);
        View createPAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.fs, this.zn);
        createPAGLogoViewByMaterial.setId(520093739);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(fs, fs, 0, 0);
        layoutParams2.gravity = DivLayoutParams.DEFAULT_GRAVITY;
        createPAGLogoViewByMaterial.setLayoutParams(layoutParams2);
        addView(createPAGLogoViewByMaterial);
        return new zmn(createPAGLogoViewByMaterial, mwVar);
    }

    private zmn nps() {
        int fs = jy.fs(this.fs, 38.0f);
        int fs2 = (int) (jy.fs(this.fs, 25.0f) / 5.0d);
        int fs3 = jy.fs(this.fs, 10.0f);
        int fs4 = jy.fs(this.fs, 2.0f);
        int fs5 = jy.fs(this.fs, 6.0f);
        int fs6 = jy.fs(this.fs, 8.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.fs);
        addView(relativeLayout, -1, -1);
        olo oloVar = new olo(this.fs);
        oloVar.setId(520093738);
        TextView textView = new TextView(this.fs);
        textView.setId(520093730);
        com.bytedance.sdk.openadsdk.core.widget.cyb cybVar = new com.bytedance.sdk.openadsdk.core.widget.cyb(this.fs);
        cybVar.setId(520093735);
        View createPAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.fs, this.zn);
        createPAGLogoViewByMaterial.setId(520093739);
        TextView textView2 = new TextView(this.fs);
        textView2.setId(520093703);
        zmn zmnVar = new zmn(oloVar, textView, cybVar, createPAGLogoViewByMaterial, textView2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(fs, fs);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        layoutParams.addRule(20);
        layoutParams.setMarginStart(fs5);
        layoutParams.setMargins(fs5, 0, 0, 0);
        oloVar.setLayoutParams(layoutParams);
        oloVar.setBackgroundColor(-1);
        oloVar.setScaleType(ImageView.ScaleType.FIT_XY);
        relativeLayout.addView(oloVar);
        LinearLayout linearLayout = new LinearLayout(this.fs);
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(16, textView2.getId());
        layoutParams2.addRule(17, oloVar.getId());
        layoutParams2.setMarginStart(fs6);
        layoutParams2.setMarginEnd(fs6);
        layoutParams2.addRule(0, textView2.getId());
        layoutParams2.addRule(1, oloVar.getId());
        layoutParams2.setMargins(fs6, 0, fs6, 0);
        relativeLayout.addView(linearLayout, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        textView.setTextDirection(5);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity(80);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF333333"));
        textView.setTextSize(12.0f);
        textView.setLayoutParams(layoutParams3);
        linearLayout.addView(textView);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = fs4;
        cybVar.setLayoutParams(layoutParams4);
        linearLayout.addView(cybVar);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(20);
        layoutParams5.addRule(9);
        layoutParams5.addRule(12);
        createPAGLogoViewByMaterial.setLayoutParams(layoutParams5);
        relativeLayout.addView(createPAGLogoViewByMaterial);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(11);
        layoutParams6.addRule(15);
        layoutParams6.setMarginEnd(fs5);
        layoutParams6.addRule(21);
        layoutParams6.rightMargin = fs5;
        textView2.setBackground(rc.zmn(this.fs, 12));
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setMaxLines(1);
        textView2.setPadding(fs3, fs2, fs3, fs2);
        textView2.setText(doe.zmn(this.fs, "tt_video_download_apk"));
        textView2.setTextColor(Color.parseColor("#f0f0f0"));
        textView2.setTextSize(10.0f);
        textView2.setLayoutParams(layoutParams6);
        relativeLayout.addView(textView2);
        return zmnVar;
    }

    private zmn zg() {
        int fs = jy.fs(this.fs, 8.0f);
        int fs2 = jy.fs(this.fs, 21.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.fs);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        relativeLayout.setPadding(fs, fs, fs, fs2);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this.fs);
        linearLayout.setId(520093737);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(linearLayout);
        olo oloVar = new olo(this.fs);
        oloVar.setId(520093738);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(jy.fs(this.fs, 52.0f), jy.fs(this.fs, 52.0f));
        oloVar.setScaleType(ImageView.ScaleType.FIT_XY);
        oloVar.setLayoutParams(layoutParams3);
        linearLayout.addView(oloVar);
        LinearLayout linearLayout2 = new LinearLayout(this.fs);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.leftMargin = fs;
        layoutParams4.rightMargin = fs;
        layoutParams4.setMarginStart(fs);
        layoutParams4.setMarginEnd(fs);
        linearLayout.addView(linearLayout2, layoutParams4);
        TextView textView = new TextView(this.fs);
        textView.setId(520093730);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(16.0f);
        textView.setLayoutParams(layoutParams5);
        linearLayout2.addView(textView);
        com.bytedance.sdk.openadsdk.core.widget.cyb cybVar = new com.bytedance.sdk.openadsdk.core.widget.cyb(this.fs);
        cybVar.setId(520093735);
        linearLayout2.addView(cybVar, new LinearLayout.LayoutParams(-2, -2));
        TextView textView2 = new TextView(this.fs);
        textView2.setId(520093703);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(jy.fs(this.fs, 76.0f), jy.fs(this.fs, 36.0f));
        textView2.setBackground(rc.zmn(this.fs, 18));
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(1);
        textView2.setGravity(17);
        textView2.setText(doe.zmn(this.fs, "tt_video_download_apk"));
        textView2.setTextColor(-1);
        textView2.setTextSize(14.0f);
        textView2.setLayoutParams(layoutParams6);
        linearLayout.addView(textView2);
        FrameLayout frameLayout = new FrameLayout(this.fs);
        frameLayout.setLayoutDirection(3);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams7.addRule(2, linearLayout.getId());
        layoutParams7.bottomMargin = fs2;
        frameLayout.setLayoutParams(layoutParams7);
        relativeLayout.addView(frameLayout);
        mw mwVar = new mw(this.fs);
        mwVar.setId(520093736);
        mwVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams8.gravity = 17;
        frameLayout.addView(mwVar, layoutParams8);
        View createPAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.fs, this.zn);
        createPAGLogoViewByMaterial.setId(520093739);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams9.addRule(10);
        layoutParams9.addRule(9);
        layoutParams9.setMargins(fs, fs, 0, 0);
        createPAGLogoViewByMaterial.setLayoutParams(layoutParams9);
        relativeLayout.addView(createPAGLogoViewByMaterial);
        return new zmn(oloVar, createPAGLogoViewByMaterial, textView2, textView, mwVar, cybVar, frameLayout);
    }

    private zmn bvs() {
        int fs = jy.fs(this.fs, 8.0f);
        int fs2 = jy.fs(this.fs, 21.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.fs);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        relativeLayout.setPadding(fs, fs, fs, fs2);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this.fs);
        linearLayout.setId(520093737);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(linearLayout);
        olo oloVar = new olo(this.fs);
        oloVar.setId(520093738);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(jy.fs(this.fs, 52.0f), jy.fs(this.fs, 52.0f));
        oloVar.setScaleType(ImageView.ScaleType.FIT_XY);
        oloVar.setLayoutParams(layoutParams3);
        linearLayout.addView(oloVar);
        LinearLayout linearLayout2 = new LinearLayout(this.fs);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.leftMargin = fs;
        layoutParams4.rightMargin = fs;
        layoutParams4.setMarginStart(fs);
        layoutParams4.setMarginEnd(fs);
        linearLayout.addView(linearLayout2, layoutParams4);
        TextView textView = new TextView(this.fs);
        textView.setId(520093730);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(16.0f);
        textView.setLayoutParams(layoutParams5);
        linearLayout2.addView(textView);
        com.bytedance.sdk.openadsdk.core.widget.cyb cybVar = new com.bytedance.sdk.openadsdk.core.widget.cyb(this.fs);
        cybVar.setId(520093735);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.topMargin = jy.fs(this.fs, 4.0f);
        linearLayout2.addView(cybVar, layoutParams6);
        TextView textView2 = new TextView(this.fs);
        textView2.setId(520093703);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(jy.fs(this.fs, 76.0f), jy.fs(this.fs, 36.0f));
        textView2.setBackground(rc.zmn(this.fs, 18));
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(1);
        textView2.setGravity(17);
        textView2.setText(doe.zmn(this.fs, "tt_video_download_apk"));
        textView2.setTextColor(-1);
        textView2.setTextSize(14.0f);
        textView2.setLayoutParams(layoutParams7);
        linearLayout.addView(textView2);
        FrameLayout frameLayout = new FrameLayout(this.fs);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams8.addRule(2, linearLayout.getId());
        layoutParams8.bottomMargin = fs2;
        frameLayout.setLayoutParams(layoutParams8);
        relativeLayout.addView(frameLayout);
        klz klzVar = new klz(this.fs);
        klzVar.setId(520093736);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams9.gravity = 17;
        klzVar.setLayoutParams(layoutParams9);
        frameLayout.addView(klzVar);
        View createPAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.fs, this.zn);
        createPAGLogoViewByMaterial.setId(520093739);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams10.addRule(10);
        layoutParams10.addRule(9);
        layoutParams10.setMargins(fs, fs, 0, 0);
        createPAGLogoViewByMaterial.setLayoutParams(layoutParams10);
        relativeLayout.addView(createPAGLogoViewByMaterial);
        return new zmn(oloVar, createPAGLogoViewByMaterial, textView2, textView, klzVar, cybVar, frameLayout);
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.cn = pAGBannerAdWrapperListener;
    }

    private View.OnClickListener iv() {
        return new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.fb.fs.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/fb/fs$2;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_fs$2_onClick_0f754702aa418dbb5f2da596c3bdb941(view);
            }

            public void safedk_fs$2_onClick_0f754702aa418dbb5f2da596c3bdb941(View p0) {
                if (!com.bytedance.sdk.openadsdk.utils.fs.btk() || !com.bytedance.sdk.openadsdk.core.kgc.fb().am()) {
                    TTWebsiteActivity.zmn(((com.bytedance.sdk.openadsdk.core.iv.zmn) fs.this).fs, ((com.bytedance.sdk.openadsdk.core.iv.zmn) fs.this).zn, ((com.bytedance.sdk.openadsdk.core.iv.zmn) fs.this).hhw);
                } else {
                    IABLandingPageActivity.zmn(((com.bytedance.sdk.openadsdk.core.iv.zmn) fs.this).fs, ((com.bytedance.sdk.openadsdk.core.iv.zmn) fs.this).zn, ((com.bytedance.sdk.openadsdk.core.iv.zmn) fs.this).hhw);
                }
            }
        };
    }

    private static class zmn {
        FrameLayout btk;
        com.bytedance.sdk.openadsdk.core.widget.cyb fb;
        public TextView fs;
        View hhw;
        TextView nps;
        private klz zg;
        public mw zmn;
        ImageView zn;

        zmn(ImageView imageView, TextView textView, com.bytedance.sdk.openadsdk.core.widget.cyb cybVar, View view, TextView textView2) {
            this.zn = imageView;
            this.fs = textView;
            this.fb = cybVar;
            this.hhw = view;
            this.nps = textView2;
        }

        public zmn(ImageView imageView, View view, TextView textView, TextView textView2, mw mwVar, com.bytedance.sdk.openadsdk.core.widget.cyb cybVar, FrameLayout frameLayout) {
            this.zn = imageView;
            this.hhw = view;
            this.nps = textView;
            this.fs = textView2;
            this.zmn = mwVar;
            this.fb = cybVar;
            this.btk = frameLayout;
        }

        public zmn(ImageView imageView, View view, TextView textView, TextView textView2, klz klzVar, com.bytedance.sdk.openadsdk.core.widget.cyb cybVar, FrameLayout frameLayout) {
            this.zn = imageView;
            this.hhw = view;
            this.nps = textView;
            this.fs = textView2;
            this.zg = klzVar;
            this.fb = cybVar;
            this.btk = frameLayout;
        }

        public zmn(View view, mw mwVar) {
            this.hhw = view;
            this.zmn = mwVar;
        }
    }
}
