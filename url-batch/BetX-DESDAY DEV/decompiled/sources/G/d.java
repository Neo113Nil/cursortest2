package G;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f196a;

    /* renamed from: b, reason: collision with root package name */
    public c f197b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f198c;

    public final void a(c cVar) {
        synchronized (this) {
            while (this.f198c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f197b == cVar) {
                return;
            }
            this.f197b = cVar;
            if (this.f196a) {
                cVar.l();
            }
        }
    }
}
