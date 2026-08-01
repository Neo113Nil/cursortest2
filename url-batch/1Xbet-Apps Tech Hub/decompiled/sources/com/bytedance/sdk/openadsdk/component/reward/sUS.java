package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.icD;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.AdActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialExpressActivity;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.OT;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.bytedance.sdk.openadsdk.utils.dyT;
import com.bytedance.sdk.openadsdk.utils.rCZ;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PAGInterstitialAdImpl.java */
/* loaded from: classes2.dex */
class sUS extends PAGInterstitialAd {
    private boolean Mxy;
    private final com.bytedance.sdk.openadsdk.core.model.pvs icD;
    private final Context pvs;
    private boolean so;
    private com.bytedance.sdk.openadsdk.apiImpl.icD.icD vG;
    private final AtomicBoolean NB = new AtomicBoolean(false);
    private boolean sUS = false;
    private boolean Jd = false;
    private final String yiw = rCZ.pvs();

    sUS(Context context, com.bytedance.sdk.openadsdk.core.model.pvs pvsVar) {
        this.pvs = context;
        this.icD = pvsVar;
    }

    public void pvs(boolean z) {
        this.sUS = z;
    }

    public void pvs() {
        if (this.NB.get()) {
            return;
        }
        this.Jd = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionListener(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.vG = new com.bytedance.sdk.openadsdk.component.vG.pvs(pAGInterstitialAdInteractionListener);
        pvs(1);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionCallback(PAGInterstitialAdInteractionCallback pAGInterstitialAdInteractionCallback) {
        this.vG = new com.bytedance.sdk.openadsdk.component.vG.pvs(pAGInterstitialAdInteractionCallback);
        pvs(1);
    }

    private static boolean pvs(cR cRVar) {
        if (cRVar == null) {
            return false;
        }
        int mnm = cRVar.mnm();
        return (cRVar.OT() != 2 || mnm == 5 || mnm == 33 || mnm == 6 || mnm == 19 || mnm == 12) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void show(Activity activity) {
        Intent intent;
        if (activity != null && activity.isFinishing()) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTFullScreenVideoAdImpl", "showFullScreenVideoAd error1: activity is finishing");
            activity = null;
        }
        com.bytedance.sdk.openadsdk.core.model.pvs pvsVar = this.icD;
        if (pvsVar == null || !pvsVar.Jd()) {
            return;
        }
        boolean sUS = this.icD.sUS();
        final cR NB = this.icD.NB();
        if (!com.bykv.vk.openvk.component.video.pvs.vG.pvs.icD()) {
            com.bytedance.sdk.openadsdk.icD.vG.pvs(NB, "fullscreen_interstitial_ad", "showFullScreenVideoAd error2: not main looper");
            com.bytedance.sdk.component.utils.Ju.pvs("TTFullScreenVideoAdImpl", "showFullScreenVideoAd error2: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread —— TTFullScreenVideoAd.showFullScreenVideoAd");
        }
        if (this.NB.get()) {
            return;
        }
        this.NB.set(true);
        if (NB == null || (NB.od() == null && NB.BSi() == null)) {
            com.bytedance.sdk.openadsdk.icD.vG.pvs(NB, "fullscreen_interstitial_ad", "materialMeta error ");
            return;
        }
        Context context = activity == null ? this.pvs : activity;
        if (context == null) {
            context = mnm.pvs();
        }
        if (com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().Mnp()) {
            intent = new Intent(context, (Class<?>) AdActivity.class);
        } else if (sUS) {
            intent = new Intent(context, (Class<?>) TTFullScreenExpressVideoActivity.class);
        } else if (pvs(NB)) {
            if (com.bytedance.sdk.openadsdk.component.reward.icD.so.pvs(NB)) {
                intent = new Intent(context, (Class<?>) TTInterstitialExpressActivity.class);
            } else {
                intent = new Intent(context, (Class<?>) TTFullScreenExpressVideoActivity.class);
            }
        } else if (com.bytedance.sdk.openadsdk.component.reward.icD.so.pvs(NB)) {
            intent = new Intent(context, (Class<?>) TTInterstitialActivity.class);
        } else {
            intent = new Intent(context, (Class<?>) TTFullScreenVideoActivity.class);
        }
        intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
        com.bytedance.sdk.openadsdk.component.reward.pvs.icD.pvs(intent, activity, this.Jd, this.icD, this.yiw);
        intent.putExtra("is_verity_playable", this.sUS);
        if (!com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            OT.pvs().pvs(this.vG);
            this.vG = null;
        }
        com.bytedance.sdk.component.utils.icD.pvs(context, intent, new icD.pvs() { // from class: com.bytedance.sdk.openadsdk.component.reward.sUS.1
            @Override // com.bytedance.sdk.component.utils.icD.pvs
            public void pvs() {
                if (sUS.this.sUS) {
                    try {
                        com.bytedance.sdk.openadsdk.Wyp.vG.pvs().pvs(NB.od().kj());
                    } catch (Throwable unused) {
                    }
                }
            }

            @Override // com.bytedance.sdk.component.utils.icD.pvs
            public void pvs(Throwable th) {
                com.bytedance.sdk.component.utils.Ju.pvs("TTFullScreenVideoAdImpl", "show full screen video error: ", th);
                if (sUS.this.sUS) {
                    try {
                        com.bytedance.sdk.openadsdk.Wyp.vG.pvs().pvs(NB.od().kj(), -1, th != null ? th.getMessage() : "playable tool error open");
                    } catch (Throwable unused) {
                    }
                }
                com.bytedance.sdk.openadsdk.icD.vG.pvs(NB, "fullscreen_interstitial_ad", "activity start  fail ");
            }
        });
        if (sUS) {
            return;
        }
        pvs.pvs(this.icD.NB(), this.Jd);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        com.bytedance.sdk.openadsdk.core.model.pvs pvsVar = this.icD;
        if (pvsVar == null || pvsVar.NB() == null) {
            return null;
        }
        return this.icD.NB().Wby();
    }

    private void pvs(final int i) {
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            ae.vG(new com.bytedance.sdk.component.so.so("FullScreen_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.sUS.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.pvs pvs = com.bytedance.sdk.openadsdk.multipro.aidl.pvs.pvs();
                    if (i != 1 || sUS.this.vG == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.multipro.aidl.icD.vG vGVar = new com.bytedance.sdk.openadsdk.multipro.aidl.icD.vG(sUS.this.vG);
                    IListenerManager asInterface = com.bytedance.sdk.openadsdk.multipro.aidl.pvs.NB.asInterface(pvs.pvs(1));
                    if (asInterface != null) {
                        try {
                            asInterface.registerFullVideoListener(sUS.this.yiw, vGVar);
                        } catch (RemoteException e) {
                            com.bytedance.sdk.component.utils.Ju.pvs("TTFullScreenVideoAdImpl", e.getMessage());
                        }
                    }
                }
            }, 5);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        if (this.so) {
            return;
        }
        dyT.pvs(this.icD.NB(), d);
        this.so = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        if (this.Mxy) {
            return;
        }
        dyT.pvs(this.icD.NB(), d, str, str2);
        this.Mxy = true;
    }
}
