package com.bytedance.sdk.openadsdk.core.fb;

import android.content.Context;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.cn.fs.hhw;
import com.bytedance.sdk.openadsdk.core.iv.kw;
import com.bytedance.sdk.openadsdk.core.iv.phc;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.cyb;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.klz;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class bvs extends com.bytedance.sdk.openadsdk.core.iv.zmn implements zn.fb, zn.InterfaceC0102zn {
    private String cn;
    private long cyb;
    private phc klz;
    private com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn mw;
    private PAGBannerAdWrapperListener olo;
    private com.bytedance.sdk.openadsdk.core.cn.fs.hhw rt;
    public boolean zmn;

    private static class zmn {
        public com.bytedance.sdk.openadsdk.core.hhw.fb btk;
        public PAGLogoView fb;
        public klz fs;
        public FrameLayout zmn;
        public com.bytedance.sdk.openadsdk.core.hhw.fb zn;

        private zmn() {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.zmn, com.bytedance.sdk.openadsdk.core.hhw.zn, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.InterfaceC0102zn
    public void g_() {
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.InterfaceC0102zn
    public void h_() {
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.InterfaceC0102zn
    public void i_() {
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.InterfaceC0102zn
    public void j_() {
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

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.fb
    public void zmn(int i, int i2) {
    }

    public bvs(@NonNull Context context) {
        super(context);
        this.zmn = true;
        this.fs = context;
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.zmn
    protected void zmn(View view, int i, cyb cybVar) {
        phc phcVar = this.klz;
        if (phcVar != null) {
            phcVar.zmn(view, i, cybVar);
            com.bytedance.sdk.openadsdk.core.cn.fs.hhw hhwVar = this.rt;
            if (hhwVar == null || hhwVar.getNativeVideoController() == null) {
                return;
            }
            this.rt.getNativeVideoController().hgd();
        }
    }

    public void setClosedListenerKey(String str) {
        this.cn = str;
    }

    public void zmn(nqi nqiVar, phc phcVar, com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn znVar) {
        setBackgroundColor(-16777216);
        this.zn = nqiVar;
        this.klz = phcVar;
        this.mw = znVar;
        this.hhw = "banner_ad";
        phcVar.addView(this, new ViewGroup.LayoutParams(-2, -2));
        btk();
    }

    private void btk() {
        kw zmn2 = fs.zmn(this.klz.getExpectExpressWidth(), this.klz.getExpectExpressHeight());
        if (this.klz.getExpectExpressWidth() > 0 && this.klz.getExpectExpressHeight() > 0) {
            this.nps = jy.fs(this.fs, this.klz.getExpectExpressWidth());
            this.zg = jy.fs(this.fs, this.klz.getExpectExpressHeight());
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
        zmn(zmn2);
    }

    private void zmn(kw kwVar) {
        View view;
        nqi nqiVar = this.zn;
        if (nqiVar != null) {
            int zq = nqiVar.zq();
            zmn fs = fs(kwVar);
            if (fs == null || (view = fs.zmn) == null) {
                return;
            }
            addView(view);
            com.bytedance.sdk.openadsdk.core.hhw.fb fbVar = fs.zn;
            PAGLogoView pAGLogoView = fs.fb;
            com.bytedance.sdk.openadsdk.core.hhw.fb fbVar2 = fs.btk;
            if (fbVar2 != null && this.zn.nqi()) {
                jy.zmn((View) fbVar2, 0);
                com.bytedance.sdk.openadsdk.iqz.fs.fs().zmn((int) jy.zmn(kgc.zmn(), 11.0f, true), fbVar2, this.zn);
            }
            com.bytedance.sdk.openadsdk.core.cn.fs.hhw videoView = getVideoView();
            if (videoView != null) {
                this.rt = videoView;
                videoView.setVideoAdLoadListener(this);
                this.rt.setVideoAdInteractionListener(this);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Pair(fbVar, FriendlyObstructionPurpose.CLOSE_AD));
                FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                arrayList.add(new Pair(pAGLogoView, friendlyObstructionPurpose));
                arrayList.add(new Pair(fbVar2, friendlyObstructionPurpose));
                this.rt.zmn(arrayList);
                this.rt.setAdCreativeClickListener(new hhw.zmn() { // from class: com.bytedance.sdk.openadsdk.core.fb.bvs.1
                    @Override // com.bytedance.sdk.openadsdk.core.cn.fs.hhw.zmn
                    public void zmn(View view2, int i) {
                        if (bvs.this.olo != null) {
                            bvs.this.olo.onAdClicked();
                        }
                    }
                });
            }
            if (pAGLogoView != null) {
                pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.fb.bvs.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/fb/bvs$2;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(h.u, view2);
                        safedk_bvs$2_onClick_125d76bc114c3c23277e09cdef46cfbf(view2);
                    }

                    public void safedk_bvs$2_onClick_125d76bc114c3c23277e09cdef46cfbf(View p0) {
                        if (!com.bytedance.sdk.openadsdk.utils.fs.btk() || !kgc.fb().am()) {
                            TTWebsiteActivity.zmn(((com.bytedance.sdk.openadsdk.core.iv.zmn) bvs.this).fs, ((com.bytedance.sdk.openadsdk.core.iv.zmn) bvs.this).zn, ((com.bytedance.sdk.openadsdk.core.iv.zmn) bvs.this).hhw);
                        } else {
                            IABLandingPageActivity.zmn(((com.bytedance.sdk.openadsdk.core.iv.zmn) bvs.this).fs, ((com.bytedance.sdk.openadsdk.core.iv.zmn) bvs.this).zn, ((com.bytedance.sdk.openadsdk.core.iv.zmn) bvs.this).hhw);
                        }
                    }
                });
            }
            if (fbVar != null) {
                fbVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.fb.bvs.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/fb/bvs$3;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(h.u, view2);
                        safedk_bvs$3_onClick_d1c2edf554a0d01ca4857ac0c08594e9(view2);
                    }

                    public void safedk_bvs$3_onClick_d1c2edf554a0d01ca4857ac0c08594e9(View p0) {
                        bvs.this.zmn();
                    }
                });
            }
            klz klzVar = fs.fs;
            nqi nqiVar2 = this.zn;
            if (nqiVar2 != null && nqiVar2.bm() != null && klzVar != null) {
                int iv = this.zn.bm().iv();
                float rc = this.zn.bm().rc();
                if (iv > 0 && rc > 0.0f) {
                    klzVar.setRatio(iv / rc);
                } else if (zq == 15) {
                    klzVar.setRatio(0.5625f);
                } else if (zq == 5) {
                    klzVar.setRatio(1.7777778f);
                } else {
                    klzVar.setRatio(1.0f);
                }
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (videoView != null && klzVar != null) {
                klzVar.addView(videoView, layoutParams);
                videoView.setTag(520093762, Boolean.TRUE);
            }
            zmn((View) videoView, true);
            zmn((View) this, true);
            zmn(klzVar);
        }
    }

    private zmn fs(kw kwVar) {
        zmn zmnVar = new zmn();
        zmnVar.zmn = new FrameLayout(this.fs);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        layoutParams.width = -1;
        layoutParams.height = -1;
        zmnVar.zmn.setLayoutParams(layoutParams);
        zmnVar.fs = new klz(this.fs);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 17;
        zmnVar.fs.setLayoutParams(layoutParams2);
        zmnVar.zmn.addView(zmnVar.fs);
        int fs = jy.fs(this.fs, 5.0f);
        if (kwVar != null && kwVar.zmn == 1) {
            zmnVar.zn = com.bytedance.sdk.openadsdk.core.widget.hhw.zmn(getContext());
        } else {
            zmnVar.zn = com.bytedance.sdk.openadsdk.core.widget.hhw.fs(getContext());
        }
        zmnVar.zn.setId(520093697);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 8388613;
        layoutParams3.setMargins(fs, fs, fs, fs);
        zmnVar.zn.setLayoutParams(layoutParams3);
        zmnVar.zmn.addView(zmnVar.zn);
        zmnVar.fb = PAGLogoView.createPAGLogoViewByMaterial(this.fs, this.zn);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 8388691;
        layoutParams4.setMargins(fs, fs, fs, fs);
        zmnVar.fb.setLayoutParams(layoutParams4);
        zmnVar.zmn.addView(zmnVar.fb);
        zmnVar.btk = new com.bytedance.sdk.openadsdk.core.hhw.fb(this.fs);
        int fs2 = jy.fs(this.fs, 11.0f);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(fs2, fs2);
        layoutParams5.gravity = 8388693;
        layoutParams5.rightMargin = fs;
        layoutParams5.bottomMargin = fs;
        zmnVar.btk.setVisibility(8);
        zmnVar.btk.setScaleType(ImageView.ScaleType.FIT_CENTER);
        zmnVar.btk.setLayoutParams(layoutParams5);
        zmnVar.zmn.addView(zmnVar.btk);
        return zmnVar;
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
            TTDelegateActivity.zmn(this.zn, this.cn);
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.InterfaceC0102zn
    public void zmn(long j, long j2) {
        this.cyb = j;
    }

    public long getVideoProgress() {
        return this.cyb;
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.olo = pAGBannerAdWrapperListener;
    }
}
