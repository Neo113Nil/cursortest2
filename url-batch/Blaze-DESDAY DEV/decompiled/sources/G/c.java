package G;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f244a;

    /* renamed from: b, reason: collision with root package name */
    public b f245b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f246c;

    public final void a(b bVar) {
        synchronized (this) {
            while (this.f246c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f245b == bVar) {
                return;
            }
            this.f245b = bVar;
            if (this.f244a) {
                bVar.l();
            }
        }
    }
}
