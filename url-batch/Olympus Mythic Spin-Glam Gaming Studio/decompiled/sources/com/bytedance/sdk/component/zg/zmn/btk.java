package com.bytedance.sdk.component.zg.zmn;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.iqz;

/* loaded from: classes3.dex */
final class btk {
    private static volatile btk zmn;
    private volatile HandlerThread fs;
    private volatile Handler zn;

    public static btk zmn() {
        if (zmn == null) {
            synchronized (btk.class) {
                try {
                    if (zmn == null) {
                        zmn = new btk();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    private btk() {
        fs();
    }

    public void zmn(Runnable runnable) {
        Handler handler;
        if (zn() && (handler = this.zn) != null) {
            handler.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void fs() {
        try {
            if (zn()) {
                return;
            }
            this.fs = new HandlerThread("csj_dispatch_msg") { // from class: com.bytedance.sdk.component.zg.zmn.btk.1
                boolean zmn = false;

                @Override // java.lang.Thread
                public synchronized void start() {
                    if (this.zmn) {
                        return;
                    }
                    this.zmn = true;
                    super.start();
                }
            };
            this.fs.start();
            this.zn = new Handler(this.fs.getLooper());
        } catch (Throwable th) {
            iqz.zmn("TTDispatchThread", "new handlerThread error", th);
        }
    }

    private boolean zn() {
        return (this.fs == null || this.zn == null || !this.fs.isAlive()) ? false : true;
    }
}
