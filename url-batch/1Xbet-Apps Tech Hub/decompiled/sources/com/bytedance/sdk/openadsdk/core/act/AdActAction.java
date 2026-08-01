package com.bytedance.sdk.openadsdk.core.act;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.browser.customtabs.EngagementSignalsCallback;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.core.model.Wyp;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.core.so;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AdActAction {
    private String Jd;
    private String NB;
    private Long bNS;
    private Context icD;
    private BindCustomTabsServiceCallback mnm;
    private ActServiceConnection so;
    private cR vG;
    private CustomTabsSession yiw;
    private CustomTabsClient sUS = null;
    private boolean Mxy = false;
    private boolean Wyp = false;
    private boolean qh = false;
    private boolean kj = false;
    private boolean Ju = false;
    private long IP = 0;
    private icD vA = new icD() { // from class: com.bytedance.sdk.openadsdk.core.act.AdActAction.1
        @Override // com.bytedance.sdk.openadsdk.core.act.icD
        public void pvs(final CustomTabsClient customTabsClient) {
            if (ae.NB()) {
                AdActAction.this.pvs(customTabsClient);
            } else {
                ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.act.AdActAction.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AdActAction.this.pvs(customTabsClient);
                    }
                });
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.act.icD
        public void pvs() {
            AdActAction.this.sUS = null;
            AdActAction.this.so = null;
            AdActAction.this.yiw = null;
        }
    };
    public EngagementSignalsCallback pvs = new PAGEngagementSignalsCallback();
    private CustomTabsCallback cR = new PAGCustomTabsCallback();

    public interface BindCustomTabsServiceCallback {
        void onBindFail(int i, String str);

        void onBindSuccess(CustomTabsSession customTabsSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(CustomTabsClient customTabsClient) {
        this.sUS = customTabsClient;
        this.yiw = customTabsClient.newSession(this.cR);
        com.bytedance.sdk.openadsdk.Wyp.pvs.icD pvs = pvs(9);
        try {
            boolean isEngagementSignalsApiAvailable = this.yiw.isEngagementSignalsApiAvailable(Bundle.EMPTY);
            boolean z = false;
            if (isEngagementSignalsApiAvailable) {
                boolean engagementSignalsCallback = this.yiw.setEngagementSignalsCallback(this.pvs, Bundle.EMPTY);
                pvs.vG(1);
                pvs.pvs(1);
                if (engagementSignalsCallback) {
                    pvs.Jd(1);
                    pvs.icD(1);
                } else {
                    pvs.icD(0);
                }
                z = engagementSignalsCallback;
            } else {
                pvs.vG(0);
                pvs.pvs(0);
            }
            Object[] objArr = new Object[4];
            Boolean.valueOf(isEngagementSignalsApiAvailable);
            Boolean.valueOf(z);
            com.bytedance.sdk.openadsdk.icD.vG.pvs(pvs);
            BindCustomTabsServiceCallback bindCustomTabsServiceCallback = this.mnm;
            if (bindCustomTabsServiceCallback != null) {
                bindCustomTabsServiceCallback.onBindSuccess(this.yiw);
            }
        } catch (Throwable th) {
            BindCustomTabsServiceCallback bindCustomTabsServiceCallback2 = this.mnm;
            if (bindCustomTabsServiceCallback2 != null) {
                bindCustomTabsServiceCallback2.onBindFail(11, th.getMessage());
            }
        }
    }

    public class PAGEngagementSignalsCallback implements EngagementSignalsCallback {
        public PAGEngagementSignalsCallback() {
        }

        @Override // androidx.browser.customtabs.EngagementSignalsCallback
        public void onVerticalScrollEvent(boolean z, Bundle bundle) {
            AdActAction.this.IP = System.currentTimeMillis();
            if (AdActAction.this.vG == null || AdActAction.this.Mxy) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ImagesContract.URL, AdActAction.this.NB);
                jSONObject.put("down_time", AdActAction.this.IP);
                long currentTimeMillis = System.currentTimeMillis();
                jSONObject.put("up_time", currentTimeMillis);
                com.bytedance.sdk.openadsdk.icD.vG.icD(AdActAction.this.vG, jlb.pvs(AdActAction.this.vG), "in_web_click", jSONObject, currentTimeMillis - AdActAction.this.IP);
            } catch (Throwable th) {
                Ju.pvs("AdActAction", th.getMessage());
            }
            if (!TextUtils.isEmpty(cR.pvs(AdActAction.this.icD, AdActAction.this.vG))) {
                com.bytedance.sdk.openadsdk.icD.vG.pvs("click", AdActAction.this.vG, new Wyp.pvs().icD(AdActAction.this.IP).pvs(System.currentTimeMillis()).icD(so.icD().pvs() ? 1 : 2).vG(Pj.yiw(AdActAction.this.icD)).pvs(Pj.NB(AdActAction.this.icD)).icD(Pj.sUS(AdActAction.this.icD)).pvs(), jlb.pvs(AdActAction.this.vG), true, (Map<String, Object>) new HashMap(), 2);
            }
            AdActAction.this.Mxy = true;
        }

        @Override // androidx.browser.customtabs.EngagementSignalsCallback
        public void onGreatestScrollPercentageIncreased(int i, Bundle bundle) {
            Object[] objArr = new Object[2];
            Integer.valueOf(i);
        }

        @Override // androidx.browser.customtabs.EngagementSignalsCallback
        public void onSessionEnded(boolean z, Bundle bundle) {
            Object[] objArr = new Object[2];
            Boolean.valueOf(z);
        }
    }

    public class PAGCustomTabsCallback extends CustomTabsCallback {
        public PAGCustomTabsCallback() {
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onNavigationEvent(int i, Bundle bundle) {
            Object[] objArr = new Object[2];
            Integer.valueOf(i);
            if (i == 1) {
                AdActAction.this.bNS = Long.valueOf(SystemClock.elapsedRealtime());
                if (AdActAction.this.kj || AdActAction.this.vG == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    AdActAction.this.pvs("load_start", jSONObject, 0L);
                    AdActAction.this.kj = true;
                    return;
                } catch (Throwable th) {
                    Ju.pvs("AdActAction", th.getMessage());
                    return;
                }
            }
            if (i == 2) {
                if (AdActAction.this.Wyp || AdActAction.this.bNS == null || AdActAction.this.vG == null) {
                    return;
                }
                long longValue = AdActAction.this.bNS.longValue() - SystemClock.elapsedRealtime();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("first_page", true);
                    jSONObject2.putOpt("render_type", "h5");
                    jSONObject2.putOpt("render_type_2", 0);
                    jSONObject2.put(ImagesContract.URL, AdActAction.this.NB);
                    jSONObject2.put("preload_h5_type", AdActAction.this.vG.CL());
                    AdActAction.this.pvs("load_finish", jSONObject2, longValue);
                    AdActAction.this.Wyp = true;
                    return;
                } catch (Throwable th2) {
                    Ju.pvs("AdActAction", th2.getMessage());
                    return;
                }
            }
            if (i != 3) {
                if (i != 6) {
                    return;
                }
                AdActAction.this.pvs();
                if (AdActAction.this.Ju || AdActAction.this.vG == null || AdActAction.this.qh || AdActAction.this.Wyp || AdActAction.this.bNS == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.icD.vG.pvs(AdActAction.this.vG, jlb.pvs(AdActAction.this.vG), SystemClock.elapsedRealtime() - AdActAction.this.bNS.longValue(), 0, 1);
                return;
            }
            if (AdActAction.this.qh || AdActAction.this.vG == null) {
                return;
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.putOpt("render_type", "h5");
                jSONObject3.putOpt("render_type_2", 0);
                jSONObject3.put(ImagesContract.URL, AdActAction.this.NB);
                jSONObject3.put("preload_h5_type", AdActAction.this.vG.CL());
                AdActAction.this.pvs("load_fail", jSONObject3, 0L);
                AdActAction.this.qh = true;
            } catch (Throwable th3) {
                Ju.pvs("AdActAction", th3.getMessage());
            }
        }
    }

    public AdActAction(Context context, cR cRVar, String str, String str2) {
        this.icD = context;
        this.vG = cRVar;
        this.Jd = str;
        this.NB = str2;
    }

    public void pvs(BindCustomTabsServiceCallback bindCustomTabsServiceCallback) {
        this.mnm = bindCustomTabsServiceCallback;
        if (this.icD == null || this.vG == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.icD.vG.pvs(pvs(8));
            String pvs = pvs.pvs(this.icD);
            if (pvs == null) {
                return;
            }
            ActServiceConnection actServiceConnection = new ActServiceConnection(this.vA);
            this.so = actServiceConnection;
            CustomTabsClient.bindCustomTabsService(this.icD, pvs, actServiceConnection);
        } catch (Throwable th) {
            String message = th.getMessage();
            Ju.pvs("AdActAction", message);
            BindCustomTabsServiceCallback bindCustomTabsServiceCallback2 = this.mnm;
            if (bindCustomTabsServiceCallback2 != null) {
                bindCustomTabsServiceCallback2.onBindFail(10, message);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs() {
        try {
            ActServiceConnection actServiceConnection = this.so;
            if (actServiceConnection == null) {
                return;
            }
            this.icD.unbindService(actServiceConnection);
            this.sUS = null;
            this.yiw = null;
            this.so = null;
        } catch (Throwable th) {
            Ju.pvs("AdActAction", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(String str, final JSONObject jSONObject, final long j) {
        if (this.vG == null || TextUtils.isEmpty(str)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        cR cRVar = this.vG;
        com.bytedance.sdk.openadsdk.icD.vG.pvs(currentTimeMillis, cRVar, jlb.pvs(cRVar), str, new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.core.act.AdActAction.2
            @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
            public JSONObject pvs() {
                JSONObject jSONObject2;
                Throwable th;
                try {
                    int i = 1;
                    jSONObject.put("is_playable", rCZ.icD(AdActAction.this.vG) ? 1 : 0);
                    JSONObject jSONObject3 = jSONObject;
                    if (!com.bytedance.sdk.openadsdk.core.video.icD.pvs.pvs().pvs(AdActAction.this.vG)) {
                        i = 0;
                    }
                    jSONObject3.put("usecache", i);
                    jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("ad_extra_data", jSONObject.toString());
                        long j2 = j;
                        if (j2 > 0) {
                            jSONObject2.put(TypedValues.TransitionType.S_DURATION, j2);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        Ju.pvs("AdActAction", th.getMessage());
                        return jSONObject2;
                    }
                } catch (Throwable th3) {
                    jSONObject2 = null;
                    th = th3;
                }
                return jSONObject2;
            }
        });
    }

    private com.bytedance.sdk.openadsdk.Wyp.pvs.icD pvs(int i) {
        com.bytedance.sdk.openadsdk.Wyp.pvs.icD icd = new com.bytedance.sdk.openadsdk.Wyp.pvs.icD();
        icd.pvs(this.Jd);
        icd.pvs(this.vG);
        icd.icD(jlb.pvs(this.vG));
        icd.pvs(i);
        icd.pvs(false);
        icd.icD(8);
        return icd;
    }
}
