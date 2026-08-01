package G;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f197a;

    /* renamed from: b, reason: collision with root package name */
    public c f198b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f199c;

    public final void a(c cVar) {
        synchronized (this) {
            while (this.f199c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f198b == cVar) {
                return;
            }
            this.f198b = cVar;
            if (this.f197a) {
                cVar.k();
            }
        }
    }
}
