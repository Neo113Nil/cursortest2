package v6;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends Thread {

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f9976d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9977e;

    /* renamed from: i, reason: collision with root package name */
    public final CountDownLatch f9978i;

    public b(a aVar, long j) {
        super("AdIdClientAutoDisconnectThread");
        this.f9976d = new WeakReference(aVar);
        this.f9977e = j;
        this.f9978i = new CountDownLatch(1);
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        a aVar;
        WeakReference weakReference = this.f9976d;
        try {
            if (this.f9978i.await(this.f9977e, TimeUnit.MILLISECONDS) || (aVar = (a) weakReference.get()) == null) {
                return;
            }
            aVar.b();
        } catch (InterruptedException unused) {
            a aVar2 = (a) weakReference.get();
            if (aVar2 != null) {
                aVar2.b();
            }
        }
    }
}
