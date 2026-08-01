package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import com.bytedance.sdk.component.so.so;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.utils.icD;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.OT;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.bytedance.sdk.openadsdk.utils.dyT;
import com.bytedance.sdk.openadsdk.utils.rCZ;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PAGAppOpenAdImpl.java */
/* loaded from: classes2.dex */
public class Jd extends PAGAppOpenAd {
    private com.bytedance.sdk.openadsdk.apiImpl.vG.icD Jd;
    private boolean Mxy;
    private final cR icD;
    private final Context pvs;
    private boolean so;
    private final AdSlot vG;
    private final boolean yiw;
    private final AtomicBoolean NB = new AtomicBoolean(false);
    private final String sUS = rCZ.pvs();

    public Jd(Context context, cR cRVar, boolean z, AdSlot adSlot) {
        this.pvs = context;
        this.icD = cRVar;
        this.yiw = z;
        this.vG = adSlot;
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionListener(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.Jd = new NB(pAGAppOpenAdInteractionListener);
        pvs();
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionCallback(PAGAppOpenAdInteractionCallback pAGAppOpenAdInteractionCallback) {
        this.Jd = new NB(pAGAppOpenAdInteractionCallback);
        pvs();
    }

    private void pvs() {
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            ae.vG(new so("AppOpenAd_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.Jd.1
                @Override // java.lang.Runnable
                public void run() {
                    IListenerManager asInterface;
                    com.bytedance.sdk.openadsdk.multipro.aidl.pvs pvs = com.bytedance.sdk.openadsdk.multipro.aidl.pvs.pvs();
                    if (Jd.this.Jd == null || (asInterface = com.bytedance.sdk.openadsdk.multipro.aidl.pvs.icD.asInterface(pvs.pvs(7))) == null) {
                        return;
                    }
                    try {
                        asInterface.registerAppOpenAdListener(Jd.this.sUS, new com.bytedance.sdk.openadsdk.multipro.aidl.icD.pvs(Jd.this.Jd));
                        Jd.this.Jd = null;
                    } catch (RemoteException e) {
                        Ju.pvs("TTAppOpenAdImpl", e.getMessage());
                    }
                }
            }, 5);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void show(Activity activity) {
        int i;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        if (this.NB.getAndSet(true)) {
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            Ju.pvs("TTAppOpenAdImpl", "showTTAppOpenAd error: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread ---- TTAppOpenAdImpl.showAppOpenAd");
        }
        Context context = activity != null ? activity : this.pvs;
        if (context == null) {
            context = mnm.pvs();
        }
        try {
            i = activity.getWindowManager().getDefaultDisplay().getRotation();
        } catch (Exception unused) {
            i = 0;
        }
        Intent intent = new Intent(context, (Class<?>) TTAppOpenAdActivity.class);
        intent.putExtra("orientation_angle", i);
        intent.putExtra(FirebaseAnalytics.Param.AD_SOURCE, this.yiw ? 1 : 2);
        if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
            intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, this.icD.wjr().toString());
            intent.putExtra(TTAdConstant.MULTI_PROCESS_META_MD5, this.sUS);
        } else {
            OT.pvs().sUS();
            OT.pvs().pvs(this.icD);
            OT.pvs().pvs(this.Jd);
            this.Jd = null;
        }
        intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
        com.bytedance.sdk.component.utils.icD.pvs(context, intent, new icD.pvs() { // from class: com.bytedance.sdk.openadsdk.component.Jd.2
            @Override // com.bytedance.sdk.component.utils.icD.pvs
            public void pvs() {
            }

            @Override // com.bytedance.sdk.component.utils.icD.pvs
            public void pvs(Throwable th) {
            }
        });
        com.bytedance.sdk.openadsdk.core.Ju.icD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.Jd.3
            @Override // java.lang.Runnable
            public void run() {
                if (Jd.this.vG != null) {
                    try {
                        if (com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().dX(Jd.this.vG.getCodeId()) == 1) {
                            sUS pvs = sUS.pvs(Jd.this.pvs);
                            pvs.yiw(Integer.parseInt(Jd.this.vG.getCodeId()));
                            pvs.pvs(Jd.this.vG);
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        if (this.so) {
            return;
        }
        dyT.pvs(this.icD, d);
        this.so = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        if (this.Mxy) {
            return;
        }
        dyT.pvs(this.icD, d, str, str2);
        this.Mxy = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        cR cRVar = this.icD;
        if (cRVar != null) {
            return cRVar.Wby();
        }
        return null;
    }
}
