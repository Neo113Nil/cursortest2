package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ahc {
    private static Handler a;
    public volatile int f = 1;
    public final AtomicBoolean d = new AtomicBoolean();
    public final AtomicBoolean e = new AtomicBoolean();
    public final FutureTask c = new ahb(this, new avc(this, 1));

    public abstract Object a();

    public void b(Object obj) {
        throw null;
    }

    public void c() {
        throw null;
    }

    public final void d(Object obj) {
        Handler handler;
        synchronized (ahc.class) {
            handler = a;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                a = handler;
            }
        }
        handler.post(new at(this, obj, 19, (byte[]) null));
    }

    final void e(Object obj) {
        if (this.e.get()) {
            return;
        }
        d(obj);
    }

    public final boolean f() {
        return this.d.get();
    }
}
