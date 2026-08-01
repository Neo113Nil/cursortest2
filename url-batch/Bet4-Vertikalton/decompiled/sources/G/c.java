package G;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f227a;

    /* renamed from: b, reason: collision with root package name */
    public b f228b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f229c;

    public final void a(b bVar) {
        synchronized (this) {
            while (this.f229c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f228b == bVar) {
                return;
            }
            this.f228b = bVar;
            if (this.f227a) {
                bVar.l();
            }
        }
    }
}
