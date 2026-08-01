package H;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f288a;

    /* renamed from: b, reason: collision with root package name */
    public b f289b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f290c;

    public final void a(b bVar) {
        synchronized (this) {
            while (this.f290c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f289b == bVar) {
                return;
            }
            this.f289b = bVar;
            if (this.f288a) {
                bVar.m();
            }
        }
    }
}
