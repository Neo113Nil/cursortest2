package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class rt1 extends Thread {
    public final WeakReference d;
    public final long e;
    public final CountDownLatch g;

    public rt1(v2 v2Var, long j) {
        super("AdIdClientAutoDisconnectThread");
        this.d = new WeakReference(v2Var);
        this.e = j;
        this.g = new CountDownLatch(1);
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        v2 v2Var;
        WeakReference weakReference = this.d;
        try {
            if (this.g.await(this.e, TimeUnit.MILLISECONDS) || (v2Var = (v2) weakReference.get()) == null) {
                return;
            }
            v2Var.b();
        } catch (InterruptedException unused) {
            v2 v2Var2 = (v2) weakReference.get();
            if (v2Var2 != null) {
                v2Var2.b();
            }
        }
    }
}
