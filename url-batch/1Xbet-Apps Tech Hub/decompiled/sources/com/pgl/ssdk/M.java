package com.pgl.ssdk;

import android.os.HandlerThread;
import java.lang.ref.WeakReference;

/* compiled from: HandlerPool.java */
/* loaded from: classes3.dex */
public class M {
    private final P<N> a;
    private Q b;

    /* compiled from: HandlerPool.java */
    private static class b {
        private static final M a = new M();
    }

    public static M a() {
        return b.a;
    }

    public Q b() {
        if (this.b == null) {
            synchronized (M.class) {
                if (this.b == null) {
                    this.b = a("ssdk_net_handler");
                }
            }
        }
        return this.b;
    }

    public Q c() {
        if (this.b == null) {
            synchronized (M.class) {
                if (this.b == null) {
                    this.b = a("ssdk_handler");
                }
            }
        }
        return this.b;
    }

    private M() {
        this.a = P.a(2);
    }

    public Q a(String str) {
        N a2 = this.a.a();
        if (a2 != null) {
            a2.a = new WeakReference<>(null);
            a2.a(str);
            return a2;
        }
        if (!H.b().a()) {
            try {
                HandlerThread handlerThread = new HandlerThread(str);
                handlerThread.start();
                return new N(handlerThread, null);
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
