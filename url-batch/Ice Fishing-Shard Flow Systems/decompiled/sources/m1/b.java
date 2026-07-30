package m1;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class b extends Thread {

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f6526d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6527e;

    /* renamed from: i, reason: collision with root package name */
    public final CountDownLatch f6528i = new CountDownLatch(1);

    /* renamed from: l, reason: collision with root package name */
    public boolean f6529l = false;

    public b(C0686a c0686a, long j) {
        this.f6526d = new WeakReference(c0686a);
        this.f6527e = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C0686a c0686a;
        WeakReference weakReference = this.f6526d;
        try {
            if (this.f6528i.await(this.f6527e, TimeUnit.MILLISECONDS) || (c0686a = (C0686a) weakReference.get()) == null) {
                return;
            }
            c0686a.b();
            this.f6529l = true;
        } catch (InterruptedException unused) {
            C0686a c0686a2 = (C0686a) weakReference.get();
            if (c0686a2 != null) {
                c0686a2.b();
                this.f6529l = true;
            }
        }
    }
}
