package com.bytedance.sdk.openadsdk.bjh.fs;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.component.utils.iqz;

/* loaded from: classes3.dex */
public class nps {
    private static HandlerThread fs;
    private static zmn zmn;

    public static void zmn() {
    }

    public static void zmn(fs fsVar) {
        if (fsVar == null) {
            return;
        }
        fs();
        zmn zmnVar = zmn;
        if (zmnVar != null) {
            zmnVar.zmn(fsVar);
        }
    }

    public static void fs(fs fsVar) {
        if (fsVar == null || zmn == null) {
            return;
        }
        try {
            int intValue = fsVar.rc().intValue();
            if (zmn.hasMessages(intValue)) {
                zmn.removeMessages(intValue);
            }
        } catch (Exception unused) {
        }
    }

    public static void fs() {
        if (zmn != null) {
            return;
        }
        try {
            HandlerThread handlerThread = fs;
            if (handlerThread != null && handlerThread.isAlive()) {
                return;
            }
            synchronized (nps.class) {
                try {
                    HandlerThread handlerThread2 = fs;
                    if (handlerThread2 != null) {
                        if (!handlerThread2.isAlive()) {
                        }
                    }
                    fs = com.bytedance.sdk.component.utils.zg.zmn("pag_MRC");
                    zmn = new zmn(fs.getLooper());
                } finally {
                }
            }
        } catch (Throwable th) {
            iqz.zn("MRC", th.getMessage());
        }
    }

    private static class zmn extends Handler {
        public zmn(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            fs fsVar = (fs) message.obj;
            if (fsVar == null) {
                return;
            }
            int fs = fsVar.fs();
            if (fs == 1) {
                fsVar.nps();
            } else if (fs == 2) {
                fsVar.zg();
            } else {
                btk.fs(fsVar.rc());
                return;
            }
            if (fsVar.bvs()) {
                btk.fs(fsVar.rc());
            } else if (fsVar.klz()) {
                zmn(fsVar);
            }
        }

        public void zmn(fs fsVar) {
            if (fsVar == null) {
                return;
            }
            int intValue = fsVar.rc().intValue();
            if (hasMessages(intValue)) {
                return;
            }
            Message obtain = Message.obtain();
            obtain.what = intValue;
            obtain.obj = fsVar;
            sendMessageDelayed(obtain, fsVar.hhw());
        }
    }
}
