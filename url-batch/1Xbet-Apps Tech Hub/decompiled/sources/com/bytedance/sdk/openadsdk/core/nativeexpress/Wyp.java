package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.ae;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* compiled from: ExpressInitHelper.java */
/* loaded from: classes2.dex */
public class Wyp {
    private static String icD;
    private static String pvs;

    public static void pvs() {
        com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().pvs(new com.bytedance.sdk.component.adexpress.pvs.pvs.icD() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.Wyp.1
            @Override // com.bytedance.sdk.component.adexpress.pvs.pvs.icD
            public int pvs(String str, ContentValues contentValues, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.multipro.pvs.pvs.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs(), str, contentValues, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.pvs.pvs.icD
            public Cursor pvs(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
                return new com.bytedance.sdk.openadsdk.multipro.aidl.vG(com.bytedance.sdk.openadsdk.multipro.pvs.pvs.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs(), str, strArr, str2, strArr2, str3, str4, str5));
            }

            @Override // com.bytedance.sdk.component.adexpress.pvs.pvs.icD
            public int pvs(String str, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.multipro.pvs.pvs.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs(), str, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.pvs.pvs.icD
            public void pvs(String str, ContentValues contentValues) {
                com.bytedance.sdk.openadsdk.multipro.pvs.pvs.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs(), str, contentValues);
            }
        });
        com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().pvs(new com.bytedance.sdk.component.adexpress.pvs.pvs.vG() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.Wyp.2
            @Override // com.bytedance.sdk.component.adexpress.pvs.pvs.vG
            public int Mxy() {
                return 1;
            }

            @Override // com.bytedance.sdk.component.adexpress.pvs.pvs.vG
            public int kj() {
                return 0;
            }

            @Override // com.bytedance.sdk.component.adexpress.pvs.pvs.vG
            public int pvs() {
                if (com.bytedance.sdk.openadsdk.core.mnm.Jd() == null) {
                    return 0;
                }
                return com.bytedance.sdk.openadsdk.core.mnm.Jd().Jd();
            }

            @Override // com.bytedance.sdk.component.adexpress.pvs.pvs.vG
            public Context icD() {
                return com.bytedance.sdk.openadsdk.core.mnm.pvs();
            }

            @Override // com.bytedance.sdk.component.adexpress.pvs.pvs.vG
            public Handler vG() {
                return com.bytedance.sdk.openadsdk.core.Ju.vG();
            }

            @Override // com.bytedance.sdk.component.adexpress.pvs.pvs.vG
            public void Jd() {
                if ((com.bytedance.sdk.openadsdk.core.mnm.Jd().thO() == 0 || com.bytedance.sdk.openadsdk.core.mnm.Jd().rW() == 0) && (com.bytedance.sdk.openadsdk.core.mnm.Jd().qd() == 0 || com.bytedance.sdk.openadsdk.core.mnm.Jd().Cwg() == 0)) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.NB.NB.pvs().pvs(com.bytedance.sdk.openadsdk.core.mnm.Jd().thO());
                com.bytedance.sdk.component.adexpress.NB.NB.pvs().icD(com.bytedance.sdk.openadsdk.core.mnm.Jd().Cwg());
                MessageQueue[] messageQueueArr = new MessageQueue[1];
                pvs(com.bytedance.sdk.openadsdk.core.Ju.vG().getLooper().getQueue());
            }

            /* compiled from: ExpressInitHelper.java */
            /* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.Wyp$2$1, reason: invalid class name */
            class AnonymousClass1 implements Runnable {
                final /* synthetic */ MessageQueue[] pvs;

                AnonymousClass1(MessageQueue[] messageQueueArr) {
                    this.pvs = messageQueueArr;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.pvs[0] = Looper.myQueue();
                    pvs(this.pvs[0]);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void pvs(MessageQueue messageQueue) {
                if (messageQueue != null) {
                    messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.Wyp.2.2
                        @Override // android.os.MessageQueue.IdleHandler
                        public boolean queueIdle() {
                            if (com.bytedance.sdk.openadsdk.core.mnm.Jd().rW() > 0) {
                                com.bytedance.sdk.openadsdk.core.widget.pvs.icD icd = new com.bytedance.sdk.openadsdk.core.widget.pvs.icD();
                                icd.pvs(false);
                                icd.icD();
                            }
                            if (com.bytedance.sdk.openadsdk.core.mnm.Jd().Cwg() > 0) {
                                com.bytedance.sdk.openadsdk.core.widget.pvs.icD icd2 = new com.bytedance.sdk.openadsdk.core.widget.pvs.icD();
                                icd2.pvs(true);
                                icd2.icD();
                            }
                            return false;
                        }
                    });
                }
            }

            @Override // com.bytedance.sdk.component.adexpress.pvs.pvs.vG
            public com.bytedance.sdk.component.adexpress.pvs.vG.pvs NB() {
                return com.bytedance.sdk.openadsdk.core.mnm.vG().pvs();
            }

            @Override // com.bytedance.sdk.component.adexpress.pvs.pvs.vG
            public com.bytedance.sdk.component.yiw.icD.pvs sUS() {
                com.bytedance.sdk.component.yiw.icD.pvs Jd = com.bytedance.sdk.openadsdk.qh.vG.pvs().icD().Jd();
                Jd.pvs(8);
                Jd.pvs("express_down");
                return Jd;
            }

            @Override // com.bytedance.sdk.component.adexpress.pvs.pvs.vG
            public com.bytedance.sdk.component.yiw.icD.icD yiw() {
                com.bytedance.sdk.component.yiw.icD.icD vG = com.bytedance.sdk.openadsdk.qh.vG.pvs().icD().vG();
                vG.pvs(8);
                vG.pvs("express_get");
                return vG;
            }

            @Override // com.bytedance.sdk.component.adexpress.pvs.pvs.vG
            public String so() {
                return com.bytedance.sdk.openadsdk.core.so.icD().Jd();
            }

            @Override // com.bytedance.sdk.component.adexpress.pvs.pvs.vG
            public int Wyp() {
                return com.bytedance.sdk.openadsdk.core.mnm.Jd().thO();
            }

            @Override // com.bytedance.sdk.component.adexpress.pvs.pvs.vG
            public int qh() {
                return com.bytedance.sdk.openadsdk.core.mnm.Jd().qd();
            }

            @Override // com.bytedance.sdk.component.adexpress.pvs.pvs.vG
            public ExecutorService Ju() {
                if (ae.Wyp()) {
                    return ae.Jd();
                }
                return null;
            }

            @Override // com.bytedance.sdk.component.adexpress.pvs.pvs.vG
            public ExecutorService IP() {
                if (ae.Wyp()) {
                    return ae.so();
                }
                return null;
            }

            @Override // com.bytedance.sdk.component.adexpress.pvs.pvs.vG
            public int bNS() {
                return Pj.vG(com.bytedance.sdk.openadsdk.core.mnm.pvs());
            }
        });
        com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().pvs(new com.bytedance.sdk.component.adexpress.pvs.pvs.Jd() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.Wyp.3
            @Override // com.bytedance.sdk.component.adexpress.pvs.pvs.Jd
            public void pvs(int i) {
                com.bytedance.sdk.openadsdk.Wyp.vG.pvs().pvs(com.bytedance.sdk.openadsdk.Wyp.pvs.Jd.icD().icD(i).sUS(com.bytedance.sdk.openadsdk.core.yiw.pvs(i)));
            }
        });
        com.bytedance.sdk.component.widget.pvs.pvs.pvs().pvs(new com.bytedance.sdk.component.widget.pvs.icD() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.Wyp.4
            @Override // com.bytedance.sdk.component.widget.pvs.icD
            public void pvs(String str, String str2, JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.icD.vG.vG(com.bytedance.sdk.openadsdk.utils.icD.pvs(), str, str2, jSONObject);
            }

            @Override // com.bytedance.sdk.component.widget.pvs.icD
            public void pvs(com.bytedance.sdk.component.widget.icD.pvs pvsVar, String str, String str2, JSONObject jSONObject, long j) {
                cR vG = cR.vG();
                vG.vA(pvsVar.pvs());
                vG.uc(pvsVar.icD());
                vG.cR(pvsVar.vG());
                com.bytedance.sdk.openadsdk.icD.vG.icD(vG, str, str2, jSONObject, j);
            }
        });
    }

    public static String icD() {
        String vG;
        if (pvs == null) {
            pvs = com.bytedance.sdk.openadsdk.multipro.Jd.Jd.icD("tt_sp", "js_render_ver", "");
        }
        com.bytedance.sdk.component.adexpress.pvs.vG.pvs icD2 = com.bytedance.sdk.component.adexpress.pvs.icD.so.icD();
        if (icD2 != null && (vG = icD2.vG()) != null && !vG.equals(pvs)) {
            pvs = vG;
            com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tt_sp", "js_render_ver", vG);
        }
        return pvs;
    }

    public static String vG() {
        Map<String, com.bytedance.sdk.component.adexpress.pvs.vG.pvs> pvs2;
        com.bytedance.sdk.component.adexpress.pvs.vG.pvs pvsVar;
        String vG;
        if (icD == null) {
            icD = com.bytedance.sdk.openadsdk.multipro.Jd.Jd.icD("tt_sp", "js_render_v3_ver", "");
        }
        com.bytedance.sdk.component.adexpress.pvs.vG.pvs icD2 = com.bytedance.sdk.component.adexpress.pvs.icD.so.icD();
        if (icD2 != null && (pvs2 = icD2.pvs()) != null && (pvsVar = pvs2.get("v3")) != null && (vG = pvsVar.vG()) != null && !vG.equals(icD)) {
            icD = vG;
            com.bytedance.sdk.openadsdk.multipro.Jd.Jd.pvs("tt_sp", "js_render_v3_ver", vG);
        }
        return icD;
    }
}
