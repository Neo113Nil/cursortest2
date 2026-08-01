package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.utils.ny;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: IPManger.java */
/* loaded from: classes2.dex */
public class Wyp {
    private static final AtomicInteger pvs = new AtomicInteger(0);
    private static final AtomicBoolean icD = new AtomicBoolean(false);

    public static void pvs(String str) {
        AtomicBoolean atomicBoolean = icD;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!com.bytedance.sdk.component.utils.mnm.so(mnm.pvs())) {
                atomicBoolean.set(false);
            } else {
                pvs.pvs();
                vG(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void vG(final String str) {
        com.bytedance.sdk.openadsdk.utils.ae.vG(new com.bytedance.sdk.component.so.so("ipv6") { // from class: com.bytedance.sdk.openadsdk.core.Wyp.1
            @Override // java.lang.Runnable
            public void run() {
                JSONObject pvs2;
                final String pR = com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().pR();
                com.bytedance.sdk.openadsdk.Wyp.vG.pvs(0, pR);
                if (TextUtils.isEmpty(pR)) {
                    com.bytedance.sdk.openadsdk.Wyp.vG.pvs(-1, pR, -1, "url is null");
                    return;
                }
                com.bytedance.sdk.component.yiw.icD.Jd icD2 = com.bytedance.sdk.openadsdk.qh.vG.pvs().icD().icD();
                try {
                    icD2.icD(pR);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("connect_type", com.bytedance.sdk.component.utils.ny.pvs(mnm.pvs(), 0L));
                    jSONObject.put("device_id", Long.parseLong(str));
                    jSONObject.put("header", com.bytedance.sdk.openadsdk.icD.pvs.vG.pvs().icD());
                    if (com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().pvs(PangleEncryptConstant.CryptDataScene.APP_LOG)) {
                        pvs2 = PangleEncryptManager.encryptType4(jSONObject, new zM(PangleEncryptConstant.CryptDataScene.DUAL_EVENT));
                        if (pvs2 != null && pvs2.optInt("cypher") == 4) {
                            uc.icD(true);
                            icD2.icD("x-pgli18n", "4");
                            icD2.icD(HttpHeaders.CONTENT_TYPE, "application/json; charset=utf-8");
                        } else {
                            uc.icD(false);
                        }
                    } else {
                        pvs2 = com.bytedance.sdk.component.utils.pvs.pvs(jSONObject);
                        if (Wyp.icD(pvs2)) {
                            icD2.icD(HttpHeaders.CONTENT_ENCODING, "union_sdk_encode");
                        }
                    }
                    if (Wyp.icD(pvs2)) {
                        jSONObject = pvs2;
                    }
                    icD2.icD(HttpHeaders.CONTENT_TYPE, "application/json; charset=utf-8");
                    icD2.icD(HttpHeaders.USER_AGENT, jlb.vG());
                    icD2.pvs(jSONObject);
                    icD2.pvs(6);
                    icD2.pvs("send_i_p_v6");
                    icD2.pvs(new com.bytedance.sdk.component.yiw.pvs.pvs() { // from class: com.bytedance.sdk.openadsdk.core.Wyp.1.1
                        @Override // com.bytedance.sdk.component.yiw.pvs.pvs
                        public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, com.bytedance.sdk.component.yiw.icD icd) {
                            if (icd.sUS()) {
                                com.bytedance.sdk.openadsdk.Wyp.vG.pvs(1, pR);
                            } else {
                                com.bytedance.sdk.openadsdk.Wyp.vG.pvs(-1, pR, icd.pvs(), icd.icD());
                                Wyp.Jd();
                            }
                        }

                        @Override // com.bytedance.sdk.component.yiw.pvs.pvs
                        public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, IOException iOException) {
                            if (iOException != null) {
                                com.bytedance.sdk.openadsdk.Wyp.vG.pvs(-1, pR, 1, iOException.getMessage());
                            }
                            Wyp.Jd();
                        }
                    });
                } catch (Exception e) {
                    com.bytedance.sdk.openadsdk.Wyp.vG.pvs(-1, pR, -2, e.getMessage());
                    com.bytedance.sdk.component.utils.Ju.icD("build ipv6 request failed:" + e.getMessage());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean icD(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void vG() {
        pvs.set(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Jd() {
        if (pvs.getAndIncrement() <= 0) {
            com.bytedance.sdk.openadsdk.utils.ae.pvs().schedule(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Wyp.2
                @Override // java.lang.Runnable
                public void run() {
                    Wyp.vG(qh.pvs(mnm.pvs()));
                }
            }, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS);
        }
    }

    /* compiled from: IPManger.java */
    private static class pvs implements ny.pvs {
        private static final AtomicBoolean pvs = new AtomicBoolean(false);
        private static volatile long icD = -1;

        private pvs() {
        }

        public static void pvs() {
            if (pvs.compareAndSet(false, true)) {
                icD = System.currentTimeMillis();
                com.bytedance.sdk.component.utils.ny.pvs(new pvs(), mnm.pvs());
            }
        }

        public void icD() {
            com.bytedance.sdk.component.utils.ny.pvs(this);
        }

        @Override // com.bytedance.sdk.component.utils.ny.pvs
        public void pvs(Context context, Intent intent, boolean z, int i) {
            if (System.currentTimeMillis() - icD >= 2000 && i != 0) {
                Wyp.vG();
                Wyp.vG(qh.pvs(mnm.pvs()));
                icD();
            }
        }
    }
}
