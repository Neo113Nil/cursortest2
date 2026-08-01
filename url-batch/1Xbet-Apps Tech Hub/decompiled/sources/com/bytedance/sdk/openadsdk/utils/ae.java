package com.bytedance.sdk.openadsdk.utils;

import android.os.Looper;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import androidx.work.WorkRequest;
import com.bytedance.sdk.component.so.vG.sUS;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: ThreadUtils.java */
/* loaded from: classes2.dex */
public class ae {
    private static volatile com.bytedance.sdk.component.so.vG.sUS Jd;
    private static volatile com.bytedance.sdk.component.so.vG.sUS Mxy;
    private static volatile com.bytedance.sdk.component.so.vG.sUS NB;
    private static volatile com.bytedance.sdk.component.so.vG.sUS Wyp;
    private static volatile boolean icD;
    private static volatile ThreadPoolExecutor pvs;
    private static volatile com.bytedance.sdk.component.so.vG.sUS sUS;
    private static volatile com.bytedance.sdk.component.so.vG.sUS so;
    private static volatile com.bytedance.sdk.component.so.vG.sUS vG;
    private static volatile com.bytedance.sdk.component.so.vG.sUS yiw;

    static {
        com.bytedance.sdk.component.so.vG.vG.pvs(new com.bytedance.sdk.component.so.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.utils.ae.1
            @Override // com.bytedance.sdk.component.so.vG.pvs
            public void pvs(com.bytedance.sdk.component.so.vG.sUS sus, com.bytedance.sdk.component.so.vG.icD icd) {
                icd.icD();
                new RuntimeException();
            }
        });
        com.bytedance.sdk.component.so.vG.vG.pvs(new com.bytedance.sdk.component.so.vG.NB() { // from class: com.bytedance.sdk.openadsdk.utils.ae.3
            @Override // com.bytedance.sdk.component.so.vG.NB
            public void pvs(final com.bytedance.sdk.component.so.vG.sUS sus) {
                if (dX.pvs || sus == null) {
                    return;
                }
                try {
                    LinkedHashMap<String, com.bytedance.sdk.component.so.vG.pvs.pvs> pvs2 = sus.pvs();
                    if (pvs2 == null || pvs2.size() <= 0) {
                        return;
                    }
                    Iterator<Map.Entry<String, com.bytedance.sdk.component.so.vG.pvs.pvs>> it = pvs2.entrySet().iterator();
                    while (it.hasNext()) {
                        final com.bytedance.sdk.component.so.vG.pvs.pvs value = it.next().getValue();
                        if (value != null) {
                            com.bytedance.sdk.openadsdk.Wyp.vG.pvs();
                            com.bytedance.sdk.openadsdk.Wyp.vG.pvs("pag_thread_pool_state", false, new com.bytedance.sdk.openadsdk.Wyp.icD() { // from class: com.bytedance.sdk.openadsdk.utils.ae.3.1
                                @Override // com.bytedance.sdk.openadsdk.Wyp.icD
                                public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("name", value.pvs());
                                        jSONObject.put("times", value.icD());
                                        jSONObject.put("runMaxTime", value.sUS());
                                        jSONObject.put("waitMaxTime", value.NB());
                                        long icD2 = value.icD() == 0 ? 1 : value.icD();
                                        jSONObject.put("avgRunTime", value.Jd() / icD2);
                                        jSONObject.put("avgWaitTime", value.vG() / icD2);
                                        jSONObject.put("poolType", sus.icD());
                                    } catch (Exception e) {
                                        com.bytedance.sdk.component.utils.Ju.pvs("ThreadUtils", "run: ", e);
                                    }
                                    return com.bytedance.sdk.openadsdk.Wyp.pvs.Jd.icD().pvs("pag_thread_pool_state").icD(jSONObject.toString());
                                }
                            });
                        }
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        });
        pvs = null;
        icD = false;
    }

    public static ScheduledExecutorService pvs() {
        return com.bytedance.sdk.component.so.sUS.sUS();
    }

    public static ExecutorService icD() {
        if (Wyp()) {
            return mnm();
        }
        return com.bytedance.sdk.component.so.sUS.Wyp();
    }

    public static ExecutorService vG() {
        if (Wyp()) {
            return IP();
        }
        return com.bytedance.sdk.component.so.sUS.Jd();
    }

    public static ExecutorService Jd() {
        if (Wyp()) {
            return Ju();
        }
        return com.bytedance.sdk.component.so.sUS.icD();
    }

    public static boolean NB() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static boolean sUS() {
        String str = Wyp() ? "pag_log" : "csj_log";
        String name = Thread.currentThread().getName();
        if (TextUtils.isEmpty(name)) {
            return false;
        }
        return name.startsWith(str);
    }

    public static void pvs(Runnable runnable) {
        if (runnable == null || dX.pvs) {
            return;
        }
        if (NB()) {
            runnable.run();
        } else {
            com.bytedance.sdk.openadsdk.core.Ju.vG().post(runnable);
        }
    }

    public static void pvs(final com.bytedance.sdk.component.so.so soVar) {
        if (dX.pvs) {
            return;
        }
        if (Wyp()) {
            Ju().execute(new com.bytedance.sdk.component.so.vG.icD(soVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.ae.4
                @Override // java.lang.Runnable
                public void run() {
                    soVar.run();
                }
            });
        } else {
            com.bytedance.sdk.component.so.sUS.pvs(soVar);
        }
    }

    public static ExecutorService yiw() {
        if (Wyp()) {
            return vA();
        }
        return com.bytedance.sdk.component.so.sUS.vG();
    }

    public static void icD(final com.bytedance.sdk.component.so.so soVar) {
        if (dX.pvs) {
            return;
        }
        if (Wyp()) {
            vA().execute(new com.bytedance.sdk.component.so.vG.icD(soVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.ae.5
                @Override // java.lang.Runnable
                public void run() {
                    soVar.run();
                }
            });
        } else {
            com.bytedance.sdk.component.so.sUS.icD(soVar);
        }
    }

    public static void pvs(final com.bytedance.sdk.component.so.so soVar, int i) {
        if (soVar == null || dX.pvs) {
            return;
        }
        if (Wyp()) {
            com.bytedance.sdk.component.so.vG.icD icd = new com.bytedance.sdk.component.so.vG.icD(soVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.ae.6
                @Override // java.lang.Runnable
                public void run() {
                    soVar.run();
                }
            };
            icd.pvs(i);
            vA().execute(icd);
            return;
        }
        com.bytedance.sdk.component.so.sUS.pvs(soVar, 5, i);
    }

    public static void vG(final com.bytedance.sdk.component.so.so soVar) {
        if (soVar == null || dX.pvs) {
            return;
        }
        if (Wyp()) {
            IP().execute(new com.bytedance.sdk.component.so.vG.icD(soVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.ae.7
                @Override // java.lang.Runnable
                public void run() {
                    soVar.run();
                }
            });
        } else {
            com.bytedance.sdk.component.so.sUS.vG(soVar);
        }
    }

    public static void icD(final com.bytedance.sdk.component.so.so soVar, int i) {
        if (soVar == null || dX.pvs) {
            return;
        }
        if (Wyp()) {
            com.bytedance.sdk.component.so.vG.icD icd = new com.bytedance.sdk.component.so.vG.icD(soVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.ae.8
                @Override // java.lang.Runnable
                public void run() {
                    soVar.run();
                }
            };
            icd.pvs(i);
            IP().execute(icd);
            return;
        }
        com.bytedance.sdk.component.so.sUS.icD(soVar, i);
    }

    public static void Jd(final com.bytedance.sdk.component.so.so soVar) {
        if (soVar == null || dX.pvs) {
            return;
        }
        if (Wyp()) {
            kj().execute(new com.bytedance.sdk.component.so.vG.icD(soVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.ae.9
                @Override // java.lang.Runnable
                public void run() {
                    soVar.run();
                }
            });
        } else {
            com.bytedance.sdk.component.so.sUS.NB(soVar);
        }
    }

    public static void vG(final com.bytedance.sdk.component.so.so soVar, int i) {
        if (soVar == null || dX.pvs) {
            return;
        }
        if (Wyp()) {
            bNS().execute(new com.bytedance.sdk.component.so.vG.icD(soVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.ae.10
                @Override // java.lang.Runnable
                public void run() {
                    soVar.run();
                }
            });
        } else {
            com.bytedance.sdk.component.so.sUS.vG(soVar, i);
        }
    }

    public static void NB(final com.bytedance.sdk.component.so.so soVar) {
        if (dX.pvs) {
            return;
        }
        if (Wyp()) {
            kj().execute(new com.bytedance.sdk.component.so.vG.icD(soVar.getName(), soVar) { // from class: com.bytedance.sdk.openadsdk.utils.ae.2
                @Override // java.lang.Runnable
                public void run() {
                    soVar.run();
                }
            });
            return;
        }
        ThreadPoolExecutor qh = qh();
        qh.execute(soVar);
        if (icD || !com.bytedance.sdk.openadsdk.core.settings.mnm.BiC()) {
            return;
        }
        icD = true;
        qh.setCorePoolSize(com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().UYh());
    }

    public static void pvs(com.bytedance.sdk.component.so.vG.icD icd) {
        Mxy().execute(icd);
    }

    private static ThreadPoolExecutor qh() {
        int i;
        if (pvs == null) {
            synchronized (ae.class) {
                if (pvs == null) {
                    if (com.bytedance.sdk.openadsdk.core.settings.mnm.BiC()) {
                        i = com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().UYh();
                        icD = true;
                    } else {
                        i = 4;
                    }
                    pvs = new ThreadPoolExecutor(i, Integer.MAX_VALUE, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    Object[] objArr = new Object[2];
                    Integer.valueOf(i);
                }
            }
        }
        return pvs;
    }

    private static ThreadPoolExecutor kj() {
        com.bytedance.sdk.component.so.vG.sUS sus;
        com.bytedance.sdk.component.so.vG.sUS sus2 = vG;
        if (!pvs(sus2)) {
            return sus2;
        }
        synchronized (ae.class) {
            if (pvs(vG)) {
                try {
                    vG = pvs("ad", vG);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            sus = vG;
        }
        return sus;
    }

    private static com.bytedance.sdk.component.so.vG.sUS Ju() {
        com.bytedance.sdk.component.so.vG.sUS sus;
        com.bytedance.sdk.component.so.vG.sUS sus2 = sUS;
        if (!pvs(sus2)) {
            return sus2;
        }
        synchronized (ae.class) {
            if (pvs(sUS)) {
                try {
                    sUS = pvs("cache", sUS);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            sus = sUS;
        }
        return sus;
    }

    private static com.bytedance.sdk.component.so.vG.sUS IP() {
        com.bytedance.sdk.component.so.vG.sUS sus;
        com.bytedance.sdk.component.so.vG.sUS sus2 = Jd;
        if (!pvs(sus2)) {
            return sus2;
        }
        synchronized (ae.class) {
            if (pvs(Jd)) {
                try {
                    Jd = pvs("log", Jd);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            sus = Jd;
        }
        return sus;
    }

    private static com.bytedance.sdk.component.so.vG.sUS bNS() {
        com.bytedance.sdk.component.so.vG.sUS sus;
        com.bytedance.sdk.component.so.vG.sUS sus2 = NB;
        if (!pvs(sus2)) {
            return sus2;
        }
        synchronized (ae.class) {
            if (pvs(NB)) {
                try {
                    NB = pvs("aidl", NB);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            sus = NB;
        }
        return sus;
    }

    private static com.bytedance.sdk.component.so.vG.sUS mnm() {
        com.bytedance.sdk.component.so.vG.sUS sus;
        com.bytedance.sdk.component.so.vG.sUS sus2 = so;
        if (!pvs(sus2)) {
            return sus2;
        }
        synchronized (ae.class) {
            if (pvs(so)) {
                try {
                    so = pvs("image", so);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            sus = so;
        }
        return sus;
    }

    public static com.bytedance.sdk.component.so.vG.sUS so() {
        com.bytedance.sdk.component.so.vG.sUS sus;
        com.bytedance.sdk.component.so.vG.sUS sus2 = Mxy;
        if (!pvs(sus2)) {
            return sus2;
        }
        synchronized (ae.class) {
            if (pvs(Mxy)) {
                try {
                    Mxy = pvs("express", Mxy);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            sus = Mxy;
        }
        return sus;
    }

    private static com.bytedance.sdk.component.so.vG.sUS vA() {
        com.bytedance.sdk.component.so.vG.sUS sus;
        com.bytedance.sdk.component.so.vG.sUS sus2 = yiw;
        if (!pvs(sus2)) {
            return sus2;
        }
        synchronized (ae.class) {
            if (pvs(yiw)) {
                try {
                    yiw = pvs("io", yiw);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            sus = yiw;
        }
        return sus;
    }

    public static com.bytedance.sdk.component.so.vG.sUS Mxy() {
        com.bytedance.sdk.component.so.vG.sUS sus;
        com.bytedance.sdk.component.so.vG.sUS sus2 = Wyp;
        if (!pvs(sus2)) {
            return sus2;
        }
        synchronized (ae.class) {
            if (pvs(Wyp)) {
                try {
                    Wyp = pvs("net", Wyp);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            sus = Wyp;
        }
        return sus;
    }

    private static boolean pvs(com.bytedance.sdk.component.so.vG.sUS sus) {
        if (sus != null) {
            return !sus.vG() && com.bytedance.sdk.openadsdk.core.settings.mnm.BiC();
        }
        return true;
    }

    public static boolean Wyp() {
        if (com.bytedance.sdk.openadsdk.core.settings.mnm.BiC()) {
            return com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().wjr();
        }
        return true;
    }

    private static com.bytedance.sdk.component.so.vG.sUS pvs(String str, com.bytedance.sdk.component.so.vG.sUS sus) {
        sUS.pvs pvs2 = pvs(str);
        if (sus == null) {
            return pvs2.pvs();
        }
        sus.pvs(pvs2);
        return sus;
    }

    private static sUS.pvs pvs(String str) {
        sUS.pvs icD2 = icD(str);
        try {
            if (com.bytedance.sdk.openadsdk.core.settings.mnm.BiC()) {
                icD2.icD(true);
                JSONObject FN = com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().FN();
                JSONObject optJSONObject = FN != null ? FN.optJSONObject(str) : null;
                if (optJSONObject != null) {
                    icD2.icD(true);
                    if (optJSONObject.has("coreSize")) {
                        icD2.pvs(optJSONObject.optInt("coreSize"));
                    }
                    if (optJSONObject.has("maxSize")) {
                        icD2.icD(optJSONObject.optInt("maxSize"));
                    }
                    if (optJSONObject.has("createSize")) {
                        icD2.vG(optJSONObject.optInt("createSize"));
                    }
                    if (optJSONObject.has("keepAlive")) {
                        icD2.pvs(optJSONObject.optInt("keepAlive"));
                    }
                    if (optJSONObject.has("allowCoreTimeOut")) {
                        icD2.pvs(optJSONObject.optBoolean("allowCoreTimeOut"));
                    }
                    if (optJSONObject.has("reportLogThreshold")) {
                        icD2.NB(optJSONObject.optInt("reportLogThreshold"));
                    }
                    if (optJSONObject.has("logTaskCount")) {
                        icD2.Jd(optJSONObject.optInt("logTaskCount"));
                    }
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return icD2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static sUS.pvs icD(String str) {
        char c;
        if (TextUtils.isEmpty(str)) {
            str = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        sUS.pvs pvsVar = new sUS.pvs();
        str.hashCode();
        switch (str.hashCode()) {
            case -1308979344:
                if (str.equals("express")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3107:
                if (str.equals("ad")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3366:
                if (str.equals("io")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 107332:
                if (str.equals("log")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 108957:
                if (str.equals("net")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2993840:
                if (str.equals("aidl")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 94416770:
                if (str.equals("cache")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 100313435:
                if (str.equals("image")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return pvsVar.pvs(str).pvs(2).icD(4).vG(0).pvs(WorkRequest.MIN_BACKOFF_MILLIS).pvs(true).NB(-1).Jd(10).icD(false);
            case 1:
                return pvsVar.pvs(str).pvs(4).icD(4).vG(0).pvs(20000L).pvs(true).NB(-1).Jd(10).icD(false);
            case 2:
                return pvsVar.pvs(str).pvs(4).icD(10).vG(0).pvs(20000L).pvs(true).NB(-1).Jd(10).icD(false);
            case 3:
                return pvsVar.pvs(str).pvs(4).icD(6).vG(2).pvs(20000L).pvs(true).NB(-1).Jd(10).icD(false);
            case 4:
                return pvsVar.pvs(str).pvs(10).icD(10).vG(0).pvs(WorkRequest.MIN_BACKOFF_MILLIS).pvs(true).NB(-1).Jd(10).icD(false);
            case 5:
                return pvsVar.pvs(str).pvs(2).icD(4).vG(0).pvs(WorkRequest.MIN_BACKOFF_MILLIS).pvs(true).NB(-1).Jd(10).icD(false);
            case 6:
                return pvsVar.pvs(str).pvs(0).icD(0).vG(0).pvs(5000L).pvs(true).NB(-1).Jd(20).icD(false);
            case 7:
                return pvsVar.pvs(str).pvs(3).icD(3).vG(0).pvs(20000L).pvs(true).NB(-1).Jd(10).icD(false);
            default:
                return pvsVar.pvs(str).pvs(8).icD(16).vG(2).pvs(20000L).pvs(true).NB(-1).Jd(10).icD(false);
        }
    }
}
