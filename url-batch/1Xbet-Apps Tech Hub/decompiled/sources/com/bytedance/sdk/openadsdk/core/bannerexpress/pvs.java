package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.content.Context;
import android.graphics.Color;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.utils.dyT;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.EmptyView;
import com.bytedance.sdk.openadsdk.core.Gp;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NB;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.sUS;
import com.bytedance.sdk.openadsdk.core.nativeexpress.yiw;
import com.bytedance.sdk.openadsdk.core.ny;
import com.bytedance.sdk.openadsdk.core.so;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.bytedance.sdk.openadsdk.utils.cRf;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.bytedance.sdk.openadsdk.utils.rCZ;
import com.com.bytedance.overseas.sdk.pvs.Jd;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PAGBannerAdImpl.java */
/* loaded from: classes2.dex */
public class pvs extends PAGBannerAd implements dyT.pvs {
    private ny.pvs IP;
    protected AdSlot Jd;
    private dyT Ju;
    private int Mxy;
    TTDislikeDialogAbstract NB;
    protected final Context icD;
    private com.com.bytedance.overseas.sdk.pvs.vG kj;
    private boolean mnm;
    protected BannerExpressView pvs;
    private com.bytedance.sdk.openadsdk.dislike.icD qh;
    private boolean rCZ;
    private PAGBannerAdWrapperListener so;
    private boolean vA;
    protected cR vG;
    private final boolean yiw;
    private NativeExpressView zM;
    private int Wyp = 0;
    private final Queue<Long> bNS = new LinkedList();
    private String cR = "banner_ad";
    private final AtomicBoolean uc = new AtomicBoolean(false);
    protected final View.OnAttachStateChangeListener sUS = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.pvs.1
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (pvs.this.rCZ) {
                return;
            }
            pvs pvsVar = pvs.this;
            pvsVar.pvs(pvsVar.pvs.getCurView(), pvs.this.vG);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            pvs.this.pvs.vG();
        }
    };

    /* compiled from: PAGBannerAdImpl.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.bannerexpress.pvs$pvs, reason: collision with other inner class name */
    public interface InterfaceC0073pvs {
        void pvs();
    }

    public pvs(Context context, cR cRVar, AdSlot adSlot) {
        this.icD = context;
        this.vG = cRVar;
        this.Jd = adSlot;
        pvs(context, cRVar, adSlot);
        this.yiw = false;
        this.rCZ = false;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        if (this.mnm) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.dyT.pvs(this.vG, d);
        this.mnm = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        if (this.vA) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.dyT.pvs(this.vG, d, str, str2);
        this.vA = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        cR cRVar = this.vG;
        if (cRVar != null) {
            return cRVar.Wby();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionCallback(PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        com.bytedance.sdk.openadsdk.core.bannerexpress.icD icd = new com.bytedance.sdk.openadsdk.core.bannerexpress.icD(pAGBannerAdInteractionCallback);
        this.so = icd;
        this.pvs.setExpressInteractionListener(icd);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionListener(PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        com.bytedance.sdk.openadsdk.core.bannerexpress.icD icd = new com.bytedance.sdk.openadsdk.core.bannerexpress.icD(pAGBannerAdInteractionListener);
        this.so = icd;
        this.pvs.setExpressInteractionListener(icd);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public View getBannerView() {
        com.bytedance.sdk.openadsdk.utils.icD.pvs(this.vG);
        return this.pvs;
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void destroy() {
        BannerExpressView bannerExpressView = this.pvs;
        if (bannerExpressView != null) {
            try {
                bannerExpressView.vG();
                this.pvs.removeOnAttachStateChangeListener(this.sUS);
            } catch (Throwable unused) {
            }
        }
        NB();
    }

    public void pvs(Context context, cR cRVar, AdSlot adSlot) {
        BannerExpressView bannerExpressView = new BannerExpressView(context, cRVar, adSlot);
        this.pvs = bannerExpressView;
        bannerExpressView.addOnAttachStateChangeListener(this.sUS);
    }

    protected void pvs(final NativeExpressView nativeExpressView, final cR cRVar) {
        final EmptyView emptyView;
        if (nativeExpressView == null || cRVar == null) {
            return;
        }
        this.vG = cRVar;
        this.kj = pvs(cRVar);
        this.zM = nativeExpressView;
        final String pvs = rCZ.pvs();
        final InterfaceC0073pvs pvs2 = pvs();
        nativeExpressView.setClosedListenerKey(pvs);
        nativeExpressView.setBannerClickClosedListener(pvs2);
        nativeExpressView.setBackupListener(new com.bytedance.sdk.component.adexpress.icD.vG() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.pvs.2
            @Override // com.bytedance.sdk.component.adexpress.icD.vG
            public boolean pvs(ViewGroup viewGroup, int i) {
                try {
                    nativeExpressView.kj();
                    if (pvs.this.vG.SJ()) {
                        VastBannerBackupView vastBannerBackupView = new VastBannerBackupView(nativeExpressView.getContext());
                        vastBannerBackupView.setClosedListenerKey(pvs);
                        vastBannerBackupView.pvs(pvs.this.vG, nativeExpressView, pvs.this.kj);
                        vastBannerBackupView.setDislikeInner(pvs.this.qh);
                        vastBannerBackupView.setDislikeOuter(pvs.this.NB);
                        vastBannerBackupView.setAdInteractionListener(pvs.this.so);
                        nativeExpressView.setVastVideoHelper(vastBannerBackupView);
                        return true;
                    }
                    BannerExpressBackupView bannerExpressBackupView = new BannerExpressBackupView(nativeExpressView.getContext());
                    bannerExpressBackupView.setClosedListenerKey(pvs);
                    bannerExpressBackupView.pvs(pvs.this.vG, nativeExpressView, pvs.this.kj);
                    bannerExpressBackupView.setDislikeInner(pvs.this.qh);
                    bannerExpressBackupView.setDislikeOuter(pvs.this.NB);
                    bannerExpressBackupView.setAdInteractionListener(pvs.this.so);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
        if (!this.yiw) {
            EmptyView pvs3 = pvs(nativeExpressView);
            if (pvs3 == null) {
                pvs3 = new EmptyView(this.icD, nativeExpressView);
                nativeExpressView.addView(pvs3);
            }
            emptyView = pvs3;
            emptyView.setCallback(new EmptyView.pvs() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.pvs.3
                @Override // com.bytedance.sdk.openadsdk.core.EmptyView.pvs
                public void pvs(boolean z) {
                    pvs.this.pvs(z, cRVar);
                }

                @Override // com.bytedance.sdk.openadsdk.core.EmptyView.pvs
                public void pvs() {
                    pvs.this.vG();
                }

                @Override // com.bytedance.sdk.openadsdk.core.EmptyView.pvs
                public void icD() {
                    pvs.this.pvs(emptyView, false, cRVar);
                }

                @Override // com.bytedance.sdk.openadsdk.core.EmptyView.pvs
                public void pvs(View view) {
                    if (pvs.this.uc.compareAndSet(false, true)) {
                        pvs.this.pvs(view, nativeExpressView, cRVar, pvs, pvs2);
                    }
                }
            });
        } else {
            cRf.pvs(nativeExpressView, true, 1, new cRf.icD() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.pvs.4
                @Override // com.bytedance.sdk.openadsdk.utils.cRf.icD
                public void pvs(boolean z) {
                    pvs.this.pvs(z, cRVar);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.cRf.icD
                public void pvs() {
                    pvs.this.vG();
                }

                @Override // com.bytedance.sdk.openadsdk.utils.cRf.icD
                public void icD() {
                    pvs.this.pvs((EmptyView) null, true, cRVar);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.cRf.icD
                public void pvs(View view, boolean z) {
                    if (z && pvs.this.uc.compareAndSet(false, true)) {
                        pvs.this.pvs(view, nativeExpressView, cRVar, pvs, pvs2);
                    }
                }
            }, null);
            emptyView = null;
        }
        Context pvs4 = nativeExpressView != null ? com.bytedance.sdk.component.utils.icD.pvs(nativeExpressView) : null;
        if (pvs4 == null) {
            pvs4 = this.icD;
        }
        yiw yiwVar = new yiw(pvs4, cRVar, this.cR, 2);
        yiwVar.pvs(nativeExpressView);
        yiwVar.pvs(this);
        yiwVar.pvs(this.kj);
        nativeExpressView.setClickListener(yiwVar);
        sUS sus = new sUS(this.icD, cRVar, this.cR, 2);
        sus.pvs((View) nativeExpressView);
        sus.pvs(this);
        NativeExpressView nativeExpressView2 = this.zM;
        if (nativeExpressView2 instanceof NativeExpressVideoView) {
            sus.pvs(((NativeExpressVideoView) nativeExpressView2).getVideoController());
        }
        sus.pvs(this.kj);
        nativeExpressView.setClickCreativeListener(sus);
        if (this.yiw) {
            return;
        }
        emptyView.setNeedCheckingShow(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(boolean z, cR cRVar) {
        if (z) {
            if (this.vG.fl() && !this.vG.wS()) {
                this.vG.yiw(true);
                cR cRVar2 = this.vG;
                com.bytedance.sdk.openadsdk.icD.vG.pvs(cRVar2, this.cR, cRVar2.AMP());
            }
            sUS();
            Object[] objArr = new Object[2];
        } else {
            NB();
            Object[] objArr2 = new Object[2];
        }
        ae.icD(new icD(z, cRVar, this), 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vG() {
        icD();
        sUS();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(EmptyView emptyView, boolean z, cR cRVar) {
        BannerExpressView bannerExpressView = this.pvs;
        if (bannerExpressView != null) {
            if (!z && emptyView != null && emptyView == pvs(bannerExpressView.getCurView())) {
                NB();
            } else if (z) {
                NB();
            }
        }
        icD(cRVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(View view, NativeExpressView nativeExpressView, cR cRVar, String str, InterfaceC0073pvs interfaceC0073pvs) {
        so.icD().pvs(str, interfaceC0073pvs);
        Object[] objArr = new Object[2];
        Queue<Long> queue = this.bNS;
        if (queue != null) {
            queue.offer(Long.valueOf(System.currentTimeMillis()));
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (nativeExpressView != null) {
                jSONObject.put("dynamic_show_type", nativeExpressView.getDynamicShowType());
                nativeExpressView.pvs(jSONObject, cRVar);
            }
            if (view != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("width", view.getWidth());
                    jSONObject2.put("height", view.getHeight());
                    jSONObject2.put("alpha", view.getAlpha());
                } catch (Throwable unused) {
                }
                jSONObject.put("root_view", jSONObject2.toString());
            }
            com.bytedance.sdk.openadsdk.icD.vG.pvs(cRVar, this.cR, jSONObject);
        } catch (JSONException unused2) {
            Ju.pvs("PAGBannerAdImpl", "onShowFun json error");
        }
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.so;
        if (pAGBannerAdWrapperListener != null) {
            pAGBannerAdWrapperListener.onAdShow(view, cRVar.jhZ());
        }
        if (cRVar.tCd()) {
            jlb.pvs(cRVar, view);
        }
        sUS();
        BannerExpressView bannerExpressView = this.pvs;
        if (bannerExpressView == null || bannerExpressView.getCurView() == null) {
            return;
        }
        this.pvs.getCurView().Wyp();
        this.pvs.getCurView().so();
    }

    private com.com.bytedance.overseas.sdk.pvs.vG pvs(cR cRVar) {
        if (cRVar.jhZ() == 4) {
            return Jd.pvs(this.icD, cRVar, this.cR);
        }
        return null;
    }

    /* compiled from: PAGBannerAdImpl.java */
    private static class icD extends com.bytedance.sdk.component.so.so {
        cR icD;
        boolean pvs;
        WeakReference<pvs> vG;

        icD(boolean z, cR cRVar, pvs pvsVar) {
            super("ReportWindowFocusChangedAdShow");
            this.pvs = z;
            this.icD = cRVar;
            this.vG = new WeakReference<>(pvsVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<pvs> weakReference = this.vG;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.vG.get().icD(this.pvs, this.icD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(boolean z, cR cRVar) {
        Long poll;
        try {
            if (z) {
                this.bNS.offer(Long.valueOf(System.currentTimeMillis()));
            } else {
                if (this.bNS.size() <= 0 || this.zM == null || (poll = this.bNS.poll()) == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.icD.vG.pvs(String.valueOf(System.currentTimeMillis() - poll.longValue()), cRVar, this.cR, this.zM.getAdShowTime());
            }
        } catch (Exception e) {
            Ju.pvs("PAGBannerAdImpl", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public EmptyView pvs(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            try {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof EmptyView) {
                    return (EmptyView) childAt;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private void icD(cR cRVar) {
        Queue<Long> queue = this.bNS;
        if (queue == null || queue.size() <= 0 || cRVar == null) {
            return;
        }
        try {
            long longValue = this.bNS.poll().longValue();
            if (longValue <= 0 || this.zM == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.icD.vG.pvs(String.valueOf(System.currentTimeMillis() - longValue), cRVar, this.cR, this.zM.getAdShowTime());
        } catch (Exception e) {
            Ju.pvs("PAGBannerAdImpl", e.getMessage());
        }
    }

    public InterfaceC0073pvs pvs() {
        return new InterfaceC0073pvs() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.pvs.5
            @Override // com.bytedance.sdk.openadsdk.core.bannerexpress.pvs.InterfaceC0073pvs
            public void pvs() {
                EmptyView emptyView;
                int width = pvs.this.zM.getWidth();
                int height = pvs.this.zM.getHeight();
                View pvs = pvs(((double) height) >= Math.floor((((double) width) * 450.0d) / 600.0d));
                pvs.this.zM.IP();
                if (pvs.this.yiw) {
                    emptyView = null;
                } else {
                    pvs pvsVar = pvs.this;
                    emptyView = pvsVar.pvs(pvsVar.zM);
                }
                pvs.this.zM.removeAllViews();
                pvs.this.zM.addView(pvs, new ViewGroup.LayoutParams(width, height));
                pvs.this.zM.setClickCreativeListener(null);
                pvs.this.zM.setClickListener(null);
                if (mnm.Jd().jlb() == 1) {
                    pvs.this.NB();
                } else if (pvs.this.Mxy != 0 && !pvs.this.yiw && emptyView != null) {
                    pvs.this.zM.addView(emptyView);
                }
                if (pvs.this.so != null) {
                    pvs.this.so.onAdDismissed();
                }
                pvs.this.rCZ = true;
            }

            private View pvs(boolean z) {
                PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(pvs.this.icD);
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                pAGFrameLayout.setBackgroundColor(-1);
                pAGFrameLayout.setLayoutParams(layoutParams);
                View view = new View(pvs.this.icD);
                ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                view.setAlpha(0.3f);
                view.setBackgroundColor(Color.parseColor("#F3F7F8"));
                pAGFrameLayout.addView(view, layoutParams2);
                PAGFrameLayout pAGFrameLayout2 = new PAGFrameLayout(pvs.this.icD);
                ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                if (z) {
                    pAGFrameLayout2.setBackground(uc.vG(pvs.this.icD, "tt_ad_closed_background_300_250"));
                } else {
                    pAGFrameLayout2.setBackground(uc.vG(pvs.this.icD, "tt_ad_closed_background_320_50"));
                }
                pAGFrameLayout.addView(pAGFrameLayout2, layoutParams3);
                PAGImageView pAGImageView = new PAGImageView(pvs.this.icD);
                pAGImageView.setId(520093739);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
                if (z) {
                    int icD2 = Pj.icD(pvs.this.icD, 16.0f);
                    layoutParams4.width = Pj.icD(pvs.this.icD, 77.0f);
                    layoutParams4.height = Pj.icD(pvs.this.icD, 14.0f);
                    layoutParams4.leftMargin = icD2;
                    layoutParams4.topMargin = icD2;
                } else {
                    int icD3 = Pj.icD(pvs.this.icD, 8.0f);
                    layoutParams4.width = Pj.icD(pvs.this.icD, 45.0f);
                    layoutParams4.height = Pj.icD(pvs.this.icD, 8.18f);
                    layoutParams4.leftMargin = icD3;
                    layoutParams4.topMargin = icD3;
                }
                pAGImageView.setImageResource(uc.Jd(pvs.this.icD, "tt_ad_closed_logo_red"));
                pAGFrameLayout2.addView(pAGImageView, layoutParams4);
                PAGTextView pAGTextView = new PAGTextView(pvs.this.icD);
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams5.gravity = 17;
                pAGTextView.setAlpha(0.5f);
                pAGTextView.setLines(1);
                pAGTextView.setText(uc.pvs(pvs.this.icD, "tt_ad_is_closed"));
                if (z) {
                    pAGTextView.setTextSize(18.0f);
                } else {
                    pAGTextView.setTextSize(12.0f);
                }
                pAGFrameLayout2.addView(pAGTextView, layoutParams5);
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.pvs.5.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.pvs(pvs.this.icD, pvs.this.vG, pvs.this.cR);
                    }
                };
                pAGImageView.setOnClickListener(onClickListener);
                pAGTextView.setOnClickListener(onClickListener);
                return pAGFrameLayout;
            }
        };
    }

    @Override // com.bytedance.sdk.component.utils.dyT.pvs
    public void pvs(Message message) {
        if (message.what == 112202) {
            if (Gp.pvs(this.pvs, 50, 1)) {
                this.Wyp += 1000;
            }
            if (this.Wyp >= this.Mxy) {
                Jd();
                AdSlot adSlot = this.Jd;
                adSlot.setRotateOrder(adSlot.getRotateOrder() + 1);
                this.Wyp = 0;
                NB();
                return;
            }
            sUS();
        }
    }

    private void Jd() {
        NB.pvs(this.icD).pvs(this.Jd, 1, null, new NB.pvs() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.pvs.6
            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NB.pvs
            public void pvs(List<cR> list) {
                if (list == null || list.isEmpty()) {
                    pvs.this.sUS();
                    return;
                }
                cR cRVar = list.get(0);
                pvs.this.pvs.pvs(cRVar, pvs.this.Jd);
                pvs.this.vG(cRVar);
                pvs.this.pvs.Jd();
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NB.pvs
            public void pvs() {
                pvs.this.sUS();
            }
        }, PAGErrorCode.LOAD_FACTORY_NULL_CODE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vG(cR cRVar) {
        if (this.pvs.getNextView() == null || !this.pvs.sUS()) {
            return;
        }
        icD(this.pvs.getNextView(), cRVar);
        pvs(this.pvs.getNextView(), cRVar);
    }

    private void icD(NativeExpressView nativeExpressView, cR cRVar) {
        if (nativeExpressView == null || cRVar == null) {
            return;
        }
        if (this.IP != null) {
            this.qh.pvs(cRVar.HWd(), cRVar.Ayu());
            nativeExpressView.setDislike(this.qh);
        }
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.NB;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.setMaterialMeta(cRVar.HWd(), cRVar.Ayu());
            nativeExpressView.setOuterDislike(this.NB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NB() {
        dyT dyt = this.Ju;
        if (dyt != null) {
            dyt.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sUS() {
        dyT dyt = this.Ju;
        if (dyt != null) {
            dyt.removeCallbacksAndMessages(null);
            this.Ju.sendEmptyMessageDelayed(112202, 1000L);
        }
    }

    public void icD() {
        this.vG.pvs(SystemClock.elapsedRealtime());
        this.pvs.icD();
    }
}
