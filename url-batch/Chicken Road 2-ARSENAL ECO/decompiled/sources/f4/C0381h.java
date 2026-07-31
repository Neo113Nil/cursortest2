package f4;

import java.lang.ref.Reference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* renamed from: f4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0381h extends g4.g {

    /* renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap f4232i;

    public C0381h(ConcurrentHashMap concurrentHashMap) {
        super(false, concurrentHashMap);
        this.f4232i = concurrentHashMap;
        Thread thread = new Thread(this);
        thread.setName("weak-ref-cleaner-strictcontextstorage");
        thread.setPriority(1);
        thread.setDaemon(true);
        thread.setContextClassLoader(null);
        thread.start();
    }

    @Override // g4.AbstractRunnableC0396d, java.lang.Runnable
    public final void run() {
        while (!Thread.interrupted()) {
            try {
                Reference remove = remove();
                C0380g c0380g = remove != null ? (C0380g) this.f4232i.remove(remove) : null;
                if (c0380g != null && !c0380g.f4231i) {
                    C0383j.f4236g.log(Level.SEVERE, "Scope garbage collected before being closed.", (Throwable) C0383j.d(c0380g));
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }
}
