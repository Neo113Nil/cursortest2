package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.icD;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.AdActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.OT;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.bytedance.sdk.openadsdk.utils.dyT;
import com.bytedance.sdk.openadsdk.utils.rCZ;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PAGRewardVideoAdImpl.java */
/* loaded from: classes2.dex */
class so extends PAGRewardedAd {
    private com.bytedance.sdk.openadsdk.apiImpl.Jd.pvs Jd;
    private boolean Mxy;
    private boolean NB;
    private final com.bytedance.sdk.openadsdk.core.model.pvs icD;
    private final Context pvs;
    private boolean so;
    private final AdSlot vG;
    private final AtomicBoolean sUS = new AtomicBoolean(false);
    private final String yiw = rCZ.pvs();

    so(Context context, com.bytedance.sdk.openadsdk.core.model.pvs pvsVar, AdSlot adSlot) {
        this.pvs = context;
        this.icD = pvsVar;
        this.vG = adSlot;
    }

    public void pvs() {
        if (this.sUS.get()) {
            return;
        }
        this.NB = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionListener(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.Jd = new Mxy(pAGRewardedAdInteractionListener);
        pvs(0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionCallback(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.Jd = new Mxy(pAGRewardedAdInteractionCallback);
        pvs(0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void show(Activity activity) {
        Intent intent;
        if (activity != null && activity.isFinishing()) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTRewardVideoAdImpl", "showRewardVideoAd error1: activity is finishing");
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
            com.bytedance.sdk.component.utils.Ju.pvs("TTRewardVideoAdImpl", "showRewardVideoAd error2: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread —— TTRewardVideoAd.showRewardVideoAd");
        }
        if (this.sUS.compareAndSet(false, true)) {
            if (NB == null || NB.od() == null) {
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
                intent = new Intent(context, (Class<?>) TTRewardExpressVideoActivity.class);
            } else if (pvs(NB)) {
                intent = new Intent(context, (Class<?>) TTRewardExpressVideoActivity.class);
            } else {
                intent = new Intent(context, (Class<?>) TTRewardVideoActivity.class);
            }
            com.bytedance.sdk.openadsdk.component.reward.pvs.icD.pvs(intent, activity, this.NB, this.icD, this.yiw);
            intent.putExtra("media_extra", this.vG.getMediaExtra());
            intent.putExtra("user_id", this.vG.getUserID());
            intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
            if (!com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
                OT.pvs().pvs(this.Jd);
                this.Jd = null;
            }
            com.bytedance.sdk.component.utils.icD.pvs(context, intent, new icD.pvs() { // from class: com.bytedance.sdk.openadsdk.component.reward.so.1
                @Override // com.bytedance.sdk.component.utils.icD.pvs
                public void pvs() {
                }

                @Override // com.bytedance.sdk.component.utils.icD.pvs
                public void pvs(Throwable th) {
                    com.bytedance.sdk.component.utils.Ju.pvs("TTRewardVideoAdImpl", "show reward video error: ", th);
                    com.bytedance.sdk.openadsdk.icD.vG.pvs(NB, "fullscreen_interstitial_ad", "activity start  fail ");
                }
            });
            com.bytedance.sdk.openadsdk.core.Ju.icD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.so.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        AdSlot jlb = NB.jlb();
                        if (jlb != null) {
                            kj.pvs(so.this.pvs).pvs(jlb.getCodeId());
                            if (so.this.NB) {
                                kj.pvs(so.this.pvs).icD(jlb);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    private static boolean pvs(cR cRVar) {
        if (cRVar == null) {
            return false;
        }
        int mnm = cRVar.mnm();
        return (cRVar.OT() != 2 || mnm == 5 || mnm == 33 || mnm == 6 || mnm == 19 || mnm == 12) ? false : true;
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
            ae.vG(new com.bytedance.sdk.component.so.so("Reward_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.so.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.pvs pvs = com.bytedance.sdk.openadsdk.multipro.aidl.pvs.pvs();
                    if (i != 0 || so.this.Jd == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.multipro.aidl.icD.Jd jd = new com.bytedance.sdk.openadsdk.multipro.aidl.icD.Jd(so.this.Jd);
                    IListenerManager asInterface = com.bytedance.sdk.openadsdk.multipro.aidl.pvs.yiw.asInterface(pvs.pvs(0));
                    if (asInterface != null) {
                        try {
                            asInterface.registerRewardVideoListener(so.this.yiw, jd);
                        } catch (RemoteException e) {
                            com.bytedance.sdk.component.utils.Ju.pvs("TTRewardVideoAdImpl", e.getMessage());
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
