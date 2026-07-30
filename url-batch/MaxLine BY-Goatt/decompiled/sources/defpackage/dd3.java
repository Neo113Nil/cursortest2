package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dd3 extends Thread {
    public final WeakReference m;
    public final long n;
    public final CountDownLatch o = new CountDownLatch(1);
    public boolean p = false;

    public dd3(l5 l5Var, long j) {
        this.m = new WeakReference(l5Var);
        this.n = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        l5 l5Var;
        WeakReference weakReference = this.m;
        try {
            if (this.o.await(this.n, TimeUnit.MILLISECONDS) || (l5Var = (l5) weakReference.get()) == null) {
                return;
            }
            l5Var.b();
            this.p = true;
        } catch (InterruptedException unused) {
            l5 l5Var2 = (l5) weakReference.get();
            if (l5Var2 != null) {
                l5Var2.b();
                this.p = true;
            }
        }
    }
}
