package com.bytedance.sdk.openadsdk.core.iv;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.nu;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class mw {
    private static String fs;
    private static final AtomicBoolean zmn = new AtomicBoolean(false);
    private static String zn;

    public static void zmn() {
        com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zmn(new com.bytedance.sdk.component.adexpress.zmn.zmn.fs() { // from class: com.bytedance.sdk.openadsdk.core.iv.mw.1
            @Override // com.bytedance.sdk.component.adexpress.zmn.zmn.fs
            public int zmn(String str, ContentValues contentValues, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.kw.fs.zmn.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn(), str, contentValues, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.zmn.zmn.fs
            public Cursor zmn(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
                return new com.bytedance.sdk.openadsdk.kw.zmn.zmn(com.bytedance.sdk.openadsdk.kw.fs.zmn.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn(), str, strArr, str2, strArr2, str3, str4, str5));
            }

            @Override // com.bytedance.sdk.component.adexpress.zmn.zmn.fs
            public int zmn(String str, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.kw.fs.zmn.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn(), str, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.zmn.zmn.fs
            public void zmn(String str, ContentValues contentValues) {
                com.bytedance.sdk.openadsdk.kw.fs.zmn.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn(), str, contentValues);
            }
        });
        com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zmn(new com.bytedance.sdk.component.adexpress.zmn.zmn.zn() { // from class: com.bytedance.sdk.openadsdk.core.iv.mw.2
            @Override // com.bytedance.sdk.component.adexpress.zmn.zmn.zn
            public int bvs() {
                return 1;
            }

            @Override // com.bytedance.sdk.component.adexpress.zmn.zmn.zn
            public int klz() {
                return 0;
            }

            @Override // com.bytedance.sdk.component.adexpress.zmn.zmn.zn
            public int zmn() {
                if (com.bytedance.sdk.openadsdk.core.kgc.fb() == null) {
                    return 0;
                }
                return com.bytedance.sdk.openadsdk.core.kgc.fb().btk();
            }

            @Override // com.bytedance.sdk.component.adexpress.zmn.zmn.zn
            public Context fs() {
                return com.bytedance.sdk.openadsdk.core.kgc.zmn();
            }

            @Override // com.bytedance.sdk.component.adexpress.zmn.zmn.zn
            public Handler zn() {
                return com.bytedance.sdk.openadsdk.core.cn.zn();
            }

            @Override // com.bytedance.sdk.component.adexpress.zmn.zmn.zn
            public void fb() {
                int lt = com.bytedance.sdk.openadsdk.core.kgc.fb().lt();
                int io2 = com.bytedance.sdk.openadsdk.core.kgc.fb().io();
                if (lt == 0 && io2 == 0) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.btk.btk.zmn().zmn(lt);
                com.bytedance.sdk.component.adexpress.btk.btk.zmn().fs(io2);
                int nps = com.bytedance.sdk.openadsdk.uqh.btk.nps();
                int hhw = com.bytedance.sdk.openadsdk.uqh.btk.hhw();
                if (nps == 0 && hhw == 0) {
                    return;
                }
                zmn(com.bytedance.sdk.openadsdk.core.cn.zn().getLooper().getQueue(), hhw, nps);
            }

            /* renamed from: com.bytedance.sdk.openadsdk.core.iv.mw$2$1, reason: invalid class name */
            class AnonymousClass1 implements Runnable {
                final /* synthetic */ int fs;
                final /* synthetic */ MessageQueue[] zmn;
                final /* synthetic */ int zn;

                AnonymousClass1(MessageQueue[] messageQueueArr, int i, int i2) {
                    this.zmn = messageQueueArr;
                    this.fs = i;
                    this.zn = i2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.zmn[0] = Looper.myQueue();
                    zmn(this.zmn[0], this.fs, this.zn);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zmn(final MessageQueue messageQueue, final int i, final int i2) {
                if (messageQueue != null) {
                    final int zmn2 = com.bytedance.sdk.openadsdk.uqh.btk.zmn("ad_load_and_render_opt", "w_p_delay", 500);
                    Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.iv.mw.2.2
                        @Override // java.lang.Runnable
                        public void run() {
                            fs(messageQueue, i);
                            zmn(messageQueue, i2);
                        }
                    };
                    if (zmn2 > 0) {
                        com.bytedance.sdk.openadsdk.core.cn.zn().postDelayed(runnable, zmn2);
                    } else {
                        runnable.run();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zmn(final MessageQueue messageQueue, final int i) {
                if (messageQueue == null || i <= 0) {
                    return;
                }
                messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.iv.mw.2.3
                    @Override // android.os.MessageQueue.IdleHandler
                    public boolean queueIdle() {
                        new com.bytedance.sdk.openadsdk.core.widget.zmn.zn(i, true, messageQueue).fs();
                        return false;
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void fs(final MessageQueue messageQueue, final int i) {
                if (messageQueue == null || i <= 0) {
                    return;
                }
                messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.iv.mw.2.4
                    @Override // android.os.MessageQueue.IdleHandler
                    public boolean queueIdle() {
                        new com.bytedance.sdk.openadsdk.core.widget.zmn.zn(i, false, messageQueue).fs();
                        return false;
                    }
                });
            }

            @Override // com.bytedance.sdk.component.adexpress.zmn.zmn.zn
            public com.bytedance.sdk.component.adexpress.zmn.zn.zmn btk() {
                return com.bytedance.sdk.openadsdk.core.kgc.zn().zmn();
            }

            @Override // com.bytedance.sdk.component.adexpress.zmn.zmn.zn
            public com.bytedance.sdk.component.nps.fs.zmn hhw() {
                com.bytedance.sdk.component.nps.fs.zmn fb = com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().fb();
                fb.zmn(8);
                fb.fs("express_down");
                return fb;
            }

            @Override // com.bytedance.sdk.component.adexpress.zmn.zmn.zn
            public com.bytedance.sdk.component.nps.fs.fs nps() {
                com.bytedance.sdk.component.nps.fs.fs zn2 = com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().zn();
                zn2.zmn(8);
                zn2.fs("express_get");
                return zn2;
            }

            @Override // com.bytedance.sdk.component.adexpress.zmn.zmn.zn
            public String zg() {
                return com.bytedance.sdk.openadsdk.core.iv.fs().fb();
            }

            @Override // com.bytedance.sdk.component.adexpress.zmn.zmn.zn
            public int iv() {
                return com.bytedance.sdk.openadsdk.core.kgc.fb().lt();
            }

            @Override // com.bytedance.sdk.component.adexpress.zmn.zmn.zn
            public int rc() {
                return com.bytedance.sdk.openadsdk.core.kgc.fb().io();
            }

            @Override // com.bytedance.sdk.component.adexpress.zmn.zmn.zn
            public ExecutorService mw() {
                return nu.btk();
            }

            @Override // com.bytedance.sdk.component.adexpress.zmn.zmn.zn
            public ExecutorService rt() {
                return nu.iv();
            }

            @Override // com.bytedance.sdk.component.adexpress.zmn.zmn.zn
            public ScheduledExecutorService cn() {
                return nu.zmn();
            }

            @Override // com.bytedance.sdk.component.adexpress.zmn.zmn.zn
            public int cyb() {
                return jy.zn(com.bytedance.sdk.openadsdk.core.kgc.zmn());
            }

            @Override // com.bytedance.sdk.component.adexpress.zmn.zmn.zn
            public int olo() {
                return jy.btk(com.bytedance.sdk.openadsdk.core.kgc.zmn());
            }

            @Override // com.bytedance.sdk.component.adexpress.zmn.zmn.zn
            public int kgc() {
                return com.bytedance.sdk.openadsdk.uqh.btk.zmn("gaussian_blur_type", 0);
            }
        });
        com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zmn(new com.bytedance.sdk.component.adexpress.zmn.zmn.fb() { // from class: com.bytedance.sdk.openadsdk.core.iv.mw.3
            @Override // com.bytedance.sdk.component.adexpress.zmn.zmn.fb
            public void zmn(int i) {
                com.bytedance.sdk.openadsdk.cyb.fb.zmn().zmn(com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().fs(i).hhw(com.bytedance.sdk.openadsdk.core.bvs.zmn(i)));
            }
        });
        com.bytedance.sdk.component.bvs.zmn.zmn.zmn().zmn(new com.bytedance.sdk.component.bvs.zmn.fs() { // from class: com.bytedance.sdk.openadsdk.core.iv.mw.4
            @Override // com.bytedance.sdk.component.bvs.zmn.fs
            public void zmn(String str, String str2, JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.fb.zn.zn(com.bytedance.sdk.openadsdk.utils.fs.hhw(), str, str2, jSONObject);
            }

            @Override // com.bytedance.sdk.component.bvs.zmn.fs
            public void zmn(com.bytedance.sdk.component.bvs.fs.zmn zmnVar, String str, String str2, JSONObject jSONObject, long j) {
                com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = new com.bytedance.sdk.openadsdk.core.model.nqi();
                nqiVar.am(zmnVar.fs());
                nqiVar.rp(zmnVar.zn());
                nqiVar.nqi(zmnVar.fb());
                nqiVar.uqh(zmnVar.btk());
                nqiVar.kw(zmnVar.zmn());
                com.bytedance.sdk.openadsdk.fb.zn.fs(nqiVar, str, str2, jSONObject, j);
            }

            @Override // com.bytedance.sdk.component.bvs.zmn.fs
            public void zmn(com.bytedance.sdk.component.bvs.fs.zmn zmnVar, String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2) {
                if (zmnVar != null) {
                    com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = new com.bytedance.sdk.openadsdk.core.model.nqi();
                    nqiVar.am(zmnVar.fs());
                    nqiVar.rp(zmnVar.zn());
                    nqiVar.nqi(zmnVar.fb());
                    nqiVar.uqh(zmnVar.btk());
                    com.bytedance.sdk.openadsdk.fb.zn.zmn(System.currentTimeMillis(), nqiVar, str, str2, new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.core.iv.mw.4.1
                        @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                        public JSONObject zn() {
                            return jSONObject2;
                        }

                        @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                        public JSONObject zmn() {
                            return jSONObject;
                        }
                    });
                }
            }
        });
    }

    public static void fs() {
        if (com.bytedance.sdk.openadsdk.core.rc.fs.zmn().btk() || zmn.getAndSet(true)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.zmn.fs.fs.zmn();
    }

    @NonNull
    public static String zn() {
        String zn2;
        if (fs == null) {
            fs = com.bytedance.sdk.openadsdk.kw.fb.zmn.fs("tt_sp", "js_render_ver", "");
        }
        com.bytedance.sdk.component.adexpress.zmn.zn.zmn fs2 = com.bytedance.sdk.component.adexpress.zmn.fs.zg.fs();
        if (fs2 != null && (zn2 = fs2.zn()) != null && !zn2.equals(fs)) {
            fs = zn2;
            com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("tt_sp", "js_render_ver", zn2);
        }
        return fs;
    }

    public static String fb() {
        Map<String, com.bytedance.sdk.component.adexpress.zmn.zn.zmn> zmn2;
        com.bytedance.sdk.component.adexpress.zmn.zn.zmn zmnVar;
        String zn2;
        if (zn == null) {
            zn = com.bytedance.sdk.openadsdk.kw.fb.zmn.fs("tt_sp", "js_render_v3_ver", "");
        }
        com.bytedance.sdk.component.adexpress.zmn.zn.zmn fs2 = com.bytedance.sdk.component.adexpress.zmn.fs.zg.fs();
        if (fs2 != null && (zmn2 = fs2.zmn()) != null && (zmnVar = zmn2.get("v3")) != null && (zn2 = zmnVar.zn()) != null && !zn2.equals(zn)) {
            zn = zn2;
            com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("tt_sp", "js_render_v3_ver", zn2);
        }
        return zn;
    }
}
