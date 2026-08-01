package com.bytedance.sdk.component.so.pvs;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.dyT;

/* compiled from: HandlerPool.java */
/* loaded from: classes.dex */
public class pvs {
    private Handler icD;
    private final Jd<icD> pvs;

    private pvs() {
        this.pvs = Jd.pvs(2);
    }

    public static pvs pvs() {
        return C0056pvs.pvs;
    }

    /* compiled from: HandlerPool.java */
    /* renamed from: com.bytedance.sdk.component.so.pvs.pvs$pvs, reason: collision with other inner class name */
    private static class C0056pvs {
        private static final pvs pvs = new pvs();
    }

    public Handler icD() {
        if (this.icD == null) {
            synchronized (pvs.class) {
                if (this.icD == null) {
                    this.icD = pvs("csj_io_handler");
                }
            }
        }
        return this.icD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(final Handler handler, final Handler handler2) {
        if (handler.getLooper().getQueue().isIdle()) {
            handler.removeCallbacksAndMessages(null);
            handler.getLooper().quit();
        } else {
            handler2.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.so.pvs.pvs.1
                @Override // java.lang.Runnable
                public void run() {
                    pvs.this.pvs(handler, handler2);
                }
            }, 1000L);
        }
    }

    public dyT pvs(dyT.pvs pvsVar, final String str) {
        icD pvs = this.pvs.pvs();
        if (pvs != null) {
            pvs.pvs(pvsVar);
            pvs.post(new Runnable() { // from class: com.bytedance.sdk.component.so.pvs.pvs.2
                @Override // java.lang.Runnable
                public void run() {
                    Thread.currentThread().setName(str);
                }
            });
            return pvs;
        }
        return icD(pvsVar, str);
    }

    public dyT pvs(String str) {
        return pvs((dyT.pvs) null, str);
    }

    private icD icD(dyT.pvs pvsVar, String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        return new icD(handlerThread, pvsVar);
    }

    public boolean pvs(dyT dyt) {
        if (!(dyt instanceof icD)) {
            return false;
        }
        icD icd = (icD) dyt;
        if (this.pvs.pvs((Jd<icD>) icd)) {
            return true;
        }
        icd.icD();
        return true;
    }
}
