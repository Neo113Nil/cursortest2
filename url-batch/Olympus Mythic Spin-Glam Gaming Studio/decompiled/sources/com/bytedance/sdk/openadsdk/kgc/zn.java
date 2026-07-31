package com.bytedance.sdk.openadsdk.kgc;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.utils.zg;
import com.bytedance.sdk.component.zg.zmn.hhw;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.ironsource.mediationsdk.metadata.a;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class zn {
    private static volatile hhw fb;
    private static Boolean fs;
    private static volatile zmn zmn;
    private static volatile HandlerThread zn = zg.zmn("pag__bus_monitor", 0);

    public static zmn zmn() {
        if (zmn == null) {
            synchronized (zn.class) {
                try {
                    if (zmn == null) {
                        zmn = zmn.zmn(new fs() { // from class: com.bytedance.sdk.openadsdk.kgc.zn.1
                            @Override // com.bytedance.sdk.openadsdk.kgc.fs
                            public Context getContext() {
                                return kgc.zmn();
                            }

                            @Override // com.bytedance.sdk.openadsdk.kgc.fs
                            public hhw getHandler() {
                                return zn.btk();
                            }

                            @Override // com.bytedance.sdk.openadsdk.kgc.fs
                            public int getUploadIntervalTime() {
                                int zmn2 = com.bytedance.sdk.openadsdk.uqh.btk.zmn("bus_monitor_config", "interval", BrandSafetyUtils.g);
                                return zmn2 < 3600000 ? BrandSafetyUtils.g : zmn2;
                            }

                            @Override // com.bytedance.sdk.openadsdk.kgc.fs
                            public boolean isMonitorOpen() {
                                if (zn.fs != null) {
                                    return zn.fs.booleanValue();
                                }
                                Boolean unused = zn.fs = Boolean.valueOf(com.bytedance.sdk.openadsdk.uqh.btk.zmn("bus_monitor_config", a.k, 1) == 1);
                                return zn.fs.booleanValue();
                            }

                            @Override // com.bytedance.sdk.openadsdk.kgc.fs
                            public void onMonitorUpload(List<com.bytedance.sdk.openadsdk.kgc.fs.zmn> list) {
                                if (list == null || list.isEmpty()) {
                                    return;
                                }
                                for (final com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar : list) {
                                    com.bytedance.sdk.openadsdk.cyb.fb.zmn("bus_monitor", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.kgc.zn.1.1
                                        @Override // com.bytedance.sdk.openadsdk.cyb.fs
                                        public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                                            JSONObject jSONObject = new JSONObject();
                                            try {
                                                jSONObject.put("sdk_version", zmnVar.fs());
                                                jSONObject.put("scene", zmnVar.zn());
                                                jSONObject.put("start_count", zmnVar.fb());
                                                jSONObject.put("success_count", zmnVar.btk());
                                                jSONObject.put("fail_count", zmnVar.hhw());
                                                jSONObject.put("rit", zmnVar.nps());
                                                jSONObject.put("tag", zmnVar.zg());
                                                jSONObject.put("label", zmnVar.bvs());
                                                jSONObject.put("mediation", zmnVar.rc());
                                                jSONObject.put("is_init", zmnVar.klz());
                                                jSONObject.put("extra", zmnVar.mw());
                                                jSONObject.put("date_device", zmnVar.iv());
                                                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("bus_monitor").fs(jSONObject.toString());
                                            } catch (Exception e) {
                                                iqz.zmn("BusMonitorUtils", "onMonitorUpload: ", e);
                                                return null;
                                            }
                                        }
                                    });
                                }
                            }

                            @Override // com.bytedance.sdk.openadsdk.kgc.fs
                            public int getOnceLogCount() {
                                int zmn2 = com.bytedance.sdk.openadsdk.uqh.btk.zmn("bus_monitor_config", "once_count", 10);
                                if (zmn2 > 100 || zmn2 < 5) {
                                    return 10;
                                }
                                return zmn2;
                            }

                            @Override // com.bytedance.sdk.openadsdk.kgc.fs
                            public int getOnceLogInterval() {
                                int zmn2 = com.bytedance.sdk.openadsdk.uqh.btk.zmn("bus_monitor_config", "once_interval", 10000);
                                if (zmn2 < 10000) {
                                    return 10000;
                                }
                                return zmn2;
                            }

                            @Override // com.bytedance.sdk.openadsdk.kgc.fs
                            public HandlerThread getSafeHandlerThread(String str, int i) {
                                return zg.zmn(str, i);
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    public static void zmn(fb fbVar) {
        zmn().zmn(new btk(fbVar, 1, 0, 0));
    }

    public static void fs(fb fbVar) {
        zmn().zmn(new btk(fbVar, 0, 1, 0));
    }

    public static void zn(fb fbVar) {
        zmn().zmn(new btk(fbVar, 0, 0, 1));
    }

    public static void fs() {
        zmn().zmn(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static hhw btk() {
        if (zn == null || !zn.isAlive()) {
            synchronized (cn.class) {
                try {
                    if (zn != null) {
                        if (!zn.isAlive()) {
                        }
                    }
                    HandlerThread zmn2 = zg.zmn("pag_init_handle", -1);
                    zn = zmn2;
                    fb = zmn(zmn2.getLooper());
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (fb == null) {
            synchronized (cn.class) {
                try {
                    if (fb == null) {
                        fb = zmn(zn.getLooper());
                    }
                } finally {
                }
            }
        }
        return fb;
    }

    private static hhw zmn(Looper looper) {
        return new hhw(new Handler(looper)) { // from class: com.bytedance.sdk.openadsdk.kgc.zn.2
            @Override // com.bytedance.sdk.component.zg.zmn.hhw
            public boolean zmn() {
                return com.bytedance.sdk.openadsdk.uqh.btk.zmn("bus_handler_run_dispatch", 0) == 1;
            }
        };
    }
}
