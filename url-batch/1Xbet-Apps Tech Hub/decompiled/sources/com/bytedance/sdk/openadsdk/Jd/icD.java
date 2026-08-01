package com.bytedance.sdk.openadsdk.Jd;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.GeckoHubImp;
import com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.Wyp.vG;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.icD.vG;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* compiled from: GeckoHub.java */
/* loaded from: classes2.dex */
public class icD {
    private static final String[] pvs = {"gecko-pangle-sg.byteoversea.com"};

    /* compiled from: GeckoHub.java */
    private static class pvs {
        private static final icD pvs = new icD();
    }

    public static icD pvs() {
        return pvs.pvs;
    }

    public ILoader icD() {
        try {
            return GeckoHubImp.inst(mnm.pvs()).getGeckoResLoader();
        } catch (Throwable th) {
            Ju.pvs("GeckoHub", "getGeckoResLoader error", th);
            return null;
        }
    }

    private icD() {
        try {
            GeckoHubImp.inst(mnm.pvs());
        } catch (Throwable th) {
            Ju.pvs("GeckoHub", "GeckoHubImp init error", th);
        }
    }

    private static String Jd() {
        String[] neB = mnm.Jd().neB();
        if (neB != null) {
            int length = neB.length;
        }
        if (neB == null) {
            neB = pvs;
        }
        String str = neB[new SecureRandom().nextInt(neB.length)];
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        SecureRandom secureRandom = new SecureRandom();
        String[] strArr = pvs;
        return strArr[secureRandom.nextInt(strArr.length)];
    }

    public void pvs(final Map<String, cR> map) {
        try {
            String pvs2 = qh.pvs(mnm.pvs());
            if (TextUtils.isEmpty(pvs2)) {
                return;
            }
            Iterator<cR> it = map.values().iterator();
            while (it.hasNext()) {
                vG.icD(it.next());
            }
            GeckoHubImp.setRandomHost(Jd());
            GeckoHubImp.inst(mnm.pvs()).preload(pvs2, new IStatisticMonitor() { // from class: com.bytedance.sdk.openadsdk.Jd.icD.1
                @Override // com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor
                public void upload(String str, JSONObject jSONObject) {
                    if ("geckosdk_update_stats".equals(str)) {
                        cR cRVar = (cR) map.get(jSONObject.optString("channel"));
                        if (cRVar != null) {
                            vG.pvs.pvs(str, jSONObject, cRVar);
                            return;
                        }
                        return;
                    }
                    if ("download_gecko_end".equals(str)) {
                        icD.icD(map, jSONObject, "");
                    }
                }
            }, map.keySet(), new com.bytedance.sdk.openadsdk.Jd.pvs());
        } catch (Throwable th) {
            icD(map, null, th.toString());
            Ju.pvs("GeckoHub", "releaseGeckoResLoader error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void icD(Map<String, cR> map, JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject == null) {
                jSONObject2.put(FirebaseAnalytics.Param.SUCCESS, false);
                jSONObject2.put(NotificationCompat.CATEGORY_MESSAGE, str);
                jSONObject2.put("code", 1);
                jSONObject = jSONObject2;
            }
            Iterator<cR> it = map.values().iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.openadsdk.Wyp.vG.pvs(it.next(), jSONObject);
            }
        } catch (Throwable th) {
            Ju.pvs("GeckoHub", "upLoadStateEvent error", th);
        }
    }

    public void pvs(ILoader iLoader) {
        if (iLoader != null) {
            try {
                GeckoHubImp.inst(mnm.pvs()).releaseGeckoResLoader(iLoader);
            } catch (Throwable th) {
                Ju.pvs("GeckoHub", "releaseGeckoResLoader error", th);
            }
        }
    }

    public WebResourceResponseModel pvs(ILoader iLoader, String str, String str2) {
        if (iLoader == null) {
            return null;
        }
        try {
            return GeckoHubImp.inst(mnm.pvs()).findResAndMsg(iLoader, str, str2);
        } catch (Throwable th) {
            Ju.pvs("GeckoHub", "findRes error", th);
            return null;
        }
    }

    public int pvs(ILoader iLoader, String str) {
        try {
            return GeckoHubImp.inst(mnm.pvs()).getResCount(iLoader, str);
        } catch (Throwable th) {
            Ju.pvs("GeckoHub", "getResCount error", th);
            return 0;
        }
    }

    public static void vG() {
        try {
            GeckoHubImp.setThreadPoolExecutorCallback(new IThreadPoolCallback() { // from class: com.bytedance.sdk.openadsdk.Jd.icD.2
                @Override // com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback
                public ExecutorService getThreadPool() {
                    return ae.Jd();
                }
            });
        } catch (Throwable th) {
            Ju.pvs("GeckoHub", "setThreadPoolExecutor error", th);
        }
    }
}
