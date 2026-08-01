package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.bykv.vk.openvk.component.video.api.Jd.vG;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.IP;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.Ju;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.RatioFrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.ShadowImageView;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.so;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class VastBannerBackupView extends BackupView implements vG.Jd, vG.InterfaceC0016vG {
    private com.com.bytedance.overseas.sdk.pvs.vG IP;
    private NativeExpressView Ju;
    private NativeVideoTsView bNS;
    private long cR;
    private ShadowImageView mnm;
    public boolean pvs;
    private String vA;
    private PAGBannerAdWrapperListener zM;

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.InterfaceC0016vG
    public void e_() {
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.InterfaceC0016vG
    public void h_() {
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.InterfaceC0016vG
    public void i_() {
    }

    public VastBannerBackupView(Context context) {
        super(context);
        this.pvs = true;
        this.icD = context;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView
    protected void pvs(View view, int i, IP ip) {
        NativeExpressView nativeExpressView = this.Ju;
        if (nativeExpressView != null) {
            nativeExpressView.pvs(view, i, ip);
            NativeVideoTsView nativeVideoTsView = this.bNS;
            if (nativeVideoTsView == null || !(nativeVideoTsView.getNativeVideoController() instanceof com.bytedance.sdk.openadsdk.core.video.nativevideo.vG)) {
                return;
            }
            ((com.bytedance.sdk.openadsdk.core.video.nativevideo.vG) this.bNS.getNativeVideoController()).Pj();
        }
    }

    public void setClosedListenerKey(String str) {
        this.vA = str;
    }

    public void pvs(cR cRVar, NativeExpressView nativeExpressView, com.com.bytedance.overseas.sdk.pvs.vG vGVar) {
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.vG = cRVar;
        this.Ju = nativeExpressView;
        this.IP = vGVar;
        this.sUS = "banner_ad";
        this.Ju.addView(this, new ViewGroup.LayoutParams(-2, -2));
        NB();
    }

    private void NB() {
        Ju pvs2 = BannerExpressBackupView.pvs(this.Ju.getExpectExpressWidth(), this.Ju.getExpectExpressHeight());
        if (this.Ju.getExpectExpressWidth() > 0 && this.Ju.getExpectExpressHeight() > 0) {
            this.yiw = Pj.icD(this.icD, this.Ju.getExpectExpressWidth());
            this.so = Pj.icD(this.icD, this.Ju.getExpectExpressHeight());
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
        sUS();
    }

    private void sUS() {
        if (this.vG != null) {
            int Ye = this.vG.Ye();
            pvs yiw = yiw();
            if (yiw == null || yiw.pvs == null) {
                return;
            }
            addView(yiw.pvs);
            ShadowImageView shadowImageView = yiw.Jd;
            PAGLogoView pAGLogoView = yiw.NB;
            PAGImageView pAGImageView = yiw.sUS;
            if (pAGImageView != null && this.vG.so()) {
                Pj.pvs((View) pAGImageView, 0);
                com.bytedance.sdk.openadsdk.qh.vG.pvs().pvs((int) Pj.pvs(mnm.pvs(), 11.0f, true), pAGImageView, this.vG);
            }
            this.mnm = yiw.vG;
            NativeVideoTsView videoView = getVideoView();
            if (videoView instanceof NativeVideoTsView) {
                this.bNS = videoView;
                videoView.setVideoAdLoadListener(this);
                this.bNS.setVideoAdInteractionListener(this);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Pair(shadowImageView, FriendlyObstructionPurpose.CLOSE_AD));
                arrayList.add(new Pair(pAGLogoView, FriendlyObstructionPurpose.OTHER));
                arrayList.add(new Pair(pAGImageView, FriendlyObstructionPurpose.OTHER));
                arrayList.add(new Pair(this.mnm, FriendlyObstructionPurpose.VIDEO_CONTROLS));
                this.bNS.pvs(arrayList);
                this.bNS.setAdCreativeClickListener(new NativeVideoTsView.pvs() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.VastBannerBackupView.1
                    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.pvs
                    public void pvs(View view, int i) {
                        if (VastBannerBackupView.this.zM != null) {
                            VastBannerBackupView.this.zM.onAdClicked();
                        }
                    }
                });
            }
            if (pAGLogoView != null) {
                pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.VastBannerBackupView.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        TTWebsiteActivity.pvs(VastBannerBackupView.this.icD, VastBannerBackupView.this.vG, VastBannerBackupView.this.sUS);
                    }
                });
            }
            if (shadowImageView != null) {
                shadowImageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.VastBannerBackupView.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        VastBannerBackupView.this.pvs();
                    }
                });
                NativeExpressView nativeExpressView = this.Ju;
                if (nativeExpressView != null) {
                    if (nativeExpressView.getClickListener() != null) {
                        this.Ju.getClickListener().icD(shadowImageView);
                    }
                    if (this.Ju.getClickCreativeListener() != null) {
                        this.Ju.getClickCreativeListener().icD(shadowImageView);
                    }
                }
            }
            ShadowImageView shadowImageView2 = this.mnm;
            if (shadowImageView2 != null) {
                shadowImageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.VastBannerBackupView.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (VastBannerBackupView.this.bNS != null) {
                            boolean z = !VastBannerBackupView.this.bNS.Mxy();
                            VastBannerBackupView vastBannerBackupView = VastBannerBackupView.this;
                            Drawable pvs2 = z ? so.pvs(vastBannerBackupView.getContext(), "tt_mute_wrapper") : so.pvs(vastBannerBackupView.getContext(), "tt_unmute_wrapper");
                            VastBannerBackupView.this.bNS.setIsQuiet(z);
                            VastBannerBackupView.this.mnm.setImageDrawable(pvs2);
                            if (VastBannerBackupView.this.vG == null || VastBannerBackupView.this.vG.ig() == null || VastBannerBackupView.this.vG.ig().pvs() == null) {
                                return;
                            }
                            if (z) {
                                VastBannerBackupView.this.vG.ig().pvs().so(VastBannerBackupView.this.cR);
                            } else {
                                VastBannerBackupView.this.vG.ig().pvs().Mxy(VastBannerBackupView.this.cR);
                            }
                        }
                    }
                });
            }
            RatioFrameLayout ratioFrameLayout = yiw.icD;
            if (this.vG != null && this.vG.ig() != null && ratioFrameLayout != null) {
                int kj = this.vG.ig().kj();
                float Ju = this.vG.ig().Ju();
                if (kj > 0 && Ju > 0.0f) {
                    ratioFrameLayout.setRatio(kj / Ju);
                } else if (Ye == 15) {
                    ratioFrameLayout.setRatio(0.5625f);
                } else if (Ye == 5) {
                    ratioFrameLayout.setRatio(1.7777778f);
                } else {
                    ratioFrameLayout.setRatio(1.0f);
                }
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (videoView != null && ratioFrameLayout != null) {
                ratioFrameLayout.addView(videoView, layoutParams);
                videoView.setTag(520093762, Boolean.TRUE);
            }
            pvs((View) videoView, true);
            pvs((View) this, true);
            pvs(ratioFrameLayout);
        }
    }

    private pvs yiw() {
        pvs pvsVar = new pvs();
        pvsVar.pvs = new FrameLayout(this.icD);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        layoutParams.width = -1;
        layoutParams.height = -1;
        pvsVar.pvs.setLayoutParams(layoutParams);
        pvsVar.icD = new RatioFrameLayout(this.icD);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 17;
        pvsVar.icD.setLayoutParams(layoutParams2);
        pvsVar.pvs.addView(pvsVar.icD);
        int icD = Pj.icD(this.icD, 20.0f);
        int icD2 = Pj.icD(this.icD, 5.0f);
        pvsVar.vG = new ShadowImageView(this.icD);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(icD, icD);
        layoutParams3.setMargins(icD2, icD2, icD2, icD2);
        pvsVar.vG.setScaleType(ImageView.ScaleType.CENTER);
        pvsVar.vG.setImageDrawable(so.pvs(this.icD, "tt_mute_wrapper"));
        pvsVar.vG.setBackground(so.pvs(this.icD, "tt_mute_btn_bg"));
        pvsVar.vG.setLayoutParams(layoutParams3);
        pvsVar.pvs.addView(pvsVar.vG);
        pvsVar.Jd = new ShadowImageView(this.icD);
        pvsVar.Jd.setId(520093697);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(icD, icD);
        layoutParams4.gravity = GravityCompat.END;
        int icD3 = Pj.icD(this.icD, 7.0f);
        int icD4 = Pj.icD(this.icD, 3.0f);
        layoutParams4.setMargins(icD3, icD3, icD3, icD3);
        pvsVar.Jd.setScaleType(ImageView.ScaleType.FIT_CENTER);
        pvsVar.Jd.setPadding(icD4, icD4, icD4, icD4);
        pvsVar.Jd.setImageDrawable(uc.vG(this.icD, "tt_pangle_ad_close_drawable"));
        pvsVar.Jd.setBackground(so.pvs(this.icD, "tt_mute_btn_bg"));
        pvsVar.Jd.setLayoutParams(layoutParams4);
        pvsVar.pvs.addView(pvsVar.Jd);
        pvsVar.NB = new PAGLogoView(this.icD);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 8388691;
        layoutParams5.setMargins(icD2, icD2, icD2, icD2);
        pvsVar.NB.setLayoutParams(layoutParams5);
        pvsVar.pvs.addView(pvsVar.NB);
        pvsVar.sUS = new PAGImageView(this.icD);
        int icD5 = Pj.icD(this.icD, 11.0f);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(icD5, icD5);
        layoutParams6.gravity = 8388693;
        layoutParams6.rightMargin = icD2;
        layoutParams6.bottomMargin = icD2;
        pvsVar.sUS.setVisibility(8);
        pvsVar.sUS.setScaleType(ImageView.ScaleType.FIT_CENTER);
        pvsVar.sUS.setLayoutParams(layoutParams6);
        pvsVar.pvs.addView(pvsVar.sUS);
        return pvsVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView
    public void pvs() {
        if (this.NB != null) {
            this.NB.show();
        } else if (this.Jd != null) {
            this.Jd.pvs();
        } else {
            TTDelegateActivity.pvs(this.vG, this.vA);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.Jd
    public void pvs(int i, int i2) {
        ShadowImageView shadowImageView = this.mnm;
        if (shadowImageView != null) {
            shadowImageView.setVisibility(8);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.InterfaceC0016vG
    public void pvs(long j, long j2) {
        this.cR = j;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.InterfaceC0016vG
    public void j_() {
        ShadowImageView shadowImageView = this.mnm;
        if (shadowImageView != null) {
            shadowImageView.setVisibility(8);
        }
    }

    public long getVideoProgress() {
        return this.cR;
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.zM = pAGBannerAdWrapperListener;
    }

    private static class pvs {
        public ShadowImageView Jd;
        public PAGLogoView NB;
        public RatioFrameLayout icD;
        public FrameLayout pvs;
        public PAGImageView sUS;
        public ShadowImageView vG;

        private pvs() {
        }
    }
}
