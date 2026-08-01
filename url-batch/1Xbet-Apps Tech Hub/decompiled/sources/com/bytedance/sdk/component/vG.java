package com.bytedance.sdk.component;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: TTQueuedWork.java */
/* loaded from: classes.dex */
public class vG {
    private static volatile Handler icD;
    private static final Object pvs = new Object();
    private static final LinkedList<Runnable> vG = new LinkedList<>();
    private static Object Jd = new Object();

    public static void pvs(Runnable runnable, boolean z) {
        try {
            Handler icD2 = icD();
            synchronized (pvs) {
                vG.add(runnable);
                if (z) {
                    icD2.sendEmptyMessageDelayed(1, 100L);
                } else {
                    icD2.sendEmptyMessage(1);
                }
            }
        } catch (OutOfMemoryError unused) {
        }
    }

    private static Handler icD() {
        Handler handler;
        if (icD == null) {
            synchronized (pvs) {
                if (icD == null) {
                    HandlerThread handlerThread = new HandlerThread("queued-work-looper", -2);
                    handlerThread.start();
                    icD = new pvs(handlerThread.getLooper());
                }
                handler = icD;
            }
            return handler;
        }
        return icD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void vG() {
        LinkedList linkedList;
        synchronized (Jd) {
            synchronized (pvs) {
                LinkedList<Runnable> linkedList2 = vG;
                linkedList = (LinkedList) linkedList2.clone();
                linkedList2.clear();
                icD().removeMessages(1);
            }
            if (linkedList.size() > 0) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        }
    }

    /* compiled from: TTQueuedWork.java */
    private static class pvs extends Handler {
        pvs(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                try {
                    vG.vG();
                } catch (OutOfMemoryError unused) {
                }
            }
        }
    }
}
