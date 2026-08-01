package G;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f284a;

    /* renamed from: b, reason: collision with root package name */
    public b f285b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f286c;

    public final void a(b bVar) {
        synchronized (this) {
            while (this.f286c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f285b == bVar) {
                return;
            }
            this.f285b = bVar;
            if (this.f284a) {
                bVar.j();
            }
        }
    }
}
