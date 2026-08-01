package com.bytedance.sdk.openadsdk.apiImpl.feed;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import com.bykv.vk.openvk.component.video.api.Jd.vG;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.bNS;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.multipro.icD.pvs;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.List;

/* compiled from: PAGFeedNativeVideoAdImpl.java */
/* loaded from: classes2.dex */
public class icD extends so implements vG.Jd, vG.InterfaceC0016vG, pvs.InterfaceC0092pvs {
    private long Ju;
    private final com.bytedance.sdk.openadsdk.multipro.icD.pvs Mxy;
    private boolean Wyp;
    private AdSlot kj;
    private boolean qh;
    private vG so;

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.InterfaceC0016vG
    public void i_() {
    }

    public icD(Context context, cR cRVar, int i, AdSlot adSlot) {
        super(context, cRVar, i, true);
        this.Wyp = false;
        this.qh = true;
        this.NB = i;
        this.kj = adSlot;
        this.Mxy = new com.bytedance.sdk.openadsdk.multipro.icD.pvs();
        pvs(this.sUS);
        pvs("embeded_ad");
        this.Jd.pvs(this);
    }

    public icD(Context context, cR cRVar, int i, AdSlot adSlot, pvs pvsVar, bNS bns) {
        super(context, cRVar, i, false);
        this.Wyp = false;
        this.qh = true;
        this.Jd = pvsVar;
        this.pvs = bns;
        this.NB = i;
        this.kj = adSlot;
        this.Mxy = new com.bytedance.sdk.openadsdk.multipro.icD.pvs();
        pvs(this.sUS);
        pvs("embeded_ad");
        pvsVar.pvs(this);
    }

    public View NB() {
        NativeVideoTsView nativeVideoTsView;
        if (this.icD != null && this.vG != null) {
            if (cR.NB(this.icD)) {
                try {
                    nativeVideoTsView = new NativeVideoTsView(this.vG, this.icD, this.pvs.pvs());
                    if (this.icD != null && this.icD.SJ()) {
                        com.bytedance.sdk.openadsdk.core.yiw.sUS pvs = nativeVideoTsView.pvs((List<Pair<View, FriendlyObstructionPurpose>>) null);
                        if (this.Jd != null) {
                            this.Jd.pvs(pvs);
                        }
                    }
                    this.pvs.pvs(nativeVideoTsView.getNativeVideoController());
                    if (this.Jd != null) {
                        this.Jd.pvs(nativeVideoTsView);
                    }
                    nativeVideoTsView.setVideoAdClickListenerTTNativeAd(this);
                    nativeVideoTsView.setAdCreativeClickListener(new NativeVideoTsView.pvs() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.icD.1
                        @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.pvs
                        public void pvs(View view, int i) {
                            if (icD.this.pvs != null) {
                                icD.this.pvs.pvs(view, i);
                            }
                        }
                    });
                    nativeVideoTsView.setControllerStatusCallBack(new NativeVideoTsView.icD() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.icD.2
                        @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.icD
                        public void pvs(boolean z, long j, long j2, long j3, boolean z2) {
                            icD.this.Mxy.pvs = z;
                            icD.this.Mxy.NB = j;
                            icD.this.Mxy.sUS = j2;
                            icD.this.Mxy.yiw = j3;
                            icD.this.Mxy.Jd = z2;
                        }
                    });
                    nativeVideoTsView.setVideoAdLoadListener(this);
                    nativeVideoTsView.setVideoAdInteractionListener(this);
                    if (5 == this.NB) {
                        nativeVideoTsView.setIsAutoPlay(this.Wyp ? this.kj.isAutoPlay() : this.qh);
                    } else {
                        nativeVideoTsView.setIsAutoPlay(this.qh);
                    }
                    nativeVideoTsView.setIsQuiet(mnm.Jd().vG(String.valueOf(this.sUS)));
                } catch (Exception e) {
                    ApmHelper.reportCustomError("", "getAdView null", e);
                }
                if (!cR.NB(this.icD) && nativeVideoTsView != null && nativeVideoTsView.pvs(0L, true, false)) {
                    return nativeVideoTsView;
                }
                ApmHelper.reportCustomError(this.icD.Ye() + "," + nativeVideoTsView, "getAdView null", new RuntimeException());
            }
            nativeVideoTsView = null;
            if (!cR.NB(this.icD)) {
            }
            ApmHelper.reportCustomError(this.icD.Ye() + "," + nativeVideoTsView, "getAdView null", new RuntimeException());
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (com.bytedance.sdk.openadsdk.utils.jlb.sUS(r0) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pvs(int i) {
        int icD = mnm.Jd().icD(i);
        int vG = com.bytedance.sdk.component.utils.mnm.vG(mnm.pvs());
        if (3 == icD) {
            this.Wyp = false;
            this.qh = false;
        } else {
            if (1 == icD && jlb.Jd(vG)) {
                this.Wyp = false;
            } else if (2 == icD) {
                if (jlb.NB(vG) || jlb.Jd(vG) || jlb.sUS(vG)) {
                    this.Wyp = false;
                }
            } else if (4 == icD) {
                this.Wyp = true;
            } else if (5 == icD) {
                if (!jlb.Jd(vG)) {
                }
            }
            this.qh = true;
        }
        if (this.Jd != null) {
            this.Jd.pvs(this.Wyp);
        }
    }

    public void pvs(vG vGVar) {
        this.so = vGVar;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.Jd
    public void pvs(int i, int i2) {
        vG vGVar = this.so;
        if (vGVar != null) {
            vGVar.pvs(i, i2);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.InterfaceC0016vG
    public void e_() {
        vG vGVar = this.so;
        if (vGVar != null) {
            vGVar.pvs(this);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.InterfaceC0016vG
    public void h_() {
        vG vGVar = this.so;
        if (vGVar != null) {
            vGVar.icD(this);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.InterfaceC0016vG
    public void pvs(long j, long j2) {
        this.Ju = j;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.InterfaceC0016vG
    public void j_() {
        vG vGVar = this.so;
        if (vGVar != null) {
            vGVar.vG(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.icD.pvs.InterfaceC0092pvs
    public com.bytedance.sdk.openadsdk.multipro.icD.pvs sUS() {
        return this.Mxy;
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.so
    protected void pvs(String str) {
        super.pvs(str);
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.so, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
        if (this.Jd != null) {
            this.Jd.kj();
        }
    }
}
