package p1;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public Runnable f1051b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f1052c;

    public i(j jVar, Runnable runnable) {
        this.f1052c = jVar;
        this.f1051b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar = this.f1052c;
        k1.p pVar = jVar.f1054d;
        int i2 = 0;
        while (true) {
            try {
                this.f1051b.run();
            } catch (Throwable th) {
                k1.t.c(v0.i.f1196b, th);
            }
            Runnable d2 = jVar.d();
            if (d2 == null) {
                return;
            }
            this.f1051b = d2;
            i2++;
            if (i2 >= 16 && pVar.c()) {
                pVar.b(jVar, this);
                return;
            }
        }
    }
}
