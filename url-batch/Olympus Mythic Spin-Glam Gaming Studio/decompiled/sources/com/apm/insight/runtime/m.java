package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: NpthHandlerThread.java */
/* loaded from: classes5.dex */
public class m {
    private static volatile p a;
    private static volatile Handler b;

    private static HandlerThread b() {
        if (a == null) {
            synchronized (m.class) {
                try {
                    if (a == null) {
                        p pVar = new p("default_npth_thread");
                        a = pVar;
                        pVar.b();
                    }
                } finally {
                }
            }
        }
        return a.c();
    }

    public static p a() {
        if (a == null) {
            b();
        }
        return a;
    }
}
