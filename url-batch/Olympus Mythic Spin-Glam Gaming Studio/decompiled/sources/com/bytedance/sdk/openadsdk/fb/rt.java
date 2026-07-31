package com.bytedance.sdk.openadsdk.fb;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes13.dex */
public class rt {
    private static volatile rt zmn;
    private Map<String, Object> fb;
    private fs zn = fs.zmn();
    private final Handler fs = new Handler(com.bytedance.sdk.openadsdk.core.cn.fs().getLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.fb.rt.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 100) {
                return true;
            }
            Object obj = message.obj;
            zmn zmnVar = (obj == null || !(obj instanceof zmn)) ? null : (zmn) obj;
            if (zmnVar == null) {
                return true;
            }
            rt.this.fs(zmnVar);
            return true;
        }
    });

    public static rt zmn() {
        if (zmn == null) {
            synchronized (rt.class) {
                try {
                    if (zmn == null) {
                        zmn = new rt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    public rt zmn(Map<String, Object> map) {
        this.fb = map;
        return zmn();
    }

    private rt() {
    }

    public void zmn(nqi nqiVar, String str) {
        Message obtainMessage = this.fs.obtainMessage();
        obtainMessage.what = 100;
        obtainMessage.obj = zmn.zmn(nqiVar, str, this.fb);
        obtainMessage.sendToTarget();
    }

    private void zmn(zmn zmnVar) {
        if (zmnVar == null) {
            return;
        }
        zmnVar.fs();
        int zmn2 = zmnVar.zmn();
        fs fsVar = this.zn;
        if (zmn2 * fsVar.zmn > fsVar.fs) {
            zn(zmnVar.zmn(false));
            return;
        }
        Message obtainMessage = this.fs.obtainMessage();
        obtainMessage.what = 100;
        obtainMessage.obj = zmnVar;
        this.fs.sendMessageDelayed(obtainMessage, this.zn.zmn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(zmn zmnVar) {
        if (zmnVar == null) {
            return;
        }
        boolean fb = com.bytedance.sdk.openadsdk.core.cyb.zmn().fb();
        boolean zmn2 = com.bytedance.sdk.openadsdk.core.cyb.zmn().zmn(true);
        if (fb || !zmn2) {
            if (zmnVar.btk == null) {
                zmnVar.btk = new HashMap();
            }
            zmnVar.btk.put("is_background", Boolean.valueOf(fb));
            zmnVar.btk.put("has_focus", Boolean.valueOf(zmn2));
            zn(zmnVar.zmn(true));
            return;
        }
        zmn(zmnVar);
    }

    private void zn(zmn zmnVar) {
        if (zmnVar == null) {
            return;
        }
        this.fs.post(zmnVar);
    }

    private static class zmn implements Serializable, Runnable {
        public Map<String, Object> btk;
        public String fb;
        public nqi zn;
        public final AtomicInteger zmn = new AtomicInteger(0);
        public final AtomicBoolean fs = new AtomicBoolean(false);
        private final long hhw = SystemClock.elapsedRealtime();

        public static zmn zmn(nqi nqiVar, String str, Map<String, Object> map) {
            return new zmn(nqiVar, str, map);
        }

        public zmn(nqi nqiVar, String str, Map<String, Object> map) {
            this.zn = nqiVar;
            this.fb = str;
            this.btk = map;
        }

        public zmn zmn(boolean z) {
            this.fs.set(z);
            return this;
        }

        public int zmn() {
            return this.zmn.get();
        }

        public void fs() {
            this.zmn.incrementAndGet();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.zn == null || TextUtils.isEmpty(this.fb)) {
                return;
            }
            String str = this.fs.get() ? "dpl_success" : "dpl_failed";
            if (this.btk == null) {
                this.btk = new HashMap();
            }
            nqi nqiVar = this.zn;
            if (nqiVar != null && nqiVar.qj() == 0) {
                Map<String, Object> map = this.btk;
                nqi nqiVar2 = this.zn;
                map.put("auto_click", Boolean.valueOf((nqiVar2 == null || nqiVar2.kw()) ? false : true));
            }
            this.btk.put("lifeCycleInit", Boolean.valueOf(com.bytedance.sdk.openadsdk.core.cyb.zmn().zn()));
            this.btk.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(SystemClock.elapsedRealtime() - this.hhw));
            zn.zmn(this.zn, this.fb, str, this.btk);
        }
    }

    private static class fs {
        public int zmn = 300;
        public int fs = 6000;

        private fs() {
        }

        public static fs zmn() {
            return new fs();
        }
    }
}
