package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iwf {
    private static Thread a;

    public static void a() {
        if (a == null) {
            a = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != a) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
    }
}
