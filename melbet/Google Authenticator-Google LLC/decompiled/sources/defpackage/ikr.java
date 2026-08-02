package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ikr {
    private static final Object b = new Object();
    private static ikr c;
    public final Handler a;

    private ikr(Looper looper) {
        this.a = new gbg(looper, (byte[]) null);
    }

    public static ikr b() {
        ikr ikrVar;
        synchronized (b) {
            ikrVar = c;
            if (ikrVar == null) {
                HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                handlerThread.start();
                ikr ikrVar2 = new ikr(handlerThread.getLooper());
                c = ikrVar2;
                ikrVar = ikrVar2;
            }
        }
        return ikrVar;
    }

    public final ddi a(Callable callable) {
        bst bstVar = new bst();
        ikq.a.execute(new iep(callable, bstVar, 18, null));
        return (ddi) bstVar.a;
    }
}
