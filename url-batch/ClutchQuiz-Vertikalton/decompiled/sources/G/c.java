package G;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f204a;

    /* renamed from: b, reason: collision with root package name */
    public b f205b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f206c;

    public final void a(b bVar) {
        synchronized (this) {
            while (this.f206c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f205b == bVar) {
                return;
            }
            this.f205b = bVar;
            if (this.f204a) {
                bVar.l();
            }
        }
    }
}
