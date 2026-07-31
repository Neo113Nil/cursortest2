package com.bytedance.sdk.openadsdk.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class cn {
    public static long fb;
    private static volatile HandlerThread hhw;
    private static final Runnable zg;
    public static volatile boolean zmn;
    public static long zn;
    public static AtomicBoolean fs = new AtomicBoolean(false);
    private static volatile int btk = 0;
    private static volatile Handler nps = null;

    static {
        HandlerThread handlerThread = new HandlerThread("pag_init_handle", 10) { // from class: com.bytedance.sdk.openadsdk.core.cn.1
            boolean zmn = false;

            @Override // java.lang.Thread
            public synchronized void start() {
                if (this.zmn) {
                    return;
                }
                this.zmn = true;
                super.start();
            }
        };
        hhw = handlerThread;
        handlerThread.start();
        com.bytedance.sdk.component.utils.zg.zmn(hhw);
        fb = System.currentTimeMillis();
        zg = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.core.settings.rc.fs().oep()) {
                    cn.hhw();
                    return;
                }
                String fs2 = com.bytedance.sdk.openadsdk.core.settings.rc.fs(kgc.zmn());
                int zmn2 = com.bytedance.sdk.openadsdk.core.settings.rc.zmn(kgc.zmn());
                if (!TextUtils.equals(fs2, com.bytedance.sdk.openadsdk.core.settings.rc.fb) || zmn2 != com.bytedance.sdk.openadsdk.core.settings.rc.btk) {
                    com.bytedance.sdk.openadsdk.core.settings.rc.fs().zmn(6, true);
                    com.bytedance.sdk.openadsdk.core.settings.rc.fb = fs2;
                    com.bytedance.sdk.openadsdk.core.settings.rc.btk = zmn2;
                }
                cn.hhw();
            }
        };
    }

    public static void zmn(long j) {
        fb = j;
    }

    public static long zmn() {
        return fb;
    }

    public static Handler fs() {
        if (hhw == null || !hhw.isAlive()) {
            synchronized (cn.class) {
                try {
                    if (hhw != null) {
                        if (!hhw.isAlive()) {
                        }
                    }
                    hhw = com.bytedance.sdk.component.utils.zg.zmn("pag_init_handle", -1);
                    nps = new Handler(hhw.getLooper());
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (nps == null) {
            synchronized (cn.class) {
                try {
                    if (nps == null) {
                        nps = new Handler(hhw.getLooper());
                    }
                } finally {
                }
            }
        }
        return nps;
    }

    public static Handler zn() {
        return new Handler(Looper.getMainLooper());
    }

    public static int fb() {
        return btk;
    }

    public static void zmn(int i) {
        btk = i;
    }

    public static boolean btk() {
        return fb() == 1;
    }

    public static void hhw() {
        Handler fs2 = fs();
        Runnable runnable = zg;
        fs2.removeCallbacks(runnable);
        fs().postDelayed(runnable, 10000L);
    }

    public static void zmn(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if ("mediation".equals(jSONObject.optString("name", ""))) {
                    iv.fs().fs(jSONObject.optString("value", ""));
                    return;
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("InitHelper", th.getMessage());
        }
    }

    public static void nps() {
        fs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cn.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.kgc.zn.zmn(new com.bytedance.sdk.openadsdk.kgc.fb() { // from class: com.bytedance.sdk.openadsdk.core.cn.3.1
                        @Override // com.bytedance.sdk.openadsdk.kgc.fb
                        public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                            com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                            zmnVar.fs("init");
                            return zmnVar;
                        }
                    });
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.iqz.zn("InitHelper", th.getMessage());
                }
            }
        });
    }
}
