package G;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f171a;

    /* renamed from: b, reason: collision with root package name */
    public b f172b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f173c;

    public final void a(b bVar) {
        synchronized (this) {
            while (this.f173c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f172b == bVar) {
                return;
            }
            this.f172b = bVar;
            if (this.f171a) {
                bVar.m();
            }
        }
    }
}
