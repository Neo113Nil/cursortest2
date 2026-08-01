package G;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f187a;

    /* renamed from: b, reason: collision with root package name */
    public b f188b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f189c;

    public final void a(b bVar) {
        synchronized (this) {
            while (this.f189c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f188b == bVar) {
                return;
            }
            this.f188b = bVar;
            if (this.f187a) {
                bVar.l();
            }
        }
    }
}
