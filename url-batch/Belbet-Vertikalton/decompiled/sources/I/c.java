package I;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f572a;

    /* renamed from: b, reason: collision with root package name */
    public b f573b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f574c;

    public final void a(b bVar) {
        synchronized (this) {
            while (this.f574c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f573b == bVar) {
                return;
            }
            this.f573b = bVar;
            if (this.f572a) {
                bVar.k();
            }
        }
    }
}
