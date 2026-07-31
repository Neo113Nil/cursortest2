package com.bytedance.sdk.openadsdk.utils;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.zg.fs.nps;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class nu {
    private static volatile com.bytedance.sdk.component.zg.fs.nps btk;
    private static volatile com.bytedance.sdk.component.zg.fs.nps bvs;
    private static volatile com.bytedance.sdk.component.zg.fs.nps fb;
    private static volatile ThreadPoolExecutor fs;
    private static volatile com.bytedance.sdk.component.zg.fs.nps hhw;
    private static volatile com.bytedance.sdk.component.zg.fs.nps iv;
    private static volatile com.bytedance.sdk.component.zg.fs.nps klz;
    private static volatile com.bytedance.sdk.component.zg.fs.nps mw;
    private static volatile com.bytedance.sdk.component.zg.fs.nps nps;
    private static volatile com.bytedance.sdk.component.zg.fs.nps rc;
    private static volatile com.bytedance.sdk.component.zg.fs.nps rt;
    private static volatile com.bytedance.sdk.component.zg.fs.nps zg;
    private static volatile ScheduledExecutorService zmn;
    private static volatile boolean zn;

    static {
        com.bytedance.sdk.component.zg.fs.fb.zmn(new com.bytedance.sdk.component.zg.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.utils.nu.1
            @Override // com.bytedance.sdk.component.zg.fs.zmn
            public void zmn(com.bytedance.sdk.component.zg.fs.nps npsVar, com.bytedance.sdk.component.zg.fs.zn znVar) {
                znVar.getName();
                new RuntimeException();
            }
        });
        com.bytedance.sdk.component.zg.zmn.zmn(new com.bytedance.sdk.component.zmn() { // from class: com.bytedance.sdk.openadsdk.utils.nu.2
            @Override // com.bytedance.sdk.component.zmn
            public void zmn(Runnable runnable) {
                nu.zn(runnable);
            }
        });
        fs = null;
        zn = false;
    }

    public static ScheduledExecutorService zmn() {
        if (zmn == null) {
            synchronized (nu.class) {
                try {
                    if (zmn == null) {
                        zmn = Executors.newSingleThreadScheduledExecutor(new com.bytedance.sdk.component.zg.fs.btk("scheduled"));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    public static ExecutorService fs() {
        return cyb();
    }

    public static ExecutorService zn() {
        return kgc();
    }

    public static ExecutorService fb() {
        return cn();
    }

    public static ExecutorService btk() {
        return bvs();
    }

    public static boolean hhw() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static boolean nps() {
        String name = Thread.currentThread().getName();
        if (TextUtils.isEmpty(name)) {
            return false;
        }
        return name.startsWith("pag_log");
    }

    public static void zmn(Runnable runnable) {
        if (runnable == null || fkt.zmn) {
            return;
        }
        if (hhw()) {
            runnable.run();
        } else {
            com.bytedance.sdk.openadsdk.core.cn.zn().post(runnable);
        }
    }

    public static void fs(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.cn.zn().removeCallbacks(runnable);
    }

    public static void zmn(com.bytedance.sdk.component.zg.fs.zn znVar) {
        if (fkt.zmn) {
            return;
        }
        bvs().execute(znVar);
    }

    public static ExecutorService zg() {
        return olo();
    }

    public static void zn(Runnable runnable) {
        if (fkt.zmn) {
            return;
        }
        olo().execute(runnable);
    }

    public static void zmn(com.bytedance.sdk.component.zg.fs.zn znVar, int i) {
        if (znVar == null || fkt.zmn) {
            return;
        }
        znVar.setPriority(i);
        olo().execute(znVar);
    }

    public static void fs(com.bytedance.sdk.component.zg.fs.zn znVar) {
        if (znVar == null || fkt.zmn) {
            return;
        }
        cn().execute(znVar);
    }

    public static void fs(com.bytedance.sdk.component.zg.fs.zn znVar, int i) {
        if (znVar == null || fkt.zmn) {
            return;
        }
        znVar.setPriority(i);
        cn().execute(znVar);
    }

    public static void zn(com.bytedance.sdk.component.zg.fs.zn znVar) {
        if (znVar == null || fkt.zmn) {
            return;
        }
        rt().execute(znVar);
    }

    public static void fb(com.bytedance.sdk.component.zg.fs.zn znVar) {
        if (fkt.zmn) {
            return;
        }
        rt().execute(znVar);
    }

    public static void btk(com.bytedance.sdk.component.zg.fs.zn znVar) {
        mw().execute(znVar);
    }

    private static ThreadPoolExecutor rt() {
        com.bytedance.sdk.component.zg.fs.nps npsVar;
        com.bytedance.sdk.component.zg.fs.nps npsVar2 = fb;
        if (!zmn(npsVar2)) {
            return npsVar2;
        }
        synchronized (nu.class) {
            try {
                if (zmn(fb)) {
                    try {
                        fb = zmn("ad", fb);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (fb == null) {
                        fb = kw();
                    }
                }
                npsVar = fb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return npsVar;
    }

    public static com.bytedance.sdk.component.zg.fs.nps bvs() {
        com.bytedance.sdk.component.zg.fs.nps npsVar;
        com.bytedance.sdk.component.zg.fs.nps npsVar2 = hhw;
        if (!zmn(npsVar2)) {
            return npsVar2;
        }
        synchronized (nu.class) {
            try {
                if (zmn(hhw)) {
                    try {
                        hhw = zmn("cache", hhw);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (hhw == null) {
                        hhw = kw();
                    }
                }
                npsVar = hhw;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return npsVar;
    }

    private static com.bytedance.sdk.component.zg.fs.nps cn() {
        com.bytedance.sdk.component.zg.fs.nps npsVar;
        com.bytedance.sdk.component.zg.fs.nps npsVar2 = btk;
        if (!zmn(npsVar2)) {
            return npsVar2;
        }
        synchronized (nu.class) {
            try {
                if (zmn(btk)) {
                    try {
                        btk = zmn(CreativeInfo.f, btk);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (btk == null) {
                        btk = kw();
                    }
                }
                npsVar = btk;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return npsVar;
    }

    private static com.bytedance.sdk.component.zg.fs.nps cyb() {
        com.bytedance.sdk.component.zg.fs.nps npsVar;
        com.bytedance.sdk.component.zg.fs.nps npsVar2 = zg;
        if (!zmn(npsVar2)) {
            return npsVar2;
        }
        synchronized (nu.class) {
            try {
                if (zmn(zg)) {
                    try {
                        zg = zmn("image", zg);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (zg == null) {
                        zg = kw();
                    }
                }
                npsVar = zg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return npsVar;
    }

    public static com.bytedance.sdk.component.zg.fs.nps iv() {
        com.bytedance.sdk.component.zg.fs.nps npsVar;
        com.bytedance.sdk.component.zg.fs.nps npsVar2 = bvs;
        if (!zmn(npsVar2)) {
            return npsVar2;
        }
        synchronized (nu.class) {
            try {
                if (zmn(bvs)) {
                    try {
                        bvs = zmn("express", bvs);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (bvs == null) {
                        bvs = kw();
                    }
                }
                npsVar = bvs;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return npsVar;
    }

    private static com.bytedance.sdk.component.zg.fs.nps olo() {
        com.bytedance.sdk.component.zg.fs.nps npsVar;
        com.bytedance.sdk.component.zg.fs.nps npsVar2 = nps;
        if (!zmn(npsVar2)) {
            return npsVar2;
        }
        synchronized (nu.class) {
            try {
                if (zmn(nps)) {
                    try {
                        nps = zmn("io", nps);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (nps == null) {
                        nps = kw();
                    }
                }
                npsVar = nps;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return npsVar;
    }

    private static com.bytedance.sdk.component.zg.fs.nps kgc() {
        com.bytedance.sdk.component.zg.fs.nps npsVar;
        com.bytedance.sdk.component.zg.fs.nps npsVar2 = rc;
        if (!zmn(npsVar2)) {
            return npsVar2;
        }
        synchronized (nu.class) {
            try {
                if (zmn(rc)) {
                    try {
                        rc = zmn("imgdisk", rc);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (rc == null) {
                        rc = kw();
                    }
                }
                npsVar = rc;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return npsVar;
    }

    public static ExecutorService rc() {
        com.bytedance.sdk.component.zg.fs.nps npsVar;
        com.bytedance.sdk.component.zg.fs.nps npsVar2 = rt;
        if (!zmn(npsVar2)) {
            return npsVar2;
        }
        synchronized (nu.class) {
            try {
                if (zmn(rt)) {
                    try {
                        rt = zmn("ad_log_save", rt);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (rt == null) {
                        rt = kw();
                    }
                }
                npsVar = rt;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return npsVar;
    }

    public static com.bytedance.sdk.component.zg.fs.nps klz() {
        com.bytedance.sdk.component.zg.fs.nps npsVar;
        com.bytedance.sdk.component.zg.fs.nps npsVar2 = mw;
        if (!zmn(npsVar2)) {
            return npsVar2;
        }
        synchronized (nu.class) {
            try {
                if (zmn(mw)) {
                    try {
                        mw = zmn("ad_log_up", mw);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (mw == null) {
                        mw = kw();
                    }
                }
                npsVar = mw;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return npsVar;
    }

    public static com.bytedance.sdk.component.zg.fs.nps mw() {
        com.bytedance.sdk.component.zg.fs.nps npsVar;
        com.bytedance.sdk.component.zg.fs.nps npsVar2 = iv;
        if (!zmn(npsVar2)) {
            return npsVar2;
        }
        synchronized (nu.class) {
            try {
                if (zmn(iv)) {
                    try {
                        iv = zmn("net", iv);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    if (iv == null) {
                        iv = kw();
                    }
                }
                npsVar = iv;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return npsVar;
    }

    private static com.bytedance.sdk.component.zg.fs.nps kw() {
        com.bytedance.sdk.component.zg.fs.nps npsVar;
        com.bytedance.sdk.component.zg.fs.nps npsVar2 = klz;
        if (npsVar2 != null) {
            return npsVar2;
        }
        synchronized (nu.class) {
            try {
                if (klz == null) {
                    try {
                        klz = fs("default").zmn();
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                npsVar = klz;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return npsVar;
    }

    private static boolean zmn(com.bytedance.sdk.component.zg.fs.nps npsVar) {
        if (npsVar != null) {
            return !npsVar.fs() && com.bytedance.sdk.openadsdk.core.settings.rc.mig();
        }
        return true;
    }

    private static com.bytedance.sdk.component.zg.fs.nps zmn(String str, com.bytedance.sdk.component.zg.fs.nps npsVar) {
        nps.zmn zmn2 = zmn(str);
        if (npsVar == null) {
            return zmn2.zmn();
        }
        npsVar.zmn(zmn2);
        return npsVar;
    }

    private static nps.zmn zmn(String str) {
        nps.zmn fs2 = fs(str);
        try {
            if (com.bytedance.sdk.openadsdk.core.settings.rc.mig()) {
                fs2.fs(true);
                JSONObject obg = com.bytedance.sdk.openadsdk.core.settings.rc.fs().obg();
                JSONObject optJSONObject = obg != null ? obg.optJSONObject(str) : null;
                if (optJSONObject != null) {
                    fs2.fs(true);
                    if (optJSONObject.has("coreSize")) {
                        fs2.zmn(optJSONObject.optInt("coreSize"));
                    }
                    if (optJSONObject.has(SDKConstants.PARAM_CONTEXT_MAX_SIZE)) {
                        fs2.fs(optJSONObject.optInt(SDKConstants.PARAM_CONTEXT_MAX_SIZE));
                    }
                    if (optJSONObject.has("createSize")) {
                        fs2.zn(optJSONObject.optInt("createSize"));
                    }
                    if (optJSONObject.has("keepAlive")) {
                        fs2.zmn(optJSONObject.optInt("keepAlive"));
                    }
                    if (optJSONObject.has("allowCoreTimeOut")) {
                        fs2.zmn(optJSONObject.optBoolean("allowCoreTimeOut"));
                    }
                    if (optJSONObject.has("reportLogThreshold")) {
                        optJSONObject.optInt("reportLogThreshold");
                    }
                    if (optJSONObject.has("logTaskCount")) {
                        optJSONObject.optInt("logTaskCount");
                    }
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return fs2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static nps.zmn fs(String str) {
        char c;
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        nps.zmn zmnVar = new nps.zmn();
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
                if (str.equals(CreativeInfo.f)) {
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
            case 569077010:
                if (str.equals("ad_log_up")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1236319578:
                if (str.equals("monitor")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1422089780:
                if (str.equals("ad_log_save")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1917389792:
                if (str.equals("imgdisk")) {
                    c = 11;
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
                return zmnVar.zmn(str).zmn(2).fs(4).zn(0).zmn(10000L).zmn(true).btk(-1).fb(10).fs(false);
            case 1:
                return zmnVar.zmn(str).zmn(4).fs(4).zn(0).zmn(20000L).zmn(true).btk(-1).fb(10).fs(false);
            case 2:
                return zmnVar.zmn(str).zmn(4).fs(10).zn(0).zmn(20000L).zmn(true).btk(-1).fb(10).fs(false);
            case 3:
                return zmnVar.zmn(str).zmn(4).fs(6).zn(2).zmn(20000L).zmn(true).btk(-1).fb(10).fs(false);
            case 4:
                return zmnVar.zmn(str).zmn(10).fs(10).zn(0).zmn(10000L).zmn(true).btk(-1).fb(10).fs(false);
            case 5:
                return zmnVar.zmn(str).zmn(2).fs(4).zn(0).zmn(10000L).zmn(true).btk(-1).fb(10).fs(false);
            case 6:
                return zmnVar.zmn(str).zmn(0).fs(0).zn(0).zmn(5000L).zmn(true).btk(-1).fb(20).fs(false);
            case 7:
                return zmnVar.zmn(str).zmn(3).fs(3).zn(0).zmn(20000L).zmn(true).btk(-1).fb(10).fs(false);
            case '\b':
                return zmnVar.zmn(str).zmn(1).fs(4).zn(0).zmn(10000L).zmn(true).btk(-1).fb(10).fs(false);
            case '\t':
                return zmnVar.zmn(str).zmn(2).fs(2).zn(0).zmn(10000L).zmn(true).btk(-1).fb(10).fs(false);
            case '\n':
                return zmnVar.zmn(str).zmn(1).fs(4).zn(0).zmn(10000L).zmn(new PriorityBlockingQueue()).zmn(true).btk(-1).fb(10).fs(false);
            case 11:
                return zmnVar.zmn(str).zmn(1).fs(2).zn(3).zmn(10000L).zmn(true).btk(-1).fb(10).fs(false);
            default:
                return zmnVar.zmn(str).zmn(8).fs(16).zn(2).zmn(20000L).zmn(true).btk(-1).fb(10).fs(false);
        }
    }
}
