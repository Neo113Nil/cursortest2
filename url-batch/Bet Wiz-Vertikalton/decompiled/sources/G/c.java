package G;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f240a;

    /* renamed from: b, reason: collision with root package name */
    public b f241b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f242c;

    public final void a(b bVar) {
        synchronized (this) {
            while (this.f242c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f241b == bVar) {
                return;
            }
            this.f241b = bVar;
            if (this.f240a) {
                bVar.m();
            }
        }
    }
}
