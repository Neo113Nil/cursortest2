package com.baidu.location.b;

import android.os.HandlerThread;

/* loaded from: classes2.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    private static HandlerThread f4927a;

    public static synchronized HandlerThread a() {
        HandlerThread handlerThread;
        synchronized (y.class) {
            try {
                if (f4927a == null) {
                    try {
                        HandlerThread handlerThread2 = new HandlerThread("ServiceStartArguments", 10);
                        f4927a = handlerThread2;
                        handlerThread2.start();
                    } catch (Throwable th) {
                        th.printStackTrace();
                        f4927a = null;
                    }
                }
                handlerThread = f4927a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handlerThread;
    }
}
