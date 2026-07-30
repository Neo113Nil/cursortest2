package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class zw2 extends Thread {
    public final long OPXfSBeufaJ8;
    public final WeakReference rtx2ld2ELZv4;
    public final CountDownLatch wdg6QnbFHrFF;

    public zw2(q qVar, long j) {
        super("AdIdClientAutoDisconnectThread");
        this.rtx2ld2ELZv4 = new WeakReference(qVar);
        this.OPXfSBeufaJ8 = j;
        this.wdg6QnbFHrFF = new CountDownLatch(1);
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        q qVar;
        WeakReference weakReference = this.rtx2ld2ELZv4;
        try {
            if (this.wdg6QnbFHrFF.await(this.OPXfSBeufaJ8, TimeUnit.MILLISECONDS) || (qVar = (q) weakReference.get()) == null) {
                return;
            }
            qVar.PxuCJdSBwIXG();
        } catch (InterruptedException unused) {
            q qVar2 = (q) weakReference.get();
            if (qVar2 != null) {
                qVar2.PxuCJdSBwIXG();
            }
        }
    }
}
