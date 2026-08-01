package com.bytedance.sdk.openadsdk.icD;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.google.android.material.card.MaterialCardViewHelper;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: OpenAppSuccEvent.java */
/* loaded from: classes2.dex */
public class kj {
    private static volatile kj pvs;
    private final Executor Jd = Executors.newCachedThreadPool();
    private icD NB = icD.pvs();
    private HandlerThread icD;
    private Map<String, Object> sUS;
    private final Handler vG;

    public static kj pvs() {
        if (pvs == null) {
            synchronized (kj.class) {
                if (pvs == null) {
                    pvs = new kj();
                }
            }
        }
        return pvs;
    }

    public kj pvs(Map<String, Object> map) {
        this.sUS = map;
        return pvs();
    }

    private kj() {
        if (this.icD == null) {
            HandlerThread handlerThread = new HandlerThread("OpenAppSuccEvent_HandlerThread", 10);
            this.icD = handlerThread;
            handlerThread.start();
        }
        this.vG = new Handler(this.icD.getLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.icD.kj.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what != 100) {
                    return true;
                }
                pvs pvsVar = (message.obj == null || !(message.obj instanceof pvs)) ? null : (pvs) message.obj;
                if (pvsVar == null) {
                    return true;
                }
                kj.this.icD(pvsVar);
                return true;
            }
        });
    }

    public void pvs(cR cRVar, String str) {
        Message obtainMessage = this.vG.obtainMessage();
        obtainMessage.what = 100;
        obtainMessage.obj = pvs.pvs(cRVar, str, this.sUS);
        obtainMessage.sendToTarget();
    }

    private void pvs(pvs pvsVar) {
        if (pvsVar == null) {
            return;
        }
        pvsVar.icD();
        if (pvsVar.pvs() * this.NB.pvs > this.NB.icD) {
            vG(pvsVar.pvs(false));
            return;
        }
        Message obtainMessage = this.vG.obtainMessage();
        obtainMessage.what = 100;
        obtainMessage.obj = pvsVar;
        this.vG.sendMessageDelayed(obtainMessage, this.NB.pvs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(pvs pvsVar) {
        if (pvsVar == null) {
            return;
        }
        boolean Jd = com.bytedance.sdk.openadsdk.core.IP.pvs().Jd();
        boolean pvs2 = com.bytedance.sdk.openadsdk.core.IP.pvs().pvs(true);
        if (Jd || !pvs2) {
            if (pvsVar.NB == null) {
                pvsVar.NB = new HashMap();
            }
            pvsVar.NB.put("is_background", Boolean.valueOf(Jd));
            pvsVar.NB.put("has_focus", Boolean.valueOf(pvs2));
            vG(pvsVar.pvs(true));
            return;
        }
        pvs(pvsVar);
    }

    private void vG(pvs pvsVar) {
        if (pvsVar == null) {
            return;
        }
        this.Jd.execute(pvsVar);
    }

    /* compiled from: OpenAppSuccEvent.java */
    private static class pvs implements Serializable, Runnable {
        public String Jd;
        public Map<String, Object> NB;
        public cR vG;
        public final AtomicInteger pvs = new AtomicInteger(0);
        public final AtomicBoolean icD = new AtomicBoolean(false);

        public static pvs pvs(cR cRVar, String str, Map<String, Object> map) {
            return new pvs(cRVar, str, map);
        }

        public pvs(cR cRVar, String str, Map<String, Object> map) {
            this.vG = cRVar;
            this.Jd = str;
            this.NB = map;
        }

        public pvs pvs(boolean z) {
            this.icD.set(z);
            return this;
        }

        public int pvs() {
            return this.pvs.get();
        }

        public void icD() {
            this.pvs.incrementAndGet();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.vG == null || TextUtils.isEmpty(this.Jd)) {
                return;
            }
            String str = this.icD.get() ? "dpl_success" : "dpl_failed";
            if (this.NB == null) {
                this.NB = new HashMap();
            }
            cR cRVar = this.vG;
            if (cRVar != null && cRVar.xyK() == 0) {
                Map<String, Object> map = this.NB;
                cR cRVar2 = this.vG;
                map.put("auto_click", Boolean.valueOf((cRVar2 == null || cRVar2.Jd()) ? false : true));
            }
            this.NB.put("lifeCycleInit", Boolean.valueOf(com.bytedance.sdk.openadsdk.core.IP.pvs().vG()));
            vG.pvs(this.vG, this.Jd, str, this.NB);
        }
    }

    /* compiled from: OpenAppSuccEvent.java */
    private static class icD {
        public int pvs = MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION;
        public int icD = 6000;

        private icD() {
        }

        public static icD pvs() {
            return new icD();
        }
    }
}
