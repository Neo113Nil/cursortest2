package M4;

import java.lang.ref.Reference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class i extends N4.g {

    /* renamed from: l, reason: collision with root package name */
    public final ConcurrentHashMap f1753l;

    public i(ConcurrentHashMap concurrentHashMap) {
        super(false, concurrentHashMap);
        this.f1753l = concurrentHashMap;
        Thread thread = new Thread(this);
        thread.setName("weak-ref-cleaner-strictcontextstorage");
        thread.setPriority(1);
        thread.setDaemon(true);
        thread.setContextClassLoader(null);
        thread.start();
    }

    @Override // N4.d, java.lang.Runnable
    public final void run() {
        while (!Thread.interrupted()) {
            try {
                Reference remove = remove();
                g gVar = remove != null ? (g) this.f1753l.remove(remove) : null;
                if (gVar != null && !gVar.f1751l) {
                    k.f1757e.log(Level.SEVERE, "Scope garbage collected before being closed.", (Throwable) k.d(gVar));
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }
}
