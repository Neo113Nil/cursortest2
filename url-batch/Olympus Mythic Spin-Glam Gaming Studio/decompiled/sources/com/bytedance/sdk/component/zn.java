package com.bytedance.sdk.component;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import com.bytedance.sdk.component.fs;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes12.dex */
public class zn {

    @GuardedBy
    private static volatile Handler fs;
    private static final Object zmn = new Object();

    @GuardedBy
    private static final LinkedList<Runnable> zn = new LinkedList<>();
    private static Object fb = new Object();

    public static void zmn(Runnable runnable, boolean z) {
        try {
            Handler fs2 = fs();
            synchronized (zmn) {
                try {
                    zn.add(runnable);
                    if (z) {
                        fs2.sendEmptyMessageDelayed(1, 100L);
                    } else {
                        fs2.sendEmptyMessage(1);
                    }
                } finally {
                }
            }
        } catch (OutOfMemoryError unused) {
        }
    }

    private static Handler fs() {
        Handler handler;
        if (fs == null) {
            synchronized (zmn) {
                try {
                    if (fs == null) {
                        fs.zmn zmnVar = fs.zmn;
                        HandlerThread zmn2 = zmnVar != null ? zmnVar.zmn("queued-work-looper", -2) : null;
                        if (zmn2 == null) {
                            zmn2 = new HandlerThread("queued-work-looper", -2);
                            zmn2.start();
                        }
                        fs = new zmn(zmn2.getLooper());
                    }
                    handler = fs;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return handler;
        }
        return fs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zn() {
        LinkedList linkedList;
        synchronized (fb) {
            try {
                synchronized (zmn) {
                    LinkedList<Runnable> linkedList2 = zn;
                    linkedList = (LinkedList) linkedList2.clone();
                    linkedList2.clear();
                    fs().removeMessages(1);
                }
                if (linkedList.size() > 0) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static class zmn extends Handler {
        zmn(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                try {
                    zn.zn();
                } catch (OutOfMemoryError unused) {
                }
            }
        }
    }
}
