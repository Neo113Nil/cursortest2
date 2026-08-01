package com.bytedance.sdk.openadsdk.apiImpl.feed;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.NB.qh;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.icD.vG;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.bNS;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.utils.Pj;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: PAGExtraFuncationHelper.java */
/* loaded from: classes2.dex */
public class pvs {
    private WeakReference<com.bytedance.sdk.openadsdk.core.yiw.sUS> IP;
    private boolean Jd;
    private boolean Ju = false;
    private NativeExpressView Mxy;
    private WeakReference<NativeVideoTsView> NB;
    private PAGMediaView Wyp;
    private final Context icD;
    private com.bytedance.sdk.openadsdk.core.icD.icD kj;
    protected final cR pvs;
    private com.bytedance.sdk.openadsdk.core.icD.pvs qh;
    private icD sUS;
    private PAGMediaView so;
    private final String vG;
    private com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.icD yiw;

    public pvs(Context context, cR cRVar, String str) {
        this.icD = context;
        this.pvs = cRVar;
        this.vG = str;
    }

    public void pvs(icD icd) {
        this.sUS = icd;
    }

    public void pvs(com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.icD icd) {
        this.yiw = icd;
    }

    public void pvs(NativeVideoTsView nativeVideoTsView) {
        this.NB = new WeakReference<>(nativeVideoTsView);
    }

    public void pvs(boolean z) {
        this.Jd = z;
    }

    public PAGMediaView pvs() {
        return this.so;
    }

    public NativeExpressView icD() {
        return this.Mxy;
    }

    public void pvs(com.bytedance.sdk.openadsdk.core.icD.pvs pvsVar) {
        this.qh = pvsVar;
    }

    public PAGImageItem vG() {
        cR cRVar = this.pvs;
        if (cRVar == null || cRVar.ea() == null) {
            return null;
        }
        return new PAGImageItem(this.pvs.ea().vG(), this.pvs.ea().icD(), this.pvs.ea().pvs(), (float) this.pvs.ea().Jd());
    }

    public String Jd() {
        cR cRVar = this.pvs;
        if (cRVar != null) {
            return cRVar.qd();
        }
        return null;
    }

    public String NB() {
        cR cRVar = this.pvs;
        if (cRVar != null) {
            return cRVar.rW();
        }
        return null;
    }

    public String sUS() {
        cR cRVar = this.pvs;
        if (cRVar != null) {
            return cRVar.Cwg();
        }
        return null;
    }

    public void pvs(com.bytedance.sdk.openadsdk.core.icD.icD icd) {
        this.kj = icd;
    }

    public PAGMediaView yiw() {
        PAGMediaView Mxy;
        com.bytedance.sdk.openadsdk.utils.icD.pvs(this.pvs);
        if (this.pvs.OT() == 2) {
            Mxy = bNS();
            pvs(Mxy);
        } else {
            Mxy = Mxy();
        }
        if (Mxy != null) {
            Mxy.setMrcTrackerKey(com.bytedance.sdk.openadsdk.mnm.pvs.NB.icD(this.pvs));
        } else {
            Mxy = new PAGMediaView(this.icD) { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.pvs.1
                @Override // android.view.ViewGroup, android.view.View
                protected void onAttachedToWindow() {
                    super.onAttachedToWindow();
                    com.bytedance.sdk.openadsdk.utils.vG.pvs(this, pvs.this.pvs);
                }
            };
        }
        if (Mxy instanceof PAGVideoMediaView) {
            ((PAGVideoMediaView) Mxy).setMaterialMeta(this.pvs);
        }
        this.Wyp = Mxy;
        return Mxy;
    }

    public PAGMediaView so() {
        return this.Wyp;
    }

    private String IP() {
        bNS bns;
        List<bNS> BSi = this.pvs.BSi();
        if (BSi.isEmpty() || (bns = BSi.get(0)) == null) {
            return null;
        }
        return bns.pvs();
    }

    private void pvs(final PAGMediaView pAGMediaView) {
        if (pAGMediaView == null) {
            return;
        }
        try {
            String IP = IP();
            if (TextUtils.isEmpty(IP)) {
                return;
            }
            com.bytedance.sdk.openadsdk.sUS.Jd.pvs(IP).pvs(200).icD(200).NB(Pj.Jd(mnm.pvs())).Jd(Pj.vG(mnm.pvs())).vG(2).pvs(new com.bytedance.sdk.component.NB.so() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.pvs.3
                @Override // com.bytedance.sdk.component.NB.so
                public Bitmap pvs(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.Jd.pvs.pvs(mnm.pvs(), bitmap, 25);
                }
            }).pvs(new com.bytedance.sdk.openadsdk.sUS.icD(this.pvs, IP, new com.bytedance.sdk.component.NB.mnm<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.pvs.2
                @Override // com.bytedance.sdk.component.NB.mnm
                public void pvs(int i, String str, Throwable th) {
                }

                @Override // com.bytedance.sdk.component.NB.mnm
                public void pvs(qh<Bitmap> qhVar) {
                    if (qhVar == null || qhVar.icD() == null || qhVar.vG() == null) {
                        return;
                    }
                    pAGMediaView.setBackground(new BitmapDrawable(qhVar.icD()));
                }
            }));
        } catch (Exception unused) {
        }
    }

    private PAGMediaView bNS() {
        if (cR.NB(this.pvs)) {
            com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.icD icd = this.yiw;
            if (icd == null || !(icd instanceof com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.pvs)) {
                return null;
            }
            NativeExpressVideoView nativeExpressVideoView = (NativeExpressVideoView) icd.Jd();
            nativeExpressVideoView.setTag(520093762, Boolean.TRUE);
            if (!this.Ju) {
                this.yiw.NB();
            }
            this.Ju = true;
            return pvs(nativeExpressVideoView);
        }
        com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.icD icd2 = this.yiw;
        if (icd2 == null) {
            return null;
        }
        NativeExpressView Jd = icd2.Jd();
        Jd.setTag(520093762, Boolean.TRUE);
        if (!this.Ju) {
            this.yiw.NB();
        }
        this.Ju = true;
        return pvs(Jd);
    }

    public PAGMediaView Mxy() {
        if (cR.NB(this.pvs)) {
            icD icd = this.sUS;
            if (icd != null) {
                View NB = icd.NB();
                if (NB != null) {
                    if (NB.getParent() instanceof ViewGroup) {
                        ((ViewGroup) NB.getParent()).removeView(NB);
                    }
                    PAGMediaView pAGMediaView = this.so;
                    if (pAGMediaView != null) {
                        pAGMediaView.setOnClickListener(null);
                        this.so.setOnTouchListener(null);
                    }
                    PAGVideoMediaView pAGVideoMediaView = new PAGVideoMediaView(this.icD, NB, this);
                    pAGVideoMediaView.setTag(520093762, Boolean.TRUE);
                    if (this.qh != null && com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().Jd(String.valueOf(this.pvs.yTz()))) {
                        pAGVideoMediaView.setOnClickListener(this.qh);
                        pAGVideoMediaView.setOnTouchListener(this.qh);
                    } else {
                        com.bytedance.sdk.openadsdk.core.icD.vG vGVar = new com.bytedance.sdk.openadsdk.core.icD.vG() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.pvs.4
                            @Override // com.bytedance.sdk.openadsdk.core.icD.vG
                            protected void pvs(View view, float f, float f2, float f3, float f4, SparseArray<vG.pvs> sparseArray, boolean z) {
                                try {
                                    ((PAGVideoMediaView) view).handleInterruptVideo();
                                } catch (Exception unused) {
                                }
                            }
                        };
                        pAGVideoMediaView.setOnClickListener(vGVar);
                        pAGVideoMediaView.setOnTouchListener(vGVar);
                    }
                    this.so = pAGVideoMediaView;
                    pAGVideoMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    return pAGVideoMediaView;
                }
                ApmHelper.reportCustomError("adVideoView null", "getMediaView return null", new RuntimeException());
                return null;
            }
            ApmHelper.reportCustomError("mPAGFeedVideoAdImpl null", "getMediaView return null", new RuntimeException());
            return null;
        }
        List<bNS> BSi = this.pvs.BSi();
        if (BSi != null && !BSi.isEmpty()) {
            ImageView imageView = new ImageView(this.icD);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            bNS bns = BSi.get(0);
            if (bns != null) {
                com.bytedance.sdk.openadsdk.sUS.Jd.pvs(bns).vG(2).pvs(com.bytedance.sdk.openadsdk.sUS.vG.pvs(this.pvs, bns.pvs(), imageView));
            }
            PAGMediaView pvs = pvs(imageView);
            if (this.qh != null && com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().Jd(String.valueOf(this.pvs.yTz()))) {
                pvs.setOnClickListener(this.qh);
                pvs.setOnTouchListener(this.qh);
            } else {
                pvs.setOnClickListener(null);
                pvs.setOnTouchListener(null);
            }
            pvs.setTag(520093762, Boolean.TRUE);
            PAGMediaView pAGMediaView2 = this.so;
            if (pAGMediaView2 != null) {
                pAGMediaView2.setOnClickListener(null);
                this.so.setOnTouchListener(null);
            }
            this.so = pvs;
            return pvs;
        }
        ApmHelper.reportCustomError("images empty", "getMediaView return null", new RuntimeException());
        return null;
    }

    private PAGMediaView pvs(final View view) {
        int i;
        if (view == null) {
            return null;
        }
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        NativeExpressView nativeExpressView = this.Mxy;
        if (nativeExpressView != null) {
            nativeExpressView.setClickListener(null);
            this.Mxy.setClickCreativeListener(null);
        }
        com.bytedance.sdk.openadsdk.core.icD.icD icd = this.kj;
        if (icd != null && (icd instanceof com.bytedance.sdk.openadsdk.core.nativeexpress.yiw) && (view instanceof NativeExpressView)) {
            ((NativeExpressView) view).setClickListener((com.bytedance.sdk.openadsdk.core.nativeexpress.yiw) icd);
        }
        com.bytedance.sdk.openadsdk.core.icD.pvs pvsVar = this.qh;
        if (pvsVar != null && (pvsVar instanceof com.bytedance.sdk.openadsdk.core.nativeexpress.sUS) && (view instanceof NativeExpressView)) {
            ((NativeExpressView) view).setClickCreativeListener((com.bytedance.sdk.openadsdk.core.nativeexpress.sUS) pvsVar);
        }
        PAGMediaView pAGMediaView = new PAGMediaView(this.icD) { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.pvs.5
            @Override // android.view.View
            public void onWindowFocusChanged(boolean z) {
                super.onWindowFocusChanged(z);
                if (view instanceof NativeExpressView) {
                    return;
                }
                pvs(z);
            }

            private void pvs(boolean z) {
                if (this.pvs != null) {
                    com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(this.pvs), z ? 4 : 8);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
            public void setVideoAdListener(PAGVideoAdListener pAGVideoAdListener) {
                super.setVideoAdListener(pAGVideoAdListener);
                pvs.this.pvs(pAGVideoAdListener);
            }

            @Override // android.view.ViewGroup, android.view.View
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                com.bytedance.sdk.openadsdk.utils.vG.pvs(this, pvs.this.pvs);
            }
        };
        int i2 = -1;
        pAGMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i2 = layoutParams.width;
            i = layoutParams.height;
        } else {
            i = -1;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i);
        layoutParams2.gravity = 17;
        pAGMediaView.addView(view, layoutParams2);
        if (view instanceof NativeExpressView) {
            this.Mxy = (NativeExpressView) view;
        }
        return pAGMediaView;
    }

    public View Wyp() {
        if (mnm.pvs() == null) {
            Ju.pvs("TTNativeAdImpl", "getAdLogoView mContext == null");
            return null;
        }
        ImageView imageView = new ImageView(mnm.pvs());
        imageView.setImageResource(uc.Jd(mnm.pvs(), "tt_ad_logo_new"));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.pvs.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                pvs.this.kj();
            }
        });
        return imageView;
    }

    public View qh() {
        cR cRVar;
        if (mnm.pvs() == null || (cRVar = this.pvs) == null) {
            Ju.pvs("TTNativeAdImpl", "getAdChoicesView mContext == null");
            return null;
        }
        if (!cRVar.SJ() || !this.pvs.so()) {
            return null;
        }
        ImageView imageView = new ImageView(mnm.pvs());
        com.bytedance.sdk.openadsdk.qh.vG.pvs().pvs((int) Pj.pvs(mnm.pvs(), 14.0f, true), imageView, this.pvs);
        return imageView;
    }

    public void kj() {
        Context context = this.icD;
        if (context != null) {
            TTWebsiteActivity.pvs(context, this.pvs, this.vG);
        }
    }

    public void pvs(PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.icD icd;
        if (this.pvs.OT() == 2 && cR.NB(this.pvs) && (icd = this.yiw) != null && (icd instanceof com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.pvs)) {
            NativeExpressVideoView nativeExpressVideoView = (NativeExpressVideoView) icd.Jd();
            if (nativeExpressVideoView != null) {
                nativeExpressVideoView.setVideoAdListener(icD(pAGVideoAdListener));
                return;
            }
            return;
        }
        icD icd2 = this.sUS;
        if (icd2 != null) {
            icd2.pvs(icD(pAGVideoAdListener));
        }
    }

    private vG icD(final PAGVideoAdListener pAGVideoAdListener) {
        return new vG() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.pvs.7
            @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.vG
            public void pvs(int i, int i2) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.vG
            public void pvs(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.vG
            public void icD(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.vG
            public void vG(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }
        };
    }

    public void Ju() {
        com.bytedance.sdk.openadsdk.core.yiw.sUS sus;
        WeakReference<com.bytedance.sdk.openadsdk.core.yiw.sUS> weakReference = this.IP;
        if (weakReference == null || (sus = weakReference.get()) == null) {
            return;
        }
        sus.pvs(13);
    }

    public void pvs(com.bytedance.sdk.openadsdk.core.yiw.sUS sus) {
        this.IP = new WeakReference<>(sus);
    }
}
