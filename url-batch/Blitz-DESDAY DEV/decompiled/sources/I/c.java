package I;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f328a;

    /* renamed from: b, reason: collision with root package name */
    public b f329b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f330c;

    public final void a(b bVar) {
        synchronized (this) {
            while (this.f330c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f329b == bVar) {
                return;
            }
            this.f329b = bVar;
            if (this.f328a) {
                bVar.l();
            }
        }
    }
}
