package a3;

import java.lang.ref.Reference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* renamed from: a3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0189h extends b3.g {

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f3868d;

    public C0189h(ConcurrentHashMap concurrentHashMap) {
        super(false, concurrentHashMap);
        this.f3868d = concurrentHashMap;
        Thread thread = new Thread(this);
        thread.setName("weak-ref-cleaner-strictcontextstorage");
        thread.setPriority(1);
        thread.setDaemon(true);
        thread.setContextClassLoader(null);
        thread.start();
    }

    @Override // b3.AbstractRunnableC0283d, java.lang.Runnable
    public final void run() {
        while (!Thread.interrupted()) {
            try {
                Reference remove = remove();
                C0188g c0188g = remove != null ? (C0188g) this.f3868d.remove(remove) : null;
                if (c0188g != null && !c0188g.f3867d) {
                    C0191j.f3872b.log(Level.SEVERE, "Scope garbage collected before being closed.", (Throwable) C0191j.c(c0188g));
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }
}
