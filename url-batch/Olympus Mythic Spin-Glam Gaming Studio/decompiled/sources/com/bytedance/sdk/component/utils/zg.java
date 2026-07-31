package com.bytedance.sdk.component.utils;

import android.os.HandlerThread;

/* loaded from: classes3.dex */
public class zg {
    private static HandlerThread fs;
    public static volatile boolean zmn;

    public static void zmn(HandlerThread handlerThread) {
        fs = handlerThread;
    }

    public static HandlerThread zmn(String str) {
        return zmn(str, 0);
    }

    public static HandlerThread zmn(String str, int i) {
        if (zmn) {
            return fs;
        }
        try {
            HandlerThread handlerThread = new HandlerThread(str, i) { // from class: com.bytedance.sdk.component.utils.zg.1
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
            handlerThread.start();
            return handlerThread;
        } catch (Throwable th) {
            iqz.zmn("HandlerThreadUtils", "new handlerThread error", th);
            return fs;
        }
    }
}
