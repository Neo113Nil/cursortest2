package z7;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class p implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final w7.g f10945d;

    public p() {
        this.f10945d = null;
    }

    public void a(Exception exc) {
        w7.g gVar = this.f10945d;
        if (gVar != null) {
            gVar.b(exc);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e2) {
            a(e2);
        }
    }

    public p(w7.g gVar) {
        this.f10945d = gVar;
    }
}
