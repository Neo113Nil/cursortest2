package G;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f180a;

    /* renamed from: b, reason: collision with root package name */
    public b f181b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f182c;

    public final void a(b bVar) {
        synchronized (this) {
            while (this.f182c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f181b == bVar) {
                return;
            }
            this.f181b = bVar;
            if (this.f180a) {
                bVar.k();
            }
        }
    }
}
