package B;

/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f70b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M.j f71c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f72d;

    public r(t tVar, g gVar, M.j jVar) {
        this.f72d = tVar;
        this.f70b = gVar;
        this.f71c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (t.f80g) {
            t.c(this.f72d, this.f70b);
        }
        this.f71c.c(null);
    }
}
