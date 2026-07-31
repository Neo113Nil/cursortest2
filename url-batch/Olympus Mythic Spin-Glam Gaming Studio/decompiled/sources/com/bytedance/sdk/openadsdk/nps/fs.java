package com.bytedance.sdk.openadsdk.nps;

import android.text.TextUtils;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.GeckoHubImp;
import com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.mw;
import com.bytedance.sdk.openadsdk.cyb.fb;
import com.bytedance.sdk.openadsdk.fb.zn;
import com.bytedance.sdk.openadsdk.utils.nu;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class fs {
    private static final String[] zmn = {"gecko16-normal-useast5.tiktokv.us"};

    public interface zmn {
        void zmn();
    }

    /* renamed from: com.bytedance.sdk.openadsdk.nps.fs$fs, reason: collision with other inner class name */
    private static class C0201fs {
        private static final fs zmn = new fs();
    }

    public static fs zmn() {
        return C0201fs.zmn;
    }

    public ILoader fs() {
        try {
            return GeckoHubImp.inst(kgc.zmn()).getGeckoResLoader();
        } catch (Throwable th) {
            iqz.zmn("GeckoHub", "getGeckoResLoader error", th);
            return null;
        }
    }

    private fs() {
        try {
            GeckoHubImp.inst(kgc.zmn());
        } catch (Throwable th) {
            iqz.zmn("GeckoHub", "GeckoHubImp init error", th);
        }
    }

    private static String fb() {
        String[] lbc = kgc.fb().lbc();
        if (lbc == null) {
            lbc = zmn;
        }
        String str = lbc[new SecureRandom().nextInt(lbc.length)];
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        SecureRandom secureRandom = new SecureRandom();
        String[] strArr = zmn;
        return strArr[secureRandom.nextInt(strArr.length)];
    }

    public void zmn(Map<String, nqi> map) {
        zmn(map, (zmn) null, false);
    }

    public void zmn(final Map<String, nqi> map, final zmn zmnVar, boolean z) {
        try {
            String zmn2 = mw.zmn(kgc.zmn());
            if (TextUtils.isEmpty(zmn2)) {
                return;
            }
            for (nqi nqiVar : map.values()) {
                if (nqiVar != null) {
                    if (!z && nqiVar.gu()) {
                        map.remove(nqiVar.ltf());
                    } else {
                        fb.fs(nqiVar);
                    }
                }
            }
            if (map.isEmpty()) {
                return;
            }
            GeckoHubImp.setRandomHost(fb());
            GeckoHubImp.inst(kgc.zmn()).preload(zmn2, new IStatisticMonitor() { // from class: com.bytedance.sdk.openadsdk.nps.fs.1
                @Override // com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor
                public void upload(String str, JSONObject jSONObject) {
                    if ("geckosdk_update_stats".equals(str)) {
                        nqi nqiVar2 = (nqi) map.get(jSONObject.optString("channel"));
                        if (nqiVar2 != null) {
                            zn.zmn.zmn(str, jSONObject, nqiVar2);
                            return;
                        }
                        return;
                    }
                    if ("download_gecko_end".equals(str)) {
                        zmn zmnVar2 = zmnVar;
                        if (zmnVar2 != null) {
                            zmnVar2.zmn();
                        }
                        fs.fs(map, jSONObject, "");
                    }
                }
            }, map.keySet(), new com.bytedance.sdk.openadsdk.nps.zmn());
        } catch (Throwable th) {
            fs(map, null, th.toString());
            iqz.zmn("GeckoHub", "releaseGeckoResLoader error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fs(Map<String, nqi> map, JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject == null) {
                jSONObject2.put("success", false);
                jSONObject2.put("msg", str);
                jSONObject2.put("code", 1);
                jSONObject = jSONObject2;
            }
            Iterator<nqi> it = map.values().iterator();
            while (it.hasNext()) {
                fb.zmn(it.next(), jSONObject);
            }
        } catch (Throwable th) {
            iqz.zmn("GeckoHub", "upLoadStateEvent error", th);
        }
    }

    public void zmn(ILoader iLoader) {
        if (iLoader != null) {
            try {
                GeckoHubImp.inst(kgc.zmn()).releaseGeckoResLoader(iLoader);
            } catch (Throwable th) {
                iqz.zmn("GeckoHub", "releaseGeckoResLoader error", th);
            }
        }
    }

    public WebResourceResponseModel zmn(ILoader iLoader, String str, String str2) {
        if (iLoader == null) {
            return null;
        }
        try {
            return GeckoHubImp.inst(kgc.zmn()).findResAndMsg(iLoader, str, str2);
        } catch (Throwable th) {
            iqz.zmn("GeckoHub", "findRes error", th);
            return null;
        }
    }

    public int zmn(ILoader iLoader, String str) {
        try {
            return GeckoHubImp.inst(kgc.zmn()).getResCount(iLoader, str);
        } catch (Throwable th) {
            iqz.zmn("GeckoHub", "getResCount error", th);
            return 0;
        }
    }

    public static void zn() {
        try {
            GeckoHubImp.setThreadPoolExecutorCallback(new IThreadPoolCallback() { // from class: com.bytedance.sdk.openadsdk.nps.fs.2
                @Override // com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback
                public ExecutorService getThreadPool() {
                    return nu.btk();
                }
            });
        } catch (Throwable th) {
            iqz.zmn("GeckoHub", "setThreadPoolExecutor error", th);
        }
    }
}
