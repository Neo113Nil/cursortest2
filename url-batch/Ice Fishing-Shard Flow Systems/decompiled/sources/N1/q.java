package N1;

/* loaded from: classes.dex */
public abstract class q implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final K1.h f1825d;

    public q() {
        this.f1825d = null;
    }

    public void a(Exception exc) {
        K1.h hVar = this.f1825d;
        if (hVar != null) {
            hVar.c(exc);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e7) {
            a(e7);
        }
    }

    public q(K1.h hVar) {
        this.f1825d = hVar;
    }
}
