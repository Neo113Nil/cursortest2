package a3;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.ads.s33;

/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    private HandlerThread f44a = null;

    /* renamed from: b, reason: collision with root package name */
    private Handler f45b = null;

    /* renamed from: c, reason: collision with root package name */
    private int f46c = 0;

    /* renamed from: d, reason: collision with root package name */
    private final Object f47d = new Object();

    public final Handler a() {
        return this.f45b;
    }

    public final Looper b() {
        Looper looper;
        synchronized (this.f47d) {
            if (this.f46c != 0) {
                r3.o.j(this.f44a, "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f44a == null) {
                r1.k("Starting the looper thread.");
                HandlerThread handlerThread = new HandlerThread("LooperProvider");
                this.f44a = handlerThread;
                handlerThread.start();
                this.f45b = new s33(this.f44a.getLooper());
                r1.k("Looper thread started.");
            } else {
                r1.k("Resuming the looper thread");
                this.f47d.notifyAll();
            }
            this.f46c++;
            looper = this.f44a.getLooper();
        }
        return looper;
    }
}
