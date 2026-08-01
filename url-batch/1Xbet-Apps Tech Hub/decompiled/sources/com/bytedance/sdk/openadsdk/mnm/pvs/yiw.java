package com.bytedance.sdk.openadsdk.mnm.pvs;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.component.utils.Ju;

/* compiled from: PAGTimerManager.java */
/* loaded from: classes2.dex */
public class yiw {
    private static HandlerThread icD;
    private static pvs pvs;

    public static void pvs() {
    }

    public static void pvs(icD icd) {
        if (icd == null) {
            return;
        }
        icD();
        pvs pvsVar = pvs;
        if (pvsVar != null) {
            pvsVar.pvs(icd);
        }
    }

    public static void icD(icD icd) {
        if (icd == null || pvs == null) {
            return;
        }
        try {
            int intValue = icd.qh().intValue();
            if (pvs.hasMessages(intValue)) {
                pvs.removeMessages(intValue);
            }
        } catch (Exception unused) {
        }
    }

    public static void icD() {
        if (pvs != null) {
            return;
        }
        try {
            HandlerThread handlerThread = icD;
            if (handlerThread != null && handlerThread.isAlive()) {
                return;
            }
            synchronized (yiw.class) {
                HandlerThread handlerThread2 = icD;
                if (handlerThread2 == null || !handlerThread2.isAlive()) {
                    HandlerThread handlerThread3 = new HandlerThread("csj_MRC");
                    icD = handlerThread3;
                    handlerThread3.start();
                    pvs = new pvs(icD.getLooper());
                }
            }
        } catch (Throwable th) {
            Ju.pvs("MRC", th.getMessage());
        }
    }

    /* compiled from: PAGTimerManager.java */
    private static class pvs extends Handler {
        public pvs(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            icD icd = (icD) message.obj;
            if (icd == null) {
                return;
            }
            int icD = icd.icD();
            if (icD == 1) {
                icd.yiw();
            } else if (icD == 2) {
                icd.so();
            } else {
                NB.icD(icd.qh());
                return;
            }
            if (icd.Mxy()) {
                NB.icD(icd.qh());
            } else if (icd.kj()) {
                pvs(icd);
            }
        }

        public void pvs(icD icd) {
            if (icd == null) {
                return;
            }
            int intValue = icd.qh().intValue();
            if (hasMessages(intValue)) {
                return;
            }
            Message obtain = Message.obtain();
            obtain.what = intValue;
            obtain.obj = icd;
            sendMessageDelayed(obtain, icd.sUS());
        }
    }
}
